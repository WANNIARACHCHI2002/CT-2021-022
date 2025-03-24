package Q_01d;
import java.util.*;
public class Q_01d {

    public static void main(String[] args) {

        final double F=3.14;

        System.out.print("Enter value for Radius:");
        Scanner s;
        s=new Scanner(System.in);
        int r=s.nextInt();

        double a=F*r*r;

        System.out.print("Area of circul="+a);


    }

}
