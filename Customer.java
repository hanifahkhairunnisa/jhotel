
/**
 * Class Customer
 *
 * @author (Hanifah Khairunnisa)
 * @version (1 Maret 2018)
 */
public class Customer
{
    protected int id;
    protected String nama;
  
    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String nama)
    {
       //assign instance variables
        this.id = id;
       this.nama = nama;
    }
    /**
     * Method od class Customer
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /** method untuk mengakses id */
    public int getID()
    {
        return id;
    }
    /** method untuk mengakses nama */
    public String getNama()
    {
    return nama;
    }
    /** method untuk memperbaharui id */
    public void setID(int id)
    {
        this.id = id;
    }
    /** method untuk memperbaharui nama */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    /** method untuk mencetak nama */
    public void printData()
    {
        System.out.println(nama);
    }
}
