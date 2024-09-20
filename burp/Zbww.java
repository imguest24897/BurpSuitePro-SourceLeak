package burp;

import net.portswigger.Zsy;

public class Zbww implements Zs9w {
  private final Zt7z Zz;
  
  private final Zbza Zf;
  
  private final Zmhe ZE;
  
  private final Zmg6 Zc;
  
  private final Zro0 ZA;
  
  private final Ztai ZV;
  
  private static Zbqc[] Zn;
  
  public Zbww(Zbza paramZbza, Zxs7 paramZxs7, Zmhe paramZmhe, Zsy paramZsy, Zmg6 paramZmg6, Ztai paramZtai) {
    this.Zf = paramZbza;
    this.ZE = paramZmhe;
    Zbqc[] arrayOfZbqc = ZW();
    this.ZV = paramZtai;
    this.Zz = new Zt7z(paramZmhe, paramZxs7, paramZsy, paramZmg6);
    this.Zc = paramZmg6;
    this.ZA = paramZxs7.Zl();
    if (Zbqc.Zwu() == null)
      Zp(new Zbqc[4]); 
  }
  
  public void Zs(Zz4_ paramZz4_) {
    this.Zz.ZE();
    boolean bool = ((Boolean)this.ZE.<Boolean>Zq(Boolean.valueOf(false), Boolean.valueOf(true))).booleanValue();
    Zbqc[] arrayOfZbqc = ZW();
    if (bool) {
      Zrto.Zc(this.Zc.Ze().ZM(), this.Zc.ZG().ZM(), this.ZV, this.ZA, paramZz4_).Zf(this.Zc.Zo(Zsjk.APPEND), Zsjk.APPEND);
      Zrto.Zc(this.Zc.Ze().ZM(), this.Zc.ZG().ZM(), this.ZV, this.ZA, paramZz4_).Zf(this.Zc.Zo(Zsjk.REPLACE), Zsjk.REPLACE);
      this.Zf.Zg2();
      if (arrayOfZbqc == null) {
        Zbqc.Zr(new Zbqc[5]);
      } else {
        return;
      } 
    } 
    Zk2b.ZL(this.Zf, this.ZV, this.ZA, this.ZV.Zr(Zzu2.INPUT_RETRIEVAL_REFLECTED), paramZz4_).Zj(this.Zc.Zo(Zsjk.APPEND), Zsjk.APPEND);
    Zk2b.ZL(this.Zf, this.ZV, this.ZA, this.ZV.Zr(Zzu2.INPUT_RETRIEVAL_REFLECTED), paramZz4_).Zj(this.Zc.Zo(Zsjk.REPLACE), Zsjk.REPLACE);
    this.Zf.ZgX();
  }
  
  public static void Zp(Zbqc[] paramArrayOfZbqc) {
    Zn = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZW() {
    return Zn;
  }
  
  static {
    if (ZW() == null)
      Zp(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbww.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */