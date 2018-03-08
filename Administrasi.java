
/**
 * Write a description of class Administrasi here.
 *
 * @author (Hanifah Khairunnisa)
 * @version (8 Maret 2018)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    private int x;

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
    public void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar); 
    }
    public void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    } 
    public void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
    public void pesananDibatalkan(Room kamar)
    { 
        Pesanan pesan = kamar.getPesanan(); 
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false); 
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
    }
    public void pesananSelesai(Room kamar)
    {
        Pesanan pesan = kamar.getPesanan();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
    }
    public void pesananDIbatalkan(Pesanan pesan)
    {
        Room kamar = pesan.getRoom();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        roomLepasPesanan(kamar);
    }
    public void pesananSelesai(Pesanan pesan)
    {
        Room kamar = pesan.getRoom();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        roomLepasPesanan(kamar);
    }
    
    
    
}
