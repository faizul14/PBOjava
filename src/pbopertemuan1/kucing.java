
package pbopertemuan1;

/**
 *
 * @author M. FAEZOL PADLI
 */
public class kucing {

    public String warna = "merah";
    public int jumlah_kaki = 4;
    public String jenis_ekor = "panjang";
    public String jenis_makanan = "ikan";

    public kucing(String warna, int jumlah_kaki,String jenis_ekor,String jenis_makanan) {
        this.warna = warna;
        this.jumlah_kaki = jumlah_kaki;
        this.jenis_ekor = jenis_ekor;
        this.jenis_makanan = jenis_makanan;
    }
    
    
    
    public String bersuara(){//method fungsi
        String suara = "meong";
        
        return suara;
    }
    
    void berburu(){//method prosedur
        System.out.println("menembak, memanah");
        
    }
    
    
}
