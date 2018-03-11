
/**
 * Write a description of class JHotel here.
 *
 * @author (Hanifah Khairunnisa)
 * @version (a version number or a date)
 */
public class JHotel
{
    /**
     * Constructor for objects of class Pesanan
     */
   // public JHotel()
    //{
        
    //}
    public static void main(String [] args)
    {
        // put your code here
        /*Customer hani = new Customer(1, "hani");
        Lokasi depok = new Lokasi(7, 5, "mantap");
        Hotel bintang = new Hotel("manjur", depok, 5);
        Pesanan satu = new Pesanan(7, hani);
        hani.printData();
        hani.setNama("mumun");
        hani.printData();
        DatabaseCustomer.addCustomer(hani); */
        
        Lokasi lokasi1 = new Lokasi(10,20,"Palding");
        Customer pelanggan1 = new Customer(1, "Ricky");
        Hotel hotel1 = new Hotel("Rumah Kita", lokasi1, 5);
        Room room1 =  new Room(hotel1, "10", true, pelanggan1, 1000000, StatusKamar.Booked);
        Pesanan pesanan1 = new Pesanan(100000, pelanggan1);
        pesanan1.setTipeKamar(TipeKamar.Premium);
          
        System.out.println("Welcome to JHotel");
        lokasi1.printData();
        pelanggan1.printData();
        hotel1.printData();
        
        System.out.println("==================METHOD 1===================="); 
        Administrasi.pesananDitugaskan(pesanan1, room1);
        room1.printData();
        pesanan1.printData();
        
        System.out.println("==================METHOD 2====================");
        Administrasi.pesananDibatalkan(room1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("==================METHOD 3====================");
        Administrasi.pesananDibatalkan(pesanan1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("==================METHOD 4====================");
        Administrasi.pesananSelesai(room1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("==================METHOD 5====================");
        Administrasi.pesananSelesai(pesanan1);
        room1.printData();
        pesanan1.printData();
        
        return;
    }
    
}
