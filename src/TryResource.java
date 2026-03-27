import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class TryResource {
    public static void main(String[] args){

        try(BufferedReader br = new BufferedReader( new FileReader("Info.txt"))){
            String readLineFirst = br.readLine();

            while ((readLineFirst = br.readLine()) != null) {
                System.out.println(readLineFirst);
            }
        }
 catch(IOException e) {
            System.out.println("Error reading file ");
 }
    }
}
