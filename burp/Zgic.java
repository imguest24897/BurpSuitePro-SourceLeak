package burp;

import java.util.function.Supplier;
import net.portswigger.Zsy;

public class Zgic implements Zbnr {
  private final Zmg6 Zv;
  
  private final Zsoh Zz;
  
  private final Zkl6 ZL;
  
  private final Ze3n ZS;
  
  private final Zesv Zc;
  
  private final Zkq4 Zm;
  
  private final Zmhe Zi;
  
  private final Zxs7 ZC;
  
  private final Zbfi Zk;
  
  private final Zsy Zj;
  
  private final Zbjl Zu;
  
  private final Zskh ZH;
  
  private final Supplier<String> Ze;
  
  private static String Zg;
  
  public Zgic(Zsoh paramZsoh, Zkl6 paramZkl6, Ze3n paramZe3n, Zesv paramZesv, Zkq4 paramZkq4, Zsy paramZsy, Zbjl paramZbjl, Zskh paramZskh, Supplier<String> paramSupplier) {
    this.Zz = paramZsoh;
    this.ZL = paramZkl6;
    this.ZS = paramZe3n;
    this.Zc = paramZesv;
    this.Zm = paramZkq4;
    this.Zj = paramZsy;
    this.Zu = paramZbjl;
    String str = ZU();
    this.ZH = paramZskh;
    this.Ze = paramSupplier;
    this.Zi = null;
    this.ZC = null;
    this.Zk = null;
    this.Zv = null;
    if (Zbqc.Zwu() == null)
      Za("cbInk"); 
  }
  
  public Zgic(Zmg6 paramZmg6, Zsoh paramZsoh, Zkl6 paramZkl6, Ze3n paramZe3n, Zmhe paramZmhe, Zxs7 paramZxs7, Zkq4 paramZkq4, Zsy paramZsy, Zbjl paramZbjl, Zskh paramZskh, Supplier<String> paramSupplier) {
    this.Zv = paramZmg6;
    this.Zz = paramZsoh;
    String str = ZU();
    this.ZL = paramZkl6;
    this.ZS = paramZe3n;
    this.Zi = paramZmhe;
    this.ZC = paramZxs7;
    this.Zm = paramZkq4;
    this.Zj = paramZsy;
    this.Zu = paramZbjl;
    this.ZH = paramZskh;
    this.Ze = paramSupplier;
    this.Zc = null;
    this.Zk = null;
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zkl6 ZE() {
    return this.ZL;
  }
  
  public Ze3n Zx() {
    return this.ZS;
  }
  
  public String ZG() {
    return this.Ze.get();
  }
  
  public Zkq4 Zh() {
    return this.Zm;
  }
  
  public Zmhe Zt() {
    return this.Zi;
  }
  
  public Zxs7 ZC() {
    return this.ZC;
  }
  
  public Zbjl ZV() {
    return this.Zu;
  }
  
  public Zskh Zr() {
    return this.ZH;
  }
  
  public static void Za(String paramString) {
    Zg = paramString;
  }
  
  public static String ZU() {
    return Zg;
  }
  
  static {
    if (ZU() != null)
      Za("jVx9sb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgic.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */