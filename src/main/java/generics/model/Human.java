package generics.model;

public class Human implements Animal {
    private static final String SPECIES = "Human";

    @Override
    public String getSpecies() {
        return SPECIES;
    }
}
