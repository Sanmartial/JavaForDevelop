package structures;

public abstract interface DataStructure {
    void clear();

    void add(int value);

    void add(DynaArray dynaArray);

    void add(int[] array);

    void add(LinkList list);

    int[] toArray();

    boolean remove(int value);

    boolean contains(int value);
}
