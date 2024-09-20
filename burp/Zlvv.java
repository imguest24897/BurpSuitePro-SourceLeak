package burp;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Zlvv {
  private final Ztwv ZE;
  
  private final Zznr Zs;
  
  private final Function<Zxw4, Zlvv> ZW;
  
  private final Zbyn Zt;
  
  private final Zemt ZF;
  
  private final Zsh8 Zm;
  
  private final Zmuy ZV;
  
  private final Zm3c Zi;
  
  private final Zx_d ZP;
  
  private final Supplier<Zl_q> Zy;
  
  private final Zzlx Zu;
  
  private final Supplier<Ztj1> Zz;
  
  private final Zb_x Zr;
  
  private final Ztvd Zn;
  
  private final Zeoh Zx;
  
  private final Zlok Zw;
  
  private final Ztou ZY;
  
  private final Zlpe ZT;
  
  private final Ze3w ZI;
  
  private final Zlee Zb;
  
  private static final String a;
  
  public Zlvv(Ztwv paramZtwv, Zsh8 paramZsh8, Zmuy paramZmuy, Zx_d paramZx_d, Consumer<Zlvv> paramConsumer, Supplier<Zl_q> paramSupplier, Zm3c paramZm3c, Zzlx paramZzlx, Zznr paramZznr, Function<Zxw4, Zlvv> paramFunction, Zbyn paramZbyn, Zemt paramZemt, Supplier<Ztj1> paramSupplier1, Zb_x paramZb_x, Ztvd paramZtvd, Zeoh paramZeoh, Zlok paramZlok, Ztou paramZtou, Zlpe paramZlpe, Ze3w paramZe3w, Zlee paramZlee) {
    this.ZE = paramZtwv;
    this.Zm = paramZsh8;
    this.ZV = paramZmuy;
    this.ZP = paramZx_d;
    this.Zy = paramSupplier;
    this.Zi = paramZm3c;
    this.Zu = paramZzlx;
    this.Zs = paramZznr;
    this.ZW = paramFunction;
    this.Zt = paramZbyn;
    this.ZF = paramZemt;
    this.Zz = paramSupplier1;
    this.Zr = paramZb_x;
    this.Zn = paramZtvd;
    this.Zx = paramZeoh;
    this.Zw = paramZlok;
    this.ZY = paramZtou;
    this.ZT = paramZlpe;
    this.ZI = paramZe3w;
    this.Zb = paramZlee;
    paramConsumer.accept(this);
    paramZtou.ZE(Zt1l.Zd, paramZmuy::lambda$new$0);
  }
  
  public void Zw() {
    ((Zl_q)this.Zy.get()).Zf();
    this.Zw.Zy(a);
    ((Ztj1)this.Zz.get()).Zq();
  }
  
  public void Zv() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zu : Lburp/Zzlx;
    //   4: ifnonnull -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield Zt : Lburp/Zbyn;
    //   12: invokevirtual Zf : ()Lburp/Zxw4;
    //   15: astore_1
    //   16: aload_0
    //   17: getfield ZE : Lburp/Ztwv;
    //   20: aload_0
    //   21: aload_1
    //   22: <illegal opcode> run : (Lburp/Zlvv;Lburp/Zxw4;)Ljava/lang/Runnable;
    //   27: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   32: pop
    //   33: return
  }
  
  public void Zo() {
    ((Ztj1)this.Zz.get()).Zv();
  }
  
  public void ZC(List<Zgxp> paramList) {
    this.Zu.Zs(paramList);
    ((Ztj1)this.Zz.get()).Zr().ZD(Zt13.Zf);
  }
  
  private void ZU(Runnable paramRunnable) {
    Objects.requireNonNull(this.Zz);
    boolean bool = false;
    try {
      if (this.Zs.Zn()) {
        Zo();
        bool = true;
      } 
      paramRunnable.run();
    } finally {
      if (bool)
        Zj(); 
    } 
  }
  
  public Ztvd Zi() {
    return this.Zn;
  }
  
  public Zb_x ZR() {
    return this.Zr;
  }
  
  public Zeoh Ze() {
    return this.Zx;
  }
  
  public void Zj() {
    ((Ztj1)this.Zz.get()).Zp();
  }
  
  public void ZY() {
    ((Zl_q)this.Zy.get()).Zf();
  }
  
  private void lambda$createAndStartDuplicateAttackTask$1(Zxw4 paramZxw4) {
    Objects.requireNonNull(this.ZW.apply(paramZxw4));
    ZU((Zlvv)this.ZW.apply(paramZxw4)::Zw);
  }
  
  private static void lambda$new$0(Zmuy paramZmuy, Zxr8 paramZxr8) {
    Objects.requireNonNull(paramZmuy);
    paramZxr8.ZF().ifPresent(paramZmuy::Zd);
  }
  
  static {
    // Byte code:
    //   0: bipush #91
    //   2: ldc 'GH.;9s'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlvv.a : Ljava/lang/String;
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
    //   80: bipush #79
    //   82: goto -> 112
    //   85: bipush #103
    //   87: goto -> 112
    //   90: bipush #46
    //   92: goto -> 112
    //   95: bipush #7
    //   97: goto -> 112
    //   100: bipush #45
    //   102: goto -> 112
    //   105: bipush #9
    //   107: goto -> 112
    //   110: bipush #12
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlvv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */