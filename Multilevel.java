class P {
    int x;

    P() {
        x = 1;
    }
}

class Q extends P {
    int x;

    Q() {
        x = 2;
    }
}

class R extends Q {
    int x;

    R(int x) {
        this.x = x + 10;
        // Local x..
        int z = x + this.x + super.x + ((P) this).x;
        System.out.println(z);
        // super.x==((Q)this).x...
    }
}

public class Multilevel {
    public static void main(String[] args) {
        new R(2);
    }
}
