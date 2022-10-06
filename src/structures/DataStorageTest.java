package structures;

import java.util.Arrays;

public class DataStorageTest {
    public static void main(final String[] args) {
        final DataStorage dataStorage1 = new StackBasedOnLinkedList();

        dataStorage1.add(25);
        for (int i = 0; i < 3; i++) {

            dataStorage1.add(i);
        }

        System.out.println(dataStorage1);

        while (dataStorage1.size() > 0) {
            System.out.print(dataStorage1.get() + ", ");

        }


        System.out.println("the end!");
    }
}
