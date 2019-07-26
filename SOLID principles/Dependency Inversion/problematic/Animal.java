/**
 * Animal We demontrating something simple here the speak method is inhireted
 * form Animal, but lets suppose that the speaking is something more complex and
 * that it doesn't apply to all instances of Animal. than we would write a
 * speaking behaviour interface in the inclined_solution folder
 */
abstract class Animal {

    public abstract void speak();

}

/**
 * Dog extends Animal
 */
class Dog extends Animal {

    public void speak() {
        System.out.println("woof");
    }
}

/**
 * Cat extends Animal
 */
class Cat extends Animal {

    public void speak() {
        System.out.println("meaow)");
        // What the peaking is something more complex ?
        // We would then implement behviours
    }
}

class Program {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.speak();
        dog.speak();
    }
}