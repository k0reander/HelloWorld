package generics.fields;

import generics.model.Cage;
import generics.model.Dog;

public class Fields {
    public static void main(String[] args) {
        Cage<Dog> kennel = new Cage<>();
        System.out.println(kennel.prisoners);

        //Class slc = List<String>.class;
        //List<String>[] cages = new List<String>[10];
        //Object o = new Object();
        //boolean maybe = o instanceof List<String>;
    }
}
