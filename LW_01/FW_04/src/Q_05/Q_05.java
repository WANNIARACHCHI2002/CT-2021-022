package Q_05;

import java.util.Scanner;

public class Q_05 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Entree :");
        System.out.println("1. Tofu Burger ($3.49)");
        System.out.println("2. Cajun Chicken ($4.59)");
        System.out.println("3. Buffalo Wings ($3.99)");
        System.out.println("4. Rainbow Fillet ($2.99)");
        int entree = scanner.nextInt();

        System.out.println("select side dish :");
        System.out.println("1. Rice Cracker ($0.79)");
        System.out.println("2. No-Salt Fries ($0.69)");
        System.out.println("3. Zucchini ($1.09)");
        System.out.println("4. Brown Rice ($0.59)");
        int side = scanner.nextInt();

        System.out.println("🥤 Drink තෝරන්න:");
        System.out.println("1. Cafe Mocha ($1.99)");
        System.out.println("2. Cafe Latte ($1.90)");
        System.out.println("3. Espresso ($2.49)");
        System.out.println("4. Oolong Tea ($0.99)");
        int drink = scanner.nextInt();


        double total = 0;

        switch (entree) {
            case 1 -> total+=3.49;
            case 2 -> total += 4.59;
            case 3 -> total += 3.99;
            case 4 -> total += 2.99;
            default -> System.out.println("වලංගු Entrée එකක් තෝරන්න.");
        }
        switch (side) {
            case 1 -> total += 0.79;
            case 2 -> total += 0.69;
            case 3 -> total += 1.09;
            case 4 -> total += 0.59;
            default -> System.out.println("වලංගු Side Dish එකක් තෝරන්න.");
        }
        switch (drink) {
            case 1 -> total += 1.99;
            case 2 -> total += 1.90;
            case 3 -> total += 2.49;
            case 4 -> total += 0.99;
            default -> System.out.println("වලංගු පානයක් තෝරන්න.");
        }

        System.out.printf("Total frees : $%.2f%n",total);



    }
}
