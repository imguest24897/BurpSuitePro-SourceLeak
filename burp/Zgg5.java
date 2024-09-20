package burp;

import java.io.IOException;
import java.net.Socket;

class Zgg5 implements Zea5 {
  private final Zz0s ZD;
  
  private final Zg6h Zk;
  
  Zgg5(Zz0s paramZz0s, Zg6h paramZg6h) {
    this.ZD = paramZz0s;
    this.Zk = paramZg6h;
  }
  
  public Zlvr Zw(Zmzk paramZmzk) throws IOException {
    Socket socket = this.ZD.Zf(paramZmzk);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (socket == null) ? null : new Zb43(socket, paramZmzk, this.Zk.Zt());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgg5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */