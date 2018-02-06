package generics.wildcards;

import generics.model.Cat;
import generics.model.Dog;
import generics.model.Pair;

public class Methods {

    public static void printPair(Pair<?,?> pair){
        System.out.println(pair);
    }

    public static void main(String[] args) {
        Pair<?,?> pair1 = new Pair(new Dog(), new Cat());
        Pair<Dog, Dog> pair2 = new Pair(new Dog(), new Dog());
        Methods.printPair( pair1 );
        Methods.printPair( pair2);
    }
}
