
package pbopertemuan1;

/**
 *
 * @author cyber61
 */
public class mainkucing {
    
    public static void main(String[] args) {
        
        kucing kucingbaru = new kucing("hijau",5,"pendek","ikan paus");//object
      
        System.out.println("warna :"+kucingbaru.warna);
        System.out.println("jenis ekor :"+kucingbaru.jenis_ekor);
        System.out.println("jenis makanan :"+kucingbaru.jenis_makanan);
        System.out.println("jumlah kaki :"+kucingbaru.jumlah_kaki);
        
        
        System.out.println("aktivitas :"+kucingbaru.bersuara());
        
        kucingbaru.berburu();
        
        
        
    }
}
