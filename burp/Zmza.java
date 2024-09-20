package burp;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Zmza implements Zg5o {
  private final Zlfu Zl;
  
  private Zt68 Ze;
  
  Zmza(Zbnt paramZbnt, Zt68 paramZt68, byte paramByte) {
    this.Ze = paramZt68;
    this.Zl = new Zlfu(paramZt68, paramByte, paramZbnt);
  }
  
  public void Zs(Zr6q paramZr6q) {
    this.Ze = this.Zl.ZL(paramZr6q.ZT(), Zyf.Zy(paramZr6q.ZD()));
  }
  
  public void ZS(Zr6h paramZr6h) {
    List<Zelp> list = (List)paramZr6h.ZK().stream().map(Zef7::new).collect(Collectors.toList());
    this.Ze = this.Zl.ZP(paramZr6h.ZT(), list, Zyf.Zy(paramZr6h.Zw()));
  }
  
  Zt68 ZS() {
    return this.Ze;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmza.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */