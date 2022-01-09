package com.MarxGrzegorz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Butelka mala = new Butelka(5, 13);
        List<Butelka> zbiórButelek = new ArrayList<>();


        //Tworzenie randomowych butelek, ilość podana przez użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile chcesz różnych butelek");
        int ilebutelek = scanner.nextInt();
        for (int i = 0; i <= ilebutelek; i++) {
            Random random = new Random();
            double wlano = random.nextDouble(100);
            int max = (int) (wlano * 2);
            Butelka butelka = new Butelka(wlano, max);
            zbiórButelek.add(butelka);
        }
        System.out.println(zbiórButelek.get(1).getIloscPlynu());


        //Zabawa istniejącymi butlekami
        zbiórButelek.get(1).wylejPlyn(6);
        System.out.println(zbiórButelek.get(1).getIloscPlynu());
      System.out.println("Po wylaniu butelka zawiera " + mala.getIloscPlynu() + "l płynu");
        System.out.println("butelka zawiera " + mala.getIloscPlynu() + "l płynu");

        mala.wlejPlyn(15);
        System.out.println("Po wylaniu i wlaniu butelka zawiera " + mala.getIloscPlynu() + "l płynu");
        mala.wylejWszsyto();
        System.out.println("Wszystko wylane " + mala.getIloscPlynu() + "l płynu");

        Butelka duza = new Butelka(100, 105);
        mala.dolejZInnej(5, duza);
        System.out.println("Po przelaniu butelka mala zawiera " + mala.getIloscPlynu() + "l płynu");
        System.out.println("Po przelaniu butelka duza zawiera " + duza.getIloscPlynu() + "l płynu");
        duza.przelejDoInnej(20, mala);
        System.out.println("Po kolejnym przelaniu  butelka mala zawiera " + mala.getIloscPlynu() + "l płynu");
        System.out.println("Po kolejnym przelaniu butelka duza zawiera " + duza.getIloscPlynu() + "l płynu");

        duza.wylejWszsyto();


    }

}
