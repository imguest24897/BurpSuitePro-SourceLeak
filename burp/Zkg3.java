package burp;

import java.util.List;
import java.util.stream.Collectors;

public class Zkg3 {
  public static final Zkg3 ZQ = new Zkg3(Zr1g.Zn, false);
  
  private final Zr1g ZW;
  
  private final boolean ZK;
  
  public Zkg3(Zr1g paramZr1g, boolean paramBoolean) {
    this.ZW = paramZr1g;
    this.ZK = paramBoolean;
  }
  
  public <T extends Ze7n> List<T> ZB(List<T> paramList) {
    return (List<T>)paramList.stream().filter(this::ZW).map(this::ZQ).collect(Collectors.toList());
  }
  
  public <T extends Ze7n> T ZQ(T paramT) {
    return ZW((Ze7n)paramT) ? (T)paramT.Zg(this.ZW.ZM((Ze7n)paramT)) : null;
  }
  
  private boolean ZW(Ze7n paramZe7n) {
    if (paramZe7n.ZH().Zu())
      return false; 
    if (!this.ZK && paramZe7n.ZH().Zl()) {
      if (paramZe7n instanceof Zrtj) {
        Zrtj zrtj = (Zrtj)paramZe7n;
        Zmtz zmtz = zrtj.ZY();
        return (zmtz == Zmtz.TEXT || zmtz == Zmtz.NUMBER);
      } 
      return false;
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkg3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */