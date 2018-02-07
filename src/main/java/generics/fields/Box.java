package generics.fields;

import java.util.Objects;

public class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public void put(T t) {
        this.t = t;
    }

    public T take() {
        return t;
    }

    public boolean equalTo(Box<T> other) {
        return Objects.equals(t, other.t);
    }

    public Box<T> copy(){
        return new Box<T>(t);
    }


    public static void main(String[] args) {
        Box<?> box = new Box<String>("abc");
        //box.put("xyz");      //error
        box.put(null);      //ok

        //String s = box.take();   //error
        Object o = box.take();  //ok

        //boolean equal = box.equalTo(box);       //error
        //equal = box.equalTo(new Box<String>("abc"));    //error

        Box<?> box1 = box.copy();    //ok,essentiall the same as the assignment at the beginning
        //Box<String> box2 = box.copy();  //error


    }

}
