package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zksu extends Zklz<Zgkc> {
  Zksu() {
    super((Zm31[])null, (Zllo<Zgkc>)null, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Zgkc> Z_(byte paramByte) {
    try {
      switch (Ztmx.ZR[Zg3e.Zo(paramByte).ordinal()]) {
        case 1:
          return (Zeu4)Zkcp.Zz;
        case 2:
          return (Zeu4)Zrp9.Zu;
        case 3:
          return (Zeu4)Zze_.Zw;
        case 4:
          return (Zeu4)Zreg.ZZ;
        case 5:
          return (Zeu4)Zzq1.ZN;
        case 6:
          return (Zeu4)Zt38.ZL;
        case 7:
          return (Zeu4)Zg3y.Z_;
        case 8:
          return (Zeu4)Zrkg.Zz;
        case 9:
          return (Zeu4)Zeqn.ZW;
        case 10:
          return (Zeu4)Zlg_.Zd;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zksu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */