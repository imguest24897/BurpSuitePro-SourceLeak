package burp;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Zxws implements Zz1h {
  final Zgxz ZL;
  
  private Zxws(Zgxz paramZgxz) {}
  
  public <T extends Zgpi<T>> Zefg<T> Zq(Zefg<T> paramZefg) {
    Zsc3 zsc3 = new Zsc3(this.ZL.Z_);
    return zsc3.<Zefg<T>>Zv(paramZefg);
  }
  
  public <T extends Zgpi<T>> List<T> Zq(List<T> paramList) {
    Zsc3 zsc3 = new Zsc3(this.ZL.Z_);
    Objects.requireNonNull(zsc3);
    return (List<T>)paramList.stream().map(zsc3::Zv).collect(Collectors.toList());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxws.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */