package burp;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zgl;
import net.portswigger.Zkb;
import net.portswigger.Zm2;
import org.jetbrains.annotations.NotNull;

public class Zmci implements Zzc4 {
  private final Zlog Zu;
  
  private final Zkq4 ZS;
  
  private final Zb9a Zg;
  
  private final Zz1m<Zt1o> Zp;
  
  private final Zsus Zo;
  
  private final Zbnt ZD;
  
  private final Zey9 ZO;
  
  private final Zr69 Zm;
  
  private final AtomicInteger Zj;
  
  private Zz7n Za;
  
  Zmci(Zlog paramZlog, Zkq4 paramZkq4, Zbnt paramZbnt, Zey9 paramZey9, Zr69 paramZr69, Zb9a paramZb9a, Zz1m<Zt1o> paramZz1m, Zsus paramZsus) {
    this.Zu = paramZlog;
    this.ZS = paramZkq4;
    this.ZD = paramZbnt;
    this.ZO = paramZey9;
    this.Zm = paramZr69;
    this.Zg = paramZb9a;
    this.Zp = paramZz1m;
    this.Zo = paramZsus;
    this.Zj = new AtomicInteger(0);
  }
  
  public Zm6s<? extends Zmgr> Z_() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zj : Ljava/util/concurrent/atomic/AtomicInteger;
    //   4: iconst_0
    //   5: iconst_1
    //   6: invokevirtual compareAndSet : (II)Z
    //   9: ifeq -> 129
    //   12: aload_0
    //   13: new burp/Zz7n
    //   16: dup
    //   17: aload_0
    //   18: getfield ZD : Lburp/Zbnt;
    //   21: aload_0
    //   22: getfield ZS : Lburp/Zkq4;
    //   25: invokeinterface ZqT : ()Lburp/Zlk4;
    //   30: invokestatic Zq : (Lburp/Zlk4;)I
    //   33: aload_0
    //   34: getfield Zm : Lburp/Zr69;
    //   37: invokespecial <init> : (Lburp/Zbnt;ILburp/Zr69;)V
    //   40: putfield Za : Lburp/Zz7n;
    //   43: new burp/Zxj_
    //   46: dup
    //   47: aload_0
    //   48: getfield Zu : Lburp/Zlog;
    //   51: invokeinterface ZnH : ()Lburp/Zl7h;
    //   56: aload_0
    //   57: getfield Zm : Lburp/Zr69;
    //   60: invokespecial <init> : (Lburp/Zl7h;Lburp/Zr69;)V
    //   63: invokevirtual ZH : ()Ljava/util/List;
    //   66: astore_1
    //   67: aload_1
    //   68: invokeinterface isEmpty : ()Z
    //   73: ifeq -> 87
    //   76: aload_0
    //   77: invokestatic emptySet : ()Ljava/util/Set;
    //   80: invokevirtual Zy : (Ljava/util/Set;)V
    //   83: invokestatic ZG : ()Lburp/Zm6s;
    //   86: areturn
    //   87: new burp/Zsmf
    //   90: dup
    //   91: aload_1
    //   92: invokespecial <init> : (Ljava/util/Collection;)V
    //   95: astore_2
    //   96: aload_1
    //   97: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   102: aload_0
    //   103: aload_2
    //   104: <illegal opcode> apply : (Lburp/Zmci;Lburp/Zsmf;)Ljava/util/function/Function;
    //   109: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   114: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   117: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   122: checkcast java/util/Set
    //   125: invokestatic Zc : (Ljava/util/Set;)Lburp/Zm6s;
    //   128: areturn
    //   129: aload_0
    //   130: getfield Zj : Ljava/util/concurrent/atomic/AtomicInteger;
    //   133: iconst_1
    //   134: iconst_2
    //   135: invokevirtual compareAndSet : (II)Z
    //   138: ifeq -> 190
    //   141: new java/util/HashSet
    //   144: dup
    //   145: invokespecial <init> : ()V
    //   148: astore_1
    //   149: aload_0
    //   150: getfield Za : Lburp/Zz7n;
    //   153: invokevirtual ZF : ()Lburp/Zzba;
    //   156: aload_1
    //   157: <illegal opcode> accept : (Ljava/util/Set;)Ljava/util/function/Consumer;
    //   162: invokevirtual Zg : (Ljava/util/function/Consumer;)V
    //   165: aload_1
    //   166: invokeinterface isEmpty : ()Z
    //   171: ifeq -> 185
    //   174: aload_0
    //   175: invokestatic emptySet : ()Ljava/util/Set;
    //   178: invokevirtual Zy : (Ljava/util/Set;)V
    //   181: invokestatic ZG : ()Lburp/Zm6s;
    //   184: areturn
    //   185: aload_1
    //   186: invokestatic Zc : (Ljava/util/Set;)Lburp/Zm6s;
    //   189: areturn
    //   190: aload_0
    //   191: getfield Zj : Ljava/util/concurrent/atomic/AtomicInteger;
    //   194: iconst_2
    //   195: iconst_3
    //   196: invokevirtual compareAndSet : (II)Z
    //   199: ifeq -> 212
    //   202: aload_0
    //   203: <illegal opcode> Za : (Lburp/Zmci;)Lburp/Zmgr;
    //   208: invokestatic ZQ : (Lburp/Zm75;)Lburp/Zm6s;
    //   211: areturn
    //   212: invokestatic ZG : ()Lburp/Zm6s;
    //   215: areturn
  }
  
  @NotNull
  private Comparator<Zbza> ZX(Zze6 paramZze6) {
    Objects.requireNonNull(paramZze6);
    return Comparator.<Zbza>comparingDouble(paramZze6::Z_).reversed();
  }
  
  Zbza ZJ(Zrnc paramZrnc) {
    return this.Zm.Zt() ? this.Zo.Zv(paramZrnc.Zr().Zdz(), paramZrnc.ZH(), paramZrnc.Zy(), Zkb.ZG(paramZrnc.Zr().Zd4()), this.ZS.Zs6(), 0L, Zzg0.Zx(paramZrnc), null) : this.Zo.ZS(paramZrnc, this.ZS.Zs6());
  }
  
  private void Zy(Set<Zrnc> paramSet) {
    this.Zp.ZD(new Zxr8(Zt1o.ZR, new Zx5p(paramSet)));
    Zm2.Ze(new Zgl(this.Zu.ZPy()), Zv8r.AUDIT_ITEM_COUNT, paramSet.size());
  }
  
  private static int lambda$comparator$6(Zbza paramZbza1, Zbza paramZbza2) {
    return String.CASE_INSENSITIVE_ORDER.compare(paramZbza1.ZgY(), paramZbza2.ZgY());
  }
  
  private void lambda$nextPhase$5(Zrj paramZrj, Zlsy paramZlsy) {
    Zzba zzba = this.Za.ZF();
    Zgl zgl = new Zgl(this.Zu.ZPy());
    Zm2.Ze(zgl, Zv8r.CRAWL_NUMBER_OF_PRE_CONSOLIDATED_DESTINATIONS, zzba.Zo());
    Zm2.Ze(zgl, Zv8r.CRAWL_NUMBER_OF_DESTINATIONS, zzba.ZP());
    zzba.Zk().forEach(zgl::lambda$nextPhase$4);
    Set<Zrnc> set = zzba.ZH(this.Zm.Zv());
    List<Zbza> list = set.stream().map(this::ZJ).toList();
    Zze6 zze6 = new Zze6(this.ZD, this.ZO, this.ZS);
    zze6.Ze(list);
    Objects.requireNonNull(this.Zg);
    list.stream().sorted(ZX(zze6)).forEach(this.Zg::Zi);
    Zy(set);
  }
  
  private static void lambda$nextPhase$4(Zgl paramZgl, Zghi paramZghi, AtomicInteger paramAtomicInteger) {
    Zm2.Ze(paramZgl, paramZghi.ZW(), paramAtomicInteger.get());
  }
  
  private static void lambda$nextPhase$3(Set<Zmgr> paramSet, Runnable paramRunnable) {
    paramSet.add(paramRunnable::lambda$nextPhase$2);
  }
  
  private static void lambda$nextPhase$2(Runnable paramRunnable, Zrj paramZrj, Zlsy paramZlsy) {
    paramRunnable.run();
  }
  
  private Zmgr lambda$nextPhase$1(Zsmf paramZsmf, Zt5r paramZt5r) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_1
    //   3: <illegal opcode> Za : (Lburp/Zmci;Lburp/Zt5r;Lburp/Zsmf;)Lburp/Zmgr;
    //   8: areturn
  }
  
  private void lambda$nextPhase$0(Zt5r paramZt5r, Zsmf paramZsmf, Zrj paramZrj, Zlsy paramZlsy) {
    this.Za.Zi(paramZt5r, paramZsmf.Zn(paramZt5r));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmci.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */