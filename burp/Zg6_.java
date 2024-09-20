package burp;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zg6_ implements Zenv {
  private final Zmzk Zc;
  
  private final Zmzk Zy;
  
  private final Zeb6 ZL;
  
  private final Zl1v ZK;
  
  public Zg6_(Zmzk paramZmzk1, Zmzk paramZmzk2, Zeb6 paramZeb6, Zl1v paramZl1v) {
    this.Zc = paramZmzk1;
    this.Zy = paramZmzk2;
    this.ZL = paramZeb6;
    this.ZK = paramZl1v;
  }
  
  public Socket Zc() throws IOException, Zryo, Zxt3, Zr92 {
    try {
      SSLSocket sSLSocket = this.ZL.ZW();
      sSLSocket.setKeepAlive(true);
      sSLSocket.setSoTimeout(120000);
      this.ZK.Zf(sSLSocket);
      return sSLSocket;
    } catch (ConnectException connectException) {
      try {
        Zah.Zl(connectException, Zk_.COMMON_RUNTIME_FAILURE);
        if (this.Zy.equals(this.Zc))
          throw new Zr9h(this.Zc); 
      } catch (ConnectException connectException1) {
        throw a(null);
      } 
      throw new Zr9q(this.Zy);
    } 
  }
  
  private static ConnectException a(ConnectException paramConnectException) {
    return paramConnectException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg6_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */