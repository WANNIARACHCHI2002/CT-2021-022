package Q_001;

public class Q_001 {

    // Pet.java
    public class Pet {
        private String name;
        public String getName() { return name; }
        public void setName(String petName) { name = petName; }
        public String speak() { return "I'm your cuddly little pet."; }
    }

    // Dog.java
    public class Dog extends Pet {
        public String speak() { return "Woof!"; }
    }

    // Cat.java
    public class Cat extends Pet {
        public String speak() { return "Meow!"; }
    }

}
