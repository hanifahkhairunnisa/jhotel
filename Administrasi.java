
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
        DatabaseRoom.getRoom(kamar.getHotel(),kamar.getNomorKamar()).setStatusKamar(StatusKamar.BOOKED);
            
    }
    public static void pesananDibatalkan(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        if(pesan != null){
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        //roomLepasPesanan(kamar);
    }
    DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
    }
    public static void pesananSelesai(Room kamar){
    Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        if(pesan != null) {
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
    }
    }
    public static void pesananDibatalkan(Pesanan pesan)
    { 
      DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.VACANT);  
      pesan.setStatusSelesai(false);  
      pesan.setStatusDiproses(false);
      pesan.setStatusAktif(false);
      pesan.setRoom(null);
    }
    public static void pesananSelesai(Pesanan pesan)
    {
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null); 
    }
    
    
    
    
}
