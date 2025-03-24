package Q_06;
import java.text.SimpleDateFormat;
import java.util.*;

public class Q_06 {
    public static void main(String[] args) {
        System.out.print("Input the year you were born:");

        Scanner S=new Scanner(System.in);
        int year=S.nextInt();

        Calendar C;
        C=Calendar.getInstance();
        int CY=C.get(Calendar.YEAR);

        int age =CY - year;

        System.out.println("You were born in " + year + " and your age is " + age);
    }

}
