package burp;

import java.io.IOException;
import javax.net.ssl.SSLSocket;

class Zm8c implements Zl2x {
  private final Zmzk Zi;
  
  private final Zl2x ZB;
  
  private final Ztno ZO;
  
  private final Zbii Zv;
  
  Zm8c(Zmzk paramZmzk, Zl2x paramZl2x, Ztno paramZtno, Zbii paramZbii) {
    this.Zi = paramZmzk;
    this.ZB = paramZl2x;
    this.ZO = paramZtno;
    this.Zv = paramZbii;
  }
  
  public SSLSocket ZK(Zbzu paramZbzu, String[] paramArrayOfString1, String[] paramArrayOfString2) throws IOException, Zryo, Zr9q, Zxt3 {
    SSLSocket sSLSocket = this.ZB.ZK(paramZbzu, paramArrayOfString1, paramArrayOfString2);
    if (sSLSocket != null) {
      Zeut zeut = Zeut.ZM(paramZbzu, paramArrayOfString1, paramArrayOfString2);
      this.ZO.Zc(this.Zi, this.Zv, zeut);
    } 
    return sSLSocket;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm8c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */