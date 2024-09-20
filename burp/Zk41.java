package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zk41 extends Zklz<Ztri> {
  public static final Zekc Za = new Zekc(0);
  
  public static final Zekb<Zs1t> Zo = new Zekb<>(1, Zs1t.Zv);
  
  public static final Zm31[] Zf = new Zm31[] { Za, Zo };
  
  public Zk41() {
    super(Zf, (Zllo<Ztri>)null, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Ztri> Z_(byte paramByte) {
    try {
      switch (paramByte) {
        case 1:
          return (Zeu4)Zl5g.Zy;
        case 2:
          return (Zeu4)Zg48.ZM;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk41.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */