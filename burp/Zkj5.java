package burp;

import java.util.function.BiPredicate;

class Zkj5 {
  private final int Zl;
  
  private final BiPredicate<Zkq4, Zes1> Zx;
  
  private Zkj5(int paramInt, BiPredicate<Zkq4, Zes1> paramBiPredicate) {
    this.Zl = paramInt;
    this.Zx = paramBiPredicate;
  }
  
  int ZD(Zkq4 paramZkq4, Zes1 paramZes1) {
    return this.Zx.test(paramZkq4, paramZes1) ? this.Zl : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkj5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */