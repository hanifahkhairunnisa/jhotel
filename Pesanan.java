
/**
 * Class Pesanan 
 *
 * @author (Hanifah KHairunnisa)
 * @version (1 Maret 2018)
 */
public class Pesanan
{
    // instance variable
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar; 
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
       //assign instance variables
       this.biaya = biaya;
       this.pelanggan = pelanggan;
       nama_pelanggan = pelanggan.getNama();
    }
    
    /**
     * Method of class Pesanan
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /** method untuk mengakses biaya */
    public double getBiaya() 
    {
        return biaya;
    }
    /** method untuk mengakses pelanggan*/
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    public String getNamaPelanggan()
    {
        return nama_pelanggan;
    }
    public TipeKamar getTipeKamar()
    {
        return tipe_kamar;
    }
    
    /** method untuk mengakses StatusDiproses*/
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    /** method untuk mengakses StatusSelesai*/
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    public Room getRoom()
    {
        return kamar;
    }
    /** method untuk mengakses Biaya */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;
    }
    /** method untuk memperbaharui Pelanggan */
    public void setPelanggan(Customer pelanggan)
    { 
        this.pelanggan = pelanggan;
    }
    public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan = nama_pelanggan;
    }
    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar = tipe_kamar;
    }
    /** method untuk memperbaharui Pelanggan */
    public void setStatusDiproses(boolean diproses)
    {
       isDiproses = diproses;
    }
    /** method untuk memperbaharui StatusSelesai */
    public void setStatusSelesai(boolean selesai)
    { 
        isSelesai = selesai;
    } 
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    /** method untuk mencetak biaya ke layar */
    public void printData()
    {
        System.out.println("Pesanan");
        System.out.println("Nama pelanggan: " +nama_pelanggan);
        System.out.println("Tipe kamar: " +tipe_kamar);
        System.out.println("Status layanan diproses: " +isDiproses);
        System.out.println("Status layanan selesai: " +isSelesai);
    }
    
    
    
    
    
}
