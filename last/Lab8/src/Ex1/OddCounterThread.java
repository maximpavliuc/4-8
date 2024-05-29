package Ex1;

// нечетные числа

class OddCounter extends Thread {
    private int[][] matrix;
    private int startRow, endRow;
    private int oddCount;

    public OddCounter(int[][] matrix, int startRow, int endRow) {
        this.matrix = matrix;
        this.startRow = startRow;
        this.endRow = endRow;
        this.oddCount = 0;
    }

    @Override
    public void run() {
        for (int i = startRow; i < endRow; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddCount++;
                }
            }
        }
    }

    public int getOddCount() {
        return oddCount;
    }
}




