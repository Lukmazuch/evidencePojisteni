package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Databaze databaze = new Databaze();
        databaze.vypisMenu();
        int volba = 0;
        // Hlavní cyklus programu
        while (volba != 4) {
            try {
                volba = Integer.parseInt(sc.nextLine());

                switch (volba) {
                    case 1:
                        databaze.pridejPojisteneho();
                        databaze.vypisMenu();
                        break;
                    case 2:
                        databaze.vypisPojistence();
                        databaze.vypisMenu();
                        break;
                    case 3:
                        databaze.vyhledejPojistence();
                        System.out.println();
                        databaze.vypisMenu();
                        break;
                    case 4:
                        System.out.println("Děkujeme za použití programu.");
                        break;
                    default:
                        System.out.println("Neplatná volba, opakujte volbu.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Neplatný vstup.");
                databaze.vypisMenu();
            }
        }
    }
}