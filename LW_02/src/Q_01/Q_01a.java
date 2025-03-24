package Q_01;
import java.sql.SQLOutput;
import java.util.*;


public class Q_01a {
    public static void main(String[] args) {

        System.out.print("Enter value for A:");
        Scanner s;
        s=new Scanner(System.in);
        int A;
        A=s.nextInt();

        System.out.print("Enter value for B:");
        int B;
        B=s.nextInt();

        System.out.print("Enter value for C:");
        int C;
        C=s.nextInt();

        int Z=(B*B)+A*C;

        float X=(float)Math.sqrt(Z);

        System.out.println(X);


    }
}
