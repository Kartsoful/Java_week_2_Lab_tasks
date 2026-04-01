/**
 * Tehtävä 2 – Metodien ylikuormitus (sum, min, max, taulukot)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Toteuta sum(int,int), sum(int,int,int), sum(int[]), sum(double[]).
 *  2. Toteuta max(int[]) ja min(int[]).
 *
 * VINKIT:
 *  - Käy taulukko silmukalla; varo tyhjiä taulukoita.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class MathUtil {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int[] a) {
        int sum = 0;
        
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        return sum;
    }

    public static double sum(double[] d) {
        double sum = 0.0;
        for(double i: d) {
            sum = sum + i;
        }
        return sum;
    }

    public static int max(int[] a) {

        if (a.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        } else {
            int max = a[0];
            for (int n: a) {
                if (n > max) {
                    max = n;
                }
            }
            return max;
        }
    }
    
    public static int min(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        } else {
            int min = a[0];
            for (int n: a) {
                if (n < min) {
                    min = n;
                }
            }
            return min;
        }
    }
}