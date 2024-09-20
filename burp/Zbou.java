package burp;

import net.portswigger.Zsy;

public class Zbou implements Zm9n {
  private final Ze3n Zg;
  
  private final Zxs7 ZN;
  
  private final Zbnt ZG;
  
  private final Zmhe Zs;
  
  private final Zsy ZA;
  
  private final int Zc;
  
  public Zbou(Ze3n paramZe3n, Zxs7 paramZxs7, Zkq4 paramZkq4, Zbnt paramZbnt, Zmhe paramZmhe, Zsy paramZsy) {
    this.Zg = paramZe3n;
    this.ZN = paramZxs7;
    this.ZG = paramZbnt;
    this.Zs = paramZmhe;
    this.ZA = paramZsy;
    this.Zc = paramZkq4.ZqT().ZH(Zlk4.NORMAL) ? 2 : 1;
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_WebCacheEntanglement;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    Zmhe zmhe = this.Zs.Zg();
    Zso9 zso9 = new Zso9(this.Zg, zmhe, this.ZN, this.ZG, paramZz4_, this.Zc, this.ZA);
    zso9.ZM();
    Ztaa ztaa = new Ztaa(zmhe, this.Zg, this.ZN, this.ZG, this.ZA, paramZz4_, this.Zc);
    if (ztaa.Zz())
      ztaa.Zi(); 
  }
  
  public boolean Zf() {
    return (!(this.ZN instanceof Zlh) && this.ZN.Z_() == Zs66.URL_PARAM);
  }
  
  public String toString() {
    return Zp().name();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbou.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */