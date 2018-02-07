package generics.wildcards;

import generics.model.Cat;
import generics.model.Dog;
import generics.model.Pair;

import java.util.Collection;

public class Methods {

    public static <A> A first(Collection<A> collection){
        return collection.iterator().next();
    }

    public static void printPair(Pair<?,?> pair){
        System.out.println(pair);
    }

    public static void main(String[] args) {
        Pair<?,?> pair1 = new Pair(new Dog(), new Cat());
        Pair<Dog, Dog> pair2 = new Pair<>(new Dog(), new Dog());
        Methods.printPair( pair1 );
        Methods.printPair( pair2);
    }
}
