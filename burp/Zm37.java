package burp;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zm37 {
  private final Ztcy Zy;
  
  private final Zz4b ZE;
  
  private final Zsus ZV;
  
  public Zm37(Ztcy paramZtcy, Zz4b paramZz4b, Zsus paramZsus) {
    this.Zy = paramZtcy;
    this.ZE = paramZz4b;
    this.ZV = paramZsus;
  }
  
  public Zeih Zm() {
    Objects.requireNonNull(this.Zy);
    return new Zrzz(this.Zy::ZW, this.ZV, ZA(this.ZE, Zkcl.LEGACY_EXTENSION_PASSIVE_AUDIT));
  }
  
  public Zeih Zx() {
    Objects.requireNonNull(this.Zy);
    return new Zrzz(this.Zy::ZS, this.ZV, ZA(this.ZE, Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT));
  }
  
  private static Supplier<Boolean> ZA(Zz4b paramZz4b, Zkcl paramZkcl) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> get : (Lburp/Zz4b;Lburp/Zkcl;)Ljava/util/function/Supplier;
    //   7: areturn
  }
  
  private static Optional<Zgna> ZK(Zz4b paramZz4b, Zkcl paramZkcl) {
    Zefg<Zgna> zefg = paramZz4b.ZV_();
    synchronized (zefg.Zz6()) {
      return zefg.stream().filter(paramZkcl::lambda$firstTaskOfType$1).findFirst();
    } 
  }
  
  private static boolean lambda$firstTaskOfType$1(Zkcl paramZkcl, Zgna paramZgna) {
    return (paramZgna.ZNs() == paramZkcl);
  }
  
  private static Boolean lambda$taskCapturingEnabledSupplier$0(Zz4b paramZz4b, Zkcl paramZkcl) {
    String str = Zkn.ZI();
    Optional<Zgna> optional = ZK(paramZz4b, paramZkcl);
    if (!optional.isEmpty()) {
      Zz2s zz2s = (Zz2s)optional.get();
      if (zz2s instanceof Zz2s) {
        Zz2s zz2s1 = zz2s;
        if (str != null)
          return Boolean.valueOf(zz2s1.ZPp()); 
      } 
    } 
    Zuh.Zb(false, Zqf.Zr);
    return Boolean.valueOf(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm37.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */