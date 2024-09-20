package burp;

public class Zlm7 implements Zst8 {
  private final Ztds ZW;
  
  private static int ZD;
  
  public Zlm7(Zz51 paramZz51, long paramLong) {
    this.ZW = new Ztds(paramZz51, paramLong);
  }
  
  public void Zp(String paramString, Object... paramVarArgs) {
    Zbwf.ZJ(this.ZW, paramString, paramVarArgs, Zzjs.ERROR);
  }
  
  public void Zy(String paramString, Object... paramVarArgs) {
    Zbwf.ZJ(this.ZW, paramString, paramVarArgs, Zzjs.INFO);
  }
  
  public void Zb(String paramString, Object... paramVarArgs) {
    Zbwf.ZJ(this.ZW, paramString, paramVarArgs, Zzjs.DEBUG);
  }
  
  public void ZS(String paramString, Object... paramVarArgs) {
    Zbwf.ZJ(this.ZW, paramString, paramVarArgs, Zzjs.TRACE);
  }
  
  public static void Zx(int paramInt) {
    ZD = paramInt;
  }
  
  public static int Zr() {
    return ZD;
  }
  
  public static int Zf() {
    int i = Zr();
    return (i == 0) ? 112 : 0;
  }
  
  static {
    if (Zf() == 0)
      Zx(106); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlm7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */