package Q_03;
import java.util.*;
public class Q_03 {
    public static void main(String[] args) {

        System.out.print("input temperature of celsius:");

        Scanner S;
        S=new Scanner(System.in);
        int C=S.nextInt();

        double F;
        F=(1.8*C)+32;

        System.out.println(F);

    }

}
