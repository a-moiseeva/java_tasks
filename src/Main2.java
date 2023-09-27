import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        String string1 = "hi";


        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\alexa\\Downloads\\test.txt")))  {
            string1 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(string1);
        String[] parts = string1.split(" ");
        int a=Integer.parseInt(parts[0]);
        int b=Integer.parseInt(parts[1]);
       // System.out.println(a+b);
        int s= a+b;
        String answer= String.valueOf(s);

        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            writer.write(answer);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


    }
}