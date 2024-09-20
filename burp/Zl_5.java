package burp;

import java.util.Arrays;
import java.util.List;

public class Zl_5 {
  private final List<Zmgf> Zg;
  
  public Zl_5(Zxpd paramZxpd) {
    this.Zg = Arrays.asList(new Zmgf[] { new Zedi(paramZxpd), new Zmkd(paramZxpd), new Zlp0(paramZxpd) });
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public boolean ZM(Zkr1<Zmv4> paramZkr1, int paramInt, Zrn9 paramZrn9) {
    Zbqc[] arrayOfZbqc = Zedi.ZV();
    if (paramInt == 0 || !Zk(paramInt, paramZrn9))
      return false; 
    for (Zmgf zmgf : this.Zg) {
      if (zmgf.Ze(paramZkr1, paramInt, paramZrn9))
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private boolean Zk(int paramInt, Zrn9 paramZrn9) {
    Zb3t zb3t = paramZrn9.Zp().get(paramInt - 1);
    Zgbi zgbi = paramZrn9.Zx().get(zb3t);
    return Zl19.ZO(zgbi.ZX());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl_5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */