package burp;

import java.util.ArrayList;
import java.util.Collections;

public class Zr10 {
  private final Zzlx Zj;
  
  public Zr10(Zzlx paramZzlx) {
    this.Zj = paramZzlx;
  }
  
  public void Zg(Zkgn paramZkgn) {
    Zefg<Zgxp> zefg = paramZkgn.ZvQ();
    ArrayList<Zgxp> arrayList = new ArrayList();
    int i = zefg.size() - 1;
    boolean bool = Zs7w.Zw();
    while (i >= Math.max(zefg.size() - 100, 0)) {
      Zgxp zgxp = zefg.get(i);
      if (!zgxp.Ze_())
        arrayList.add(zgxp); 
      i--;
      if (bool)
        break; 
    } 
    if (!arrayList.isEmpty()) {
      Collections.reverse(arrayList);
      this.Zj.Zs(arrayList);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr10.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */