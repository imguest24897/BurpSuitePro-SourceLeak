package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Zt04 implements Iterator<Zrbc> {
  private final Iterator<Zrbc> ZA;
  
  Zt04(Zrjd paramZrjd, Zkc_ paramZkc_, Zbnt paramZbnt, Zz45 paramZz45, Zbza paramZbza, Zkm8 paramZkm8, Zzld paramZzld, Zkq4 paramZkq4, Zmz6 paramZmz6, Ze4e paramZe4e, Zr46 paramZr46, Ztij paramZtij, Zesv paramZesv, Zb9t paramZb9t, Zz1i paramZz1i, Zg56 paramZg56) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZT : ()I
    //   7: new burp/Zm7h
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: astore #18
    //   16: istore #17
    //   18: new burp/Zrry
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: astore #19
    //   27: new burp/Zlb4
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore #20
    //   36: iconst_4
    //   37: anewarray burp/Zrbc
    //   40: dup
    //   41: iconst_0
    //   42: aload #14
    //   44: aload_1
    //   45: aload #5
    //   47: aload #15
    //   49: getstatic burp/Zt0r.S2 : Lburp/Zt0r;
    //   52: aload #10
    //   54: invokestatic ZY : (Lburp/Zb9t;Lburp/Zrjd;Lburp/Zbza;Lburp/Zz1i;Lburp/Zl5x;Lburp/Ze4e;)Lburp/Zrbc;
    //   57: aastore
    //   58: dup
    //   59: iconst_1
    //   60: aload #7
    //   62: aload #14
    //   64: aload #18
    //   66: invokevirtual ZZ : (Lburp/Zb9t;Lburp/Zm7h;)Lburp/Zrbc;
    //   69: aastore
    //   70: dup
    //   71: iconst_2
    //   72: aload #7
    //   74: aload #14
    //   76: aload #18
    //   78: aload #19
    //   80: invokevirtual ZE : (Lburp/Zb9t;Lburp/Zm7h;Lburp/Zrry;)Lburp/Zrbc;
    //   83: aastore
    //   84: dup
    //   85: iconst_3
    //   86: new burp/Ztto
    //   89: dup
    //   90: aload #8
    //   92: aload #6
    //   94: aload #5
    //   96: aload #15
    //   98: getstatic burp/Zt0r.S2 : Lburp/Zt0r;
    //   101: aload #16
    //   103: aload #19
    //   105: invokevirtual ZE : ()Ljava/lang/Iterable;
    //   108: invokespecial <init> : (Lburp/Zz5u;Lburp/Zkm8;Lburp/Zbza;Lburp/Zz1i;Lburp/Zl5x;Lburp/Zg56;Ljava/lang/Iterable;)V
    //   111: aastore
    //   112: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   115: astore #21
    //   117: aload #8
    //   119: invokeinterface ZEb : ()Z
    //   124: ifeq -> 151
    //   127: aload #8
    //   129: invokeinterface ZEG : ()I
    //   134: ifle -> 151
    //   137: aload #8
    //   139: invokeinterface ZsQ : ()Z
    //   144: ifeq -> 151
    //   147: iconst_1
    //   148: goto -> 152
    //   151: iconst_0
    //   152: istore #22
    //   154: iload #22
    //   156: ifeq -> 205
    //   159: new burp/Zg0e
    //   162: dup
    //   163: aload #7
    //   165: aload #14
    //   167: aload #18
    //   169: aload #19
    //   171: aload #20
    //   173: invokevirtual ZU : (Lburp/Zb9t;Lburp/Zm7h;Lburp/Zrry;Lburp/Zlb4;)Lburp/Zrbc;
    //   176: aload #14
    //   178: aload #18
    //   180: aload #20
    //   182: aload #10
    //   184: aload #15
    //   186: aload_2
    //   187: aload_3
    //   188: aload #4
    //   190: aload #13
    //   192: aload #16
    //   194: <illegal opcode> iterator : (Lburp/Zb9t;Lburp/Zm7h;Lburp/Zlb4;Lburp/Ze4e;Lburp/Zz1i;Lburp/Zkc_;Lburp/Zbnt;Lburp/Zz45;Lburp/Zesv;Lburp/Zg56;)Ljava/lang/Iterable;
    //   199: invokespecial <init> : (Lburp/Zrbc;Ljava/lang/Iterable;)V
    //   202: goto -> 208
    //   205: getstatic burp/Zg0e.ZI : Ljava/util/Iterator;
    //   208: astore #23
    //   210: aload #8
    //   212: invokeinterface ZEo : ()Z
    //   217: ifeq -> 244
    //   220: aload #8
    //   222: invokeinterface ZE6 : ()I
    //   227: ifle -> 244
    //   230: aload #8
    //   232: invokeinterface Zs7 : ()Z
    //   237: ifeq -> 244
    //   240: iconst_1
    //   241: goto -> 245
    //   244: iconst_0
    //   245: istore #24
    //   247: iload #24
    //   249: ifeq -> 274
    //   252: aload #15
    //   254: aload #14
    //   256: aload #9
    //   258: aload #18
    //   260: aload #12
    //   262: aload #10
    //   264: aload #8
    //   266: <illegal opcode> iterator : (Lburp/Zz1i;Lburp/Zb9t;Lburp/Zmz6;Lburp/Zm7h;Lburp/Ztij;Lburp/Ze4e;Lburp/Zkq4;)Ljava/lang/Iterable;
    //   271: goto -> 279
    //   274: <illegal opcode> iterator : ()Ljava/lang/Iterable;
    //   279: astore #25
    //   281: aload #23
    //   283: aload #25
    //   285: <illegal opcode> iterator : (Ljava/util/Iterator;Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   290: astore #26
    //   292: aload_0
    //   293: new burp/Zrf3
    //   296: dup
    //   297: getstatic burp/Zt0r.S2 : Lburp/Zt0r;
    //   300: aload #5
    //   302: new burp/Zg0e
    //   305: dup
    //   306: new burp/Ztmi
    //   309: dup
    //   310: getstatic burp/Zt0r.S2 : Lburp/Zt0r;
    //   313: aload #15
    //   315: aload #5
    //   317: aload #14
    //   319: invokevirtual ZN : ()Ljava/util/Collection;
    //   322: dup
    //   323: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   326: pop
    //   327: <illegal opcode> accept : (Ljava/util/Collection;)Ljava/util/function/Consumer;
    //   332: invokespecial <init> : (Lburp/Zl5x;Lburp/Zz1i;Lburp/Zbza;Ljava/util/function/Consumer;)V
    //   335: aload #21
    //   337: aload #26
    //   339: aload #5
    //   341: aload #11
    //   343: aload #16
    //   345: <illegal opcode> iterator : (Ljava/util/List;Ljava/lang/Iterable;Lburp/Zbza;Lburp/Zr46;Lburp/Zg56;)Ljava/lang/Iterable;
    //   350: invokespecial <init> : (Lburp/Zrbc;Ljava/lang/Iterable;)V
    //   353: invokespecial <init> : (Lburp/Zl5x;Lburp/Zbza;Ljava/util/Iterator;)V
    //   356: putfield ZA : Ljava/util/Iterator;
    //   359: iload #17
    //   361: ifne -> 371
    //   364: iconst_5
    //   365: anewarray burp/Zbqc
    //   368: invokestatic Zr : ([Lburp/Zbqc;)V
    //   371: return
  }
  
  public boolean hasNext() {
    return this.ZA.hasNext();
  }
  
  public Zrbc Zb() {
    return this.ZA.next();
  }
  
  private static Iterator lambda$new$3(List<Zrbc> paramList, Iterable<Zrbc> paramIterable, Zbza paramZbza, Zr46 paramZr46, Zg56 paramZg56) {
    return new Zg0e(new Zg0e(paramList.iterator(), paramIterable), Arrays.asList(new Zrbc[] { new Zso2(Zt0r.S2, paramZbza, paramZr46), Zrbc.Zd(Collections.singleton(paramZg56.Zv())) }));
  }
  
  private static Iterator lambda$new$2(Iterator<Zrbc> paramIterator, Iterable<Zrbc> paramIterable) {
    return new Zg0e(paramIterator, paramIterable);
  }
  
  private static Iterator lambda$new$1(Zz1i paramZz1i, Zb9t paramZb9t, Zmz6 paramZmz6, Zm7h paramZm7h, Ztij paramZtij, Ze4e paramZe4e, Zkq4 paramZkq4) {
    Objects.requireNonNull(paramZkq4);
    return new Zmr2(Zt0r.S2, paramZz1i, paramZb9t, paramZmz6, paramZm7h, paramZtij, paramZe4e, paramZkq4::ZsQ);
  }
  
  private static Iterator lambda$new$0(Zb9t paramZb9t, Zm7h paramZm7h, Zlb4 paramZlb4, Ze4e paramZe4e, Zz1i paramZz1i, Zkc_ paramZkc_, Zbnt paramZbnt, Zz45 paramZz45, Zesv paramZesv, Zg56 paramZg56) {
    return new Zzrp(paramZb9t, paramZm7h, paramZlb4, new Zvz(paramZe4e, paramZb9t, paramZz1i, paramZlb4, paramZkc_, paramZbnt, paramZz45, paramZesv, paramZg56));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt04.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */