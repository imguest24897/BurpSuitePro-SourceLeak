package burp;

public class Ztk8 {
  private final Zgq<Zrdb> ZN;
  
  private static int Zo;
  
  private Ztk8(Zgq<Zrdb> paramZgq) {
    this.ZN = paramZgq;
  }
  
  public Zgq<Zrdb> ZN() {
    return this.ZN;
  }
  
  public Ztk8 Zh(Ztk8 paramZtk8) {
    Zgq<Zrdb> zgq = (this.ZN.ZY() > 0 || paramZtk8.ZN.ZY() > 0) ? new Zgq<>() : Zgq.<Zgpi>ZI();
    if (this.ZN.ZY() > 0)
      zgq.ZF(this.ZN); 
    if (paramZtk8.ZN.ZY() > 0)
      zgq.ZF(paramZtk8.ZN); 
    return new Ztk8(zgq);
  }
  
  public static Ztk8 ZD() {
    return new Ztk8(Zgq.ZI());
  }
  
  public static Ztk8 ZY(Zsqx<Zrdb> paramZsqx) {
    return new Ztk8(Zgq.Zo(paramZsqx));
  }
  
  public static Ztk8 Zy(Zgq<Zrdb> paramZgq) {
    return new Ztk8(paramZgq);
  }
  
  public static void ZC(int paramInt) {
    Zo = paramInt;
  }
  
  public static int Zz() {
    return Zo;
  }
  
  public static int ZW() {
    int i = Zz();
    return (i == 0) ? 11 : 0;
  }
  
  static {
    if (ZW() == 0)
      ZC(60); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztk8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */