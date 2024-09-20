package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ze36 implements Zeu4<Zm0z> {
  public final Zekv Ze = new Zekv(0);
  
  public final Zeki<Zmxo> ZV = new Zeki<>(1, Zmxo.ZK);
  
  private final Zm31[] ZS = new Zm31[] { this.Ze, this.ZV };
  
  private final Zllo<Zm0z> ZZ = new Zm96();
  
  private final Zsqx<Zm0z> ZB = new Zgbz(10);
  
  private static int ZF;
  
  public Zm31[] Zc() {
    return this.ZS;
  }
  
  public Zllo<Zm0z> ZI() {
    return this.ZZ;
  }
  
  public Zeu4<? extends Zm0z> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void ZA(int paramInt) {
    ZF = paramInt;
  }
  
  public static int Zz() {
    return ZF;
  }
  
  public static int Zx() {
    int i = Zz();
    try {
      if (i == 0)
        return 58; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (Zz() == 0)
      ZA(1); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze36.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */