package lec214;

public class Util {
    public static<K, V> boolean equals (Pair<K, V> p1, Pair<K, V> p2){
        p1.getKey().equals(p2.getKey())&&p1.getValue().equals(p2.getValue())
    }
}
