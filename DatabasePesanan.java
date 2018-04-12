
/**
 * Class DatabasePesanan here
 *
 * @author (Hanifah Khairunnisa)
 * @version (1 Maret 2018)
 */
import java.util.ArrayList;
public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE; //lokasi memori telah dipesan
    private static int LAST_PESANAN_ID = 0;
    /**
     * Constructor for objects of class DatabasePesanan
     */
  public DatabasePesanan()
   {
       
       // initialise instance variables
   }
   
    
    /**
     * Method of class DatabasePesanan
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /** method untuk menambahkan pesanan */
    
    public static ArrayList<Pesanan> getPesanan()
    {
        return null;
    }
    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }
    public static boolean addPesanan(Pesanan baru)
    {
        // put your code here
        if(baru.getStatusAktif()==true){
            return false;
    }
    else{
        PESANAN_DATABASE.add(baru);
        return true;
    }
    }
    
   public static Pesanan getPesanan (int id){
       for(Pesanan pesan : PESANAN_DATABASE){
            if(pesan.getID()==id){
                return pesan;
    }
    
    }
    return null;
}
    public static Pesanan getPesanan(Room kamar){
               for(Pesanan pesan : PESANAN_DATABASE){
            if(pesan.getRoom()==kamar){
                return pesan;
    }
    
    }
    return null;
    }
    public static Pesanan getPesananAktif(Customer pelanggan){
           for(Pesanan pesan : PESANAN_DATABASE){
            if(pesan.getPelanggan()==pelanggan){
                if(pesan.getStatusAktif()==true){
                    
                return pesan;
    }
    }
    
    }
    return null;
    }
    public static Pesanan removePesanan(Pesanan pesan)
    {     
        for(Pesanan pesandb : PESANAN_DATABASE){
            if(pesandb == pesan){
                if(pesan.getRoom()!=null){
                pesan.setStatusAktif(false);    
                PESANAN_DATABASE.remove(pesandb);
                return true;}}
                else if (pesan.getRoom()==null){
                    if(pesan.getStatusAktif()==true){
                        pesan.setStatusAktif(false);
                        PESANAN_DATABASE.remove(pesandb);
                        return true;
                    }}
    }
    return null;
    }
    
    }
    
   
    
    
        
    



