package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Function;

class Zmhc implements Iterator<Zrbc> {
  private final Iterator<Zrbc> Zc;
  
  Zmhc(Zl5x paramZl5x, BiConsumer<Zb09, Throwable> paramBiConsumer, Zb9t paramZb9t, Zz1i paramZz1i, Zvs paramZvs, Ztbx paramZtbx, Zlc0 paramZlc0, Zz45 paramZz45, Zkc_ paramZkc_, Zbnt paramZbnt, Function<Ztpx, Zmhe> paramFunction, Zg56 paramZg56) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload #9
    //   6: aload #5
    //   8: invokevirtual ZO : (Lburp/Zvs;)[B
    //   11: astore #13
    //   13: aload #13
    //   15: invokestatic Zu : ([B)[B
    //   18: astore #14
    //   20: aload_3
    //   21: invokevirtual ZG : ()Lburp/Ze3n;
    //   24: astore #15
    //   26: aload #15
    //   28: ifnonnull -> 39
    //   31: aload_0
    //   32: invokestatic emptyIterator : ()Ljava/util/Iterator;
    //   35: putfield Zc : Ljava/util/Iterator;
    //   38: return
    //   39: new burp/Ztl
    //   42: dup
    //   43: aload #10
    //   45: aload #7
    //   47: getfield ZY : Lburp/Zg5c;
    //   50: invokespecial <init> : (Lburp/Zbnt;Lburp/Zg5c;)V
    //   53: astore #16
    //   55: new burp/Zz_q
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: astore #17
    //   64: new burp/Zsjg
    //   67: dup
    //   68: aload #7
    //   70: getfield ZH : Lburp/Zroi;
    //   73: invokespecial <init> : (Lburp/Zroi;)V
    //   76: astore #18
    //   78: iconst_2
    //   79: anewarray burp/Zrbc
    //   82: dup
    //   83: iconst_0
    //   84: aload #8
    //   86: aload_1
    //   87: aload #15
    //   89: aload #4
    //   91: aload #11
    //   93: aload_2
    //   94: aload #6
    //   96: aload #13
    //   98: aload #16
    //   100: aload #17
    //   102: aload #12
    //   104: invokevirtual Zh : (Lburp/Zl5x;Lburp/Ze3n;Lburp/Zz1i;Ljava/util/function/Function;Ljava/util/function/BiConsumer;Lburp/Ztbx;[BLburp/Ztl;Lburp/Zz_q;Lburp/Zg56;)Lburp/Zrbc;
    //   107: aastore
    //   108: dup
    //   109: iconst_1
    //   110: aload #8
    //   112: aload #15
    //   114: aload #6
    //   116: aload #5
    //   118: aload #13
    //   120: aload #16
    //   122: aload #17
    //   124: aload #18
    //   126: invokevirtual ZT : (Lburp/Ze3n;Lburp/Ztbx;Lburp/Zvs;[BLburp/Ztl;Lburp/Zz_q;Lburp/Zs4_;)Lburp/Zrbc;
    //   129: aastore
    //   130: invokestatic Zh : ([Ljava/lang/Object;)Ljava/util/List;
    //   133: invokeinterface iterator : ()Ljava/util/Iterator;
    //   138: astore #19
    //   140: aload #10
    //   142: aload #7
    //   144: aload #18
    //   146: aload #8
    //   148: aload_1
    //   149: aload #15
    //   151: aload #4
    //   153: aload #11
    //   155: aload_2
    //   156: aload #6
    //   158: aload #14
    //   160: aload #17
    //   162: aload #12
    //   164: aload #5
    //   166: <illegal opcode> iterator : (Lburp/Zbnt;Lburp/Zlc0;Lburp/Zs4_;Lburp/Zz45;Lburp/Zl5x;Lburp/Ze3n;Lburp/Zz1i;Ljava/util/function/Function;Ljava/util/function/BiConsumer;Lburp/Ztbx;[BLburp/Zz_q;Lburp/Zg56;Lburp/Zvs;)Ljava/lang/Iterable;
    //   171: astore #20
    //   173: aload_0
    //   174: new burp/Zg0e
    //   177: dup
    //   178: aload #19
    //   180: aload #20
    //   182: invokespecial <init> : (Ljava/util/Iterator;Ljava/lang/Iterable;)V
    //   185: putfield Zc : Ljava/util/Iterator;
    //   188: return
  }
  
  public boolean hasNext() {
    return this.Zc.hasNext();
  }
  
  public Zrbc Zu() {
    return this.Zc.next();
  }
  
  private static Iterator lambda$new$0(Zbnt paramZbnt, Zlc0 paramZlc0, Zs4_ paramZs4_, Zz45 paramZz45, Zl5x paramZl5x, Ze3n paramZe3n, Zz1i paramZz1i, Function<Ztpx, Zmhe> paramFunction, BiConsumer<Zb09, Throwable> paramBiConsumer, Ztbx paramZtbx, byte[] paramArrayOfbyte, Zz_q paramZz_q, Zg56 paramZg56, Zvs paramZvs) {
    Ztl ztl = new Ztl(paramZbnt, paramZlc0.ZY);
    return paramZs4_.ZD().isEmpty() ? Zb99.<Zrbc>Zh(new Zrbc[] { paramZz45.Zh(paramZl5x, paramZe3n, paramZz1i, paramFunction, paramBiConsumer, paramZtbx, paramArrayOfbyte, ztl, paramZz_q, paramZg56), paramZz45.ZT(paramZe3n, paramZtbx, paramZvs, paramArrayOfbyte, ztl, paramZz_q, paramZs4_) }).iterator() : Collections.emptyIterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmhc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */