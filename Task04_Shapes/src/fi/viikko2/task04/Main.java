/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {
        // Rectangle
        Rectangle r1 = new Rectangle(1.5,2.5);
        Rectangle r2 = new Rectangle(2.5, 3.5);
        Rectangle r3 = new Rectangle(1.5, 2.5);
        System.out.println(r1);
        System.out.println(r1.area());
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

        //Circle
        Circle c1 = new Circle(1.5);
        Circle c2 = new Circle(2.5);
        Circle c3 = new Circle(1.5);
        System.out.println(c1);
        System.out.println(c1.circum());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        Shape[] shapes = {r1,r2,r3,c1,c2,c3};
        double total = 0;

        for (Shape s : shapes) {
            total = total + s.area();
            System.out.println(s);
        }

        System.out.println("Total area: " + total);

    }
}