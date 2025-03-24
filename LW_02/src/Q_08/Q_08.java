package Q_08;
import java.util.*;
public class Q_08 {
    public static void main(String[] args) {

        final double PI=3.14;

        System.out.print("input radius of sphere:");
        Scanner S;
        S=new Scanner(System.in);
        int r=S.nextInt();

        double V;
        V=(4/3)*PI*r*r*r;

        System.out.println("Volume of spere="+V);



    }

}
