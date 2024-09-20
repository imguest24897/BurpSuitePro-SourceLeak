package burp;

import net.portswigger.Zsy;

public class Ztam implements Zl3w {
  private final Zrgd Zl;
  
  private final Zsy Zj;
  
  private final Ztb7 ZG;
  
  private final Zrxn Zo;
  
  public Ztam(Zrgd paramZrgd, Zsy paramZsy, Ztb7 paramZtb7, Zrxn paramZrxn) {
    this.Zl = paramZrgd;
    this.Zj = paramZsy;
    this.ZG = paramZtb7;
    this.Zo = paramZrxn;
  }
  
  public Zkm ZD(Zmzk paramZmzk) {
    Zrt_ zrt_ = this.ZG.Zc(paramZmzk);
    Zkjm zkjm1 = null;
    if (zrt_ != null)
      zkjm1 = zrt_.ZD(); 
    Zkjm zkjm2 = this.Zo.ZH(paramZmzk);
    boolean bool1 = (zkjm1 != null && zkjm1.Zn() != 0) ? true : false;
    boolean bool2 = (zkjm2 != null && zkjm2.Zn() != 0) ? true : false;
    if (bool1 || bool2) {
      Zmzk zmzk = (zrt_ != null) ? zrt_.ZH() : paramZmzk;
      return paramZmzk.ZJZ() ? new Zr_g(this.Zl, zkjm2, this.Zj) : new Zsbb(paramZmzk, zmzk, this.Zl, zkjm2, zkjm1, this.Zj);
    } 
    return new Zgy9();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztam.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */