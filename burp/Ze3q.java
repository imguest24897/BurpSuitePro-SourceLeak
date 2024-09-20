package burp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Ze3q implements Zrbc {
  private final Zb0k Zs;
  
  private final Zmz6 Zc;
  
  private final Zkvg ZA;
  
  private final Zlba ZP;
  
  private final Zbza ZR;
  
  private final Zz1i ZD;
  
  private final Zbfi Zz;
  
  private final Zbje Zo;
  
  private final Ze4e ZM;
  
  private final Zz1m<Zt1o> ZY;
  
  Ze3q(Zb0k paramZb0k, Zmz6 paramZmz6, Zkvg paramZkvg, Zlba paramZlba, Zbza paramZbza, Zz1i paramZz1i, Zbfi paramZbfi, Zbje paramZbje, Ze4e paramZe4e, Zz1m<Zt1o> paramZz1m) {
    this.Zs = paramZb0k;
    this.Zc = paramZmz6;
    this.ZA = paramZkvg;
    this.ZP = paramZlba;
    this.ZR = paramZbza;
    this.ZD = paramZz1i;
    this.Zz = paramZbfi;
    this.Zo = paramZbje;
    this.ZM = paramZe4e;
    this.ZY = paramZz1m;
  }
  
  public Set<? extends Zz09> Zs() {
    boolean bool = Zg75.Zt();
    LinkedHashSet<Zz09> linkedHashSet = new LinkedHashSet<>(ZM());
    if (this.ZR.Zge()) {
      linkedHashSet.add(ZK());
      if (!bool) {
        linkedHashSet.addAll(ZC());
        return linkedHashSet;
      } 
      return linkedHashSet;
    } 
    linkedHashSet.addAll(ZC());
    return linkedHashSet;
  }
  
  private Zz09 ZK() {
    return new Zttc(this::lambda$buildInSessionAprInASingleWorkItem$3, this.Zc, this.ZP, this.ZR, this.ZD, Zt0r.A1, this.ZM);
  }
  
  private Set<? extends Zz09> ZC() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lburp/Zkvg;
    //   4: invokevirtual ZR : ()Lburp/Zg75;
    //   7: invokevirtual ZO : ()Lburp/Ze3n;
    //   10: astore_1
    //   11: aload_0
    //   12: getfield ZA : Lburp/Zkvg;
    //   15: invokevirtual ZR : ()Lburp/Zg75;
    //   18: invokevirtual ZF : ()Ljava/util/Collection;
    //   21: astore_2
    //   22: aload_0
    //   23: getfield Zs : Lburp/Zb0k;
    //   26: aload_1
    //   27: aload_2
    //   28: invokevirtual Zo : (Lburp/Ze3n;Ljava/util/Collection;)Lburp/Zkj6;
    //   31: invokeinterface get : ()Ljava/lang/Object;
    //   36: checkcast java/util/List
    //   39: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   44: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   49: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   54: aload_0
    //   55: aload_1
    //   56: <illegal opcode> apply : (Lburp/Ze3q;Lburp/Ze3n;)Ljava/util/function/Function;
    //   61: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   66: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   69: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   74: checkcast java/util/Set
    //   77: areturn
  }
  
  private Set<? extends Zz09> ZM() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lburp/Zkvg;
    //   4: invokevirtual ZR : ()Lburp/Zg75;
    //   7: invokevirtual ZO : ()Lburp/Ze3n;
    //   10: astore_1
    //   11: aload_0
    //   12: getfield ZA : Lburp/Zkvg;
    //   15: invokevirtual ZR : ()Lburp/Zg75;
    //   18: invokevirtual ZF : ()Ljava/util/Collection;
    //   21: astore_2
    //   22: aload_0
    //   23: getfield Zs : Lburp/Zb0k;
    //   26: aload_1
    //   27: aload_2
    //   28: invokevirtual ZM : (Lburp/Ze3n;Ljava/util/Collection;)Lburp/Zkj6;
    //   31: invokeinterface get : ()Ljava/lang/Object;
    //   36: checkcast java/util/List
    //   39: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   44: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   49: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   54: aload_0
    //   55: aload_1
    //   56: <illegal opcode> apply : (Lburp/Ze3q;Lburp/Ze3n;)Ljava/util/function/Function;
    //   61: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   66: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   69: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   74: checkcast java/util/Set
    //   77: areturn
  }
  
  private Zttc lambda$buildNoSessionAprInMultipleWorkItems$7(Ze3n paramZe3n, Zkrr paramZkrr) {
    // Byte code:
    //   0: new burp/Zttc
    //   3: dup
    //   4: new burp/Zqd
    //   7: dup
    //   8: aload_2
    //   9: aload_0
    //   10: getfield Zo : Lburp/Zbje;
    //   13: aload_0
    //   14: aload_1
    //   15: aload_2
    //   16: <illegal opcode> run : (Lburp/Ze3q;Lburp/Ze3n;Lburp/Zkrr;)Ljava/lang/Runnable;
    //   21: invokespecial <init> : (Lburp/Zkrr;Lburp/Zbje;Ljava/lang/Runnable;)V
    //   24: aload_0
    //   25: getfield Zc : Lburp/Zmz6;
    //   28: aload_0
    //   29: getfield ZP : Lburp/Zlba;
    //   32: aload_0
    //   33: getfield ZR : Lburp/Zbza;
    //   36: aload_0
    //   37: getfield ZD : Lburp/Zz1i;
    //   40: getstatic burp/Zt0r.A1 : Lburp/Zt0r;
    //   43: aload_0
    //   44: getfield ZM : Lburp/Ze4e;
    //   47: invokespecial <init> : (Lburp/Zlaz;Lburp/Zmz6;Lburp/Zlba;Lburp/Zbza;Lburp/Zz1i;Lburp/Zl5x;Lburp/Ze4e;)V
    //   50: areturn
  }
  
  private Zttc lambda$buildInSessionAprInMultipleWorkItems$5(Ze3n paramZe3n, Zkrr paramZkrr) {
    // Byte code:
    //   0: new burp/Zttc
    //   3: dup
    //   4: new burp/Zqd
    //   7: dup
    //   8: aload_2
    //   9: aload_0
    //   10: getfield Zo : Lburp/Zbje;
    //   13: aload_0
    //   14: aload_1
    //   15: aload_2
    //   16: <illegal opcode> run : (Lburp/Ze3q;Lburp/Ze3n;Lburp/Zkrr;)Ljava/lang/Runnable;
    //   21: invokespecial <init> : (Lburp/Zkrr;Lburp/Zbje;Ljava/lang/Runnable;)V
    //   24: aload_0
    //   25: getfield Zc : Lburp/Zmz6;
    //   28: aload_0
    //   29: getfield ZP : Lburp/Zlba;
    //   32: aload_0
    //   33: getfield ZR : Lburp/Zbza;
    //   36: aload_0
    //   37: getfield ZD : Lburp/Zz1i;
    //   40: getstatic burp/Zt0r.A1 : Lburp/Zt0r;
    //   43: aload_0
    //   44: getfield ZM : Lburp/Ze4e;
    //   47: invokespecial <init> : (Lburp/Zlaz;Lburp/Zmz6;Lburp/Zlba;Lburp/Zbza;Lburp/Zz1i;Lburp/Zl5x;Lburp/Ze4e;)V
    //   50: areturn
  }
  
  private void lambda$buildInSessionAprInMultipleWorkItems$4(Ze3n paramZe3n, Zkrr paramZkrr) {
    Zzl5.Zj(this.ZY, paramZe3n.Zm(), paramZkrr);
  }
  
  private void lambda$buildInSessionAprInASingleWorkItem$3(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lburp/Zkvg;
    //   4: invokevirtual ZR : ()Lburp/Zg75;
    //   7: invokevirtual ZO : ()Lburp/Ze3n;
    //   10: astore #5
    //   12: aload_0
    //   13: getfield ZA : Lburp/Zkvg;
    //   16: invokevirtual ZR : ()Lburp/Zg75;
    //   19: invokevirtual ZF : ()Ljava/util/Collection;
    //   22: astore #6
    //   24: aload_0
    //   25: getfield Zs : Lburp/Zb0k;
    //   28: aload #5
    //   30: aload #6
    //   32: invokevirtual Zo : (Lburp/Ze3n;Ljava/util/Collection;)Lburp/Zkj6;
    //   35: invokeinterface get : ()Ljava/lang/Object;
    //   40: checkcast java/lang/Iterable
    //   43: astore #7
    //   45: new java/util/ArrayList
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore #8
    //   54: aload #7
    //   56: aload #8
    //   58: dup
    //   59: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   68: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   73: new burp/Zs8m
    //   76: dup
    //   77: aload_0
    //   78: getfield Zz : Lburp/Zbfi;
    //   81: aload_0
    //   82: <illegal opcode> test : (Lburp/Ze3q;)Ljava/util/function/Predicate;
    //   87: aload #4
    //   89: aload_0
    //   90: aload_1
    //   91: aload_3
    //   92: aload #4
    //   94: aload #5
    //   96: <illegal opcode> accept : (Lburp/Ze3q;Lburp/Zrj;Lburp/Ztpx;Lburp/Zz4_;Lburp/Ze3n;)Ljava/util/function/Consumer;
    //   101: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   106: aload #5
    //   108: aload_0
    //   109: getfield Zo : Lburp/Zbje;
    //   112: invokespecial <init> : (Lburp/Zbfi;Ljava/util/function/Predicate;Lburp/Zm_p;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Lburp/Zl_e;Lburp/Zbzl;)V
    //   115: astore #9
    //   117: aload #9
    //   119: aload #8
    //   121: invokevirtual Zw : (Ljava/util/List;)V
    //   124: return
  }
  
  private static void lambda$buildInSessionAprInASingleWorkItem$2(Zkrr paramZkrr) {}
  
  private void lambda$buildInSessionAprInASingleWorkItem$1(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_, Ze3n paramZe3n, Zkrr paramZkrr) {
    paramZkrr.ZU(paramZrj, paramZtpx, paramZz4_);
    Zzl5.Zj(this.ZY, paramZe3n.Zm(), paramZkrr);
  }
  
  private boolean lambda$buildInSessionAprInASingleWorkItem$0(Zkrr paramZkrr) {
    return (this.Zo.ZJ() && Objects.nonNull(paramZkrr));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze3q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */