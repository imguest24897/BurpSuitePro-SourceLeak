package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkxr extends Zklz<Zrui> {
  private static int[] ZU;
  
  Zkxr() {
    super((Zm31[])null, (Zllo<Zrui>)null, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Zrui> Z_(byte paramByte) {
    switch (paramByte) {
      case 1:
        return (Zeu4)Zg31.ZW;
      case 2:
      case 3:
        return Zxo_.Zp.Z_(paramByte);
      case 4:
        return (Zeu4)Zg70.ZG;
    } 
    Zuh.Zb(false, Zqf.Zk);
    return null;
  }
  
  public static void Zs(int[] paramArrayOfint) {
    ZU = paramArrayOfint;
  }
  
  public static int[] ZX() {
    return ZU;
  }
  
  static {
    if (ZX() == null)
      Zs(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkxr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */