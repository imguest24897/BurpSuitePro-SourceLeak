package burp;

public class Zlup {
  private final Zls2 ZC;
  
  private final Zzwk ZP;
  
  private final Zxpd Ze;
  
  private final Zx0j ZA;
  
  private static int Z_;
  
  public Zlup(Zls2 paramZls2, Zzwk paramZzwk, Zxpd paramZxpd) {
    this.ZC = paramZls2;
    this.ZP = paramZzwk;
    this.Ze = paramZxpd;
    this.ZA = new Zx0j(paramZls2);
  }
  
  public Zbi2 Zh(Zb3n paramZb3n) {
    this.ZA.Zn(paramZb3n);
    Zes3 zes3 = this.ZA.ZN();
    this.ZC.ZW().ZZ(zes3);
    int i = Zu();
    if (Zbqc.Zwu() == null)
      ZZ(++i); 
    return new Zbi2(this.ZC, zes3, this.ZP, this.Ze);
  }
  
  public static void ZZ(int paramInt) {
    Z_ = paramInt;
  }
  
  public static int Zu() {
    return Z_;
  }
  
  public static int ZT() {
    int i = Zu();
    return (i == 0) ? 22 : 0;
  }
  
  static {
    if (Zu() != 0)
      ZZ(25); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlup.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */