package Q_02;
import java.util.*;
public class Q_02 {
    public static void main(String[] args) {

        System.out.print("Enter value of centimeter:");

        Scanner S;
        S=new Scanner(System.in);
        int X=S.nextInt();

        double I=(X/2.54);

        double F=(X/30.48);

        System.out.println("inches="+I);
        System.out.print("feet="+F);


    }

}
