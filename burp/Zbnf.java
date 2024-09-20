package burp;

import java.util.Objects;

public class Zbnf implements Zm9n {
  private final Zerg ZG;
  
  private final Zz1i Zt;
  
  private final Ze3n Zg;
  
  private final Zxs7 ZL;
  
  private final Zkl6 Zh;
  
  private final Zm6x ZR;
  
  private static String[] ZJ;
  
  public Zbnf(Zerg paramZerg, Zz1i paramZz1i, Ze3n paramZe3n, Zxs7 paramZxs7, Zkl6 paramZkl6, Zm6x paramZm6x) {
    this.ZG = paramZerg;
    this.Zt = paramZz1i;
    this.Zg = paramZe3n;
    String[] arrayOfString = ZY();
    this.ZL = paramZxs7;
    this.Zh = paramZkl6;
    this.ZR = paramZm6x;
    if (Zbqc.Zwu() == null)
      Zs(new String[5]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_ExtensionProvidedChecks;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    String[] arrayOfString = ZY();
    Zgq<Zrdb> zgq = this.ZG.ZM().Zz(this.Zt, this.Zg, this.Zg.Zq(this.Zh, this.ZR), this.ZL, paramZtpx, paramZrj.Zg());
    if (zgq != null) {
      Objects.requireNonNull(paramZz4_);
      zgq.forEach(paramZz4_::Zz);
    } 
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public static void Zs(String[] paramArrayOfString) {
    ZJ = paramArrayOfString;
  }
  
  public static String[] ZY() {
    return ZJ;
  }
  
  static {
    if (ZY() == null)
      Zs(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbnf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */