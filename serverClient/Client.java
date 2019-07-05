import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket soc = new Socket("localhost", 1234);

        Scanner ins = new Scanner(soc.getInputStream());
        PrintWriter outs = new PrintWriter(soc.getOutputStream(), true);

        Scanner input = new Scanner(System.in);

        System.out.println("enter radius: ");
        double r = input.nextDouble();

        outs.println(r);

        String s = ins.nextLine();

        System.out.println("from server: " + s);

        ins.close();
        outs.close();
        soc.close();

    }
}