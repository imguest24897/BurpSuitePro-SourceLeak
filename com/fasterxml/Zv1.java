package com.fasterxml;

public final class Zv1 {
  protected static final char[] Zm;
  
  protected static final char[] ZF;
  
  protected static final byte[] ZS;
  
  protected static final byte[] Zp;
  
  protected static final int[] Zz;
  
  protected static final int[] ZJ;
  
  protected static final int[] ZU;
  
  protected static final int[] ZM;
  
  protected static final int[] ZX;
  
  protected static final int[] ZL;
  
  protected static final int[] Zu;
  
  protected static final int[] Zn;
  
  protected static final int[] ZW;
  
  public static int[] Zd() {
    return Zz;
  }
  
  public static int[] Zq() {
    return ZJ;
  }
  
  public static int[] ZV() {
    return ZU;
  }
  
  public static int[] Zn() {
    return ZM;
  }
  
  public static int[] Zv() {
    return ZX;
  }
  
  public static int[] Zg() {
    return Zu;
  }
  
  public static int[] ZI(int paramInt, boolean paramBoolean) {
    return (paramInt == 34) ? (paramBoolean ? Zn : Zu) : Zyq.ZH.Zh(paramInt, paramBoolean);
  }
  
  public static int Zy(int paramInt) {
    return ZW[paramInt & 0xFF];
  }
  
  public static char ZB(int paramInt) {
    return Zm[paramInt];
  }
  
  public static void Zs(StringBuilder paramStringBuilder, String paramString) {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: getstatic com/fasterxml/Zv1.Zu : [I
    //   6: astore_3
    //   7: aload_3
    //   8: arraylength
    //   9: istore #4
    //   11: istore_2
    //   12: iconst_0
    //   13: istore #5
    //   15: aload_1
    //   16: invokevirtual length : ()I
    //   19: istore #6
    //   21: iload #5
    //   23: iload #6
    //   25: if_icmpge -> 150
    //   28: aload_1
    //   29: iload #5
    //   31: invokevirtual charAt : (I)C
    //   34: istore #7
    //   36: iload #7
    //   38: iload #4
    //   40: if_icmpge -> 50
    //   43: aload_3
    //   44: iload #7
    //   46: iaload
    //   47: ifne -> 61
    //   50: aload_0
    //   51: iload #7
    //   53: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: iload_2
    //   58: ifne -> 143
    //   61: aload_0
    //   62: bipush #92
    //   64: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload_3
    //   69: iload #7
    //   71: iaload
    //   72: istore #8
    //   74: iload #8
    //   76: ifge -> 135
    //   79: aload_0
    //   80: bipush #117
    //   82: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_0
    //   87: bipush #48
    //   89: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: aload_0
    //   94: bipush #48
    //   96: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: iload #7
    //   102: istore #9
    //   104: aload_0
    //   105: getstatic com/fasterxml/Zv1.Zm : [C
    //   108: iload #9
    //   110: iconst_4
    //   111: ishr
    //   112: caload
    //   113: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload_0
    //   118: getstatic com/fasterxml/Zv1.Zm : [C
    //   121: iload #9
    //   123: bipush #15
    //   125: iand
    //   126: caload
    //   127: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: iload_2
    //   132: ifne -> 143
    //   135: aload_0
    //   136: iload #8
    //   138: i2c
    //   139: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: iinc #5, 1
    //   146: iload_2
    //   147: ifne -> 21
    //   150: return
  }
  
  public static char[] Zo(boolean paramBoolean) {
    return paramBoolean ? (char[])Zm.clone() : (char[])ZF.clone();
  }
  
  public static byte[] ZB(boolean paramBoolean) {
    return paramBoolean ? (byte[])ZS.clone() : (byte[])Zp.clone();
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'I] &\\nJNTTg|8<*I] &\\nJNTtG\\\n'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #16
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #61
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: goto -> 214
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 187
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 169, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #68
    //   142: goto -> 171
    //   145: bipush #81
    //   147: goto -> 171
    //   150: bipush #15
    //   152: goto -> 171
    //   155: bipush #40
    //   157: goto -> 171
    //   160: bipush #24
    //   162: goto -> 171
    //   165: iconst_2
    //   166: goto -> 171
    //   169: bipush #65
    //   171: ixor
    //   172: ixor
    //   173: i2c
    //   174: castore
    //   175: iinc #6, 1
    //   178: dup
    //   179: ifne -> 187
    //   182: dup2
    //   183: dup_x1
    //   184: goto -> 93
    //   187: dup2_x1
    //   188: pop2
    //   189: dup_x2
    //   190: iload #6
    //   192: if_icmpgt -> 89
    //   195: pop
    //   196: new java/lang/String
    //   199: dup_x1
    //   200: swap
    //   201: invokespecial <init> : ([C)V
    //   204: invokevirtual intern : ()Ljava/lang/String;
    //   207: swap
    //   208: pop
    //   209: swap
    //   210: pop
    //   211: goto -> 39
    //   214: aload_0
    //   215: iconst_0
    //   216: aaload
    //   217: invokevirtual toCharArray : ()[C
    //   220: putstatic com/fasterxml/Zv1.Zm : [C
    //   223: aload_0
    //   224: iconst_1
    //   225: aaload
    //   226: invokevirtual toCharArray : ()[C
    //   229: putstatic com/fasterxml/Zv1.ZF : [C
    //   232: getstatic com/fasterxml/Zv1.Zm : [C
    //   235: arraylength
    //   236: istore #7
    //   238: iload #7
    //   240: newarray byte
    //   242: putstatic com/fasterxml/Zv1.ZS : [B
    //   245: iload #7
    //   247: newarray byte
    //   249: putstatic com/fasterxml/Zv1.Zp : [B
    //   252: iconst_0
    //   253: istore #8
    //   255: iload #8
    //   257: iload #7
    //   259: if_icmpge -> 294
    //   262: getstatic com/fasterxml/Zv1.ZS : [B
    //   265: iload #8
    //   267: getstatic com/fasterxml/Zv1.Zm : [C
    //   270: iload #8
    //   272: caload
    //   273: i2b
    //   274: bastore
    //   275: getstatic com/fasterxml/Zv1.Zp : [B
    //   278: iload #8
    //   280: getstatic com/fasterxml/Zv1.ZF : [C
    //   283: iload #8
    //   285: caload
    //   286: i2b
    //   287: bastore
    //   288: iinc #8, 1
    //   291: goto -> 255
    //   294: sipush #256
    //   297: newarray int
    //   299: astore #7
    //   301: iconst_0
    //   302: istore #8
    //   304: iload #8
    //   306: bipush #32
    //   308: if_icmpge -> 323
    //   311: aload #7
    //   313: iload #8
    //   315: iconst_m1
    //   316: iastore
    //   317: iinc #8, 1
    //   320: goto -> 304
    //   323: aload #7
    //   325: bipush #34
    //   327: iconst_1
    //   328: iastore
    //   329: aload #7
    //   331: bipush #92
    //   333: iconst_1
    //   334: iastore
    //   335: aload #7
    //   337: putstatic com/fasterxml/Zv1.Zz : [I
    //   340: getstatic com/fasterxml/Zv1.Zz : [I
    //   343: arraylength
    //   344: newarray int
    //   346: astore #7
    //   348: getstatic com/fasterxml/Zv1.Zz : [I
    //   351: iconst_0
    //   352: aload #7
    //   354: iconst_0
    //   355: aload #7
    //   357: arraylength
    //   358: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   361: sipush #128
    //   364: istore #8
    //   366: iload #8
    //   368: sipush #256
    //   371: if_icmpge -> 444
    //   374: iload #8
    //   376: sipush #224
    //   379: iand
    //   380: sipush #192
    //   383: if_icmpne -> 392
    //   386: iconst_2
    //   387: istore #9
    //   389: goto -> 431
    //   392: iload #8
    //   394: sipush #240
    //   397: iand
    //   398: sipush #224
    //   401: if_icmpne -> 410
    //   404: iconst_3
    //   405: istore #9
    //   407: goto -> 431
    //   410: iload #8
    //   412: sipush #248
    //   415: iand
    //   416: sipush #240
    //   419: if_icmpne -> 428
    //   422: iconst_4
    //   423: istore #9
    //   425: goto -> 431
    //   428: iconst_m1
    //   429: istore #9
    //   431: aload #7
    //   433: iload #8
    //   435: iload #9
    //   437: iastore
    //   438: iinc #8, 1
    //   441: goto -> 366
    //   444: aload #7
    //   446: putstatic com/fasterxml/Zv1.ZJ : [I
    //   449: sipush #256
    //   452: newarray int
    //   454: astore #7
    //   456: aload #7
    //   458: iconst_m1
    //   459: invokestatic fill : ([II)V
    //   462: bipush #33
    //   464: istore #8
    //   466: iload #8
    //   468: sipush #256
    //   471: if_icmpge -> 495
    //   474: iload #8
    //   476: i2c
    //   477: invokestatic isJavaIdentifierPart : (C)Z
    //   480: ifeq -> 489
    //   483: aload #7
    //   485: iload #8
    //   487: iconst_0
    //   488: iastore
    //   489: iinc #8, 1
    //   492: goto -> 466
    //   495: aload #7
    //   497: bipush #64
    //   499: iconst_0
    //   500: iastore
    //   501: aload #7
    //   503: bipush #35
    //   505: iconst_0
    //   506: iastore
    //   507: aload #7
    //   509: bipush #42
    //   511: iconst_0
    //   512: iastore
    //   513: aload #7
    //   515: bipush #45
    //   517: iconst_0
    //   518: iastore
    //   519: aload #7
    //   521: bipush #43
    //   523: iconst_0
    //   524: iastore
    //   525: aload #7
    //   527: putstatic com/fasterxml/Zv1.ZU : [I
    //   530: sipush #256
    //   533: newarray int
    //   535: astore #7
    //   537: getstatic com/fasterxml/Zv1.ZU : [I
    //   540: iconst_0
    //   541: aload #7
    //   543: iconst_0
    //   544: aload #7
    //   546: arraylength
    //   547: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   550: aload #7
    //   552: sipush #128
    //   555: sipush #128
    //   558: iconst_0
    //   559: invokestatic fill : ([IIII)V
    //   562: aload #7
    //   564: putstatic com/fasterxml/Zv1.ZM : [I
    //   567: sipush #256
    //   570: newarray int
    //   572: astore #7
    //   574: getstatic com/fasterxml/Zv1.ZJ : [I
    //   577: sipush #128
    //   580: aload #7
    //   582: sipush #128
    //   585: sipush #128
    //   588: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   591: aload #7
    //   593: iconst_0
    //   594: bipush #32
    //   596: iconst_m1
    //   597: invokestatic fill : ([IIII)V
    //   600: aload #7
    //   602: bipush #9
    //   604: iconst_0
    //   605: iastore
    //   606: aload #7
    //   608: bipush #10
    //   610: bipush #10
    //   612: iastore
    //   613: aload #7
    //   615: bipush #13
    //   617: bipush #13
    //   619: iastore
    //   620: aload #7
    //   622: bipush #42
    //   624: bipush #42
    //   626: iastore
    //   627: aload #7
    //   629: putstatic com/fasterxml/Zv1.ZX : [I
    //   632: sipush #256
    //   635: newarray int
    //   637: astore #7
    //   639: getstatic com/fasterxml/Zv1.ZJ : [I
    //   642: sipush #128
    //   645: aload #7
    //   647: sipush #128
    //   650: sipush #128
    //   653: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   656: aload #7
    //   658: iconst_0
    //   659: bipush #32
    //   661: iconst_m1
    //   662: invokestatic fill : ([IIII)V
    //   665: aload #7
    //   667: bipush #32
    //   669: iconst_1
    //   670: iastore
    //   671: aload #7
    //   673: bipush #9
    //   675: iconst_1
    //   676: iastore
    //   677: aload #7
    //   679: bipush #10
    //   681: bipush #10
    //   683: iastore
    //   684: aload #7
    //   686: bipush #13
    //   688: bipush #13
    //   690: iastore
    //   691: aload #7
    //   693: bipush #47
    //   695: bipush #47
    //   697: iastore
    //   698: aload #7
    //   700: bipush #35
    //   702: bipush #35
    //   704: iastore
    //   705: aload #7
    //   707: putstatic com/fasterxml/Zv1.ZL : [I
    //   710: sipush #128
    //   713: newarray int
    //   715: astore #7
    //   717: iconst_0
    //   718: istore #8
    //   720: iload #8
    //   722: bipush #32
    //   724: if_icmpge -> 739
    //   727: aload #7
    //   729: iload #8
    //   731: iconst_m1
    //   732: iastore
    //   733: iinc #8, 1
    //   736: goto -> 720
    //   739: aload #7
    //   741: bipush #34
    //   743: bipush #34
    //   745: iastore
    //   746: aload #7
    //   748: bipush #92
    //   750: bipush #92
    //   752: iastore
    //   753: aload #7
    //   755: bipush #8
    //   757: bipush #98
    //   759: iastore
    //   760: aload #7
    //   762: bipush #9
    //   764: bipush #116
    //   766: iastore
    //   767: aload #7
    //   769: bipush #12
    //   771: bipush #102
    //   773: iastore
    //   774: aload #7
    //   776: bipush #10
    //   778: bipush #110
    //   780: iastore
    //   781: aload #7
    //   783: bipush #13
    //   785: bipush #114
    //   787: iastore
    //   788: aload #7
    //   790: putstatic com/fasterxml/Zv1.Zu : [I
    //   793: getstatic com/fasterxml/Zv1.Zu : [I
    //   796: getstatic com/fasterxml/Zv1.Zu : [I
    //   799: arraylength
    //   800: invokestatic copyOf : ([II)[I
    //   803: putstatic com/fasterxml/Zv1.Zn : [I
    //   806: getstatic com/fasterxml/Zv1.Zn : [I
    //   809: bipush #47
    //   811: bipush #47
    //   813: iastore
    //   814: sipush #256
    //   817: newarray int
    //   819: putstatic com/fasterxml/Zv1.ZW : [I
    //   822: getstatic com/fasterxml/Zv1.ZW : [I
    //   825: iconst_m1
    //   826: invokestatic fill : ([II)V
    //   829: iconst_0
    //   830: istore #7
    //   832: iload #7
    //   834: bipush #10
    //   836: if_icmpge -> 856
    //   839: getstatic com/fasterxml/Zv1.ZW : [I
    //   842: bipush #48
    //   844: iload #7
    //   846: iadd
    //   847: iload #7
    //   849: iastore
    //   850: iinc #7, 1
    //   853: goto -> 832
    //   856: iconst_0
    //   857: istore #7
    //   859: iload #7
    //   861: bipush #6
    //   863: if_icmpge -> 900
    //   866: getstatic com/fasterxml/Zv1.ZW : [I
    //   869: bipush #97
    //   871: iload #7
    //   873: iadd
    //   874: bipush #10
    //   876: iload #7
    //   878: iadd
    //   879: iastore
    //   880: getstatic com/fasterxml/Zv1.ZW : [I
    //   883: bipush #65
    //   885: iload #7
    //   887: iadd
    //   888: bipush #10
    //   890: iload #7
    //   892: iadd
    //   893: iastore
    //   894: iinc #7, 1
    //   897: goto -> 859
    //   900: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zv1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */