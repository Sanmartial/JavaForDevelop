import structures.BasaDataStructure;
import structures.DynaArray;
import structures.LinkList;

import java.util.ArrayList;
import java.util.List;

public class LinkedTest  {
    public static void main(final String[] args) {
        final LinkList secondList = new LinkList();
       secondList.add(new int[]{4, 5, 6});

        final LinkList list = new LinkList();
        list.add(new int[]{1, 2, 3});
        list.add(secondList);
        list.add(4);

        System.out.println(list);

        System.out.println(list.size());

       final DynaArray dynaArray = new DynaArray();

        dynaArray.add(5);
        dynaArray.add(1);
        dynaArray.add(-9);
        dynaArray.add(55);

        System.out.println(dynaArray.contains(-9));

        final List<String> list1 = new ArrayList<>();
    }}



