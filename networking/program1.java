import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

class IPAdress{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String site=br.readLine();
        InetAddress ip=InetAddress.getByName(site);
        System.out.println("Ip address : "+ip);
    }
}