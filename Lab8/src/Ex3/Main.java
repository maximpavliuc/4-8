package Ex3;

public class Main {
    public static void main(String[] args) {
        int[] array = {80, 23, 100, 125};

        int n = array.length;
        int threadCount = 2; // Numărul de fire de execuție

        SquaredThread[] threads = new SquaredThread[threadCount];

        // Împărțim vectorul în bucăți aproximativ egale pentru fiecare fir de execuție
        int chunkSize = n / threadCount;
        int extraElements = n % threadCount;
        int currentStart = 0;

        // Creăm și pornim firele de execuție
        for (int i = 0; i < threadCount; i++) {
            int elementsForThread = chunkSize + (i < extraElements ? 1 : 0);
            threads[i] = new SquaredThread(array, currentStart, currentStart + elementsForThread);
            threads[i].start();
            currentStart += elementsForThread;
        }

        // Așteptăm ca toate firele de execuție să se încheie
        try {
            for (int i = 0; i < threadCount; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Afișăm vectorul modificat
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

