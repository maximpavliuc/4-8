package third;

import second.Container;
import second.Stack;
import second.Queue;

public class ContainerFactory implements IFactory {
    public static final ContainerFactory INSTANCE = new ContainerFactory();

    private ContainerFactory() {
    }

    @Override
    public Container createContainer(Strategy strategy) {
        switch (strategy) {
            case FIFO:
                return new Queue();
            case LIFO:
                return new Stack();
            default:
                throw new IllegalArgumentException("Invalid strategy: " + strategy);
        }
    }
}
