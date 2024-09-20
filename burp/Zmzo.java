package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zkb;

public class Zmzo implements Zkfj {
  private static String Zd;
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    String str = ZR();
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.Zk.Zn(paramZbll, paramZxs7)).ZK(paramZbll.ZR);
    if (str == null)
      Zbqc.Zr(new Zbqc[5]); 
    return ZO(paramZxs7, zvow, paramZe3n.ZN(), paramZe3n.Za(), paramZbll.Zk.Zh(), paramZbll.ZP);
  }
  
  public static Zsqx<Zrdb> ZO(Zxs7 paramZxs7, Zvow paramZvow, String paramString, Zmzk paramZmzk, byte[] paramArrayOfbyte, List<Zsjh<?>> paramList) {
    boolean bool = false;
    return new Zx_5(Zzu2.XSS_STORED, bool, 0, Collections.emptyMap(), Zbxq.ZS(paramArrayOfbyte, paramZvow, paramList), (byte)3, Zx_r.Zk(Zzu2.XSS_STORED, paramZxs7.Z_(), (short)200, 0, bool), paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Z_(String paramString) {
    Zd = paramString;
  }
  
  public static String ZR() {
    return Zd;
  }
  
  static {
    if (ZR() == null)
      Z_("nlztFc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmzo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */