
/**
 * Class Lokasi
 *
 * @author (Hanifah Khairunnisa)
 * @version (1 Maret 2018)
 */
public class Lokasi
{
    // instance variable
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * Constructor for objects of class Lokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        //assign instance variables
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    /**
     * Method of class Lokasi
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /** method untuk mengakses getX */
    public float getX()
    {
        return x_coord;
    }
    /** method untuk mengakses getY */
    public float getY()
    {
        return y_coord;
    }
    /** method untuk mengakses getDeskripsi */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    /** method untuk memperbaharui setX */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }
    /** method untuk memperbaharui setY */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }
    /** method untuk memperbaharui setDeskripsi */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi = deskripsi;
    }
    /** method untuk mencetak deskripsiLokasi ke layar */
    public String toString()
    {
        return null;
    }
    /*public void printData()
    {
        System.out.println("Lokasi");
        System.out.println("Koordinat X: " +x_coord);
        System.out.println("Koordinat Y: " +y_coord);
        System.out.println("Deskripsi: " +deskripsiLokasi);
    }*/
}
