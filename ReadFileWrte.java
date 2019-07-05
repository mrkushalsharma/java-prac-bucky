import java.io.*;

public class ReadFileWrte {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("abc.txt"));
            out = new BufferedWriter(new FileWriter("def.txt"));
            String str = null;

            while ((str = in.readLine()) != null) {
                System.out.println(str);
                out.write(str);
                out.newLine();
                // out.write(str);
                System.out.println("File written Successfully");
            }

            // System.out.println(str);
        } catch (IOException e) {
            System.out.println("error " + e);
        } finally {
            try {
                in.close();
                out.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the " + ex);
            }
        }
    }
}