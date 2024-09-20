package burp;

import java.util.Collections;
import java.util.List;

public class Zz11 implements Zmrn {
  private final List<Zmrn> Zf;
  
  Zz11(List<Zmrn> paramList) {
    this.Zf = paramList;
  }
  
  public boolean Zk(Zzvx paramZzvx) {
    return this.Zf.stream().allMatch(paramZzvx::lambda$match$0);
  }
  
  public static Zz11 Zp() {
    return new Zz11(Collections.emptyList());
  }
  
  private static boolean lambda$match$0(Zzvx paramZzvx, Zmrn paramZmrn) {
    return paramZmrn.Zk(paramZzvx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz11.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */