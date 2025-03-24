package Q_09;
import java.util.*;
public class Q_09 {    public static void main(String[] args) {

    Scanner S=new Scanner(System.in);

    System.out.print("Input amount of dollars:");
    int P=S.nextInt();

    System.out.print("Input percent:");
    int R=S.nextInt();

    System.out.print("Input amount of years:");
    int N=S.nextInt();

    double M=Math.pow(1+(R/100.0),N);

    M=P*M;
    System.out.print("The final amount after"+N+"years is:"+M);
}

}
