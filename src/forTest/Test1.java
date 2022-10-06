package forTest;

public class Test1 {
    public static void main(final String[] args) {
        final ParentT parentT = new ParentT();
        final ParentT child = new ChildT();
        final ChildT childT = new ChildT();


        System.out.println("______________ Parent ____________________");
        parentT.methodParent();
        parentT.methodParent2();
        System.out.println("______________ Child ____________________");
        child.methodParent();
        child.methodParent2();
        System.out.println("______________ ChildT ____________________");

        childT.methodChild();
        childT.methodParent();
        childT.methodParent2();
    }
}
