package burp;

public class Zb_x implements Zs79 {
  private final Zxxx Zl;
  
  private final Zz1y Zt;
  
  private static String ZM;
  
  public Zb_x(Zxxx paramZxxx, Zz1y paramZz1y) {
    this.Zl = paramZxxx;
    this.Zt = paramZz1y;
  }
  
  public void ZT() {
    this.Zt.ZMk(this.Zt.ZfC() + 1);
  }
  
  public void Z_() {
    this.Zt.ZMl(this.Zt.Zfh() + 1);
  }
  
  public int ZO() {
    return this.Zt.ZfC();
  }
  
  public int Zc() {
    return this.Zt.Zfh();
  }
  
  public void Zo() {
    this.Zl.Zhj();
  }
  
  public int Zv() {
    return this.Zl.ZhM();
  }
  
  public boolean ZV() {
    return (this.Zl.ZhY() == -1);
  }
  
  public void Zm(int paramInt) {
    this.Zl.ZIK(paramInt);
  }
  
  public int ZZ() {
    return this.Zl.ZhY();
  }
  
  public int ZX() {
    return this.Zl.Zhf();
  }
  
  public int Zw() {
    return this.Zl.Zha();
  }
  
  public int Zq() {
    return this.Zl.Zhx();
  }
  
  public boolean Zj() {
    return this.Zl.Zh_();
  }
  
  public void Zk() {
    this.Zl.ZhQ();
  }
  
  public boolean Zl() {
    return this.Zl.Zhw();
  }
  
  public int Zx() {
    return Zl() ? 100 : (int)(Zv() * 100.0D / ZZ());
  }
  
  public void Zo(boolean paramBoolean) {
    this.Zl.Zby(paramBoolean);
  }
  
  public static void ZW(String paramString) {
    ZM = paramString;
  }
  
  public static String ZE() {
    return ZM;
  }
  
  static {
    if (ZE() != null)
      ZW("Cljdi"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb_x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */