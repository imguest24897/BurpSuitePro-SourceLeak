package burp;

import java.util.List;
import java.util.Objects;

public class Zmr8 extends Zmgt {
  private final List<Zbiy> ZN;
  
  public Zmr8(List<Zbiy> paramList) {
    this.ZN = paramList;
  }
  
  protected String ZM(Zzvx paramZzvx) {
    StringBuilder stringBuilder = new StringBuilder();
    Objects.requireNonNull(stringBuilder);
    this.ZN.stream().map(paramZzvx::lambda$evaluate$0).forEach(stringBuilder::append);
    return stringBuilder.toString();
  }
  
  private static String lambda$evaluate$0(Zzvx paramZzvx, Zbiy paramZbiy) {
    return paramZbiy.Zq(paramZzvx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmr8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */