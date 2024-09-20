package burp;

public abstract class Zx9w extends Zxsr implements Zz_b {
  private static String ZY;
  
  protected Zx9w(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zz_4 ZML() {
    return Zz_4.Zk(this.Za.Zx(this, Zkwc.ZS));
  }
  
  public String ZMm() {
    return this.Za.Zf(this, Zkwc.Zb);
  }
  
  public String ZMp() {
    return this.Za.Zf(this, Zkwc.Zx);
  }
  
  public String ZMg() {
    return this.Za.Zf(this, Zkwc.Zo);
  }
  
  public Zefg<Zsdr> ZMo() {
    String str = Zjz();
    Zefg<Zgpi> zefg = (Zefg)this.Za.ZJ(this, Zkwc.ZY);
    if (zefg == null) {
      String str1 = ZMp();
      zefg = Zkk.Zl(this.Za, Zsdr.Zo, (str1 == null) ? 0 : 1);
      if (str1 != null)
        zefg.add(this.Za.Zz(str1)); 
      this.Za.Zq(this, Zkwc.ZY, zefg);
    } 
    if (Zbqc.Zwu() == null)
      ZS("XVQqNb"); 
    return (Zefg)zefg;
  }
  
  public static void ZS(String paramString) {
    ZY = paramString;
  }
  
  public static String Zjz() {
    return ZY;
  }
  
  static {
    if (Zjz() != null)
      ZS("iduFy"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx9w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */