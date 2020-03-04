public abstract class Rodent {
    abstract void eat();
}

// create hierarchy
class Mouse extends Rodent {
    void eat() {
        System.out.println("This is Mouse");
    }
}

class Gerbil extends Rodent {
    void eat() {
        System.out.println("This is Gerbil");
    }
}

class Hamster extends Rodent {
    void eat() {
        System.out.println("This is Hamster");
    }
}

// main class
class MainClass {
    public static void main(String[] args) {
        // create array of Rodent objects
        Mouse R1 = new Mouse();
        Gerbil R2 = new Gerbil();
        Hamster R3 = new Hamster();
        Rodent[] array = { R1, R2, R3 };
        // call eat() method
        for (Rodent rodent : array)
            rodent.eat();
    }
}