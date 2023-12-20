package day03_scanner_dataCasting;

public class C05_dataCasting {
    public static void main(String[] args) {
        //auto widening

        byte a = 15;
        short b = a;
        int c = b;
        long d = c;
        double e = d;

//explicit narrowing
        double f = 34.5;
        int g = (int) f;
        short h = (short) g;
        byte k = (byte) h;


    }
}
