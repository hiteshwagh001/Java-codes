import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class OpenWebsite {
    public static void main(String[] args)throws URISyntaxException,IOException {

        URI obj = new URI("https://www.youtube.com");
        Desktop desk = Desktop.getDesktop();
        desk.browse(obj);

    }
}
