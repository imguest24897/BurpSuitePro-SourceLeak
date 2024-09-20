package burp;

import java.util.Collections;
import java.util.List;

public class Zz4i {
  private final Zlba Zc;
  
  private final Zbza ZO;
  
  private final Zmz6 ZP;
  
  private static int[] Zp;
  
  public Zz4i(Zlba paramZlba, Zbza paramZbza, Zmz6 paramZmz6) {
    this.Zc = paramZlba;
    this.ZO = paramZbza;
    this.ZP = paramZmz6;
  }
  
  public void ZK(Zrdb paramZrdb) {
    List<Zrdb> list = Collections.singletonList(paramZrdb);
    this.ZP.Zf(list, this.ZO);
    this.Zc.ZD(this.ZO, list);
  }
  
  public static void Z_(int[] paramArrayOfint) {
    Zp = paramArrayOfint;
  }
  
  public static int[] ZC() {
    return Zp;
  }
  
  static {
    if (ZC() == null)
      Z_(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz4i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */