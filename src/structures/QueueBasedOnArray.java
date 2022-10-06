package structures;

import java.util.Arrays;

public final class QueueBasedOnArray extends BasedOnArrayDataStorage  {
    public QueueBasedOnArray() {
       }
    @Override
    public int get() {
        final int getValue = getValue(result);
        removeValue();
        return getValue;
    }

    private void removeValue() {
        for (int i = 0; i < count - 1; i++) {
            result[i] = result[i + 1];
        }
        count--;
    }





}