package burp;

import java.util.List;

public class Zxzn implements Zlic {
  public void Zf(Zstu paramZstu1, Zs68 paramZs681, Zstu paramZstu2, Zs68 paramZs682, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    Zrtg zrtg = new Zrtg(paramZstu1, paramZs681.Zd(), Zm(paramZstu1, paramZs681.Zd()), paramZstu2, paramZs682.Zd(), Zm(paramZstu2, paramZs682.Zd()), null);
    Zebz.Zi(paramList1, paramList2, zrtg.ZT());
  }
  
  private int Zm(Zstu paramZstu, int paramInt) {
    int[] arrayOfInt = Zgim.ZP();
    int i = paramInt;
    while (i < paramZstu.Zpu()) {
      if (paramZstu.Zp(i) <= 32)
        return i; 
      i++;
      if (arrayOfInt != null)
        break; 
    } 
    return paramZstu.Zpu();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxzn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */