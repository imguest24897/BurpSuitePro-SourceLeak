package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsi0 implements Zeu4<Zl5f> {
  public final Zekv Zw = new Zekv(0);
  
  public final Zeki<Zs62> ZT = new Zeki<>(1, Zs62.Zh);
  
  private final Zm31[] ZO = new Zm31[] { this.Zw, this.ZT };
  
  private final Zllo<Zl5f> ZU = new Zbs4();
  
  private final Zsqx<Zl5f> ZJ = new Zt0y(10);
  
  private static boolean Zx;
  
  public Zm31[] Zc() {
    return this.ZO;
  }
  
  public Zllo<Zl5f> ZI() {
    return this.ZU;
  }
  
  public Zeu4<? extends Zl5f> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void Zp(boolean paramBoolean) {
    Zx = paramBoolean;
  }
  
  public static boolean ZE() {
    return Zx;
  }
  
  public static boolean Zj() {
    boolean bool = ZE();
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
    if (!Zj())
      Zp(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsi0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */