
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

public class philop
{
    public static class chopsticks
    {
        Lock currentActive = new ReentrantLock();
        private final int philosopher_Name;

        public chopsticks(int phil_Name) {
            this.philosopher_Name = phil_Name;
        }

        public boolean selectActive(Philosopher ph, String loc) throws InterruptedException {
            if (currentActive.tryLock(10, TimeUnit.MILLISECONDS)) {
                System.out.println(ph + " is using " + loc + " " + this);
                return true;
            }
            return false;
        }

        public String toString() {

            String result = "Chopstick NO: " + philosopher_Name;
            return result;
        }

        public void notUsing(Philosopher ph, String identity) {
            currentActive.unlock();
            System.out.println(ph + " has kept down " + identity + " " + this);
        }

    }

    public static class Philosopher extends Thread {

        private final int phil_Name;
        volatile boolean isNotStarving = false;
        private final chopsticks leftchopsticks;
        private int turnNum = 0;
        private final chopsticks rightchopsticks;

        private Random generateRand = new Random();

        public Philosopher(int phil_Name, chopsticks leftchopsticks, chopsticks rightchopsticks) {
            this.phil_Name = phil_Name;
            this.leftchopsticks = leftchopsticks;
            this.rightchopsticks = rightchopsticks;
        }
        public void run()
        {
            try {
                while (!isNotStarving)
                {
                    waiting();

                    if (leftchopsticks.selectActive(this, "left")) {
                        if (rightchopsticks.selectActive(this, "right"))
                        {
                            eating();
                            rightchopsticks.notUsing(this, "right");
                        }

                        leftchopsticks.notUsing(this, "left");
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        public int getturnNum() {
            return turnNum;
        }
        public String toString() {
            return "Philosopher No " + phil_Name;
        }

        private void waiting() throws InterruptedException {
            System.out.println(this + " is waiting");
            Thread.sleep(generateRand.nextInt(1000));
        }

        private void eating() throws InterruptedException {
            System.out.println(this + " is eating");
            turnNum++;
            Thread.sleep(generateRand.nextInt(1000));
        }

    }

    private static final int size = 5;
    private static final int milisec = 1000 * 10;
    public static void main(String args[]) throws Exception {
        ExecutorService exe = null;
        Philosopher[] philosophers = null;
        try {

            philosophers = new Philosopher[size];

            chopsticks[] chopS = new chopsticks[size];

            for (int i = 0; i < size; i++) {
                chopS[i] = new chopsticks(i);
            }

            exe = Executors.newFixedThreadPool(size);

            for (int i = 0; i < size; i++) {
                philosophers[i] = new Philosopher(i, chopS[i], chopS[(i + 1) % size]);
                exe.execute(philosophers[i]);
            }

            Thread.sleep(milisec);

            for (Philosopher philosopher : philosophers) {
                philosopher.isNotStarving = true;
            }

        } finally {

            exe.shutdown();

            while (!exe.isTerminated()) {
                Thread.sleep(1000);
            }

            for (Philosopher obj : philosophers) {
                System.out.println(obj + " Total number of eating turns =" + obj.getturnNum());
            }
        }
    }
}