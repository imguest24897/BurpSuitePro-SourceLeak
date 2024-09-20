package burp;

import java.util.List;
import java.util.stream.Collectors;

class Zlle {
  private final List<Ztf_<?>> Zx;
  
  private List<Zeo2> Zr;
  
  private List<Zzh2> ZN;
  
  Zlle(List<Ztf_<?>> paramList) {
    this.Zx = paramList;
  }
  
  boolean Zr() {
    return (this.Zx == null || this.Zx.isEmpty());
  }
  
  boolean ZG() {
    return (this.Zx != null && this.Zx.size() > 1);
  }
  
  int ZJ() {
    return (this.Zx == null) ? 0 : this.Zx.size();
  }
  
  List<Ztf_<?>> Zk() {
    return this.Zx;
  }
  
  Ztf_<?> Zp() {
    return this.Zx.getFirst();
  }
  
  List<Zz6e<?>> Zx() {
    return (List<Zz6e<?>>)this.Zx.stream().map(Zlle::lambda$unwrappedItems$0).collect(Collectors.toList());
  }
  
  List<Zeo2> Zb() {
    if (this.Zr == null)
      this.Zr = this.Zx.stream().filter(Zlle::lambda$httpItems$1).map(Zlle::lambda$httpItems$2).map(Zm13::ZF).toList(); 
    return this.Zr;
  }
  
  List<Zzh2> ZU() {
    if (this.ZN == null)
      this.ZN = this.Zx.stream().filter(Zlle::lambda$webSocketItems$3).map(Zlle::lambda$webSocketItems$4).map(Zsnu::ZH).toList(); 
    return this.ZN;
  }
  
  boolean ZX() {
    return (Zb().size() == this.Zx.size());
  }
  
  boolean ZM() {
    return (ZU().size() == this.Zx.size());
  }
  
  private static Zsnu lambda$webSocketItems$4(Ztf_ paramZtf_) {
    return (Zsnu)paramZtf_;
  }
  
  private static boolean lambda$webSocketItems$3(Ztf_ paramZtf_) {
    return paramZtf_ instanceof Zsnu;
  }
  
  private static Zm13 lambda$httpItems$2(Ztf_ paramZtf_) {
    return (Zm13)paramZtf_;
  }
  
  private static boolean lambda$httpItems$1(Ztf_ paramZtf_) {
    return paramZtf_ instanceof Zm13;
  }
  
  private static Zz6e lambda$unwrappedItems$0(Ztf_ paramZtf_) {
    return paramZtf_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */