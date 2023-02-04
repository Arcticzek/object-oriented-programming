interface Swimming {
    void swim();
    void surface();
    void dive();
}

interface Flying {
    void fly();
    void land();
}

abstract class Animal {
    abstract void defecate();
}

abstract class Fish extends Animal implements Swimming {
    public void swim() {
        System.out.println("Fish is swimming");
    }
    public void surface() {
        System.out.println("Fish is surfacing");
    }
    public void dive() {
        System.out.println("Fish is diving");
    }
    public void defecate() {
        System.out.println("Fish is defecating");
    }
    abstract void eat();
}

class Whale extends Fish implements Swimming, Flying {
    public void fly() {
        System.out.println("Whale is flying");
    }
    public void land() {
        System.out.println("Whale is landing");
    }
    void eat() {
        System.out.println("Whale is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.swim();
        whale.surface();
        whale.dive();
        whale.defecate();
        whale.fly();
        whale.land();
        whale.eat();
    }
}