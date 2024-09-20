package burp;

import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmed implements Zxw0 {
  private final Zl2x ZE;
  
  private final String[] ZX;
  
  private final String[] Zx;
  
  public Zmed(Zl2x paramZl2x, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    this.ZE = paramZl2x;
    this.ZX = Zt5y.ZX(paramArrayOfString1);
    this.Zx = Zm8h.ZW(paramArrayOfString2);
  }
  
  public SSLSocket ZL() throws IOException, Zryo, Zr9q, Zxt3 {
    try {
      return this.ZE.ZK(Zbzu.BOUNCY_CASTLE, this.ZX, this.Zx);
    } catch (SocketException|org.bouncycastle.tls.TlsException socketException) {
      Zah.Zl(socketException, Zk_.RETHROWN);
      throw new SSLException(socketException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */