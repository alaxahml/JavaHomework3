package com.cherkasov.homework3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String name1;//name of the cardowner of the first card
        String name2;//name of the cardowner of the second card
        double bal;//balance of the card,we pass balance in constructor
        double get;//money to get from the card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the first card owner");
        name1=scanner.nextLine();
        System.out.println("Enter name of the second card owner");
        name2=scanner.nextLine();
        System.out.println("Enter balance of the second card");
        bal=scanner.nextInt();
        System.out.println("How much money do you want to get?");
        while(true) {
            try {
                get = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid parameter,try again");
                get = scanner.nextInt();
            }
        }
    Card card1=new Card(name1);
    Card card2=new Card(name2,bal,Currency.rouble);
    card2.get(get);
    card1.show();
    card2.show();

}
}
