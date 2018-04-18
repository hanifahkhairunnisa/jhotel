
/**
 * Write a description of class SingleRoom here.
 *
 * @author (Hanifah Khairunnisa)
 * @version (15 Maret 2018)
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR =TipeKamar.SINGLE;

    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    
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
        return TIPE_KAMAR;
    }
    
    
}
