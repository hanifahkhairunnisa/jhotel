
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
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
       //assign instance variables
       this.biaya = biaya;
       this.pelanggan = pelanggan;
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
    /** method untuk mengakses Biaya */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;
    }
    /** method untuk memperbaharui Pelanggan */
    public void setPelanggan(Customer baru)
    { 
        pelanggan = baru;
    }
    /** method untuk memperbaharui Pelanggan */
    public void setStatusDiproses(boolean diproses)
    {
       isDiproses = diproses;
    }
    /** method untuk memperbaharui StatusSelesai */
    public void setStatusSelesai(boolean diproses)
    { 
        isSelesai = diproses;
    } 
    /** method untuk mencetak biaya ke layar */
    public void printData()
    {
        System.out.println(biaya);
    }
    
    
    
}
