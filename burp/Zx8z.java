package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx8z implements Zeu4<Zg06> {
  public final Zekv ZQ = new Zekv(0);
  
  public final Zeki<Zghu> ZX = new Zeki<>(1, Zghu.Zw);
  
  private final Zm31[] ZG = new Zm31[] { this.ZQ, this.ZX };
  
  private final Zllo<Zg06> ZE = new Zrfg();
  
  private final Zsqx<Zg06> Zt = new Zz32(10);
  
  private static boolean ZT;
  
  public Zm31[] Zc() {
    return this.ZG;
  }
  
  public Zllo<Zg06> ZI() {
    return this.ZE;
  }
  
  public Zeu4<? extends Zg06> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void Zb(boolean paramBoolean) {
    ZT = paramBoolean;
  }
  
  public static boolean Zj() {
    return ZT;
  }
  
  public static boolean ZS() {
    boolean bool = Zj();
    try {
      if (!bool)
        return true; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (ZS())
      Zb(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx8z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */