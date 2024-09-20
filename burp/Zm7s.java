package burp;

import java.util.Comparator;
import java.util.List;
import net.portswigger.Zm2;

public class Zm7s {
  private final Zsti Zs;
  
  private final Zm3g ZC;
  
  private final Zmp3 Zl;
  
  public Zm7s(Zm3g paramZm3g, Zsti paramZsti, Zmp3 paramZmp3) {
    this.Zs = paramZsti;
    this.ZC = paramZm3g;
    this.Zl = paramZmp3;
  }
  
  List<Zl5t> Zb() {
    return this.Zs.ZJ().stream().filter(Zl5t::Zv).sorted(Comparator.comparing(Zzqk::Zk)).toList();
  }
  
  List<Zl5t> Zk() {
    return this.Zs.ZJ().stream().filter(Zm7s::lambda$getInternalComponents$0).sorted(Comparator.comparing(Zzqk::Zk)).toList();
  }
  
  void Zn() {
    Zmf_ zmf_ = this.Zl.Zd(new String[0]);
    this.ZC.Zd(zmf_);
    Zm2.ZC(Zrrh.SUITE_UI_DEFAULT_TAB_LAYOUT_RESTORED);
  }
  
  private static boolean lambda$getInternalComponents$0(Zl5t paramZl5t) {
    return !paramZl5t.Zv();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm7s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */