import java.io.*;
import java.net.*;

public class clientServer {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("Localhost", 1200);

        InputStream is=s.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String str;
        while((str =br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        s.close();
    }
}
