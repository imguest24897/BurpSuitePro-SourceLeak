package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zklp extends Zklz<Ztkk> {
  private static final Zllo<Ztkk> ZO = new Zzor();
  
  Zklp() {
    super((Zm31[])null, ZO, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Ztkk> Z_(byte paramByte) {
    try {
      switch (paramByte) {
        case 1:
          return (Zeu4)Zsnv.Ze;
        case 2:
          return (Zeu4)Zb0p.ZO;
        case 3:
          return (Zeu4)Zzj5.ZJ;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zklp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */