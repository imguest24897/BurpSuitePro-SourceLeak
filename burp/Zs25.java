package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Zs25 implements Iterator<Zrbc> {
  private final Iterator<Zrbc> ZQ;
  
  private Zs25(Zte5 paramZte5, Zrjd paramZrjd, Zbza paramZbza, Zz45 paramZz45, Zkc_ paramZkc_, Zbnt paramZbnt, Zkm8 paramZkm8, Zkq4 paramZkq4, Zmz6 paramZmz6, Ze4e paramZe4e, Zr46 paramZr46, Zesv paramZesv, Ztij paramZtij, Zb9t paramZb9t, Zz1i paramZz1i, Zg56 paramZg56) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: new burp/Zm7h
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore #17
    //   13: new burp/Zrry
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore #18
    //   22: new burp/Zlb4
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore #19
    //   31: iconst_4
    //   32: anewarray burp/Zrbc
    //   35: dup
    //   36: iconst_0
    //   37: aload #14
    //   39: aload_2
    //   40: aload_3
    //   41: aload #15
    //   43: getstatic burp/Zt0r.S3 : Lburp/Zt0r;
    //   46: aload #10
    //   48: invokestatic ZY : (Lburp/Zb9t;Lburp/Zrjd;Lburp/Zbza;Lburp/Zz1i;Lburp/Zl5x;Lburp/Ze4e;)Lburp/Zrbc;
    //   51: aastore
    //   52: dup
    //   53: iconst_1
    //   54: aload_1
    //   55: aload #14
    //   57: aload #17
    //   59: invokevirtual Zc : (Lburp/Zb9t;Lburp/Zm7h;)Lburp/Zrbc;
    //   62: aastore
    //   63: dup
    //   64: iconst_2
    //   65: aload_1
    //   66: aload #14
    //   68: aload #17
    //   70: aload #18
    //   72: invokevirtual Zs : (Lburp/Zb9t;Lburp/Zm7h;Lburp/Zrry;)Lburp/Zrbc;
    //   75: aastore
    //   76: dup
    //   77: iconst_3
    //   78: new burp/Ztto
    //   81: dup
    //   82: aload #8
    //   84: aload #7
    //   86: aload_3
    //   87: aload #15
    //   89: getstatic burp/Zt0r.S3 : Lburp/Zt0r;
    //   92: aload #16
    //   94: aload #18
    //   96: invokevirtual ZE : ()Ljava/lang/Iterable;
    //   99: invokespecial <init> : (Lburp/Zz5u;Lburp/Zkm8;Lburp/Zbza;Lburp/Zz1i;Lburp/Zl5x;Lburp/Zg56;Ljava/lang/Iterable;)V
    //   102: aastore
    //   103: invokestatic Zh : ([Ljava/lang/Object;)Ljava/util/List;
    //   106: astore #20
    //   108: aload #8
    //   110: invokeinterface ZEb : ()Z
    //   115: ifeq -> 142
    //   118: aload #8
    //   120: invokeinterface ZEG : ()I
    //   125: ifle -> 142
    //   128: aload #8
    //   130: invokeinterface ZsM : ()Z
    //   135: ifeq -> 142
    //   138: iconst_1
    //   139: goto -> 143
    //   142: iconst_0
    //   143: istore #21
    //   145: iload #21
    //   147: ifeq -> 197
    //   150: new burp/Zg0e
    //   153: dup
    //   154: aload_1
    //   155: aload #14
    //   157: aload #17
    //   159: aload #18
    //   161: aload #19
    //   163: invokevirtual ZI : (Lburp/Zb9t;Lburp/Zm7h;Lburp/Zrry;Lburp/Zlb4;)Lburp/Zrbc;
    //   166: aload #14
    //   168: aload #17
    //   170: aload #19
    //   172: aload #10
    //   174: aload #15
    //   176: aload #4
    //   178: aload #5
    //   180: aload #6
    //   182: aload #12
    //   184: aload #16
    //   186: <illegal opcode> iterator : (Lburp/Zb9t;Lburp/Zm7h;Lburp/Zlb4;Lburp/Ze4e;Lburp/Zz1i;Lburp/Zz45;Lburp/Zkc_;Lburp/Zbnt;Lburp/Zesv;Lburp/Zg56;)Ljava/lang/Iterable;
    //   191: invokespecial <init> : (Lburp/Zrbc;Ljava/lang/Iterable;)V
    //   194: goto -> 200
    //   197: getstatic burp/Zg0e.ZI : Ljava/util/Iterator;
    //   200: astore #22
    //   202: aload #8
    //   204: invokeinterface ZEo : ()Z
    //   209: ifeq -> 236
    //   212: aload #8
    //   214: invokeinterface ZE6 : ()I
    //   219: ifle -> 236
    //   222: aload #8
    //   224: invokeinterface Zsa : ()Z
    //   229: ifeq -> 236
    //   232: iconst_1
    //   233: goto -> 237
    //   236: iconst_0
    //   237: istore #23
    //   239: iload #23
    //   241: ifeq -> 266
    //   244: aload #15
    //   246: aload #14
    //   248: aload #9
    //   250: aload #17
    //   252: aload #13
    //   254: aload #10
    //   256: aload #8
    //   258: <illegal opcode> iterator : (Lburp/Zz1i;Lburp/Zb9t;Lburp/Zmz6;Lburp/Zm7h;Lburp/Ztij;Lburp/Ze4e;Lburp/Zkq4;)Ljava/lang/Iterable;
    //   263: goto -> 271
    //   266: <illegal opcode> iterator : ()Ljava/lang/Iterable;
    //   271: astore #24
    //   273: aload #22
    //   275: aload #24
    //   277: <illegal opcode> iterator : (Ljava/util/Iterator;Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   282: astore #25
    //   284: aload_0
    //   285: new burp/Zrf3
    //   288: dup
    //   289: getstatic burp/Zt0r.S3 : Lburp/Zt0r;
    //   292: aload_3
    //   293: new burp/Zg0e
    //   296: dup
    //   297: new burp/Ztmi
    //   300: dup
    //   301: getstatic burp/Zt0r.S3 : Lburp/Zt0r;
    //   304: aload #15
    //   306: aload_3
    //   307: aload #14
    //   309: invokevirtual ZN : ()Ljava/util/Collection;
    //   312: dup
    //   313: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   316: pop
    //   317: <illegal opcode> accept : (Ljava/util/Collection;)Ljava/util/function/Consumer;
    //   322: invokespecial <init> : (Lburp/Zl5x;Lburp/Zz1i;Lburp/Zbza;Ljava/util/function/Consumer;)V
    //   325: aload #20
    //   327: aload #25
    //   329: aload_3
    //   330: aload #11
    //   332: aload #16
    //   334: <illegal opcode> iterator : (Ljava/util/List;Ljava/lang/Iterable;Lburp/Zbza;Lburp/Zr46;Lburp/Zg56;)Ljava/lang/Iterable;
    //   339: invokespecial <init> : (Lburp/Zrbc;Ljava/lang/Iterable;)V
    //   342: invokespecial <init> : (Lburp/Zl5x;Lburp/Zbza;Ljava/util/Iterator;)V
    //   345: putfield ZQ : Ljava/util/Iterator;
    //   348: return
  }
  
  public boolean hasNext() {
    return this.ZQ.hasNext();
  }
  
  public Zrbc Zn() {
    return this.ZQ.next();
  }
  
  private static Iterator lambda$new$3(List<Zrbc> paramList, Iterable<Zrbc> paramIterable, Zbza paramZbza, Zr46 paramZr46, Zg56 paramZg56) {
    return new Zg0e(new Zg0e(paramList.iterator(), paramIterable), Zb99.Zh(new Zrbc[] { new Zso2(Zt0r.S3, paramZbza, paramZr46), Zrbc.Zd(Collections.singleton(paramZg56.Zv())) }));
  }
  
  private static Iterator lambda$new$2(Iterator<Zrbc> paramIterator, Iterable<Zrbc> paramIterable) {
    return new Zg0e(paramIterator, paramIterable);
  }
  
  private static Iterator lambda$new$1(Zz1i paramZz1i, Zb9t paramZb9t, Zmz6 paramZmz6, Zm7h paramZm7h, Ztij paramZtij, Ze4e paramZe4e, Zkq4 paramZkq4) {
    Objects.requireNonNull(paramZkq4);
    return new Zmr2(Zt0r.S3, paramZz1i, paramZb9t, paramZmz6, paramZm7h, paramZtij, paramZe4e, paramZkq4::Zsa);
  }
  
  private static Iterator lambda$new$0(Zb9t paramZb9t, Zm7h paramZm7h, Zlb4 paramZlb4, Ze4e paramZe4e, Zz1i paramZz1i, Zz45 paramZz45, Zkc_ paramZkc_, Zbnt paramZbnt, Zesv paramZesv, Zg56 paramZg56) {
    return new Zzrp(paramZb9t, paramZm7h, paramZlb4, new Zskp(paramZe4e, paramZb9t, paramZz1i, paramZlb4, paramZz45, paramZkc_, paramZbnt, paramZesv, paramZg56));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs25.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */