package jhotel;
/**
 * Write a description of class PremiumRoom here.
 *
 * @author (Hanifah Khairunnisa)
 * @version (15 Maret 2018)
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static double DISCOUNT=0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;

    /**
     * Constructor for objects of class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
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
        // put your code here
        return TIPE_KAMAR;
    }
    
    
    public void setDailyTariff(double dailytariff)
    {
        super.setDailyTariff(dailytariff*DISCOUNT);
    }
}
