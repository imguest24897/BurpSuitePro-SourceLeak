package burp;

import net.portswigger.Zsy;

public class Zm0k implements Zm9n {
  private final Ze3n Zr;
  
  private final Zbph Za;
  
  private final Zxs7 Zu;
  
  private final Zsvs Zb;
  
  private final Zmg6 Zt;
  
  private final Zt7z Zv;
  
  private static int ZL;
  
  public Zm0k(Ze3n paramZe3n, Zbph paramZbph, Zxs7 paramZxs7, Zmhe paramZmhe, Zsy paramZsy, Zmg6 paramZmg6) {
    this.Zr = paramZe3n;
    int i = ZZ();
    this.Za = paramZbph;
    this.Zu = paramZxs7;
    this.Zb = paramZmhe.<Zsvs>Zq(new Zbsh(), new Zedl());
    this.Zt = paramZmg6;
    this.Zv = new Zt7z(paramZmhe, paramZxs7, paramZsy, paramZmg6);
    if (i == 0)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_SuspiciousInputTransformation;
  }
  
  public boolean Zf() {
    return this.Zu.ZZ(this.Za);
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    int i = Zn();
    this.Zv.Zk(this.Zt);
    if (!Zf(Ze3c.INVALID_UTF8_DECODING_VARIANT_MAP, paramZz4_))
      Zf(Ze3c.OVERLONG_UTF8_DECODING_VARIANT_MAP, paramZz4_); 
    Ze3c[] arrayOfZe3c = Ze3c.values();
    int j = arrayOfZe3c.length;
    byte b = 0;
    while (b < j) {
      Ze3c ze3c = arrayOfZe3c[b];
      if (ze3c != Ze3c.INVALID_UTF8_DECODING_VARIANT_MAP && ze3c != Ze3c.OVERLONG_UTF8_DECODING_VARIANT_MAP)
        Zf(ze3c, paramZz4_); 
      b++;
      if (i != 0)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      ZK(++i); 
  }
  
  private boolean Zf(Ze3c paramZe3c, Zz4_ paramZz4_) {
    for (Zsjk zsjk : paramZe3c.ZA) {
      Zku6 zku6 = this.Zt.Zq(zsjk);
      if (!zku6.Zh())
        continue; 
      paramZz4_.Zz(this.Zb.Zg(this.Zr.ZN(), zku6, this.Zu, paramZe3c.Zo, zsjk.Z_()));
      return true;
    } 
    return false;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public static void ZK(int paramInt) {
    ZL = paramInt;
  }
  
  public static int ZZ() {
    return ZL;
  }
  
  public static int Zn() {
    int i = ZZ();
    return (i == 0) ? 83 : 0;
  }
  
  static {
    if (ZZ() == 0)
      ZK(116); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm0k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */