package Ex4;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 20, 5, 256},
                {50, 4, 23, 55},
                {1, 2, 3, 4}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        int threadCount = 3;

        FirstDigitEvenCounter[] counters = new FirstDigitEvenCounter[threadCount];
        Thread[] threads = new Thread[threadCount];

        int chunkSize = m / threadCount;
        int remainingRows = m % threadCount;
        int currentRow = 0;

        for (int i = 0; i < threadCount; i++) {
            int rowsForThread = chunkSize + (i < remainingRows ? 1 : 0);
            counters[i] = new FirstDigitEvenCounter(matrix, currentRow, currentRow + rowsForThread);
            threads[i] = new Thread(counters[i]);
            threads[i].start();
            currentRow += rowsForThread;
        }

        try {
            for (int i = 0; i < threadCount; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalEvenFirstDigitCount = 0;
        for (int i = 0; i < threadCount; i++) {
            totalEvenFirstDigitCount += counters[i].getEvenFirstDigitCount();
        }

        System.out.println("Numarul total de componente cu prima cifra para este: " + totalEvenFirstDigitCount);
    }
}
