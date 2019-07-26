/**
 * Zoo
 */
public class Zoo {

    public static void main(String[] args) {
        Animal doggy = new Dog();
        Animal kitty = new Cat();
        Animal birdy = new Bird();

        System.out.println(doggy.getSound());
        System.out.println(kitty.getSound());
        System.out.println(birdy.getSound());
        doggy.setFlyingAbility(new ItFlys());
        // System.out.println(kitty.tryToFly());
        System.out.println(doggy.tryToFly());
        // System.out.println(birdy.tryToFly());

    }
}