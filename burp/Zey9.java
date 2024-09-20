package burp;

import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zey9 {
  private final Zbnt ZO;
  
  private static boolean ZP;
  
  public Zey9(Zbnt paramZbnt) {
    Zuh.Zb((paramZbnt != null), Zqf.Zv);
    this.ZO = paramZbnt;
  }
  
  public Zefx Zu(Zmzk paramZmzk, Zstu paramZstu) {
    return (paramZstu == null) ? null : ZY(paramZmzk, paramZstu.ZiD());
  }
  
  public Zefx ZY(Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : new Zr6q(paramZmzk, paramArrayOfbyte, this, this.ZO);
  }
  
  public Zefx ZE(Zmzk paramZmzk, List<Ztnz> paramList, Zstu paramZstu) {
    return ZR(paramZmzk, paramList, (paramZstu == null) ? null : paramZstu.ZiD());
  }
  
  public Zefx ZR(Zmzk paramZmzk, List<Ztnz> paramList, byte[] paramArrayOfbyte) {
    return new Zr6h(paramZmzk, paramList, paramArrayOfbyte, this, this.ZO);
  }
  
  public Zefx Zy(Zsmh paramZsmh) {
    return (paramZsmh == null) ? null : ((paramZsmh instanceof Zefx) ? (Zefx)paramZsmh : ZY(null, Zt6s.Zu(paramZsmh)));
  }
  
  public Zefx ZB(Zmzk paramZmzk, Zsmh paramZsmh) {
    if (paramZsmh == null)
      return null; 
    if (paramZsmh instanceof Zefx) {
      Zefx zefx = (Zefx)paramZsmh;
      return zefx.ZM(paramZmzk);
    } 
    return ZY(paramZmzk, Zt6s.Zu(paramZsmh));
  }
  
  public static void ZN(boolean paramBoolean) {
    ZP = paramBoolean;
  }
  
  public static boolean ZC() {
    return ZP;
  }
  
  public static boolean ZN() {
    boolean bool = ZC();
    return !bool;
  }
  
  static {
    if (!ZN())
      ZN(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zey9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */