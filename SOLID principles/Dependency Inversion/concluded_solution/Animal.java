// Here , we eliminated the need for dog and cat classes as they share the 
// same implementation and we moved it to Animal class. No inheretence needed.
// The dog and cat instance can be instatiated directly with Animal class.
// This is such a intreaging conclusion of why the "dependency injection principle"
//should be applied

// An interface for speaking behaviour
/**
 * SpeakingBehaviour
 */
abstract interface SpeakingBehaviour {

    public abstract void speak();
}

class Animal {

    SpeakingBehaviour behaviour;

    public Animal(SpeakingBehaviour injectedBehaviour) {
        this.behaviour = injectedBehaviour;
    }

    public void speak(/* It might be injected here as well throught parameter injection */) {
        this.behaviour.speak();
    }

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

// Main
class Program {
    public static void main(String[] args) {

        Animal cat = new Animal(new CatSpeakingBehaviour());
        Animal dog = new Animal(new DogSpeakingBehaviour());

        cat.speak();
        dog.speak();
    }
}
