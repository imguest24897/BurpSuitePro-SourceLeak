package burp;

import java.util.Collection;
import java.util.Map;

public class Zrn_ implements Zlfv<Zt38> {
  private final Zefg<Zsdr> ZG = null;
  
  private final Collection<String> Zl;
  
  private final Zvow ZN;
  
  private final Zzi8 ZR;
  
  private static boolean ZM;
  
  public Zrn_(Zvow paramZvow, Collection<String> paramCollection) {
    this.Zl = paramCollection;
    this.ZR = null;
    this.ZN = paramZvow;
  }
  
  public Zsqx<Zt38> Zc(Map<Zvow, Zzi8> paramMap) {
    return new Zes9(this, paramMap);
  }
  
  public static void Zv(boolean paramBoolean) {
    ZM = paramBoolean;
  }
  
  public static boolean Zp() {
    return ZM;
  }
  
  public static boolean ZJ() {
    boolean bool = Zp();
    return !bool;
  }
  
  static {
    if (Zp())
      Zv(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrn_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */