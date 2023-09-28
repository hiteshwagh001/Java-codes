import java.io.*;
import java.net.*;
import java.util.*;

public class program4 {
    public static void main(String[] args)throws IOException,MalformedURLException {
        URL obj = new URL("https://www.youtube.com");
        URLConnection conn=obj.openConnection();
        System.out.println("last modified : "+new Date(conn.getLastModified()));
    }
}
