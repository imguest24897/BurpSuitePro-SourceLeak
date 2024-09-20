package burp;

class Zmyj implements Zg_ {
  private final Zxrz ZS;
  
  public Zmyj(Zxrz paramZxrz) {
    this.ZS = paramZxrz;
  }
  
  public boolean ZS(Zzih paramZzih) {
    int[] arrayOfInt = Ztw7.Zz();
    if (!this.ZS.Zy(paramZzih))
      return false; 
    int i = paramZzih.ZD + 1;
    while (i < paramZzih.Zp && this.ZS.Zy(paramZzih, i)) {
      i++;
      if (arrayOfInt == null)
        break; 
    } 
    Object object = this.ZS.Zi(paramZzih, i);
    if (object != null) {
      paramZzih.Zm(new Zsvc(Zgho.LITERAL_NUMBER, object, paramZzih.Za, paramZzih.ZD, i));
      paramZzih.ZD = i;
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmyj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */