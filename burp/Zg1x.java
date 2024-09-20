package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.KeyStroke;

public class Zg1x implements Iterable<Zl1c> {
  private final Zs4c ZV;
  
  private final Ztsr ZA;
  
  private List<Zl1c> Zw;
  
  public Zg1x(Zs4c paramZs4c, Ztsr paramZtsr) {
    this.ZV = paramZs4c;
    this.ZA = paramZtsr;
    this.Zw = new ArrayList<>();
  }
  
  public Iterator<Zl1c> iterator() {
    return this.Zw.iterator();
  }
  
  public List<Zl1c> ZM() {
    return new ArrayList<>(this.Zw);
  }
  
  public List<Zl1c> ZD() {
    return this.Zw.stream().filter(Zg1x::lambda$getConfiguredHotkeys$0).toList();
  }
  
  public void ZT() {
    this.Zw = this.ZA.Zm(true);
  }
  
  public void Zb() {
    Map<Integer, KeyStroke> map = (Map)this.Zw.stream().filter(Zg1x::lambda$getConfiguredHotkeys$0).collect(Collectors.toMap(Zl1c::ZA, Zl1c::ZC));
    this.ZA.Zu(map);
  }
  
  public void Zg(Zmf_ paramZmf_) {
    Zeef zeef = new Zeef(this.ZV, new ArrayList<>());
    zeef.Zd(paramZmf_);
    this.Zw = zeef.ZU(true);
  }
  
  public Optional<Zl1c> ZD(KeyStroke paramKeyStroke, Zl1c paramZl1c) {
    return this.Zw.stream().filter(paramZl1c::lambda$isKeystrokeDuplicate$2).filter(paramKeyStroke::lambda$isKeystrokeDuplicate$3).findFirst();
  }
  
  private static boolean lambda$isKeystrokeDuplicate$3(KeyStroke paramKeyStroke, Zl1c paramZl1c) {
    return (paramKeyStroke == paramZl1c.ZC());
  }
  
  private static boolean lambda$isKeystrokeDuplicate$2(Zl1c paramZl1c1, Zl1c paramZl1c2) {
    return (paramZl1c2 != paramZl1c1);
  }
  
  private static boolean lambda$getConfiguredHotkeys$0(Zl1c paramZl1c) {
    return Objects.nonNull(paramZl1c.ZC());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */