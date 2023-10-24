class SuperKeyword {
    private String name;

    public Insect(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " is moving.");
    }

    public void makeSound() {
        System.out.println(name + " is making a buzzing sound.");
    }
}

class Ant extends Insect {
    public Ant(String name) {
        super(name);
    }

    // Override the move method from the base class
    @Override
    public void move() {
        System.out.println(super.name + " is marching.");
    }

    // Add a method specific to Ant class
    public void gatherFood() {
        System.out.println(super.name + " is gathering food.");
    }
}

public class InsectDemo {
    public static void main(String[] args) {
        Insect bee = new Insect("Bee");
        bee.move();
        bee.makeSound();

        Ant workerAnt = new Ant("Worker Ant");
        workerAnt.move(); // Calls the overridden method in Ant class
        workerAnt.makeSound(); // Calls the base class method
        workerAnt.gatherFood(); // Calls the method specific to Ant class
    }
}
