

package percabangan;

import java.util.Scanner;

/**
 *
 * @author Faezol MP
 */
public class percabangan {

    public void percabanganif() {

        int nilaimtk = 90;

        if (nilaimtk >= 90) {
            System.out.println("grade anda A+ BOS");
        }

    }

    public void percabanganifelse() {
        int nilaimtk = 50;

        if (nilaimtk > 65) {
            System.out.println("anda lulus BRO");
        } else {
            System.out.println("anda perlu remidi nak");
        }
    }

    public void percabanganelseif() {
        Scanner input = new Scanner(System.in);
        int nilaimtk = 0;
        System.out.print("masukkan nilai mtk siswa :");
        nilaimtk = input.nextInt();

        System.out.print("BERARTI GRADENYA : ");
        System.out.println("");
        if (nilaimtk >= 90) {
            System.out.println("GRADE A");
        } else if (nilaimtk >= 80) {
            System.out.println("GRADE B+");
        } else if (nilaimtk >= 70) {
            System.out.println("GRADE B");
        } else if (nilaimtk >= 65) {
            System.out.println("GRADE C+");
        } else if (nilaimtk >= 60) {
            System.out.println("GRADE C");
        } else {
            System.out.println("KAMU DAPAT D BRO");
        }

    }

    public void percabangan_switch_case() {

        Scanner input = new Scanner(System.in);
        int pilih = 0;

        System.out.print("selamat datang di menu bos"
                + "\n 1. menu"
                + "\n 2. about"
                + "\npilih >> ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("anda di menu bos");
                break;
            case 2:
                System.out.println("nama saya developer ini saya bos ");
                break;
            default:
                System.out.println("woi salah input woi");
                break;

        }
    }
}
