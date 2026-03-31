/**
 * Tehtävä 5 – SalariedEmployee
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perii Employee; kenttä monthlySalary.
 *  2. monthlyPay() palauttaa kuukausipalkan.
 *  3. toString() kuvaava.
 *
 * VINKIT:
 *  - Muista super(name).
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class SalariedEmployee extends Employee {
    // TODO: private double monthlySalary;
    // TODO: public SalariedEmployee(String name, double monthlySalary){ super(name); ... }

    @Override
    public double monthlyPay(){ throw new UnsupportedOperationException("TODO: implement monthlyPay()"); }

    @Override
    public String toString(){ throw new UnsupportedOperationException("TODO: implement toString()"); }
}