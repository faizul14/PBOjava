package perulangan;

/**
 *
 * @author Faezol MP
 */
public class perulangan {

    public void perulanganfor() {
        int nilai = 0;
        System.out.print("saya akan berhitung mulai dari :");
        for (int i = 0; i <= 10; i++) {

            if (i == 10) {
                System.out.println("angka " + nilai + " selesai dan terimakasi.");
            } else {
                System.out.print("angka " + nilai + ",");
            }
            nilai++;
        }
    }

    public void perulangan_foreach() {

        String bahasapemrograman[] = {"java", "php", "kotlin", "python", "C++"};

        System.out.println("bahsa pemrograman yang saya kuasai yaitu :");
        for (String bahasa : bahasapemrograman) {
            System.out.println(" bahasa :" + bahasa);
            
        }
    }

    public void perulanganwhile() {

        int i = 1;
        while (i < 10) {
            System.out.println(i + " ");
            i++;
        }

    }

    public void perulangandowhile() {
        boolean a = true;
        int i = 1;
        do {
            if (i == 10) {
                System.out.print("selesai bos :)");
                a = false;
            } else {
                System.out.println("angka " + i);
            }
            i++;

        } while (a == true);
    }

}
