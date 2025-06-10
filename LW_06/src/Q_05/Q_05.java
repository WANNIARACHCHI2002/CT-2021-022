package Q_05;

public class Q_05 { // Modify Dog.java
    public class Dog extends Pet {
        private double weight;
        public String speak() { return "Woof!"; }
        public double getWeight() { return weight; }
        public void setWeight(double weight) { this.weight = weight; }
    }

    // Modify Cat.java
    public class Cat extends Pet {
        private String coatColor;
        public String speak() { return "Meow!"; }
        public String getCoatColor() { return coatColor; }
        public void setCoatColor(String coatColor) { this.coatColor = coatColor; }
    }

}
