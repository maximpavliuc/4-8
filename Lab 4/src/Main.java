import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> initialList = new ArrayList<>();
        initialList.add(1);
        initialList.add(2);
        initialList.add(3);

        MyImmutableArray myArray = new MyImmutableArray(initialList);
        System.out.println("The initial state: " + myArray.getArray());

        initialList.add(4);
        System.out.println("Initial list after change: " + initialList);
        System.out.println("After changing the original list: " + myArray.getArray());

        try {
            myArray.getArray().add(5);
        } catch (UnsupportedOperationException e) {
            System.out.println("Attempting to modify a non-modifiable list: Operation not supported.");
        }
    }
}