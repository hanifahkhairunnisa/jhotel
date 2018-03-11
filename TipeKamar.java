
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 *
 * @author (Hanifah Khairunnisa)
 * @version (8 Maret 2018)
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    
    private String tipe;
    
    TipeKamar(String tipe){
        this.tipe = tipe;
    } 
    public String toString() {
        return tipe;
    }
}


