/**
 * Animal
 */
public class Animal {

    private String name;
    private double weight;
    private String sound;

    // public Animal(String name, double weight) {
    //     this.name = name;
    //     this.weight = weight;
    // }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double newWeight) {
        if(newWeight>0)
            weight = newWeight;
        else System.out.println("Weight must be greater than 0");
    }

    public double getWeight() {
        return weight;
    }

    public void setSound(String newSound) {
        sound = newSound;
    }

    public String getSound() {
        return sound;
    }
}