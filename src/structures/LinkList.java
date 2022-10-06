package structures;

public class LinkList extends BasaDataStructure {
    private Item first;
    private Item last;

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
    public int[] toArray() {
        final int[] array = new int[count];
        int i = 0;
        Item current = first;
        while (current != null) {
            array[i++] = current.value;
            current = current.next;
        }
        return array;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        Item current = first;
        while (current != null) {
            sb.append(current.value);
            current = current.next;
            if (current != null) sb.append(", ");
        }
        sb.append("]");
        return sb.substring(0);
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        count = 0;
    }

    public boolean remove(final int value) {
        final Pair pair = findPair(value);
        if (pair != null) {
            if (pair.current == first && pair.current == last) {
                first = null;
                last = null;
                count--;
            } else if (pair.current == first) {
                first = pair.current.next;
                count--;
            } else {
                pair.previous.next = pair.current.next;
                if (pair.current == last) {
                    last = pair.previous;
                }
                count--;
            }
            return true;
        }

        return false;
    }

    private Pair findPair(final int value) {
        Item previous = first;
        Item current = first;

        while (current != null) {
            if (current.value == value) {
                return new Pair(previous, current);
            } else {
                previous = current;
                current = current.next;
            }
        }
        return null;
    }

    public boolean contains(final int value) {

        return findPair(value) != null;
    }

    private static class Item {
        private int value;
        private Item next;

        Item(final int value) {
            this.value = value;
        }
    }

    private static class Pair {
        private Item previous;
        private Item current;

        public Pair(final Item previous, final Item current) {
            this.previous = previous;
            this.current = current;
        }
    }
}

