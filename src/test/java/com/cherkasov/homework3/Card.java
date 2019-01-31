package com.cherkasov.homework3;

enum Currency
{
    dollar,rouble,euro;
}
public class Card {
    String owner_name;
    double balance;
    Currency card_curr;//currency,money is kept on the card in which

    Card(String a) {
        card_curr = Currency.dollar;
        owner_name = a;
        balance = 0;
    }

    Card(String a, double b, Currency c) {
        card_curr = c;
        owner_name = a;
        balance = b;
    }

    public void add(double a) {
        balance = balance + a;

    }

    public void get(double a) throws Exception {

            if ((balance-a) < 0) {
                System.out.println("You are trying to get more than you have!");
                throw new Exception();
            } else {

                System.out.println("Completed!");
                balance = balance - a;
            }

    }

    public void show() {
        switch (card_curr) {
            case dollar: {
                System.out.println("balance in dollars: " + balance + ";balance in euro:" + (balance*0.8772) + ";balance in roubles:" + (balance * 65.9) + ";owner_name: " + owner_name);
                break;
            }
            case euro:
            {
                System.out.println("balance in dollars: " +(balance * 1.132)  + ";balance in euro:" + balance  + ";balance in roubles:" + (balance * 74.82) + ";owner_name: " + owner_name);
                break;
            }
            case rouble:
            {
                System.out.println("balance in dollars: " +(balance * 0.015015)  + ";balance in euro:" + (balance*0.01321)  + ";balance in roubles:" + balance  + ";owner_name: " + owner_name);
                break;
            }
            }

        }
    }

