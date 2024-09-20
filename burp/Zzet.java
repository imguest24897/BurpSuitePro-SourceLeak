package burp;

import java.util.List;

public class Zzet extends Zzek {
  protected void ZJ(Zstu paramZstu, Zs68 paramZs68, List<Zl1r> paramList) {
    if (paramZs68.ZH.Zj != 260)
      return; 
    Zzmg.Zy(paramZstu, paramZs68.Zd(), paramZstu.Zpu()).forEach(paramList::lambda$highlightResponseIndependent$0);
  }
  
  private static void lambda$highlightResponseIndependent$0(List<Zl1r> paramList, Zt8g paramZt8g) {
    paramList.add(new Zl1r(paramZt8g.Zba(), paramZt8g.ZbZ()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzet.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */