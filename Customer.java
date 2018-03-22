
/**
 * Class Customer
 *
 * @author (Hanifah Khairunnisa)
 * @version (1 Maret 2018)
 */
import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Customer
{
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
  
    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String nama, int tanggal, int bulan, int tahun)
    {
       //assign instance variables
       this.id = id;
       this.nama = nama;
       GregorianCalendar gcalendar = new GregorianCalendar(tahun, bulan, tanggal);
    }
    public Customer(int id, String nama, Date dob)
    {
        this.id = id;
        this.nama = nama;
        this.dob = dob;
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
    public String getEmail()
    {
        return email;
    }
    public Date getDOB(Date dob)
    {
        return this.dob = dob;
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
    public void setEmail(String email)
    {
        Pattern p =  Pattern.compile("[A-Za-z0-9.&*_~]+@[A-Za-z0-9._]+\\.[A-Za-z]{2,4}");
        Matcher m = p.matcher(email);
        
        if (m.matches()){
            this.email = email;
    }
    else {
        System.out.println("Wrong e-mail");
    }
}
    public void setDOB (Date dob)
    {
        this.dob = dob;
    }
    
    public String toString()
    {
        return null;
    }
    /*pub
    
    /** method untuk mencetak nama */
    public void printData()
    {
        System.out.println("Customer");
        System.out.println("ID: " +id);
        System.out.println("Nama pelanggan: " +nama);
        System.out.println(email);
    }
}

