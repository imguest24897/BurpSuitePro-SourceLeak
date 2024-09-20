package burp;

import java.util.Collections;
import java.util.List;

public class Zm7b {
  private List<Zm5y> Z_ = Collections.emptyList();
  
  public void Zh(List<Zm5y> paramList) {
    this.Z_ = paramList;
  }
  
  public String Zl(int paramInt) {
    return this.Z_.stream().filter(paramInt::lambda$errorCauseFor$0).map(Zm5y::ZQ).findFirst().orElse(null);
  }
  
  private static boolean lambda$errorCauseFor$0(int paramInt, Zm5y paramZm5y) {
    return paramZm5y.Zk(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm7b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */