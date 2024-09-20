package burp;

public class Zmac implements Zg_ {
  private final Zew7 Zi;
  
  public Zmac(Zew7 paramZew7) {
    this.Zi = paramZew7;
  }
  
  public boolean ZS(Zzih paramZzih) {
    int i = paramZzih.ZD;
    String str = this.Zi.ZM(paramZzih);
    int[] arrayOfInt = Ztw7.Zz();
    if (str != null) {
      StringBuilder stringBuilder = new StringBuilder();
      while (paramZzih.ZD < paramZzih.Zp && !this.Zi.ZX(paramZzih, str)) {
        stringBuilder.append(paramZzih.Z_());
        paramZzih.ZD++;
        if (arrayOfInt == null)
          break; 
      } 
      paramZzih.Zm(new Zsvc(Zgho.COMMENT, stringBuilder.toString(), paramZzih.Za, i, paramZzih.ZD));
      return true;
    } 
    if (Zbqc.Zwu() == null)
      Ztw7.Zt(new int[4]); 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmac.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */