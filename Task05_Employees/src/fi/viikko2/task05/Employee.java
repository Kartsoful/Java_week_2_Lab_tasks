/**
 * Tehtävä 5 – Employee
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perusluokka name-kentällä.
 *  2. monthlyPay() palauttaa 0.
 *  3. toString() ja equals(Object).
 *
 * VINKIT:
 *  - equals: sama nimi + sama alatyyppi.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class Employee {
    // TODO: protected String name;
    // TODO: public Employee(String name){ ... }

    public double monthlyPay(){ return 0.0; }

    @Override
    public String toString(){ throw new UnsupportedOperationException("TODO: implement toString()"); }

    @Override
    public boolean equals(Object o){ throw new UnsupportedOperationException("TODO: implement equals(Object)"); }
}