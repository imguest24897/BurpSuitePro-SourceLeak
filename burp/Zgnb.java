package burp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Zgnb<T> implements Zxnw<T> {
  private final Zxnw<T>[] Zx;
  
  @SafeVarargs
  public Zgnb(Zxnw<T>... paramVarArgs) {
    this.Zx = paramVarArgs;
  }
  
  public List<Zs1_<T>> ZJ() {
    return Arrays.<Zxnw<T>>stream(this.Zx).flatMap(Zgnb::lambda$allFields$0).toList();
  }
  
  private static Stream lambda$allFields$0(Zxnw paramZxnw) {
    return paramZxnw.ZJ().stream();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgnb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */