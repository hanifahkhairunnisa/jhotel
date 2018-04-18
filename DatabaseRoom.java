
/**
 * Write a description of class DatabaseRoom here.
 *
 * @author Hanifah Khairunnisa
 * @version 18 April 2018
 */
import java.util.ArrayList;
public class DatabaseRoom
{
    // instance variable
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();

    /**
     * Constructor for objects of class DatabaseRoom
     */
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<Room> getRoomDatbabse(){
        return ROOM_DATABASE;
    }
    public static boolean addRoom(Room baru)
    {
        if(baru.getHotel() != null) {
            for (Room kamar :
                    ROOM_DATABASE) {
                if(kamar.getHotel().equals(baru.getHotel())){
                    if(baru.getNomorKamar().compareTo(kamar.getNomorKamar()) == 0){
                        return false;
                    }
                }
            }
            ROOM_DATABASE.add(baru);
            return true;
        }
        else return false;
    }
    public static Room getRoom(Hotel hotel,String nomor_kamar){
        for (Room kamar :
                ROOM_DATABASE) {
            if (kamar.getHotel().equals(hotel) && kamar.getNomorKamar().compareTo(nomor_kamar) == 0) {
                return kamar;
            }
        }
        return null;
    }
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }
    public static ArrayList<Room> getVacantRooms(){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getStatusKamar().equals(StatusKamar.VACANT)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }
    
    public static boolean removeRoom(Hotel hotel, String nomor_kamar)
    {
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                if(kamar.getNomorKamar().compareTo(nomor_kamar) == 0){
                    Administrasi.pesananDibatalkan(kamar);
                    ROOM_DATABASE.remove(kamar);
                    return true;
                }
            }
        }
        return false;
    }
    
}
