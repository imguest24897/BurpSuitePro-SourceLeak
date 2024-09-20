package burp;

import java.util.Collection;
import java.util.Objects;

public class Zdb {
  private final Collection<Zmln> Zq;
  
  private final Zqt Z_;
  
  private final String Zz;
  
  private Zdb(Zls5 paramZls5) {
    this.Zq = paramZls5.Zg;
    this.Z_ = paramZls5.ZH;
    this.Zz = paramZls5.Zc;
  }
  
  public boolean Zh(Zkbn paramZkbn) {
    if (this.Z_ == Zqt.BUILT_IN_ONLY && !paramZkbn.ZU())
      return false; 
    if (this.Z_ == Zqt.CUSTOM_ONLY && paramZkbn.ZU())
      return false; 
    Objects.requireNonNull(paramZkbn.Zw());
    return (!this.Zq.isEmpty() && this.Zq.stream().noneMatch(paramZkbn.Zw()::contains)) ? false : ((this.Zz == null || this.Zz.isEmpty() || paramZkbn.Zd().toLowerCase().contains(this.Zz.toLowerCase())));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zdb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */