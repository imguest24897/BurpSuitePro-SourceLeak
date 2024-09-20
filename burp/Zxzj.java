package burp;

import java.math.BigInteger;

class Zxzj extends ClassLoader {
  static String ZZ;
  
  static Object ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zc(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zxfu.ZA : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: aload_3
    //   15: arraylength
    //   16: iconst_2
    //   17: iadd
    //   18: newarray byte
    //   20: astore #5
    //   22: iconst_0
    //   23: istore #6
    //   25: iload #6
    //   27: aload_3
    //   28: arraylength
    //   29: if_icmpge -> 48
    //   32: aload #5
    //   34: iload #6
    //   36: aload_3
    //   37: iload #6
    //   39: baload
    //   40: bastore
    //   41: iinc #6, 1
    //   44: iload_2
    //   45: ifne -> 25
    //   48: aload #5
    //   50: arraylength
    //   51: iconst_3
    //   52: idiv
    //   53: iconst_4
    //   54: imul
    //   55: newarray byte
    //   57: astore #4
    //   59: iconst_0
    //   60: istore #6
    //   62: iconst_0
    //   63: istore #7
    //   65: iload #6
    //   67: aload_3
    //   68: arraylength
    //   69: if_icmpge -> 180
    //   72: aload #4
    //   74: iload #7
    //   76: aload #5
    //   78: iload #6
    //   80: baload
    //   81: iconst_2
    //   82: iushr
    //   83: bipush #63
    //   85: iand
    //   86: i2b
    //   87: bastore
    //   88: aload #4
    //   90: iload #7
    //   92: iconst_1
    //   93: iadd
    //   94: aload #5
    //   96: iload #6
    //   98: iconst_1
    //   99: iadd
    //   100: baload
    //   101: iconst_4
    //   102: iushr
    //   103: bipush #15
    //   105: iand
    //   106: aload #5
    //   108: iload #6
    //   110: baload
    //   111: iconst_4
    //   112: ishl
    //   113: bipush #63
    //   115: iand
    //   116: ior
    //   117: i2b
    //   118: bastore
    //   119: aload #4
    //   121: iload #7
    //   123: iconst_2
    //   124: iadd
    //   125: aload #5
    //   127: iload #6
    //   129: iconst_2
    //   130: iadd
    //   131: baload
    //   132: bipush #6
    //   134: iushr
    //   135: iconst_3
    //   136: iand
    //   137: aload #5
    //   139: iload #6
    //   141: iconst_1
    //   142: iadd
    //   143: baload
    //   144: iconst_2
    //   145: ishl
    //   146: bipush #63
    //   148: iand
    //   149: ior
    //   150: i2b
    //   151: bastore
    //   152: aload #4
    //   154: iload #7
    //   156: iconst_3
    //   157: iadd
    //   158: aload #5
    //   160: iload #6
    //   162: iconst_2
    //   163: iadd
    //   164: baload
    //   165: bipush #63
    //   167: iand
    //   168: i2b
    //   169: bastore
    //   170: iinc #6, 3
    //   173: iinc #7, 4
    //   176: iload_2
    //   177: ifne -> 65
    //   180: iconst_0
    //   181: istore #6
    //   183: iload #6
    //   185: aload #4
    //   187: arraylength
    //   188: if_icmpge -> 372
    //   191: aload #4
    //   193: iload #6
    //   195: baload
    //   196: bipush #26
    //   198: if_icmpge -> 226
    //   201: aload #4
    //   203: iload #6
    //   205: aload #4
    //   207: iload #6
    //   209: baload
    //   210: bipush #65
    //   212: iadd
    //   213: i2b
    //   214: bastore
    //   215: iload_2
    //   216: ifne -> 365
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   225: athrow
    //   226: aload #4
    //   228: iload #6
    //   230: baload
    //   231: bipush #52
    //   233: if_icmpge -> 271
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: aload #4
    //   245: iload #6
    //   247: aload #4
    //   249: iload #6
    //   251: baload
    //   252: bipush #97
    //   254: iadd
    //   255: bipush #26
    //   257: isub
    //   258: i2b
    //   259: bastore
    //   260: iload_2
    //   261: ifne -> 365
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: aload #4
    //   273: iload #6
    //   275: baload
    //   276: bipush #62
    //   278: if_icmpge -> 316
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   287: athrow
    //   288: aload #4
    //   290: iload #6
    //   292: aload #4
    //   294: iload #6
    //   296: baload
    //   297: bipush #48
    //   299: iadd
    //   300: bipush #52
    //   302: isub
    //   303: i2b
    //   304: bastore
    //   305: iload_2
    //   306: ifne -> 365
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: aload #4
    //   318: iload #6
    //   320: baload
    //   321: bipush #63
    //   323: if_icmpge -> 351
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   332: athrow
    //   333: aload #4
    //   335: iload #6
    //   337: bipush #43
    //   339: bastore
    //   340: iload_2
    //   341: ifne -> 365
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: aload #4
    //   353: iload #6
    //   355: bipush #47
    //   357: bastore
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   364: athrow
    //   365: iinc #6, 1
    //   368: iload_2
    //   369: ifne -> 183
    //   372: aload #4
    //   374: arraylength
    //   375: iconst_1
    //   376: isub
    //   377: istore #6
    //   379: iload #6
    //   381: aload_3
    //   382: arraylength
    //   383: iconst_4
    //   384: imul
    //   385: iconst_3
    //   386: idiv
    //   387: if_icmple -> 404
    //   390: aload #4
    //   392: iload #6
    //   394: bipush #61
    //   396: bastore
    //   397: iinc #6, -1
    //   400: iload_2
    //   401: ifne -> 379
    //   404: new java/math/BigInteger
    //   407: dup
    //   408: aload #4
    //   410: invokespecial <init> : ([B)V
    //   413: invokevirtual abs : ()Ljava/math/BigInteger;
    //   416: putstatic burp/Zl_k.ZH : Ljava/lang/Object;
    //   419: sipush #18519
    //   422: sipush #27639
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: iconst_1
    //   429: ldc burp/Zkco
    //   431: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   434: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   437: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   440: astore_3
    //   441: aload_3
    //   442: arraylength
    //   443: istore #4
    //   445: iconst_0
    //   446: istore #5
    //   448: iload #5
    //   450: iload #4
    //   452: if_icmpge -> 589
    //   455: aload_3
    //   456: iload #5
    //   458: aaload
    //   459: astore #6
    //   461: aload #6
    //   463: invokevirtual getModifiers : ()I
    //   466: invokestatic isStatic : (I)Z
    //   469: ifne -> 479
    //   472: goto -> 582
    //   475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   478: athrow
    //   479: aload #6
    //   481: invokevirtual getType : ()Ljava/lang/Class;
    //   484: astore #7
    //   486: aload #7
    //   488: ifnull -> 569
    //   491: aload #7
    //   493: invokevirtual isPrimitive : ()Z
    //   496: ifne -> 569
    //   499: goto -> 506
    //   502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   505: athrow
    //   506: aload #7
    //   508: invokevirtual getPackage : ()Ljava/lang/Package;
    //   511: ifnull -> 569
    //   514: goto -> 521
    //   517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   520: athrow
    //   521: aload #7
    //   523: invokevirtual getPackage : ()Ljava/lang/Package;
    //   526: invokevirtual getName : ()Ljava/lang/String;
    //   529: ifnull -> 569
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: aload #7
    //   541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   544: invokevirtual getName : ()Ljava/lang/String;
    //   547: sipush #18517
    //   550: sipush #14026
    //   553: invokestatic a : (II)Ljava/lang/String;
    //   556: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   559: ifne -> 569
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   568: athrow
    //   569: aload #6
    //   571: iconst_1
    //   572: invokevirtual setAccessible : (Z)V
    //   575: aload #6
    //   577: aconst_null
    //   578: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   581: pop
    //   582: iinc #5, 1
    //   585: iload_2
    //   586: ifne -> 448
    //   589: sipush #18516
    //   592: sipush #31650
    //   595: invokestatic a : (II)Ljava/lang/String;
    //   598: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   601: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   604: astore_3
    //   605: aload_3
    //   606: arraylength
    //   607: istore #4
    //   609: iconst_0
    //   610: istore #5
    //   612: iload #5
    //   614: iload #4
    //   616: if_icmpge -> 748
    //   619: aload_3
    //   620: iload #5
    //   622: aaload
    //   623: astore #6
    //   625: aload #6
    //   627: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   630: pop
    //   631: aload #6
    //   633: invokevirtual getModifiers : ()I
    //   636: invokestatic isStatic : (I)Z
    //   639: ifeq -> 734
    //   642: aload #6
    //   644: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   647: arraylength
    //   648: iconst_2
    //   649: if_icmpne -> 734
    //   652: goto -> 659
    //   655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   658: athrow
    //   659: aload #6
    //   661: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   664: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   667: invokevirtual equals : (Ljava/lang/Object;)Z
    //   670: ifeq -> 734
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   679: athrow
    //   680: aload #6
    //   682: iconst_1
    //   683: invokevirtual setAccessible : (Z)V
    //   686: aload #6
    //   688: aconst_null
    //   689: iconst_2
    //   690: anewarray java/lang/Object
    //   693: dup
    //   694: iconst_0
    //   695: aload_0
    //   696: aastore
    //   697: dup
    //   698: iconst_1
    //   699: aload_1
    //   700: ifnonnull -> 718
    //   703: goto -> 710
    //   706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   709: athrow
    //   710: aload_1
    //   711: goto -> 725
    //   714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   717: athrow
    //   718: aload_1
    //   719: checkcast [B
    //   722: invokevirtual clone : ()Ljava/lang/Object;
    //   725: aastore
    //   726: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   729: pop
    //   730: iload_2
    //   731: ifne -> 748
    //   734: iinc #5, 1
    //   737: iload_2
    //   738: ifne -> 612
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   747: athrow
    //   748: getstatic burp/Zxzj.ZZ : Ljava/lang/String;
    //   751: getstatic burp/Zrdy.Zt : Ljava/lang/Object;
    //   754: checkcast java/math/BigInteger
    //   757: invokevirtual intValue : ()I
    //   760: bipush #32
    //   762: irem
    //   763: invokestatic abs : (I)I
    //   766: invokevirtual charAt : (I)C
    //   769: getstatic burp/Zt4g.Zj : Ljava/lang/String;
    //   772: getstatic burp/Zm__.Zz : Ljava/lang/Object;
    //   775: checkcast java/math/BigInteger
    //   778: invokevirtual intValue : ()I
    //   781: bipush #32
    //   783: irem
    //   784: invokestatic abs : (I)I
    //   787: invokevirtual charAt : (I)C
    //   790: if_icmpgt -> 897
    //   793: getstatic burp/Zxso.ZH : Ljava/lang/String;
    //   796: getstatic burp/Ze7q.Zk : Ljava/lang/Object;
    //   799: checkcast java/math/BigInteger
    //   802: invokevirtual intValue : ()I
    //   805: bipush #32
    //   807: irem
    //   808: invokestatic abs : (I)I
    //   811: invokevirtual charAt : (I)C
    //   814: getstatic burp/Zx54.Zs : Ljava/lang/String;
    //   817: getstatic burp/Zr8h.ZH : Ljava/lang/Object;
    //   820: checkcast java/math/BigInteger
    //   823: invokevirtual intValue : ()I
    //   826: bipush #32
    //   828: irem
    //   829: invokestatic abs : (I)I
    //   832: invokevirtual charAt : (I)C
    //   835: if_icmple -> 897
    //   838: goto -> 845
    //   841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   844: athrow
    //   845: getstatic burp/Zter.ZE : Ljava/lang/String;
    //   848: getstatic burp/Zes_.ZJ : Ljava/lang/Object;
    //   851: checkcast java/math/BigInteger
    //   854: invokevirtual intValue : ()I
    //   857: bipush #32
    //   859: irem
    //   860: invokestatic abs : (I)I
    //   863: invokevirtual charAt : (I)C
    //   866: getstatic burp/Ztuj.Zk : Ljava/lang/String;
    //   869: getstatic burp/Zl88.ZK : Ljava/lang/Object;
    //   872: checkcast java/math/BigInteger
    //   875: invokevirtual intValue : ()I
    //   878: bipush #32
    //   880: irem
    //   881: invokestatic abs : (I)I
    //   884: invokevirtual charAt : (I)C
    //   887: if_icmpgt -> 905
    //   890: goto -> 897
    //   893: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   896: athrow
    //   897: iconst_1
    //   898: goto -> 906
    //   901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   904: athrow
    //   905: iconst_0
    //   906: ireturn
    //   907: astore_3
    //   908: new java/lang/Exception
    //   911: dup
    //   912: aload_3
    //   913: invokevirtual getMessage : ()Ljava/lang/String;
    //   916: invokespecial <init> : (Ljava/lang/String;)V
    //   919: athrow
    // Exception table:
    //   from	to	target	type
    //   4	906	907	java/lang/Throwable
    //   191	219	222	java/lang/Throwable
    //   201	236	239	java/lang/Throwable
    //   226	264	267	java/lang/Throwable
    //   243	281	284	java/lang/Throwable
    //   271	309	312	java/lang/Throwable
    //   288	326	329	java/lang/Throwable
    //   316	344	347	java/lang/Throwable
    //   333	358	361	java/lang/Throwable
    //   461	475	475	java/lang/Throwable
    //   486	499	502	java/lang/Throwable
    //   491	514	517	java/lang/Throwable
    //   506	532	535	java/lang/Throwable
    //   521	562	565	java/lang/Throwable
    //   625	652	655	java/lang/Throwable
    //   642	673	676	java/lang/Throwable
    //   659	703	706	java/lang/Throwable
    //   680	714	714	java/lang/Throwable
    //   725	741	744	java/lang/Throwable
    //   748	838	841	java/lang/Throwable
    //   793	890	893	java/lang/Throwable
    //   845	901	901	java/lang/Throwable
  }
  
  static void Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zi(Object paramObject) {
    Zbsr.Zq = a(18515, -7045);
    Zbsr.ZD = new BigInteger(a(18518, 7140));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zlhm.Zx.charAt(Math.abs(((BigInteger)Zkfz.Zr).intValue() % 32)) > Zbsr.Zq.charAt(Math.abs(((BigInteger)Zgw0.ZM).intValue() % 32))) {
          try {
            Ztbf.Zm(Class.forName(a(18512, -8699)));
            if (!bool)
              Zlzs.Zx(Class.forName(a(18513, 142))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlzs.Zx(Class.forName(a(18513, 142)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'F!éªòdÙ\\tt¨Ü¨!ë¥¡ ó±î·æiFrl~Ì/"Aµ¿Ê¶`8)¶  o¤öcxáÁãV¹ì8õu¢m(vøXnÚDÖ\\t²:x%×Í7ë['
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #69
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'H^Ô'õ³|«¢0k½®é¹ï)ÝØÏúëN\\n®°z°½ºcN4qÞ.Qs÷é[XT§´Êí»K>}Ëýºo8X\\t\\tÓ íX>r±'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #29
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zxzj.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zxzj.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #79
    //   214: goto -> 243
    //   217: bipush #22
    //   219: goto -> 243
    //   222: bipush #10
    //   224: goto -> 243
    //   227: bipush #57
    //   229: goto -> 243
    //   232: iconst_4
    //   233: goto -> 243
    //   236: bipush #119
    //   238: goto -> 243
    //   241: bipush #46
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: sipush #18514
    //   303: sipush #26313
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zxzj.ZZ : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #74
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #56
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #28
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-10
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #64
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-28
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-107
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #9
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #101
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: iconst_3
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #116
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #54
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #80
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #-107
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #118
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: iconst_4
    //   407: bastore
    //   408: dup
    //   409: bipush #16
    //   411: bipush #-128
    //   413: bastore
    //   414: dup
    //   415: bipush #17
    //   417: bipush #37
    //   419: bastore
    //   420: dup
    //   421: bipush #18
    //   423: bipush #81
    //   425: bastore
    //   426: dup
    //   427: bipush #19
    //   429: bipush #48
    //   431: bastore
    //   432: dup
    //   433: bipush #20
    //   435: bipush #-32
    //   437: bastore
    //   438: dup
    //   439: bipush #21
    //   441: bipush #-102
    //   443: bastore
    //   444: dup
    //   445: bipush #22
    //   447: bipush #11
    //   449: bastore
    //   450: dup
    //   451: bipush #23
    //   453: bipush #-113
    //   455: bastore
    //   456: dup
    //   457: bipush #24
    //   459: bipush #-44
    //   461: bastore
    //   462: dup
    //   463: bipush #25
    //   465: iconst_m1
    //   466: bastore
    //   467: dup
    //   468: bipush #26
    //   470: bipush #-31
    //   472: bastore
    //   473: dup
    //   474: bipush #27
    //   476: bipush #-100
    //   478: bastore
    //   479: dup
    //   480: bipush #28
    //   482: bipush #49
    //   484: bastore
    //   485: dup
    //   486: bipush #29
    //   488: bipush #53
    //   490: bastore
    //   491: dup
    //   492: bipush #30
    //   494: bipush #-83
    //   496: bastore
    //   497: dup
    //   498: bipush #31
    //   500: bipush #68
    //   502: bastore
    //   503: invokespecial <init> : ([B)V
    //   506: putstatic burp/Zxzj.ZO : Ljava/lang/Object;
    //   509: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4850) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxzj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */