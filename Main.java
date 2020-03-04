class cycle{
    private int wheels;
    
    public int wheels()
    {
     
        return wheels;
    }
    
    public void ride(cycle C)
    {
        int N;
        N= C.wheels();
        System.out.println("The number of wheels are: "+N);
    }
    }
    
    class Unicycle extends cycle
    {
        public int wheels()
        {
        return 1;
        }
    }
    class Bicycle extends cycle
    {
        public int wheels()
        {
        return 2;
        }
    }
    class Tricycle extends cycle
    {
        public int wheels()
        {
        return 3;
        }
    }
    public class Main
    {
        public static void main(String[] args) 
        {
        
        cycle C=new cycle();
        Unicycle c1=new Unicycle();
        Bicycle c2= new Bicycle();
        Tricycle c3=new Tricycle();
    
        C.ride(C);
        c1.ride(c1);
        c2.ride(c2);
        c3.ride(c3);
        }
    
    }