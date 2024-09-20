package burp;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

public interface Zqr {
  Socket ZX() throws IOException;
  
  static Zqr ZX(Zz95 paramZz95, Zrps paramZrps, Zxtv paramZxtv, Zzen paramZzen, Zmzk paramZmzk, Zthe paramZthe) {
    Zenv zenv = paramZz95.ZM(paramZmzk, paramZrps, paramZxtv, paramZzen::lambda$from$0);
    return new Zmnl(zenv, paramZzen, paramZmzk, paramZthe);
  }
  
  private static void lambda$from$0(Zzen paramZzen, SSLSocket paramSSLSocket) {
    paramZzen.ZM(paramSSLSocket.getSession());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zqr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */