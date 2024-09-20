package burp;

import java.util.List;

class Zrg5 extends Zrgt {
  Zrg5(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe);
  }
  
  protected boolean ZH(List<Zt8g> paramList) {
    int i = Zrgr.Zi();
    for (Zt8g zt8g : paramList) {
      if (zt8g.ZbQ() == Zrdu.COOKIE && ZS(zt8g.Zbn()))
        return true; 
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  protected boolean ZO(List<Ztbr> paramList) {
    int i = Zrgr.ZU();
    for (Ztbr ztbr : paramList) {
      if (ZS(ztbr.Zq0()))
        return true; 
      if (i != 0)
        break; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrg5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */