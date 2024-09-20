package burp;

import java.util.List;

public class Zlp0 implements Zmgf {
  private final Zxpd ZD;
  
  public Zlp0(Zxpd paramZxpd) {
    this.ZD = paramZxpd;
  }
  
  public boolean Ze(Zkr1<Zmv4> paramZkr1, int paramInt, Zrn9 paramZrn9) {
    Zmv4 zmv42;
    Zmv4 zmv41 = paramZkr1.ZP();
    if (zmv41 instanceof Zlik)
      return false; 
    byte b = 2;
    do {
      zmv42 = paramZkr1.ZZ(b++);
    } while (zmv42 != null && zmv42 instanceof Zlik);
    if (zmv42 == null || zmv42.ZP() < paramInt)
      return false; 
    Zb3t zb3t1 = zmv41.ZM();
    Zb3t zb3t2 = paramZrn9.Zp().get(paramInt - 1);
    Zgbi zgbi = paramZrn9.Zx().get(zb3t2);
    Ztyn ztyn = (Ztyn)zgbi.ZX();
    List<List<Zgc7>> list = zb3t1.<List>ZO(Zxc6.FunctionCalls);
    if (list != null) {
      Ztmm ztmm = new Ztmm(list, ztyn, null, 0, this.ZD);
      return !ztmm.ZL();
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlp0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */