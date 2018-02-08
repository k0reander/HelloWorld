package generics.wildcards;

import java.util.Collection;
import java.util.TreeMap;

public class MyTreeMap<K extends Comparable<K>, D> {
    private TreeMap<K,D> tree = new TreeMap<>();

    public void add(K key, D data){
        tree.put(key, data);
    }

    public void fill(Collection<? super D> collection){
        collection.addAll(tree.values());
    }

    public static void main(String[] args) {
        //MyTreeMap<Number, String> tree = new MyTreeMap<Number, String>();
        MyTreeMap<Long, String> tree = new MyTreeMap<Long, String>();
    }
}
