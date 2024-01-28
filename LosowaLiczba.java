package Lekcja4.Matematyka;

import java.util.Random;

public class LosowaLiczba {
    public static void main(String[] args) {
        System.out.println("Losowa liczba");

        double random = Math.random();
        System.out.println(random);
        int max = 1;
        int min = -3;
        System.out.println("Losowa liczba od -3 do 1");
        Double randomGenerator = RandomGeneratorFromMinToMax(max, min);
        System.out.println(randomGenerator.intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
        System.out.println(RandomGeneratorFromMinToMax(max, min ).intValue());
    }

    private static Double RandomGeneratorFromMinToMax(int max, int min) {
        return min + Math.random() * ((max - min) + 1);
    }
}
