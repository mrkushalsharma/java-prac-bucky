import java.io.File;
import java.util.Formatter;

class file{
    // public static void main(String[] args){
        //check file exist or not
        // File f = new File("text.txt");
        // if(f.exists()){
        //     System.out.println(f.getName()+"exist");
        // }
        // else{
        //     System.out.println("not exist");
        // }

        //create a new file
        // final Formatter x;
        // try{
        //     x = new Formatter("kus.txt");
        //     System.out.println("file created");
        // }catch(Exception ex){
        //     System.out.println("error ");
        // }

        //writing to files
        private Formatter ww;

        public void openFile(){
            try{
                ww = new Formatter("abc.txt");
            }catch(Exception ex){
                System.out.println("error");
            }
        }
        public void addRecords(){
            ww.format("%s%s%s", "20 ","kus ", "sha");

        }

        public void closeFile(){
            ww.close();
        }

    }
// }