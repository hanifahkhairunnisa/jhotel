package jhotel;
/**
 * Write a description of class Room here.
 *
 * @author (Hanifah Khairunnisa)
 * @version (10 Maret 2018)
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
    private StatusKamar status_kamar;
    protected double dailyTariff;
    /**
     *
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.status_kamar = status_kamar.VACANT;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *
     * @return    the sum of x and y
     */
    public Hotel getHotel()
    {
        return hotel;
    }
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    
    public double getDailyTariff()
    {
        return dailyTariff;
    }
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    
    public abstract TipeKamar getTipeKamar();
    
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
   
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }
    
    public String toString()
    {
            if(DatabasePesanan.getPesanan(this) == null)
        {
            return "\nNama Hotel \t\t:" + getHotel().getNama()
                    + "\nTipe Kamar \t\t:" + getTipeKamar()
                  //  + "\nHarga \t\t:" + getDailyTariff()
                    + "\nStatus Kamar \t\t:" + getStatusKamar().toString();
        }
        else
        {
        
            return "Nama Hotel:" + getHotel().getNama()+"\nTipe Kamar" +
            getTipeKamar() +"\nStatus Kamar" +
            getStatusKamar().toString();
            
        }
        
    }
}
    
    

