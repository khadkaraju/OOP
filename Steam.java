class root {
    root() {
        System.out.println("This is Root Class");
        new component1();
        new component2();
        new component3();
    }
}

class component1 {
    component1() {
        System.out.println(" This is class component1");
    }
}

class component2 {
    component2() {
        System.out.println("This is class component2");
    }
}

class component3 {
    component3()

    {
        System.out.println("This is class component3");
    }
}

class Steam extends root {
    public static void main(String[] args) {
        new root();
    }
}
