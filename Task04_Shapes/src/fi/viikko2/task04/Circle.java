/**
 * Tehtävä 4 – Circle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kenttä radius.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Area = Math.PI * r * r.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Circle extends Shape {
    // TODO: private double radius;
    // TODO: public Circle(double radius) { ... }

    private double radius;

    Circle (double r) {
        this.radius = r;
    }

    public double circum() {
        return Math.PI * radius * 2;
    }

    @Override
    public double area() { 
        return Math.PI * radius * radius;
    }


    @Override
    public String toString() { 
        double area = this.area();
        return "Radius: " + radius + " Area: " + area;        
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) {
            return true;
        }

        if(!(o instanceof Circle)) {
            return false;
        }

        Circle other = (Circle) o;

        return this.radius == other.radius;
        
    }
}