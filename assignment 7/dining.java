import java.util.*;
public class dining
{
    public static void main(String[] args)
    {
        int rnd=10;
        hist.msg(String.valueOf(rnd));
        Chopstick[] cpstk = new Chopstick[5];

        for(int i=0; i< cpstk.length; i++){
            cpstk[i] = new Chopstick("C: "+i);
        }
        Philosopher[] philosophers = new Philosopher[5];

        philosophers[0] = new Philosopher("P: 0 - ", cpstk[0], cpstk[1], rnd);
        philosophers[1] = new Philosopher("P: 1 - ", cpstk[1], cpstk[2], rnd);
        philosophers[2] = new Philosopher("P: 2 - ", cpstk[2], cpstk[3], rnd);
        philosophers[3] = new Philosopher("P: 3 - ", cpstk[3], cpstk[4], rnd);
        philosophers[4] = new Philosopher("P: 4 - ", cpstk[0], cpstk[4], rnd);

        for(int i=0;i<philosophers.length;i++){
            hist.msg("Thread "+ i + " has started");
            Thread t= new Thread( philosophers[i]);
            t.start();
        }
    }
}

class Philosopher extends Thread
{
    private Chopstick _leftChopistick;
    private Chopstick _rightChopistick;
    private String _name;
    private int _state;
    private int _rounds;

    public Philosopher ( String name, Chopstick _left, Chopstick _right, int rnds){
        this._state = 1;
        this._name = name;
        _leftChopistick = _left;
        _rightChopistick = _right;
        _rounds = rnds;
    }

    public void eating()
    {
        if(! _leftChopistick.used){
            if(!_rightChopistick.used){
                _leftChopistick.take();
                _rightChopistick.take();
                hist.msg(_name + " : Eat");
                hist.Delay(1000);
                _rightChopistick.release();
                _leftChopistick.release();
            }
        }
        thinking();
    }
    public void thinking()
    {
        this._state = 1;
        hist.msg(_name + " : Think");
        hist.Delay(1000);

    }
    public void run(){
        for(int i=0; i<=_rounds; i++){
            eating();
        }
    }
}
class hist
{

    public static void msg(String msg){
        System.out.println(msg);
    }
    public static void Delay(int ms){
        try{
            Thread.sleep(ms);
        }
        catch(InterruptedException ex){ }
    }
}
class Chopstick{
    public boolean used;
    public String _name;
    public Chopstick(String _name){
        this._name = _name;
    }
    public synchronized void take() {
        hist.msg ("Used :: " + _name );
        this.used = true;
    }
    public synchronized void release() {
        hist.msg ("Released :: " + _name );
        this.used = false ;
    }
}