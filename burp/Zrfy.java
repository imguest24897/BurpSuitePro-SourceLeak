package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrfy implements Zeu4<Zsli> {
  public final Zekv Zw = new Zekv(0);
  
  public final Zeki<Zg60> Zj = new Zeki<>(1, Zg60.ZT);
  
  private final Zm31[] ZP = new Zm31[] { this.Zw, this.Zj };
  
  private final Zllo<Zsli> ZJ = new Zt7n();
  
  private final Zsqx<Zsli> Zs = new Zg_9(10);
  
  private static boolean ZM;
  
  public Zm31[] Zc() {
    return this.ZP;
  }
  
  public Zllo<Zsli> ZI() {
    return this.ZJ;
  }
  
  public Zeu4<? extends Zsli> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public byte ZD() {
    return 0;
  }
  
  public static void Za(boolean paramBoolean) {
    ZM = paramBoolean;
  }
  
  public static boolean ZG() {
    return ZM;
  }
  
  public static boolean Zx() {
    boolean bool = ZG();
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
    if (!ZG())
      Za(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrfy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */