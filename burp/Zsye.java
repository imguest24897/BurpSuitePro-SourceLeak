package burp;

import java.io.ByteArrayOutputStream;

class Zsye implements Zrch {
  private boolean ZS(Zbi8 paramZbi8, boolean paramBoolean, ByteArrayOutputStream paramByteArrayOutputStream) {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: getfield Zo : I
    //   9: iconst_4
    //   10: if_icmpge -> 19
    //   13: iconst_0
    //   14: ireturn
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: aload_1
    //   20: getfield Zu : [B
    //   23: aload_1
    //   24: getfield Zv : I
    //   27: baload
    //   28: bipush #38
    //   30: if_icmpeq -> 39
    //   33: iconst_0
    //   34: ireturn
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: iconst_m1
    //   40: istore #5
    //   42: iconst_1
    //   43: istore #6
    //   45: iload #6
    //   47: bipush #8
    //   49: if_icmpge -> 109
    //   52: iload #6
    //   54: aload_1
    //   55: getfield Zo : I
    //   58: if_icmpge -> 109
    //   61: aload_1
    //   62: getfield Zu : [B
    //   65: aload_1
    //   66: getfield Zv : I
    //   69: iload #6
    //   71: iadd
    //   72: baload
    //   73: bipush #59
    //   75: if_icmpne -> 94
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: iload #6
    //   87: istore #5
    //   89: aload #4
    //   91: ifnull -> 109
    //   94: iinc #6, 1
    //   97: aload #4
    //   99: ifnull -> 45
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   108: athrow
    //   109: iload #5
    //   111: iconst_m1
    //   112: if_icmpne -> 121
    //   115: iconst_0
    //   116: ireturn
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: iconst_0
    //   122: istore #6
    //   124: aload_1
    //   125: getfield Zu : [B
    //   128: aload_1
    //   129: getfield Zv : I
    //   132: iconst_1
    //   133: iadd
    //   134: iload #5
    //   136: iconst_1
    //   137: isub
    //   138: invokestatic Zo : ([BII)Ljava/lang/String;
    //   141: astore #7
    //   143: getstatic net/portswigger/Zrzt.Z_ : Ljava/util/Map;
    //   146: aload #7
    //   148: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   153: checkcast java/lang/Character
    //   156: astore #8
    //   158: aload #8
    //   160: ifnull -> 191
    //   163: iconst_1
    //   164: istore #6
    //   166: aload_3
    //   167: ifnull -> 389
    //   170: aload_3
    //   171: aload #8
    //   173: invokevirtual charValue : ()C
    //   176: invokevirtual write : (I)V
    //   179: aload #4
    //   181: ifnull -> 389
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   190: athrow
    //   191: aload_1
    //   192: getfield Zu : [B
    //   195: aload_1
    //   196: getfield Zv : I
    //   199: iconst_1
    //   200: iadd
    //   201: baload
    //   202: bipush #35
    //   204: if_icmpne -> 389
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload_1
    //   215: getfield Zu : [B
    //   218: aload_1
    //   219: getfield Zv : I
    //   222: iconst_2
    //   223: iadd
    //   224: baload
    //   225: istore #9
    //   227: iload #9
    //   229: bipush #120
    //   231: if_icmpeq -> 248
    //   234: iload #9
    //   236: bipush #88
    //   238: if_icmpne -> 320
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   247: athrow
    //   248: aload #7
    //   250: iconst_2
    //   251: invokevirtual substring : (I)Ljava/lang/String;
    //   254: bipush #16
    //   256: invokestatic parseInt : (Ljava/lang/String;I)I
    //   259: i2b
    //   260: istore #10
    //   262: iload #10
    //   264: iflt -> 302
    //   267: iload #10
    //   269: sipush #255
    //   272: if_icmpgt -> 302
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: iconst_1
    //   283: istore #6
    //   285: aload_3
    //   286: ifnull -> 302
    //   289: aload_3
    //   290: iload #10
    //   292: invokevirtual write : (I)V
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   301: athrow
    //   302: goto -> 389
    //   305: astore #10
    //   307: aload #10
    //   309: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   312: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   315: aload #4
    //   317: ifnull -> 389
    //   320: aload #7
    //   322: iconst_1
    //   323: aload #7
    //   325: invokevirtual length : ()I
    //   328: invokevirtual substring : (II)Ljava/lang/String;
    //   331: invokestatic parseInt : (Ljava/lang/String;)I
    //   334: istore #10
    //   336: iload #10
    //   338: iflt -> 376
    //   341: iload #10
    //   343: sipush #255
    //   346: if_icmpgt -> 376
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   355: athrow
    //   356: iconst_1
    //   357: istore #6
    //   359: aload_3
    //   360: ifnull -> 376
    //   363: aload_3
    //   364: iload #10
    //   366: invokevirtual write : (I)V
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   375: athrow
    //   376: goto -> 389
    //   379: astore #10
    //   381: aload #10
    //   383: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   386: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   389: iload #6
    //   391: ifeq -> 438
    //   394: iload_2
    //   395: ifeq -> 438
    //   398: goto -> 405
    //   401: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   404: athrow
    //   405: aload_1
    //   406: dup
    //   407: getfield Zv : I
    //   410: iload #5
    //   412: iconst_1
    //   413: iadd
    //   414: iadd
    //   415: putfield Zv : I
    //   418: aload_1
    //   419: dup
    //   420: getfield Zo : I
    //   423: iload #5
    //   425: iconst_1
    //   426: iadd
    //   427: isub
    //   428: putfield Zo : I
    //   431: goto -> 438
    //   434: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   437: athrow
    //   438: iload #6
    //   440: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	15	15	java/lang/Exception
    //   19	35	35	java/lang/Exception
    //   52	78	81	java/lang/Exception
    //   89	102	105	java/lang/Exception
    //   109	117	117	java/lang/Exception
    //   166	184	187	java/lang/Exception
    //   170	207	210	java/lang/Exception
    //   227	241	244	java/lang/Exception
    //   248	302	305	java/lang/Exception
    //   262	275	278	java/lang/Exception
    //   285	295	298	java/lang/Exception
    //   320	376	379	java/lang/NumberFormatException
    //   336	349	352	java/lang/Exception
    //   359	369	372	java/lang/Exception
    //   389	398	401	java/lang/Exception
    //   394	431	434	java/lang/Exception
  }
  
  public short ZX(Zbi8 paramZbi8) {
    try {
      if (ZN(paramZbi8))
        return 5; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return 0;
  }
  
  public boolean ZN(Zbi8 paramZbi8) {
    return ZS(paramZbi8, false, null);
  }
  
  public void Zq(Zbi8 paramZbi8, ByteArrayOutputStream paramByteArrayOutputStream) {
    ZS(paramZbi8, true, paramByteArrayOutputStream);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsye.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */