package burp;

public class Zzgm {
  private final Zl7h Zz;
  
  private final Zz1m<Zt18> Zh;
  
  private static int Ze;
  
  public Zzgm(Zl7h paramZl7h, Zz1m<Zt18> paramZz1m) {
    this.Zz = paramZl7h;
    this.Zh = paramZz1m;
  }
  
  public void Z_(Zlli<Zt35> paramZlli) {
    paramZlli.ZE(Zt35.Zo, this::lambda$subscribeTo$0);
  }
  
  private void Zd() {
    this.Zh.ZD(new Zxr8(Zt18.ZY, Integer.valueOf(this.Zz.ZVP().ZXY())));
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    Zd();
  }
  
  public static void Zq(int paramInt) {
    Ze = paramInt;
  }
  
  public static int Zb() {
    return Ze;
  }
  
  public static int Zo() {
    int i = Zb();
    return (i == 0) ? 86 : 0;
  }
  
  static {
    if (Zo() == 0)
      Zq(44); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzgm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */