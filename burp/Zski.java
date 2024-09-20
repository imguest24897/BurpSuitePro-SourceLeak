package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public interface Zski extends Zg35<Zski> {
  public static final Zeu4<Zski> Zy = new Zkzo();
  
  Zlit ZyR();
  
  String Zyb();
  
  default String ZyJ() {
    return ZN(ZyR().Zdw());
  }
  
  default String ZN(String paramString) {
    return paramString + paramString;
  }
  
  static Zski Zf(Zlit paramZlit) {
    return ZO(paramZlit, null);
  }
  
  static Zski ZO(Zlit paramZlit, String paramString) {
    Zuh.Zb((paramZlit != null), Zqf.Zv);
    return new Zhi(paramZlit, paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zski.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */