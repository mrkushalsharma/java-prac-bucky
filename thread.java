import java.util.*;

//Runnable interface contains run() method
public class thread implements Runnable{
    String name;
    int time;
    Random r = new Random();
    
    public thread(String x){
        name = x;
        time = r.nextInt(1000); //between 0-1 second
    }
    
    //this runs when you start thread
    public void run(){
        try{
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time); //how long do u want to sleep for?
            System.out.printf("%s is done\n", name);
        }catch(Exception e){}
    }
    public static void main(String[] args){
        Thread t = new Thread(new thread("xs"));
        Thread t2 = new Thread(new thread("xs2"));
        Thread t3 = new Thread(new thread("xs3"));
        t.start();
        t2.start();
        t3.start();
    }
}