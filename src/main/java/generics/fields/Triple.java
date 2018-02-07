package generics.fields;

import generics.model.Animal;
import generics.model.Cat;
import generics.model.Dog;
import generics.model.Human;

/**
 * Attempt to make a triplet of three bounded type parameters that are all Comparable to one another
 * */
public class Triple {

    public <U extends Comparable<Animal>, V extends Comparable<Animal>> Triple(U u, V v){
        //System.out.println("Compare first two:" + u.compareTo(v));
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.compareTo(cat);
        Human human = new Human();

        Triple triple = new Triple(dog, cat);
    }
}
