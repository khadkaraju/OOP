import java.util.Random;
import java.util.Scanner;

class MyThread implements Runnable
{
    @Override
    public void run()
    {
        //generating random number
        Random rand = new Random();
        int randNum = rand.nextInt(9) + 1;
        try
        {
            Thread.currentThread();
            Thread.sleep(randNum * 1000);
            System.out.println("Thread " + Thread.currentThread().getId()+" slept for "+ randNum +" seconds");
        }catch (Exception e)
        {
            System.out.println (e.getMessage());
        }
    }
}
class sleepthread
{
    public static void main(String[] args)
    {
        int ThreadN;

        Scanner input = new Scanner(System.in); //Scanner to get the number of thread
        System.out.print("Kindly, Enter The Number Of Threads: ");
        ThreadN = input.nextInt();
        System.out.println("");
        for (int i=0; i<ThreadN; i++){
            Thread object = new Thread(new MyThread());
            object.start();
        }
        input.close();
    }
}