package burp;

import java.util.List;

class Zrgy extends Zrgt {
  Zrgy(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe);
  }
  
  protected boolean ZH(List<Zt8g> paramList) {
    int i = Zrgr.ZU();
    for (Zt8g zt8g : paramList) {
      if (zt8g.ZbQ() == Zrdu.COOKIE && ZS(zt8g.Zns()))
        return true; 
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  protected boolean ZO(List<Ztbr> paramList) {
    int i = Zrgr.Zi();
    for (Ztbr ztbr : paramList) {
      if (ZS(ztbr.Zqy()))
        return true; 
      if (i == 0)
        break; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrgy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */