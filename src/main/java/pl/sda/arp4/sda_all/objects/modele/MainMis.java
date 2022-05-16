package pl.sda.arp4.sda_all.objects.modele;

public class MainMis {
    public static void main(String[] args) {
        Mis mis1 = new Mis(51, "Uszatek");
//        uszatek.imie = "Uszatek";
//        uszatek.wiek = 50;

        Mis mis2 = new Mis(30, "Koralgol");
//        koralgol.imie = "Koralgol";
//        koralgol.wiek = 50;
        System.out.println("Był sobie miś o imieniu "+mis1.getImie()+" który miał "+ mis1.getWiek()+" lat");
        System.out.println("Był sobie miś o imieniu "+mis2.getImie()+" który miał "+ mis2.getWiek()+" lat");
    }
}
