package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ilk tamsayisi giriniz");
        int ilkSayi = scanner.nextInt();

        System.out.println("Lütfen ikinci tamsayisi giriniz");
        int ikinciSayi = scanner.nextInt();

       int temp = 0;
       temp = ikinciSayi;
       ikinciSayi = ilkSayi;
       ilkSayi = temp;
        System.out.println("girdiginiz variablenin degerini degistirdim");
        System.out.println("ilk saysinin yeni degeri: " +  ilkSayi);
        System.out.println("ikinci saysinin yeni degeri: " +  ikinciSayi);



    }
}