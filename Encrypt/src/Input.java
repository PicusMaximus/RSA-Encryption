import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    int read(String msg){

        System.out.println(msg);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            int i = Integer.parseInt(s);
            return i;
        }catch (IOException e){
            return 0;
        }

    }
}
