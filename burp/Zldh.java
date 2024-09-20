package burp;

class Zldh implements Runnable {
  final Zgk5 ZD;
  
  private Zldh(Zgk5 paramZgk5) {}
  
  public void run() {
    // Byte code:
    //   0: invokestatic ZJ : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZD : Lburp/Zgk5;
    //   8: getfield Zy : Lburp/Ztdn;
    //   11: invokeinterface ZM : ()V
    //   16: aload_0
    //   17: getfield ZD : Lburp/Zgk5;
    //   20: getfield ZF : Lburp/Zzcq;
    //   23: dup
    //   24: astore_2
    //   25: monitorenter
    //   26: aload_0
    //   27: getfield ZD : Lburp/Zgk5;
    //   30: getfield Zy : Lburp/Ztdn;
    //   33: aload_0
    //   34: getfield ZD : Lburp/Zgk5;
    //   37: getfield ZF : Lburp/Zzcq;
    //   40: invokevirtual Zu : ()I
    //   43: invokeinterface ZI : (I)V
    //   48: aload_2
    //   49: monitorexit
    //   50: goto -> 58
    //   53: astore_3
    //   54: aload_2
    //   55: monitorexit
    //   56: aload_3
    //   57: athrow
    //   58: aload_0
    //   59: getfield ZD : Lburp/Zgk5;
    //   62: getfield Zy : Lburp/Ztdn;
    //   65: invokeinterface ZP : ()Z
    //   70: ifne -> 177
    //   73: aload_0
    //   74: getfield ZD : Lburp/Zgk5;
    //   77: getfield ZL : Ljava/lang/Object;
    //   80: dup
    //   81: astore_2
    //   82: monitorenter
    //   83: aload_0
    //   84: getfield ZD : Lburp/Zgk5;
    //   87: getfield Zo : I
    //   90: aload_0
    //   91: getfield ZD : Lburp/Zgk5;
    //   94: getfield Zy : Lburp/Ztdn;
    //   97: invokeinterface Zr : ()I
    //   102: if_icmple -> 133
    //   105: aload_0
    //   106: getfield ZD : Lburp/Zgk5;
    //   109: dup
    //   110: getfield Zo : I
    //   113: iconst_1
    //   114: isub
    //   115: putfield Zo : I
    //   118: aload_0
    //   119: getfield ZD : Lburp/Zgk5;
    //   122: getfield Zy : Lburp/Ztdn;
    //   125: invokeinterface Zc : ()V
    //   130: aload_2
    //   131: monitorexit
    //   132: return
    //   133: aload_0
    //   134: getfield ZD : Lburp/Zgk5;
    //   137: getfield Zy : Lburp/Ztdn;
    //   140: invokeinterface ZP : ()Z
    //   145: ifne -> 165
    //   148: aload_0
    //   149: getfield ZD : Lburp/Zgk5;
    //   152: getfield ZL : Ljava/lang/Object;
    //   155: invokevirtual wait : ()V
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   164: athrow
    //   165: aload_2
    //   166: monitorexit
    //   167: goto -> 177
    //   170: astore #4
    //   172: aload_2
    //   173: monitorexit
    //   174: aload #4
    //   176: athrow
    //   177: aload_0
    //   178: getfield ZD : Lburp/Zgk5;
    //   181: getfield ZL : Ljava/lang/Object;
    //   184: dup
    //   185: astore_2
    //   186: monitorenter
    //   187: aload_0
    //   188: getfield ZD : Lburp/Zgk5;
    //   191: getfield Zo : I
    //   194: aload_0
    //   195: getfield ZD : Lburp/Zgk5;
    //   198: getfield Zy : Lburp/Ztdn;
    //   201: invokeinterface Zr : ()I
    //   206: if_icmple -> 237
    //   209: aload_0
    //   210: getfield ZD : Lburp/Zgk5;
    //   213: dup
    //   214: getfield Zo : I
    //   217: iconst_1
    //   218: isub
    //   219: putfield Zo : I
    //   222: aload_0
    //   223: getfield ZD : Lburp/Zgk5;
    //   226: getfield Zy : Lburp/Ztdn;
    //   229: invokeinterface Zc : ()V
    //   234: aload_2
    //   235: monitorexit
    //   236: return
    //   237: aload_0
    //   238: getfield ZD : Lburp/Zgk5;
    //   241: invokevirtual Zq : ()V
    //   244: aload_2
    //   245: monitorexit
    //   246: goto -> 256
    //   249: astore #5
    //   251: aload_2
    //   252: monitorexit
    //   253: aload #5
    //   255: athrow
    //   256: aload_0
    //   257: getfield ZD : Lburp/Zgk5;
    //   260: invokevirtual Zs : ()Lburp/Zez3;
    //   263: astore_2
    //   264: aload_2
    //   265: ifnonnull -> 286
    //   268: iconst_0
    //   269: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   272: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   275: iload_1
    //   276: ifne -> 16
    //   279: iconst_1
    //   280: anewarray burp/Zbqc
    //   283: invokestatic Zr : ([Lburp/Zbqc;)V
    //   286: aload_0
    //   287: getfield ZD : Lburp/Zgk5;
    //   290: getfield Zy : Lburp/Ztdn;
    //   293: invokeinterface ZP : ()Z
    //   298: ifne -> 313
    //   301: aload_0
    //   302: getfield ZD : Lburp/Zgk5;
    //   305: aload_2
    //   306: invokevirtual ZF : (Lburp/Zez3;)V
    //   309: iload_1
    //   310: ifne -> 16
    //   313: new burp/Ztgc
    //   316: dup
    //   317: aload_2
    //   318: invokespecial <init> : (Lburp/Zez3;)V
    //   321: invokevirtual ZE : ()Lburp/Zs73;
    //   324: astore_3
    //   325: aload_0
    //   326: getfield ZD : Lburp/Zgk5;
    //   329: getfield Zy : Lburp/Ztdn;
    //   332: aload_2
    //   333: invokeinterface ZlL : ()Lburp/Zlit;
    //   338: aload_3
    //   339: invokeinterface ZTF : ()S
    //   344: invokeinterface ZQ : (Lburp/Zlit;S)Z
    //   349: ifne -> 387
    //   352: aload_3
    //   353: invokeinterface ZTU : ()B
    //   358: iconst_1
    //   359: if_icmpne -> 383
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   368: athrow
    //   369: aload_3
    //   370: iconst_0
    //   371: invokeinterface ZU : (B)V
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   382: athrow
    //   383: iload_1
    //   384: ifne -> 16
    //   387: aload_2
    //   388: invokestatic ZX : (Lburp/Zez3;)Z
    //   391: ifeq -> 452
    //   394: aload_0
    //   395: getfield ZD : Lburp/Zgk5;
    //   398: aload_2
    //   399: invokeinterface ZkJ : ()Lburp/Zez3;
    //   404: invokevirtual ZV : (Lburp/Zez3;)Z
    //   407: ifeq -> 452
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   416: athrow
    //   417: aload_3
    //   418: invokeinterface ZTU : ()B
    //   423: iconst_1
    //   424: if_icmpne -> 448
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   433: athrow
    //   434: aload_3
    //   435: iconst_0
    //   436: invokeinterface ZU : (B)V
    //   441: goto -> 448
    //   444: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   447: athrow
    //   448: iload_1
    //   449: ifne -> 16
    //   452: aload_0
    //   453: getfield ZD : Lburp/Zgk5;
    //   456: getfield Zs : Lburp/Zt2r;
    //   459: iconst_0
    //   460: aload_2
    //   461: invokeinterface ZlL : ()Lburp/Zlit;
    //   466: aload_3
    //   467: invokeinterface ZTR : ()Lburp/Zlit;
    //   472: aconst_null
    //   473: iconst_0
    //   474: aconst_null
    //   475: invokevirtual Zi : (BLburp/Zlit;Lburp/Zlit;Ljava/util/List;BLjava/util/concurrent/atomic/AtomicReference;)Lburp/Zstu;
    //   478: invokeinterface ZiD : ()[B
    //   483: astore #4
    //   485: aload_0
    //   486: getfield ZD : Lburp/Zgk5;
    //   489: aload_2
    //   490: aload_2
    //   491: invokeinterface ZlL : ()Lburp/Zlit;
    //   496: invokeinterface Zdz : ()Lburp/Zmzk;
    //   501: aload #4
    //   503: invokevirtual ZA : (Lburp/Zez3;Lburp/Zmzk;[B)V
    //   506: invokestatic Zc : ()V
    //   509: goto -> 16
    //   512: astore_2
    //   513: aload_2
    //   514: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   517: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   520: goto -> 16
    //   523: astore_2
    //   524: aload_2
    //   525: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   528: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   531: ldc2_w 2000
    //   534: invokestatic sleep : (J)V
    //   537: goto -> 548
    //   540: astore_3
    //   541: aload_3
    //   542: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   545: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   548: goto -> 16
    //   551: astore_2
    //   552: aload_2
    //   553: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   556: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   559: aload_0
    //   560: getfield ZD : Lburp/Zgk5;
    //   563: getfield Zs : Lburp/Zt2r;
    //   566: invokevirtual Zp : ()Lburp/Zskh;
    //   569: invokestatic ZR : (Lburp/Zskh;)V
    //   572: goto -> 16
    // Exception table:
    //   from	to	target	type
    //   16	132	512	java/lang/InterruptedException
    //   16	132	523	java/lang/Exception
    //   16	132	551	java/lang/OutOfMemoryError
    //   26	50	53	finally
    //   53	56	53	finally
    //   83	132	170	finally
    //   133	158	161	java/lang/InterruptedException
    //   133	167	170	finally
    //   133	236	512	java/lang/InterruptedException
    //   133	236	523	java/lang/Exception
    //   133	236	551	java/lang/OutOfMemoryError
    //   170	174	170	finally
    //   187	236	249	finally
    //   237	246	249	finally
    //   237	275	512	java/lang/InterruptedException
    //   237	275	523	java/lang/Exception
    //   237	275	551	java/lang/OutOfMemoryError
    //   249	253	249	finally
    //   286	309	512	java/lang/InterruptedException
    //   286	309	523	java/lang/Exception
    //   286	309	551	java/lang/OutOfMemoryError
    //   313	383	512	java/lang/InterruptedException
    //   313	383	523	java/lang/Exception
    //   313	383	551	java/lang/OutOfMemoryError
    //   325	362	365	java/lang/InterruptedException
    //   352	376	379	java/lang/InterruptedException
    //   387	410	413	java/lang/InterruptedException
    //   387	448	512	java/lang/InterruptedException
    //   387	448	523	java/lang/Exception
    //   387	448	551	java/lang/OutOfMemoryError
    //   394	427	430	java/lang/InterruptedException
    //   417	441	444	java/lang/InterruptedException
    //   452	509	512	java/lang/InterruptedException
    //   452	509	523	java/lang/Exception
    //   452	509	551	java/lang/OutOfMemoryError
    //   531	537	540	java/lang/Exception
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */