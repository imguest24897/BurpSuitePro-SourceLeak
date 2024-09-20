package burp;

import java.io.IOException;

public class Zzgr {
  public static void ZD(boolean paramBoolean, byte[] paramArrayOfbyte, Zxek paramZxek, Zefg<Zrrc> paramZefg) throws IOException {
    // Byte code:
    //   0: invokestatic Zq : ()Z
    //   3: istore #4
    //   5: aload_1
    //   6: invokestatic Zc : ([B)I
    //   9: istore #5
    //   11: iload #5
    //   13: ifge -> 20
    //   16: aload_1
    //   17: arraylength
    //   18: istore #5
    //   20: iload #5
    //   22: istore #6
    //   24: wide iinc #6 200
    //   30: iload #6
    //   32: aload_1
    //   33: arraylength
    //   34: if_icmple -> 41
    //   37: aload_1
    //   38: arraylength
    //   39: istore #6
    //   41: iconst_0
    //   42: istore #7
    //   44: aload_3
    //   45: ifnull -> 580
    //   48: aload_3
    //   49: invokeinterface iterator : ()Ljava/util/Iterator;
    //   54: astore #8
    //   56: aload #8
    //   58: invokeinterface hasNext : ()Z
    //   63: ifeq -> 580
    //   66: aload #8
    //   68: invokeinterface next : ()Ljava/lang/Object;
    //   73: checkcast burp/Zrrc
    //   76: astore #9
    //   78: aload #9
    //   80: invokeinterface startOffset : ()I
    //   85: istore #10
    //   87: aload #9
    //   89: invokeinterface endOffset : ()I
    //   94: istore #11
    //   96: iload #10
    //   98: iload #7
    //   100: if_icmpge -> 107
    //   103: iload #7
    //   105: istore #10
    //   107: iload #11
    //   109: iload #10
    //   111: if_icmpge -> 118
    //   114: iload #10
    //   116: istore #11
    //   118: iload #11
    //   120: aload_1
    //   121: arraylength
    //   122: if_icmple -> 129
    //   125: aload_1
    //   126: arraylength
    //   127: istore #11
    //   129: iload #10
    //   131: aload_1
    //   132: arraylength
    //   133: if_icmple -> 140
    //   136: aload_1
    //   137: arraylength
    //   138: istore #10
    //   140: iload #10
    //   142: iload #6
    //   144: if_icmpgt -> 156
    //   147: iload #7
    //   149: istore #12
    //   151: iload #4
    //   153: ifeq -> 257
    //   156: iload_0
    //   157: ifeq -> 191
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   166: athrow
    //   167: iload #10
    //   169: sipush #200
    //   172: isub
    //   173: istore #12
    //   175: iload #12
    //   177: iload #6
    //   179: if_icmpgt -> 257
    //   182: iload #7
    //   184: istore #12
    //   186: iload #4
    //   188: ifeq -> 257
    //   191: iload #10
    //   193: iconst_1
    //   194: isub
    //   195: istore #12
    //   197: iload #12
    //   199: iload #10
    //   201: sipush #200
    //   204: isub
    //   205: if_icmplt -> 246
    //   208: iload #12
    //   210: iload #7
    //   212: if_icmplt -> 246
    //   215: aload_1
    //   216: iload #12
    //   218: baload
    //   219: bipush #60
    //   221: if_icmpne -> 238
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   230: athrow
    //   231: goto -> 246
    //   234: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   237: athrow
    //   238: iinc #12, -1
    //   241: iload #4
    //   243: ifeq -> 197
    //   246: iload #12
    //   248: iload #6
    //   250: if_icmpgt -> 257
    //   253: iload #7
    //   255: istore #12
    //   257: iload #12
    //   259: iload #7
    //   261: bipush #20
    //   263: iadd
    //   264: if_icmpge -> 271
    //   267: iload #7
    //   269: istore #12
    //   271: iload #7
    //   273: iload #6
    //   275: if_icmpge -> 310
    //   278: iload #12
    //   280: iload #6
    //   282: if_icmple -> 310
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   291: athrow
    //   292: aload_2
    //   293: aload_1
    //   294: iload #7
    //   296: iload #6
    //   298: invokestatic Zz : ([BII)[B
    //   301: invokeinterface ZA : ([B)V
    //   306: iload #6
    //   308: istore #7
    //   310: iload #12
    //   312: iload #7
    //   314: if_icmple -> 335
    //   317: aload_2
    //   318: iload #12
    //   320: iload #7
    //   322: isub
    //   323: invokeinterface Zn : (I)V
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   334: athrow
    //   335: iload #10
    //   337: iload #12
    //   339: if_icmple -> 363
    //   342: aload_2
    //   343: aload_1
    //   344: iload #12
    //   346: iload #10
    //   348: invokestatic Zz : ([BII)[B
    //   351: invokeinterface ZA : ([B)V
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   362: athrow
    //   363: iload #11
    //   365: aload_1
    //   366: arraylength
    //   367: if_icmpne -> 423
    //   370: iload #11
    //   372: iload #10
    //   374: isub
    //   375: sipush #2000
    //   378: if_icmple -> 423
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   387: athrow
    //   388: aload_2
    //   389: aload_1
    //   390: iload #10
    //   392: iload #10
    //   394: sipush #2000
    //   397: iadd
    //   398: invokestatic Zz : ([BII)[B
    //   401: iload #11
    //   403: iload #10
    //   405: isub
    //   406: invokeinterface ZW : ([BI)V
    //   411: iload #4
    //   413: ifeq -> 449
    //   416: goto -> 423
    //   419: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   422: athrow
    //   423: aload_2
    //   424: aload_1
    //   425: iload #10
    //   427: iload #11
    //   429: invokestatic Zz : ([BII)[B
    //   432: iload #11
    //   434: iload #10
    //   436: isub
    //   437: invokeinterface ZW : ([BI)V
    //   442: goto -> 449
    //   445: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   448: athrow
    //   449: iload #11
    //   451: istore #7
    //   453: iload_0
    //   454: ifeq -> 492
    //   457: iload #11
    //   459: sipush #200
    //   462: iadd
    //   463: istore #13
    //   465: iload #13
    //   467: aload_1
    //   468: arraylength
    //   469: if_icmple -> 476
    //   472: aload_1
    //   473: arraylength
    //   474: istore #13
    //   476: iload #13
    //   478: iload #6
    //   480: if_icmple -> 487
    //   483: iload #13
    //   485: istore #6
    //   487: iload #4
    //   489: ifeq -> 575
    //   492: iload #11
    //   494: istore #13
    //   496: iload #13
    //   498: iload #11
    //   500: sipush #200
    //   503: iadd
    //   504: if_icmpge -> 547
    //   507: iload #13
    //   509: iconst_1
    //   510: iadd
    //   511: aload_1
    //   512: arraylength
    //   513: if_icmpge -> 547
    //   516: aload_1
    //   517: iload #13
    //   519: baload
    //   520: bipush #62
    //   522: if_icmpne -> 539
    //   525: goto -> 532
    //   528: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   531: athrow
    //   532: goto -> 547
    //   535: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   538: athrow
    //   539: iinc #13, 1
    //   542: iload #4
    //   544: ifeq -> 496
    //   547: iinc #13, 1
    //   550: iload #13
    //   552: iload #6
    //   554: if_icmple -> 575
    //   557: iload #13
    //   559: aload_1
    //   560: arraylength
    //   561: if_icmpgt -> 575
    //   564: goto -> 571
    //   567: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   570: athrow
    //   571: iload #13
    //   573: istore #6
    //   575: iload #4
    //   577: ifeq -> 56
    //   580: iload #7
    //   582: iload #6
    //   584: if_icmpge -> 605
    //   587: aload_2
    //   588: aload_1
    //   589: iload #7
    //   591: iload #6
    //   593: invokestatic Zz : ([BII)[B
    //   596: invokeinterface ZA : ([B)V
    //   601: iload #6
    //   603: istore #7
    //   605: iload #7
    //   607: aload_1
    //   608: arraylength
    //   609: if_icmpge -> 630
    //   612: aload_2
    //   613: aload_1
    //   614: arraylength
    //   615: iload #7
    //   617: isub
    //   618: invokeinterface Zn : (I)V
    //   623: goto -> 630
    //   626: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   629: athrow
    //   630: return
    // Exception table:
    //   from	to	target	type
    //   151	160	163	java/io/IOException
    //   208	224	227	java/io/IOException
    //   215	234	234	java/io/IOException
    //   271	285	288	java/io/IOException
    //   310	328	331	java/io/IOException
    //   335	356	359	java/io/IOException
    //   363	381	384	java/io/IOException
    //   370	416	419	java/io/IOException
    //   388	442	445	java/io/IOException
    //   507	525	528	java/io/IOException
    //   516	535	535	java/io/IOException
    //   547	564	567	java/io/IOException
    //   605	623	626	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzgr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */