
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 *
 * @author (Hanifah Khairunnisa)
 * @version (8 Maret 2018)
 */
public enum TipeKamar
{
    SINGLE("Single"), DOUBLE("Double"), PREMIUM("Premium");
    
    private String type;
    
    TipeKamar(String type){
        this.type = type;
    } 
    public String toString() {
        return type;
    }
}


