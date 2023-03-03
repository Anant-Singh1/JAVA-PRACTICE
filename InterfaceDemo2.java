interface A {
    int MAX = 100;

    void show();
}

interface B {
    int MAX = 200;

    void show();
}

interface D extends A, B {
    void display();

}

class C implements D {

    @Override
    public void show() {
        // TODO Auto-generated method stub
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
    }

}

/*
 * A class can implement more than 2 interface...
 * No show method will conflict beacuse they both are empty
 */
/*
 * class C implements A, B {
 * 
 * @Override
 * public void show() {
 * // TODO Auto-generated method stub
 * System.out.println("Class C show method overriding A,B methods");
 * System.out.println(A.MAX);
 * System.out.println(B.MAX);
 * 
 * }
 * 
 * }
 */

public class InterfaceDemo2 {
    public static void main(String[] args) {
        C ob = new C();
        ob.show();
        // But lets say we do upcasting.....
        // A obj = new C();
    }
}
