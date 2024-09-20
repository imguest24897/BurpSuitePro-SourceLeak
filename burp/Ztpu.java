package burp;

import java.net.Socket;
import java.net.UnknownHostException;
import java.security.cert.X509Certificate;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztpu {
  private final Zl11 Z_;
  
  private final Zxwv Zl;
  
  private final Zgb6 Zb;
  
  private final Zzen ZE;
  
  private final Ztbq Zo;
  
  private static String[] ZU;
  
  public Ztpu(Zl11 paramZl11, Zed4 paramZed4, Zgb6 paramZgb6, Ztbq paramZtbq, Zlbx paramZlbx, Zrgd paramZrgd, Zkl6 paramZkl6) {
    this.Z_ = paramZl11;
    this.Zb = paramZgb6;
    this.ZE = paramZlbx;
    this.Zo = paramZtbq;
    this.Zl = new Zxwv(paramZrgd, paramZgb6, paramZkl6, paramZed4);
  }
  
  public Socket ZV(Zmzk paramZmzk) throws UnknownHostException {
    try {
      if (paramZmzk.ZJZ()) {
        Zuh.Zb(false, Zqf.Zr);
        return null;
      } 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    return this.Zl.ZG(paramZmzk, this.ZE);
  }
  
  public X509Certificate ZN(Zmzk paramZmzk) throws UnknownHostException {
    try {
      if (!paramZmzk.ZJZ()) {
        Zuh.Zb(false, Zqf.Zr);
        return null;
      } 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    Zxwq zxwq = new Zxwq(this.ZE, this.Zo, paramZmzk);
    Socket socket = this.Zl.ZG(paramZmzk, zxwq);
    Zsdz.ZQ(socket);
    return zxwq.Zq();
  }
  
  public Zsxd Zt(Zefx paramZefx, Zrfm paramZrfm, Zxfo paramZxfo) {
    String[] arrayOfString = Zh();
    Zts5 zts5 = Zs38.ZG(this.Zb).ZV(paramZrfm.ZKJ()).ZX().ZV(paramZrfm.ZK9()).Zi(paramZrfm.ZKV()).Zz(true).ZR(paramZrfm.ZKE().ZN()).Zy();
    if (Zbqc.Zwu() == null)
      ZK(new String[1]); 
    return this.Z_.ZE(paramZefx, zts5, new Zxf_(paramZxfo), this.ZE);
  }
  
  public static void ZK(String[] paramArrayOfString) {
    ZU = paramArrayOfString;
  }
  
  public static String[] Zh() {
    return ZU;
  }
  
  private static UnknownHostException a(UnknownHostException paramUnknownHostException) {
    return paramUnknownHostException;
  }
  
  static {
    if (Zh() == null)
      ZK(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztpu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */