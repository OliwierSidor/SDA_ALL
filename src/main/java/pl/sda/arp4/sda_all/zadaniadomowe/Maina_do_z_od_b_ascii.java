package pl.sda.arp4.sda_all.zadaniadomowe;

public class Maina_do_z_od_b_ascii {
    public static void main(String[] args) {
        char a = 'a';
        char z = 'z';
        for (a = 'b'; a < z; a++) {
            if (a % 5 ==0)
            System.out.print(a + " ");
        }
    }
}
