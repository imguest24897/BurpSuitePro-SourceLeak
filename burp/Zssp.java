package burp;

import java.net.UnknownHostException;

public class Zssp implements Zesd {
  private final Zgb6 ZH;
  
  private final Zgmh Zj;
  
  private final Zr9i ZL;
  
  public Zssp(Zrgd paramZrgd, Zgb6 paramZgb6, Zkl6 paramZkl6) {
    this.ZH = paramZgb6;
    this.Zj = paramZkl6.Zt();
    this.ZL = new Zr9i(paramZrgd, paramZgb6, paramZkl6);
  }
  
  public void Zh(Zmzk paramZmzk) throws UnknownHostException {
    try {
      if (this.ZH.ZfU())
        try {
          if (this.ZH.ZfS())
            return; 
        } catch (UnknownHostException unknownHostException) {
          throw a(null);
        }  
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    try {
      if (this.Zj.ZG(paramZmzk.ZJ1()) != null)
        return; 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    this.ZL.Zh(paramZmzk);
  }
  
  private static UnknownHostException a(UnknownHostException paramUnknownHostException) {
    return paramUnknownHostException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zssp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */