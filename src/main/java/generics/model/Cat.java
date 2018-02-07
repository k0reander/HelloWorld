package generics.model;

public class Cat implements Animal, StrengthMeasurable, Comparable<Animal> {

    private static final String SPECIES = "Cat";

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
        return null;
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
