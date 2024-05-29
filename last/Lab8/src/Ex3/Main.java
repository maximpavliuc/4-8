package Ex3;

public class Main {
    public static void main(String[] args) {
        int[] array = {80, 23, 100, 125};

        int n = array.length;
        int threadCount = 2;

        SquaredThread[] threads = new SquaredThread[threadCount];

        int chunkSize = n / threadCount;
        int extraElements = n % threadCount;
        int currentStart = 0;

        for (int i = 0; i < threadCount; i++) {
            int elementsForThread = chunkSize + (i < extraElements ? 1 : 0);
            threads[i] = new SquaredThread(array, currentStart, currentStart + elementsForThread);
            threads[i].start();
            currentStart += elementsForThread;
        }

        try {
            for (int i = 0; i < threadCount; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

