package burp;

import java.util.List;

public class Zk1v implements Zkfj {
  private static Zbqc[] ZB;
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    Zbqc[] arrayOfZbqc = ZJ();
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.Zk.Zn(paramZbll, paramZxs7)).ZK(paramZbll.ZR);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
    return Zog.ZL(paramZe3n.Za(), paramZe3n.ZN(), (byte)4, Zzu2.EXTERNAL_SERVICE_INTERACTION_SMTP, Zxwd.EMAIL_ADDRESS, zvow, paramZbll.ZP, paramZxs7, paramZbll.Zk.ZV());
  }
  
  public static void ZG(Zbqc[] paramArrayOfZbqc) {
    ZB = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZJ() {
    return ZB;
  }
  
  static {
    if (ZJ() == null)
      ZG(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk1v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */