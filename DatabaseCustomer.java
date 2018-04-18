
/**
 * Class DatabaseCustomer
 *
 * @author Hanifah Khairunnisa 
 * @version 28 Februari 2018
 */
import java.util.ArrayList;
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;
    
    
    ///**
     //* Constructor for objects of class DatabaseCustomer
     //*/
    
    
    /**
     * Method of class DatabaseCustomer
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }
    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }
    /** method untuk menambahk customer */
    //public static boolean addCustomer(Customer baru)
    public static boolean addCustomer(Customer baru)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID()) return false;
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }
    public static Customer getCustomer(int id)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getID() == id) return cust;
        }
        return null;
    }
    /** method untuk menghapus customer */
    public static boolean removeCustomer(int id)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan :
                        DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) DatabasePesanan.removePesanan(pesan);
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        return false;
    }
    }
   
    

