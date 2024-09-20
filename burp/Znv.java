package burp;

public class Znv extends Zni implements Zmx {
  @Zzvo(0)
  private int ZB;
  
  @Zzvo(1)
  private String Zm;
  
  @Zzvo(2)
  private int ZD;
  
  @Zzvo(3)
  private final Zefg<Zzem> ZR;
  
  @Zzvo(4)
  private boolean Zl;
  
  @Zzvo(5)
  private int ZQ;
  
  private static String Zn;
  
  public Znv(int paramInt, String paramString, Zefg<Zzem> paramZefg) {
    this.ZB = paramInt;
    this.Zm = paramString;
    this.ZR = paramZefg;
    this.Zl = true;
  }
  
  public int Z_() {
    return this.ZB;
  }
  
  public void ZU(int paramInt) {
    this.ZB = paramInt;
  }
  
  public String Zc() {
    return this.Zm;
  }
  
  public void Zt(String paramString) {
    this.Zm = paramString;
  }
  
  public boolean ZC() {
    return this.Zl;
  }
  
  public void ZD(boolean paramBoolean) {
    this.Zl = paramBoolean;
  }
  
  public int ZT() {
    return ++this.ZD;
  }
  
  public int ZZ() {
    synchronized (Zz6()) {
      return this.ZQ++;
    } 
  }
  
  public Zefg<Zzem> Zp() {
    return this.ZR;
  }
  
  public Zeu4<? extends Zmx> ZF() {
    return Zmx.ZT;
  }
  
  public void ZHG() {}
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkl0.Zp, 150412623);
  }
  
  public static void ZK(String paramString) {
    Zn = paramString;
  }
  
  public static String ZQC() {
    return Zn;
  }
  
  static {
    if (ZQC() == null)
      ZK("lxyr2b"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Znv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */