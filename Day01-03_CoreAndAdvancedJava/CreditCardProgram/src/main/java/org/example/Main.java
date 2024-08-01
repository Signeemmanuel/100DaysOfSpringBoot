package org.example;

public class Main {
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard(
                "Signe Josue",
                "Afriland First",
                "1234 1234 1234 1234",
                5000);
        wallet[1] = new CreditCard(
                "Signe Josue",
                "Afriland First",
                "2345 2435 4562 2364",
                4000);
        wallet[2] = new CreditCard(
                "Signe Josue",
                "Atlantic",
                "5987 3423 1236 5632",
                1500,
                300);


        for (int val = 1; val <= 20; val++) {
            wallet[0].charge(300 * val);
            wallet[0].charge(200 * val);
            wallet[0].charge(50 * val);
        }

        for (CreditCard card : wallet) {
            CreditCard.printSummary(card);
            while(card.getBalance() > 500) {
                card.makePayment(500);
                System.out.println("New Balance: " + card.getBalance());
            }
            System.out.print("\n");
        }

    }
}