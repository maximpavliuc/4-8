import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyImmutableArray {
    private final ArrayList<Integer> immutableArray;

    public MyImmutableArray(ArrayList<Integer> inputArray) {

        this.immutableArray = new ArrayList<>(inputArray);
    }

    public List<Integer> getArray() {
        return Collections.unmodifiableList(immutableArray);
    }
}
