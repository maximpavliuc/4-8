package Ex1;

// многопоточный подсчет нечетных чисел в матрице

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 20, 5, 256},
                {51, 4, 23, 55},
                {1, 2, 3, 4}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        int threadCount = 3;

        OddCounter[] counters = new OddCounter[threadCount];
        Thread[] threads = new Thread[threadCount];

        int chunkSize = m / threadCount;
        int extraRows = m % threadCount;
        int currentRow = 0;

        for (int i = 0; i < threadCount; i++) {
            int rowsForThread = chunkSize + (i < extraRows ? 1 : 0);
            counters[i] = new OddCounter(matrix, currentRow, currentRow + rowsForThread);
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

        int totalOddCount = 0;
        for (int i = 0; i < threadCount; i++) {
            totalOddCount += counters[i].getOddCount();
        }

        System.out.println("Numarul total de componente impare este: " + totalOddCount);
    }
}