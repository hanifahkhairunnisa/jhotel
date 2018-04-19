
/**
 * Class Pesanan 
 *
 * @author (Hanifah KHairunnisa)
 * @version (1 Maret 2018)
 */
import java.util.*;
public class Pesanan
{
     
    //variable yang digunakan
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar; 
    private Date tanggalPesan;
    
    /**
     * Constructor kelas Pesanan
     */
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        //this.biaya = kamar.getDailyTariff()*jumlahHari;
        this.isAktif = true;
        this.tanggalPesan = new Date();
        this.id = DatabasePesanan.getLastPesananID()+1;
    }
    /**
     * Method of class Pesanan
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /** method untuk mendapatkan ID */
    public int getID(){
         return id;
    }
    /** method untuk mendapatkan biaya */
    public double getBiaya() 
    {
         return biaya;
    }
    public double getJumlahHari(){
        return jumlahHari;
    }
    /** method untuk mendapatkan pelanggan */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    /** method untuk mendapatkan status diproses*/
    public boolean getStatusDiproses(){
        return isDiproses;
    }
    /** method untuk mendapatkan status aktif*/
    public boolean getStatusAktif()
    {
        return isAktif;
    }
    /** method untuk mendapatkan status selesai*/
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    /** method untuk mendapatkan room*/
    public Room getRoom()
    {
        return kamar;
    }
    /** method untuk mendapatkan Date*/
    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }
    /** mutator id */
    public void setID(int id){
        this.id = id;
    }
    /** mutator biaya*/
    public void setBiaya()
    {
        this.biaya = kamar.getDailyTariff()*jumlahHari;
    }
    /** mutator jumlah hari */
    public void setJumlahHari(double jumlahHari)
    {
       this.jumlahHari = jumlahHari;
    }
    
    /** mutator baru */
    public void setPelanggan(Customer baru)
    { 
       pelanggan = baru;
    }
    
    /** mutator aktif */
    public void setStatusAktif(boolean aktif)
    {
       isAktif = aktif;
    }
    /** mutator diproses  */
    public void setStatusDiproses(boolean diproses)
    { 
        isDiproses = diproses;
    } 
    /** mutator selesai*/
    public void setStatusSelesai (boolean selesai){
        isSelesai = selesai;
    }
    /** mutator kamar */
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    /** mutator tanggalPesan */
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }
    /** method untuk print data*/
    public String toString()
    {
        String final_status = "KOSONG";
        if(isDiproses == true && isSelesai == false) final_status = "DIPROSES";
        else if(isDiproses == false && isSelesai == false) final_status = "KOSONG";
        else if(isDiproses == false && isSelesai == true) final_status = "SELESAI";
        return "\nPesanan\nNama Pelanggan:\t" +pelanggan.getNama()+ "Jumlah hari\t:" +jumlahHari+ "Biaya\t:"+biaya+"Status layanan\t:" +final_status+"Room\t:"+getRoom();
    }
}
