package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zk3e extends Zklz<Zez3> {
  public static final Zekb<Zlit> Zl = new Zekb<>(0, Zlit.Z_);
  
  public static final Zekc ZW = new Zekc(1);
  
  public static final Zekb<Zez3> ZD = new Zekb<>(2, new Zk3e());
  
  public static final Zekk<Zez3> ZX = new Zekk<>(3, new Zk3e());
  
  public static final Zm31[] Zh = new Zm31[] { Zl, ZW, ZD, ZX };
  
  public Zk3e() {
    super((Zm31[])null, (Zllo<Zez3>)null, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Zez3> Z_(byte paramByte) {
    try {
      switch (paramByte) {
        case 1:
          return (Zeu4)Zzhb.ZM;
        case 2:
          return (Zeu4)Zrtx.ZQ;
        case 3:
          return (Zeu4)Zmxt.Ze;
        case 4:
          return (Zeu4)Zg6u.ZT;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk3e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */