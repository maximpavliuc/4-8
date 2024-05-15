package Ex2;

import java.util.Arrays;

class SortRowsThread extends Thread {
    private int[][] matrix;
    private int row;

    public SortRowsThread(int[][] matrix, int row) {
        this.matrix = matrix;
        this.row = row;
    }

    @Override
    public void run() {
        Arrays.sort(matrix[row]);
    }
}