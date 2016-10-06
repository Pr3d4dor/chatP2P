import java.net.InetAddress;

/**
 * Created by Bine on 30/09/16.
 */
public class Peer {
    private String ip;

    public Peer() throws Exception {
        ip = InetAddress.getLocalHost().getHostAddress();
    }

}
