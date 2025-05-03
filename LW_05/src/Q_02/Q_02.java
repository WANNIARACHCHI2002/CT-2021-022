package Q_02;
import java.util.Scanner;

public class Q_02 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = scanner.nextInt();
        int count = 0;
        int tot = 0;
        while( num >0){
            tot=tot+num;
            count=count+1;
            System.out.println("Enter number :");
            num = scanner.nextInt();


        }


        System.out.println(tot);
        System.out.println(count);
    }
}
