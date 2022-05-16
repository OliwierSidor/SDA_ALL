package pl.sda.arp4.sda_all.console;

public class MainZadanie1Petla {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
        for (int i = 1000; i < 1021; i++) {
            System.out.print(i + ", ");
        }
        for (int i = -30; i < 1001; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        for (int j = 1; j < 100; j++) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }

        for (int k = 30; k < 301; k++) {
            if ((k % 3 == 0) && (k % 5 == 0)) {
                System.out.println(k);
            }
        }
        for (int l = -300; l < 301 ; l++) {
            if (l % 2 !=0) {
                System.out.print(l + "; ");
            }
        }
    }
}


