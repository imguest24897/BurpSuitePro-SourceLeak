package burp;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Zz1e {
  private final Zsh8 Zo;
  
  private final Zskh ZR;
  
  public Zz1e(Zsh8 paramZsh8, Zskh paramZskh) {
    this.Zo = paramZsh8;
    this.ZR = paramZskh;
  }
  
  public List<Zlau<?>> Zu() {
    return (List<Zlau<?>>)Zlqp.Zf().stream().sorted(Comparator.comparing(Zz1e::lambda$standardColumns$2)).map(this::lambda$getColumns$1).flatMap(Collection::stream).collect(Collectors.toList());
  }
  
  public List<Zlau<?>> ZD() {
    return (List<Zlau<?>>)Zlqp.ZF().stream().filter(this::lambda$getColumns$0).sorted(Comparator.comparing(Zz1e::lambda$standardColumns$2)).map(this::lambda$getColumns$1).flatMap(Collection::stream).collect(Collectors.toList());
  }
  
  private static Integer lambda$standardColumns$2(Zlqp paramZlqp) {
    return Integer.valueOf(paramZlqp.positionOrder);
  }
  
  private Collection lambda$getColumns$1(Zlqp paramZlqp) {
    return paramZlqp.buildColumnFunction.apply(this.Zo, this.ZR);
  }
  
  private boolean lambda$getColumns$0(Zlqp paramZlqp) {
    return paramZlqp.isValidForConfiguration.test(this.Zo);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz1e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */