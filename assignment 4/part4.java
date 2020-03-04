abstract class Base {
    Base() {
        System.out.println("Creates Object");

        print();
    }

    abstract void print();
}

class Derived extends Base {
    int i = 5;

    Derived(int i) {
        System.out.println("Printing Derived Method");
        this.i = i;
    }

    @Override
    void print() {
        System.out.println("The integer is: " + i);
    }
}

public class part4 {
    public static void main(String[] args) {
        Derived deliver = new Derived(10);
        deliver.print();
    }
}
