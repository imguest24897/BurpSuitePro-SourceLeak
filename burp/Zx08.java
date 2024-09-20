package burp;

import java.util.Arrays;
import java.util.List;

public class Zx08<T extends Zrn3> {
  private final List<T> ZV;
  
  private final boolean Zu;
  
  private Zx08(List<T> paramList, boolean paramBoolean) {
    this.Zu = paramBoolean;
    this.ZV = paramList;
  }
  
  @SafeVarargs
  public static <T extends Zrn3> Zx08<T> ZU(T... paramVarArgs) {
    return new Zx08<>(Arrays.asList(paramVarArgs), false);
  }
  
  @SafeVarargs
  public static <T extends Zrn3> Zx08<T> Zz(T... paramVarArgs) {
    return new Zx08<>(Arrays.asList(paramVarArgs), true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx08.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */