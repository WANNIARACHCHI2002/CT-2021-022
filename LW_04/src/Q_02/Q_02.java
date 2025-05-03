package Q_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0.Magenta");
        System.out.println("1.cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green");
        System.out.println("Select one colur from this List-");

        int selection = scanner.nextInt();

        if(selection == 0){
            System.out.println("You select magenta");
        } else if( selection == 1) {
            System.out.println("You selected cyan");
        }
        else if(selection == 2) {
            System.out.println("You selected red");
        } else if (selection == 3) {
            System.out.println("You selected blue");
        } else if (selection == 4) {
            System.out.println("You selected green");
        }
        else {
            System.out.println("Invalid selection");
        }





    }



}
