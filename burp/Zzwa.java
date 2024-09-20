package burp;

import net.portswigger.Zkb;

public class Zzwa implements Zm4g {
  private final Zmzk Zu;
  
  private final String ZV;
  
  private final Zxs7 ZI;
  
  private final Zbll ZH;
  
  private final Zm1m ZS;
  
  private final int Zr;
  
  public Zzwa(Zmzk paramZmzk, byte[] paramArrayOfbyte, Zxs7 paramZxs7, Zbll paramZbll, Zm1m paramZm1m, int paramInt) {
    this.Zu = paramZmzk;
    this.ZV = Zkb.ZG(paramArrayOfbyte);
    this.ZI = paramZxs7;
    this.ZH = paramZbll;
    this.ZS = paramZm1m;
    this.Zr = paramInt;
  }
  
  public byte ZU() {
    return 3;
  }
  
  public int ZR() {
    return 0;
  }
  
  public int Zl() {
    return this.Zr;
  }
  
  public Zx_5 Zx() {
    return Zgky.Zx(this.Zu, this.ZV, Zgky.ZB(this.ZH.Zk.ZG()), this.ZI, null, this.ZS);
  }
  
  public Zrwf ZG() {
    return Zrwf.COLLABORATOR;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzwa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */