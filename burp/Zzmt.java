package burp;

public class Zzmt implements Zehc {
  private final Ze3n Zf;
  
  private static boolean ZF;
  
  public Zzmt(Ze3n paramZe3n) {
    this.Zf = paramZe3n;
  }
  
  public Ztk8 Zb() {
    return (ZT() && Zh()) ? Ztk8.ZY(Zxf7.Zg(this.Zf.Za(), this.Zf.ZN(), this.Zf.Zt())) : Ztk8.ZD();
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_LongRedirection;
  }
  
  private boolean ZT() {
    short s = this.Zf.ZL().Ze();
    return (s >= 300 && s < 400);
  }
  
  private boolean Zh() {
    return (this.Zf.ZL().ZF() - this.Zf.ZL().Zs() >= 2048);
  }
  
  public static void Zd(boolean paramBoolean) {
    ZF = paramBoolean;
  }
  
  public static boolean ZO() {
    return ZF;
  }
  
  public static boolean Zg() {
    boolean bool = ZO();
    return !bool;
  }
  
  static {
    if (!Zg())
      Zd(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzmt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */