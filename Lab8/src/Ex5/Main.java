package Ex5;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 2, 50, 250},
                {51, 4, 23, 55},
                {16, 2, 34, 20}
        };

        int m = matrix.length;

        Thread[] threads = new Thread[m];

        // Creăm și pornim firele de execuție pentru fiecare linie
        for (int i = 0; i < m; i++) {
            EvenChecker checker = new EvenChecker(matrix[i]);
            threads[i] = new Thread(checker);
            threads[i].start();
            try {
                threads[i].join();
                System.out.println(checker.getResult());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}