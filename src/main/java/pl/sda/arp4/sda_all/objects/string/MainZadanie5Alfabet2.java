package pl.sda.arp4.sda_all.objects.string;

import java.util.Scanner;

public class MainZadanie5Alfabet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        char[] znaki = tekst.toCharArray();
        int[] zliczeniaZnakow = new int[127];

        for (int i = 0; i < znaki.length; i++) {
            char znak = znaki[i];
            zliczeniaZnakow[znak]++;
        }
        for (int i = 0; i < zliczeniaZnakow.length ; i++) {
            if(zliczeniaZnakow[i] > 0){
                System.out.println(((char)i)+ " ->" + zliczeniaZnakow[i]);
            }
        }
    }
}