package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zguz<T extends Zgpi> implements Zllg<Zrte<T>> {
  private final Zrp4<T> ZE;
  
  private static boolean ZK;
  
  public Zguz(Zeu4<T> paramZeu4) {
    this.ZE = new Zrp4<>(paramZeu4, this);
  }
  
  public int Zr(int paramInt) {
    return paramInt * 8;
  }
  
  public Zmlx<Zrte<T>> Zb() {
    return this.ZE;
  }
  
  public Zm31[] Zc() {
    throw new UnsupportedOperationException();
  }
  
  public Zllo<Zrte<T>> ZI() {
    return this.ZE;
  }
  
  public Zeu4<? extends Zrte<T>> Z_(byte paramByte) {
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
  
  public static void Z_(boolean paramBoolean) {
    ZK = paramBoolean;
  }
  
  public static boolean ZE() {
    return ZK;
  }
  
  public static boolean ZU() {
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
    if (ZE())
      Z_(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zguz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */