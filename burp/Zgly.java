package burp;

import java.math.BigInteger;

class Zgly extends ClassLoader {
  static Object ZN;
  
  static String Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZZ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZI(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zxx4.Zo : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zb2p.ZQ : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zmv9.Zw : Ljava/lang/Object;
    //   22: getstatic burp/Zlxs.ZK : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: aload_3
    //   33: arraylength
    //   34: iconst_2
    //   35: iadd
    //   36: newarray byte
    //   38: astore #5
    //   40: iconst_0
    //   41: istore #6
    //   43: iload #6
    //   45: aload_3
    //   46: arraylength
    //   47: if_icmpge -> 66
    //   50: aload #5
    //   52: iload #6
    //   54: aload_3
    //   55: iload #6
    //   57: baload
    //   58: bastore
    //   59: iinc #6, 1
    //   62: iload_2
    //   63: ifne -> 43
    //   66: aload #5
    //   68: arraylength
    //   69: iconst_3
    //   70: idiv
    //   71: iconst_4
    //   72: imul
    //   73: newarray byte
    //   75: astore #4
    //   77: iconst_0
    //   78: istore #6
    //   80: iconst_0
    //   81: istore #7
    //   83: iload #6
    //   85: aload_3
    //   86: arraylength
    //   87: if_icmpge -> 198
    //   90: aload #4
    //   92: iload #7
    //   94: aload #5
    //   96: iload #6
    //   98: baload
    //   99: iconst_2
    //   100: iushr
    //   101: bipush #63
    //   103: iand
    //   104: i2b
    //   105: bastore
    //   106: aload #4
    //   108: iload #7
    //   110: iconst_1
    //   111: iadd
    //   112: aload #5
    //   114: iload #6
    //   116: iconst_1
    //   117: iadd
    //   118: baload
    //   119: iconst_4
    //   120: iushr
    //   121: bipush #15
    //   123: iand
    //   124: aload #5
    //   126: iload #6
    //   128: baload
    //   129: iconst_4
    //   130: ishl
    //   131: bipush #63
    //   133: iand
    //   134: ior
    //   135: i2b
    //   136: bastore
    //   137: aload #4
    //   139: iload #7
    //   141: iconst_2
    //   142: iadd
    //   143: aload #5
    //   145: iload #6
    //   147: iconst_2
    //   148: iadd
    //   149: baload
    //   150: bipush #6
    //   152: iushr
    //   153: iconst_3
    //   154: iand
    //   155: aload #5
    //   157: iload #6
    //   159: iconst_1
    //   160: iadd
    //   161: baload
    //   162: iconst_2
    //   163: ishl
    //   164: bipush #63
    //   166: iand
    //   167: ior
    //   168: i2b
    //   169: bastore
    //   170: aload #4
    //   172: iload #7
    //   174: iconst_3
    //   175: iadd
    //   176: aload #5
    //   178: iload #6
    //   180: iconst_2
    //   181: iadd
    //   182: baload
    //   183: bipush #63
    //   185: iand
    //   186: i2b
    //   187: bastore
    //   188: iinc #6, 3
    //   191: iinc #7, 4
    //   194: iload_2
    //   195: ifne -> 83
    //   198: iconst_0
    //   199: istore #6
    //   201: iload #6
    //   203: aload #4
    //   205: arraylength
    //   206: if_icmpge -> 390
    //   209: aload #4
    //   211: iload #6
    //   213: baload
    //   214: bipush #26
    //   216: if_icmpge -> 244
    //   219: aload #4
    //   221: iload #6
    //   223: aload #4
    //   225: iload #6
    //   227: baload
    //   228: bipush #65
    //   230: iadd
    //   231: i2b
    //   232: bastore
    //   233: iload_2
    //   234: ifne -> 383
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   243: athrow
    //   244: aload #4
    //   246: iload #6
    //   248: baload
    //   249: bipush #52
    //   251: if_icmpge -> 289
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   260: athrow
    //   261: aload #4
    //   263: iload #6
    //   265: aload #4
    //   267: iload #6
    //   269: baload
    //   270: bipush #97
    //   272: iadd
    //   273: bipush #26
    //   275: isub
    //   276: i2b
    //   277: bastore
    //   278: iload_2
    //   279: ifne -> 383
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   288: athrow
    //   289: aload #4
    //   291: iload #6
    //   293: baload
    //   294: bipush #62
    //   296: if_icmpge -> 334
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   305: athrow
    //   306: aload #4
    //   308: iload #6
    //   310: aload #4
    //   312: iload #6
    //   314: baload
    //   315: bipush #48
    //   317: iadd
    //   318: bipush #52
    //   320: isub
    //   321: i2b
    //   322: bastore
    //   323: iload_2
    //   324: ifne -> 383
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   333: athrow
    //   334: aload #4
    //   336: iload #6
    //   338: baload
    //   339: bipush #63
    //   341: if_icmpge -> 369
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: aload #4
    //   353: iload #6
    //   355: bipush #43
    //   357: bastore
    //   358: iload_2
    //   359: ifne -> 383
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: aload #4
    //   371: iload #6
    //   373: bipush #47
    //   375: bastore
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   382: athrow
    //   383: iinc #6, 1
    //   386: iload_2
    //   387: ifne -> 201
    //   390: aload #4
    //   392: arraylength
    //   393: iconst_1
    //   394: isub
    //   395: istore #6
    //   397: iload #6
    //   399: aload_3
    //   400: arraylength
    //   401: iconst_4
    //   402: imul
    //   403: iconst_3
    //   404: idiv
    //   405: if_icmple -> 422
    //   408: aload #4
    //   410: iload #6
    //   412: bipush #61
    //   414: bastore
    //   415: iinc #6, -1
    //   418: iload_2
    //   419: ifne -> 397
    //   422: new java/math/BigInteger
    //   425: dup
    //   426: aload #4
    //   428: invokespecial <init> : ([B)V
    //   431: invokevirtual abs : ()Ljava/math/BigInteger;
    //   434: putstatic burp/Zkgp.Zw : Ljava/lang/Object;
    //   437: sipush #1588
    //   440: sipush #-13450
    //   443: invokestatic a : (II)Ljava/lang/String;
    //   446: iconst_1
    //   447: ldc burp/Zl1u
    //   449: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   452: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   455: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   458: astore_3
    //   459: aload_3
    //   460: arraylength
    //   461: istore #4
    //   463: iconst_0
    //   464: istore #5
    //   466: iload #5
    //   468: iload #4
    //   470: if_icmpge -> 607
    //   473: aload_3
    //   474: iload #5
    //   476: aaload
    //   477: astore #6
    //   479: aload #6
    //   481: invokevirtual getModifiers : ()I
    //   484: invokestatic isStatic : (I)Z
    //   487: ifne -> 497
    //   490: goto -> 600
    //   493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   496: athrow
    //   497: aload #6
    //   499: invokevirtual getType : ()Ljava/lang/Class;
    //   502: astore #7
    //   504: aload #7
    //   506: ifnull -> 587
    //   509: aload #7
    //   511: invokevirtual isPrimitive : ()Z
    //   514: ifne -> 587
    //   517: goto -> 524
    //   520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   523: athrow
    //   524: aload #7
    //   526: invokevirtual getPackage : ()Ljava/lang/Package;
    //   529: ifnull -> 587
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: aload #7
    //   541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   544: invokevirtual getName : ()Ljava/lang/String;
    //   547: ifnull -> 587
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   556: athrow
    //   557: aload #7
    //   559: invokevirtual getPackage : ()Ljava/lang/Package;
    //   562: invokevirtual getName : ()Ljava/lang/String;
    //   565: sipush #1584
    //   568: sipush #-6814
    //   571: invokestatic a : (II)Ljava/lang/String;
    //   574: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   577: ifne -> 587
    //   580: goto -> 587
    //   583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   586: athrow
    //   587: aload #6
    //   589: iconst_1
    //   590: invokevirtual setAccessible : (Z)V
    //   593: aload #6
    //   595: aconst_null
    //   596: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   599: pop
    //   600: iinc #5, 1
    //   603: iload_2
    //   604: ifne -> 466
    //   607: sipush #1589
    //   610: sipush #11157
    //   613: invokestatic a : (II)Ljava/lang/String;
    //   616: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   619: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   622: astore_3
    //   623: aload_3
    //   624: arraylength
    //   625: istore #4
    //   627: iconst_0
    //   628: istore #5
    //   630: iload #5
    //   632: iload #4
    //   634: if_icmpge -> 766
    //   637: aload_3
    //   638: iload #5
    //   640: aaload
    //   641: astore #6
    //   643: aload #6
    //   645: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   648: pop
    //   649: aload #6
    //   651: invokevirtual getModifiers : ()I
    //   654: invokestatic isStatic : (I)Z
    //   657: ifeq -> 752
    //   660: aload #6
    //   662: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   665: arraylength
    //   666: iconst_2
    //   667: if_icmpne -> 752
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   676: athrow
    //   677: aload #6
    //   679: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   682: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   685: invokevirtual equals : (Ljava/lang/Object;)Z
    //   688: ifeq -> 752
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   697: athrow
    //   698: aload #6
    //   700: iconst_1
    //   701: invokevirtual setAccessible : (Z)V
    //   704: aload #6
    //   706: aconst_null
    //   707: iconst_2
    //   708: anewarray java/lang/Object
    //   711: dup
    //   712: iconst_0
    //   713: aload_0
    //   714: aastore
    //   715: dup
    //   716: iconst_1
    //   717: aload_1
    //   718: ifnonnull -> 736
    //   721: goto -> 728
    //   724: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   727: athrow
    //   728: aload_1
    //   729: goto -> 743
    //   732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   735: athrow
    //   736: aload_1
    //   737: checkcast [B
    //   740: invokevirtual clone : ()Ljava/lang/Object;
    //   743: aastore
    //   744: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   747: pop
    //   748: iload_2
    //   749: ifne -> 766
    //   752: iinc #5, 1
    //   755: iload_2
    //   756: ifne -> 630
    //   759: goto -> 766
    //   762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   765: athrow
    //   766: getstatic burp/Zzh1.Zn : Ljava/lang/String;
    //   769: getstatic burp/Ze_0.ZY : Ljava/lang/Object;
    //   772: checkcast java/math/BigInteger
    //   775: invokevirtual intValue : ()I
    //   778: bipush #32
    //   780: irem
    //   781: invokestatic abs : (I)I
    //   784: invokevirtual charAt : (I)C
    //   787: getstatic burp/Zt5b.ZV : Ljava/lang/String;
    //   790: getstatic burp/Zez0.ZT : Ljava/lang/Object;
    //   793: checkcast java/math/BigInteger
    //   796: invokevirtual intValue : ()I
    //   799: bipush #32
    //   801: irem
    //   802: invokestatic abs : (I)I
    //   805: invokevirtual charAt : (I)C
    //   808: if_icmpgt -> 915
    //   811: getstatic burp/Zlxs.ZM : Ljava/lang/String;
    //   814: getstatic burp/Zbqk.ZT : Ljava/lang/Object;
    //   817: checkcast java/math/BigInteger
    //   820: invokevirtual intValue : ()I
    //   823: bipush #32
    //   825: irem
    //   826: invokestatic abs : (I)I
    //   829: invokevirtual charAt : (I)C
    //   832: getstatic burp/Zgp_.Zn : Ljava/lang/String;
    //   835: getstatic burp/Zmy4.ZB : Ljava/lang/Object;
    //   838: checkcast java/math/BigInteger
    //   841: invokevirtual intValue : ()I
    //   844: bipush #32
    //   846: irem
    //   847: invokestatic abs : (I)I
    //   850: invokevirtual charAt : (I)C
    //   853: if_icmple -> 915
    //   856: goto -> 863
    //   859: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   862: athrow
    //   863: getstatic burp/Zmu6.Zl : Ljava/lang/String;
    //   866: getstatic burp/Zkht.ZR : Ljava/lang/Object;
    //   869: checkcast java/math/BigInteger
    //   872: invokevirtual intValue : ()I
    //   875: bipush #32
    //   877: irem
    //   878: invokestatic abs : (I)I
    //   881: invokevirtual charAt : (I)C
    //   884: getstatic burp/Zrn0.Zd : Ljava/lang/String;
    //   887: getstatic burp/Zle6.ZM : Ljava/lang/Object;
    //   890: checkcast java/math/BigInteger
    //   893: invokevirtual intValue : ()I
    //   896: bipush #32
    //   898: irem
    //   899: invokestatic abs : (I)I
    //   902: invokevirtual charAt : (I)C
    //   905: if_icmpgt -> 923
    //   908: goto -> 915
    //   911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   914: athrow
    //   915: iconst_1
    //   916: goto -> 924
    //   919: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   922: athrow
    //   923: iconst_0
    //   924: ireturn
    //   925: astore_3
    //   926: new java/lang/Exception
    //   929: dup
    //   930: aload_3
    //   931: invokevirtual getMessage : ()Ljava/lang/String;
    //   934: invokespecial <init> : (Ljava/lang/String;)V
    //   937: athrow
    // Exception table:
    //   from	to	target	type
    //   4	924	925	java/lang/Throwable
    //   209	237	240	java/lang/Throwable
    //   219	254	257	java/lang/Throwable
    //   244	282	285	java/lang/Throwable
    //   261	299	302	java/lang/Throwable
    //   289	327	330	java/lang/Throwable
    //   306	344	347	java/lang/Throwable
    //   334	362	365	java/lang/Throwable
    //   351	376	379	java/lang/Throwable
    //   479	493	493	java/lang/Throwable
    //   504	517	520	java/lang/Throwable
    //   509	532	535	java/lang/Throwable
    //   524	550	553	java/lang/Throwable
    //   539	580	583	java/lang/Throwable
    //   643	670	673	java/lang/Throwable
    //   660	691	694	java/lang/Throwable
    //   677	721	724	java/lang/Throwable
    //   698	732	732	java/lang/Throwable
    //   743	759	762	java/lang/Throwable
    //   766	856	859	java/lang/Throwable
    //   811	908	911	java/lang/Throwable
    //   863	919	919	java/lang/Throwable
  }
  
  static void ZX(Object paramObject) {
    Ze57.ZV = a(1591, -15045);
    Ze57.ZR = new BigInteger(a(1586, -30562));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zkht.Zd.charAt(Math.abs(((BigInteger)Zvos.Zr).intValue() % 32)) <= Zgjj.Zi.charAt(Math.abs(((BigInteger)Zmuj.ZH).intValue() % 32))) {
          try {
            Zeb3.Za(Class.forName(a(1585, 28333)));
            if (bool)
              Zb38.Zt(Class.forName(a(1590, -9939))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zb38.Zt(Class.forName(a(1590, -9939)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'È.{vâ_^ù{Ù\\r !z KÊöHhd«à¤¸­t#úó§Ðàwv&$ò|M÷@h8QíCü=ÍS|òº`+H9wZ:x[.Qa?ÁºsU±OÀÿj@{eq3Vp\Þ ê¾îÂÎèpGÑSj[£ìÞk¨\\t6¤BÙù\\f\\t¦|¶<[±'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #122
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
    //   68: ldc 'ã(ý+Løµá7ñYØÐgVeªû\\b¤³u \\t`3Ömï4'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #12
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
    //   129: putstatic burp/Zgly.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgly.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #106
    //   214: goto -> 244
    //   217: bipush #90
    //   219: goto -> 244
    //   222: bipush #70
    //   224: goto -> 244
    //   227: bipush #102
    //   229: goto -> 244
    //   232: bipush #98
    //   234: goto -> 244
    //   237: bipush #76
    //   239: goto -> 244
    //   242: bipush #45
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #118
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #92
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #121
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #100
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-125
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #117
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #55
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-125
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #47
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-118
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #127
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-38
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #36
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-101
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #72
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-13
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #91
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-72
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-48
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #67
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #71
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-8
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #108
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-40
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #-119
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #110
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #117
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #51
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #109
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #-95
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #-94
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-93
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zgly.ZN : Ljava/lang/Object;
    //   501: sipush #1587
    //   504: sipush #18224
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zgly.Zb : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x631) & 0xFFFF;
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
      char c = 'õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgly.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */