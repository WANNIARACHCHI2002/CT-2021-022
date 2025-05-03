package Q_05;
import java.util.Locale;
import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the caracter: ");
        String input = scanner.nextLine();

        String cleaned = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println(" yes ");
        } else {
            System.out.println("NO ");
        }
    }
}
