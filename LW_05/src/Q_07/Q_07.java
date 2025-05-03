package Q_07;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence-");
        String sentence = scanner.nextLine();

        System.out.print("Enter change sectence");
        String traget = scanner.nextLine();

        System.out.print("Enter new sectence");
        String replacement = scanner.nextLine();

        String modified = sentence.replaceAll("\\b" + traget + "\\b", replacement);
        System.out.println("New sentence : " + modified);





    }
}

