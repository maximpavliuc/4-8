package Ex3;

class SquaredThread extends Thread {
    private int[] array;
    private int start, end;

    public SquaredThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            int sqrt = (int) Math.sqrt(array[i]);
            array[i] = sqrt * sqrt; // Cel mai mare pătrat perfect mai mic sau egal decât componenta
        }
    }
}