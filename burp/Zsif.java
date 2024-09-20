package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsif implements Zeu4<Zxsn> {
  public final Zekv Zd = new Zekv(0);
  
  public final Zeki<Zrap> ZH = new Zeki<>(1, Zrap.ZU);
  
  private final Zm31[] ZT = new Zm31[] { this.Zd, this.ZH };
  
  private final Zllo<Zxsn> Zq = new Zrpa();
  
  private final Zsqx<Zxsn> ZC = new Zl29(10);
  
  private static int ZJ;
  
  public Zm31[] Zc() {
    return this.ZT;
  }
  
  public Zllo<Zxsn> ZI() {
    return this.Zq;
  }
  
  public Zeu4<? extends Zxsn> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void Zn(int paramInt) {
    ZJ = paramInt;
  }
  
  public static int Zd() {
    return ZJ;
  }
  
  public static int ZP() {
    int i = Zd();
    try {
      if (i == 0)
        return 62; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (Zd() == 0)
      Zn(92); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsif.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */