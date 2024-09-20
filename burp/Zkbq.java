package burp;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Zkbq implements Zz1h {
  private final Ze24 ZL = Zlu6.Zi();
  
  final Zgxz ZP;
  
  private Zkbq(Zgxz paramZgxz) throws Zev3 {}
  
  public <T extends Zgpi<T>> Zefg<T> Zq(Zefg<T> paramZefg) {
    Ztg8 ztg8 = Zgjv.Zi(null, this.ZP.Z_.Zl(), this.ZL, Zl2m.ZO, Zsa2.Zo);
    return ztg8.<Zefg<T>>Zw(paramZefg);
  }
  
  public <T extends Zgpi<T>> List<T> Zq(List<T> paramList) {
    Ztg8 ztg8 = Zgjv.Zi(null, this.ZP.Z_.Zl(), this.ZL, Zl2m.ZO, Zsa2.Zo);
    Objects.requireNonNull(ztg8);
    return (List<T>)paramList.stream().map(ztg8::Zw).collect(Collectors.toList());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */