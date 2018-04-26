package jhotel;
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
    private int id;
    private String nama;
    private String email;
    private Date dob;
    private String password;
    SimpleDateFormat dobformat = new SimpleDateFormat("dd MMMMMMMMM yyyy");
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String nama, int tanggal, int bulan, int tahun, String email, String password)
    {
       //assign instance variables
       this.id = DatabaseCustomer.getLastCustomerID()+1;
       this.id = id;
       this.nama = nama;
       this.email=email;
       this.password = password;
       this.dob = new GregorianCalendar(tahun,bulan-1,tanggal).getTime();
    }
    public Customer(String nama, Date dob, String email, String password)
    {
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = dob;
        this.email=email;
        this.password = password;
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
    public String getPassword(){
        return password;
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
    public void setPassword(String password){

    }

    public String toString() {
        if(DatabasePesanan.getPesananAktif(this)==null)
        {
            return "ID: " + getID()
                    + "\tName: " + getNama()
                    + "\tE-Mail: " + getEmail()
                    + "\tDoB: " + dobformat.format(getDOB())
                    + "\tBooking Order is in progress\n";
        }
        else
        {
            return "ID: " + getID()
                    + "\tName: " + getNama()
                    + "\tE-Mail: " + getEmail()
                    + "\tDoB: " + dobformat.format(getDOB()) + "\n";
        }
    }
   
}

