
/**
 * Class Hotel 
 *
 * @author (Hanifah Khairunnisa)
 * @version (1 Maret 2018)
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        //assign instance variables
        this.nama = nama; //menggunakan this karena nama variabel sama dg nama parameter
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = DatabaseHotel.getLastHotelID()+1;
    }

    /**
     * Method of class Hotel
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /** method untuk mengakses Bintang */
    public int getID()
    {
        return id;
    }
    public int getBintang()
    {
        return bintang;
    }
    /** method untuk mengakses Nama */
    public String getNama()
    {
        return nama;
    }
    /** method untuk mengakses Lokasi */
    public Lokasi getLokasi()
    { 
        return lokasi;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    /** method untuk memperbaharui Nama */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    /** method untuk memperbaharui Lokasi */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    /** method untuk memperbaharui Bintang */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    public String toString()
    {
        return "Hotel\n Nama hotel\t:" +getNama()+ "\nLokasi\t:" +getLokasi().getDeskripsi()+ "\nBintang\t:" +getBintang();
    }
    
}
