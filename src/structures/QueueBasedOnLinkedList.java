package structures;

import java.util.Arrays;

public class QueueBasedOnLinkedList implements DataStorage {
    private Item first;
    private Item last;
    protected int count;

    @Override
    public void add(final int value) {
        final Item item = new Item(value);
        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
        count++;
    }

    @Override
    public int get() {
        final Item current = first;
        final int value = getValue();
        if (current != null)
            first = current.next;
        else {
            first = null;
            last = null;
        }
        count--;
        return value;
    }

    private int getValue() {
        final Item current = first;
        if (current != null) return first.value;
        else return 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int[] toArray() {
        final int[] newArray = new int[count];
        int i = 0;
        Item current = first;
        while (current != null) {
            newArray[i++] = current.value;
            current = current.next;
        }
        return newArray;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[ ");
        Item current = first;
        while (current != null) {
            sb.append(current.value);
            current = current.next;
            if (current != null) sb.append(", ");
        }
        sb.append("]");

        return sb.substring(0);
    }

    private static class Item {
        private int value;
        private Item next;

        Item(final int value) {
            this.value = value;
        }
    }
}

