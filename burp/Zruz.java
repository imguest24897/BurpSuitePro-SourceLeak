package burp;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zruz implements Zenv {
  private final Zmzk ZF;
  
  private final Zmzk Zw;
  
  private final Zxxr ZQ;
  
  private final Zrps Zl;
  
  public Zruz(Zmzk paramZmzk1, Zmzk paramZmzk2, Zxxr paramZxxr, Zrps paramZrps) {
    this.ZF = paramZmzk1;
    this.Zw = paramZmzk2;
    this.ZQ = paramZxxr;
    this.Zl = paramZrps;
  }
  
  public Socket Zc() throws IOException, Zr92 {
    try {
      Socket socket = this.ZQ.ZK(this.Zw, this.Zl);
      socket.setKeepAlive(true);
      socket.setSoTimeout(120000);
      return socket;
    } catch (UnknownHostException unknownHostException) {
      try {
        Zah.Zl(unknownHostException, Zk_.RETHROWN);
        if (this.Zw.equals(this.ZF))
          throw unknownHostException; 
      } catch (UnknownHostException unknownHostException1) {
        throw a(null);
      } 
      throw new Ztp7(unknownHostException);
    } catch (ConnectException connectException) {
      try {
        Zah.Zl(connectException, Zk_.COMMON_RUNTIME_FAILURE);
        if (this.Zw.equals(this.ZF))
          throw new Zr9h(this.ZF); 
      } catch (UnknownHostException unknownHostException) {
        throw a(null);
      } 
      throw new Zr9q(this.Zw);
    } 
  }
  
  private static UnknownHostException a(UnknownHostException paramUnknownHostException) {
    return paramUnknownHostException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zruz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */