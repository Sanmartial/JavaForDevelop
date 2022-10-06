package structures;

public class StackBasedOnLinkedList implements DataStorage {
    private Item first;
    private Item last;

    protected int count;

    @Override
    public void add(final int value) {
        final Item item = new Item(value);
        if (first == null) first = last = item;
        else {
            addNextItem(item);
        }
        count++;
    }

    private void addNextItem(final Item item) {
        item.next = first;
        first = item;
    }

    @Override
    public int get() {
        if (count > 0){
            final int value = last.value;
            last = first.next;
            count--;
            if(count == 0){
                last = null;
            }
            return value;
        } else { return 0;}
    }

    @Override
    public int size() {
        return count;
    }

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
        protected int value;
        protected Item next;

        public Item(final int value) {
            this.value = value;
        }
    }


}
