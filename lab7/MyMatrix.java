package lab7;

public class MyMatrix implements Sumabil {
    private int[][] matrix = new int[4][4];

    public MyMatrix(int[][] values) {
        for (int i = 0; i < 4; i++) {
            System.arraycopy(values[i], 0, this.matrix[i], 0, 4);
        }
    }

    @Override
    public void addValue(Sumabil value) {
        if (value instanceof MyMatrix) {
            MyMatrix other = (MyMatrix) value;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    this.matrix[i][j] += other.matrix[i][j];
                }
            }
        }
    }
}
