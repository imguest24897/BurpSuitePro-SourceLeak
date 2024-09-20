package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class Zgr8 implements Supplier<Zzx2> {
  private Zmfl ZL;
  
  private String Zv;
  
  private final List<Zgry> Zr = new LinkedList<>();
  
  private final List<Supplier<? extends Zty8>> ZO = new LinkedList<>();
  
  public Zgr8 Zv(Zmfl paramZmfl) {
    this.ZL = paramZmfl;
    return this;
  }
  
  public Zgr8 ZN(Zgry... paramVarArgs) {
    this.Zr.addAll(List.of(paramVarArgs));
    return this;
  }
  
  @SafeVarargs
  public final Zgr8 ZU(Supplier<? extends Zty8>... paramVarArgs) {
    this.ZO.addAll(List.of(paramVarArgs));
    return this;
  }
  
  public Zzx2 ZT() {
    return new Zzx2(this.ZL, this.Zv, this.Zr, this.ZO.stream().map(Supplier::get).toList());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgr8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */