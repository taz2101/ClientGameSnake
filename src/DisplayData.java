import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisplayData implements Runnable {
    @Override
    public void run() {
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(Main.s.getInputStream()));
            System.out.println(bf.readLine());
        }
        catch (IOException e){

        }
    }
}
