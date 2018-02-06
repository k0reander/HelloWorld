package generics.model;

public class Dog implements Animal, StrengthMeasurable {

    private static final String SPECIES = "Dog";
    private Integer strength;

    public Dog(Integer strength) {
        this.strength = strength;
    }

    @Override
    public String getSpecies() {
        return SPECIES;
    }

    @Override
    public Integer getStrength() {
        return this.strength;
    }

    @Override
    public String toString() {
        return getSpecies();
    }
}
