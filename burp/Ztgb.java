package burp;

import java.util.List;

public class Ztgb {
  private final Zlba Zb;
  
  private final Zbza Zo;
  
  private final Zmz6 Za;
  
  private static Zbqc[] ZS;
  
  public Ztgb(Zmz6 paramZmz6, Zlba paramZlba, Zbza paramZbza) {
    this.Za = paramZmz6;
    this.Zb = paramZlba;
    this.Zo = paramZbza;
  }
  
  public void Zt(Zgq<Zrdb> paramZgq) {
    List<Zrdb> list = this.Za.ZQ(paramZgq, this.Zo);
    this.Zb.ZD(this.Zo, list);
  }
  
  public static void ZI(Zbqc[] paramArrayOfZbqc) {
    ZS = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Z_() {
    return ZS;
  }
  
  static {
    if (Z_() != null)
      ZI(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */