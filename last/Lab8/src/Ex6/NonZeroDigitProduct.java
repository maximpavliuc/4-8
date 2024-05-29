package Ex6;

class NonZeroDigitProduct implements Runnable {
    private int[] vector;

    public NonZeroDigitProduct(int[] vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < vector.length; i++) {
            int number = vector[i];
            int product = 1;
            while (number != 0) {
                int digit = number % 10;
                if (digit != 0) {
                    product *= digit;
                }
                number /= 10;
            }
            vector[i] = product;
        }
    }
}
