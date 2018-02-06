package generics.fields;

import generics.model.*;

import java.util.List;

public class Fields {
    public static void main(String[] args) {
        Cage<Dog> kennel = new Cage<>();
        System.out.println(kennel.prisoners);

        //Class slc = List<String>.class;
        //List<String>[] cages = new List<String>[10];
        List[] unknowns = new List<?>[10];
        //Object o = new Object();
        //boolean maybe = o instanceof List<String>;

        //works but useless
        Pair<Human, Human>[] couples = new Marriage[2];
        //Allawys do
        Marriage[] marriages = new Marriage[2];
    }
}
