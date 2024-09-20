package burp;

import java.util.ArrayList;
import java.util.List;

class Zgkf {
  final Zxs7 Zm;
  
  final List<Zliq> Ze = new ArrayList<>();
  
  Zgkf(Zxs7 paramZxs7, Zliq paramZliq) {
    this.Zm = paramZxs7;
    this.Ze.add(paramZliq);
  }
  
  public void ZE(Zxov paramZxov) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    for (Zliq zliq : this.Ze) {
      if (zliq.ZH == paramZxov.ZC()) {
        zliq.Zj(paramZxov);
        return;
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    this.Ze.add(new Zliq(paramZxov.ZC(), paramZxov));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgkf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */