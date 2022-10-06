public class SimpleTest {
    public static void main(final String[] args) {
        final Child child = new Child();
        child.doSomething();
        child.doItDo();
        child.doSomethingGrand();
        child.onlyChild();
    }
}

class Parent extends GrandParent{
    void doSomething(){
        System.out.println("Parent.doSomething()");
    }
    protected void doItDo(){
        System.out.println("Parent.doItDo");
    }

}
class Child extends Parent{
    @Override
    void doSomething() {
        System.out.println("Child.doSomething");
    }
    void doSomethingGrand(){
        System.out.println("Child.Something2");
    }
    void onlyChild(){
        System.out.println("Child.Only");
    }
}

class GrandParent {
    void doSomethingGrand(){
        System.out.println("GrandParent.SomethingGrand");
    };
}