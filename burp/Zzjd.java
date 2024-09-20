package burp;

import java.util.ArrayList;
import java.util.List;

class Zzjd {
  final List<Zgkf> Zs = new ArrayList<>();
  
  void Zy(Zxov paramZxov, Zxs7 paramZxs7) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    for (Zgkf zgkf : this.Zs) {
      if (zgkf.Zm == paramZxs7) {
        zgkf.ZE(paramZxov);
        return;
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    this.Zs.add(new Zgkf(paramZxs7, new Zliq(paramZxov.ZC(), paramZxov)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzjd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */