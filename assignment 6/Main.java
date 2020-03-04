/*
Raju Khadka
Homework 6
 part5
*/
class givenException extends Exception
 {
    public givenException()
    {
        super();
    }
 }
class CustomRuntimeException extends RuntimeException
 {
    private static final long serialVersionUID = 1L;
    public CustomRuntimeException()
    {
        super();
    }
 }
class Top
 {
    public void g() throws givenException
    {
        throw new givenException();
    }
    public void f()
    {
        try
        {
            g();
        } catch (givenException e)
        {
            throw new CustomRuntimeException();
        }
    }
 }

public class Main
{
    public static void main(String[] args)
    {
        Top obj = new Top();

        obj.f();
    }
}