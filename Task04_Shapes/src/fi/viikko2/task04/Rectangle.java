/**
 * Tehtävä 4 – Rectangle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: width, height.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Muista @Override.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public double area() { 
        return width * height;    
    }

    @Override
    public String toString(){ 
        double area = width * height;
        return "Width: " + this.width + 
        " Height: " + this.height +
        " Area: " + area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } 

        if (!(o instanceof Rectangle)) {
            return false;
        }

        Rectangle other = (Rectangle) o;

        if (this.width == other.width && this.height == other.height) {
            return true;
        } else {
            return false;
        }
    }
}