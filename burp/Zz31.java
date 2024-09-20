package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Zz31 implements Zrbc, Zlaz {
  private final Zl5x ZK;
  
  private final Zmz6 ZX;
  
  private final Zkq4 Zh;
  
  private final Zz1i ZG;
  
  private final Zlba ZU;
  
  private final Zbza ZL;
  
  private final Ze4e Zw;
  
  private final Zku7 ZR;
  
  private final Function<Ztpx, Ze3n> Zc;
  
  private final Ztj_ Zb;
  
  private final Supplier<Collection<Zb09>> Zn;
  
  public Zz31(Zl5x paramZl5x, Zmz6 paramZmz6, Zkq4 paramZkq4, Zz1i paramZz1i, Zlba paramZlba, Zbza paramZbza, Ze4e paramZe4e, Zku7 paramZku7, Function<Ztpx, Ze3n> paramFunction, Ztj_ paramZtj_, Supplier<Collection<Zb09>> paramSupplier) {
    this.ZK = paramZl5x;
    this.ZX = paramZmz6;
    this.Zh = paramZkq4;
    this.ZG = paramZz1i;
    this.ZU = paramZlba;
    this.Zw = paramZe4e;
    this.ZL = paramZbza;
    String str = Zbjb.ZP();
    this.ZR = paramZku7;
    this.Zc = paramFunction;
    this.Zb = paramZtj_;
    this.Zn = paramSupplier;
    if (Zbqc.Zwu() == null)
      Zbjb.ZN("k4wem"); 
  }
  
  public void Zf(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zc : Ljava/util/function/Function;
    //   4: aload_3
    //   5: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast burp/Ze3n
    //   13: astore #5
    //   15: aload #5
    //   17: ifnonnull -> 25
    //   20: return
    //   21: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   24: athrow
    //   25: new burp/Zbjk
    //   28: dup
    //   29: aload_0
    //   30: getfield Zw : Lburp/Ze4e;
    //   33: aload_0
    //   34: getfield ZK : Lburp/Zl5x;
    //   37: aload_0
    //   38: <illegal opcode> get : (Lburp/Zz31;)Ljava/util/function/Supplier;
    //   43: aload_0
    //   44: getfield Zh : Lburp/Zkq4;
    //   47: dup
    //   48: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   51: pop
    //   52: <illegal opcode> get : (Lburp/Zkq4;)Ljava/util/function/Supplier;
    //   57: invokespecial <init> : (Ljava/util/function/BiConsumer;Lburp/Zl5x;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V
    //   60: astore #6
    //   62: new burp/Zs8m
    //   65: dup
    //   66: aload_0
    //   67: getfield Zh : Lburp/Zkq4;
    //   70: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   75: aload #4
    //   77: aload_0
    //   78: aload_1
    //   79: aload_3
    //   80: aload #5
    //   82: aload #4
    //   84: <illegal opcode> accept : (Lburp/Zz31;Lburp/Zrj;Lburp/Ztpx;Lburp/Ze3n;Lburp/Zz4_;)Ljava/util/function/Consumer;
    //   89: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   94: aload #5
    //   96: aload #6
    //   98: invokespecial <init> : (Lburp/Zbfi;Ljava/util/function/Predicate;Lburp/Zm_p;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Lburp/Zl_e;Lburp/Zbzl;)V
    //   101: astore #7
    //   103: aload #7
    //   105: aload_0
    //   106: aload #5
    //   108: invokevirtual Zo : ()Ljava/util/List;
    //   111: aload_0
    //   112: getfield Zn : Ljava/util/function/Supplier;
    //   115: invokeinterface get : ()Ljava/lang/Object;
    //   120: checkcast java/util/Collection
    //   123: invokevirtual ZE : (Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;
    //   126: invokevirtual Zw : (Ljava/util/List;)V
    //   129: aload_0
    //   130: getfield Zb : Lburp/Ztj_;
    //   133: aload_1
    //   134: aload #5
    //   136: aload #4
    //   138: invokeinterface Z_ : (Lburp/Zrj;Lburp/Ze3n;Lburp/Zz4_;)V
    //   143: aload #6
    //   145: invokevirtual Zc : ()V
    //   148: goto -> 198
    //   151: astore #8
    //   153: aload #8
    //   155: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   158: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   161: aload_0
    //   162: getfield Zw : Lburp/Ze4e;
    //   165: aload_0
    //   166: getfield ZK : Lburp/Zl5x;
    //   169: aload_0
    //   170: getfield ZG : Lburp/Zz1i;
    //   173: aload_0
    //   174: getfield ZK : Lburp/Zl5x;
    //   177: invokeinterface Zd : (Lburp/Zl5x;)J
    //   182: aload #8
    //   184: invokestatic ZB : (Ljava/lang/Throwable;)Ljava/util/Collection;
    //   187: invokestatic Zh : (Lburp/Zl5x;JLjava/util/Collection;)Lburp/Zk1m;
    //   190: invokevirtual Zn : ()Lburp/Zb09;
    //   193: aload #8
    //   195: invokevirtual Zl : (Lburp/Zb09;Ljava/lang/Throwable;)V
    //   198: return
    // Exception table:
    //   from	to	target	type
    //   15	21	21	java/lang/Throwable
    //   103	148	151	java/lang/Throwable
  }
  
  private List<Zxs7> ZE(List<Zxs7> paramList, Collection<Zb09> paramCollection) {
    if (this.ZG.Zd(this.ZK) == 0L)
      return paramList; 
    if (paramCollection.stream().anyMatch(this::lambda$filterInsertionPointsForReplay$4))
      return paramList; 
    Set set = (Set)paramCollection.stream().filter(this::lambda$filterInsertionPointsForReplay$5).filter(Zz31::lambda$filterInsertionPointsForReplay$6).map(Zb09::ZJ2).filter(Objects::nonNull).collect(Collectors.toSet());
    return set.isEmpty() ? Collections.emptyList() : (List<Zxs7>)paramList.stream().filter(set::lambda$filterInsertionPointsForReplay$7).collect(Collectors.toList());
  }
  
  public Set<? extends Zz09> Zs() {
    return Collections.singleton(new Zttc(this, this.ZX, this.ZU, this.ZL, this.ZG, this.ZK, this.Zw));
  }
  
  private static boolean lambda$filterInsertionPointsForReplay$7(Set paramSet, Zxs7 paramZxs7) {
    return paramSet.contains(paramZxs7.Zl());
  }
  
  private static boolean lambda$filterInsertionPointsForReplay$6(Zb09 paramZb09) {
    return (paramZb09.ZJ4() == null || paramZb09.ZJ4().ZL() == Ztst.APIP);
  }
  
  private boolean lambda$filterInsertionPointsForReplay$5(Zb09 paramZb09) {
    return (paramZb09.ZJz() == this.ZK);
  }
  
  private boolean lambda$filterInsertionPointsForReplay$4(Zb09 paramZb09) {
    return paramZb09.ZY(this.ZK);
  }
  
  private static void lambda$execute$3(Zxs7 paramZxs7) {}
  
  private void lambda$execute$2(Zrj paramZrj, Ztpx paramZtpx, Ze3n paramZe3n, Zz4_ paramZz4_, Zxs7 paramZxs7) {
    this.ZR.Zn(paramZrj, paramZtpx, paramZe3n, this.ZG, paramZxs7, this.Zw).Zk(paramZz4_);
  }
  
  private static boolean lambda$execute$1(Zxs7 paramZxs7) {
    return true;
  }
  
  private Long lambda$execute$0() {
    return Long.valueOf(this.ZG.Zd(this.ZK));
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz31.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */