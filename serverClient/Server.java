import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        // wait and accept connection
        Socket soc = ss.accept();
        // get communication
        Scanner ins = new Scanner(soc.getInputStream());
        PrintWriter outs = new PrintWriter(soc.getOutputStream(), true);

        // perform IO
        double s = ins.nextDouble();
        double A = 3.14 * s * s;

        System.out.println("Radius is calculated for: " + s);

        outs.println(" Radius is : " + s + " and area of circle is : " + A);

        ins.close();
        outs.close();
        soc.close();
    }
}