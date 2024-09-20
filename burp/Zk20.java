package burp;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Zk20 implements Zsw5 {
  private final Supplier<Zkr6> ZA;
  
  private final Zz0n Zo;
  
  private final Zt4u ZG;
  
  private final Supplier<Zbiv> ZZ;
  
  private final Zgb6 Zx;
  
  private final Ztwv Zu;
  
  private final Ztg8 Zg;
  
  private final Zr_4 Zy;
  
  private final Zbnt ZW;
  
  private final Zr_4 ZF;
  
  private final Zbnt Zz;
  
  private final Zm6x Zd;
  
  private final Zlli<Zt1s> ZX;
  
  private final Supplier<Zrfd> ZO;
  
  private final Zzkr ZY;
  
  private final Supplier<Zl11> ZE;
  
  private final Zey9 ZR;
  
  private static final String a;
  
  public Zk20(Supplier<Zkr6> paramSupplier, Zz0n paramZz0n, Zt4u paramZt4u, Supplier<Zbiv> paramSupplier1, Zgb6 paramZgb6, Zbnt paramZbnt, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Ztg8 paramZtg8, Zzkr paramZzkr, Supplier<Zrfd> paramSupplier2, Zlli<Zt1s> paramZlli, Supplier<Zl11> paramSupplier3, Zm6x paramZm6x) {
    this.ZA = paramSupplier;
    this.Zo = paramZz0n;
    this.ZG = paramZt4u;
    this.ZZ = paramSupplier1;
    this.Zx = paramZgb6;
    this.ZW = paramZbnt;
    this.Zu = paramZtwv;
    this.Zy = paramZr_41;
    this.ZF = paramZr_42;
    this.Zg = paramZtg8;
    this.ZY = paramZzkr;
    this.ZO = paramSupplier2;
    this.ZX = paramZlli;
    this.ZE = paramSupplier3;
    this.Zz = new Zbnt(paramZr_42);
    this.Zd = paramZm6x;
    this.ZR = new Zey9(this.Zz);
  }
  
  public Zbyn Zf(Zt84 paramZt84, boolean paramBoolean) {
    Objects.requireNonNull(this.ZA.get());
    Zb4j zb4j = new Zb4j((Zkr6)this.ZA.get()::Zfc, this.ZF, this.ZG, this.Zo.ZD(), this.Zo.ZM(), this.Zy.Zi());
    return Zc(paramZt84, this.ZF, Zk20::lambda$intruderControlPanelFor$0, Zxaw.ZS, zb4j, false, paramBoolean);
  }
  
  public Zbyn Zn(Zt84 paramZt84, Zeg4 paramZeg4, Zr_4 paramZr_4, Supplier<Ztj1> paramSupplier, Zxaw paramZxaw, Runnable paramRunnable) {
    Zbq4 zbq4 = new Zbq4(paramZxaw, this.ZF, this.ZG, this.Zo.ZD(), this.Zo.ZM(), paramRunnable, paramZeg4, this.Zy.Zi());
    return Zc(paramZt84, paramZr_4, paramSupplier, paramZxaw, zbq4, true, false);
  }
  
  private Zbyn Zc(Zt84 paramZt84, Zr_4 paramZr_4, Supplier<Ztj1> paramSupplier, Zxaw paramZxaw, Zkvu paramZkvu, boolean paramBoolean1, boolean paramBoolean2) {
    AtomicReference<Zzk7> atomicReference = new AtomicReference();
    Zx80 zx80 = Zn(paramBoolean1, paramSupplier, atomicReference);
    Objects.requireNonNull(atomicReference);
    Zm0o zm0o = Zq(paramBoolean1, zx80, atomicReference::set);
    return new Zbyn(this.ZA.get(), this.Zo, this.ZG, paramZt84, this.ZZ, this.Zx, this.Zu, this.Zy, this.ZF, paramZr_4, this.ZW, this.Zz, this.ZR, this.Zg, paramZxaw, zm0o, zx80, this.ZE.get(), paramZkvu, paramBoolean1, paramBoolean2, this.Zd);
  }
  
  private Zm0o Zq(boolean paramBoolean, Ze7o paramZe7o, Consumer<Zzk7> paramConsumer) {
    Zz6x zz6x = paramBoolean ? Zz6x.INTRUDER_RUNNING : Zz6x.INTRUDER_SETUP;
    Zgol zgol = new Zgol(paramZe7o, zz6x);
    Objects.requireNonNull(this.ZA.get());
    Zszh zszh = new Zszh(new Zbyp(zgol, (Zkr6)this.ZA.get()::Zfc, paramBoolean), a);
    Zx_m zx_m = new Zx_m(zgol);
    Zzk7 zzk7 = new Zzk7(zx_m, this.ZY);
    paramConsumer.accept(zzk7);
    return zszh;
  }
  
  private Zx80 Zn(boolean paramBoolean, Supplier<Ztj1> paramSupplier, AtomicReference<Zzk7> paramAtomicReference) {
    Objects.requireNonNull(paramAtomicReference);
    Objects.requireNonNull(this.ZO.get());
    Objects.requireNonNull(this.ZY);
    Objects.requireNonNull(paramAtomicReference);
    Objects.requireNonNull(this.ZY);
    return paramBoolean ? new Ztcs(paramAtomicReference::get, (Zrfd)this.ZO.get()::Zb, paramSupplier::lambda$getIntruderResourcePoolController$1, this.ZX, paramSupplier::lambda$getIntruderResourcePoolController$2, this.ZY::Zp) : new Zgf1(paramAtomicReference::get, this.ZX, this.ZY::Zp);
  }
  
  private static Integer lambda$getIntruderResourcePoolController$2(Supplier<Ztj1> paramSupplier) {
    return Integer.valueOf(((Ztj1)paramSupplier.get()).Zf());
  }
  
  private static void lambda$getIntruderResourcePoolController$1(Supplier<Ztj1> paramSupplier, Zr5_ paramZr5_) {
    ((Ztj1)paramSupplier.get()).Zz(paramZr5_);
  }
  
  private static Ztj1 lambda$intruderControlPanelFor$0() {
    return null;
  }
  
  static {
    // Byte code:
    //   0: bipush #93
    //   2: ldc ' x~S2l=}I,'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zk20.a : Ljava/lang/String;
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
    //   80: bipush #47
    //   82: goto -> 112
    //   85: bipush #64
    //   87: goto -> 112
    //   90: bipush #80
    //   92: goto -> 112
    //   95: bipush #55
    //   97: goto -> 112
    //   100: bipush #123
    //   102: goto -> 112
    //   105: bipush #29
    //   107: goto -> 112
    //   110: bipush #82
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk20.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */