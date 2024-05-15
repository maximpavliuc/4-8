package fourth;

import first.Task;
import third.Strategy;

public class CounterTaskRunner extends AbstractTaskRunner {
    private int taskCounter;

    public CounterTaskRunner(Strategy strategy) {
        super(strategy);
        taskCounter = 0;
    }

    @Override
    protected void afterExecution(Task task) {
        taskCounter++;
    }

    public int getCounter() {
        return taskCounter;
    }
}
