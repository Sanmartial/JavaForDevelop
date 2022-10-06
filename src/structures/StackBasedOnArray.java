package structures;

import java.util.Arrays;

public final class StackBasedOnArray extends BasedOnArrayDataStorage {
    public StackBasedOnArray() {
    }

    @Override
    public int get() {
        final int getValue = getValue(result);
        removeValue();
        return getValue;
    }

    private void removeValue() {
        final int[] newArray = new int[result.length - 1];
        System.arraycopy(result, 0, newArray, 0, result.length - 1);
        count--;
        result = newArray;
    }


}
