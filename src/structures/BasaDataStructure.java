package structures;

public abstract class BasaDataStructure implements DataStructure{
    protected int count;

    public int size() {
        return count;
    }
    public void clear() {
        count = 0;
    }
    public void add(final DynaArray dynaArray) {

        for (int i = 0; i < dynaArray.size(); i++) {
            add(dynaArray.toArray()[i]);
        }
    }
    public void add(final int[] array) {

        for (final int j : array) {
            add(j);
        }
    }

    public void add(final LinkList list) {
        add(list.toArray());
    }
}


