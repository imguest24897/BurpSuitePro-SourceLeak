package burp;

import java.util.function.Predicate;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zl92 extends Zl9l {
  private final Predicate<Zez3> ZH;
  
  final Zt8n Zd;
  
  private Zl92(Zt8n paramZt8n, Predicate<Zez3> paramPredicate) {
    this.ZH = paramPredicate;
  }
  
  protected boolean ZF(Zez3 paramZez3) {
    try {
      this.Zd.ZY(this.ZH, paramZez3);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl92.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */