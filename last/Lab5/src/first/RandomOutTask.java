package first;

import java.util.Random;

public class RandomOutTask implements Task {
    private int randomNumber;

    public RandomOutTask() {
        Random random = new Random();
        randomNumber = random.nextInt(100);
    }

    @Override
    public void execute() {
        System.out.println("Random number: " + randomNumber);
    }
}
