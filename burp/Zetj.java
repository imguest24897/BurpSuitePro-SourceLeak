package burp;

public class Zetj implements Runnable {
  private final Ze8 ZB;
  
  private final Zl5k ZD;
  
  private final Zbx9 Zw;
  
  private final Zbnt Zn;
  
  private final Zey9 Zl;
  
  public Zetj(Ze8 paramZe8, Zl5k paramZl5k, Zbx9 paramZbx9, Zbnt paramZbnt, Zey9 paramZey9) {
    this.ZB = paramZe8;
    this.ZD = paramZl5k;
    this.Zw = paramZbx9;
    this.Zn = paramZbnt;
    this.Zl = paramZey9;
  }
  
  public void run() {
    // Byte code:
    //   0: invokestatic Zt : ()I
    //   3: istore_1
    //   4: aconst_null
    //   5: astore_2
    //   6: new java/util/concurrent/atomic/AtomicBoolean
    //   9: dup
    //   10: iconst_0
    //   11: invokespecial <init> : (Z)V
    //   14: astore_3
    //   15: aload_0
    //   16: getfield Zw : Lburp/Zbx9;
    //   19: aload_0
    //   20: getfield Zl : Lburp/Zey9;
    //   23: aload_0
    //   24: getfield ZD : Lburp/Zl5k;
    //   27: getfield Zf : Lburp/Zmzk;
    //   30: aload_0
    //   31: getfield ZD : Lburp/Zl5k;
    //   34: getfield ZT : [B
    //   37: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   40: invokevirtual ZV : (Lburp/Zefx;)Lburp/Zg3d;
    //   43: astore #4
    //   45: aload #4
    //   47: invokeinterface ZI : ()Z
    //   52: ifne -> 68
    //   55: aload #4
    //   57: invokeinterface Zb : ()Lburp/Zvom;
    //   62: getstatic burp/Zvom.RESPONSE_RECEIVED : Lburp/Zvom;
    //   65: if_acmpeq -> 84
    //   68: aload_3
    //   69: iconst_1
    //   70: invokevirtual set : (Z)V
    //   73: iload_1
    //   74: ifeq -> 286
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   83: athrow
    //   84: aload #4
    //   86: invokeinterface Ze : ()Lburp/Zb6q;
    //   91: invokeinterface Za : ()Lburp/Zstu;
    //   96: invokeinterface ZiD : ()[B
    //   101: astore #5
    //   103: getstatic burp/Zx6c.ZG : [I
    //   106: aload_0
    //   107: getfield ZD : Lburp/Zl5k;
    //   110: getfield ZM : Lburp/Zgml;
    //   113: invokevirtual ordinal : ()I
    //   116: iaload
    //   117: tableswitch default -> 286, 1 -> 144, 2 -> 184, 3 -> 240
    //   144: aload #5
    //   146: invokestatic ZT : ([B)Ljava/util/Map;
    //   149: astore #6
    //   151: aload #6
    //   153: aload_0
    //   154: getfield ZD : Lburp/Zl5k;
    //   157: getfield Zc : Ljava/lang/String;
    //   160: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   165: checkcast java/lang/String
    //   168: astore #7
    //   170: aload #7
    //   172: ifnull -> 286
    //   175: aload #7
    //   177: invokestatic Zy : (Ljava/lang/String;)[B
    //   180: astore_2
    //   181: goto -> 286
    //   184: aload #5
    //   186: aload #4
    //   188: invokeinterface Ze : ()Lburp/Zb6q;
    //   193: invokeinterface Zs : ()I
    //   198: aload_0
    //   199: getfield Zn : Lburp/Zbnt;
    //   202: invokestatic ZU : ([BILburp/Zbnt;)Ljava/util/Map;
    //   205: astore #6
    //   207: aload #6
    //   209: aload_0
    //   210: getfield ZD : Lburp/Zl5k;
    //   213: getfield Zc : Ljava/lang/String;
    //   216: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   221: checkcast java/lang/String
    //   224: astore #7
    //   226: aload #7
    //   228: ifnull -> 286
    //   231: aload #7
    //   233: invokestatic Zy : (Ljava/lang/String;)[B
    //   236: astore_2
    //   237: goto -> 286
    //   240: aload_0
    //   241: getfield ZD : Lburp/Zl5k;
    //   244: getfield ZL : Lburp/Zkk3;
    //   247: aload #5
    //   249: aconst_null
    //   250: aload #4
    //   252: invokeinterface Ze : ()Lburp/Zb6q;
    //   257: invokeinterface Zs : ()I
    //   262: invokevirtual Zh : ([BLjava/lang/String;I)[I
    //   265: astore #6
    //   267: aload #6
    //   269: ifnull -> 286
    //   272: aload #5
    //   274: aload #6
    //   276: iconst_0
    //   277: iaload
    //   278: aload #6
    //   280: iconst_1
    //   281: iaload
    //   282: invokestatic Zz : ([BII)[B
    //   285: astore_2
    //   286: invokestatic Zc : ()V
    //   289: goto -> 312
    //   292: astore #4
    //   294: aload #4
    //   296: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   299: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   302: aload_0
    //   303: getfield ZB : Lburp/Ze8;
    //   306: invokevirtual Zw : ()Lburp/Zskh;
    //   309: invokestatic ZR : (Lburp/Zskh;)V
    //   312: aload_2
    //   313: ifnull -> 330
    //   316: aload_2
    //   317: arraylength
    //   318: ifne -> 330
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   327: athrow
    //   328: aconst_null
    //   329: astore_2
    //   330: aload_0
    //   331: getfield ZB : Lburp/Ze8;
    //   334: aload_2
    //   335: aload_3
    //   336: invokevirtual get : ()Z
    //   339: invokevirtual Zh : ([BZ)Z
    //   342: ifne -> 352
    //   345: goto -> 401
    //   348: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   351: athrow
    //   352: aload_0
    //   353: getfield ZD : Lburp/Zl5k;
    //   356: getfield Zy : Lburp/Zrwv;
    //   359: getfield ZC : J
    //   362: lconst_0
    //   363: lcmp
    //   364: ifle -> 397
    //   367: aload_0
    //   368: getfield ZD : Lburp/Zl5k;
    //   371: getfield Zy : Lburp/Zrwv;
    //   374: getfield ZC : J
    //   377: invokestatic sleep : (J)V
    //   380: goto -> 397
    //   383: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   386: athrow
    //   387: astore #4
    //   389: aload #4
    //   391: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   394: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   397: iload_1
    //   398: ifeq -> 4
    //   401: return
    // Exception table:
    //   from	to	target	type
    //   15	289	292	java/lang/OutOfMemoryError
    //   55	77	80	java/lang/OutOfMemoryError
    //   312	321	324	java/lang/OutOfMemoryError
    //   330	348	348	java/lang/OutOfMemoryError
    //   352	383	383	java/lang/OutOfMemoryError
    //   367	380	387	java/lang/InterruptedException
  }
  
  private static OutOfMemoryError a(OutOfMemoryError paramOutOfMemoryError) {
    return paramOutOfMemoryError;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zetj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */