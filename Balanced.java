public class Balanced {
    public static void main(String[] args) {
        int[] data1 = { 40, 55, 10, 35, 20, 5, 10 }; // balanced data1
        int[] data2 = { 40, 50, 10, 30, 20, 5 }; // not balanced data2
        int a, b;
        a = isBalanced(data1);
        System.out.println(a);

        b = isBalanced(data2);
        System.out.println(b);
    }

    public static int isBalanced(int num[]) {
        int rem, odrem;

        for (int i = 0; i < num.length; i++) {
            rem = num[i] % 2;
            odrem = i % 2;
            if (rem == 0 && odrem == 0) {
                continue;
                // System.out.println("even" + i);
            } else if (rem == 1 && odrem == 1) {
                continue;
                // System.out.println("odd" + i);
            } else {
                System.out.println("not balanced");
                return 0;
            }
        }
        System.out.println("balanced");
        return 1;
    }
}