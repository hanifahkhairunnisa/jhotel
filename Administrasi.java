
/**
 * Write a description of class Administrasi here.
 *
 * @author (Hanifah Khairunnisa)
 * @version (8 Maret 2018)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Administrasi
     */
   public Administrasi()
   {
       
       //code here
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusDiproses(true);
        pesan.setStatusSelesai(false);
        pesan.setRoom(kamar);
            
    }
    public static void pesananDibatalkan(Room kamar){
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);
        //roomLepasPesanan(kamar);
    }
    public static void pesananSelesai(Room kamar){
        Pesanan pesan = kamar.getPesanan();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
    public static void pesananDibatalkan(Pesanan pesan)
    { 
        Room kamar = pesan.getRoom();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
        
    }
    public static void pesananSelesai(Pesanan pesan)
    {
        Room kamar = pesan.getRoom();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
    
    
    
    
}
