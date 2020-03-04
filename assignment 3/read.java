import java.io.*;


public class read{
    public static void main(String[] args) {
    
    FileReader file =new Filereader("D:/Fall 19/OOP/Homework/HW3/textfile.txt");
    BufferReader reader =new BufferReader(file);

    String text="";
    String line= reader.readLine();

    while (line != null)
    {
        text += line;
        line = reader.readLine();
    }
    
System.out.println(text);

    }




}