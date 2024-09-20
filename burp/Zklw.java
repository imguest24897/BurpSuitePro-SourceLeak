package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zklw extends Zklz<Zzem> {
  public static final Zekv ZQ = new Zekv(0);
  
  public static final Zekb<Ztkk> ZX = new Zekb<>(1, Ztkk.Zp);
  
  public static final Zek2 ZN = new Zek2(2);
  
  public static final Zeka Zu = new Zeka(3);
  
  public static final Zek9 ZM = new Zek9(4);
  
  public static final Zm31[] Zi = new Zm31[] { ZQ, ZX, ZN, Zu, ZM };
  
  Zklw() {
    super(null, null, Zz5f.ABSTRACT, (byte)-1);
  }
  
  public Zeu4<? extends Zzem> Z_(byte paramByte) {
    try {
      switch (paramByte) {
        case 0:
          return (Zeu4)Zlaf.ZT;
        case 1:
          return (Zeu4)Zrqa.Zr;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    throw new UnsupportedOperationException();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zklw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */