/* 
 *Both are referenece pointers...stores addressor reference
 *Also both of them are keywords
 *This-->points to the current object...made to store the address of current class object
 *Super-->points to the parent...contains the address of parent class object 
*/
class AClass {
    int x;

    AClass() {
        x = 10;
        System.out.println("Default constructor of class A");
    }

    AClass(int x) {
        // x = 10;
        this.x = x;
        System.out.println("Param.. constructor of class A");
    }

}

class BClass extends AClass {
    int x;

    BClass() {
        // super();Implicit constructor
        x = super.x + 20;
        System.out.println("Default constructor of class B");
    }

    BClass(int x) {
        // super();Implicit constructor
        super(x);
        this.x = super.x + 20;
        System.out.println("Param.. constructor of class B");
    }

    void show() {
        System.out.println("X of Bclass is->" + this.x);
        System.out.println("X of Aclass is->" + super.x);

    }
}

public class SuperVsThis {
    public static void main(String[] args) {
        BClass obj = new BClass();
        obj.show();
    }
}
