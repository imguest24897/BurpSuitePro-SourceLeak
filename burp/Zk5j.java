package burp;

import java.util.List;
import java.util.Objects;

class Zk5j implements Zg5o {
  final Zr_4 ZL;
  
  final List ZU;
  
  final Zefw Zf;
  
  Zk5j(Zefw paramZefw, Zr_4 paramZr_4, List paramList) {}
  
  public void Zs(Zr6q paramZr6q) {
    Objects.requireNonNull(this.ZL);
    Objects.requireNonNull(this.ZU);
    this.Zf.ZO.ZG().stream().skip(1L).map(this.ZL::Zz).forEach(this.ZU::add);
  }
  
  public void ZS(Zr6h paramZr6h) {
    Objects.requireNonNull(this.ZL);
    Objects.requireNonNull(this.ZU);
    paramZr6h.ZK().stream().map(Ztnz::ZK).map(this.ZL::Zz).forEach(this.ZU::add);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */