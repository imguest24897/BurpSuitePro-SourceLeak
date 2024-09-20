package burp;

public class Ztzu implements Zst8 {
  private final Ztds ZU;
  
  private Ztzu(Zz51 paramZz51, long paramLong, int paramInt) {
    this.ZU = new Ztds(paramZz51, paramLong, paramInt);
  }
  
  public void Zp(String paramString, Object... paramVarArgs) {
    Zbwf.ZJ(this.ZU, paramString, paramVarArgs, Zzjs.ERROR);
  }
  
  public void Zy(String paramString, Object... paramVarArgs) {
    Zbwf.ZJ(this.ZU, paramString, paramVarArgs, Zzjs.INFO);
  }
  
  public void Zb(String paramString, Object... paramVarArgs) {
    Zbwf.ZJ(this.ZU, paramString, paramVarArgs, Zzjs.DEBUG);
  }
  
  public void ZS(String paramString, Object... paramVarArgs) {
    Zbwf.ZJ(this.ZU, paramString, paramVarArgs, Zzjs.TRACE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztzu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */