package burp;

import net.portswigger.Zsy;

public class Zkhc implements Zkrr {
  private final Ze3n ZC;
  
  private final Ztai ZH;
  
  private final Zsy ZD;
  
  private final Zesv Zl;
  
  private final Zbnt Zc;
  
  private final Zbjl Zg;
  
  private final Zr_4 ZZ;
  
  private static Zbqc[] Zz;
  
  public Zkhc(Ztai paramZtai, Zsy paramZsy, Zesv paramZesv, Ze3n paramZe3n, Zbnt paramZbnt, Zbjl paramZbjl, Zr_4 paramZr_4) {
    this.ZH = paramZtai;
    this.ZD = paramZsy;
    Zbqc[] arrayOfZbqc = ZD();
    this.Zl = paramZesv;
    this.ZC = paramZe3n;
    this.Zc = paramZbnt;
    this.Zg = paramZbjl;
    this.ZZ = paramZr_4;
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_XmlManipulation;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (this.ZC.ZA().Zv() != Zsba.XML)
      return; 
    Zxs7 zxs7 = this.ZC.ZS().Zo();
    if (zxs7 != null)
      (new Zn4(this.ZH, this.ZD, this.Zl.Za(this.ZC, zxs7), paramZrj.Zg(), this.ZC, zxs7, this.Zc, this.Zg, this.ZZ)).ZO(paramZz4_); 
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public static void Zn(Zbqc[] paramArrayOfZbqc) {
    Zz = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZD() {
    return Zz;
  }
  
  static {
    if (ZD() == null)
      Zn(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkhc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */