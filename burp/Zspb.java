package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zec;

class Zspb {
  private final Zlit Zi;
  
  private final Zez3 Zf;
  
  private final Zs68 Zo;
  
  private final Zztw Zk;
  
  Zspb(Zec paramZec, Zlit paramZlit, Zez3 paramZez3) {
    this(paramZec, paramZlit, paramZez3, Zh(paramZez3));
  }
  
  Zspb(Zec paramZec, Zlit paramZlit, Zez3 paramZez3, Zs68 paramZs68) {
    this.Zi = paramZlit;
    this.Zf = paramZez3;
    this.Zo = paramZs68;
    this.Zk = Zh(paramZec, paramZs68);
  }
  
  boolean Zu() {
    return (this.Zk == Zztw.HAS_NO_RESPONSE);
  }
  
  boolean ZD() {
    return (this.Zk == Zztw.NOT_MODIFIED);
  }
  
  boolean ZE() {
    return (this.Zk == Zztw.REDIRECTION);
  }
  
  Zlit ZJ(Zbnt paramZbnt) {
    try {
      Zmzk zmzk = paramZbnt.ZY(this.Zi.Zd1(), this.Zi.Zda(), this.Zi.Zdr());
      Zs0d zs0d = Zgcr.Zd(zmzk, this.Zf.Zos(), this.Zf.ZoO(), this.Zo.ZP, this.Zo.Zk, this.Zf.Zl7(), 1, paramZbnt);
      try {
      
      } catch (Zxgy zxgy) {
        throw a(null);
      } 
      return (zs0d == null) ? null : zs0d.ZM();
    } catch (Zxgy|Zxg5 zxgy) {
      Zah.Zl(zxgy, Zk_.IGNORED);
      return null;
    } 
  }
  
  public byte[] ZN() {
    return (this.Zk == Zztw.HAS_NO_RESPONSE) ? Zxrn.ZM : this.Zf.ZoO().ZiD();
  }
  
  private static Zs68 Zh(Zez3 paramZez3) {
    return (paramZez3 == null || paramZez3.ZoO() == null || paramZez3.ZoO().Zpu() == 0) ? null : Zbwc.Zt((Zlit)null, paramZez3.ZoO(), Zt0k.NO_HTML_ANALYSIS, null);
  }
  
  private static Zztw Zh(Zec paramZec, Zs68 paramZs68) {
    return (paramZs68 == null || (paramZec == Zec.DOCUMENT && paramZs68.ZH.Zl)) ? Zztw.HAS_NO_RESPONSE : ((paramZs68.Zb == 304) ? Zztw.NOT_MODIFIED : ((paramZs68.Zb >= 300 && paramZs68.Zb < 400) ? Zztw.REDIRECTION : Zztw.HAS_RESPONSE));
  }
  
  private static Zxgy a(Zxgy paramZxgy) {
    return paramZxgy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zspb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */