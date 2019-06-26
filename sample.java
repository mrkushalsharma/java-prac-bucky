import java.util.Scanner;

public class sample{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int c =1;
        do{
            try{
                System.out.println("enter first num: ");
                int n1 = input.nextInt();
                System.out.println("enter second num: ");
                int n2 = input.nextInt();
                int sum = n1/n2;
                System.out.println(sum);
                c=2;
            }catch(Exception ex){
                System.out.println("erroe");
            }
        }while(c==1);
        
    }
}