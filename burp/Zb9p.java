package burp;

public class Zb9p implements Zg_ {
  private final Zr9v Zd;
  
  private final Zbnd ZT;
  
  Zb9p(Zr9v paramZr9v, Zbnd paramZbnd) {
    this.Zd = paramZr9v;
    this.ZT = paramZbnd;
  }
  
  public boolean ZS(Zzih paramZzih) {
    int[] arrayOfInt = Ztw7.Zz();
    int i = paramZzih.ZD;
    if (!this.Zd.ZM(paramZzih.ZO(i)))
      return false; 
    while (++i < paramZzih.Zp && this.Zd.Zp(paramZzih.ZO(i))) {
      i++;
      if (arrayOfInt == null)
        break; 
    } 
    String str = paramZzih.Zn.substring(paramZzih.ZD, i);
    Zsvc zsvc = Zm(paramZzih, i, str);
    paramZzih.Zm(zsvc);
    paramZzih.ZD = i;
    return true;
  }
  
  private Zsvc Zm(Zzih paramZzih, int paramInt, String paramString) {
    Zgho zgho = this.ZT.ZS(paramString);
    return (zgho != null) ? new Zsvc(zgho, null, paramZzih.Za, paramZzih.ZD, paramInt) : new Zsvc(Zgho.IDENTIFIER, paramString, paramZzih.Za, paramZzih.ZD, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb9p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */