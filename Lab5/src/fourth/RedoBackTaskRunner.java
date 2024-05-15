package fourth;

import first.Task;
import second.Container;
import third.ContainerFactory;
import third.Strategy;

public class RedoBackTaskRunner extends AbstractTaskRunner {
    private Container redoContainer;

    public RedoBackTaskRunner(Strategy strategy) {
        super(strategy);
        redoContainer = ContainerFactory.INSTANCE.createContainer(strategy);
    }

    @Override
    protected void afterExecution(Task task) {
        redoContainer.push(task);
    }

    public void redo() {
        while (!redoContainer.isEmpty()) {
            Task task = redoContainer.pop();
            task.execute();
        }
    }
}
