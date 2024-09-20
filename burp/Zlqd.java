package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlqd implements Zeu4<Zmg> {
  public final Zekv ZV = new Zekv(0);
  
  public final Zeki<Zmyi> ZY = new Zeki<>(1, Zmyi.Zp);
  
  private final Zm31[] Zb = new Zm31[] { this.ZV, this.ZY };
  
  private final Zllo<Zmg> ZH = new Zl9j(this);
  
  private final Zsqx<Zmg> ZF;
  
  private static int ZQ;
  
  public Zlqd() {
    this.ZF = new Zkbp(this, 10);
  }
  
  Zlqd(Zkbp paramZkbp) {
    int i = ZJ();
    try {
      this.ZF = paramZkbp;
      if (i == 0)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Zm31[] Zc() {
    return this.Zb;
  }
  
  public Zllo<Zmg> ZI() {
    return this.ZH;
  }
  
  public Zeu4<? extends Zmg> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void Zk(int paramInt) {
    ZQ = paramInt;
  }
  
  public static int ZJ() {
    return ZQ;
  }
  
  public static int ZE() {
    int i = ZJ();
    try {
      if (i == 0)
        return 95; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (ZE() != 0)
      Zk(94); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlqd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */