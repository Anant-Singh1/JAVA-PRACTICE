/* 
 * Implementing Interface
 */
// To make it a SAM interface use
@FunctionalInterface
interface CalculatorInterface {

    int compute(int x, int y);
}

/*
 * 1st way->Define a named class and implemnt a interface...
 * best when we have call it multiple number of times
 */
class Calculator1 implements CalculatorInterface {

    @Override
    public int compute(int x, int y) {
        // TODO Auto-generated method stub
        return x + y;
    }

}

public class InterfaceDemo4 {
    public static void main(String[] args) {
        /*
         * 2nd way-->Just during object creation we want a class to be created not like
         * way 1
         * Anonymous class->class being created one time use only..unamed class
         */
        if (true) {
            /*
             * This class is being made at compile time...but being introduced in runtime
             * On Compilation it will make byte file of InterfaceDemo4$1.class...to avoid it
             * use 3rd way..but one liner code...used for SAM imterface...ie it have one
             * method only
             */
            // CalculatorInterface cal2 = new CalculatorInterface() {// type of
            // upcasting....not fully
            // // This is considered as a class
            // @Override
            // public int compute(int x, int y) {
            // show();
            // return x * y;
            // }

            // void show() {
            // System.out.println(
            // "Show() method of Anonymous class...Althout it cannot be called because of
            // upcasting");
            // }

            // };
            // cal2.compute(10, 10);
            // cal2.show();
        }

        // 3rd way-->lamda expression.. need to be SAM Interface->single abstracted
        // method..no calss created at compile time so no $
        CalculatorInterface cal3 = (x, y) -> x * y;
        System.out.println(cal3.compute(20, 20));

        Calculator1 cal1 = new Calculator1();
        System.out.println(cal1.compute(10, 20));
    }
}
