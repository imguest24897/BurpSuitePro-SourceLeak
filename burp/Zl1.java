package burp;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class Zl1 implements Zm8_ {
  protected final Zkq4 ZP;
  
  private final Zsoh ZL;
  
  private final Zrj Zm;
  
  private final Ztpx ZW;
  
  private final Zlba Zu;
  
  private final Ze3n Zx;
  
  private final Ze3n Zy;
  
  private final Zl_e Zz;
  
  private final Collection<Zb09> ZS;
  
  private final Ztos<Zt1o> Zq;
  
  private final AtomicBoolean Zn = new AtomicBoolean();
  
  Zl1(Zsoh paramZsoh, Zrj paramZrj, Ztpx paramZtpx, Zkq4 paramZkq4, Zlba paramZlba, Ze3n paramZe3n1, Ze3n paramZe3n2, Zl_e paramZl_e, Collection<Zb09> paramCollection, Ztos<Zt1o> paramZtos) {
    this.ZL = paramZsoh;
    this.Zm = paramZrj;
    this.ZW = paramZtpx;
    this.ZP = paramZkq4;
    this.Zu = paramZlba;
    this.Zx = paramZe3n1;
    this.Zy = paramZe3n2;
    this.Zz = paramZl_e;
    this.ZS = paramCollection;
    this.Zq = paramZtos;
  }
  
  public void Zs(Zxs7 paramZxs7, Zmg6 paramZmg6, Zz4_ paramZz4_) {
    ZG(paramZxs7, paramZz4_, paramZmg6);
  }
  
  abstract Zbja Zf(Zxs7 paramZxs7);
  
  abstract List<Zm9n> Zm(Zsoh paramZsoh, Ze3n paramZe3n1, Ze3n paramZe3n2, Zxs7 paramZxs7, Zmg6 paramZmg6, Collection<Zb09> paramCollection);
  
  private void ZG(Zxs7 paramZxs7, Zz4_ paramZz4_, Zmg6 paramZmg6) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zq : Lburp/Ztos;
    //   4: getstatic burp/Zt1o.ZM : Lburp/Zlnb;
    //   7: aload_0
    //   8: aload_1
    //   9: <illegal opcode> accept : (Lburp/Zl1;Lburp/Zxs7;)Ljava/util/function/Consumer;
    //   14: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   17: astore #4
    //   19: aload_0
    //   20: aload_0
    //   21: getfield ZL : Lburp/Zsoh;
    //   24: aload_0
    //   25: getfield Zx : Lburp/Ze3n;
    //   28: aload_0
    //   29: getfield Zy : Lburp/Ze3n;
    //   32: aload_1
    //   33: aload_3
    //   34: aload_0
    //   35: getfield ZS : Ljava/util/Collection;
    //   38: invokevirtual Zm : (Lburp/Zsoh;Lburp/Ze3n;Lburp/Ze3n;Lburp/Zxs7;Lburp/Zmg6;Ljava/util/Collection;)Ljava/util/List;
    //   41: astore #5
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual Zf : (Lburp/Zxs7;)Lburp/Zbja;
    //   48: astore #6
    //   50: new burp/Zs8m
    //   53: dup
    //   54: aload_0
    //   55: getfield ZP : Lburp/Zkq4;
    //   58: aload_0
    //   59: <illegal opcode> test : (Lburp/Zl1;)Ljava/util/function/Predicate;
    //   64: aload_2
    //   65: aload_0
    //   66: aload_3
    //   67: aload_2
    //   68: aload_1
    //   69: <illegal opcode> accept : (Lburp/Zl1;Lburp/Zmg6;Lburp/Zz4_;Lburp/Zxs7;)Ljava/util/function/Consumer;
    //   74: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   79: aload_0
    //   80: getfield Zz : Lburp/Zl_e;
    //   83: aload #6
    //   85: invokespecial <init> : (Lburp/Zbfi;Ljava/util/function/Predicate;Lburp/Zm_p;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Lburp/Zl_e;Lburp/Zbzl;)V
    //   88: astore #7
    //   90: aload #7
    //   92: aload #5
    //   94: invokevirtual Zw : (Ljava/util/List;)V
    //   97: aload #6
    //   99: invokevirtual Zc : ()V
    //   102: aload #4
    //   104: invokeinterface ZZ : ()V
    //   109: goto -> 124
    //   112: astore #8
    //   114: aload #4
    //   116: invokeinterface ZZ : ()V
    //   121: aload #8
    //   123: athrow
    //   124: return
    // Exception table:
    //   from	to	target	type
    //   19	102	112	finally
    //   112	114	112	finally
  }
  
  public boolean Zx() {
    return this.Zn.get();
  }
  
  private static void lambda$doPerInsertionPointChecks$4(Zm9n paramZm9n) {}
  
  private void lambda$doPerInsertionPointChecks$3(Zmg6 paramZmg6, Zz4_ paramZz4_, Zxs7 paramZxs7, Zm9n paramZm9n) {
    paramZmg6.ZH().ZB();
    paramZm9n.ZU(this.Zm, this.ZW, paramZz4_);
    Zzl5.ZY(this.Zq, paramZxs7, this.Zx.Zm(), paramZm9n);
  }
  
  private boolean lambda$doPerInsertionPointChecks$2(Zm9n paramZm9n) {
    return (paramZm9n != null && (!this.ZP.Zqo() || paramZm9n.Zf()) && this.Zu.Zw(this.Zx.ZM()));
  }
  
  private void lambda$doPerInsertionPointChecks$1(Zxs7 paramZxs7, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lburp/Zl1;Lburp/Zxs7;)Ljava/util/function/Consumer;
    //   8: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   11: return
  }
  
  private void lambda$doPerInsertionPointChecks$0(Zxs7 paramZxs7, Zx50 paramZx50) {
    if (paramZx50.ZdQ() == paramZxs7)
      this.Zn.set(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */