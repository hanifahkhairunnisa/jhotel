
/**
 * Class Customer
 *
 * @author (Hanifah Khairunnisa)
 * @version (1 Maret 2018)
 */
import java.util.*;
import java.text.*;

public class Customer
{
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    SimpleDateFormat dobformat = new SimpleDateFormat("dd MMMMMMMMM yyyy");
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String nama, int tahun, int bulan, int tanggal, String email)
    {
       //assign instance variables
       this.id = DatabaseCustomer.getLastCustomerID()+1;
       this.id = id;
       this.nama = nama;
       this.email=email;
       this.dob = new GregorianCalendar(tahun,bulan-1,tanggal).getTime();
    }
    public Customer(String nama, Date dob, String email)
    {
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = dob;
        this.email=email;
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
    public Date getDOB()
    {
        
        //System.out.printf("%1$s %2$td %2$tB %2$tY", "DOB:", dob);
        
        return dob;
    }
    
    
    /** method untuk memperbaharui nama */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    public String setEmail(String email)
    {
        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            System.out.println("Email valid");
            this.email = email;
        }
        else {
            System.out.println("Email tidak valid");
        }
}
    public Date setDOB (Date dob)
    {
        this.dob = dob;
    }
    
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this)==null){
            
        return "\nCustomer"+ "\nNama\t"+ getNama() + "\nid\t" +getID() +"\nE-mail"+getEmail()+"\nDate of birth"+ dobformat.format(getDOB());
    }
    else{
        return "\nCustomer"+ "\nNama\t"+ getNama() + "\nid\t" +getID() +"\nE-mail"+getEmail()+"\nDate of birth"+ dobformat.format(getDOB()) + "\nSedang memroses";
    }
    }
   
}

