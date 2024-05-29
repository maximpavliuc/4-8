package second;

import java.util.ArrayDeque;
import java.util.Deque;
import first.Task;

public class Queue implements Container {
    private Deque<Task> queue;

    public Queue() {
        queue = new ArrayDeque<>();
    }

    @Override
    public Task pop() {
        return queue.poll();
    }

    @Override
    public void push(Task task) {
        queue.offer(task);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            this.push(container.pop());
        }
    }
}
