/**
 * Tehtävä 3 – BankAccount (kapselointi, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: accountNumber (String), balance (double).
 *  2. Konstruktori: jos initialBalance < 0 -> nollaa.
 *  3. `deposit(amount)` ja `withdraw(amount)` säännöillä.
 *  4. `toString()` ja `equals(Object)` (tilinumero).
 *
 * VINKIT:
 *  - equals: pelkkä tilinumero riittää; vältä double-vertailua.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;

public class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String id, double b) {
        this.accountNumber = id;
        if (b < 0) {
            this.balance = 0.0;
        } else {
            this.balance = b;
        }
    }

    public double deposit(double d) {
        if (d <= 0) {
            return balance;
        } else {
            this.balance = this.balance + d;
            return balance;
        }
    }
     
    public double withdraw(double d) {
        if (d > this.balance || d <= 0) {
            return balance;
        } else {
            this.balance = this.balance - d;
            return balance;
        }
    }
    
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    @Override
    public String toString(){
        return ("Bank ID: " + this.accountNumber + ". Balance: " + this.balance);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o instanceof BankAccount) {

            BankAccount other = (BankAccount) o;

            if (this.accountNumber == other.getAccountNumber()) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}