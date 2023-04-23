package org.example;

/**
 * Třída reprezentuje pojištěného
 */
public class Pojisteny {

    // Jméno pojištěného
    private String jmeno;

    // Příjmení pojištěného
    private String prijmeni;

    // Věk pojištěného
    private int vek;

    //Telefonní číslo pojištěného
    private String telefonniCislo;

    /**
     * Vytvoří novou instanci pojištěného
     * @param jmeno Jméno
     * @param prijmeni Příjmení
     * @param vek Věk
     * @param telefonniCislo Telefonní číslo
     */
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    /**
     * @return jméno pojištěného
     */
    public String getJmeno() {
        return jmeno;
    }
    /**
     * @return příjmení pojištěného
     */
    public String getPrijmeni() {
        return prijmeni;
    }
    /**
     * @return věk pojištěného
     */
    public int getVek() {
        return vek;
    }
    /**
     * @return telefonní číslo pojištěného
     */
    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    @Override
    public String toString(){
        return jmeno + " " + prijmeni + " " + vek + " let, tel. číslo: " + telefonniCislo;
    }
}
