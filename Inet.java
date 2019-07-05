import java.io.*;
import java.net.*;

public class Inet {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.javatpoint.com");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
            System.out.println("hash code: " + ip.hashCode());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}