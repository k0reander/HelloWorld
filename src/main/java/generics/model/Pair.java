package generics.model;

import java.util.Date;

public class Pair<X extends Animal, Y extends Animal> {
    private Animal X;
    private Animal Y;

    public Pair(Animal x, Animal y) {
        X = x;
        Y = y;
    }

    @Override
    public String toString() {
        return "Pair{" + X + " : " + Y + "}";
    }
}
