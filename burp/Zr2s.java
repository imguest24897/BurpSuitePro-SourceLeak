package burp;

public class Zr2s extends Zr9a {
  private final boolean ZU;
  
  private final Ztlj ZM;
  
  private final Zefg<Zxtl> Zt;
  
  private final int Zv;
  
  public String Zn = null;
  
  private static String ZE;
  
  public Zr2s(Ztlj paramZtlj, Zefg<Zxtl> paramZefg, int paramInt, boolean paramBoolean) {
    this.ZM = paramZtlj;
    this.Zt = paramZefg;
    this.Zv = paramInt;
    this.ZU = paramBoolean;
  }
  
  private void ZV() {
    this.Zn = Zx_r.ZB(this.ZM.Zq(Ztz3.LOCATION), this.Zt, this.Zv, this.ZU);
  }
  
  public Zte7 Zz(Zrp9 paramZrp9) {
    ZV();
    return Zte7.CONTINUE;
  }
  
  public Zte7 ZJ(Zkcp paramZkcp) {
    ZV();
    return Zte7.CONTINUE;
  }
  
  public static void ZF(String paramString) {
    ZE = paramString;
  }
  
  public static String ZQ() {
    return ZE;
  }
  
  static {
    if (ZQ() != null)
      ZF("nPtYl"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr2s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */