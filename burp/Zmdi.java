package burp;

import java.math.BigInteger;

class Zmdi extends ClassLoader {
  static String ZA;
  
  static Object Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZR(Object paramObject) {
    Zlxr.ZS = a(4774, 9896);
    Zlxr.Zz = new BigInteger(a(4770, 1093));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zg7e.Zg.charAt(Math.abs(((BigInteger)Zxxo.ZJ).intValue() % 32)) <= Zrfs.ZD.charAt(Math.abs(((BigInteger)Zrfa.Zj).intValue() % 32))) {
          try {
            Zkf9.ZF(Class.forName(a(4782, 15407)));
            if (bool)
              Zrn4.ZM(Class.forName(a(4798, 10933))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrn4.ZM(Class.forName(a(4798, 10933)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zzmc.Zg : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zrjq.ZU : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zsn4.ZQ : Ljava/lang/Object;
    //   22: sipush #4780
    //   25: sipush #-2428
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zrp3
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
    //   150: sipush #4771
    //   153: sipush #-13849
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
    //   192: sipush #4791
    //   195: sipush #6782
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
    //   351: new java/io/ByteArrayOutputStream
    //   354: dup
    //   355: invokespecial <init> : ()V
    //   358: astore_3
    //   359: sipush #4769
    //   362: aload_3
    //   363: sipush #202
    //   366: invokevirtual write : (I)V
    //   369: sipush #-22331
    //   372: aload_3
    //   373: sipush #254
    //   376: invokevirtual write : (I)V
    //   379: aload_3
    //   380: sipush #186
    //   383: invokevirtual write : (I)V
    //   386: aload_3
    //   387: sipush #190
    //   390: invokevirtual write : (I)V
    //   393: aload_3
    //   394: iconst_0
    //   395: invokevirtual write : (I)V
    //   398: aload_3
    //   399: iconst_1
    //   400: invokevirtual write : (I)V
    //   403: aload_3
    //   404: iconst_0
    //   405: invokevirtual write : (I)V
    //   408: aload_3
    //   409: bipush #50
    //   411: invokevirtual write : (I)V
    //   414: aload_3
    //   415: getstatic burp/Zelz.Z_ : Ljava/lang/Object;
    //   418: checkcast java/math/BigInteger
    //   421: invokevirtual toByteArray : ()[B
    //   424: invokevirtual write : ([B)V
    //   427: aload_3
    //   428: getstatic burp/Zec_.ZN : Ljava/lang/Object;
    //   431: checkcast java/math/BigInteger
    //   434: invokevirtual toByteArray : ()[B
    //   437: invokevirtual write : ([B)V
    //   440: aload_3
    //   441: getstatic burp/Zsin.Za : Ljava/lang/Object;
    //   444: checkcast java/math/BigInteger
    //   447: invokevirtual toByteArray : ()[B
    //   450: invokevirtual write : ([B)V
    //   453: aload_3
    //   454: invokevirtual toByteArray : ()[B
    //   457: astore #4
    //   459: aconst_null
    //   460: astore #5
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   468: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   471: astore #6
    //   473: aload #6
    //   475: arraylength
    //   476: istore #7
    //   478: iconst_0
    //   479: istore #8
    //   481: iload #8
    //   483: iload #7
    //   485: if_icmpge -> 613
    //   488: aload #6
    //   490: iload #8
    //   492: aaload
    //   493: astore #9
    //   495: aload #9
    //   497: invokevirtual getName : ()Ljava/lang/String;
    //   500: sipush #4778
    //   503: sipush #-13943
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: invokevirtual equals : (Ljava/lang/Object;)Z
    //   512: ifeq -> 606
    //   515: aload #9
    //   517: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   520: astore #10
    //   522: aload #10
    //   524: arraylength
    //   525: iconst_4
    //   526: if_icmpeq -> 536
    //   529: goto -> 606
    //   532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   535: athrow
    //   536: aload #10
    //   538: iconst_0
    //   539: aaload
    //   540: ldc java/lang/String
    //   542: if_acmpeq -> 552
    //   545: goto -> 606
    //   548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   551: athrow
    //   552: aload #10
    //   554: iconst_1
    //   555: aaload
    //   556: ldc [B
    //   558: if_acmpeq -> 568
    //   561: goto -> 606
    //   564: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   567: athrow
    //   568: aload #10
    //   570: iconst_2
    //   571: aaload
    //   572: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   575: if_acmpeq -> 585
    //   578: goto -> 606
    //   581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   584: athrow
    //   585: aload #10
    //   587: iconst_3
    //   588: aaload
    //   589: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   592: if_acmpeq -> 602
    //   595: goto -> 606
    //   598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   601: athrow
    //   602: aload #9
    //   604: astore #5
    //   606: iinc #8, 1
    //   609: iload_2
    //   610: ifne -> 481
    //   613: aload #5
    //   615: iconst_1
    //   616: invokevirtual setAccessible : (Z)V
    //   619: ldc burp/Zms1
    //   621: iconst_0
    //   622: anewarray java/lang/Class
    //   625: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   628: astore #6
    //   630: aload #6
    //   632: iconst_1
    //   633: invokevirtual setAccessible : (Z)V
    //   636: aload #5
    //   638: aload #6
    //   640: iconst_0
    //   641: anewarray java/lang/Object
    //   644: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   647: iconst_4
    //   648: anewarray java/lang/Object
    //   651: dup
    //   652: iconst_0
    //   653: sipush #4797
    //   656: sipush #-15682
    //   659: invokestatic a : (II)Ljava/lang/String;
    //   662: aastore
    //   663: dup
    //   664: iconst_1
    //   665: aload #4
    //   667: aastore
    //   668: dup
    //   669: iconst_2
    //   670: iconst_0
    //   671: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   674: aastore
    //   675: dup
    //   676: iconst_3
    //   677: aload #4
    //   679: arraylength
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: aastore
    //   684: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   687: pop
    //   688: goto -> 692
    //   691: astore_3
    //   692: iconst_0
    //   693: istore_3
    //   694: getstatic burp/Zex0.Zk : Ljava/lang/String;
    //   697: getstatic burp/Zskf.ZQ : Ljava/lang/Object;
    //   700: checkcast java/math/BigInteger
    //   703: invokevirtual intValue : ()I
    //   706: bipush #32
    //   708: irem
    //   709: invokestatic abs : (I)I
    //   712: invokevirtual charAt : (I)C
    //   715: getstatic burp/Zs5y.ZO : Ljava/lang/String;
    //   718: getstatic burp/Zg61.Zp : Ljava/lang/Object;
    //   721: checkcast java/math/BigInteger
    //   724: invokevirtual intValue : ()I
    //   727: bipush #32
    //   729: irem
    //   730: invokestatic abs : (I)I
    //   733: invokevirtual charAt : (I)C
    //   736: if_icmple -> 1081
    //   739: sipush #4787
    //   742: sipush #11141
    //   745: invokestatic a : (II)Ljava/lang/String;
    //   748: iconst_1
    //   749: ldc burp/Zbzj
    //   751: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   754: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   757: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   760: astore #4
    //   762: aload #4
    //   764: arraylength
    //   765: istore #5
    //   767: iconst_0
    //   768: istore #6
    //   770: iload #6
    //   772: iload #5
    //   774: if_icmpge -> 912
    //   777: aload #4
    //   779: iload #6
    //   781: aaload
    //   782: astore #7
    //   784: aload #7
    //   786: invokevirtual getModifiers : ()I
    //   789: invokestatic isStatic : (I)Z
    //   792: ifne -> 802
    //   795: goto -> 905
    //   798: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   801: athrow
    //   802: aload #7
    //   804: invokevirtual getType : ()Ljava/lang/Class;
    //   807: astore #8
    //   809: aload #8
    //   811: ifnull -> 892
    //   814: aload #8
    //   816: invokevirtual isPrimitive : ()Z
    //   819: ifne -> 892
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   828: athrow
    //   829: aload #8
    //   831: invokevirtual getPackage : ()Ljava/lang/Package;
    //   834: ifnull -> 892
    //   837: goto -> 844
    //   840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   843: athrow
    //   844: aload #8
    //   846: invokevirtual getPackage : ()Ljava/lang/Package;
    //   849: invokevirtual getName : ()Ljava/lang/String;
    //   852: ifnull -> 892
    //   855: goto -> 862
    //   858: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   861: athrow
    //   862: aload #8
    //   864: invokevirtual getPackage : ()Ljava/lang/Package;
    //   867: invokevirtual getName : ()Ljava/lang/String;
    //   870: sipush #4796
    //   873: sipush #17874
    //   876: invokestatic a : (II)Ljava/lang/String;
    //   879: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   882: ifne -> 892
    //   885: goto -> 892
    //   888: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   891: athrow
    //   892: aload #7
    //   894: iconst_1
    //   895: invokevirtual setAccessible : (Z)V
    //   898: aload #7
    //   900: aconst_null
    //   901: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   904: pop
    //   905: iinc #6, 1
    //   908: iload_2
    //   909: ifne -> 770
    //   912: sipush #4768
    //   915: sipush #-9733
    //   918: invokestatic a : (II)Ljava/lang/String;
    //   921: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   924: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   927: astore #4
    //   929: aload #4
    //   931: arraylength
    //   932: istore #5
    //   934: iconst_0
    //   935: istore #6
    //   937: iload #6
    //   939: iload #5
    //   941: if_icmpge -> 1077
    //   944: aload #4
    //   946: iload #6
    //   948: aaload
    //   949: astore #7
    //   951: aload #7
    //   953: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   956: pop
    //   957: aload #7
    //   959: invokevirtual getModifiers : ()I
    //   962: invokestatic isStatic : (I)Z
    //   965: ifeq -> 1063
    //   968: aload #7
    //   970: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   973: arraylength
    //   974: iconst_2
    //   975: if_icmpne -> 1063
    //   978: goto -> 985
    //   981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   984: athrow
    //   985: aload #7
    //   987: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   990: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   993: if_acmpne -> 1063
    //   996: goto -> 1003
    //   999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1002: athrow
    //   1003: aload #7
    //   1005: iconst_1
    //   1006: invokevirtual setAccessible : (Z)V
    //   1009: aload #7
    //   1011: aconst_null
    //   1012: iconst_2
    //   1013: anewarray java/lang/Object
    //   1016: dup
    //   1017: iconst_0
    //   1018: aload_0
    //   1019: aastore
    //   1020: dup
    //   1021: iconst_1
    //   1022: aload_1
    //   1023: ifnonnull -> 1041
    //   1026: goto -> 1033
    //   1029: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1032: athrow
    //   1033: aload_1
    //   1034: goto -> 1048
    //   1037: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1040: athrow
    //   1041: aload_1
    //   1042: checkcast [B
    //   1045: invokevirtual clone : ()Ljava/lang/Object;
    //   1048: aastore
    //   1049: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1052: checkcast java/lang/Boolean
    //   1055: invokevirtual booleanValue : ()Z
    //   1058: istore_3
    //   1059: iload_2
    //   1060: ifne -> 1077
    //   1063: iinc #6, 1
    //   1066: iload_2
    //   1067: ifne -> 937
    //   1070: goto -> 1077
    //   1073: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1076: athrow
    //   1077: iload_2
    //   1078: ifne -> 1419
    //   1081: sipush #4784
    //   1084: sipush #12640
    //   1087: invokestatic a : (II)Ljava/lang/String;
    //   1090: iconst_1
    //   1091: ldc burp/Zgta
    //   1093: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1096: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1099: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1102: astore #4
    //   1104: aload #4
    //   1106: arraylength
    //   1107: istore #5
    //   1109: iconst_0
    //   1110: istore #6
    //   1112: iload #6
    //   1114: iload #5
    //   1116: if_icmpge -> 1254
    //   1119: aload #4
    //   1121: iload #6
    //   1123: aaload
    //   1124: astore #7
    //   1126: aload #7
    //   1128: invokevirtual getModifiers : ()I
    //   1131: invokestatic isStatic : (I)Z
    //   1134: ifne -> 1144
    //   1137: goto -> 1247
    //   1140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1143: athrow
    //   1144: aload #7
    //   1146: invokevirtual getType : ()Ljava/lang/Class;
    //   1149: astore #8
    //   1151: aload #8
    //   1153: ifnull -> 1234
    //   1156: aload #8
    //   1158: invokevirtual isPrimitive : ()Z
    //   1161: ifne -> 1234
    //   1164: goto -> 1171
    //   1167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1170: athrow
    //   1171: aload #8
    //   1173: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1176: ifnull -> 1234
    //   1179: goto -> 1186
    //   1182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1185: athrow
    //   1186: aload #8
    //   1188: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1191: invokevirtual getName : ()Ljava/lang/String;
    //   1194: ifnull -> 1234
    //   1197: goto -> 1204
    //   1200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1203: athrow
    //   1204: aload #8
    //   1206: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1209: invokevirtual getName : ()Ljava/lang/String;
    //   1212: sipush #4796
    //   1215: sipush #17874
    //   1218: invokestatic a : (II)Ljava/lang/String;
    //   1221: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1224: ifne -> 1234
    //   1227: goto -> 1234
    //   1230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1233: athrow
    //   1234: aload #7
    //   1236: iconst_1
    //   1237: invokevirtual setAccessible : (Z)V
    //   1240: aload #7
    //   1242: aconst_null
    //   1243: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1246: pop
    //   1247: iinc #6, 1
    //   1250: iload_2
    //   1251: ifne -> 1112
    //   1254: sipush #4783
    //   1257: sipush #30335
    //   1260: invokestatic a : (II)Ljava/lang/String;
    //   1263: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1266: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1269: astore #4
    //   1271: aload #4
    //   1273: arraylength
    //   1274: istore #5
    //   1276: iconst_0
    //   1277: istore #6
    //   1279: iload #6
    //   1281: iload #5
    //   1283: if_icmpge -> 1419
    //   1286: aload #4
    //   1288: iload #6
    //   1290: aaload
    //   1291: astore #7
    //   1293: aload #7
    //   1295: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1298: pop
    //   1299: aload #7
    //   1301: invokevirtual getModifiers : ()I
    //   1304: invokestatic isStatic : (I)Z
    //   1307: ifeq -> 1405
    //   1310: aload #7
    //   1312: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1315: arraylength
    //   1316: iconst_2
    //   1317: if_icmpne -> 1405
    //   1320: goto -> 1327
    //   1323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1326: athrow
    //   1327: aload #7
    //   1329: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1332: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1335: if_acmpne -> 1405
    //   1338: goto -> 1345
    //   1341: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1344: athrow
    //   1345: aload #7
    //   1347: iconst_1
    //   1348: invokevirtual setAccessible : (Z)V
    //   1351: aload #7
    //   1353: aconst_null
    //   1354: iconst_2
    //   1355: anewarray java/lang/Object
    //   1358: dup
    //   1359: iconst_0
    //   1360: aload_0
    //   1361: aastore
    //   1362: dup
    //   1363: iconst_1
    //   1364: aload_1
    //   1365: ifnonnull -> 1383
    //   1368: goto -> 1375
    //   1371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1374: athrow
    //   1375: aload_1
    //   1376: goto -> 1390
    //   1379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1382: athrow
    //   1383: aload_1
    //   1384: checkcast [B
    //   1387: invokevirtual clone : ()Ljava/lang/Object;
    //   1390: aastore
    //   1391: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1394: checkcast java/lang/Boolean
    //   1397: invokevirtual booleanValue : ()Z
    //   1400: istore_3
    //   1401: iload_2
    //   1402: ifne -> 1419
    //   1405: iinc #6, 1
    //   1408: iload_2
    //   1409: ifne -> 1279
    //   1412: goto -> 1419
    //   1415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1418: athrow
    //   1419: iload_3
    //   1420: ifeq -> 1425
    //   1423: iload_3
    //   1424: ireturn
    //   1425: getstatic burp/Zql.Zf : Ljava/lang/String;
    //   1428: getstatic burp/Zgcg.Zi : Ljava/lang/Object;
    //   1431: checkcast java/math/BigInteger
    //   1434: invokevirtual intValue : ()I
    //   1437: bipush #32
    //   1439: irem
    //   1440: invokestatic abs : (I)I
    //   1443: invokevirtual charAt : (I)C
    //   1446: getstatic burp/Zrzg.ZX : Ljava/lang/String;
    //   1449: getstatic burp/Zzi_.Zf : Ljava/lang/Object;
    //   1452: checkcast java/math/BigInteger
    //   1455: invokevirtual intValue : ()I
    //   1458: bipush #32
    //   1460: irem
    //   1461: invokestatic abs : (I)I
    //   1464: invokevirtual charAt : (I)C
    //   1467: if_icmpgt -> 1812
    //   1470: sipush #4779
    //   1473: sipush #15641
    //   1476: invokestatic a : (II)Ljava/lang/String;
    //   1479: iconst_1
    //   1480: ldc burp/Zzr
    //   1482: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1485: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1488: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1491: astore #4
    //   1493: aload #4
    //   1495: arraylength
    //   1496: istore #5
    //   1498: iconst_0
    //   1499: istore #6
    //   1501: iload #6
    //   1503: iload #5
    //   1505: if_icmpge -> 1643
    //   1508: aload #4
    //   1510: iload #6
    //   1512: aaload
    //   1513: astore #7
    //   1515: aload #7
    //   1517: invokevirtual getModifiers : ()I
    //   1520: invokestatic isStatic : (I)Z
    //   1523: ifne -> 1533
    //   1526: goto -> 1636
    //   1529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1532: athrow
    //   1533: aload #7
    //   1535: invokevirtual getType : ()Ljava/lang/Class;
    //   1538: astore #8
    //   1540: aload #8
    //   1542: ifnull -> 1623
    //   1545: aload #8
    //   1547: invokevirtual isPrimitive : ()Z
    //   1550: ifne -> 1623
    //   1553: goto -> 1560
    //   1556: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1559: athrow
    //   1560: aload #8
    //   1562: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1565: ifnull -> 1623
    //   1568: goto -> 1575
    //   1571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1574: athrow
    //   1575: aload #8
    //   1577: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1580: invokevirtual getName : ()Ljava/lang/String;
    //   1583: ifnull -> 1623
    //   1586: goto -> 1593
    //   1589: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1592: athrow
    //   1593: aload #8
    //   1595: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1598: invokevirtual getName : ()Ljava/lang/String;
    //   1601: sipush #4796
    //   1604: sipush #17874
    //   1607: invokestatic a : (II)Ljava/lang/String;
    //   1610: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1613: ifne -> 1623
    //   1616: goto -> 1623
    //   1619: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1622: athrow
    //   1623: aload #7
    //   1625: iconst_1
    //   1626: invokevirtual setAccessible : (Z)V
    //   1629: aload #7
    //   1631: aconst_null
    //   1632: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1635: pop
    //   1636: iinc #6, 1
    //   1639: iload_2
    //   1640: ifne -> 1501
    //   1643: sipush #4788
    //   1646: sipush #1005
    //   1649: invokestatic a : (II)Ljava/lang/String;
    //   1652: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1655: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1658: astore #4
    //   1660: aload #4
    //   1662: arraylength
    //   1663: istore #5
    //   1665: iconst_0
    //   1666: istore #6
    //   1668: iload #6
    //   1670: iload #5
    //   1672: if_icmpge -> 1808
    //   1675: aload #4
    //   1677: iload #6
    //   1679: aaload
    //   1680: astore #7
    //   1682: aload #7
    //   1684: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1687: pop
    //   1688: aload #7
    //   1690: invokevirtual getModifiers : ()I
    //   1693: invokestatic isStatic : (I)Z
    //   1696: ifeq -> 1794
    //   1699: aload #7
    //   1701: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1704: arraylength
    //   1705: iconst_2
    //   1706: if_icmpne -> 1794
    //   1709: goto -> 1716
    //   1712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1715: athrow
    //   1716: aload #7
    //   1718: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1721: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1724: if_acmpne -> 1794
    //   1727: goto -> 1734
    //   1730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1733: athrow
    //   1734: aload #7
    //   1736: iconst_1
    //   1737: invokevirtual setAccessible : (Z)V
    //   1740: aload #7
    //   1742: aconst_null
    //   1743: iconst_2
    //   1744: anewarray java/lang/Object
    //   1747: dup
    //   1748: iconst_0
    //   1749: aload_0
    //   1750: aastore
    //   1751: dup
    //   1752: iconst_1
    //   1753: aload_1
    //   1754: ifnonnull -> 1772
    //   1757: goto -> 1764
    //   1760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1763: athrow
    //   1764: aload_1
    //   1765: goto -> 1779
    //   1768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1771: athrow
    //   1772: aload_1
    //   1773: checkcast [B
    //   1776: invokevirtual clone : ()Ljava/lang/Object;
    //   1779: aastore
    //   1780: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1783: checkcast java/lang/Boolean
    //   1786: invokevirtual booleanValue : ()Z
    //   1789: istore_3
    //   1790: iload_2
    //   1791: ifne -> 1808
    //   1794: iinc #6, 1
    //   1797: iload_2
    //   1798: ifne -> 1668
    //   1801: goto -> 1808
    //   1804: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1807: athrow
    //   1808: iload_2
    //   1809: ifne -> 2150
    //   1812: sipush #4785
    //   1815: sipush #28361
    //   1818: invokestatic a : (II)Ljava/lang/String;
    //   1821: iconst_1
    //   1822: ldc burp/Zz0
    //   1824: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1827: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1830: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1833: astore #4
    //   1835: aload #4
    //   1837: arraylength
    //   1838: istore #5
    //   1840: iconst_0
    //   1841: istore #6
    //   1843: iload #6
    //   1845: iload #5
    //   1847: if_icmpge -> 1985
    //   1850: aload #4
    //   1852: iload #6
    //   1854: aaload
    //   1855: astore #7
    //   1857: aload #7
    //   1859: invokevirtual getModifiers : ()I
    //   1862: invokestatic isStatic : (I)Z
    //   1865: ifne -> 1875
    //   1868: goto -> 1978
    //   1871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1874: athrow
    //   1875: aload #7
    //   1877: invokevirtual getType : ()Ljava/lang/Class;
    //   1880: astore #8
    //   1882: aload #8
    //   1884: ifnull -> 1965
    //   1887: aload #8
    //   1889: invokevirtual isPrimitive : ()Z
    //   1892: ifne -> 1965
    //   1895: goto -> 1902
    //   1898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1901: athrow
    //   1902: aload #8
    //   1904: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1907: ifnull -> 1965
    //   1910: goto -> 1917
    //   1913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1916: athrow
    //   1917: aload #8
    //   1919: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1922: invokevirtual getName : ()Ljava/lang/String;
    //   1925: ifnull -> 1965
    //   1928: goto -> 1935
    //   1931: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1934: athrow
    //   1935: aload #8
    //   1937: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1940: invokevirtual getName : ()Ljava/lang/String;
    //   1943: sipush #4796
    //   1946: sipush #17874
    //   1949: invokestatic a : (II)Ljava/lang/String;
    //   1952: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1955: ifne -> 1965
    //   1958: goto -> 1965
    //   1961: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1964: athrow
    //   1965: aload #7
    //   1967: iconst_1
    //   1968: invokevirtual setAccessible : (Z)V
    //   1971: aload #7
    //   1973: aconst_null
    //   1974: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1977: pop
    //   1978: iinc #6, 1
    //   1981: iload_2
    //   1982: ifne -> 1843
    //   1985: sipush #4775
    //   1988: sipush #7682
    //   1991: invokestatic a : (II)Ljava/lang/String;
    //   1994: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1997: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2000: astore #4
    //   2002: aload #4
    //   2004: arraylength
    //   2005: istore #5
    //   2007: iconst_0
    //   2008: istore #6
    //   2010: iload #6
    //   2012: iload #5
    //   2014: if_icmpge -> 2150
    //   2017: aload #4
    //   2019: iload #6
    //   2021: aaload
    //   2022: astore #7
    //   2024: aload #7
    //   2026: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2029: pop
    //   2030: aload #7
    //   2032: invokevirtual getModifiers : ()I
    //   2035: invokestatic isStatic : (I)Z
    //   2038: ifeq -> 2136
    //   2041: aload #7
    //   2043: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2046: arraylength
    //   2047: iconst_2
    //   2048: if_icmpne -> 2136
    //   2051: goto -> 2058
    //   2054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2057: athrow
    //   2058: aload #7
    //   2060: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2063: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2066: if_acmpne -> 2136
    //   2069: goto -> 2076
    //   2072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2075: athrow
    //   2076: aload #7
    //   2078: iconst_1
    //   2079: invokevirtual setAccessible : (Z)V
    //   2082: aload #7
    //   2084: aconst_null
    //   2085: iconst_2
    //   2086: anewarray java/lang/Object
    //   2089: dup
    //   2090: iconst_0
    //   2091: aload_0
    //   2092: aastore
    //   2093: dup
    //   2094: iconst_1
    //   2095: aload_1
    //   2096: ifnonnull -> 2114
    //   2099: goto -> 2106
    //   2102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2105: athrow
    //   2106: aload_1
    //   2107: goto -> 2121
    //   2110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2113: athrow
    //   2114: aload_1
    //   2115: checkcast [B
    //   2118: invokevirtual clone : ()Ljava/lang/Object;
    //   2121: aastore
    //   2122: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2125: checkcast java/lang/Boolean
    //   2128: invokevirtual booleanValue : ()Z
    //   2131: istore_3
    //   2132: iload_2
    //   2133: ifne -> 2150
    //   2136: iinc #6, 1
    //   2139: iload_2
    //   2140: ifne -> 2010
    //   2143: goto -> 2150
    //   2146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2149: athrow
    //   2150: iload_3
    //   2151: ifeq -> 2156
    //   2154: iload_3
    //   2155: ireturn
    //   2156: getstatic burp/Zmkq.Zr : Ljava/lang/String;
    //   2159: getstatic burp/Zemp.Zr : Ljava/lang/Object;
    //   2162: checkcast java/math/BigInteger
    //   2165: invokevirtual intValue : ()I
    //   2168: bipush #32
    //   2170: irem
    //   2171: invokestatic abs : (I)I
    //   2174: invokevirtual charAt : (I)C
    //   2177: getstatic burp/Zxwf.ZX : Ljava/lang/String;
    //   2180: getstatic burp/Zenr.ZA : Ljava/lang/Object;
    //   2183: checkcast java/math/BigInteger
    //   2186: invokevirtual intValue : ()I
    //   2189: bipush #32
    //   2191: irem
    //   2192: invokestatic abs : (I)I
    //   2195: invokevirtual charAt : (I)C
    //   2198: if_icmple -> 2543
    //   2201: sipush #4786
    //   2204: sipush #19486
    //   2207: invokestatic a : (II)Ljava/lang/String;
    //   2210: iconst_1
    //   2211: ldc burp/Zsf7
    //   2213: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2216: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2219: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2222: astore #4
    //   2224: aload #4
    //   2226: arraylength
    //   2227: istore #5
    //   2229: iconst_0
    //   2230: istore #6
    //   2232: iload #6
    //   2234: iload #5
    //   2236: if_icmpge -> 2374
    //   2239: aload #4
    //   2241: iload #6
    //   2243: aaload
    //   2244: astore #7
    //   2246: aload #7
    //   2248: invokevirtual getModifiers : ()I
    //   2251: invokestatic isStatic : (I)Z
    //   2254: ifne -> 2264
    //   2257: goto -> 2367
    //   2260: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2263: athrow
    //   2264: aload #7
    //   2266: invokevirtual getType : ()Ljava/lang/Class;
    //   2269: astore #8
    //   2271: aload #8
    //   2273: ifnull -> 2354
    //   2276: aload #8
    //   2278: invokevirtual isPrimitive : ()Z
    //   2281: ifne -> 2354
    //   2284: goto -> 2291
    //   2287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2290: athrow
    //   2291: aload #8
    //   2293: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2296: ifnull -> 2354
    //   2299: goto -> 2306
    //   2302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2305: athrow
    //   2306: aload #8
    //   2308: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2311: invokevirtual getName : ()Ljava/lang/String;
    //   2314: ifnull -> 2354
    //   2317: goto -> 2324
    //   2320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2323: athrow
    //   2324: aload #8
    //   2326: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2329: invokevirtual getName : ()Ljava/lang/String;
    //   2332: sipush #4796
    //   2335: sipush #17874
    //   2338: invokestatic a : (II)Ljava/lang/String;
    //   2341: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2344: ifne -> 2354
    //   2347: goto -> 2354
    //   2350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2353: athrow
    //   2354: aload #7
    //   2356: iconst_1
    //   2357: invokevirtual setAccessible : (Z)V
    //   2360: aload #7
    //   2362: aconst_null
    //   2363: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2366: pop
    //   2367: iinc #6, 1
    //   2370: iload_2
    //   2371: ifne -> 2232
    //   2374: sipush #4776
    //   2377: sipush #-25385
    //   2380: invokestatic a : (II)Ljava/lang/String;
    //   2383: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2386: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2389: astore #4
    //   2391: aload #4
    //   2393: arraylength
    //   2394: istore #5
    //   2396: iconst_0
    //   2397: istore #6
    //   2399: iload #6
    //   2401: iload #5
    //   2403: if_icmpge -> 2539
    //   2406: aload #4
    //   2408: iload #6
    //   2410: aaload
    //   2411: astore #7
    //   2413: aload #7
    //   2415: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2418: pop
    //   2419: aload #7
    //   2421: invokevirtual getModifiers : ()I
    //   2424: invokestatic isStatic : (I)Z
    //   2427: ifeq -> 2525
    //   2430: aload #7
    //   2432: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2435: arraylength
    //   2436: iconst_2
    //   2437: if_icmpne -> 2525
    //   2440: goto -> 2447
    //   2443: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2446: athrow
    //   2447: aload #7
    //   2449: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2452: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2455: if_acmpne -> 2525
    //   2458: goto -> 2465
    //   2461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2464: athrow
    //   2465: aload #7
    //   2467: iconst_1
    //   2468: invokevirtual setAccessible : (Z)V
    //   2471: aload #7
    //   2473: aconst_null
    //   2474: iconst_2
    //   2475: anewarray java/lang/Object
    //   2478: dup
    //   2479: iconst_0
    //   2480: aload_0
    //   2481: aastore
    //   2482: dup
    //   2483: iconst_1
    //   2484: aload_1
    //   2485: ifnonnull -> 2503
    //   2488: goto -> 2495
    //   2491: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2494: athrow
    //   2495: aload_1
    //   2496: goto -> 2510
    //   2499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2502: athrow
    //   2503: aload_1
    //   2504: checkcast [B
    //   2507: invokevirtual clone : ()Ljava/lang/Object;
    //   2510: aastore
    //   2511: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2514: checkcast java/lang/Boolean
    //   2517: invokevirtual booleanValue : ()Z
    //   2520: istore_3
    //   2521: iload_2
    //   2522: ifne -> 2539
    //   2525: iinc #6, 1
    //   2528: iload_2
    //   2529: ifne -> 2399
    //   2532: goto -> 2539
    //   2535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2538: athrow
    //   2539: iload_2
    //   2540: ifne -> 2881
    //   2543: sipush #4790
    //   2546: sipush #-9366
    //   2549: invokestatic a : (II)Ljava/lang/String;
    //   2552: iconst_1
    //   2553: ldc burp/Zs0h
    //   2555: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2558: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2561: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2564: astore #4
    //   2566: aload #4
    //   2568: arraylength
    //   2569: istore #5
    //   2571: iconst_0
    //   2572: istore #6
    //   2574: iload #6
    //   2576: iload #5
    //   2578: if_icmpge -> 2716
    //   2581: aload #4
    //   2583: iload #6
    //   2585: aaload
    //   2586: astore #7
    //   2588: aload #7
    //   2590: invokevirtual getModifiers : ()I
    //   2593: invokestatic isStatic : (I)Z
    //   2596: ifne -> 2606
    //   2599: goto -> 2709
    //   2602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2605: athrow
    //   2606: aload #7
    //   2608: invokevirtual getType : ()Ljava/lang/Class;
    //   2611: astore #8
    //   2613: aload #8
    //   2615: ifnull -> 2696
    //   2618: aload #8
    //   2620: invokevirtual isPrimitive : ()Z
    //   2623: ifne -> 2696
    //   2626: goto -> 2633
    //   2629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2632: athrow
    //   2633: aload #8
    //   2635: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2638: ifnull -> 2696
    //   2641: goto -> 2648
    //   2644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2647: athrow
    //   2648: aload #8
    //   2650: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2653: invokevirtual getName : ()Ljava/lang/String;
    //   2656: ifnull -> 2696
    //   2659: goto -> 2666
    //   2662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2665: athrow
    //   2666: aload #8
    //   2668: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2671: invokevirtual getName : ()Ljava/lang/String;
    //   2674: sipush #4796
    //   2677: sipush #17874
    //   2680: invokestatic a : (II)Ljava/lang/String;
    //   2683: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2686: ifne -> 2696
    //   2689: goto -> 2696
    //   2692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2695: athrow
    //   2696: aload #7
    //   2698: iconst_1
    //   2699: invokevirtual setAccessible : (Z)V
    //   2702: aload #7
    //   2704: aconst_null
    //   2705: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2708: pop
    //   2709: iinc #6, 1
    //   2712: iload_2
    //   2713: ifne -> 2574
    //   2716: sipush #4781
    //   2719: sipush #17690
    //   2722: invokestatic a : (II)Ljava/lang/String;
    //   2725: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2728: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2731: astore #4
    //   2733: aload #4
    //   2735: arraylength
    //   2736: istore #5
    //   2738: iconst_0
    //   2739: istore #6
    //   2741: iload #6
    //   2743: iload #5
    //   2745: if_icmpge -> 2881
    //   2748: aload #4
    //   2750: iload #6
    //   2752: aaload
    //   2753: astore #7
    //   2755: aload #7
    //   2757: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2760: pop
    //   2761: aload #7
    //   2763: invokevirtual getModifiers : ()I
    //   2766: invokestatic isStatic : (I)Z
    //   2769: ifeq -> 2867
    //   2772: aload #7
    //   2774: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2777: arraylength
    //   2778: iconst_2
    //   2779: if_icmpne -> 2867
    //   2782: goto -> 2789
    //   2785: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2788: athrow
    //   2789: aload #7
    //   2791: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2794: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2797: if_acmpne -> 2867
    //   2800: goto -> 2807
    //   2803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2806: athrow
    //   2807: aload #7
    //   2809: iconst_1
    //   2810: invokevirtual setAccessible : (Z)V
    //   2813: aload #7
    //   2815: aconst_null
    //   2816: iconst_2
    //   2817: anewarray java/lang/Object
    //   2820: dup
    //   2821: iconst_0
    //   2822: aload_0
    //   2823: aastore
    //   2824: dup
    //   2825: iconst_1
    //   2826: aload_1
    //   2827: ifnonnull -> 2845
    //   2830: goto -> 2837
    //   2833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2836: athrow
    //   2837: aload_1
    //   2838: goto -> 2852
    //   2841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2844: athrow
    //   2845: aload_1
    //   2846: checkcast [B
    //   2849: invokevirtual clone : ()Ljava/lang/Object;
    //   2852: aastore
    //   2853: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2856: checkcast java/lang/Boolean
    //   2859: invokevirtual booleanValue : ()Z
    //   2862: istore_3
    //   2863: iload_2
    //   2864: ifne -> 2881
    //   2867: iinc #6, 1
    //   2870: iload_2
    //   2871: ifne -> 2741
    //   2874: goto -> 2881
    //   2877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2880: athrow
    //   2881: iload_3
    //   2882: ifeq -> 2887
    //   2885: iload_3
    //   2886: ireturn
    //   2887: getstatic burp/Zmtr.Zd : Ljava/lang/String;
    //   2890: getstatic burp/Ztgv.Zg : Ljava/lang/Object;
    //   2893: checkcast java/math/BigInteger
    //   2896: invokevirtual intValue : ()I
    //   2899: bipush #32
    //   2901: irem
    //   2902: invokestatic abs : (I)I
    //   2905: invokevirtual charAt : (I)C
    //   2908: getstatic burp/Ze1k.ZI : Ljava/lang/String;
    //   2911: getstatic burp/Znu.Zf : Ljava/lang/Object;
    //   2914: checkcast java/math/BigInteger
    //   2917: invokevirtual intValue : ()I
    //   2920: bipush #32
    //   2922: irem
    //   2923: invokestatic abs : (I)I
    //   2926: invokevirtual charAt : (I)C
    //   2929: if_icmple -> 3274
    //   2932: sipush #4777
    //   2935: sipush #153
    //   2938: invokestatic a : (II)Ljava/lang/String;
    //   2941: iconst_1
    //   2942: ldc burp/Zzmo
    //   2944: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2947: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2950: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2953: astore #4
    //   2955: aload #4
    //   2957: arraylength
    //   2958: istore #5
    //   2960: iconst_0
    //   2961: istore #6
    //   2963: iload #6
    //   2965: iload #5
    //   2967: if_icmpge -> 3105
    //   2970: aload #4
    //   2972: iload #6
    //   2974: aaload
    //   2975: astore #7
    //   2977: aload #7
    //   2979: invokevirtual getModifiers : ()I
    //   2982: invokestatic isStatic : (I)Z
    //   2985: ifne -> 2995
    //   2988: goto -> 3098
    //   2991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2994: athrow
    //   2995: aload #7
    //   2997: invokevirtual getType : ()Ljava/lang/Class;
    //   3000: astore #8
    //   3002: aload #8
    //   3004: ifnull -> 3085
    //   3007: aload #8
    //   3009: invokevirtual isPrimitive : ()Z
    //   3012: ifne -> 3085
    //   3015: goto -> 3022
    //   3018: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3021: athrow
    //   3022: aload #8
    //   3024: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3027: ifnull -> 3085
    //   3030: goto -> 3037
    //   3033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3036: athrow
    //   3037: aload #8
    //   3039: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3042: invokevirtual getName : ()Ljava/lang/String;
    //   3045: ifnull -> 3085
    //   3048: goto -> 3055
    //   3051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3054: athrow
    //   3055: aload #8
    //   3057: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3060: invokevirtual getName : ()Ljava/lang/String;
    //   3063: sipush #4796
    //   3066: sipush #17874
    //   3069: invokestatic a : (II)Ljava/lang/String;
    //   3072: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3075: ifne -> 3085
    //   3078: goto -> 3085
    //   3081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3084: athrow
    //   3085: aload #7
    //   3087: iconst_1
    //   3088: invokevirtual setAccessible : (Z)V
    //   3091: aload #7
    //   3093: aconst_null
    //   3094: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3097: pop
    //   3098: iinc #6, 1
    //   3101: iload_2
    //   3102: ifne -> 2963
    //   3105: sipush #4772
    //   3108: sipush #22751
    //   3111: invokestatic a : (II)Ljava/lang/String;
    //   3114: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3117: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3120: astore #4
    //   3122: aload #4
    //   3124: arraylength
    //   3125: istore #5
    //   3127: iconst_0
    //   3128: istore #6
    //   3130: iload #6
    //   3132: iload #5
    //   3134: if_icmpge -> 3270
    //   3137: aload #4
    //   3139: iload #6
    //   3141: aaload
    //   3142: astore #7
    //   3144: aload #7
    //   3146: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3149: pop
    //   3150: aload #7
    //   3152: invokevirtual getModifiers : ()I
    //   3155: invokestatic isStatic : (I)Z
    //   3158: ifeq -> 3256
    //   3161: aload #7
    //   3163: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3166: arraylength
    //   3167: iconst_2
    //   3168: if_icmpne -> 3256
    //   3171: goto -> 3178
    //   3174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3177: athrow
    //   3178: aload #7
    //   3180: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3183: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3186: if_acmpne -> 3256
    //   3189: goto -> 3196
    //   3192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3195: athrow
    //   3196: aload #7
    //   3198: iconst_1
    //   3199: invokevirtual setAccessible : (Z)V
    //   3202: aload #7
    //   3204: aconst_null
    //   3205: iconst_2
    //   3206: anewarray java/lang/Object
    //   3209: dup
    //   3210: iconst_0
    //   3211: aload_0
    //   3212: aastore
    //   3213: dup
    //   3214: iconst_1
    //   3215: aload_1
    //   3216: ifnonnull -> 3234
    //   3219: goto -> 3226
    //   3222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3225: athrow
    //   3226: aload_1
    //   3227: goto -> 3241
    //   3230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3233: athrow
    //   3234: aload_1
    //   3235: checkcast [B
    //   3238: invokevirtual clone : ()Ljava/lang/Object;
    //   3241: aastore
    //   3242: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3245: checkcast java/lang/Boolean
    //   3248: invokevirtual booleanValue : ()Z
    //   3251: istore_3
    //   3252: iload_2
    //   3253: ifne -> 3270
    //   3256: iinc #6, 1
    //   3259: iload_2
    //   3260: ifne -> 3130
    //   3263: goto -> 3270
    //   3266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3269: athrow
    //   3270: iload_2
    //   3271: ifne -> 3612
    //   3274: sipush #4799
    //   3277: sipush #-19032
    //   3280: invokestatic a : (II)Ljava/lang/String;
    //   3283: iconst_1
    //   3284: ldc burp/Zb0z
    //   3286: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3289: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3292: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3295: astore #4
    //   3297: aload #4
    //   3299: arraylength
    //   3300: istore #5
    //   3302: iconst_0
    //   3303: istore #6
    //   3305: iload #6
    //   3307: iload #5
    //   3309: if_icmpge -> 3447
    //   3312: aload #4
    //   3314: iload #6
    //   3316: aaload
    //   3317: astore #7
    //   3319: aload #7
    //   3321: invokevirtual getModifiers : ()I
    //   3324: invokestatic isStatic : (I)Z
    //   3327: ifne -> 3337
    //   3330: goto -> 3440
    //   3333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3336: athrow
    //   3337: aload #7
    //   3339: invokevirtual getType : ()Ljava/lang/Class;
    //   3342: astore #8
    //   3344: aload #8
    //   3346: ifnull -> 3427
    //   3349: aload #8
    //   3351: invokevirtual isPrimitive : ()Z
    //   3354: ifne -> 3427
    //   3357: goto -> 3364
    //   3360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3363: athrow
    //   3364: aload #8
    //   3366: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3369: ifnull -> 3427
    //   3372: goto -> 3379
    //   3375: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3378: athrow
    //   3379: aload #8
    //   3381: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3384: invokevirtual getName : ()Ljava/lang/String;
    //   3387: ifnull -> 3427
    //   3390: goto -> 3397
    //   3393: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3396: athrow
    //   3397: aload #8
    //   3399: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3402: invokevirtual getName : ()Ljava/lang/String;
    //   3405: sipush #4796
    //   3408: sipush #17874
    //   3411: invokestatic a : (II)Ljava/lang/String;
    //   3414: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3417: ifne -> 3427
    //   3420: goto -> 3427
    //   3423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3426: athrow
    //   3427: aload #7
    //   3429: iconst_1
    //   3430: invokevirtual setAccessible : (Z)V
    //   3433: aload #7
    //   3435: aconst_null
    //   3436: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3439: pop
    //   3440: iinc #6, 1
    //   3443: iload_2
    //   3444: ifne -> 3305
    //   3447: sipush #4773
    //   3450: sipush #22542
    //   3453: invokestatic a : (II)Ljava/lang/String;
    //   3456: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3459: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3462: astore #4
    //   3464: aload #4
    //   3466: arraylength
    //   3467: istore #5
    //   3469: iconst_0
    //   3470: istore #6
    //   3472: iload #6
    //   3474: iload #5
    //   3476: if_icmpge -> 3612
    //   3479: aload #4
    //   3481: iload #6
    //   3483: aaload
    //   3484: astore #7
    //   3486: aload #7
    //   3488: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3491: pop
    //   3492: aload #7
    //   3494: invokevirtual getModifiers : ()I
    //   3497: invokestatic isStatic : (I)Z
    //   3500: ifeq -> 3598
    //   3503: aload #7
    //   3505: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3508: arraylength
    //   3509: iconst_2
    //   3510: if_icmpne -> 3598
    //   3513: goto -> 3520
    //   3516: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3519: athrow
    //   3520: aload #7
    //   3522: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3525: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3528: if_acmpne -> 3598
    //   3531: goto -> 3538
    //   3534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3537: athrow
    //   3538: aload #7
    //   3540: iconst_1
    //   3541: invokevirtual setAccessible : (Z)V
    //   3544: aload #7
    //   3546: aconst_null
    //   3547: iconst_2
    //   3548: anewarray java/lang/Object
    //   3551: dup
    //   3552: iconst_0
    //   3553: aload_0
    //   3554: aastore
    //   3555: dup
    //   3556: iconst_1
    //   3557: aload_1
    //   3558: ifnonnull -> 3576
    //   3561: goto -> 3568
    //   3564: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3567: athrow
    //   3568: aload_1
    //   3569: goto -> 3583
    //   3572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3575: athrow
    //   3576: aload_1
    //   3577: checkcast [B
    //   3580: invokevirtual clone : ()Ljava/lang/Object;
    //   3583: aastore
    //   3584: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3587: checkcast java/lang/Boolean
    //   3590: invokevirtual booleanValue : ()Z
    //   3593: istore_3
    //   3594: iload_2
    //   3595: ifne -> 3612
    //   3598: iinc #6, 1
    //   3601: iload_2
    //   3602: ifne -> 3472
    //   3605: goto -> 3612
    //   3608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3611: athrow
    //   3612: iload_3
    //   3613: ireturn
    //   3614: astore_3
    //   3615: new java/lang/Exception
    //   3618: dup
    //   3619: aload_3
    //   3620: invokevirtual getMessage : ()Ljava/lang/String;
    //   3623: invokespecial <init> : (Ljava/lang/String;)V
    //   3626: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1424	3614	java/lang/Throwable
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
    //   351	688	691	java/lang/Throwable
    //   522	532	532	java/lang/Throwable
    //   536	548	548	java/lang/Throwable
    //   552	564	564	java/lang/Throwable
    //   568	581	581	java/lang/Throwable
    //   585	598	598	java/lang/Throwable
    //   784	798	798	java/lang/Throwable
    //   809	822	825	java/lang/Throwable
    //   814	837	840	java/lang/Throwable
    //   829	855	858	java/lang/Throwable
    //   844	885	888	java/lang/Throwable
    //   951	978	981	java/lang/Throwable
    //   968	996	999	java/lang/Throwable
    //   985	1026	1029	java/lang/Throwable
    //   1003	1037	1037	java/lang/Throwable
    //   1059	1070	1073	java/lang/Throwable
    //   1126	1140	1140	java/lang/Throwable
    //   1151	1164	1167	java/lang/Throwable
    //   1156	1179	1182	java/lang/Throwable
    //   1171	1197	1200	java/lang/Throwable
    //   1186	1227	1230	java/lang/Throwable
    //   1293	1320	1323	java/lang/Throwable
    //   1310	1338	1341	java/lang/Throwable
    //   1327	1368	1371	java/lang/Throwable
    //   1345	1379	1379	java/lang/Throwable
    //   1401	1412	1415	java/lang/Throwable
    //   1425	2155	3614	java/lang/Throwable
    //   1515	1529	1529	java/lang/Throwable
    //   1540	1553	1556	java/lang/Throwable
    //   1545	1568	1571	java/lang/Throwable
    //   1560	1586	1589	java/lang/Throwable
    //   1575	1616	1619	java/lang/Throwable
    //   1682	1709	1712	java/lang/Throwable
    //   1699	1727	1730	java/lang/Throwable
    //   1716	1757	1760	java/lang/Throwable
    //   1734	1768	1768	java/lang/Throwable
    //   1790	1801	1804	java/lang/Throwable
    //   1857	1871	1871	java/lang/Throwable
    //   1882	1895	1898	java/lang/Throwable
    //   1887	1910	1913	java/lang/Throwable
    //   1902	1928	1931	java/lang/Throwable
    //   1917	1958	1961	java/lang/Throwable
    //   2024	2051	2054	java/lang/Throwable
    //   2041	2069	2072	java/lang/Throwable
    //   2058	2099	2102	java/lang/Throwable
    //   2076	2110	2110	java/lang/Throwable
    //   2132	2143	2146	java/lang/Throwable
    //   2156	2886	3614	java/lang/Throwable
    //   2246	2260	2260	java/lang/Throwable
    //   2271	2284	2287	java/lang/Throwable
    //   2276	2299	2302	java/lang/Throwable
    //   2291	2317	2320	java/lang/Throwable
    //   2306	2347	2350	java/lang/Throwable
    //   2413	2440	2443	java/lang/Throwable
    //   2430	2458	2461	java/lang/Throwable
    //   2447	2488	2491	java/lang/Throwable
    //   2465	2499	2499	java/lang/Throwable
    //   2521	2532	2535	java/lang/Throwable
    //   2588	2602	2602	java/lang/Throwable
    //   2613	2626	2629	java/lang/Throwable
    //   2618	2641	2644	java/lang/Throwable
    //   2633	2659	2662	java/lang/Throwable
    //   2648	2689	2692	java/lang/Throwable
    //   2755	2782	2785	java/lang/Throwable
    //   2772	2800	2803	java/lang/Throwable
    //   2789	2830	2833	java/lang/Throwable
    //   2807	2841	2841	java/lang/Throwable
    //   2863	2874	2877	java/lang/Throwable
    //   2887	3613	3614	java/lang/Throwable
    //   2977	2991	2991	java/lang/Throwable
    //   3002	3015	3018	java/lang/Throwable
    //   3007	3030	3033	java/lang/Throwable
    //   3022	3048	3051	java/lang/Throwable
    //   3037	3078	3081	java/lang/Throwable
    //   3144	3171	3174	java/lang/Throwable
    //   3161	3189	3192	java/lang/Throwable
    //   3178	3219	3222	java/lang/Throwable
    //   3196	3230	3230	java/lang/Throwable
    //   3252	3263	3266	java/lang/Throwable
    //   3319	3333	3333	java/lang/Throwable
    //   3344	3357	3360	java/lang/Throwable
    //   3349	3372	3375	java/lang/Throwable
    //   3364	3390	3393	java/lang/Throwable
    //   3379	3420	3423	java/lang/Throwable
    //   3486	3513	3516	java/lang/Throwable
    //   3503	3531	3534	java/lang/Throwable
    //   3520	3561	3564	java/lang/Throwable
    //   3538	3572	3572	java/lang/Throwable
    //   3594	3605	3608	java/lang/Throwable
  }
  
  static void ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '@O\\n©+oÇò\\tûàal©×ã ékI6V§~5¡àA³üþü¤ÞïBðV>°`ælc\\tÐ³À]"Y\\t-»Ã7µäÓ­i0éicâ =Ñ£|zÂBì.ÓMTHÚ(ºÄÞîtkR ï£j=yà­õèzäT÷\\r\\bê0ã)ù¡G2*?zsqH,®P~DKe_#ª¾t_²óÔ8¢Ì þ-Ý\\tk¸s.Èãô\\twð¡^^`)\\tàP `Sõ\\t@JêV\\t¸¢\\tVa vë×\\tÎÇÀ¸rMì¶'°(Fé&íS\\t§Êê[ñ#\\bÆùÆ=ÍZ *k¶Uñ* nbVzs``ea&øÊ0^ê¾3@\\t182G,².M\\t¤A*/\\b\\t*[+J(êð\\t9¼%×Î¿x\\t¨;e!Æ~cÍ\\t"ÅZº=-rQ§4ö\\bÌñ<°ÆJ,'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #45
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
    //   68: ldc 'åSÕm3ä$\\t®ðjãTÜ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #122
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
    //   129: putstatic burp/Zmdi.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmdi.b : [Ljava/lang/String;
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
    //   212: bipush #60
    //   214: goto -> 244
    //   217: bipush #106
    //   219: goto -> 244
    //   222: bipush #77
    //   224: goto -> 244
    //   227: bipush #108
    //   229: goto -> 244
    //   232: bipush #115
    //   234: goto -> 244
    //   237: bipush #75
    //   239: goto -> 244
    //   242: bipush #50
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
    //   300: sipush #4789
    //   303: sipush #29791
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zmdi.ZA : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #21
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-107
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #95
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #8
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-52
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-108
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #36
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #67
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #66
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #7
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-113
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-82
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #50
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #108
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-102
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-99
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-113
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-43
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-103
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #77
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #36
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #74
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-98
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-121
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #117
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #25
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #102
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-115
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-34
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #105
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #41
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #26
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zmdi.Zw : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x12A4) & 0xFFFF;
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
      char c = '¨';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmdi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */