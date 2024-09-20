package burp;

public class Zbi2 {
  private final Zes3 Zx;
  
  private final Zz9_ Zp;
  
  private final Zxpd Zz;
  
  private final Zb34 Zd;
  
  private Zxc1 Z_;
  
  public Zbi2(Zls2 paramZls2, Zes3 paramZes3, Zzwk paramZzwk, Zxpd paramZxpd) {
    this.Zx = paramZes3;
    this.Zp = new Zz9_(paramZls2, paramZes3, paramZzwk, paramZxpd);
    this.Zz = paramZxpd;
    this.Zd = new Zb34(paramZes3);
  }
  
  public Zsdd Zq() {
    this.Z_ = null;
    return ZE();
  }
  
  public Zsdd ZE() {
    String[] arrayOfString = Zsdd.Zv();
    if (this.Z_ == null) {
      this.Z_ = ZD();
      if (this.Z_ == null)
        return null; 
    } 
    Zsdd zsdd = null;
    while (zsdd == null) {
      zsdd = this.Z_.Zi();
      if (zsdd == null) {
        this.Z_ = ZD();
        if (this.Z_ == null)
          return null; 
        zsdd = this.Z_.Zi();
        if (arrayOfString != null)
          break; 
      } 
    } 
    return zsdd;
  }
  
  private Zxc1 ZD() {
    Zkal zkal = this.Zp.Zo();
    if (zkal == null)
      return null; 
    Zrn9 zrn9 = this.Zp.Zy(zkal);
    this.Zd.Zp(zrn9);
    this.Z_ = new Zxc1(this.Zx, zrn9, this.Zz);
    return this.Z_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbi2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */