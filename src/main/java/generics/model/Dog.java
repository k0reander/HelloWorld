package generics.model;

public class Dog implements Animal, StrengthMeasurable, Comparable<Animal>{

    private static final String SPECIES = "Dog";
    private Integer strength;

    public void setStrength(Integer strength) {
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

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
