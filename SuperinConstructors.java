class SuperinConstructors {
    private String name;
    private int legs;

    public Insect(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public void move() {
        System.out.println(name + " is moving with " + legs + " legs.");
    }

    public void makeSound() {
        System.out.println(name + " is making a buzzing sound.");
    }
}

class Ant extends Insect {
    public Ant(String name, int legs) {
        super(name, legs);
    }

    // Override the move method from the base class
    @Override
    public void move() {
        System.out.println(super.name + " is marching with " + super.legs + " legs.");
    }

    // Add a method specific to Ant class
    public void gatherFood() {
        System.out.println(super.name + " is gathering food.");
    }
}

public class InsectDemo {
    public static void main(String[] args) {
        Insect bee = new Insect("Bee", 6);
        bee.move();
        bee.makeSound();

        Ant workerAnt = new Ant("Worker Ant", 8);
        workerAnt.move(); // Calls the overridden method in Ant class
        workerAnt.makeSound(); // Calls the base class method
        workerAnt.gatherFood(); // Calls the method specific to Ant class
    }
}
