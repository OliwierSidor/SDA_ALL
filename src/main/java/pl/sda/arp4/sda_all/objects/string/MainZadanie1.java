package pl.sda.arp4.sda_all.objects.string;

import java.util.Scanner;

public class MainZadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" podaj tekst w ktorym chcesz wyszukac slowo 'ania': ");
        String tekst = scanner.nextLine();

        System.out.println("contains: " + tekst.toLowerCase().contains("ania"));
        System.out.println("startsWith: " + tekst.toLowerCase().startsWith("ania"));
        System.out.println("endsWith: " + tekst.toLowerCase().endsWith("ania"));
        System.out.println("equals: " + tekst.toLowerCase().equals("ania"));
        System.out.println("indexOf: " + tekst.indexOf("ania"));


    }
}
