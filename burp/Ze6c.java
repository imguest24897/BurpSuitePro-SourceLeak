package burp;

public class Ze6c implements Zsmb {
  private final Zsmb[] ZX;
  
  public Ze6c(Zsmb... paramVarArgs) {
    this.ZX = paramVarArgs;
  }
  
  public Zsov ZK(Zxs7 paramZxs7, int paramInt, String paramString, Zsjk paramZsjk, byte paramByte, Ztpk paramZtpk, boolean paramBoolean, Zgk_ paramZgk_) {
    Zsmb[] arrayOfZsmb = this.ZX;
    int i = arrayOfZsmb.length;
    boolean bool = Zegx.Zi();
    byte b = 0;
    while (b < i) {
      Zsmb zsmb = arrayOfZsmb[b];
      Zsov zsov = zsmb.ZK(paramZxs7, paramInt, paramString, paramZsjk, paramByte, paramZtpk, paramBoolean, paramZgk_);
      if (zsov != null)
        return zsov; 
      b++;
      if (!bool)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze6c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */