package burp;

public class Zzt0 implements Zg_ {
  private final Zrlj ZR;
  
  public Zzt0(Zrlj paramZrlj) {
    this.ZR = paramZrlj;
  }
  
  public boolean ZS(Zzih paramZzih) {
    char c = paramZzih.ZO(paramZzih.ZD);
    if (this.ZR.ZX(c)) {
      paramZzih.Zm(new Zsvc(Zgho.LINE_TERMINATOR, Character.valueOf(c), paramZzih.Za, paramZzih.ZD, paramZzih.ZD + 1));
      paramZzih.ZD++;
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzt0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */