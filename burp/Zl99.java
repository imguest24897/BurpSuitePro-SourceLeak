package burp;

import java.util.function.Predicate;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zl99 extends Zl9l {
  private final Predicate<Zez3> Zl;
  
  final Zsn Zw;
  
  private Zl99(Zsn paramZsn, Predicate<Zez3> paramPredicate) {
    this.Zl = paramPredicate;
  }
  
  protected boolean ZF(Zez3 paramZez3) {
    try {
      this.Zw.ZZ(this.Zl, paramZez3);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl99.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */