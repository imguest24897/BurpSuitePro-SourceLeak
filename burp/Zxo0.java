package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zto;

public class Zxo0 {
  private final List<Zto<Zkq2, Zl1a>> Zy = new ArrayList<>();
  
  public void ZT(Zkq2 paramZkq2, Zl1a paramZl1a) {
    this.Zy.add(Zto.ZM(paramZkq2, paramZl1a));
  }
  
  public Zmf Zb(Zgv1 paramZgv1) {
    return this.Zy.stream().filter(paramZgv1::lambda$route$0).findFirst().map(Zxo0::lambda$route$1).map(paramZgv1::lambda$route$2).orElse(null);
  }
  
  private static Zmf lambda$route$2(Zgv1 paramZgv1, Zl1a paramZl1a) {
    return paramZl1a.Zy(paramZgv1);
  }
  
  private static Zl1a lambda$route$1(Zto paramZto) {
    return (Zl1a)paramZto.Zo;
  }
  
  private static boolean lambda$route$0(Zgv1 paramZgv1, Zto paramZto) {
    return ((Zkq2)paramZto.Zq).ZA(paramZgv1.Zp());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxo0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */