
import java.util.*;

class tunnel extends Thread {
    String name;

    public void run() {
        try {
            Thread.sleep(5000);
            cross();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }
    }
    public void cross() {
        System.out.println("The Person crossing tunnel is : "+name);
    }

    tunnel(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String[] names = { "Aalu", "Bhalu", "Cali", "Will", "Mars", "Raju", "Gede", "Gule", "Robot",
                "Chris" };
        ArrayList<String> names1 = new ArrayList<String>(10);
        ArrayList<tunnel> objects = new ArrayList<tunnel>();
        for (int i = 0; i < 10; i++) {
            names1.add(names[i]);
        }
        Collections.sort(names1);
        for (int i = 0, j = 10; i < 10 && j > 0; i++, j--) {
            objects.add(new tunnel(names1.get(i)));
            objects.get(i).setPriority(j);
        }
        for (int i = 0; i < 10; i++) {
            objects.get(i).start();
            try {
                objects.get(i).join();
            } catch (InterruptedException e) {
                System.out.println("Awful!!!");
            }
        }
    }
}
