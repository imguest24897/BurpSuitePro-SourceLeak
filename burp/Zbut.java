package burp;

import java.io.IOException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Zbut implements Zrk9 {
  private final Zmzk ZN;
  
  private final Zxk1 Zs;
  
  private final Zxxr ZS;
  
  private final Zsfe Zq;
  
  public Zbut(Zmzk paramZmzk, Zxk1 paramZxk1, Zxxr paramZxxr, Zsfe paramZsfe) {
    this.ZN = paramZmzk;
    this.Zs = paramZxk1;
    this.ZS = paramZxxr;
    this.Zq = paramZsfe;
  }
  
  public SSLSocket Zt(Zbzu paramZbzu, Zrps paramZrps) throws IOException {
    Zgkj zgkj = this.Zs.Zm(this.ZN.ZJ1());
    SSLSocketFactory sSLSocketFactory = zgkj.Zs(this.Zq.ZT(), paramZbzu);
    return (SSLSocket)sSLSocketFactory.createSocket(this.ZS.ZK(this.ZN, paramZrps), this.Zq.Zc(this.ZN), this.ZN.ZJO(), true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbut.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */