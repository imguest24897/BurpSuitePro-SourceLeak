package burp;

public class Zb7s extends Zb7n {
  private final Zb73 Zh;
  
  private final Zb77 ZK;
  
  private final Zb7c Zs;
  
  private final Zb7d Zt;
  
  private static String[] Zu;
  
  public Zb7s(Zlfb paramZlfb, Ztdi paramZtdi, Zgx0 paramZgx0, Zkye paramZkye, Ztj1 paramZtj1, Zmxi paramZmxi) {
    Zefg<Zez3> zefg = ((Ze9i)paramZtj1.ZG()).Zno().ZCe();
    this.Zh = new Zb73(paramZtdi, paramZgx0, paramZmxi, zefg);
    this.ZK = new Zb77(paramZtj1, paramZlfb, paramZkye);
    this.Zs = new Zb7c(paramZkye);
    String[] arrayOfString = ZF();
    this.Zt = new Zb7d();
    Zn(this.Zh, new Zb7v(this.ZK, this.Zs), this.Zt);
    if (Zbqc.Zwu() == null)
      ZI(new String[3]); 
  }
  
  public void Zf(String paramString) {
    this.ZK.ZU(paramString);
  }
  
  public void ZX(String paramString) {
    this.ZK.ZR(paramString);
  }
  
  public void Zd(boolean paramBoolean) {
    this.ZK.Zd(paramBoolean);
  }
  
  public void ZT(int paramInt) {
    this.Zs.ZJ(paramInt);
  }
  
  public void ZM(int paramInt) {
    this.Zs.ZE(paramInt);
  }
  
  public void Z_(int paramInt) {
    this.Zs.Zl(paramInt);
  }
  
  public void Zc(String paramString) {
    this.Zt.ZF(paramString);
  }
  
  public void ZG() {
    this.Zh.ZL();
  }
  
  public void ZA(int paramInt) {
    this.Zh.ZI(paramInt);
  }
  
  public void Zm(int paramInt) {
    this.Zh.Zu(paramInt);
  }
  
  public void ZX() {
    this.Zt.ZT();
  }
  
  public void ZJ() {
    this.Zt.Zb();
  }
  
  public static void ZI(String[] paramArrayOfString) {
    Zu = paramArrayOfString;
  }
  
  public static String[] ZF() {
    return Zu;
  }
  
  static {
    if (ZF() == null)
      ZI(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb7s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */