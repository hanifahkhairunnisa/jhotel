
/**
 * Write a description of class JHotel here.
 *
 * @author (Hanifah Khairunnisa)
 * @version (a version number or a date)
 */
import java.util.*;
public class JHotel
{
    /**
     * Constructor for objects of class Pesanan
     */
    
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
        
        /*Lokasi lokasi1 = new Lokasi(10,20,"Palding");
        Customer pelanggan1 = new Customer(1, "Ricky");
        Hotel hotel1 = new Hotel("Rumah Kita", lokasi1, 5);
        ////Room room1 =  new Room(hotel1, "10", true, pelanggan1, 1000000, StatusKamar.Booked);
        //Pesanan pesanan1 = new Pesanan(100000, pelanggan1);
        //pesanan1.setTipeKamar(TipeKamar.Premium);
          
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
        pesanan1.printData();*/
        /*Lokasi lokasi1 = new Lokasi (5, 5, "Depok");
        Hotel hotel1 = new Hotel("Hotel B Aja", lokasi1, 3);
        Room room1 = new SingleRoom(hotel1, "666", true, StatusKamar.Booked);
        Customer customer1 = new Customer(23, "Mimi per");
        Pesanan pesanan1 = new Pesanan(3, customer1, room1);
        room1.setDailyTariff(1000000);
        pesanan1.setBiaya();
        
        System.out.println("Selamat datang di Hotel B Aja");
        lokasi1.printData();
        customer1.printData();
        hotel1.printData();
        
        System.out.println("==================METHOD 1====================");
        Administrasi.pesananDitugaskan(pesanan1, room1);
        room1.printData();
        pesanan1.printData();
        
        if(room1 instanceof DoubleRoom)
        {
            System.out.println("Benar Double Room");
        }
        else 
        {
            System.out.println("Salah, bukan double room");
            
        }
        
        Room room2 = new DoubleRoom(hotel1, "13", true, StatusKamar.Booked);
        Pesanan pesanan2 = new Pesanan(5, customer1, room2);
        room2.setDailyTariff(2000000);
        pesanan2.setBiaya();
        
        System.out.println("==================METHOD 2====================");
        Administrasi.pesananDitugaskan(pesanan1, room1);
        room2.printData();
        pesanan2.printData();
        
        if(room2 instanceof DoubleRoom)
        {
            System.out.println("Benar Double Room");
        }
        else 
        {
            System.out.println("Salah, bukan double room");
            
        }*/
        /*Customer customer1 = new Customer(1, "Hanifah", 21, 2, 1997);
        Customer customer2 = new Customer (2, "Winny", 6, 6, 1997);
        Customer customer3 = new Customer(3, "Ramdha", 30, 1, 1998);
        
        customer1.setEmail("e.t.d@");
        customer1.printData();
        customer2.setEmail("Ee_.td@ui.ac.id");
        customer2.printData();
        customer3.setEmail("HanifahKhairunnisa.modul5@netlab.com");
        customer3.printData();
        Customer cust1 = new Customer(1, "Hani", new GregorianCalendar(2018, 03, 22).getTime()); */
     /*   DatabaseCustomer.addCustomer(new Customer("siapa", 2018, 01, 01));
        DatabaseCustomer.addCustomer(new Customer("apah", 1977, 02, 02)); 
        DatabaseCustomer.addCustomer(new Customer("duh", 1999, 03, 05)); 
        for (Customer cust1 : DatabaseCustomer.getCustomerDatabase()){
            System.out.println(cust1);
        }
        
        DatabaseHotel.addHotel(new Hotel("uye", new Lokasi(1, 2, "bagus"), 5));
        DatabaseHotel.addHotel(new Hotel("yes", new Lokasi(2, 3, "bagus"), 3));
        DatabaseHotel.addHotel(new Hotel("astagfirullah", new Lokasi(1, 2, "bagus"), 5)); 
        for (Hotel hotel1 : DatabaseHotel.getHotelDatabase()){
            System.out.println(hotel1);
        }
        DatabaseRoom.addRoom(new SingleRoom (DatabaseHotel.getHotel(1), "102"));
        DatabaseRoom.addRoom(new SingleRoom (DatabaseHotel.getHotel(2), "666"));
        DatabaseRoom.addRoom(new PremiumRoom (DatabaseHotel.getHotel(3), "500"));
        for (Room room1 : DatabaseRoom.getRoomDatabase()){
            System.out.println(room1);
        }
        DatabasePesanan.addPesanan(new Pesanan (12, DatabaseCustomer.getCustomer(1)) );
        DatabasePesanan.addPesanan(new Pesanan (4, DatabaseCustomer.getCustomer(2)) );
        DatabasePesanan.addPesanan(new Pesanan (7, DatabaseCustomer.getCustomer(3)) );
        for (Pesanan pesan1 : DatabasePesanan.getPesananDatabase()){
            System.out.println(pesan1);
        }
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "102"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "666"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "500"));
        for (Pesanan pesan1 : DatabasePesanan.getPesananDatabase()){
            System.out.println(pesan1);
        }*/
     Customer cust1=new Customer("hani", 2018, 03, 21, "hanifah.jk@gmail.com");
        Customer cust1=new Customer("inem", 2018, 12, 1, "iyaaaaa@gmail.com");
    }
    
    public JHotel()
    {
        
    }
    
}
