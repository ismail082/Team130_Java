package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yasinizi giriniz");
        int yas = scanner.nextInt();

        scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("isimsiz: " + isim);
        System.out.println("soyismijni: " + soyisim);
        System.out.println("Yasiniz: " + yas);
        System.out.println("Kaydinz basariyla tamamlanmistir.");

    }
}