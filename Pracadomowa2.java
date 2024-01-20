package Lekcja2.typy;

public class Pracadomowa2 {

    public static void main(String[] args) {
        ZmienneLiczbowe();
        zmienneLogiczne();
        ZmiennaTekstowa();
        ZmienneLogiczne2();
    }

    private static void ZmienneLiczbowe() {
        System.out.println("Zmienne liczbowe");
        System.out.println("===========");

        long iloscAktualnieWidocznychGwiazdNaNiebie = 100000000L;
        byte iloscZapalekWPudelku = 50;
        byte dlugoscZyciaCzlowieka = 120;
        int iloscMieszancowKatowic = 300000;
        long iloscMrowekWMrowisku = 800000L;

        System.out.println("ilosc gwiazd na niebie");
        System.out.println(iloscAktualnieWidocznychGwiazdNaNiebie);
        System.out.println("===========");
        System.out.println("ilosc zapalek w pudelku");
        System.out.println(iloscZapalekWPudelku);
        System.out.println("===========");
        System.out.println("dlugosc zycia czlowieka");
        System.out.println(dlugoscZyciaCzlowieka);
        System.out.println("===========");
        System.out.println("ilosc mieszkancow katowic");
        System.out.println(iloscMieszancowKatowic);
        System.out.println("===========");
        System.out.println("ilosc mrowek w mrowisku");
        System.out.println(iloscMrowekWMrowisku);
        System.out.println("===========");
    }
    static void zmienneLogiczne() {
        System.out.println("zmienne logiczne");
        boolean a = true;
        boolean b = false;

        boolean czyCzlowiekMozeMiec100lat = a;
        boolean czyCzlowiekMozeMiec160lat = b;

        System.out.println(czyCzlowiekMozeMiec100lat);
        System.out.println(czyCzlowiekMozeMiec160lat);
        System.out.println("===========");
    }

    private static void ZmiennaTekstowa() {
        System.out.println("Zmienna Tekstowa");
        String jestes = "jestes u celu!";
        String jestesDużymiLiterami = jestes.toLowerCase();
        String jestesMalymiLiterami = jestes.toUpperCase();

        System.out.println(jestes);
        System.out.println(jestesDużymiLiterami);
        System.out.println(jestesMalymiLiterami);
        System.out.println("===========");
    }

    private static void ZmienneLogiczne2() {
        System.out.println("Zmiene Logiczne");
        Boolean a1 = true;
        Boolean a2 = false;
        boolean a3 = true;
        boolean a4 = false;

        boolean czy10JestWiekszeOd12 = 10 < 12;
        int x = 1;
        int y = 2;
        Boolean czyZmiennaxJestRownaZmiennejy = x == y;

        System.out.println(czy10JestWiekszeOd12);
        System.out.println(czyZmiennaxJestRownaZmiennejy);
    }
}