package burp;

public class Zxqc extends Zxsr implements Zxxx {
  private static boolean ZO;
  
  protected Zxqc(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public void Zhj() {
    this.Za.ZM(this, Zk_q.ZU, ZhM() + 1);
  }
  
  public int ZhM() {
    return this.Za.Zx(this, Zk_q.ZU);
  }
  
  public void ZID(int paramInt) {
    this.Za.ZM(this, Zk_q.ZU, paramInt);
  }
  
  public int ZhY() {
    return this.Za.Zx(this, Zk_q.Zl);
  }
  
  public void ZIK(int paramInt) {
    this.Za.ZM(this, Zk_q.Zl, paramInt);
  }
  
  public int Zha() {
    return this.Za.Zx(this, Zk_q.ZX);
  }
  
  public int Zhx() {
    int i = this.Za.Zx(this, Zk_q.ZX) + 1;
    this.Za.ZM(this, Zk_q.ZX, i);
    return i;
  }
  
  public void ZIU(int paramInt) {
    this.Za.ZM(this, Zk_q.ZX, paramInt);
  }
  
  public boolean Zh_() {
    return this.Za.Zi(this, Zk_q.ZP);
  }
  
  public void ZhQ() {
    this.Za.ZH(this, Zk_q.ZP, true);
  }
  
  public boolean Zhw() {
    return this.Za.Zi(this, Zk_q.ZW);
  }
  
  public void Zby(boolean paramBoolean) {
    this.Za.ZH(this, Zk_q.ZW, paramBoolean);
  }
  
  public boolean ZhI() {
    return this.Za.Zi(this, Zk_q.Zn);
  }
  
  public void Zbd(boolean paramBoolean) {
    this.Za.ZH(this, Zk_q.Zn, paramBoolean);
  }
  
  public Zlfa Zh5() {
    return this.Za.<Zlfa>ZJ(this, Zk_q.ZS);
  }
  
  public Zzcq<Zgxp> Zhi() {
    return new Zzcq<>((Zefg<Zgxp>)this.Za.ZJ(this, Zk_q.Zz));
  }
  
  public static void ZOx(boolean paramBoolean) {
    ZO = paramBoolean;
  }
  
  public static boolean ZBW() {
    return ZO;
  }
  
  public static boolean ZBA() {
    boolean bool = ZBW();
    return !bool;
  }
  
  static {
    if (!ZBW())
      ZOx(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxqc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */