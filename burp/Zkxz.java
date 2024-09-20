package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkxz extends Zklz<Zeu9> {
  private static int[] Zh;
  
  public Zkxz() {
    super((Zm31[])null, (Zllo<Zeu9>)null, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Zeu9> Z_(byte paramByte) {
    Zeu4<? extends Zgd4> zeu4 = Zgd4.ZN.Z_(paramByte);
    if (zeu4 != null)
      return (Zeu4)zeu4; 
    Zeu4<? extends Ze6r> zeu41 = Ze6r.ZM.Z_(paramByte);
    if (zeu41 != null)
      return (Zeu4)zeu41; 
    Zuh.Zb(false, Zqf.Zk);
    return null;
  }
  
  public static void ZR(int[] paramArrayOfint) {
    Zh = paramArrayOfint;
  }
  
  public static int[] Zj() {
    return Zh;
  }
  
  static {
    if (Zj() != null)
      ZR(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkxz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */