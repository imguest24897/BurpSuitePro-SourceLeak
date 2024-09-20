package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zs7c implements Zeu4<Zkc3> {
  public final Zekv Zp = new Zekv(0);
  
  public final Zeki<Zzxh> ZC = new Zeki<>(1, Zzxh.ZA);
  
  private final Zm31[] Zl = new Zm31[] { this.Zp, this.ZC };
  
  private final Zllo<Zkc3> ZS = new Zkqr();
  
  private final Zsqx<Zkc3> Zi = new Zmrg(10);
  
  private static String[] Zw;
  
  public Zm31[] Zc() {
    return this.Zl;
  }
  
  public Zllo<Zkc3> ZI() {
    return this.ZS;
  }
  
  public Zeu4<? extends Zkc3> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void Zu(String[] paramArrayOfString) {
    Zw = paramArrayOfString;
  }
  
  public static String[] Zl() {
    return Zw;
  }
  
  static {
    if (Zl() != null)
      Zu(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs7c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */