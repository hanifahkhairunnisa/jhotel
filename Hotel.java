
/**
 * Class Hotel 
 *
 * @author (Hanifah Khairunnisa)
 * @version (1 Maret 2018)
 */
public class Hotel
{
    // instance variables - replace the example below with your own
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
        
    }

    /**
     * Method of class Hotel
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /** method untuk mengakses Bintang */
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
        return "Hotel\n Nama hotel\t:" +nama+ "\nLokasi\t:" +lokasi.getDeskripsi()+ "\nBintang\t:" +bintang;
    }
    /*pub
    /** method untuk mencetak nama */
    /*public void printData()
    {
        System.out.println("Hotel");
        System.out.println("Nama Hotel: " +nama);
        System.out.println("Lokasi: " +lokasi.getDeskripsi());
        System.out.println("Bintang: " +bintang);
    }*/

}
