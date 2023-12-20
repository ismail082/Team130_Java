package day02_dataTurleri_Scanner;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tamsayi giriniz");
        int girilenTamsayi = scanner.nextInt();

        System.out.println("ondalikli bir Sayi giriniz");
        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("girilen sayilarin toplami: " +  (girilenTamsayi+girilenOndalikliSayi));
        System.out.println("girilen saytilarin carpinmi: " + (girilenTamsayi*girilenOndalikliSayi));


    }
}