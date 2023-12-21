package day03_scanner_dataCasting;

public class C06_ExpilicitNarrowing {
    public static void main(String[] args) {
        double dbl = 34.7;
        int sayi = (int) dbl;
        System.out.println(sayi);

        int sayi1 = (int) 23.56;
        byte byt = (byte) sayi1;
        System.out.println(byt);

        int sayi2 = 130;
        byt = (byte) sayi2;
        System.out.println(byt);

        int sayi3 = 260;
        byt = (byte) sayi3;
        System.out.println(byt);

        int sayi4 = 2600000;
        byt = (byte) sayi3;
        System.out.println(byt);

        int sayi5 = 2100000000;
        sayi5 = sayi5 + 50000000;
        System.out.println(sayi5);
    }
}
