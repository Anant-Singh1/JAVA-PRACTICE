class A {
    int x, y;

    A() {
        x = 10;
        y = 20;
        System.out.println("Its A default constructor");
    }

    A(int x) {
        this();
        this.x = x;
        y = 100;
        System.out.println("Its A parameterized consstructor");
    }
}

class B extends A {
    int z;

    B() {
        // Implicit Super Call--not neccesary to write super
        super(10);
        z = x + y;
        System.out.println("Its B default constructor....will also call A default constructor...-:" + z);
    }

    B(int a) {
        this();// callling our default constructor..
        // super(a * 2);// passing agrgument to parameterized constructor B
        z = a + x + y;
        System.out.println("Its B parameterized constructor-:" + z);
    }
}

public class IS_ADemo1 {
    public static void main(String[] args) {
        new B(100);
        // but lets say we want to call all constructor but only with one call....
    }

}
