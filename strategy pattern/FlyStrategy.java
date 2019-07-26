public interface FlyStrategy {

    String fly();
}

class ItFlys implements FlyStrategy {

    public String fly() {
        return "Flying High";
    }
}

class CantFly implements FlyStrategy {
    public String fly() {
        return "Can't fly";
    }
}