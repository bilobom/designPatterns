// Here we're trying to adhear to the dependency inversion principle,
// Our higher-module (Cat,Dog) will now be dependent on abstration(SpeakingBehaviour)
// This rise an intresting observation (see Dog class below), we introduced redandency 
//in our Animals and (Cat and Dogs are the same).
//In the concluded_sulution folder we'll see how this principle favors composition over inheretence

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
        System.out.println("complex meaowing with dependency inversion");
    }
}

class DogSpeakingBehaviour implements SpeakingBehaviour {
    public void speak() {
        System.out.println("complex woofing with dependency inversion");
    }
}

// Conceate animals
/**
 * Cat extends Animal
 */
class Cat extends Animal {

    // Now, the Cat class (higher-module) depends on abstration (SpeakingBehavoir
    // interface)
    // rather than concreate CatSpeakingBehaviour (low-level module)
    SpeakingBehaviour behaviour;

    // the concreate behaviour gets injected throught construction injection
    public Cat(SpeakingBehaviour injectedBehaviour) {
        this.behaviour = injectedBehaviour;
    }

    public void speak(/* It might be injected here as well throught parameter injection */) {
        this.behaviour.speak();
    }
}

/**
 * Cat extends Animal
 */
class Dog extends Animal {

    // Now , what is the deffrence between dog and cat class then ?
    // there absolutly no deffrence, which means we don't need inheretence here
    // our code is redandante
    SpeakingBehaviour behaviour;

    public Dog(SpeakingBehaviour injectedBehaviour) {
        this.behaviour = injectedBehaviour;
    }

    public void speak() {
        this.behaviour.speak();
    }
}

// Main
class Program {
    public static void main(String[] args) {

        Animal cat = new Cat(new CatSpeakingBehaviour());
        Animal dog = new Dog(new DogSpeakingBehaviour());

        cat.speak();
        dog.speak();
    }
}
