package burp;

import java.util.List;

public class Ze_k implements Zkol {
  private final Zgtz ZR;
  
  private static String ZG;
  
  public Ze_k() {
    this(new Zggr());
  }
  
  public Ze_k(Zgtz paramZgtz) {
    this.ZR = paramZgtz;
  }
  
  public Zb3t Zu(Ztx4 paramZtx4, List<Zb3t> paramList) {
    return new Zgca(paramZtx4, this.ZR.ZO(paramList));
  }
  
  public static void ZT(String paramString) {
    ZG = paramString;
  }
  
  public static String Zv() {
    return ZG;
  }
  
  static {
    if (Zv() != null)
      ZT("XcAYK"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */