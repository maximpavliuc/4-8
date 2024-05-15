package lab7;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.get("one"));   // Output: 1
        System.out.println(map.get("two"));   // Output: 2
        System.out.println(map.get("three")); // Output: 3
        System.out.println(map.get("four"));  // Output: null
    }
}
