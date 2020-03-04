
/*
Raju Khadka
Homework 6
part 4
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class file {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter the filename: ");
            String fileName = scan.nextLine();
            try (FileReader reader = new FileReader(fileName);
                 BufferedReader buffer = new BufferedReader(reader))
            {
                String L;
                while ((L = buffer.readLine()) != null)
                {
                    System.out.println(L);

                }
                break;
            }
            catch (IOException e)
            {
                System.out.println("Error!!!, Please Write The Filename Correctly");
            }
        }
    }
}