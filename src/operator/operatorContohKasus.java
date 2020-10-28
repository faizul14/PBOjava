package operator;

/**
 *
 * @author cyber61
 */
public class operatorContohKasus {
    

    public void aritmatika() {
        int a = 16;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);
    }

    public void penugasan() {
        int a = 16;
        int b = 4;

        System.out.println("hasil penugasan dari 16=4 = " + (a = b));
        System.out.println("hasil penugasan dari 16+=4 = " + (a += b));
        System.out.println("hasil penugasan dari 16-=4 = " + (a -= b));
        System.out.println("hasil penugasan dari 16*=4 = " + (a *= b));
        System.out.println("hasil penugasan dari 16/=4 = " + (a /= b));
        System.out.println("hasil penugasan dari 16%=4 = " + (a %= b));

    }

    public void perbandingan() {
        int a = 16;
        int b = 4;

        System.out.println("hasil perbandingan dari 16>4 = " + (a > b));
        System.out.println("hasil perbandingan dari 16<4 = " + (a < b));
        System.out.println("hasil perbandingan dari 16==4 = " + (a == b));
        System.out.println("hasil perbandingan dari 16!=4 = " + (a != b));
        System.out.println("hasil perbandingan dari 16>=4 = " + (a >= b));
        System.out.println("hasil perbandingan dari 16<=4 = " + (a <= b));
    }

    public void logika() {
        boolean c = true;
        boolean d = false;

        System.out.println("logika dari true && false = " + (c && d));
        System.out.println("logika dari true || false = " + (c || d));
        System.out.println("logika dari  !false = " + (!d));
    }

    public void bitwise() {
        int a = 16;
        int b = 4;

        System.out.println("16 << 4 = " + (a << b));
        System.out.println("16 >> 4 = " + (a >> b));
        System.out.println("16 & 4 = " + (a & b));
        System.out.println("16 | 4 = " + (a | b));
        System.out.println("16 ^ 4 = " + (a ^ b));
        System.out.println("16 = " + (~a));
    }
    
    public void ternary(){
        int nilai_akhir = 85;
        
        String hasil = (nilai_akhir > 50)? "lulus" : "tidak lulus";
        System.out.println("Hasil akhir " + hasil);
        
    }

}
