
interface i1 {
    void name();

    void Location();
}

interface i2 {
    void Formation();

    void mascot();
}

interface i3 {
    void sign();

    void shouts();
}

interface i4 extends i1, i2, i3 {
    void fact1();

    void fact2();
}

class concrete implements i4 {

    // METHOD IMPLEMENTATIONS
    @Override
    public void name() {
        System.out.println("Texas Tech University");

    }

    @Override
    public void Location() {
        System.out.println("Located in: Lubbock, Texas");
    }

    @Override
    public void Formation() {
        System.out.println("Formed in 1923");
    }

    @Override
    public void mascot() {
        System.out.println("Red Raiders");

    }

    @Override
    public void sign() {
        System.out.println("Guns Up!!!");
    }

    @Override
    public void shouts() {
        char shouts[] = { 'R', 'A', 'I', 'D', 'E', 'R', 'S' };
        System.out.println("We are Red ");
        for (int it = 0; it < shouts.length; it++) {
            System.out.println(shouts[it]);
        }
    }

    @Override
    public void fact1() {
        System.out.println("Fearless Champion of Football Team");
    }

    @Override
    public void fact2() {
        System.out.println("Final-2018 NCAA");
    }

    // METHODS THAT TAKE INTERFACE AS ARGUMENT
    static void m1(i1 x) {
        x.name();
        x.Location();
    }

    static void m2(i2 x) {
        x.Formation();
        x.mascot();
    }

    static void m3(i3 x) {
        x.sign();
        x.shouts();
    }

    static void m4(i4 x) {
        x.fact1();
        x.fact2();
    }

}

class part5 extends concrete {
    public static void main(String[] args) {

        part5 a = new part5();
        m1(a);
        m2(a);
        m3(a);
        m4(a);

    }
}