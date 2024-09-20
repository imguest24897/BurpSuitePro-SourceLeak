package burp;

import java.util.HashSet;
import java.util.Set;

public class Zxrb implements Zlg9 {
  private final Zgb6 Ze;
  
  private final Zkl6 ZJ;
  
  private final Set<String> Zw = new HashSet<>();
  
  private final Zl04 ZW;
  
  private final Zecc Zu;
  
  public Zxrb(Zgb6 paramZgb6, Zl04 paramZl04, Zkl6 paramZkl6, Zr_4 paramZr_4) {
    this.Ze = paramZgb6;
    this.ZW = paramZl04;
    this.ZJ = paramZkl6;
    this.Zu = new Zecc(paramZr_4);
  }
  
  public Zsxd ZE(Zsxd paramZsxd, Zz9e paramZz9e) {
    if (ZK(new Zs3v(paramZsxd))) {
      Zg3d zg3d = paramZsxd.ZX().get(0);
      return paramZz9e.Zx(zg3d.ZR());
    } 
    return paramZsxd;
  }
  
  private boolean ZK(Zs3v paramZs3v) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Z_ : Lburp/Zmzk;
    //   4: astore_2
    //   5: aload_1
    //   6: getfield Zo : I
    //   9: istore_3
    //   10: iload_3
    //   11: sipush #401
    //   14: if_icmpne -> 36
    //   17: aload_0
    //   18: getfield Ze : Lburp/Zgb6;
    //   21: invokeinterface Zf7 : ()Z
    //   26: ifne -> 56
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   35: athrow
    //   36: iload_3
    //   37: sipush #407
    //   40: if_icmpeq -> 56
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   49: athrow
    //   50: iconst_0
    //   51: ireturn
    //   52: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   55: athrow
    //   56: aload_0
    //   57: getfield Zw : Ljava/util/Set;
    //   60: aload_2
    //   61: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   66: invokeinterface contains : (Ljava/lang/Object;)Z
    //   71: ifeq -> 80
    //   74: iconst_0
    //   75: ireturn
    //   76: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   79: athrow
    //   80: aload_0
    //   81: getfield ZJ : Lburp/Zkl6;
    //   84: invokeinterface Zt : ()Lburp/Zgmh;
    //   89: astore #4
    //   91: iload_3
    //   92: sipush #401
    //   95: if_icmpne -> 123
    //   98: aload_0
    //   99: getfield ZJ : Lburp/Zkl6;
    //   102: invokeinterface Zb : ()Lburp/Zz52;
    //   107: aload_2
    //   108: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   113: invokevirtual ZI : (Ljava/lang/String;)Lburp/Zkjm;
    //   116: goto -> 163
    //   119: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   122: athrow
    //   123: aload #4
    //   125: aload_2
    //   126: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   131: invokeinterface ZG : (Ljava/lang/String;)Lburp/Zrt_;
    //   136: ifnonnull -> 147
    //   139: aconst_null
    //   140: goto -> 163
    //   143: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   146: athrow
    //   147: aload #4
    //   149: aload_2
    //   150: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   155: invokeinterface ZG : (Ljava/lang/String;)Lburp/Zrt_;
    //   160: invokevirtual ZD : ()Lburp/Zkjm;
    //   163: astore #5
    //   165: aload_2
    //   166: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   171: invokevirtual intern : ()Ljava/lang/String;
    //   174: dup
    //   175: astore #6
    //   177: monitorenter
    //   178: iload_3
    //   179: sipush #401
    //   182: if_icmpne -> 206
    //   185: aload_0
    //   186: getfield ZJ : Lburp/Zkl6;
    //   189: invokeinterface Zb : ()Lburp/Zz52;
    //   194: aload_2
    //   195: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   200: invokevirtual ZI : (Ljava/lang/String;)Lburp/Zkjm;
    //   203: goto -> 246
    //   206: aload #4
    //   208: aload_2
    //   209: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   214: invokeinterface ZG : (Ljava/lang/String;)Lburp/Zrt_;
    //   219: ifnonnull -> 230
    //   222: aconst_null
    //   223: goto -> 246
    //   226: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   229: athrow
    //   230: aload #4
    //   232: aload_2
    //   233: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   238: invokeinterface ZG : (Ljava/lang/String;)Lburp/Zrt_;
    //   243: invokevirtual ZD : ()Lburp/Zkjm;
    //   246: astore #7
    //   248: aload #7
    //   250: aload #5
    //   252: if_acmpne -> 398
    //   255: aload_0
    //   256: getfield Zw : Ljava/util/Set;
    //   259: aload_2
    //   260: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   265: invokeinterface contains : (Ljava/lang/Object;)Z
    //   270: ifeq -> 285
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   279: athrow
    //   280: iconst_0
    //   281: aload #6
    //   283: monitorexit
    //   284: ireturn
    //   285: new burp/Zr7p
    //   288: dup
    //   289: aload_0
    //   290: getfield ZW : Lburp/Zl04;
    //   293: aload_1
    //   294: aload_0
    //   295: getfield ZJ : Lburp/Zkl6;
    //   298: aload_0
    //   299: getfield Zu : Lburp/Zecc;
    //   302: invokespecial <init> : (Ljava/awt/Window;Lburp/Zs3v;Lburp/Zkl6;Lburp/Zecc;)V
    //   305: astore #8
    //   307: aload #8
    //   309: iconst_1
    //   310: invokevirtual setVisible : (Z)V
    //   313: aload #8
    //   315: dup
    //   316: astore #9
    //   318: monitorenter
    //   319: aload #8
    //   321: invokevirtual wait : ()V
    //   324: aload #9
    //   326: monitorexit
    //   327: goto -> 338
    //   330: astore #10
    //   332: aload #9
    //   334: monitorexit
    //   335: aload #10
    //   337: athrow
    //   338: goto -> 351
    //   341: astore #9
    //   343: aload #9
    //   345: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   348: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   351: aload #8
    //   353: getfield ZT : Lburp/Zzdy;
    //   356: invokevirtual isSelected : ()Z
    //   359: ifeq -> 385
    //   362: aload_0
    //   363: getfield Zw : Ljava/util/Set;
    //   366: aload_2
    //   367: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   372: invokeinterface add : (Ljava/lang/Object;)Z
    //   377: pop
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   384: athrow
    //   385: aload #8
    //   387: invokevirtual Ze : ()Z
    //   390: ifne -> 398
    //   393: iconst_0
    //   394: aload #6
    //   396: monitorexit
    //   397: ireturn
    //   398: aload #6
    //   400: monitorexit
    //   401: goto -> 412
    //   404: astore #11
    //   406: aload #6
    //   408: monitorexit
    //   409: aload #11
    //   411: athrow
    //   412: iconst_1
    //   413: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	29	32	java/lang/InterruptedException
    //   17	43	46	java/lang/InterruptedException
    //   36	52	52	java/lang/InterruptedException
    //   56	76	76	java/lang/InterruptedException
    //   91	119	119	java/lang/InterruptedException
    //   123	143	143	java/lang/InterruptedException
    //   178	284	404	finally
    //   206	226	226	java/lang/InterruptedException
    //   248	273	276	java/lang/InterruptedException
    //   285	397	404	finally
    //   313	338	341	java/lang/InterruptedException
    //   319	327	330	finally
    //   330	335	330	finally
    //   351	378	381	java/lang/InterruptedException
    //   398	401	404	finally
    //   404	409	404	finally
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxrb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */