package Q_01b;
import java.util.*;
public class Q_01b {
    public static void main(String[] args) {


        System.out.print("Enter value for X:");
        Scanner s;
        s=new Scanner(System.in);
        int X=s.nextInt();

        System.out.print("Enter value for Y:");
        int Y;
        Y=s.nextInt();


        int W;
        W=X+(4*(Y*Y*Y));

        float Z=(float)Math.sqrt(W);

        System.out.print(Z);

    }

}
