package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkp1 extends Zklz<Zlx1> {
  public static final Zeka ZR = new Zeka(0);
  
  public static final Zekv ZK = new Zekv(1);
  
  public static final Zekb<Zzb7> Zq = new Zekb<>(32, Zzb7.ZP);
  
  public static final Zm31[] Zr = new Zm31[] { ZR, ZK, Zq };
  
  Zkp1() {
    super(null, null, Zz5f.ABSTRACT, (byte)-1);
  }
  
  public Zeu4<? extends Zlx1> Z_(byte paramByte) {
    try {
      switch (paramByte) {
        case 0:
          return (Zeu4)Zs0m.Zk;
        case 1:
          return (Zeu4)Zl47.Zj;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkp1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */