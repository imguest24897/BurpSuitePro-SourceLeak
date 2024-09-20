package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Zlxl implements Zg5o {
  private Zefx ZE;
  
  final Ze5b ZQ;
  
  private Zlxl(Ze5b paramZe5b) {}
  
  public void Zs(Zr6q paramZr6q) {
    Zz1p zz1p = Zekx.Zu(paramZr6q.ZT(), paramZr6q.ZD(), (byte)1, this.ZQ.Zb.Zn);
    Zt12 zt12 = new Zt12(paramZr6q.ZT(), zz1p, this.ZQ.Zb.Zt, this.ZQ.Zb.Zz, this.ZQ.Zb.Zd);
    ArrayList<String> arrayList = new ArrayList<>(zz1p.ZG());
    zt12.Zo(arrayList, false);
    this.ZE = this.ZQ.Zb.Zf.ZY(paramZr6q.ZT(), Zljl.Zw(arrayList, paramZr6q.ZD(), zz1p.ZP));
  }
  
  public void ZS(Zr6h paramZr6h) {
    List<Ztnz> list = (List)paramZr6h.ZK().stream().filter(Zlxl::lambda$visit$0).collect(Collectors.toList());
    this.ZE = this.ZQ.Zb.Zf.ZR(paramZr6h.ZT(), list, paramZr6h.Zw());
  }
  
  private static boolean lambda$visit$0(Ztnz paramZtnz) {
    return !paramZtnz.Zs();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlxl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */