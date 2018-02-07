package generics.model;

public class Human implements Animal, Comparable<Animal> {
    private static final String SPECIES = "Human";

    @Override
    public String getSpecies() {
        return SPECIES;
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
