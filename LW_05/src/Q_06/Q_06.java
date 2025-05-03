package Q_06;
import java.util.Scanner;

public class Q_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gues the number: ");
        int n = scanner.nextInt();

        int a= 60;
        while (n!=a){
            if(n<60){
                System.out.print("Lower ");
                System.out.println();
            }
            else{
                System.out.print("Higer ");
                System.out.println();
            }
            System.out.print("Gues the number: ");
            n = scanner.nextInt();

        }
        System.out.print("You gest correct number");
    }
}
