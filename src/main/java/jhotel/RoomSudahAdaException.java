package jhotel;
public class RoomSudahAdaException extends Exception {
    private Room room_error;

    public RoomSudahAdaException(Room room_input){
        super ("Kamar dengan nomor ruang ");
        room_input=room_input;
    }
    public String getPesan(){
        return super.getMessage() + room_error.getNomorKamar() + " pada" + room_error.getHotel() + " sudah terdaftar";
    }
}
