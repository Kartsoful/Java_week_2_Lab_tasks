/**
 * Tehtävä 1 – Person (luokat, kentät, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Lisää kentät: name (String) ja age (int) – pidä ne private.
 *  2. Toteuta konstruktorit: (name, age) ja (name) age=0.
 *  3. Toteuta `int birthday()` joka kasvattaa ikää ja palauttaa uuden iän.
 *  4. Ylikirjoita `toString()` ja `equals(Object)` (name + age).
 *
 * VINKIT:
 *  - Hyödynnä `java.util.Objects.equals(this.name, other.name)` equalsissa.
 *  - Käytä `@Override`-annotaatiota ylikirjoituksissa.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task01;

public class Person {
    private String name;
    private int age;

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    Person(String n) {
        this.name = n;
        this.age = 0;
    }

    public int birthday() {
        this.age += 1;
        return age;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + ". Age: " + this.age);
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        
    }

    @Override
    public boolean equals(Object o) {
        //  Toteuta equals. Kun olet valmis, POISTA alla oleva rivi.

        if (this == o) {
            return true;
        } else {
            return false;
        }
    }
}