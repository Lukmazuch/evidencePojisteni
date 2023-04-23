package org.example;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Třída reprezentuje databázy
 */
public class Databaze {
    // ArrayList do kterého se ukládají pojištěnci
    private ArrayList<Pojisteny> pojistenci;
    private Scanner sc = new Scanner(System.in);

    /**
     * Vytvoří novou instanci databáze
     */
    public Databaze(){
        this.pojistenci = new ArrayList<>();
    }

    /**
     *  Metoda pro přidaní pojištěnce
     */
    public void pridejPojisteneho(){
        System.out.println("--------------------------------");
        System.out.println("Zadejte jméno: ");
        String jmeno = sc.nextLine().trim();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = sc.nextLine().trim();
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Zadejte telefonní číslo: ");
        String telefonniCislo = sc.nextLine().trim();

        Pojisteny pojistenec = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo); // Vytvoření nového pojištěnce
        pojistenci.add(pojistenec); // Přidání do pole pojištěnců
        System.out.println("--------------------------------");
        System.out.println(pojistenec.getJmeno() + " " + pojistenec.getPrijmeni() + " byl/a uložen/a do databáze.");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println();
        }

    /**
     *  Metoda pro výpis všech pojištěnců
     */
    public void vypisPojistence(){
        System.out.println("--------------------------------");
        if (pojistenci.size()>0) {
            // Pokud pole obsahuje alespoň jednoho pojištěnce, tak ho vypíše
            System.out.println("Seznam pojištěných: ");
            for (Pojisteny pojistenec : pojistenci) {
                System.out.println(pojistenec);
            }
        } else {
            System.out.println("Nebyli nalezeni žádní pojištenci.");
        }
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println();
    }

    /**
     *  Metoda pro vyhledání pojištěnce
     */
    public void vyhledejPojistence() {
        ArrayList<Pojisteny> nalezenyPojistenci = new ArrayList<>();
        System.out.println("--------------------------------");
        System.out.println("Zadejte jméno: ");
        String jmeno = sc.nextLine().trim().toLowerCase();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = sc.nextLine().trim().toLowerCase();
        for (Pojisteny pojistenec : pojistenci) {
            if ((pojistenec.getJmeno().toLowerCase().equals(jmeno)) && (pojistenec.getPrijmeni().toLowerCase().equals(prijmeni)))
                nalezenyPojistenci.add(pojistenec); // Vyhledání pojištěnce podle shody jména a příjmení

        }
        if (nalezenyPojistenci.size() > 0) {
            for (Pojisteny nalezenyPojistenec : nalezenyPojistenci) {
                System.out.println("Výsledek vyhledávání: \n" + nalezenyPojistenec);
            }
        } else {
            System.out.println(jmeno + " " + prijmeni + " nebyl/a nalezen/a.");
        }
    }

    /**
     *  Metoda pro výpis menu
     */
    public void vypisMenu() {
        System.out.println("------------- MENU -------------");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
        System.out.println("------------- MENU -------------");
        System.out.print("Vyberte akci: ");
    }
}
