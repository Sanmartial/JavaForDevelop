package structures;

import java.util.Arrays;

public class DynaArray extends BasaDataStructure {
    private int[] result;
    public DynaArray() {
        this(5);
    }
    public DynaArray(final int size) {
        result = new int[size];
    }
    public void add(final int value) {
        if (count == result.length) {
            final int[] newArray = new int[result.length * 2];
            System.arraycopy(result, 0, newArray, 0, result.length);
            result = newArray;
        }
        if (count == 0) {
            result = new int[1];
        }
        result[count++] = value;
    }
    @Override
    public void add(final int[] array) {
        result = Arrays.copyOf(result, count);
        setResult(addArrays(result, array));
        setCount(getResult().length);
    }
    @Override
    public void add(final DynaArray dynaArray) {
        result = Arrays.copyOf(result, count);
        dynaArray.setResult(Arrays.copyOf(dynaArray.getResult(), dynaArray.getCount()));
        setResult(addArrays(result, dynaArray.getResult()));
        setCount(getResult().length);
    }

     private int[] addArrays(final int[] arr1, final int[] arr2) {
        final int[] arrPlus = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arrPlus, 0, arr1.length);
        System.arraycopy(arr2, 0, arrPlus, arr1.length, arr2.length);
        return arrPlus;
    }

    public int[] toArray() {
        return Arrays.copyOf(result, count);
    }

    public String toString() {
        return Arrays.toString(toArray());
    }



    public int[] getResult() {
        return result;
    }

    public void setResult(final int[] result) {
        this.result = result;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public boolean remove(final int value) {
        final int index = indexOf(value);
        if (index != -1) {
            removeByIndex(index);
            return true;
        } else
            return false;
    }

    @Override
    public boolean contains(final int value) {
        return indexOf(value) != -1;
    }

    private void removeByIndex(final int index) {
        if (index < count - 1) {
            for (int i = index; i < count - 1; i++) {
                result[i] = result[i + 1];
            }
        }
        count--;
    }

    private int indexOf(final int value) {
        for (int i = 0; i < count; i++) {
            if (result[i] == value) {
                return i;
            }
        }
        return -1;
    }

}


