package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zs7m implements Zz09 {
  private final Zbza ZC;
  
  private final Zz1i Zf;
  
  private final Zrjd Zm;
  
  private final Zkvg ZG;
  
  private final Ztai ZX;
  
  private final Ze4e ZZ;
  
  private final Zbnt ZU;
  
  private static boolean Zi;
  
  public Zs7m(Zbza paramZbza, Zz1i paramZz1i, Zrjd paramZrjd, Zkvg paramZkvg, Ztai paramZtai, Ze4e paramZe4e, Zbnt paramZbnt) {
    this.ZC = paramZbza;
    boolean bool = Zz();
    this.Zf = paramZz1i;
    this.Zm = paramZrjd;
    this.ZG = paramZkvg;
    this.ZX = paramZtai;
    this.ZZ = paramZe4e;
    this.ZU = paramZbnt;
    if (!bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void ZC(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx) {
    boolean bool = Zz();
    try {
      Ze3n ze3n = this.Zm.Zc(this.ZC, paramZtpx);
      Zg75 zg75 = new Zg75(ze3n, this.ZX, this.ZU);
      this.ZG.Zy(zg75);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.ZZ.Zl(Zb09.Zh(Zt0r.A1, this.Zf.Zd(Zt0r.A1), Zblb.ZB(throwable)).Zn(), throwable);
    } 
    try {
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (Throwable throwable) {
          throw a(null);
        } 
        Zk(!bool);
      } 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  public static void Zk(boolean paramBoolean) {
    Zi = paramBoolean;
  }
  
  public static boolean Zy() {
    return Zi;
  }
  
  public static boolean Zz() {
    boolean bool = Zy();
    return !bool;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    if (!Zz())
      Zk(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs7m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */