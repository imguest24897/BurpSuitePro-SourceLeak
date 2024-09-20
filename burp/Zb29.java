package burp;

import java.math.BigInteger;

class Zb29 extends ClassLoader {
  static String Zf;
  
  static Object ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Z_(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZA(Object paramObject) {
    Zlzo.Zs = a(26341, -11000);
    Zlzo.ZJ = new BigInteger(a(26338, 12611));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zexu.Zp.charAt(Math.abs(((BigInteger)Zkaw.ZB).intValue() % 32)) > Zlg1.ZG.charAt(Math.abs(((BigInteger)Zb_c.ZN).intValue() % 32))) {
          try {
            Zrm4.ZW(Class.forName(a(26342, 18042)));
            if (bool)
              Zsvh.ZT(Class.forName(a(26349, 7120))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zsvh.ZT(Class.forName(a(26349, 7120)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zblj.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztdt.ZN : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zz5d.Zk : Ljava/lang/Object;
    //   22: sipush #26339
    //   25: sipush #14729
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zxn5
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
    //   150: sipush #26343
    //   153: sipush #30284
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
    //   189: ifne -> 51
    //   192: sipush #26348
    //   195: sipush #-21085
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
    //   334: ifne -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifne -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: getstatic burp/Zeu2.ZW : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual intValue : ()I
    //   360: i2l
    //   361: invokestatic currentTimeMillis : ()J
    //   364: ladd
    //   365: getstatic burp/Zezq.Zu : Ljava/lang/Object;
    //   368: checkcast java/math/BigInteger
    //   371: invokevirtual intValue : ()I
    //   374: i2l
    //   375: lcmp
    //   376: ifge -> 708
    //   379: sipush #26336
    //   382: sipush #-23876
    //   385: invokestatic a : (II)Ljava/lang/String;
    //   388: iconst_1
    //   389: ldc burp/Zllw
    //   391: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   394: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   397: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   400: astore_3
    //   401: aload_3
    //   402: arraylength
    //   403: istore #4
    //   405: iconst_0
    //   406: istore #5
    //   408: iload #5
    //   410: iload #4
    //   412: if_icmpge -> 549
    //   415: aload_3
    //   416: iload #5
    //   418: aaload
    //   419: astore #6
    //   421: aload #6
    //   423: invokevirtual getModifiers : ()I
    //   426: invokestatic isStatic : (I)Z
    //   429: ifne -> 439
    //   432: goto -> 542
    //   435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   438: athrow
    //   439: aload #6
    //   441: invokevirtual getType : ()Ljava/lang/Class;
    //   444: astore #7
    //   446: aload #7
    //   448: ifnull -> 529
    //   451: aload #7
    //   453: invokevirtual isPrimitive : ()Z
    //   456: ifne -> 529
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   465: athrow
    //   466: aload #7
    //   468: invokevirtual getPackage : ()Ljava/lang/Package;
    //   471: ifnull -> 529
    //   474: goto -> 481
    //   477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   480: athrow
    //   481: aload #7
    //   483: invokevirtual getPackage : ()Ljava/lang/Package;
    //   486: invokevirtual getName : ()Ljava/lang/String;
    //   489: ifnull -> 529
    //   492: goto -> 499
    //   495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   498: athrow
    //   499: aload #7
    //   501: invokevirtual getPackage : ()Ljava/lang/Package;
    //   504: invokevirtual getName : ()Ljava/lang/String;
    //   507: sipush #26340
    //   510: sipush #-26593
    //   513: invokestatic a : (II)Ljava/lang/String;
    //   516: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   519: ifne -> 529
    //   522: goto -> 529
    //   525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   528: athrow
    //   529: aload #6
    //   531: iconst_1
    //   532: invokevirtual setAccessible : (Z)V
    //   535: aload #6
    //   537: aconst_null
    //   538: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   541: pop
    //   542: iinc #5, 1
    //   545: iload_2
    //   546: ifne -> 408
    //   549: sipush #26350
    //   552: sipush #-24121
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   561: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   564: astore_3
    //   565: aload_3
    //   566: arraylength
    //   567: istore #4
    //   569: iconst_0
    //   570: istore #5
    //   572: iload #5
    //   574: iload #4
    //   576: if_icmpge -> 708
    //   579: aload_3
    //   580: iload #5
    //   582: aaload
    //   583: astore #6
    //   585: aload #6
    //   587: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   590: pop
    //   591: aload #6
    //   593: invokevirtual getModifiers : ()I
    //   596: invokestatic isStatic : (I)Z
    //   599: ifeq -> 694
    //   602: aload #6
    //   604: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   607: arraylength
    //   608: iconst_2
    //   609: if_icmpne -> 694
    //   612: goto -> 619
    //   615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   618: athrow
    //   619: aload #6
    //   621: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   624: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   627: invokevirtual equals : (Ljava/lang/Object;)Z
    //   630: ifeq -> 694
    //   633: goto -> 640
    //   636: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   639: athrow
    //   640: aload #6
    //   642: iconst_1
    //   643: invokevirtual setAccessible : (Z)V
    //   646: aload #6
    //   648: aconst_null
    //   649: iconst_2
    //   650: anewarray java/lang/Object
    //   653: dup
    //   654: iconst_0
    //   655: aload_0
    //   656: aastore
    //   657: dup
    //   658: iconst_1
    //   659: aload_1
    //   660: ifnonnull -> 678
    //   663: goto -> 670
    //   666: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   669: athrow
    //   670: aload_1
    //   671: goto -> 685
    //   674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   677: athrow
    //   678: aload_1
    //   679: checkcast [B
    //   682: invokevirtual clone : ()Ljava/lang/Object;
    //   685: aastore
    //   686: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   689: pop
    //   690: iload_2
    //   691: ifne -> 708
    //   694: iinc #5, 1
    //   697: iload_2
    //   698: ifne -> 572
    //   701: goto -> 708
    //   704: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   707: athrow
    //   708: getstatic burp/Zgkp.ZS : Ljava/lang/String;
    //   711: getstatic burp/Zblj.Zl : Ljava/lang/Object;
    //   714: checkcast java/math/BigInteger
    //   717: invokevirtual intValue : ()I
    //   720: bipush #32
    //   722: irem
    //   723: invokestatic abs : (I)I
    //   726: invokevirtual charAt : (I)C
    //   729: getstatic burp/Zgj5.ZH : Ljava/lang/String;
    //   732: getstatic burp/Zrxm.ZL : Ljava/lang/Object;
    //   735: checkcast java/math/BigInteger
    //   738: invokevirtual intValue : ()I
    //   741: bipush #32
    //   743: irem
    //   744: invokestatic abs : (I)I
    //   747: invokevirtual charAt : (I)C
    //   750: if_icmple -> 865
    //   753: getstatic burp/Zb29.Zf : Ljava/lang/String;
    //   756: getstatic burp/Ztdt.ZN : Ljava/lang/Object;
    //   759: checkcast java/math/BigInteger
    //   762: invokevirtual intValue : ()I
    //   765: bipush #32
    //   767: irem
    //   768: invokestatic abs : (I)I
    //   771: invokevirtual charAt : (I)C
    //   774: getstatic burp/Ztap.Zk : Ljava/lang/String;
    //   777: getstatic burp/Ztod.ZP : Ljava/lang/Object;
    //   780: checkcast java/math/BigInteger
    //   783: invokevirtual intValue : ()I
    //   786: bipush #32
    //   788: irem
    //   789: invokestatic abs : (I)I
    //   792: invokevirtual charAt : (I)C
    //   795: if_icmpgt -> 865
    //   798: goto -> 805
    //   801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   804: athrow
    //   805: getstatic burp/Zttq.ZO : Ljava/lang/String;
    //   808: getstatic burp/Zct.ZW : Ljava/lang/Object;
    //   811: checkcast java/math/BigInteger
    //   814: invokevirtual intValue : ()I
    //   817: bipush #32
    //   819: irem
    //   820: invokestatic abs : (I)I
    //   823: invokevirtual charAt : (I)C
    //   826: getstatic burp/Zrpx.ZM : Ljava/lang/String;
    //   829: getstatic burp/Zmh5.ZN : Ljava/lang/Object;
    //   832: checkcast java/math/BigInteger
    //   835: invokevirtual intValue : ()I
    //   838: bipush #32
    //   840: irem
    //   841: invokestatic abs : (I)I
    //   844: invokevirtual charAt : (I)C
    //   847: if_icmpgt -> 865
    //   850: goto -> 857
    //   853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   856: athrow
    //   857: iconst_1
    //   858: goto -> 866
    //   861: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   864: athrow
    //   865: iconst_0
    //   866: ireturn
    //   867: astore_3
    //   868: new java/lang/Exception
    //   871: dup
    //   872: aload_3
    //   873: invokevirtual getMessage : ()Ljava/lang/String;
    //   876: invokespecial <init> : (Ljava/lang/String;)V
    //   879: athrow
    // Exception table:
    //   from	to	target	type
    //   4	866	867	java/lang/Throwable
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
    //   421	435	435	java/lang/Throwable
    //   446	459	462	java/lang/Throwable
    //   451	474	477	java/lang/Throwable
    //   466	492	495	java/lang/Throwable
    //   481	522	525	java/lang/Throwable
    //   585	612	615	java/lang/Throwable
    //   602	633	636	java/lang/Throwable
    //   619	663	666	java/lang/Throwable
    //   640	674	674	java/lang/Throwable
    //   685	701	704	java/lang/Throwable
    //   708	798	801	java/lang/Throwable
    //   753	850	853	java/lang/Throwable
    //   805	861	861	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ú²WaÙWýk\\tÏ:ã¦uÎsÚ?¯Ê>NÿG)ÇÆ\\tÆ%Y>y|ÂMuRåÄO£Þ²KÙ@{ÐïÌÚ6âÿIzÐáx}=íÌ@ÁÛý\;YüðN²P"'ôéäªÆö«ÞÆe¡NíD_ð\\r\\ni\\t¶\\rÏ\0\\tðÅÝÖ`#àMñáø¦/®q1zÉ#dýþ¬Q?sóäõ¢JÚ¬4ïYIª^VæÓ'Îè¬óß¨ä³/§j¨¾[nMÿìdûë£øÁ½\\tc+R\'Ì\\tËÞ¢åmÑýÃS'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #30
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
    //   68: ldc 'ãù:¤âñÜi±@÷GRÆnörð>fùí\\n:®\\tÐ«ö&ÙáóH'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #21
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
    //   129: putstatic burp/Zb29.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb29.b : [Ljava/lang/String;
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
    //   212: bipush #35
    //   214: goto -> 244
    //   217: bipush #43
    //   219: goto -> 244
    //   222: bipush #62
    //   224: goto -> 244
    //   227: bipush #45
    //   229: goto -> 244
    //   232: bipush #49
    //   234: goto -> 244
    //   237: bipush #49
    //   239: goto -> 244
    //   242: bipush #37
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
    //   300: sipush #26351
    //   303: sipush #-17545
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zb29.Zf : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #26337
    //   319: sipush #-31863
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zb29.ZM : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x66E5) & 0xFFFF;
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
      byte b1 = 59;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb29.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */