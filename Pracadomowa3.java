package Lekcja3.Operatory;

public class Pracadomowa3 {
    public static void main(String[] args) {
        zadanie1();
        zadanie3();
        zadanie5();
    }

    private static void zadanie5() {
        int x = 2;

        System.out.println(x > 10);
        System.out.println(x < 10);
    }

    private static void zadanie3() {
        int zmiennax;

        System.out.println(3 % 7); // modulo // reszta 3
        System.out.println(8 % 7); // reszta 1
        System.out.println(10 % 7); // reszta 3
        System.out.println("===============================================================================");
    }

    private static void zadanie1() {
        int rok = 365;
        int tydzien = 7;
        System.out.println("rok");
        System.out.println(rok);
        System.out.println("tydzień");
        System.out.println(tydzien);
        System.out.println("Wynik ile niedziel jest w roku");
        System.out.println(rok / tydzien);

        System.out.println("===============================================================================");
    }
}
