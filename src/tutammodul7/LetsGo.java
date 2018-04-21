package tutammodul7;
import java.util.*;
import java.lang.*;
public class LetsGo {
    public static int random()
    {
        int min = 100;
        int max = 500;
        return new Random().nextInt(max-min)+min;
    }

    public static void main(String[] args)
    {
        int x, y, z;

        do
        {
            x = random();
            y = random();
            z = random();
        }
        while (!(x>y && y>z));

        RunForYourLife Lionel = new RunForYourLife("Lionel", x);
        Lionel.start();
        RunForYourLife Andres = new RunForYourLife("Andres", y);
        Andres.start();
        RunForYourLife Messi = new RunForYourLife("Messi", z);
        Messi.start();
    }
}
