/*
Raju Khadka
Homework 6
 part1
*/
import java.util.*;

public class List
{
    public static void main(String[] args)
    {
    ArrayList<String> arraylistobj = new ArrayList<String>();
        arraylistobj.add("Texas");
        arraylistobj.add("New York");
        arraylistobj.add("California");
        arraylistobj.add("Virginia");
        arraylistobj.add("Florida");
        arraylistobj.add("Nevada");
        arraylistobj.add("Kentucky");
        arraylistobj.add("Colorado");
        arraylistobj.add("Oregon");
        arraylistobj.add("Illinois");

        System.out.println("\nFor ArrayList\n\nOriginal List: \n"+arraylistobj);

        Collections.sort(arraylistobj);
        System.out.println("\nSorted List: \n"+arraylistobj);

        Collections.shuffle(arraylistobj);
        System.out.println("\nShuffled List: \n"+arraylistobj);

        LinkedList<String> Linkedlistobj = new LinkedList<String>();
        Linkedlistobj.add("Texas");
        Linkedlistobj.add("New York");
        Linkedlistobj.add("California");
        Linkedlistobj.add("Virginia");
        Linkedlistobj.add("Florida");
        Linkedlistobj.add("Nevada");
        Linkedlistobj.add("Kentucky");
        Linkedlistobj.add("Colorado");
        Linkedlistobj.add("Oregon");
        Linkedlistobj.add("Illinois");

        System.out.println("\nFor LinkedList\n\nOriginal List: \n"+Linkedlistobj);

        Collections.sort(Linkedlistobj);
        System.out.println("\nSorted List: \n"+Linkedlistobj);

        Collections.shuffle(Linkedlistobj);
        System.out.println("\nShuffled List: \n"+Linkedlistobj);

    }


}
