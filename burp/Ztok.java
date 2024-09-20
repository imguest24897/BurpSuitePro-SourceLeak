package burp;

import java.util.List;

public class Ztok implements Zkfj {
  private final byte[] ZQ;
  
  private static int[] Zd;
  
  Ztok(byte[] paramArrayOfbyte) {
    this.ZQ = paramArrayOfbyte;
  }
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    int[] arrayOfInt = ZS();
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.Zk.Zn(paramZbll, paramZxs7)).ZK(paramZbll.ZR);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
    return Zgky.ZK(paramZe3n.Za(), paramZe3n.ZN(), Zgky.ZB(paramZbll.Zk.ZG()), paramZxs7, (byte)-1, Zgky.ZQ(paramZbll.Zk.ZG()), paramZbll.Zk.ZV(), this.ZQ, zvow, paramZbll.ZP);
  }
  
  public static void ZY(int[] paramArrayOfint) {
    Zd = paramArrayOfint;
  }
  
  public static int[] ZS() {
    return Zd;
  }
  
  static {
    if (ZS() == null)
      ZY(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztok.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */