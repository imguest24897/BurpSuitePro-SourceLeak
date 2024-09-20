package burp;

public abstract class Zxv7 extends Zxsr implements Zlx1 {
  private static boolean Ze;
  
  protected Zxv7(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public String ZGA() {
    return this.Za.ZJ(this, Zkp1.ZR);
  }
  
  public void ZHX(String paramString) {
    this.Za.Zn(this, Zkp1.ZR, paramString);
  }
  
  public int ZGS() {
    return this.Za.Zx(this, Zkp1.ZK);
  }
  
  public void ZXs(int paramInt) {
    this.Za.ZM(this, Zkp1.ZK, paramInt);
  }
  
  public Zzb7 ZGr() {
    return this.Za.<Zzb7>ZJ(this, Zkp1.Zq);
  }
  
  public void Zy(Zzb7 paramZzb7) {
    this.Za.Zq(this, Zkp1.Zq, paramZzb7);
  }
  
  public Zeu4<? extends Zlx1> ZF() {
    return ZY;
  }
  
  public static void ZKK(boolean paramBoolean) {
    Ze = paramBoolean;
  }
  
  public static boolean ZhY() {
    return Ze;
  }
  
  public static boolean Zhw() {
    boolean bool = ZhY();
    return !bool;
  }
  
  static {
    if (ZhY())
      ZKK(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxv7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */