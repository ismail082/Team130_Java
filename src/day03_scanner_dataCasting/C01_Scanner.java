package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        char isimIlkHarf = scanner.nextLine().charAt(0);

        scanner = new Scanner(System.in);
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lütfen yasiniz giriniz");
        Integer yas = scanner.nextInt();

        System.out.println("Girilen Bilgiler : " + isimIlkHarf + " "+  soyisim + "," +" "+ yas );








    }
}
