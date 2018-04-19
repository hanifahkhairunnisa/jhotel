
/**
 * Write a description of class DoubleRoom here.
 *
 * @author (Hanifah Khairunnisa)
 * @version (15 Maret 2018)
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;

    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super (hotel, nomor_kamar);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
    public Customer getCustomer2()
    {
        // put your code here
        return customer2;
    }
    
    
    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }
}
