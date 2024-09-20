package burp;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

public class Zzy4 {
  private Zgv3 ZX = Zgv3.LATEST;
  
  private final List<Zgd5> Zy = new LinkedList<>();
  
  private final Set<Zs66> ZE = new HashSet<>();
  
  private final List<Zg_a> Z_ = new LinkedList<>();
  
  private Zmrn Zt = Zz11.Zp();
  
  private Zbjr Za;
  
  private Consumer<Zzvx> Zx = Zzy4::lambda$new$0;
  
  private Consumer<Zzvx> Zd = Zzy4::lambda$new$0;
  
  private boolean Zg = false;
  
  private String ZH = a;
  
  private Set<String> Zn;
  
  private Set<String> ZY;
  
  private static final String a;
  
  public Zzy4 ZI(Zgv3 paramZgv3) {
    this.ZX = paramZgv3;
    return this;
  }
  
  public Zzy4 ZT(List<Zgd5> paramList) {
    this.Zy.addAll(paramList);
    return this;
  }
  
  public Zzy4 ZV(Zbjr paramZbjr) {
    this.Za = paramZbjr;
    return this;
  }
  
  public Zzy4 Ze(Consumer<Zzvx> paramConsumer) {
    this.Zx = paramConsumer;
    return this;
  }
  
  public Zzy4 Zx(Consumer<Zzvx> paramConsumer) {
    this.Zd = paramConsumer;
    return this;
  }
  
  public Zzy4 Zl(Set<Zs66> paramSet) {
    this.ZE.addAll(paramSet);
    return this;
  }
  
  public Zzy4 Zv(Zmrn paramZmrn, List<Zsvm> paramList) {
    return Z_(paramZmrn, paramList, Collections.emptyList());
  }
  
  public Zzy4 Z_(Zmrn paramZmrn, List<Zsvm> paramList1, List<Zsvm> paramList2) {
    Zg_a zg_a = Zg_a.Zx(paramZmrn);
    Objects.requireNonNull(zg_a);
    paramList1.forEach(zg_a::Zt);
    Objects.requireNonNull(zg_a);
    paramList2.forEach(zg_a::ZS);
    this.Z_.add(zg_a);
    return this;
  }
  
  public Zzy4 ZL(String paramString) {
    this.ZH = paramString;
    return this;
  }
  
  public Zzy4 Zo(Set<String> paramSet) {
    this.Zn = paramSet;
    return this;
  }
  
  public Zzy4 ZP(Set<String> paramSet) {
    this.ZY = paramSet;
    return this;
  }
  
  public Zsvm ZA() {
    if (this.Zy.isEmpty())
      this.Zy.add(Zgd5.ZJ); 
    Zsvm zsvm = new Zsvm(this.ZX, this.Zg, this.Zt, this.Zy, this.Za, this.Zx, this.Zd, this.ZE, this.ZH, (this.Zn == null) ? Collections.<String>emptySet() : Collections.<String>unmodifiableSet(this.Zn), (this.ZY == null) ? Collections.<String>emptySet() : Collections.<String>unmodifiableSet(this.ZY));
    Objects.requireNonNull(zsvm);
    this.Z_.forEach(zsvm::Zx);
    return zsvm;
  }
  
  public Zzy4 ZH() {
    this.Zg = true;
    return this;
  }
  
  private static void lambda$new$0(Zzvx paramZzvx) {}
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: ldc 'oj8]l'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzy4.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #42
    //   82: goto -> 112
    //   85: bipush #20
    //   87: goto -> 112
    //   90: bipush #70
    //   92: goto -> 112
    //   95: bipush #44
    //   97: goto -> 112
    //   100: bipush #123
    //   102: goto -> 112
    //   105: bipush #102
    //   107: goto -> 112
    //   110: bipush #24
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzy4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */