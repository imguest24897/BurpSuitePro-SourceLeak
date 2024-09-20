package burp;

class Zsjq implements Zg_ {
  private final Zt3w Zm;
  
  public Zsjq(Zt3w paramZt3w) {
    this.Zm = paramZt3w;
  }
  
  public boolean ZS(Zzih paramZzih) {
    int[] arrayOfInt = Ztw7.Zz();
    int i = paramZzih.ZD;
    while (i < paramZzih.Zp && Zm(paramZzih.ZO(i))) {
      i++;
      if (arrayOfInt == null) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    if (i == paramZzih.ZD)
      return false; 
    paramZzih.ZD = i;
    return true;
  }
  
  private boolean Zm(char paramChar) {
    return (Zl(paramChar) || this.Zm.Zz(paramChar));
  }
  
  private boolean Zl(char paramChar) {
    return (paramChar == '\t' || paramChar == ' ');
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsjq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */