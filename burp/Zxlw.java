package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class Zxlw implements Supplier<Zkh_> {
  private final String ZR;
  
  private String Zw;
  
  private final List<Zeoz> Ze = new LinkedList<>();
  
  private final List<Supplier<? extends Zty8>> ZJ = new LinkedList<>();
  
  public Zxlw(String paramString) {
    this.ZR = paramString;
  }
  
  public Zxlw Zc(String paramString) {
    this.Zw = paramString;
    return this;
  }
  
  public Zxlw Zy(Zeoz... paramVarArgs) {
    return ZT(List.of(paramVarArgs));
  }
  
  public Zxlw ZT(List<Zeoz> paramList) {
    this.Ze.addAll(paramList);
    return this;
  }
  
  @SafeVarargs
  public final Zxlw ZQ(Supplier<? extends Zty8>... paramVarArgs) {
    return Ze(List.of(paramVarArgs));
  }
  
  public Zxlw Ze(List<Supplier<? extends Zty8>> paramList) {
    this.ZJ.addAll(paramList);
    return this;
  }
  
  public Zkh_ ZG() {
    return new Zkh_(this.ZR, this.Zw, this.Ze, this.ZJ.stream().map(Supplier::get).toList());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxlw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */