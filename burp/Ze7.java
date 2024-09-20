package burp;

public class Ze7 {
  public static Zbcc ZU(boolean paramBoolean1, Zznt paramZznt, int paramInt1, int paramInt2, Object paramObject1, Object paramObject2, double paramDouble1, double paramDouble2, int paramInt3, boolean paramBoolean2, double paramDouble3, Object paramObject3, Object paramObject4) {
    // Byte code:
    //   0: invokestatic Zr : ()[Lburp/Zbqc;
    //   3: astore #16
    //   5: iload_3
    //   6: iload_2
    //   7: if_icmplt -> 18
    //   10: dload #8
    //   12: dload #6
    //   14: dcmpg
    //   15: ifge -> 35
    //   18: iconst_0
    //   19: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   22: iload_2
    //   23: i2l
    //   24: iload_3
    //   25: i2l
    //   26: dload #6
    //   28: dload #8
    //   30: invokestatic ZL : (ZLnet/portswigger/Zqf;JJDD)V
    //   33: aconst_null
    //   34: areturn
    //   35: iconst_4
    //   36: newarray int
    //   38: dup
    //   39: iconst_0
    //   40: bipush #20
    //   42: iastore
    //   43: dup
    //   44: iconst_1
    //   45: bipush #20
    //   47: iastore
    //   48: dup
    //   49: iconst_2
    //   50: bipush #20
    //   52: iastore
    //   53: dup
    //   54: iconst_3
    //   55: bipush #20
    //   57: iastore
    //   58: astore #17
    //   60: iload_0
    //   61: ifeq -> 70
    //   64: sipush #380
    //   67: goto -> 73
    //   70: sipush #600
    //   73: bipush #60
    //   75: isub
    //   76: iload_3
    //   77: iconst_1
    //   78: iadd
    //   79: iload_2
    //   80: isub
    //   81: idiv
    //   82: istore #18
    //   84: iload #18
    //   86: iconst_3
    //   87: if_icmpge -> 93
    //   90: iinc #18, 1
    //   93: ldc2_w 2.0
    //   96: iload #18
    //   98: i2d
    //   99: dmul
    //   100: ldc2_w 3.0
    //   103: ddiv
    //   104: invokestatic ceil : (D)D
    //   107: d2i
    //   108: istore #19
    //   110: iload #19
    //   112: istore #20
    //   114: iload #19
    //   116: istore #21
    //   118: iconst_1
    //   119: istore #22
    //   121: iconst_1
    //   122: istore #23
    //   124: iload #18
    //   126: bipush #20
    //   128: if_icmpge -> 134
    //   131: iconst_5
    //   132: istore #22
    //   134: iload #18
    //   136: bipush #10
    //   138: if_icmpge -> 148
    //   141: bipush #10
    //   143: istore #22
    //   145: iconst_5
    //   146: istore #23
    //   148: iload #18
    //   150: iconst_5
    //   151: if_icmpge -> 161
    //   154: bipush #20
    //   156: istore #22
    //   158: iconst_5
    //   159: istore #23
    //   161: iload #18
    //   163: iconst_2
    //   164: if_icmpge -> 175
    //   167: bipush #50
    //   169: istore #22
    //   171: bipush #10
    //   173: istore #23
    //   175: iload_2
    //   176: iload #22
    //   178: irem
    //   179: ifne -> 190
    //   182: iload_2
    //   183: istore #24
    //   185: aload #16
    //   187: ifnonnull -> 201
    //   190: iload_2
    //   191: iload #22
    //   193: iadd
    //   194: iload_2
    //   195: iload #22
    //   197: irem
    //   198: isub
    //   199: istore #24
    //   201: iload_2
    //   202: iload #23
    //   204: irem
    //   205: ifne -> 216
    //   208: iload_2
    //   209: istore #25
    //   211: aload #16
    //   213: ifnonnull -> 227
    //   216: iload_2
    //   217: iload #23
    //   219: iadd
    //   220: iload_2
    //   221: iload #23
    //   223: irem
    //   224: isub
    //   225: istore #25
    //   227: iload #24
    //   229: istore #26
    //   231: iload #22
    //   233: istore #27
    //   235: dload #8
    //   237: dload #6
    //   239: dcmpl
    //   240: ifne -> 249
    //   243: dload #8
    //   245: dconst_1
    //   246: dadd
    //   247: dstore #8
    //   249: iload_0
    //   250: ifeq -> 259
    //   253: sipush #600
    //   256: goto -> 262
    //   259: sipush #380
    //   262: bipush #60
    //   264: isub
    //   265: i2d
    //   266: dload #8
    //   268: dload #6
    //   270: dsub
    //   271: ddiv
    //   272: dstore #28
    //   274: iload #10
    //   276: iconst_m1
    //   277: if_icmpne -> 284
    //   280: bipush #20
    //   282: istore #10
    //   284: bipush #10
    //   286: istore #30
    //   288: dload #12
    //   290: dconst_0
    //   291: dcmpg
    //   292: ifgt -> 407
    //   295: dconst_1
    //   296: dstore #12
    //   298: iload #11
    //   300: ifeq -> 328
    //   303: dload #28
    //   305: dload #12
    //   307: dmul
    //   308: ldc2_w 25.0
    //   311: dcmpl
    //   312: ifle -> 328
    //   315: dload #12
    //   317: ldc2_w 10.0
    //   320: ddiv
    //   321: dstore #12
    //   323: aload #16
    //   325: ifnonnull -> 298
    //   328: dload #28
    //   330: dload #12
    //   332: dmul
    //   333: ldc2_w 25.0
    //   336: dcmpg
    //   337: ifge -> 353
    //   340: dload #12
    //   342: ldc2_w 10.0
    //   345: dmul
    //   346: dstore #12
    //   348: aload #16
    //   350: ifnonnull -> 328
    //   353: dload #28
    //   355: dload #12
    //   357: dmul
    //   358: ldc2_w 25.0
    //   361: dcmpl
    //   362: ifle -> 387
    //   365: iload #11
    //   367: ifne -> 379
    //   370: dload #12
    //   372: ldc2_w 2.0
    //   375: dcmpl
    //   376: ifle -> 387
    //   379: dload #12
    //   381: ldc2_w 2.0
    //   384: ddiv
    //   385: dstore #12
    //   387: dload #28
    //   389: dload #12
    //   391: dmul
    //   392: ldc2_w 30.0
    //   395: dcmpg
    //   396: ifge -> 407
    //   399: dload #12
    //   401: ldc2_w 2.0
    //   404: dmul
    //   405: dstore #12
    //   407: dload #12
    //   409: dstore #31
    //   411: dload #28
    //   413: dload #31
    //   415: dmul
    //   416: ldc2_w 42.0
    //   419: dcmpl
    //   420: ifle -> 438
    //   423: dload #31
    //   425: dconst_1
    //   426: dcmpl
    //   427: ifeq -> 438
    //   430: dload #31
    //   432: ldc2_w 5.0
    //   435: ddiv
    //   436: dstore #31
    //   438: iload #11
    //   440: ifne -> 453
    //   443: dload #31
    //   445: dconst_1
    //   446: dcmpg
    //   447: ifge -> 453
    //   450: dconst_1
    //   451: dstore #31
    //   453: dload #6
    //   455: dload #12
    //   457: dadd
    //   458: dload #12
    //   460: ddiv
    //   461: d2i
    //   462: i2d
    //   463: dload #12
    //   465: dmul
    //   466: dstore #33
    //   468: dload #33
    //   470: dload #12
    //   472: dsub
    //   473: dload #6
    //   475: dcmpl
    //   476: ifne -> 483
    //   479: dload #6
    //   481: dstore #33
    //   483: dload #6
    //   485: dload #31
    //   487: dadd
    //   488: dload #31
    //   490: ddiv
    //   491: d2i
    //   492: i2d
    //   493: dload #31
    //   495: dmul
    //   496: dstore #35
    //   498: dload #35
    //   500: dload #31
    //   502: dsub
    //   503: dload #6
    //   505: dcmpl
    //   506: ifne -> 513
    //   509: dload #6
    //   511: dstore #35
    //   513: dload #33
    //   515: dstore #37
    //   517: dload #12
    //   519: dstore #39
    //   521: iconst_0
    //   522: istore #41
    //   524: dload #39
    //   526: dconst_1
    //   527: dcmpg
    //   528: ifge -> 540
    //   531: dload #39
    //   533: invokestatic log10 : (D)D
    //   536: dneg
    //   537: d2i
    //   538: istore #41
    //   540: invokestatic getInstance : ()Ljava/text/NumberFormat;
    //   543: astore #42
    //   545: aload #42
    //   547: iload #41
    //   549: invokevirtual setMinimumFractionDigits : (I)V
    //   552: aload #14
    //   554: ifnonnull -> 609
    //   557: new java/util/ArrayList
    //   560: dup
    //   561: invokespecial <init> : ()V
    //   564: astore #14
    //   566: dload #37
    //   568: dstore #43
    //   570: dload #43
    //   572: dload #8
    //   574: dload #39
    //   576: dadd
    //   577: dcmpg
    //   578: ifgt -> 609
    //   581: aload #14
    //   583: checkcast java/util/ArrayList
    //   586: aload #42
    //   588: dload #43
    //   590: invokevirtual format : (D)Ljava/lang/String;
    //   593: invokevirtual add : (Ljava/lang/Object;)Z
    //   596: pop
    //   597: dload #43
    //   599: dload #39
    //   601: dadd
    //   602: dstore #43
    //   604: aload #16
    //   606: ifnonnull -> 570
    //   609: dload #33
    //   611: dstore #43
    //   613: dload #12
    //   615: dstore #45
    //   617: new burp/Zbcc
    //   620: dup
    //   621: iload_0
    //   622: aload #17
    //   624: aload_1
    //   625: iload #19
    //   627: iload_2
    //   628: iload_3
    //   629: iload #18
    //   631: iload #20
    //   633: iload #21
    //   635: iload #24
    //   637: i2d
    //   638: iload #22
    //   640: i2d
    //   641: iload #25
    //   643: i2d
    //   644: iload #23
    //   646: i2d
    //   647: iload #26
    //   649: i2d
    //   650: iload #27
    //   652: i2d
    //   653: aload #4
    //   655: aload #5
    //   657: dload #6
    //   659: dload #8
    //   661: dload #28
    //   663: iload #10
    //   665: iload #30
    //   667: dload #33
    //   669: dload #12
    //   671: dload #35
    //   673: dload #31
    //   675: dload #37
    //   677: dload #39
    //   679: aload #14
    //   681: aload #15
    //   683: dload #43
    //   685: dload #45
    //   687: invokespecial <init> : (Z[ILburp/Zznt;IIIIIIDDDDDDLjava/lang/Object;Ljava/lang/Object;DDDIIDDDDDDLjava/lang/Object;Ljava/lang/Object;DD)V
    //   690: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */