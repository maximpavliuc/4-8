package lab7;

import java.util.List;

public interface Sumabil {
    void addValue(Sumabil value);

    static <T extends Sumabil> T sumCollection(List<T> list) {
        if (list == null || list.isEmpty()) return null;
        T sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sum.addValue(list.get(i));
        }
        return sum;
    }
}

