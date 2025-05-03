package Q_03;

import java.util.Scanner;


public class Q_03 {
    public static  void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input power of 10(ex: 6.9.12)");
        int power = scanner.nextInt();

        switch (power){
            case 6:
                System.out.println("Million");
                break;
            case 9:
                System.out.println("Billion");
                break;
            case 12:
                System.out.println("Trillion");
                break;
            case 15:
                System.out.println("quadrillion");
                break;
            case 18:
                System.out.println("quintillion");
                break;
            case 21:
                System.out.println("sextillion");
                break;
            case 30:
                System.out.println("Nonillion");
                break;
            case 100:
                System.out.println("Million");
                break;
            default:
                System.out.println("Invalid numbeer");

        }
    }
}
