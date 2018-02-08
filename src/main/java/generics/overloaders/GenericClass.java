package generics.overloaders;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class GenericClass<T> {
    private void overloadedMethod( Collection<?> o) {
        System.out.println("overloadedMethod(Collection<?>)");
    }
    private void overloadedMethod( List<Number> s) {
        System.out.println("overloadedMethod(List<Number>)");
    }
    private void overloadedMethod( ArrayList<Integer> i) {
        System.out.println("overloadedMethod(ArrayList<Integer>)");
    }

    private void method(List<T> t) {
        overloadedMethod(t) ; // which method is called?
    }

    public static void main(String[] args) {
        GenericClass<Integer> test = new GenericClass<Integer>();
        test.method(new ArrayList<Integer>());
        test.overloadedMethod(new ArrayList<Integer>());

        WordBox<CharSequence> wbox = new WordBox<>("Abc");
        wbox.reset("Hello");
    }
}


class Box <T> {
    private T theThing;
    public Box( T t)        { theThing = t; }
    public void reset( T t) { theThing = t; }
}
class WordBox< S extends CharSequence > extends Box< String > {
    public WordBox( S t)    { super(t.toString().toLowerCase()); }
    public void reset( S t) { super.reset(t.toString().toLowerCase()); }
}