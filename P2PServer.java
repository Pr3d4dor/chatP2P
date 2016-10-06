import java.net.InetAddress;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 * Created by Bine on 30/09/16.
 */
public class P2PServer extends Thread{
    private String ip;
    private List<Peer> peerList;
    private ServerSocket serverSocket;

    public P2PServer(int port) throws Exception {
        ip = InetAddress.getLocalHost().getHostAddress();
        serverSocket = new ServerSocket(port);
    }

    public void addPeer(Peer p) {
        peerList.add(p);
    }

    public void removePeer(Peer p) {
        peerList.remove(p);
    }

    @Override
    public void run() {
        for(;;) {
            try {
                Socket socket = serverSocket.accept();

            }
            catch (Exception e) {

            }
        }
    }

}
