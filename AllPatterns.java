public class AllPatterns {
    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println("===========================================================");

    final int upto=5;
        for (int i = 1; i <= upto; i++) {
            for (int spaces = upto-i-1;spaces>=0; spaces--) 
            System.out.print(" ");
            for(int j = 1; j <=i; j++) 
            System.out.print("*");
            System.out.println();
        }

    System.out.println("===========================================================");

    // final int upto=5;
    for (int i = 1; i <=upto; i++) {
        for (int space = 1; space < i ;space++) {
            System.out.print(" ");
        }
        for (int j = 0; j <= upto-i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println("===========================================================");

//     final int upto=5;
    for (int i = 1; i <=upto+1; i++) {
        if(i<=upto){
        for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }}
    else{
        for (int k = 1; k <= upto-1; k++) {
            for (int j = 1; j < upto-k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         
    }
    System.out.println();
}

System.out.println("===========================================================");


    // final int upto=5;
    for (int i = 1; i <=upto*2-1; i++) {
        if(i<=upto){
            for (int j = 0; j <=upto-i; j++) {
                System.out.print("*");
            }
        }
        else{
            for (int j = upto; j<=i; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    System.out.println("===========================================================");

    //  final int upto=5;
     for (int i = 1; i <=upto*2-1; i++) {
        if(i<=upto){
            for (int spaces = 1; spaces <= upto-i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        }
        else{
           for (int spaces= upto; spaces<=i-1; spaces++) {
            System.out.print(" ");
           }
           for (int j = 1; j <= upto*2-i; j++) {
            System.out.print("*");
           }
        }
        System.out.println();
     }
    System.out.println("===========================================================");


// final int upto=5;
// for (int i = 1; i <=upto; i++) {
//     for (int j = 1; j <= upto-1; j++) {
         
//     }
// }
    }
}
