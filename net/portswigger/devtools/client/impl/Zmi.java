package net.portswigger.devtools.client.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.portswigger.devtools.client.Zp;

public class Zmi {
  private final Supplier<Integer> Zf;
  
  private final Map<Integer, Zmf> Zy = new ConcurrentHashMap<>();
  
  private static final String a;
  
  public Zmi(Supplier<Integer> paramSupplier) {
    this.Zf = Objects.<Supplier<Integer>>requireNonNull(paramSupplier);
  }
  
  public Zmf Zw(Zm_ paramZm_) {
    Zmf zmf = new Zmf(((Integer)this.Zf.get()).intValue(), paramZm_.ZX5(), paramZm_.ZXP(), paramZm_.ZXU());
    this.Zy.put(Integer.valueOf(zmf.ZC()), zmf);
    return zmf;
  }
  
  public void Z_(Zmf paramZmf) {
    this.Zy.remove(Integer.valueOf(paramZmf.ZC()));
  }
  
  public Collection<Zmf> Zl(Predicate<Zmf> paramPredicate) {
    return this.Zy.values().stream().filter(paramPredicate).toList();
  }
  
  public Optional<Zmf> ZL(int paramInt) {
    return Optional.ofNullable(this.Zy.get(Integer.valueOf(paramInt)));
  }
  
  public void ZG() {
    this.Zy.values().forEach(Zmi::lambda$truncate$0);
    this.Zy.clear();
  }
  
  private static void lambda$truncate$0(Zmf paramZmf) {
    paramZmf.ZU().Zh((Exception)new Zp(a));
  }
  
  static {
    // Byte code:
    //   0: bipush #64
    //   2: ldc '@Adi!c"Pgq!u'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zmi.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #66
    //   82: goto -> 111
    //   85: bipush #115
    //   87: goto -> 111
    //   90: bipush #75
    //   92: goto -> 111
    //   95: bipush #94
    //   97: goto -> 111
    //   100: bipush #42
    //   102: goto -> 111
    //   105: iconst_4
    //   106: goto -> 111
    //   109: bipush #81
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zmi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */