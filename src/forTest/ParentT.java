package forTest;

public class ParentT {
    void methodParent (){
        System.out.println("methodParent" + " " + getClass().getSimpleName());
    }

    void methodParent2(){
        System.out.println("methodParent #2" + " " + getClass().getSimpleName());
    }
}

class ChildT extends ParentT{
    void methodChild(){
        System.out.println("methodChild" + " " + getClass().getSimpleName());
    }

    @Override
    void methodParent() {
        System.out.println("method from Parent Override" + " " + getClass().getSimpleName());
    }
}
