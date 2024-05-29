package Ex5;

class EvenChecker implements Runnable {
    private int[] row;
    private String result;

    public EvenChecker(int[] row) {
        this.row = row;
    }

    @Override
    public void run() {
        for (int num : row) {
            if (num % 2 != 0) {
                result = "NU";
                return;
            }
        }
        result = "DA";
    }

    public String getResult() {
        return result;
    }
}

