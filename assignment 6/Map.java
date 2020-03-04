/*
Raju Khadka
Homework 6
 part2
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Map
{
    public static HashMap<String, Integer> Wordcount(String fileName) throws Exception {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        BufferedReader W_buffer = new BufferedReader(new FileReader(fileName));
        String line = W_buffer.readLine();
        while (line != null)
        {
            String character[] = line.split(" ");
            for (String C : character)
            {
                int count = 1;

                if (map.containsKey(C))  //adding to counter
                {
                    count = map.get(C) + 1;
                }
                map.put(C, count);
            }
            line = W_buffer.readLine();
        }
        W_buffer.close();
        return map;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println(Wordcount("input.txt"));
    }
}