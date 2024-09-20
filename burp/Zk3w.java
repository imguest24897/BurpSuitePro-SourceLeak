package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zk3w extends Zklz<Zll7> {
  Zk3w() {
    super((Zm31[])null, (Zllo<Zll7>)null, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Zll7> Z_(byte paramByte) {
    try {
      switch (Zb68.ZQ[Zgl5.Ze(paramByte).ordinal()]) {
        case 1:
          return (Zeu4)Zb8m.ZA;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk3w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */