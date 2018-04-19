public class HotelTidakDitemukanException extends Exception {
    private int hotel_error;

    public HotelTidakDitemukanException(int hotel_input){
        super ("hotel dengan id: ");
        hotel_error=hotel_input;
    }
    public String getPesan(){
        return super.getMessage() + hotel_error + "tidak ditemukan";
    }
}
