package burp;

import java.util.Optional;

public class Ztud {
  static final String Zn = Zxk3.HTTP_V2.ZK();
  
  static final int Ze = Zn.length();
  
  public static Optional<Zkyt> ZJ(Zstu paramZstu) {
    if (paramZstu != null && paramZstu.Zpu() >= Ze) {
      String str = paramZstu.Zb(0, Ze).Zis();
      return Zn.equals(str) ? Optional.<Zkyt>of(Zkyt.HTTP2) : Optional.<Zkyt>of(Zkyt.HTTP1);
    } 
    return Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztud.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */