package Ex6;

public class Main {
    public static void main(String[] args) {
        int[] vector = {80, 23, 101, 315};

        Thread thread = new Thread(new NonZeroDigitProduct(vector));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}