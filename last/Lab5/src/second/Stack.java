package second;

import java.util.ArrayList;
import java.util.List;
import first.Task;

public class Stack implements Container {
    private List<Task> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    @Override
    public Task pop() {
        if (isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public void push(Task task) {
        stack.add(task);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            this.push(container.pop());
        }
    }
}
