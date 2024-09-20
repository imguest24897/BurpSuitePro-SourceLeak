package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class Zl7v implements Supplier<Zru9> {
  private final String ZD;
  
  private final List<Supplier<? extends Zty8>> ZY = new LinkedList<>();
  
  @SafeVarargs
  public Zl7v(String paramString, Supplier<? extends Zty8>... paramVarArgs) {
    this.ZD = paramString;
    Zk(paramVarArgs);
  }
  
  @SafeVarargs
  public final Zl7v Zk(Supplier<? extends Zty8>... paramVarArgs) {
    this.ZY.addAll(List.of(paramVarArgs));
    return this;
  }
  
  public Zru9 Zs() {
    return new Zru9(this.ZD, this.ZY.stream().map(Supplier::get).toList());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */