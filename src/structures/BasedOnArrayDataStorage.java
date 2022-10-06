package structures;

import java.util.Arrays;

public abstract class BasedOnArrayDataStorage implements DataStorage {
    protected int count;
    protected int[] result = new int[1];

    @Override
    public final void add(final int value) {
        if (count == result.length) {
            final int[] newArray = new int[result.length + 1];
            System.arraycopy(result, 0, newArray, 0, result.length);
            result = newArray;
        }
        if (count == 0) {
            result = new int[1];
        }
        result[count++] = value;

    }
    public int getValue(final int[] result) {
        if (result.length > 0)
            return result[0];
        else
            return 0;
    }

    @Override
    public final int size() {
        return count;
    }

    @Override
    public int[] toArray() {
        return Arrays.copyOf(result, count);
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

}