package net.portswigger;

import java.util.concurrent.ExecutorService;

class Zdv implements Zl4 {
  private final ExecutorService Zp;
  
  private final int Ze;
  
  private final Zl4 ZE;
  
  private final int ZA;
  
  public Zdv(ExecutorService paramExecutorService, int paramInt1, Zl4 paramZl4, int paramInt2) {
    this.Zp = paramExecutorService;
    this.Ze = paramInt1;
    this.ZE = paramZl4;
    this.ZA = paramInt2;
  }
  
  public int Zh(Zq paramZq, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZX : ()[I
    //   3: iload_3
    //   4: iload_2
    //   5: isub
    //   6: istore #5
    //   8: astore #4
    //   10: iload #5
    //   12: aload_0
    //   13: getfield Ze : I
    //   16: if_icmple -> 248
    //   19: iload #5
    //   21: aload_0
    //   22: getfield ZA : I
    //   25: idiv
    //   26: iconst_1
    //   27: invokestatic max : (II)I
    //   30: iconst_4
    //   31: invokestatic min : (II)I
    //   34: istore #6
    //   36: iload #5
    //   38: iload #6
    //   40: idiv
    //   41: istore #7
    //   43: new java/util/ArrayList
    //   46: dup
    //   47: iload #6
    //   49: invokespecial <init> : (I)V
    //   52: astore #8
    //   54: iconst_0
    //   55: istore #9
    //   57: iload #9
    //   59: iload #6
    //   61: if_icmpge -> 139
    //   64: iload_2
    //   65: iload #9
    //   67: iload #7
    //   69: imul
    //   70: iadd
    //   71: istore #10
    //   73: iload #9
    //   75: iload #6
    //   77: iconst_1
    //   78: isub
    //   79: if_icmpne -> 90
    //   82: iload_3
    //   83: goto -> 110
    //   86: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   89: athrow
    //   90: iload_2
    //   91: iload #9
    //   93: iconst_1
    //   94: iadd
    //   95: iload #7
    //   97: imul
    //   98: iadd
    //   99: aload_0
    //   100: getfield ZA : I
    //   103: iadd
    //   104: iconst_1
    //   105: isub
    //   106: iload_3
    //   107: invokestatic min : (II)I
    //   110: istore #11
    //   112: aload #8
    //   114: aload_0
    //   115: aload_1
    //   116: iload #10
    //   118: iload #11
    //   120: <illegal opcode> call : (Lnet/portswigger/Zdv;Lnet/portswigger/Zq;II)Ljava/util/concurrent/Callable;
    //   125: invokeinterface add : (Ljava/lang/Object;)Z
    //   130: pop
    //   131: iinc #9, 1
    //   134: aload #4
    //   136: ifnonnull -> 57
    //   139: aload_0
    //   140: getfield Zp : Ljava/util/concurrent/ExecutorService;
    //   143: aload #8
    //   145: invokeinterface invokeAll : (Ljava/util/Collection;)Ljava/util/List;
    //   150: astore #9
    //   152: iconst_m1
    //   153: istore #10
    //   155: aload #9
    //   157: invokeinterface iterator : ()Ljava/util/Iterator;
    //   162: astore #11
    //   164: aload #11
    //   166: invokeinterface hasNext : ()Z
    //   171: ifeq -> 233
    //   174: aload #11
    //   176: invokeinterface next : ()Ljava/lang/Object;
    //   181: checkcast java/util/concurrent/Future
    //   184: astore #12
    //   186: iload #10
    //   188: iconst_m1
    //   189: if_icmpeq -> 213
    //   192: aload #12
    //   194: iconst_0
    //   195: invokeinterface cancel : (Z)Z
    //   200: pop
    //   201: aload #4
    //   203: ifnonnull -> 228
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   212: athrow
    //   213: aload #12
    //   215: invokeinterface get : ()Ljava/lang/Object;
    //   220: checkcast java/lang/Integer
    //   223: invokevirtual intValue : ()I
    //   226: istore #10
    //   228: aload #4
    //   230: ifnonnull -> 164
    //   233: iload #10
    //   235: ireturn
    //   236: astore #9
    //   238: aload #9
    //   240: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   243: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   246: iconst_m1
    //   247: ireturn
    //   248: aload_0
    //   249: getfield ZE : Lnet/portswigger/Zl4;
    //   252: aload_1
    //   253: iload_2
    //   254: iload_3
    //   255: invokeinterface Zh : (Lnet/portswigger/Zq;II)I
    //   260: ireturn
    // Exception table:
    //   from	to	target	type
    //   73	86	86	java/lang/InterruptedException
    //   139	235	236	java/lang/InterruptedException
    //   139	235	236	java/util/concurrent/ExecutionException
    //   186	206	209	java/lang/InterruptedException
  }
  
  private Integer lambda$search$0(Zq paramZq, int paramInt1, int paramInt2) throws Exception {
    return Integer.valueOf(this.ZE.Zh(paramZq, paramInt1, paramInt2));
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zdv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */