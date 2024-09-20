package burp;

import java.math.BigInteger;

class Zl8i extends ClassLoader {
  static Object ZY;
  
  static String Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZF(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zex.ZO : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zs9k.ZX : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ztpg.Z_ : Ljava/lang/Object;
    //   22: sipush #11211
    //   25: sipush #7360
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zlxs
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
    //   150: sipush #11215
    //   153: sipush #2194
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
    //   192: sipush #11214
    //   195: sipush #2570
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
    //   219: if_icmpge -> 330
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
    //   242: ifeq -> 316
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 316
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   270: if_acmpne -> 316
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   279: athrow
    //   280: aload #6
    //   282: iconst_1
    //   283: invokevirtual setAccessible : (Z)V
    //   286: aload #6
    //   288: aconst_null
    //   289: iconst_2
    //   290: anewarray java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: aastore
    //   297: dup
    //   298: iconst_1
    //   299: aload_1
    //   300: aastore
    //   301: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   304: pop
    //   305: iload_2
    //   306: ifeq -> 330
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: iinc #5, 1
    //   319: iload_2
    //   320: ifeq -> 215
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: sipush #11213
    //   333: sipush #22442
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: iconst_1
    //   340: ldc burp/Zx_s
    //   342: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   345: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   348: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   351: astore_3
    //   352: aload_3
    //   353: arraylength
    //   354: istore #4
    //   356: iconst_0
    //   357: istore #5
    //   359: iload #5
    //   361: iload #4
    //   363: if_icmpge -> 500
    //   366: aload_3
    //   367: iload #5
    //   369: aaload
    //   370: astore #6
    //   372: aload #6
    //   374: invokevirtual getModifiers : ()I
    //   377: invokestatic isStatic : (I)Z
    //   380: ifne -> 390
    //   383: goto -> 493
    //   386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   389: athrow
    //   390: aload #6
    //   392: invokevirtual getType : ()Ljava/lang/Class;
    //   395: astore #7
    //   397: aload #7
    //   399: ifnull -> 480
    //   402: aload #7
    //   404: invokevirtual isPrimitive : ()Z
    //   407: ifne -> 480
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   416: athrow
    //   417: aload #7
    //   419: invokevirtual getPackage : ()Ljava/lang/Package;
    //   422: ifnull -> 480
    //   425: goto -> 432
    //   428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   431: athrow
    //   432: aload #7
    //   434: invokevirtual getPackage : ()Ljava/lang/Package;
    //   437: invokevirtual getName : ()Ljava/lang/String;
    //   440: ifnull -> 480
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   449: athrow
    //   450: aload #7
    //   452: invokevirtual getPackage : ()Ljava/lang/Package;
    //   455: invokevirtual getName : ()Ljava/lang/String;
    //   458: sipush #11206
    //   461: sipush #-23323
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   470: ifne -> 480
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   479: athrow
    //   480: aload #6
    //   482: iconst_1
    //   483: invokevirtual setAccessible : (Z)V
    //   486: aload #6
    //   488: aconst_null
    //   489: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   492: pop
    //   493: iinc #5, 1
    //   496: iload_2
    //   497: ifeq -> 359
    //   500: sipush #11210
    //   503: sipush #6570
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   512: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   515: astore_3
    //   516: aload_3
    //   517: arraylength
    //   518: istore #4
    //   520: iconst_0
    //   521: istore #5
    //   523: iload #5
    //   525: iload #4
    //   527: if_icmpge -> 659
    //   530: aload_3
    //   531: iload #5
    //   533: aaload
    //   534: astore #6
    //   536: aload #6
    //   538: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   541: pop
    //   542: aload #6
    //   544: invokevirtual getModifiers : ()I
    //   547: invokestatic isStatic : (I)Z
    //   550: ifeq -> 645
    //   553: aload #6
    //   555: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   558: arraylength
    //   559: iconst_2
    //   560: if_icmpne -> 645
    //   563: goto -> 570
    //   566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   569: athrow
    //   570: aload #6
    //   572: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   575: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   578: invokevirtual equals : (Ljava/lang/Object;)Z
    //   581: ifeq -> 645
    //   584: goto -> 591
    //   587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   590: athrow
    //   591: aload #6
    //   593: iconst_1
    //   594: invokevirtual setAccessible : (Z)V
    //   597: aload #6
    //   599: aconst_null
    //   600: iconst_2
    //   601: anewarray java/lang/Object
    //   604: dup
    //   605: iconst_0
    //   606: aload_0
    //   607: aastore
    //   608: dup
    //   609: iconst_1
    //   610: aload_1
    //   611: ifnonnull -> 629
    //   614: goto -> 621
    //   617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   620: athrow
    //   621: aload_1
    //   622: goto -> 636
    //   625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   628: athrow
    //   629: aload_1
    //   630: checkcast [B
    //   633: invokevirtual clone : ()Ljava/lang/Object;
    //   636: aastore
    //   637: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   640: pop
    //   641: iload_2
    //   642: ifeq -> 659
    //   645: iinc #5, 1
    //   648: iload_2
    //   649: ifeq -> 523
    //   652: goto -> 659
    //   655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   658: athrow
    //   659: iconst_0
    //   660: istore_3
    //   661: sipush #11207
    //   664: sipush #10572
    //   667: invokestatic a : (II)Ljava/lang/String;
    //   670: iconst_1
    //   671: ldc burp/Zmly
    //   673: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   676: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   679: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   682: astore #4
    //   684: aload #4
    //   686: arraylength
    //   687: istore #5
    //   689: iconst_0
    //   690: istore #6
    //   692: iload #6
    //   694: iload #5
    //   696: if_icmpge -> 834
    //   699: aload #4
    //   701: iload #6
    //   703: aaload
    //   704: astore #7
    //   706: aload #7
    //   708: invokevirtual getModifiers : ()I
    //   711: invokestatic isStatic : (I)Z
    //   714: ifne -> 724
    //   717: goto -> 827
    //   720: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   723: athrow
    //   724: aload #7
    //   726: invokevirtual getType : ()Ljava/lang/Class;
    //   729: astore #8
    //   731: aload #8
    //   733: ifnull -> 814
    //   736: aload #8
    //   738: invokevirtual isPrimitive : ()Z
    //   741: ifne -> 814
    //   744: goto -> 751
    //   747: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   750: athrow
    //   751: aload #8
    //   753: invokevirtual getPackage : ()Ljava/lang/Package;
    //   756: ifnull -> 814
    //   759: goto -> 766
    //   762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   765: athrow
    //   766: aload #8
    //   768: invokevirtual getPackage : ()Ljava/lang/Package;
    //   771: invokevirtual getName : ()Ljava/lang/String;
    //   774: ifnull -> 814
    //   777: goto -> 784
    //   780: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   783: athrow
    //   784: aload #8
    //   786: invokevirtual getPackage : ()Ljava/lang/Package;
    //   789: invokevirtual getName : ()Ljava/lang/String;
    //   792: sipush #11206
    //   795: sipush #-23323
    //   798: invokestatic a : (II)Ljava/lang/String;
    //   801: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   804: ifne -> 814
    //   807: goto -> 814
    //   810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   813: athrow
    //   814: aload #7
    //   816: iconst_1
    //   817: invokevirtual setAccessible : (Z)V
    //   820: aload #7
    //   822: aconst_null
    //   823: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   826: pop
    //   827: iinc #6, 1
    //   830: iload_2
    //   831: ifeq -> 692
    //   834: sipush #11204
    //   837: sipush #32266
    //   840: invokestatic a : (II)Ljava/lang/String;
    //   843: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   846: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   849: astore #4
    //   851: aload #4
    //   853: arraylength
    //   854: istore #5
    //   856: iconst_0
    //   857: istore #6
    //   859: iload #6
    //   861: iload #5
    //   863: if_icmpge -> 999
    //   866: aload #4
    //   868: iload #6
    //   870: aaload
    //   871: astore #7
    //   873: aload #7
    //   875: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   878: pop
    //   879: aload #7
    //   881: invokevirtual getModifiers : ()I
    //   884: invokestatic isStatic : (I)Z
    //   887: ifeq -> 985
    //   890: aload #7
    //   892: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   895: arraylength
    //   896: iconst_2
    //   897: if_icmpne -> 985
    //   900: goto -> 907
    //   903: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   906: athrow
    //   907: aload #7
    //   909: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   912: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   915: if_acmpne -> 985
    //   918: goto -> 925
    //   921: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   924: athrow
    //   925: aload #7
    //   927: iconst_1
    //   928: invokevirtual setAccessible : (Z)V
    //   931: aload #7
    //   933: aconst_null
    //   934: iconst_2
    //   935: anewarray java/lang/Object
    //   938: dup
    //   939: iconst_0
    //   940: aload_0
    //   941: aastore
    //   942: dup
    //   943: iconst_1
    //   944: aload_1
    //   945: ifnonnull -> 963
    //   948: goto -> 955
    //   951: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   954: athrow
    //   955: aload_1
    //   956: goto -> 970
    //   959: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   962: athrow
    //   963: aload_1
    //   964: checkcast [B
    //   967: invokevirtual clone : ()Ljava/lang/Object;
    //   970: aastore
    //   971: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   974: checkcast java/lang/Boolean
    //   977: invokevirtual booleanValue : ()Z
    //   980: istore_3
    //   981: iload_2
    //   982: ifeq -> 999
    //   985: iinc #6, 1
    //   988: iload_2
    //   989: ifeq -> 859
    //   992: goto -> 999
    //   995: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   998: athrow
    //   999: iload_3
    //   1000: ireturn
    //   1001: astore_3
    //   1002: new java/lang/Exception
    //   1005: dup
    //   1006: aload_3
    //   1007: invokevirtual getMessage : ()Ljava/lang/String;
    //   1010: invokespecial <init> : (Ljava/lang/String;)V
    //   1013: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1000	1001	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	273	276	java/lang/Throwable
    //   262	309	312	java/lang/Throwable
    //   280	323	326	java/lang/Throwable
    //   372	386	386	java/lang/Throwable
    //   397	410	413	java/lang/Throwable
    //   402	425	428	java/lang/Throwable
    //   417	443	446	java/lang/Throwable
    //   432	473	476	java/lang/Throwable
    //   536	563	566	java/lang/Throwable
    //   553	584	587	java/lang/Throwable
    //   570	614	617	java/lang/Throwable
    //   591	625	625	java/lang/Throwable
    //   636	652	655	java/lang/Throwable
    //   706	720	720	java/lang/Throwable
    //   731	744	747	java/lang/Throwable
    //   736	759	762	java/lang/Throwable
    //   751	777	780	java/lang/Throwable
    //   766	807	810	java/lang/Throwable
    //   873	900	903	java/lang/Throwable
    //   890	918	921	java/lang/Throwable
    //   907	948	951	java/lang/Throwable
    //   925	959	959	java/lang/Throwable
    //   981	992	995	java/lang/Throwable
  }
  
  static void ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZV(Object paramObject) {
    Ztsj.ZU = a(11208, -12996);
    Ztsj.Zc = new BigInteger(a(11205, 10169));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgrf.ZE.charAt(Math.abs(((BigInteger)Zeuz.Zp).intValue() % 32)) <= Zmv9.Zm.charAt(Math.abs(((BigInteger)Zrpm.ZR).intValue() % 32))) {
          try {
            Zl8l.ZO(Class.forName(a(11209, -13324)));
            if (!bool)
              Zlbt.Zy(Class.forName(a(11212, -21056))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlbt.Zy(Class.forName(a(11212, -21056)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '-À:\\b\\t\\nmÞ½È%ÀØ\\tàRZcÙ·Vb\\t(Z[@ùÝX£\\tB¯XæO*\\t2¢ÙD(ÜzB\\tÞNËÚëÃ MúyQA·Éî±ÉÙ´ÆOlSvß*bÆ[?jñ\\t##ûtlGú\\b°MÊcÄ¨á6çø\\nF^ÎìD<2¶?dÃJ·6v'RÒº«b¢UÍÆÛI6¼þ·cµÜ*®¼»¥C|«¦FæC7Ò \\r²'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: iconst_1
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 141
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 22
    //   66: ldc 'h%«r ­2\\n·jõºüüla1°¦]\ç3²2ßBþý@'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #9
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #32
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zl8i.a : [Ljava/lang/String;
    //   130: bipush #13
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zl8i.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #21
    //   214: goto -> 244
    //   217: bipush #101
    //   219: goto -> 244
    //   222: bipush #64
    //   224: goto -> 244
    //   227: bipush #54
    //   229: goto -> 244
    //   232: bipush #40
    //   234: goto -> 244
    //   237: bipush #81
    //   239: goto -> 244
    //   242: bipush #113
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 38, 0 -> 97
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #62
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-75
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #72
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #54
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-45
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #20
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-48
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: iconst_m1
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-90
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-79
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-84
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #23
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #55
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-38
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-104
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #87
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #84
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #110
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #64
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-44
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #11
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #68
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #68
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #97
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #55
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #37
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #102
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #64
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-26
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-67
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #100
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #55
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Zl8i.ZY : Ljava/lang/Object;
    //   500: sipush #11203
    //   503: sipush #10723
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zl8i.Zb : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2BCF) & 0xFFFF;
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
      char c = 'Õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */