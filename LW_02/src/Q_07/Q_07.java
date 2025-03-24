package Q_07;
import java.util.*;
public class Q_07 {
    public static void main(String[] args) {

        Scanner S;
        S = new Scanner(System.in);

        System.out.print("input your weight of(kg):");
        int W = S.nextInt();

        System.out.print("input your height of(cm):");
        int H = S.nextInt();

        double BMI = W / ((H / 100.0) * (H / 100.0));

        if (BMI >= 20 && BMI <= 25) {
            System.out.println("BMI=" + BMI + "\nNormal");
        } else {
            System.out.println("BMI=" + BMI + "\n Not Normal");
        }
    }

}
