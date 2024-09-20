package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zks1 extends Zklz<Zrde> {
  Zks1() {
    super((Zm31[])null, (Zllo<Zrde>)null, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Zrde> Z_(byte paramByte) {
    try {
      switch (Zr4v.Zh[Zg3e.Zo(paramByte).ordinal()]) {
        case 1:
          return (Zeu4)Zkcp.Zz;
        case 2:
          return (Zeu4)Zrp9.Zu;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zks1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */