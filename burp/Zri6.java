package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zri6 implements Zeu4<Zmfv> {
  public final Zekv Zj = new Zekv(0);
  
  public final Zeki<Zsqo> Zr = new Zeki<>(1, Zsqo.ZR);
  
  private final Zm31[] ZH = new Zm31[] { this.Zj, this.Zr };
  
  private final Zllo<Zmfv> Zz = new Zgqc();
  
  private final Zsqx<Zmfv> Zn = new Zslb(16);
  
  private static int Ze;
  
  public Zm31[] Zc() {
    return this.ZH;
  }
  
  public Zllo<Zmfv> ZI() {
    return this.Zz;
  }
  
  public Zeu4<? extends Zmfv> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void Zi(int paramInt) {
    Ze = paramInt;
  }
  
  public static int ZU() {
    return Ze;
  }
  
  public static int Zz() {
    int i = ZU();
    try {
      if (i == 0)
        return 104; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (ZU() != 0)
      Zi(68); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zri6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */