package burp;

import java.util.List;
import java.util.Objects;

public class Zmrf extends Zmgt {
  private final List<Zlge> Zu;
  
  public Zmrf(List<Zlge> paramList) {
    this.Zu = paramList;
  }
  
  protected String ZM(Zzvx paramZzvx) {
    StringBuilder stringBuilder = new StringBuilder();
    Objects.requireNonNull(stringBuilder);
    this.Zu.stream().map(paramZzvx::lambda$evaluate$0).forEach(stringBuilder::append);
    return stringBuilder.toString();
  }
  
  private static String lambda$evaluate$0(Zzvx paramZzvx, Zlge paramZlge) {
    return paramZlge.Zs(paramZzvx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmrf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */