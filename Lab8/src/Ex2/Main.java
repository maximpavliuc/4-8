package Ex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 20, 5, 256},
                {51, 4, 23, 55},
                {1, 4, 3, 2}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        Thread[] threads = new Thread[m];

        // Creăm și pornim firele de execuție pentru fiecare linie
        for (int i = 0; i < m; i++) {
            threads[i] = new SortRowsThread(matrix, i);
            threads[i].start();
        }

        // Așteptăm ca toate firele de execuție să se încheie
        try {
            for (int i = 0; i < m; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Afisam matricea sortata
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

