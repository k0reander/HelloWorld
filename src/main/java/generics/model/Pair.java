package generics.model;

public class Pair<X extends Animal, Y extends Animal> {
    private X x;
    private Y y;

    public Pair(Animal x, Animal y) {
        x = x;
        y = y;
    }

    @Override
    public String toString() {
        return "Pair{" + x + " : " + y + "}";
    }
}
