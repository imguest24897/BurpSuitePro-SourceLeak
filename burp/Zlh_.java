package burp;

import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zlh_ {
  private final String Zx;
  
  private final Zsll Zl;
  
  private final int ZB;
  
  private Zlh_(String paramString, Zsll paramZsll) {
    this(paramString, paramZsll, 1);
  }
  
  private Zlh_(String paramString, Zsll paramZsll, int paramInt) {
    this.Zx = paramString;
    this.Zl = paramZsll;
    this.ZB = paramInt;
  }
  
  static Zlh_ Zp(String paramString) {
    return new Zlh_(paramString, Zsll.TRACING_FOLLOWUPS);
  }
  
  static Zlh_ ZY(String paramString) {
    return new Zlh_(paramString, Zsll.TRACING_DISABLED, 1);
  }
  
  static Zlh_ Zz(String paramString) {
    return new Zlh_(paramString, Zsll.CONTEXT_BREAKOUT, 2);
  }
  
  public Zx57 Zj(Zsy paramZsy, byte paramByte) {
    if (this.ZB == 1) {
      String str1 = paramZsy.Z_(10);
      String str2 = String.format(this.Zx, new Object[] { str1 });
      return new Zx57(Zkb.Zy(str2), this.Zl, paramByte, new String[] { str1 });
    } 
    if (this.ZB == 2) {
      String str1 = paramZsy.Z_(10);
      String str2 = paramZsy.Z_(10);
      String str3 = String.format(this.Zx, new Object[] { str1, str2 });
      return new Zx57(Zkb.Zy(str3), this.Zl, paramByte, new String[] { str1, str2 });
    } 
    Zuh.Zv(false, Zqf.Zr, this.ZB);
    return null;
  }
  
  public String toString() {
    return super.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlh_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */