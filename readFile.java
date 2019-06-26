import java.io.File;
import java.util.Scanner;

public class readFile{
    private Scanner x;

    public void openFile(){
        try{
            x = new Scanner(new File("abc.txt"));

        }catch(Exception ex){
            System.out.println("could not find file");
        }
    }
    public void readFiles(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s \n",a,b,c);
        }
    }

    public static void main(String[] args){
        // file g = new file();
        // g.openFile();
        // g.addRecords();
        // g.closeFile();

        readFile r = new readFile();
        r.openFile();
        r.readFiles();
    }

}