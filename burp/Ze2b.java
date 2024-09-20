package burp;

import net.portswigger.Zkb;
import net.portswigger.Zo;
import net.portswigger.Zsy;

public class Ze2b {
  private static final Zo Zi = new Zo();
  
  private final Zghl Zm;
  
  public Ze2b(Zsy paramZsy) {
    this.Zm = new Zghl(paramZsy);
  }
  
  public Zl36 ZI(Ze3o paramZe3o, Zsg3 paramZsg3, String paramString) {
    return ZH(paramZe3o, paramZsg3, Zkb.Zy(paramString));
  }
  
  public Zl36 ZH(Ze3o paramZe3o, Zsg3 paramZsg3, byte[] paramArrayOfbyte) {
    return Zl(paramZe3o, paramZsg3, Zi, paramArrayOfbyte);
  }
  
  public Zl36 Zl(Ze3o paramZe3o, Zsg3 paramZsg3, Zo paramZo, byte[] paramArrayOfbyte) {
    Ztfl ztfl = this.Zm.Za(paramZe3o);
    return new Zl36(true, paramZo, paramZsg3.ZQ, ztfl.ZCu(), ztfl.ZC9(), paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze2b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */