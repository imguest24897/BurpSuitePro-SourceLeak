package burp;

import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlda extends Zlde {
  public Zlda(SSLSocket paramSSLSocket) {
    super(paramSSLSocket);
  }
  
  public synchronized void close() throws IOException {
    try {
      super.close();
    } catch (SocketException socketException) {
      Zah.Zl(socketException, Zk_.IGNORED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlda.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */