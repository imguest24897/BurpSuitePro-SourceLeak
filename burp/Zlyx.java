package burp;

import net.portswigger.Zsy;

public class Zlyx implements Zm9n {
  private final Zsy ZV;
  
  private final Zmhe ZN;
  
  private final Ze3n Zq;
  
  private final Zxs7 Zz;
  
  private final Zbnt ZB;
  
  private final Zkq4 Zv;
  
  private static int Zf;
  
  public Zlyx(Zsy paramZsy, Zmhe paramZmhe, Ze3n paramZe3n, Zxs7 paramZxs7, Zbnt paramZbnt, Zkq4 paramZkq4) {
    this.ZV = paramZsy;
    this.ZN = paramZmhe;
    this.Zq = paramZe3n;
    int i = Z_();
    this.Zz = paramZxs7;
    this.ZB = paramZbnt;
    this.Zv = paramZkq4;
    if (Zbqc.Zwu() == null)
      Zx(++i); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_XmlEntityExpansion;
  }
  
  public boolean Zf() {
    return (this.Zz.ZZ(this.Zv) && Zg6o.Zx(this.Zz));
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    (new Zxk0(this.ZV, this.ZN, this.Zq, this.Zz, this.ZB)).Zv(paramZz4_);
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public static void Zx(int paramInt) {
    Zf = paramInt;
  }
  
  public static int Z_() {
    return Zf;
  }
  
  public static int Zr() {
    int i = Z_();
    return (i == 0) ? 52 : 0;
  }
  
  static {
    if (Z_() == 0)
      Zx(102); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlyx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */