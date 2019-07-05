import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = 1;
        do {
            try {
                System.out.println("enter first num: ");
                float n1 = input.nextInt();
                System.out.println("enter second num: ");
                float n2 = input.nextInt();
                float sum = n1 / n2;
                System.out.println(sum);
                c = 2;
            } catch (Exception ex) {
                System.out.println("erroe" + ex);
            }
        } while (c == 1);

    }
}