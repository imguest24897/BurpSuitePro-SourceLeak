package burp;

import java.util.function.Function;

public class Zgey<T> implements Zs1_<T> {
  private final String Zk;
  
  private final Function<T, String> Zn;
  
  public Zgey(String paramString, Function<T, String> paramFunction) {
    this.Zk = paramString;
    this.Zn = paramFunction;
  }
  
  public String ZE() {
    return this.Zk;
  }
  
  public String ZP(T paramT) {
    return this.Zn.apply(paramT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgey.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */