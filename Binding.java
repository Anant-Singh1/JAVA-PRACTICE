class P1 {
    int x;

    P1() {
        x = 10;
    }

    void show() {
        System.out.println("Its a P1 class");
    }
}

class C1 extends P1 {
    int x;

    C1() {
        x = 20;
    }

    @Override
    void show() {
        System.out.println("its a C1 class");
    }
}

public class Binding {
    public static void main(String[] args) {
        P1 ob = new C1();// upcasting
        ob.show();// will call child method...will check object of what type
        System.out.println(ob.x);// but here parent varible will be showed ie of P1 type
    }
}
