package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zih;

public class Zz6q {
  private final Zz8a Zj;
  
  public Zz6q(Zz8a paramZz8a) {
    this.Zj = paramZz8a;
  }
  
  public List<Zkbn> Zt(List<Zih> paramList) {
    ArrayList<Zkbn> arrayList = new ArrayList();
    this.Zj.ZR();
    Zzhj zzhj = new Zzhj(this.Zj, arrayList);
    paramList.forEach(zzhj::lambda$fromRestEntities$0);
    return arrayList;
  }
  
  private static void lambda$fromRestEntities$0(Zzhj paramZzhj, Zih paramZih) {
    paramZih.ZV(paramZzhj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */