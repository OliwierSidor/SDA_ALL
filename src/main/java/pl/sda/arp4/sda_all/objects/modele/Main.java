package pl.sda.arp4.sda_all.objects.modele;

public class Main {
    public static void main(String[] args) {
        // zmiena typu Pies o nazwie pies1
//        Pies pies1 = new Pies();
//        pies1.imie = "Burek";
//
//        System.out.println(pies1);
//
//        Pies pies2 = new Pies();
//        pies2.imie = "Wacław";
//        System.out.println(pies2);

        //////////////////////////////////////
        Student student1 = new Student("Oliwier","Sidor");
//        student1.imie = "Oliwier";
//        student1.nazwisko = "Sidor";
        System.out.println(student1);
        System.out.println("Ten student ma na imie: " + student1.getImie());

        student1.przedstawSie();
    }
}
