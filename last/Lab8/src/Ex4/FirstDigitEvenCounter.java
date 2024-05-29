package Ex4;

class FirstDigitEvenCounter implements Runnable {
    private int[][] matrix;
    private int startRow, endRow;
    private int evenFirstDigitCount;

    public FirstDigitEvenCounter(int[][] matrix, int startRow, int endRow) {
        this.matrix = matrix;
        this.startRow = startRow;
        this.endRow = endRow;
        this.evenFirstDigitCount = 0;
    }

    @Override
    public void run() {
        for (int i = startRow; i < endRow; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int number = matrix[i][j];
                while (number >= 10) {
                    number /= 10;
                }
                if (number % 2 == 0) {
                    evenFirstDigitCount++;
                }
            }
        }
    }

    public int getEvenFirstDigitCount() {
        return evenFirstDigitCount;
    }
}
