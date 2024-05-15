package lab7;

public class MyVector3 implements Sumabil {
    private int x, y, z;

    public MyVector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void addValue(Sumabil value) {
        if (value instanceof MyVector3) {
            MyVector3 other = (MyVector3) value;
            this.x += other.x;
            this.y += other.y;
            this.z += other.z;
        }
    }

    @Override
    public String toString() {
        return String.format("MyVector3(%d, %d, %d)", x, y, z);
    }
}

