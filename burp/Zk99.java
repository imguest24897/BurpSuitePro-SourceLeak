package burp;

import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zz_;

public class Zk99 implements Zz1_ {
  private final Zer0 ZH;
  
  private final Zlp9 Z_;
  
  private final Zzwz Zp;
  
  private final Zroy ZY;
  
  private final List<Zer0> ZK;
  
  public Zk99(Zlp9 paramZlp9, Zzwz paramZzwz, Zroy paramZroy, Zer0 paramZer0, List<Zer0> paramList) {
    this.ZH = paramZer0;
    this.Z_ = paramZlp9;
    this.Zp = paramZzwz;
    this.ZY = paramZroy;
    this.ZK = paramList;
  }
  
  public Zbll Z_() {
    List<Zen> list = (new Zz_(Zkb.Zy(this.ZH.Zx()))).Z_();
    if (list.size() != 1) {
      Zuh.Zv(false, Zqf.Zr, list.size());
      return null;
    } 
    Zewx zewx = this.Zp.ZK(this.Z_, list.get(0));
    return Zbll.ZA(zewx, this.ZY.Zb(zewx, this.ZH, this.ZK), null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk99.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */