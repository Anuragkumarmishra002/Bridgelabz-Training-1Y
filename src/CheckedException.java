import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CheckedException {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String Readline;
            while ((Readline = br.readLine()) != null) {
                System.out.println(Readline);
            }
            br.close();
        } catch (IOException e)  {
            System.out.println("File not found");
        }
    }
}