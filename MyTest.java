/*
Raju Khadka
Homework 6
 part3
*/

class MyException extends Exception
{
    private static final long serialVersionUID = 1L;
    private String msg;

    public MyException(String message)
    {
        super(message);
        msg = message;
    }

    public void display()
    {
        System.out.println(msg);
    }
    public String toString()
    {
        return "Error in Code: "+msg;
    }
}
class MyTest
{
    public void bad() throws MyException
    {
        throw new MyException(toString());
    }

    public static void main(String[] args)
    {
        try
        {
            new MyTest().bad();
        }
        catch (MyException e)
        {
            e.display();
        }
    }
}