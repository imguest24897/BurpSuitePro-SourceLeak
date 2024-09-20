package burp;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zgz6 {
  static final Zgz6 Zz = new Zgz6(null, null, null, Zgz6::lambda$static$0, Zgz6::lambda$static$1, Collections.emptyList());
  
  private final Zerg ZN;
  
  private final Consumer<Zeeg> Zc;
  
  private final Ztpe Z_;
  
  private final BiConsumer<byte[], Zeeg> Zj;
  
  private final Runnable ZE;
  
  private final List<Zeeg> ZH;
  
  Zgz6(Zerg paramZerg, Consumer<Zeeg> paramConsumer, Ztpe paramZtpe, BiConsumer<byte[], Zeeg> paramBiConsumer, Runnable paramRunnable, List<Zeeg> paramList) {
    this.ZN = paramZerg;
    this.Zc = paramConsumer;
    this.Z_ = paramZtpe;
    this.Zj = paramBiConsumer;
    this.ZE = paramRunnable;
    this.ZH = paramList;
  }
  
  boolean ZL() {
    return (this.ZH.size() > 1);
  }
  
  boolean ZY() {
    return !this.ZH.isEmpty();
  }
  
  void Zk() {
    if (ZY()) {
      this.Z_.Zl(this.ZH);
      this.ZE.run();
    } 
  }
  
  void Zp() {
    if (ZY()) {
      this.Z_.ZN();
      this.ZE.run();
    } 
  }
  
  void Zg() {
    if (ZY()) {
      Zuh.Zb((this.ZH.size() == 1), Zqf.Zr);
      this.Zc.accept(this.ZH.get(0));
    } 
  }
  
  void ZP() {
    if (ZY()) {
      Zuh.Zb((this.ZH.size() == 1), Zqf.Zr);
      this.ZN.Za().ZW(((Zeeg)this.ZH.get(0)).Zaa());
    } 
  }
  
  void Zj() {
    if (ZY()) {
      List<Zstu> list = (List)this.ZH.stream().map(Zeeg::Zaa).collect(Collectors.toList());
      this.ZN.ZH().Zk(list);
    } 
  }
  
  void Zz() {
    if (ZY()) {
      Zuh.Zb((this.ZH.size() == 1), Zqf.Zr);
      Zeeg zeeg = this.ZH.get(0);
      this.Zj.accept(zeeg.Zaa().ZiD(), zeeg);
    } 
  }
  
  List<Zeeg> ZS() {
    return this.ZH;
  }
  
  private static void lambda$static$1() {}
  
  private static void lambda$static$0(byte[] paramArrayOfbyte, Zeeg paramZeeg) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgz6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */