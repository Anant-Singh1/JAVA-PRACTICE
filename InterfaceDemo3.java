interface I1 {
    void show();// ofcourse its a abstract method....

    // default method

    default void print() {
        System.out.println("Its a default method inside Interface I1");
    }

    static void display() {
        System.out.println("Its a static method inside Interface I1");
    }
}

interface I2 {
    // abiguity problem
    default void print() {
        System.out.println("Its a default method inside Interface I2");
    }
}

// Rise in the ambiguity problem-->solving problem
class demo implements I1, I2 {
    /*
     * Error gone but let say we want to use parent default methods-->we write
     * super.....->but to whom it will go if there are more than one parent
     * Check it below
     */
    @Override
    public void print() {
        I1.super.print();
        I2.super.print();
        System.out.println("Ovveriding default method");
    }
    // only need to override abstract method...

    @Override
    public void show() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'show'");
    }

}

public class InterfaceDemo3 {
    public static void main(String[] args) {
        // To access static method display
        I1.display();
        demo obj = new demo();
        obj.show();
        obj.print();

    }
}
