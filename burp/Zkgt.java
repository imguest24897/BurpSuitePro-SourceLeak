package burp;

import java.math.BigInteger;

class Zkgt extends ClassLoader {
  static Object ZU;
  
  static String ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-25049
    //   7: sipush #23908
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   19: astore_3
    //   20: aload_3
    //   21: arraylength
    //   22: istore #4
    //   24: iconst_0
    //   25: istore #5
    //   27: iload #5
    //   29: iload #4
    //   31: if_icmpge -> 119
    //   34: aload_3
    //   35: iload #5
    //   37: aaload
    //   38: astore #6
    //   40: aload #6
    //   42: invokevirtual getModifiers : ()I
    //   45: invokestatic isStatic : (I)Z
    //   48: ifeq -> 112
    //   51: aload #6
    //   53: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   56: arraylength
    //   57: iconst_2
    //   58: if_icmpne -> 112
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: aload #6
    //   70: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   73: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   76: if_acmpne -> 112
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   85: athrow
    //   86: aload #6
    //   88: aconst_null
    //   89: iconst_2
    //   90: anewarray java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_0
    //   96: aastore
    //   97: dup
    //   98: iconst_1
    //   99: aload_1
    //   100: aastore
    //   101: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   104: pop
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   111: athrow
    //   112: iinc #5, 1
    //   115: iload_2
    //   116: ifeq -> 27
    //   119: iconst_1
    //   120: anewarray java/lang/Object
    //   123: astore_3
    //   124: sipush #-25042
    //   127: sipush #17678
    //   130: invokestatic a : (II)Ljava/lang/String;
    //   133: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   136: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   139: astore #4
    //   141: aload #4
    //   143: arraylength
    //   144: istore #5
    //   146: iconst_0
    //   147: istore #6
    //   149: iload #6
    //   151: iload #5
    //   153: if_icmpge -> 242
    //   156: aload #4
    //   158: iload #6
    //   160: aaload
    //   161: astore #7
    //   163: aload #7
    //   165: invokevirtual getModifiers : ()I
    //   168: invokestatic isStatic : (I)Z
    //   171: ifeq -> 235
    //   174: aload #7
    //   176: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   179: arraylength
    //   180: iconst_2
    //   181: if_icmpne -> 235
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   190: athrow
    //   191: aload #7
    //   193: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   196: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   199: if_acmpne -> 235
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   208: athrow
    //   209: aload #7
    //   211: aconst_null
    //   212: iconst_2
    //   213: anewarray java/lang/Object
    //   216: dup
    //   217: iconst_0
    //   218: aload_3
    //   219: aastore
    //   220: dup
    //   221: iconst_1
    //   222: aload_1
    //   223: aastore
    //   224: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   227: pop
    //   228: goto -> 235
    //   231: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   234: athrow
    //   235: iinc #6, 1
    //   238: iload_2
    //   239: ifeq -> 149
    //   242: ldc java/lang/ClassLoader
    //   244: iconst_0
    //   245: anewarray java/lang/Class
    //   248: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   251: astore #4
    //   253: aload #4
    //   255: iconst_1
    //   256: invokevirtual setAccessible : (Z)V
    //   259: aload_0
    //   260: iconst_0
    //   261: aload_3
    //   262: iconst_0
    //   263: aaload
    //   264: checkcast [Ljava/lang/Object;
    //   267: iconst_0
    //   268: aaload
    //   269: checkcast java/lang/reflect/Method
    //   272: sipush #-25044
    //   275: sipush #-26220
    //   278: invokestatic a : (II)Ljava/lang/String;
    //   281: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   284: iconst_0
    //   285: anewarray java/lang/Class
    //   288: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   291: iconst_0
    //   292: anewarray java/lang/Object
    //   295: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   298: iconst_4
    //   299: anewarray java/lang/Object
    //   302: dup
    //   303: iconst_0
    //   304: sipush #-25051
    //   307: sipush #14807
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: aastore
    //   314: dup
    //   315: iconst_1
    //   316: aload_0
    //   317: iconst_0
    //   318: aaload
    //   319: aastore
    //   320: dup
    //   321: iconst_2
    //   322: iconst_0
    //   323: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   326: aastore
    //   327: dup
    //   328: iconst_3
    //   329: aload_0
    //   330: iconst_0
    //   331: aaload
    //   332: checkcast [B
    //   335: arraylength
    //   336: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   339: aastore
    //   340: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   343: aastore
    //   344: sipush #-25056
    //   347: sipush #-1024
    //   350: invokestatic a : (II)Ljava/lang/String;
    //   353: iconst_1
    //   354: ldc burp/Zgja
    //   356: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   359: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   362: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   365: astore #5
    //   367: aload #5
    //   369: arraylength
    //   370: istore #6
    //   372: iconst_0
    //   373: istore #7
    //   375: iload #7
    //   377: iload #6
    //   379: if_icmpge -> 517
    //   382: aload #5
    //   384: iload #7
    //   386: aaload
    //   387: astore #8
    //   389: aload #8
    //   391: invokevirtual getModifiers : ()I
    //   394: invokestatic isStatic : (I)Z
    //   397: ifne -> 407
    //   400: goto -> 510
    //   403: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   406: athrow
    //   407: aload #8
    //   409: invokevirtual getType : ()Ljava/lang/Class;
    //   412: astore #9
    //   414: aload #9
    //   416: ifnull -> 497
    //   419: aload #9
    //   421: invokevirtual isPrimitive : ()Z
    //   424: ifne -> 497
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   433: athrow
    //   434: aload #9
    //   436: invokevirtual getPackage : ()Ljava/lang/Package;
    //   439: ifnull -> 497
    //   442: goto -> 449
    //   445: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   448: athrow
    //   449: aload #9
    //   451: invokevirtual getPackage : ()Ljava/lang/Package;
    //   454: invokevirtual getName : ()Ljava/lang/String;
    //   457: ifnull -> 497
    //   460: goto -> 467
    //   463: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   466: athrow
    //   467: aload #9
    //   469: invokevirtual getPackage : ()Ljava/lang/Package;
    //   472: invokevirtual getName : ()Ljava/lang/String;
    //   475: sipush #-25052
    //   478: sipush #-1345
    //   481: invokestatic a : (II)Ljava/lang/String;
    //   484: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   487: ifne -> 497
    //   490: goto -> 497
    //   493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   496: athrow
    //   497: aload #8
    //   499: iconst_1
    //   500: invokevirtual setAccessible : (Z)V
    //   503: aload #8
    //   505: aconst_null
    //   506: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   509: pop
    //   510: iinc #7, 1
    //   513: iload_2
    //   514: ifeq -> 375
    //   517: sipush #-25055
    //   520: sipush #-2632
    //   523: invokestatic a : (II)Ljava/lang/String;
    //   526: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   529: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   532: astore #5
    //   534: aload #5
    //   536: arraylength
    //   537: istore #6
    //   539: iconst_0
    //   540: istore #7
    //   542: iload #7
    //   544: iload #6
    //   546: if_icmpge -> 679
    //   549: aload #5
    //   551: iload #7
    //   553: aaload
    //   554: astore #8
    //   556: aload #8
    //   558: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   561: pop
    //   562: aload #8
    //   564: invokevirtual getModifiers : ()I
    //   567: invokestatic isStatic : (I)Z
    //   570: ifeq -> 665
    //   573: aload #8
    //   575: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   578: arraylength
    //   579: iconst_2
    //   580: if_icmpne -> 665
    //   583: goto -> 590
    //   586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   589: athrow
    //   590: aload #8
    //   592: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   595: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   598: invokevirtual equals : (Ljava/lang/Object;)Z
    //   601: ifeq -> 665
    //   604: goto -> 611
    //   607: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   610: athrow
    //   611: aload #8
    //   613: iconst_1
    //   614: invokevirtual setAccessible : (Z)V
    //   617: aload #8
    //   619: aconst_null
    //   620: iconst_2
    //   621: anewarray java/lang/Object
    //   624: dup
    //   625: iconst_0
    //   626: aload_0
    //   627: aastore
    //   628: dup
    //   629: iconst_1
    //   630: aload_1
    //   631: ifnonnull -> 649
    //   634: goto -> 641
    //   637: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   640: athrow
    //   641: aload_1
    //   642: goto -> 656
    //   645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   648: athrow
    //   649: aload_1
    //   650: checkcast [B
    //   653: invokevirtual clone : ()Ljava/lang/Object;
    //   656: aastore
    //   657: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   660: pop
    //   661: iload_2
    //   662: ifeq -> 679
    //   665: iinc #7, 1
    //   668: iload_2
    //   669: ifeq -> 542
    //   672: goto -> 679
    //   675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   678: athrow
    //   679: getstatic burp/Zl2q.ZI : Ljava/lang/String;
    //   682: getstatic burp/Zgw0.ZM : Ljava/lang/Object;
    //   685: checkcast java/math/BigInteger
    //   688: invokevirtual intValue : ()I
    //   691: bipush #32
    //   693: irem
    //   694: invokestatic abs : (I)I
    //   697: invokevirtual charAt : (I)C
    //   700: getstatic burp/Zr0u.Z_ : Ljava/lang/String;
    //   703: getstatic burp/Zsxj.Zi : Ljava/lang/Object;
    //   706: checkcast java/math/BigInteger
    //   709: invokevirtual intValue : ()I
    //   712: bipush #32
    //   714: irem
    //   715: invokestatic abs : (I)I
    //   718: invokevirtual charAt : (I)C
    //   721: if_icmple -> 828
    //   724: getstatic burp/Zsxm.Zq : Ljava/lang/String;
    //   727: getstatic burp/Zt3l.Zq : Ljava/lang/Object;
    //   730: checkcast java/math/BigInteger
    //   733: invokevirtual intValue : ()I
    //   736: bipush #32
    //   738: irem
    //   739: invokestatic abs : (I)I
    //   742: invokevirtual charAt : (I)C
    //   745: getstatic burp/Zkyc.ZK : Ljava/lang/String;
    //   748: getstatic burp/Zsby.ZZ : Ljava/lang/Object;
    //   751: checkcast java/math/BigInteger
    //   754: invokevirtual intValue : ()I
    //   757: bipush #32
    //   759: irem
    //   760: invokestatic abs : (I)I
    //   763: invokevirtual charAt : (I)C
    //   766: if_icmpgt -> 828
    //   769: goto -> 776
    //   772: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   775: athrow
    //   776: getstatic burp/Zeh9.ZF : Ljava/lang/String;
    //   779: getstatic burp/Zsde.Zx : Ljava/lang/Object;
    //   782: checkcast java/math/BigInteger
    //   785: invokevirtual intValue : ()I
    //   788: bipush #32
    //   790: irem
    //   791: invokestatic abs : (I)I
    //   794: invokevirtual charAt : (I)C
    //   797: getstatic burp/Zd1.ZN : Ljava/lang/String;
    //   800: getstatic burp/Zr8h.ZH : Ljava/lang/Object;
    //   803: checkcast java/math/BigInteger
    //   806: invokevirtual intValue : ()I
    //   809: bipush #32
    //   811: irem
    //   812: invokestatic abs : (I)I
    //   815: invokevirtual charAt : (I)C
    //   818: if_icmpgt -> 836
    //   821: goto -> 828
    //   824: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   827: athrow
    //   828: iconst_1
    //   829: goto -> 837
    //   832: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   835: athrow
    //   836: iconst_0
    //   837: ireturn
    //   838: astore_3
    //   839: new java/lang/Exception
    //   842: dup
    //   843: aload_3
    //   844: invokevirtual getMessage : ()Ljava/lang/String;
    //   847: invokespecial <init> : (Ljava/lang/String;)V
    //   850: athrow
    // Exception table:
    //   from	to	target	type
    //   4	837	838	java/lang/Throwable
    //   40	61	64	java/lang/Throwable
    //   51	79	82	java/lang/Throwable
    //   68	105	108	java/lang/Throwable
    //   163	184	187	java/lang/Throwable
    //   174	202	205	java/lang/Throwable
    //   191	228	231	java/lang/Throwable
    //   389	403	403	java/lang/Throwable
    //   414	427	430	java/lang/Throwable
    //   419	442	445	java/lang/Throwable
    //   434	460	463	java/lang/Throwable
    //   449	490	493	java/lang/Throwable
    //   556	583	586	java/lang/Throwable
    //   573	604	607	java/lang/Throwable
    //   590	634	637	java/lang/Throwable
    //   611	645	645	java/lang/Throwable
    //   656	672	675	java/lang/Throwable
    //   679	769	772	java/lang/Throwable
    //   724	821	824	java/lang/Throwable
    //   776	832	832	java/lang/Throwable
  }
  
  static void ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zr(Object paramObject) {
    Zsgl.ZG = a(-25050, 2505);
    Zsgl.Zn = new BigInteger(1, new byte[] { 
          107, 37, -109, -40, -56, 87, 118, 45, 67, -67, 
          -99, 7, 3, -107, 94, 81, -11, 14, 35, -57, 
          -27, 26, -68, -17, 100, -101, -47, 38, -114, -3, 
          27, 44 });
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zrh1.Zg.charAt(Math.abs(((BigInteger)Ze5f.Zh).intValue() % 32)) <= Zrdo.Zj.charAt(Math.abs(((BigInteger)Zbp.ZD).intValue() % 32))) {
          try {
            Zl8l.ZO(Class.forName(a(-25054, 20007)));
            if (!bool)
              Zg5.Zl(Class.forName(a(-25043, -15006))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zg5.Zl(Class.forName(a(-25043, -15006)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'M.\\t\\bø\\nUg  cð|x¥}ØÕ¼ édv´°æ9f­öÃò(¥_,J\\tÔjÜT\\râ\\tíñ:å¥®Èê\\t¢hKèçaÃ\\t¬ktö¦ / ûÔIG¶·Þj{HÂ)±;~`~déò²"{\\t¶­QnlÔæC'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #89
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
    //   67: ldc 'VåùÓÍ×6ö\\tðqð:³'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #6
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
    //   128: putstatic burp/Zkgt.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zkgt.b : [Ljava/lang/String;
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
    //   212: bipush #30
    //   214: goto -> 244
    //   217: bipush #25
    //   219: goto -> 244
    //   222: bipush #106
    //   224: goto -> 244
    //   227: bipush #33
    //   229: goto -> 244
    //   232: bipush #107
    //   234: goto -> 244
    //   237: bipush #107
    //   239: goto -> 244
    //   242: bipush #22
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #28
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-79
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #119
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-99
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #63
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #13
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #7
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-39
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-128
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-112
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-100
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #96
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-18
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-19
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-31
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #17
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #79
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #117
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #122
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-14
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #110
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #11
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #59
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #111
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #-22
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-121
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #20
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-11
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-10
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #-110
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #-51
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #11
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zkgt.ZU : Ljava/lang/Object;
    //   501: sipush #-25053
    //   504: sipush #1035
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zkgt.ZR : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9E24) & 0xFFFF;
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
      byte b1 = 80;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkgt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */