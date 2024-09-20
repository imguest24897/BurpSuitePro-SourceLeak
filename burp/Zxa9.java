package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxa9 implements Zeu4<Zrvk> {
  public final Zekv Zo = new Zekv(0);
  
  public final Zeki<Ztrj> Zv = new Zeki<>(1, Ztrj.ZS);
  
  private final Zm31[] Zd = new Zm31[] { this.Zo, this.Zv };
  
  private final Zllo<Zrvk> ZK = new Zkfq();
  
  private final Zsqx<Zrvk> ZZ = new Zg_b(10);
  
  private static int ZL;
  
  public Zm31[] Zc() {
    return this.Zd;
  }
  
  public Zllo<Zrvk> ZI() {
    return this.ZK;
  }
  
  public Zeu4<? extends Zrvk> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void ZI(int paramInt) {
    ZL = paramInt;
  }
  
  public static int Zw() {
    return ZL;
  }
  
  public static int ZL() {
    int i = Zw();
    try {
      if (i == 0)
        return 107; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (ZL() != 0)
      ZI(88); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxa9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */