package Q_02;
import java.util.ArrayList;
import java.util.Scanner;
public class Q_02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Pet> pets = new ArrayList<>();

            while (true) {
                System.out.print("Enter pet name (or STOP to finish): ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("STOP")) break;

                System.out.print("Enter type ('c' for cat, 'd' for dog): ");
                char type = scanner.nextLine().toLowerCase().charAt(0);

                Pet pet;
                if (type == 'c') {
                    pet = new Cat();
                } else {
                    pet = new Dog();
                }
                pet.setName(name);
                pets.add(pet);
            }

            for (Pet pet : pets) {
                System.out.println("Name: " + pet.getName() + ", Type: " + pet.getClass().getSimpleName());
            }
        }


}
