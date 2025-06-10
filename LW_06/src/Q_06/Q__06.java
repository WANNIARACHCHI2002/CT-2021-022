package Q_06;
import java.util.*;

public class Q__06 { 

    public class Q6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Pet> pets = new ArrayList<>();
            ArrayList<Cat> cats = new ArrayList<>();
            ArrayList<Dog> dogs = new ArrayList<>();

            while (true) {
                System.out.println("Menu:\n1. Add Cat\n2. Add Dog\n3. Remove Cat\n4. Remove Dog\n0. Quit");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (choice == 0) break;

                if (choice == 1) {
                    Cat cat = new Cat();
                    System.out.print("Enter cat name: ");
                    cat.setName(scanner.nextLine());
                    System.out.print("Enter coat color: ");
                    cat.setCoatColor(scanner.nextLine());
                    cats.add(cat);
                    pets.add(cat);
                } else if (choice == 2) {
                    Dog dog = new Dog();
                    System.out.print("Enter dog name: ");
                    dog.setName(scanner.nextLine());
                    System.out.print("Enter weight: ");
                    dog.setWeight(scanner.nextDouble());
                    scanner.nextLine(); // consume newline
                    dogs.add(dog);
                    pets.add(dog);
                } else if (choice == 3) {
                    System.out.print("Enter cat name to remove: ");
                    String name = scanner.nextLine();
                    cats.removeIf(cat -> cat.getName().equalsIgnoreCase(name));
                    pets.removeIf(p -> p instanceof Cat && p.getName().equalsIgnoreCase(name));
                } else if (choice == 4) {
                    System.out.print("Enter dog name to remove: ");
                    String name = scanner.nextLine();
                    dogs.removeIf(dog -> dog.getName().equalsIgnoreCase(name));
                    pets.removeIf(p -> p instanceof Dog && p.getName().equalsIgnoreCase(name));
                }
            }
        }
    }

}
