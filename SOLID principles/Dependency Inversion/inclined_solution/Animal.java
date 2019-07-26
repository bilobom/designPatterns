//Here we're demonstrating breaking the dependency inversion prinsiple,
//We're inclined to make Speaking behaviour Interface and implement concrete behaviours.
//Each Animal instantiate a concreate behaviour,  
//by making the the Animal subclasses depend on conreate speakingBehaviour
//or High-level module depend on low-level module.
abstract class Animal {

    public abstract void speak();

}

// An interface for speaking behaviour
/**
 * SpeakingBehaviour
 */
abstract interface SpeakingBehaviour {

    public abstract void speak();
}

// Concreate speaking behaviours
class CatSpeakingBehaviour implements SpeakingBehaviour {
    public void speak() {
        System.out.println("complex meaowing");
    }
}

class DogSpeakingBehaviour implements SpeakingBehaviour {
    public void speak() {
        System.out.println("complex woofing");
    }
}

// Conceate animals
/**
 * Cat extends Animal
 */
class Cat extends Animal {

    // Here we would have a refrence to the Speaking Behaviour
    // This means that the Cat his coupled to the concreate speaking behaviour
    // THis is a violation to the "Dependency inversion principle"
    // the high-level module Cat should not depend on the low-level module
    // CatSpeakingBehaviour
    CatSpeakingBehaviour catSpeakingBehaviourInstance = new CatSpeakingBehaviour();

    public void speak() {
        catSpeakingBehaviourInstance.speak();
    }
}

/**
 * Cat extends Animal
 */
class Dog extends Animal {

    // Here we would have a refrence to the Speaking Behaviour
    DogSpeakingBehaviour dogSpeakingBehaviourInstance = new DogSpeakingBehaviour();

    public void speak() {
        dogSpeakingBehaviourInstance.speak();
    }
}

// Main
class Program {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.speak();
        dog.speak();
    }
}
