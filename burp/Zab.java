package burp;

public class Zab extends Zni implements Zsph {
  @Zzvo(1)
  private final Zefg<Zzme> Zc;
  
  @Zzvo(2)
  private int Zx;
  
  @Zzvo(3)
  private final Zs8g Zs;
  
  public Zab(Zefg<Zzme> paramZefg, Zs8g paramZs8g) {
    this.Zc = paramZefg;
    this.Zs = paramZs8g;
  }
  
  public Zeu4<? extends Zsph> ZF() {
    return ZH;
  }
  
  public Zefg<Zzme> ZsI() {
    return this.Zc;
  }
  
  public Zs8g Zs_() {
    return this.Zs;
  }
  
  public int Zss() {
    String str = Ztp6.Zu();
    synchronized (Zz6()) {
      if (Zbqc.Zwu() == null)
        Ztp6.ZZ("P1Pmg"); 
      return ++this.Zx;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zab.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */