package tutammodul7;
import java.lang.*;
public class RunForYourLife implements Runnable{
    public static int checkpoint = 20;
    private int delay;
    private String threading;

    public RunForYourLife (String threading, int delay)
    {
        this.threading=threading;
        this.delay=delay;
        System.out.println(threading + ", ready.");
    }

    public void run()
    {
        System.out.println(threading + ", go!");
        for(int i=0; i<checkpoint;i++)
        {
            System.out.println(threading + " has passed checkpoint (" + (i+1) + ")");
            try
            {
                Thread.sleep(delay);
            }
            catch (InterruptedException e)
            {
                System.out.println(threading + " was interrupted.");
            }
        }
        System.out.println(threading + " has finished!");
    }

    public void start(){
        System.out.println(threading + ", set...");
        (new Thread(this, threading)).start();
    }
}
