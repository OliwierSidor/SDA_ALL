package pl.sda.arp4.sda_all.collections;

public class MainZadanieFunkcje {
    public static void main(String[] args) {
        int[] tablica = new int[]{1, 2, 3, 4, 6};

        double suma = sumujElementy(tablica);
        System.out.println("suma: " + suma);

        int minimum = znajdzMinimum(tablica);
        System.out.println("Znalezione minimum: " + minimum);

        int maksimum = znajdzMaksimum(tablica);
        System.out.println("Znalezione maksimum: " + maksimum);

        int indeks = indeksMaksimum(tablica);
        System.out.println("Indeks maksimum: " + indeks);

        double srednia = obliczSrednia(tablica);
        System.out.println("Średnia arytmetyczna wynosi: " + srednia);

        int licznikWiekszych = licznkWiekszychElementówoDŚredniej(tablica);
        System.out.println("Licznik wiekszych elementów od średniej: " + licznikWiekszych);

        int licznikMniejszych = licznikMniejszych(tablica, srednia);
        System.out.println("Licznik mniejszych elementów od średniej: " + licznikMniejszych);

        wypiszOdKonca(tablica);

    }

    private static void wypiszOdKonca(int[] tablica) {
        for (int i = tablica.length -1; i >= 0 ; i--) {
            System.out.print(tablica[i] + " ");
        }
    }
    private static int licznikMniejszych(int[] tablica, double srednia) {
        int licznikMniejszychElementow = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < srednia) {
                licznikMniejszychElementow = licznikMniejszychElementow + 1;
            }
        }
        return licznikMniejszychElementow;
    }

    private static int licznkWiekszychElementówoDŚredniej(int[] tablica) {
        int licznikWiekszychElementow = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > obliczSrednia(tablica)) {
                licznikWiekszychElementow = licznikWiekszychElementow + 1;
            }
        }
        return licznikWiekszychElementow;
    }

    private static double obliczSrednia(int[] tablica) {
        double suma = sumujElementy(tablica);
        double srednia = suma / tablica.length;
        return srednia;
    }

    private static int indeksMaksimum(int[] tablica) {
        int indeksMaksimum = 0;
        int szukaneMaksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (szukaneMaksimum < tablica[i]) {
                szukaneMaksimum = tablica[i];
                indeksMaksimum = i;
            }
        }
        return indeksMaksimum;
    }

    private static int znajdzMaksimum(int[] tablica) {
        int maksimum = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (maksimum < tablica[i]) {
                maksimum = tablica[i];
            }
        }
        return maksimum;
    }

    private static int znajdzMinimum(int[] tablica) {
        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (minimum > tablica[i]) {
                minimum = tablica[i];
            }
        }
        return minimum;
    }

    private static double sumujElementy(int[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        return suma;
    }
}



