package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkx5 extends Zklz<Zszy> {
  private static int Zf;
  
  Zkx5() {
    super((Zm31[])null, (Zllo<Zszy>)null, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Zszy> Z_(byte paramByte) {
    switch (paramByte) {
      case 1:
        return (Zeu4)Zl31.Zx;
      case 2:
        return (Zeu4)Zti9.Zs;
    } 
    Zuh.Zb(false, Zqf.Zk);
    return null;
  }
  
  public static void ZN(int paramInt) {
    Zf = paramInt;
  }
  
  public static int Zt() {
    return Zf;
  }
  
  public static int Zd() {
    int i = Zt();
    return (i == 0) ? 92 : 0;
  }
  
  static {
    if (Zt() == 0)
      ZN(105); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkx5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */