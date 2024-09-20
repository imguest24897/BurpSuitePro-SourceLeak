package burp;

import java.math.BigInteger;

class Zgcg extends ClassLoader {
  static Object Zi;
  
  static String Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZJ(Object paramObject) {
    Zrm6.ZV = a(-13926, -18264);
    Zrm6.Z_ = new BigInteger(a(-13921, -28398));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zxxo.ZH.charAt(Math.abs(((BigInteger)Zz4m.Zo).intValue() % 32)) > Zz4a.ZC.charAt(Math.abs(((BigInteger)Zr60.Ze).intValue() % 32))) {
          try {
            Zr3q.ZA(Class.forName(a(-13924, 35)));
            if (bool)
              Zrt3.ZX(Class.forName(a(-13927, 25161))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrt3.ZX(Class.forName(a(-13927, 25161)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ztq2.Zj : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zgis.ZV : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zs1k.Ze : Ljava/lang/Object;
    //   22: getstatic burp/Zx5w.Zo : Ljava/lang/Object;
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
    //   434: putstatic burp/Zk9q.ZH : Ljava/lang/Object;
    //   437: sipush #-13936
    //   440: getstatic burp/Zrwp.Zk : Ljava/lang/Object;
    //   443: checkcast java/math/BigInteger
    //   446: getstatic burp/Zm7v.ZP : Ljava/lang/Object;
    //   449: checkcast java/math/BigInteger
    //   452: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   455: putstatic burp/Zzah.Za : Ljava/lang/Object;
    //   458: sipush #7721
    //   461: invokestatic a : (II)Ljava/lang/String;
    //   464: iconst_1
    //   465: ldc burp/Zrpx
    //   467: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   470: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   473: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   476: astore_3
    //   477: aload_3
    //   478: arraylength
    //   479: istore #4
    //   481: iconst_0
    //   482: istore #5
    //   484: iload #5
    //   486: iload #4
    //   488: if_icmpge -> 625
    //   491: aload_3
    //   492: iload #5
    //   494: aaload
    //   495: astore #6
    //   497: aload #6
    //   499: invokevirtual getModifiers : ()I
    //   502: invokestatic isStatic : (I)Z
    //   505: ifne -> 515
    //   508: goto -> 618
    //   511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   514: athrow
    //   515: aload #6
    //   517: invokevirtual getType : ()Ljava/lang/Class;
    //   520: astore #7
    //   522: aload #7
    //   524: ifnull -> 605
    //   527: aload #7
    //   529: invokevirtual isPrimitive : ()Z
    //   532: ifne -> 605
    //   535: goto -> 542
    //   538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   541: athrow
    //   542: aload #7
    //   544: invokevirtual getPackage : ()Ljava/lang/Package;
    //   547: ifnull -> 605
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   556: athrow
    //   557: aload #7
    //   559: invokevirtual getPackage : ()Ljava/lang/Package;
    //   562: invokevirtual getName : ()Ljava/lang/String;
    //   565: ifnull -> 605
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   574: athrow
    //   575: aload #7
    //   577: invokevirtual getPackage : ()Ljava/lang/Package;
    //   580: invokevirtual getName : ()Ljava/lang/String;
    //   583: sipush #-13922
    //   586: sipush #-27753
    //   589: invokestatic a : (II)Ljava/lang/String;
    //   592: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   595: ifne -> 605
    //   598: goto -> 605
    //   601: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   604: athrow
    //   605: aload #6
    //   607: iconst_1
    //   608: invokevirtual setAccessible : (Z)V
    //   611: aload #6
    //   613: aconst_null
    //   614: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   617: pop
    //   618: iinc #5, 1
    //   621: iload_2
    //   622: ifne -> 484
    //   625: sipush #-13928
    //   628: sipush #-29348
    //   631: invokestatic a : (II)Ljava/lang/String;
    //   634: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   637: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   640: astore_3
    //   641: aload_3
    //   642: arraylength
    //   643: istore #4
    //   645: iconst_0
    //   646: istore #5
    //   648: iload #5
    //   650: iload #4
    //   652: if_icmpge -> 784
    //   655: aload_3
    //   656: iload #5
    //   658: aaload
    //   659: astore #6
    //   661: aload #6
    //   663: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   666: pop
    //   667: aload #6
    //   669: invokevirtual getModifiers : ()I
    //   672: invokestatic isStatic : (I)Z
    //   675: ifeq -> 770
    //   678: aload #6
    //   680: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   683: arraylength
    //   684: iconst_2
    //   685: if_icmpne -> 770
    //   688: goto -> 695
    //   691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   694: athrow
    //   695: aload #6
    //   697: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   700: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   703: invokevirtual equals : (Ljava/lang/Object;)Z
    //   706: ifeq -> 770
    //   709: goto -> 716
    //   712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   715: athrow
    //   716: aload #6
    //   718: iconst_1
    //   719: invokevirtual setAccessible : (Z)V
    //   722: aload #6
    //   724: aconst_null
    //   725: iconst_2
    //   726: anewarray java/lang/Object
    //   729: dup
    //   730: iconst_0
    //   731: aload_0
    //   732: aastore
    //   733: dup
    //   734: iconst_1
    //   735: aload_1
    //   736: ifnonnull -> 754
    //   739: goto -> 746
    //   742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   745: athrow
    //   746: aload_1
    //   747: goto -> 761
    //   750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   753: athrow
    //   754: aload_1
    //   755: checkcast [B
    //   758: invokevirtual clone : ()Ljava/lang/Object;
    //   761: aastore
    //   762: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   765: pop
    //   766: iload_2
    //   767: ifne -> 784
    //   770: iinc #5, 1
    //   773: iload_2
    //   774: ifne -> 648
    //   777: goto -> 784
    //   780: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   783: athrow
    //   784: getstatic burp/Zs5y.ZO : Ljava/lang/String;
    //   787: getstatic burp/Znu.Zf : Ljava/lang/Object;
    //   790: checkcast java/math/BigInteger
    //   793: invokevirtual intValue : ()I
    //   796: bipush #32
    //   798: irem
    //   799: invokestatic abs : (I)I
    //   802: invokevirtual charAt : (I)C
    //   805: getstatic burp/Zmll.Zu : Ljava/lang/String;
    //   808: getstatic burp/Zku9.Zp : Ljava/lang/Object;
    //   811: checkcast java/math/BigInteger
    //   814: invokevirtual intValue : ()I
    //   817: bipush #32
    //   819: irem
    //   820: invokestatic abs : (I)I
    //   823: invokevirtual charAt : (I)C
    //   826: if_icmple -> 933
    //   829: getstatic burp/Zegw.Zn : Ljava/lang/String;
    //   832: getstatic burp/Zmig.Zh : Ljava/lang/Object;
    //   835: checkcast java/math/BigInteger
    //   838: invokevirtual intValue : ()I
    //   841: bipush #32
    //   843: irem
    //   844: invokestatic abs : (I)I
    //   847: invokevirtual charAt : (I)C
    //   850: getstatic burp/Zxzv.ZI : Ljava/lang/String;
    //   853: getstatic burp/Ztr5.ZZ : Ljava/lang/Object;
    //   856: checkcast java/math/BigInteger
    //   859: invokevirtual intValue : ()I
    //   862: bipush #32
    //   864: irem
    //   865: invokestatic abs : (I)I
    //   868: invokevirtual charAt : (I)C
    //   871: if_icmpgt -> 933
    //   874: goto -> 881
    //   877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   880: athrow
    //   881: getstatic burp/Zrd3.Z_ : Ljava/lang/String;
    //   884: getstatic burp/Zkdq.ZG : Ljava/lang/Object;
    //   887: checkcast java/math/BigInteger
    //   890: invokevirtual intValue : ()I
    //   893: bipush #32
    //   895: irem
    //   896: invokestatic abs : (I)I
    //   899: invokevirtual charAt : (I)C
    //   902: getstatic burp/Zz4m.ZI : Ljava/lang/String;
    //   905: getstatic burp/Zbx4.Zw : Ljava/lang/Object;
    //   908: checkcast java/math/BigInteger
    //   911: invokevirtual intValue : ()I
    //   914: bipush #32
    //   916: irem
    //   917: invokestatic abs : (I)I
    //   920: invokevirtual charAt : (I)C
    //   923: if_icmple -> 941
    //   926: goto -> 933
    //   929: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   932: athrow
    //   933: iconst_1
    //   934: goto -> 942
    //   937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   940: athrow
    //   941: iconst_0
    //   942: ireturn
    //   943: astore_3
    //   944: new java/lang/Exception
    //   947: dup
    //   948: aload_3
    //   949: invokevirtual getMessage : ()Ljava/lang/String;
    //   952: invokespecial <init> : (Ljava/lang/String;)V
    //   955: athrow
    // Exception table:
    //   from	to	target	type
    //   4	942	943	java/lang/Throwable
    //   209	237	240	java/lang/Throwable
    //   219	254	257	java/lang/Throwable
    //   244	282	285	java/lang/Throwable
    //   261	299	302	java/lang/Throwable
    //   289	327	330	java/lang/Throwable
    //   306	344	347	java/lang/Throwable
    //   334	362	365	java/lang/Throwable
    //   351	376	379	java/lang/Throwable
    //   497	511	511	java/lang/Throwable
    //   522	535	538	java/lang/Throwable
    //   527	550	553	java/lang/Throwable
    //   542	568	571	java/lang/Throwable
    //   557	598	601	java/lang/Throwable
    //   661	688	691	java/lang/Throwable
    //   678	709	712	java/lang/Throwable
    //   695	739	742	java/lang/Throwable
    //   716	750	750	java/lang/Throwable
    //   761	777	780	java/lang/Throwable
    //   784	874	877	java/lang/Throwable
    //   829	926	929	java/lang/Throwable
    //   881	937	937	java/lang/Throwable
  }
  
  static void ZP(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '.zXåÙw\\tøÔr3ÓÌ¯;M ²U\\tiÑs\ ÀxMû¿\\fÙÚþ¥vû©¿á'î^MÝ£\\fÑ?ÏÿãyÕµy_ÑÄ ¼ÛCwlGð,ÌmP±©]%ìr àåY÷Ç Úáè^äÍYÝë:´<=b»-éè¹»â3y«Z\\t9SJÃÔÒMæO èa×ôÈNIò=ÚØÚìøÝk£u¬Aõ¨^ä{2ï'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #93
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
    //   68: ldc '<úFÜ@dbF}ºÖ"¤ECUö(>Q¬:À({vÒVmªèá¢ðOäÂ oêõdwx¯®?K_:ï¨Ma1\\f\\tÁl )Îe¬'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #14
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
    //   129: putstatic burp/Zgcg.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgcg.b : [Ljava/lang/String;
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
    //   212: bipush #119
    //   214: goto -> 244
    //   217: bipush #53
    //   219: goto -> 244
    //   222: bipush #41
    //   224: goto -> 244
    //   227: bipush #82
    //   229: goto -> 244
    //   232: bipush #92
    //   234: goto -> 244
    //   237: bipush #50
    //   239: goto -> 244
    //   242: bipush #38
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
    //   304: sipush #-13925
    //   307: sipush #10734
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zgcg.Zi : Ljava/lang/Object;
    //   319: sipush #-13923
    //   322: sipush #10731
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zgcg.Zk : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC998) & 0xFFFF;
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
      char c = 'â';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgcg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */