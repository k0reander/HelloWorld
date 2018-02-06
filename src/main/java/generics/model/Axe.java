package generics.model;

public class Axe implements StrengthMeasurable{
    private static final Integer strength = Integer.valueOf(100);;

    @Override
    public Integer getStrength() {
        return this.strength;
    }

    @Override
    public String toString() {
        return "AXE";
    }
}
