
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
    public Customer(String nama, int year, int month, int date)
    {
       //assign instance variables
       this.id = id;
       this.nama = nama;
       this.dob = new GregorianCalendar(year,month-1,date).getTime();
    }
    public Customer(String nama, Date dob)
    {
        this.id = DatabaseCustomer.getLastCustomerID()+1;
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
    public void setEmail(String email)
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
    public void setDOB (Date dob)
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

