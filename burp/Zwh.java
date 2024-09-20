package burp;

public class Zwh extends Zni implements Zb4i {
  @Zzvo(1)
  private Zelu Zb;
  
  @Zzvo(2)
  private Zg0d Zw;
  
  @Zzvo(3)
  private Zk2m Za;
  
  @Zzvo(4)
  private Zr2v Zx;
  
  private static String Zu;
  
  public Zeu4<? extends Zb4i> ZF() {
    return Zl;
  }
  
  public Zwh(Zelu paramZelu, Zg0d paramZg0d, Zk2m paramZk2m, Zr2v paramZr2v) {
    this.Zb = paramZelu;
    this.Zw = paramZg0d;
    this.Za = paramZk2m;
    this.Zx = paramZr2v;
  }
  
  public boolean equals(Object paramObject) {
    return super.equals(paramObject) ? true : Zmhf.Zm(this, paramObject);
  }
  
  public int hashCode() {
    return Zmhf.ZF(this);
  }
  
  public Zelu ZM4() {
    return this.Zb;
  }
  
  public Zg0d ZM2() {
    return this.Zw;
  }
  
  public Zk2m ZMF() {
    return this.Za;
  }
  
  public Zr2v ZMQ() {
    return this.Zx;
  }
  
  public static void Zp(String paramString) {
    Zu = paramString;
  }
  
  public static String Zgl() {
    return Zu;
  }
  
  static {
    if (Zgl() != null)
      Zp("G0IcYb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */