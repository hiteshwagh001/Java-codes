import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
    public static void main(String[] args)throws IOException {
        ServerSocket ss=new ServerSocket(1200);
        Socket s=ss.accept();
        System.out.println("connection established !");
        OutputStream os=s.getOutputStream();
        PrintStream ps=new PrintStream(os);
        ps.println("hello client");
        ps.println("go to hell");

        ps.close();
        s.close();
        ss.close();
    }
}
