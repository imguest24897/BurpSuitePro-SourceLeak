package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zs8t implements Zm7j {
  private final List<? extends Zll9> ZS;
  
  private final List<int[]> ZR;
  
  private Zl_v ZE;
  
  public Zs8t(Zll9 paramZll9, List<int[]> paramList) {
    this.ZS = Collections.singletonList(paramZll9);
    this.ZR = paramList;
  }
  
  public void Zz(Zl_v paramZl_v) {
    this.ZE = paramZl_v;
  }
  
  public void Zm(Ze0 paramZe0) {
    paramZe0.ZN(Zkcl.SCAN_AUDIT);
    paramZe0.ZW(Zk());
    paramZe0.Zs(true);
    paramZe0.Zn(this.ZS);
    paramZe0.ZO(this.ZR);
  }
  
  public void ZR() {
    this.ZE.Zc();
    this.ZE.Zn();
    this.ZE.Zz();
    this.ZE.Zl();
  }
  
  private List<String> Zk() {
    int[] arrayOfInt = Zz7i.Zk();
    ArrayList<String> arrayList = new ArrayList();
    if (this.ZS.size() <= 20)
      for (Zll9 zll9 : this.ZS) {
        arrayList.add(zll9.ZlL().toString());
        if (arrayOfInt == null)
          break; 
      }  
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */