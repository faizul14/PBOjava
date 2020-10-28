package arrayList;

import java.util.ArrayList;

/**
 *
 * @author cyber61
 */
public class arrayBro {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        //untuk penambahan data seperti ini
        list.add("andi");
        list.add("budi");
        list.add("doni");
        
        //untuk mengetahui panjang array list
        System.out.println(list.size());
        
        //untuk menampilkan data di arraty list
        System.out.println(list.get(1));
        
        //untuk menampilkan semua isi araay
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        int i = 0;
        while (i < list.size()) {            
            System.out.println(list.get(i));
            
            i++;
        }
    }
}
