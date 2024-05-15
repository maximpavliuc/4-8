package fourth;

import first.Task;
import third.Strategy;
import java.util.Calendar;

public class PrintTimeTaskRunner extends AbstractTaskRunner {
    private int taskCounter;

    public PrintTimeTaskRunner(Strategy strategy) {
        super(strategy);
        taskCounter = 0;
    }

    @Override
    protected void afterExecution(Task task) {
        taskCounter++;
        System.out.println("Task executed at: " + Calendar.getInstance().getTime());
    }
}
