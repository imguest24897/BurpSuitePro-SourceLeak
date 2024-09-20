package burp;

import java.math.BigInteger;

class Zxt7 extends ClassLoader {
  static String Zi;
  
  static Object ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZX(Object paramObject) {
    Zmkq.Zr = a(5434, -15399);
    Zmkq.Zg = new BigInteger(a(5424, 12860));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zz4j.ZS.charAt(Math.abs(((BigInteger)Zrh_.Zb).intValue() % 32)) > Zscz.ZJ.charAt(Math.abs(((BigInteger)Zz7j.ZR).intValue() % 32))) {
          try {
            Zsf4.ZF(Class.forName(a(5432, 22001)));
            if (bool)
              Ztnn.ZU(Class.forName(a(5431, -8463))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztnn.ZU(Class.forName(a(5431, -8463)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zmkq.Zg : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zx63.ZX : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zkdx.Zn : Ljava/lang/Object;
    //   22: sipush #5427
    //   25: sipush #-29203
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zep8
    //   34: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   37: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   40: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   43: astore_3
    //   44: aload_3
    //   45: arraylength
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iload #5
    //   53: iload #4
    //   55: if_icmpge -> 192
    //   58: aload_3
    //   59: iload #5
    //   61: aaload
    //   62: astore #6
    //   64: aload #6
    //   66: invokevirtual getModifiers : ()I
    //   69: invokestatic isStatic : (I)Z
    //   72: ifne -> 82
    //   75: goto -> 185
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: aload #6
    //   84: invokevirtual getType : ()Ljava/lang/Class;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 172
    //   94: aload #7
    //   96: invokevirtual isPrimitive : ()Z
    //   99: ifne -> 172
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   108: athrow
    //   109: aload #7
    //   111: invokevirtual getPackage : ()Ljava/lang/Package;
    //   114: ifnull -> 172
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: invokevirtual getName : ()Ljava/lang/String;
    //   132: ifnull -> 172
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: sipush #5426
    //   153: sipush #28641
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   162: ifne -> 172
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   171: athrow
    //   172: aload #6
    //   174: iconst_1
    //   175: invokevirtual setAccessible : (Z)V
    //   178: aload #6
    //   180: aconst_null
    //   181: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: iinc #5, 1
    //   188: iload_2
    //   189: ifeq -> 51
    //   192: sipush #5435
    //   195: sipush #-25448
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   204: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   207: astore_3
    //   208: aload_3
    //   209: arraylength
    //   210: istore #4
    //   212: iconst_0
    //   213: istore #5
    //   215: iload #5
    //   217: iload #4
    //   219: if_icmpge -> 351
    //   222: aload_3
    //   223: iload #5
    //   225: aaload
    //   226: astore #6
    //   228: aload #6
    //   230: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   233: pop
    //   234: aload #6
    //   236: invokevirtual getModifiers : ()I
    //   239: invokestatic isStatic : (I)Z
    //   242: ifeq -> 337
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 337
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   270: invokevirtual equals : (Ljava/lang/Object;)Z
    //   273: ifeq -> 337
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   282: athrow
    //   283: aload #6
    //   285: iconst_1
    //   286: invokevirtual setAccessible : (Z)V
    //   289: aload #6
    //   291: aconst_null
    //   292: iconst_2
    //   293: anewarray java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_0
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_1
    //   303: ifnonnull -> 321
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload_1
    //   314: goto -> 328
    //   317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   320: athrow
    //   321: aload_1
    //   322: checkcast [B
    //   325: invokevirtual clone : ()Ljava/lang/Object;
    //   328: aastore
    //   329: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   332: pop
    //   333: iload_2
    //   334: ifeq -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifeq -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: sipush #5425
    //   354: sipush #-11176
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: iconst_1
    //   361: ldc burp/Zm81
    //   363: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   366: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   369: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   372: astore_3
    //   373: aload_3
    //   374: arraylength
    //   375: istore #4
    //   377: iconst_0
    //   378: istore #5
    //   380: iload #5
    //   382: iload #4
    //   384: if_icmpge -> 521
    //   387: aload_3
    //   388: iload #5
    //   390: aaload
    //   391: astore #6
    //   393: aload #6
    //   395: invokevirtual getModifiers : ()I
    //   398: invokestatic isStatic : (I)Z
    //   401: ifne -> 411
    //   404: goto -> 514
    //   407: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   410: athrow
    //   411: aload #6
    //   413: invokevirtual getType : ()Ljava/lang/Class;
    //   416: astore #7
    //   418: aload #7
    //   420: ifnull -> 501
    //   423: aload #7
    //   425: invokevirtual isPrimitive : ()Z
    //   428: ifne -> 501
    //   431: goto -> 438
    //   434: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   437: athrow
    //   438: aload #7
    //   440: invokevirtual getPackage : ()Ljava/lang/Package;
    //   443: ifnull -> 501
    //   446: goto -> 453
    //   449: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   452: athrow
    //   453: aload #7
    //   455: invokevirtual getPackage : ()Ljava/lang/Package;
    //   458: invokevirtual getName : ()Ljava/lang/String;
    //   461: ifnull -> 501
    //   464: goto -> 471
    //   467: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   470: athrow
    //   471: aload #7
    //   473: invokevirtual getPackage : ()Ljava/lang/Package;
    //   476: invokevirtual getName : ()Ljava/lang/String;
    //   479: sipush #5429
    //   482: sipush #3891
    //   485: invokestatic a : (II)Ljava/lang/String;
    //   488: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   491: ifne -> 501
    //   494: goto -> 501
    //   497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   500: athrow
    //   501: aload #6
    //   503: iconst_1
    //   504: invokevirtual setAccessible : (Z)V
    //   507: aload #6
    //   509: aconst_null
    //   510: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   513: pop
    //   514: iinc #5, 1
    //   517: iload_2
    //   518: ifeq -> 380
    //   521: sipush #5428
    //   524: sipush #25936
    //   527: invokestatic a : (II)Ljava/lang/String;
    //   530: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   533: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   536: astore_3
    //   537: aload_3
    //   538: arraylength
    //   539: istore #4
    //   541: iconst_0
    //   542: istore #5
    //   544: iload #5
    //   546: iload #4
    //   548: if_icmpge -> 659
    //   551: aload_3
    //   552: iload #5
    //   554: aaload
    //   555: astore #6
    //   557: aload #6
    //   559: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   562: pop
    //   563: aload #6
    //   565: invokevirtual getModifiers : ()I
    //   568: invokestatic isStatic : (I)Z
    //   571: ifeq -> 645
    //   574: aload #6
    //   576: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   579: arraylength
    //   580: iconst_2
    //   581: if_icmpne -> 645
    //   584: goto -> 591
    //   587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   590: athrow
    //   591: aload #6
    //   593: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   596: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   599: if_acmpne -> 645
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   608: athrow
    //   609: aload #6
    //   611: iconst_1
    //   612: invokevirtual setAccessible : (Z)V
    //   615: aload #6
    //   617: aconst_null
    //   618: iconst_2
    //   619: anewarray java/lang/Object
    //   622: dup
    //   623: iconst_0
    //   624: aload_0
    //   625: aastore
    //   626: dup
    //   627: iconst_1
    //   628: aload_1
    //   629: aastore
    //   630: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   633: pop
    //   634: iload_2
    //   635: ifeq -> 659
    //   638: goto -> 645
    //   641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   644: athrow
    //   645: iinc #5, 1
    //   648: iload_2
    //   649: ifeq -> 544
    //   652: goto -> 659
    //   655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   658: athrow
    //   659: getstatic burp/Zsn3.ZS : Ljava/lang/String;
    //   662: getstatic burp/Zsdl.Zx : Ljava/lang/Object;
    //   665: checkcast java/math/BigInteger
    //   668: invokevirtual intValue : ()I
    //   671: bipush #32
    //   673: irem
    //   674: invokestatic abs : (I)I
    //   677: invokevirtual charAt : (I)C
    //   680: getstatic burp/Zz4m.ZI : Ljava/lang/String;
    //   683: getstatic burp/Ztvg.ZO : Ljava/lang/Object;
    //   686: checkcast java/math/BigInteger
    //   689: invokevirtual intValue : ()I
    //   692: bipush #32
    //   694: irem
    //   695: invokestatic abs : (I)I
    //   698: invokevirtual charAt : (I)C
    //   701: if_icmpgt -> 816
    //   704: getstatic burp/Zg7e.Zg : Ljava/lang/String;
    //   707: getstatic burp/Zg4l.ZI : Ljava/lang/Object;
    //   710: checkcast java/math/BigInteger
    //   713: invokevirtual intValue : ()I
    //   716: bipush #32
    //   718: irem
    //   719: invokestatic abs : (I)I
    //   722: invokevirtual charAt : (I)C
    //   725: getstatic burp/Zetf.Zo : Ljava/lang/String;
    //   728: getstatic burp/Zlwc.ZG : Ljava/lang/Object;
    //   731: checkcast java/math/BigInteger
    //   734: invokevirtual intValue : ()I
    //   737: bipush #32
    //   739: irem
    //   740: invokestatic abs : (I)I
    //   743: invokevirtual charAt : (I)C
    //   746: if_icmple -> 816
    //   749: goto -> 756
    //   752: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   755: athrow
    //   756: getstatic burp/Zxdy.Zm : Ljava/lang/String;
    //   759: getstatic burp/Zdv.Zw : Ljava/lang/Object;
    //   762: checkcast java/math/BigInteger
    //   765: invokevirtual intValue : ()I
    //   768: bipush #32
    //   770: irem
    //   771: invokestatic abs : (I)I
    //   774: invokevirtual charAt : (I)C
    //   777: getstatic burp/Zm1d.ZE : Ljava/lang/String;
    //   780: getstatic burp/Zsko.ZD : Ljava/lang/Object;
    //   783: checkcast java/math/BigInteger
    //   786: invokevirtual intValue : ()I
    //   789: bipush #32
    //   791: irem
    //   792: invokestatic abs : (I)I
    //   795: invokevirtual charAt : (I)C
    //   798: if_icmpgt -> 816
    //   801: goto -> 808
    //   804: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   807: athrow
    //   808: iconst_1
    //   809: goto -> 817
    //   812: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   815: athrow
    //   816: iconst_0
    //   817: ireturn
    //   818: astore_3
    //   819: new java/lang/Exception
    //   822: dup
    //   823: aload_3
    //   824: invokevirtual getMessage : ()Ljava/lang/String;
    //   827: invokespecial <init> : (Ljava/lang/String;)V
    //   830: athrow
    // Exception table:
    //   from	to	target	type
    //   4	817	818	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	276	279	java/lang/Throwable
    //   262	306	309	java/lang/Throwable
    //   283	317	317	java/lang/Throwable
    //   328	344	347	java/lang/Throwable
    //   393	407	407	java/lang/Throwable
    //   418	431	434	java/lang/Throwable
    //   423	446	449	java/lang/Throwable
    //   438	464	467	java/lang/Throwable
    //   453	494	497	java/lang/Throwable
    //   557	584	587	java/lang/Throwable
    //   574	602	605	java/lang/Throwable
    //   591	638	641	java/lang/Throwable
    //   609	652	655	java/lang/Throwable
    //   659	749	752	java/lang/Throwable
    //   704	801	804	java/lang/Throwable
    //   756	812	812	java/lang/Throwable
  }
  
  static void ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ZGc\\tCçdå2Lô¿'ú ¾cn×m%RJzòÃî)x\Ó¤&§³*yòÛú)ÔMGÏ3\\fÐØí åÆÀ­Bóûç_e½¶/åIÊ~CÇ\\tá/Îàýh :&³üLyæ/ü£üèOKH×ÑìZ[³Xò\\tïßþÅÍ\\t:=µ¢Fýa÷þ\\f Æªz#F9D\\t¦ë¡AsÖÓÛ?ãÅô¦»ï8'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #61
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'F~³Ðõ\\ttÝ>ü¡ÒÈU'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #63
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zxt7.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zxt7.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #39
    //   214: goto -> 244
    //   217: bipush #116
    //   219: goto -> 244
    //   222: bipush #46
    //   224: goto -> 244
    //   227: bipush #77
    //   229: goto -> 244
    //   232: bipush #72
    //   234: goto -> 244
    //   237: bipush #51
    //   239: goto -> 244
    //   242: bipush #15
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: sipush #5430
    //   303: sipush #-27057
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zxt7.Zi : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #29
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #61
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #14
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-111
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #8
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #79
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-81
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-71
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #34
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-35
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #80
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #100
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #15
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #44
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #93
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-46
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-111
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-42
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-25
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-75
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-23
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-111
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #89
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #116
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-116
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-111
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-121
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #95
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-27
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #107
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #44
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #118
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zxt7.ZV : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1532) & 0xFFFF;
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
      byte b1 = 21;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxt7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */