package burp;

import java.math.BigInteger;

class Zmtr extends ClassLoader {
  static Object Zv;
  
  static String Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zf(Object paramObject) {
    Zg6z.ZY = a(-556, -23162);
    Zg6z.ZS = new BigInteger(a(-560, -16284));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zbnk.Zg.charAt(Math.abs(((BigInteger)Zkdq.ZG).intValue() % 32)) > Zsbo.Zg.charAt(Math.abs(((BigInteger)Zk8f.ZG).intValue() % 32))) {
          try {
            Zxxo.Zf(Class.forName(a(-554, -14250)));
            if (bool)
              Zzr.Zm(Class.forName(a(-555, 4932))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zzr.Zm(Class.forName(a(-555, 4932)));
    } catch (Throwable throwable) {}
  }
  
  static void ZC(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zc(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zg1l.Zg : Ljava/lang/Object;
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
    //   416: putstatic burp/Znu.Zf : Ljava/lang/Object;
    //   419: sipush #-557
    //   422: getstatic burp/Zku9.Zp : Ljava/lang/Object;
    //   425: checkcast java/math/BigInteger
    //   428: getstatic burp/Zej8.Zu : Ljava/lang/Object;
    //   431: checkcast java/math/BigInteger
    //   434: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   437: putstatic burp/Zld9.ZF : Ljava/lang/Object;
    //   440: sipush #23201
    //   443: invokestatic a : (II)Ljava/lang/String;
    //   446: iconst_1
    //   447: ldc burp/Zeoi
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
    //   565: sipush #-558
    //   568: sipush #10240
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
    //   607: sipush #-559
    //   610: sipush #-1746
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
    //   766: getstatic burp/Zle9.Zm : Ljava/lang/String;
    //   769: getstatic burp/Ztq2.Zj : Ljava/lang/Object;
    //   772: checkcast java/math/BigInteger
    //   775: invokevirtual intValue : ()I
    //   778: bipush #32
    //   780: irem
    //   781: invokestatic abs : (I)I
    //   784: invokevirtual charAt : (I)C
    //   787: getstatic burp/Zgu4.Za : Ljava/lang/String;
    //   790: getstatic burp/Zmpx.ZZ : Ljava/lang/Object;
    //   793: checkcast java/math/BigInteger
    //   796: invokevirtual intValue : ()I
    //   799: bipush #32
    //   801: irem
    //   802: invokestatic abs : (I)I
    //   805: invokevirtual charAt : (I)C
    //   808: if_icmpgt -> 915
    //   811: getstatic burp/Zt1h.Zw : Ljava/lang/String;
    //   814: getstatic burp/Zrkd.ZO : Ljava/lang/Object;
    //   817: checkcast java/math/BigInteger
    //   820: invokevirtual intValue : ()I
    //   823: bipush #32
    //   825: irem
    //   826: invokestatic abs : (I)I
    //   829: invokevirtual charAt : (I)C
    //   832: getstatic burp/Ztl6.Zb : Ljava/lang/String;
    //   835: getstatic burp/Zsdl.Zx : Ljava/lang/Object;
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
    //   863: getstatic burp/Zb9q.Zk : Ljava/lang/String;
    //   866: getstatic burp/Zek4.ZR : Ljava/lang/Object;
    //   869: checkcast java/math/BigInteger
    //   872: invokevirtual intValue : ()I
    //   875: bipush #32
    //   877: irem
    //   878: invokestatic abs : (I)I
    //   881: invokevirtual charAt : (I)C
    //   884: getstatic burp/Zeub.ZT : Ljava/lang/String;
    //   887: getstatic burp/Zmzj.Zm : Ljava/lang/Object;
    //   890: checkcast java/math/BigInteger
    //   893: invokevirtual intValue : ()I
    //   896: bipush #32
    //   898: irem
    //   899: invokestatic abs : (I)I
    //   902: invokevirtual charAt : (I)C
    //   905: if_icmple -> 923
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
    //   191	219	222	java/lang/Throwable
    //   201	236	239	java/lang/Throwable
    //   226	264	267	java/lang/Throwable
    //   243	281	284	java/lang/Throwable
    //   271	309	312	java/lang/Throwable
    //   288	326	329	java/lang/Throwable
    //   316	344	347	java/lang/Throwable
    //   333	358	361	java/lang/Throwable
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
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '³ªhã¢Èé¶eªs/*£Ü#.èúò3êpÓé\\t©Û´A¶9ü\\tîýïTZF O`ÒùCAÓ@Ô|×{MÚ;%³&"$ûóõ±8+ÝZ^ÿMü'OnÕgsd,\\r®Ï^%ÃÃÛÓwÇzÑeVJ"íK]ôPâð{4÷òYÿH½ÁÆåuXäs*× Ôçá|ÂÙ­ù°t\\t«ÑÛõI;ð'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #26
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'y°ß\\tc¥GG¼'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #113
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
    //   128: putstatic burp/Zmtr.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmtr.b : [Ljava/lang/String;
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
    //   212: bipush #31
    //   214: goto -> 244
    //   217: bipush #41
    //   219: goto -> 244
    //   222: bipush #72
    //   224: goto -> 244
    //   227: bipush #24
    //   229: goto -> 244
    //   232: bipush #112
    //   234: goto -> 244
    //   237: bipush #94
    //   239: goto -> 244
    //   242: bipush #120
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #110
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-27
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #99
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #16
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #90
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-125
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #76
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #92
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #91
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-65
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-76
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #117
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #10
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #42
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-111
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #65
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-4
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-87
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #18
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-71
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #94
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #116
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-51
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-8
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-20
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-65
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #13
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-93
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #34
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-87
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #93
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-127
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zmtr.Zv : Ljava/lang/Object;
    //   500: sipush #-553
    //   503: sipush #-30384
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zmtr.Zd : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFDD4) & 0xFFFF;
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
      byte b1 = 110;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmtr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */