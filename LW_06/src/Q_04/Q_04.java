package Q_04;

public class Q_04 { double totalWeight = 0, minWeight = Double.MAX_VALUE, maxWeight = Double.MIN_VALUE;
    int dogCount = 0;

for (Pet pet : pets) {
        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
            double w = dog.getWeight();
            totalWeight += w;
            if (w < minWeight) minWeight = w;
            if (w > maxWeight) maxWeight = w;
            dogCount++;
        }
    }

if (dogCount > 0) {
        System.out.println("Average Weight: " + (totalWeight / dogCount));
        System.out.println("Min Weight: " + minWeight);
        System.out.println("Max Weight: " + maxWeight);
    } else {
        System.out.println("No dogs found.");
    }

}
