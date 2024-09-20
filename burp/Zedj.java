package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zedj implements Zrk9 {
  private final Zsz6 ZB;
  
  private final Zxxr ZD;
  
  private final Zmzk Zr;
  
  private final Zrgd ZM;
  
  private final Zsxe Zc;
  
  private final Zr5i ZH;
  
  public Zedj(String paramString, int paramInt, Zxxr paramZxxr, Zmzk paramZmzk1, Zrgd paramZrgd, Zsxe paramZsxe, Zxk1 paramZxk1, Zmzk paramZmzk2, Zsfe paramZsfe) {
    this.ZD = paramZxxr;
    this.Zr = paramZmzk1;
    this.ZM = paramZrgd;
    this.Zc = paramZsxe;
    this.ZH = new Zr5i(paramZxk1, paramZmzk1, paramZmzk2, paramZsfe);
    this.ZB = new Zre9(paramString, paramInt);
  }
  
  public SSLSocket Zt(Zbzu paramZbzu, Zrps paramZrps) throws IOException, Zr9q, Zry8 {
    Socket socket = this.ZD.ZK(this.Zr, paramZrps);
    OutputStream outputStream = socket.getOutputStream();
    byte[] arrayOfByte = this.ZB.Zn();
    outputStream.write(arrayOfByte);
    Zlo7 zlo7 = new Zlo7(socket, this.Zc, this.ZM);
    try {
      zlo7.Zm(Zxfj.ZI);
    } catch (Zgsm zgsm) {
      Zah.Zl(zgsm, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zr9q(this.Zr);
    } 
    return this.ZH.ZL(paramZbzu, zlo7, socket);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */