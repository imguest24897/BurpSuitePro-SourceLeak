package burp;

import java.util.function.Supplier;

public class Zb70 extends Zb7n {
  private final Zb73 ZK;
  
  private final Zb72 ZQ;
  
  private final Zb7e Zi;
  
  private final Zb7d Zm;
  
  private static boolean ZN;
  
  public Zb70(Ztj1 paramZtj1, Zlfb paramZlfb, Supplier<Zbs1> paramSupplier, Ztdi paramZtdi, Zgx0 paramZgx0, Zmxi paramZmxi) {
    this.ZK = new Zb73(paramZtdi, paramZgx0, paramZmxi, ((Zlog)paramZtj1.ZG()).ZnH().ZVH());
    this.ZQ = new Zb72(paramZtj1, paramZlfb);
    boolean bool = ZM();
    this.Zi = new Zb7e(paramSupplier);
    this.Zm = new Zb7d();
    Zn(this.ZK, new Zb7v(this.ZQ, this.Zi), this.Zm);
    if (Zbqc.Zwu() == null)
      Ze(!bool); 
  }
  
  public void ZL(String paramString) {
    this.ZQ.ZU(paramString);
  }
  
  public void Zs(String paramString) {
    this.ZQ.ZR(paramString);
  }
  
  public void ZK(int paramInt) {
    this.Zi.ZW(paramInt);
  }
  
  public void ZC(Integer paramInteger) {
    this.Zi.Zn(paramInteger);
  }
  
  public void Zn(Integer paramInteger) {
    this.Zi.Zy(paramInteger);
  }
  
  public void ZE() {
    this.ZK.ZL();
  }
  
  public void Zb(int paramInt) {
    this.ZK.ZI(paramInt);
  }
  
  public void ZI(int paramInt) {
    this.ZK.Zu(paramInt);
  }
  
  public void ZX() {
    this.Zi.Zm();
    this.Zm.ZT();
  }
  
  public void ZJ() {
    this.Zi.Zf();
    this.Zm.Zb();
  }
  
  public void ZH(String paramString) {
    this.Zm.ZF(paramString);
  }
  
  public static void Ze(boolean paramBoolean) {
    ZN = paramBoolean;
  }
  
  public static boolean Zc() {
    return ZN;
  }
  
  public static boolean ZM() {
    boolean bool = Zc();
    return !bool;
  }
  
  static {
    if (ZM())
      Ze(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb70.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */