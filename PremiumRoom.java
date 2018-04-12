
/**
 * Write a description of class PremiumRoom here.
 *
 * @author (Hanifah Khairunnisa)
 * @version (15 Maret 2018)
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static double DISCOUNT;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Premium;

    /**
     * Constructor for objects of class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        // initialise instance variables
        super (hotel, nomor_kamar, status_kamar);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
    public double getDiscount()
    {
        return DISCOUNT;
    }
    
    public void setDailyTariff(double dailytariff)
    {
        super.setDailyTariff(dailytariff*DISCOUNT);
    }
}
