package Q_04;

import java.util.Scanner;

public class Q_04 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year :");
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0)|| (year % 400 ==0)) {
            System.out.println(year + "This year is leep year");
        }
        else {
            System.out.println(year + "This year is not leep year");
        }
    }
}
