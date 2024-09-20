package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Zlr_ implements Zsgv, Zzk4 {
  private final Zg94 Zw;
  
  private final List<Zb3a> Z_;
  
  Zlr_(Zg94 paramZg94) {
    this.Zw = paramZg94;
    this.Z_ = new CopyOnWriteArrayList<>();
  }
  
  public void ZR() {
    if (this.Zw.Zn())
      return; 
    this.Zw.Zz();
    this.Z_.forEach(Zb3a::ZG);
    this.Z_.clear();
  }
  
  public void ZO(Zb3a paramZb3a) {
    if (!this.Zw.Zn())
      this.Z_.add(paramZb3a); 
  }
  
  public void ZN(Zb3a paramZb3a) {
    this.Z_.remove(paramZb3a);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlr_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */