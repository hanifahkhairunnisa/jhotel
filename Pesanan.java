
/**
 * Class Pesanan 
 *
 * @author (Hanifah KHairunnisa)
 * @version (1 Maret 2018)
 */
import java.util.Date;
import java.util.GregorianCalendar;
public class Pesanan
{
     
    // instance variable
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar; 
    private Date tanggalPesan;
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, int hari, int tahun, int bulan)
    {
       //assign instance variables
       this.jumlahHari = jumlahHari;
       this.pelanggan = pelanggan;
       this.kamar = kamar;
       biaya = kamar.getDailyTariff()*jumlahHari;
       GregorianCalendar gc = new GregorianCalendar(tahun, bulan, hari);
    }
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, Date tanggalPesan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.tanggalPesan = tanggalPesan;
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
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    /** method untuk mengakses pelanggan*/
    
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
    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }
    
    /** method untuk mengakses Biaya */
    public void setBiaya()
    {
        biaya = kamar.getDailyTariff()*jumlahHari;
    }
    public void setJumlahHari(double jumlahHari)
    {
       this.jumlahHari = jumlahHari;
    }
    
    /** method untuk memperbaharui Pelanggan */
    public void setPelanggan(Customer pelanggan)
    { 
        this.pelanggan = pelanggan;
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
    public void setTanggalPesan(Date tanggalPesan)
    {
        
    }
    public String toString()
    {
        return "\nPesanan\nNama Pelanggan:\t" +pelanggan.getNama()+ "Jumlah hari\t:" +jumlahHari+ "Biaya\t:"+biaya+"Status layanan diproses\t:" +isDiproses+"Status layanan selesai\t:" +isSelesai;
    }
    
    
    
    
    
}
