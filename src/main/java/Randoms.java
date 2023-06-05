import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int max;
    protected int min;

    public Randoms(int max, int min) {
        this.random = new Random();
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int i = max - min + 1;
                return random.nextInt(Math.abs(i)) + min;
            }
        };
    }
}