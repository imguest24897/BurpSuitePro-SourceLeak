package burp;

import java.math.BigInteger;

class Zs4g extends ClassLoader {
  static String ZV;
  
  static Object ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZK(Object paramObject) {
    Zly9.ZS = a(-18366, -17826);
    Zly9.Zz = new BigInteger(a(-18344, 2941));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zrov.ZU.charAt(Math.abs(((BigInteger)Zmdf.ZH).intValue() % 32)) > Zrw0.Zj.charAt(Math.abs(((BigInteger)Zesw.ZB).intValue() % 32))) {
          try {
            Zlxr.ZK(Class.forName(a(-18365, -14292)));
            if (!bool)
              Zd0.Zx(Class.forName(a(-18368, 8817))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zd0.Zx(Class.forName(a(-18368, 8817)));
    } catch (Throwable throwable) {}
  }
  
  static void Zh(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zl2t.ZS : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zmt_.Zl : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zmli.Zh : Ljava/lang/Object;
    //   22: sipush #-18340
    //   25: getstatic burp/Ze4g.Zz : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Ztvg.ZO : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Ztnn.ZA : Ljava/lang/Object;
    //   43: sipush #-1194
    //   46: getstatic burp/Zs5y.Zd : Ljava/lang/Object;
    //   49: checkcast java/math/BigInteger
    //   52: getstatic burp/Zrd2.Zt : Ljava/lang/Object;
    //   55: checkcast java/math/BigInteger
    //   58: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   61: putstatic burp/Zeqx.Zh : Ljava/lang/Object;
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: ldc burp/Zr9p
    //   70: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   73: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   76: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   79: astore_3
    //   80: aload_3
    //   81: arraylength
    //   82: istore #4
    //   84: iconst_0
    //   85: istore #5
    //   87: iload #5
    //   89: iload #4
    //   91: if_icmpge -> 228
    //   94: aload_3
    //   95: iload #5
    //   97: aaload
    //   98: astore #6
    //   100: aload #6
    //   102: invokevirtual getModifiers : ()I
    //   105: invokestatic isStatic : (I)Z
    //   108: ifne -> 118
    //   111: goto -> 221
    //   114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   117: athrow
    //   118: aload #6
    //   120: invokevirtual getType : ()Ljava/lang/Class;
    //   123: astore #7
    //   125: aload #7
    //   127: ifnull -> 208
    //   130: aload #7
    //   132: invokevirtual isPrimitive : ()Z
    //   135: ifne -> 208
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   144: athrow
    //   145: aload #7
    //   147: invokevirtual getPackage : ()Ljava/lang/Package;
    //   150: ifnull -> 208
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: ifnull -> 208
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   177: athrow
    //   178: aload #7
    //   180: invokevirtual getPackage : ()Ljava/lang/Package;
    //   183: invokevirtual getName : ()Ljava/lang/String;
    //   186: sipush #-18362
    //   189: sipush #24301
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   198: ifne -> 208
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   207: athrow
    //   208: aload #6
    //   210: iconst_1
    //   211: invokevirtual setAccessible : (Z)V
    //   214: aload #6
    //   216: aconst_null
    //   217: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   220: pop
    //   221: iinc #5, 1
    //   224: iload_2
    //   225: ifne -> 87
    //   228: sipush #-18352
    //   231: sipush #1905
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   240: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   243: astore_3
    //   244: aload_3
    //   245: arraylength
    //   246: istore #4
    //   248: iconst_0
    //   249: istore #5
    //   251: iload #5
    //   253: iload #4
    //   255: if_icmpge -> 387
    //   258: aload_3
    //   259: iload #5
    //   261: aaload
    //   262: astore #6
    //   264: aload #6
    //   266: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   269: pop
    //   270: aload #6
    //   272: invokevirtual getModifiers : ()I
    //   275: invokestatic isStatic : (I)Z
    //   278: ifeq -> 373
    //   281: aload #6
    //   283: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   286: arraylength
    //   287: iconst_2
    //   288: if_icmpne -> 373
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   303: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 373
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   318: athrow
    //   319: aload #6
    //   321: iconst_1
    //   322: invokevirtual setAccessible : (Z)V
    //   325: aload #6
    //   327: aconst_null
    //   328: iconst_2
    //   329: anewarray java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: aload_0
    //   335: aastore
    //   336: dup
    //   337: iconst_1
    //   338: aload_1
    //   339: ifnonnull -> 357
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: aload_1
    //   350: goto -> 364
    //   353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   356: athrow
    //   357: aload_1
    //   358: checkcast [B
    //   361: invokevirtual clone : ()Ljava/lang/Object;
    //   364: aastore
    //   365: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   368: pop
    //   369: iload_2
    //   370: ifne -> 387
    //   373: iinc #5, 1
    //   376: iload_2
    //   377: ifne -> 251
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   386: athrow
    //   387: new java/io/ByteArrayOutputStream
    //   390: dup
    //   391: invokespecial <init> : ()V
    //   394: astore_3
    //   395: sipush #-18347
    //   398: aload_3
    //   399: sipush #202
    //   402: invokevirtual write : (I)V
    //   405: sipush #-16911
    //   408: aload_3
    //   409: sipush #254
    //   412: invokevirtual write : (I)V
    //   415: aload_3
    //   416: sipush #186
    //   419: invokevirtual write : (I)V
    //   422: aload_3
    //   423: sipush #190
    //   426: invokevirtual write : (I)V
    //   429: aload_3
    //   430: iconst_0
    //   431: invokevirtual write : (I)V
    //   434: aload_3
    //   435: iconst_1
    //   436: invokevirtual write : (I)V
    //   439: aload_3
    //   440: iconst_0
    //   441: invokevirtual write : (I)V
    //   444: aload_3
    //   445: bipush #50
    //   447: invokevirtual write : (I)V
    //   450: aload_3
    //   451: getstatic burp/Zkc8.ZW : Ljava/lang/Object;
    //   454: checkcast java/math/BigInteger
    //   457: invokevirtual toByteArray : ()[B
    //   460: invokevirtual write : ([B)V
    //   463: aload_3
    //   464: getstatic burp/Ztod.ZP : Ljava/lang/Object;
    //   467: checkcast java/math/BigInteger
    //   470: invokevirtual toByteArray : ()[B
    //   473: invokevirtual write : ([B)V
    //   476: aload_3
    //   477: getstatic burp/Zgw0.ZM : Ljava/lang/Object;
    //   480: checkcast java/math/BigInteger
    //   483: invokevirtual toByteArray : ()[B
    //   486: invokevirtual write : ([B)V
    //   489: aload_3
    //   490: invokevirtual toByteArray : ()[B
    //   493: astore #4
    //   495: aconst_null
    //   496: astore #5
    //   498: invokestatic a : (II)Ljava/lang/String;
    //   501: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   504: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   507: astore #6
    //   509: aload #6
    //   511: arraylength
    //   512: istore #7
    //   514: iconst_0
    //   515: istore #8
    //   517: iload #8
    //   519: iload #7
    //   521: if_icmpge -> 649
    //   524: aload #6
    //   526: iload #8
    //   528: aaload
    //   529: astore #9
    //   531: aload #9
    //   533: invokevirtual getName : ()Ljava/lang/String;
    //   536: sipush #-18350
    //   539: sipush #223
    //   542: invokestatic a : (II)Ljava/lang/String;
    //   545: invokevirtual equals : (Ljava/lang/Object;)Z
    //   548: ifeq -> 642
    //   551: aload #9
    //   553: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   556: astore #10
    //   558: aload #10
    //   560: arraylength
    //   561: iconst_4
    //   562: if_icmpeq -> 572
    //   565: goto -> 642
    //   568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   571: athrow
    //   572: aload #10
    //   574: iconst_0
    //   575: aaload
    //   576: ldc java/lang/String
    //   578: if_acmpeq -> 588
    //   581: goto -> 642
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload #10
    //   590: iconst_1
    //   591: aaload
    //   592: ldc [B
    //   594: if_acmpeq -> 604
    //   597: goto -> 642
    //   600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   603: athrow
    //   604: aload #10
    //   606: iconst_2
    //   607: aaload
    //   608: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   611: if_acmpeq -> 621
    //   614: goto -> 642
    //   617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   620: athrow
    //   621: aload #10
    //   623: iconst_3
    //   624: aaload
    //   625: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   628: if_acmpeq -> 638
    //   631: goto -> 642
    //   634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   637: athrow
    //   638: aload #9
    //   640: astore #5
    //   642: iinc #8, 1
    //   645: iload_2
    //   646: ifne -> 517
    //   649: aload #5
    //   651: iconst_1
    //   652: invokevirtual setAccessible : (Z)V
    //   655: ldc burp/Zzai
    //   657: iconst_0
    //   658: anewarray java/lang/Class
    //   661: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   664: astore #6
    //   666: aload #6
    //   668: iconst_1
    //   669: invokevirtual setAccessible : (Z)V
    //   672: aload #5
    //   674: aload #6
    //   676: iconst_0
    //   677: anewarray java/lang/Object
    //   680: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   683: iconst_4
    //   684: anewarray java/lang/Object
    //   687: dup
    //   688: iconst_0
    //   689: sipush #-18345
    //   692: sipush #8872
    //   695: invokestatic a : (II)Ljava/lang/String;
    //   698: aastore
    //   699: dup
    //   700: iconst_1
    //   701: aload #4
    //   703: aastore
    //   704: dup
    //   705: iconst_2
    //   706: iconst_0
    //   707: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   710: aastore
    //   711: dup
    //   712: iconst_3
    //   713: aload #4
    //   715: arraylength
    //   716: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   719: aastore
    //   720: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   723: pop
    //   724: goto -> 728
    //   727: astore_3
    //   728: iconst_0
    //   729: istore_3
    //   730: getstatic burp/Zxn4.ZQ : Ljava/lang/String;
    //   733: getstatic burp/Zmyk.Za : Ljava/lang/Object;
    //   736: checkcast java/math/BigInteger
    //   739: invokevirtual intValue : ()I
    //   742: bipush #32
    //   744: irem
    //   745: invokestatic abs : (I)I
    //   748: invokevirtual charAt : (I)C
    //   751: getstatic burp/Zrov.ZU : Ljava/lang/String;
    //   754: getstatic burp/Zst7.ZI : Ljava/lang/Object;
    //   757: checkcast java/math/BigInteger
    //   760: invokevirtual intValue : ()I
    //   763: bipush #32
    //   765: irem
    //   766: invokestatic abs : (I)I
    //   769: invokevirtual charAt : (I)C
    //   772: if_icmple -> 1117
    //   775: sipush #-18341
    //   778: sipush #741
    //   781: invokestatic a : (II)Ljava/lang/String;
    //   784: iconst_1
    //   785: ldc burp/Zmy4
    //   787: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   790: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   793: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   796: astore #4
    //   798: aload #4
    //   800: arraylength
    //   801: istore #5
    //   803: iconst_0
    //   804: istore #6
    //   806: iload #6
    //   808: iload #5
    //   810: if_icmpge -> 948
    //   813: aload #4
    //   815: iload #6
    //   817: aaload
    //   818: astore #7
    //   820: aload #7
    //   822: invokevirtual getModifiers : ()I
    //   825: invokestatic isStatic : (I)Z
    //   828: ifne -> 838
    //   831: goto -> 941
    //   834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   837: athrow
    //   838: aload #7
    //   840: invokevirtual getType : ()Ljava/lang/Class;
    //   843: astore #8
    //   845: aload #8
    //   847: ifnull -> 928
    //   850: aload #8
    //   852: invokevirtual isPrimitive : ()Z
    //   855: ifne -> 928
    //   858: goto -> 865
    //   861: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   864: athrow
    //   865: aload #8
    //   867: invokevirtual getPackage : ()Ljava/lang/Package;
    //   870: ifnull -> 928
    //   873: goto -> 880
    //   876: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   879: athrow
    //   880: aload #8
    //   882: invokevirtual getPackage : ()Ljava/lang/Package;
    //   885: invokevirtual getName : ()Ljava/lang/String;
    //   888: ifnull -> 928
    //   891: goto -> 898
    //   894: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   897: athrow
    //   898: aload #8
    //   900: invokevirtual getPackage : ()Ljava/lang/Package;
    //   903: invokevirtual getName : ()Ljava/lang/String;
    //   906: sipush #-18358
    //   909: sipush #-11534
    //   912: invokestatic a : (II)Ljava/lang/String;
    //   915: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   918: ifne -> 928
    //   921: goto -> 928
    //   924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   927: athrow
    //   928: aload #7
    //   930: iconst_1
    //   931: invokevirtual setAccessible : (Z)V
    //   934: aload #7
    //   936: aconst_null
    //   937: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   940: pop
    //   941: iinc #6, 1
    //   944: iload_2
    //   945: ifne -> 806
    //   948: sipush #-18356
    //   951: sipush #-28669
    //   954: invokestatic a : (II)Ljava/lang/String;
    //   957: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   960: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   963: astore #4
    //   965: aload #4
    //   967: arraylength
    //   968: istore #5
    //   970: iconst_0
    //   971: istore #6
    //   973: iload #6
    //   975: iload #5
    //   977: if_icmpge -> 1113
    //   980: aload #4
    //   982: iload #6
    //   984: aaload
    //   985: astore #7
    //   987: aload #7
    //   989: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   992: pop
    //   993: aload #7
    //   995: invokevirtual getModifiers : ()I
    //   998: invokestatic isStatic : (I)Z
    //   1001: ifeq -> 1099
    //   1004: aload #7
    //   1006: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1009: arraylength
    //   1010: iconst_2
    //   1011: if_icmpne -> 1099
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload #7
    //   1023: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1026: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1029: if_acmpne -> 1099
    //   1032: goto -> 1039
    //   1035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1038: athrow
    //   1039: aload #7
    //   1041: iconst_1
    //   1042: invokevirtual setAccessible : (Z)V
    //   1045: aload #7
    //   1047: aconst_null
    //   1048: iconst_2
    //   1049: anewarray java/lang/Object
    //   1052: dup
    //   1053: iconst_0
    //   1054: aload_0
    //   1055: aastore
    //   1056: dup
    //   1057: iconst_1
    //   1058: aload_1
    //   1059: ifnonnull -> 1077
    //   1062: goto -> 1069
    //   1065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1068: athrow
    //   1069: aload_1
    //   1070: goto -> 1084
    //   1073: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1076: athrow
    //   1077: aload_1
    //   1078: checkcast [B
    //   1081: invokevirtual clone : ()Ljava/lang/Object;
    //   1084: aastore
    //   1085: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1088: checkcast java/lang/Boolean
    //   1091: invokevirtual booleanValue : ()Z
    //   1094: istore_3
    //   1095: iload_2
    //   1096: ifne -> 1113
    //   1099: iinc #6, 1
    //   1102: iload_2
    //   1103: ifne -> 973
    //   1106: goto -> 1113
    //   1109: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1112: athrow
    //   1113: iload_2
    //   1114: ifne -> 1455
    //   1117: sipush #-18361
    //   1120: sipush #21220
    //   1123: invokestatic a : (II)Ljava/lang/String;
    //   1126: iconst_1
    //   1127: ldc burp/Zl2q
    //   1129: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1132: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1135: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1138: astore #4
    //   1140: aload #4
    //   1142: arraylength
    //   1143: istore #5
    //   1145: iconst_0
    //   1146: istore #6
    //   1148: iload #6
    //   1150: iload #5
    //   1152: if_icmpge -> 1290
    //   1155: aload #4
    //   1157: iload #6
    //   1159: aaload
    //   1160: astore #7
    //   1162: aload #7
    //   1164: invokevirtual getModifiers : ()I
    //   1167: invokestatic isStatic : (I)Z
    //   1170: ifne -> 1180
    //   1173: goto -> 1283
    //   1176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1179: athrow
    //   1180: aload #7
    //   1182: invokevirtual getType : ()Ljava/lang/Class;
    //   1185: astore #8
    //   1187: aload #8
    //   1189: ifnull -> 1270
    //   1192: aload #8
    //   1194: invokevirtual isPrimitive : ()Z
    //   1197: ifne -> 1270
    //   1200: goto -> 1207
    //   1203: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1206: athrow
    //   1207: aload #8
    //   1209: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1212: ifnull -> 1270
    //   1215: goto -> 1222
    //   1218: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1221: athrow
    //   1222: aload #8
    //   1224: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1227: invokevirtual getName : ()Ljava/lang/String;
    //   1230: ifnull -> 1270
    //   1233: goto -> 1240
    //   1236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1239: athrow
    //   1240: aload #8
    //   1242: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1245: invokevirtual getName : ()Ljava/lang/String;
    //   1248: sipush #-18358
    //   1251: sipush #-11534
    //   1254: invokestatic a : (II)Ljava/lang/String;
    //   1257: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1260: ifne -> 1270
    //   1263: goto -> 1270
    //   1266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1269: athrow
    //   1270: aload #7
    //   1272: iconst_1
    //   1273: invokevirtual setAccessible : (Z)V
    //   1276: aload #7
    //   1278: aconst_null
    //   1279: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1282: pop
    //   1283: iinc #6, 1
    //   1286: iload_2
    //   1287: ifne -> 1148
    //   1290: sipush #-18342
    //   1293: sipush #5070
    //   1296: invokestatic a : (II)Ljava/lang/String;
    //   1299: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1302: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1305: astore #4
    //   1307: aload #4
    //   1309: arraylength
    //   1310: istore #5
    //   1312: iconst_0
    //   1313: istore #6
    //   1315: iload #6
    //   1317: iload #5
    //   1319: if_icmpge -> 1455
    //   1322: aload #4
    //   1324: iload #6
    //   1326: aaload
    //   1327: astore #7
    //   1329: aload #7
    //   1331: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1334: pop
    //   1335: aload #7
    //   1337: invokevirtual getModifiers : ()I
    //   1340: invokestatic isStatic : (I)Z
    //   1343: ifeq -> 1441
    //   1346: aload #7
    //   1348: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1351: arraylength
    //   1352: iconst_2
    //   1353: if_icmpne -> 1441
    //   1356: goto -> 1363
    //   1359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1362: athrow
    //   1363: aload #7
    //   1365: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1368: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1371: if_acmpne -> 1441
    //   1374: goto -> 1381
    //   1377: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1380: athrow
    //   1381: aload #7
    //   1383: iconst_1
    //   1384: invokevirtual setAccessible : (Z)V
    //   1387: aload #7
    //   1389: aconst_null
    //   1390: iconst_2
    //   1391: anewarray java/lang/Object
    //   1394: dup
    //   1395: iconst_0
    //   1396: aload_0
    //   1397: aastore
    //   1398: dup
    //   1399: iconst_1
    //   1400: aload_1
    //   1401: ifnonnull -> 1419
    //   1404: goto -> 1411
    //   1407: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1410: athrow
    //   1411: aload_1
    //   1412: goto -> 1426
    //   1415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1418: athrow
    //   1419: aload_1
    //   1420: checkcast [B
    //   1423: invokevirtual clone : ()Ljava/lang/Object;
    //   1426: aastore
    //   1427: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1430: checkcast java/lang/Boolean
    //   1433: invokevirtual booleanValue : ()Z
    //   1436: istore_3
    //   1437: iload_2
    //   1438: ifne -> 1455
    //   1441: iinc #6, 1
    //   1444: iload_2
    //   1445: ifne -> 1315
    //   1448: goto -> 1455
    //   1451: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1454: athrow
    //   1455: iload_3
    //   1456: ifeq -> 1461
    //   1459: iload_3
    //   1460: ireturn
    //   1461: getstatic burp/Zssc.ZR : Ljava/lang/String;
    //   1464: getstatic burp/Zrfa.Zj : Ljava/lang/Object;
    //   1467: checkcast java/math/BigInteger
    //   1470: invokevirtual intValue : ()I
    //   1473: bipush #32
    //   1475: irem
    //   1476: invokestatic abs : (I)I
    //   1479: invokevirtual charAt : (I)C
    //   1482: getstatic burp/Zzht.Zv : Ljava/lang/String;
    //   1485: getstatic burp/Zkf6.ZS : Ljava/lang/Object;
    //   1488: checkcast java/math/BigInteger
    //   1491: invokevirtual intValue : ()I
    //   1494: bipush #32
    //   1496: irem
    //   1497: invokestatic abs : (I)I
    //   1500: invokevirtual charAt : (I)C
    //   1503: if_icmple -> 1848
    //   1506: sipush #-18364
    //   1509: sipush #15579
    //   1512: invokestatic a : (II)Ljava/lang/String;
    //   1515: iconst_1
    //   1516: ldc burp/Zeyd
    //   1518: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1521: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1524: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1527: astore #4
    //   1529: aload #4
    //   1531: arraylength
    //   1532: istore #5
    //   1534: iconst_0
    //   1535: istore #6
    //   1537: iload #6
    //   1539: iload #5
    //   1541: if_icmpge -> 1679
    //   1544: aload #4
    //   1546: iload #6
    //   1548: aaload
    //   1549: astore #7
    //   1551: aload #7
    //   1553: invokevirtual getModifiers : ()I
    //   1556: invokestatic isStatic : (I)Z
    //   1559: ifne -> 1569
    //   1562: goto -> 1672
    //   1565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1568: athrow
    //   1569: aload #7
    //   1571: invokevirtual getType : ()Ljava/lang/Class;
    //   1574: astore #8
    //   1576: aload #8
    //   1578: ifnull -> 1659
    //   1581: aload #8
    //   1583: invokevirtual isPrimitive : ()Z
    //   1586: ifne -> 1659
    //   1589: goto -> 1596
    //   1592: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1595: athrow
    //   1596: aload #8
    //   1598: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1601: ifnull -> 1659
    //   1604: goto -> 1611
    //   1607: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1610: athrow
    //   1611: aload #8
    //   1613: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1616: invokevirtual getName : ()Ljava/lang/String;
    //   1619: ifnull -> 1659
    //   1622: goto -> 1629
    //   1625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1628: athrow
    //   1629: aload #8
    //   1631: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1634: invokevirtual getName : ()Ljava/lang/String;
    //   1637: sipush #-18358
    //   1640: sipush #-11534
    //   1643: invokestatic a : (II)Ljava/lang/String;
    //   1646: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1649: ifne -> 1659
    //   1652: goto -> 1659
    //   1655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1658: athrow
    //   1659: aload #7
    //   1661: iconst_1
    //   1662: invokevirtual setAccessible : (Z)V
    //   1665: aload #7
    //   1667: aconst_null
    //   1668: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1671: pop
    //   1672: iinc #6, 1
    //   1675: iload_2
    //   1676: ifne -> 1537
    //   1679: sipush #-18337
    //   1682: sipush #-32315
    //   1685: invokestatic a : (II)Ljava/lang/String;
    //   1688: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1691: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1694: astore #4
    //   1696: aload #4
    //   1698: arraylength
    //   1699: istore #5
    //   1701: iconst_0
    //   1702: istore #6
    //   1704: iload #6
    //   1706: iload #5
    //   1708: if_icmpge -> 1844
    //   1711: aload #4
    //   1713: iload #6
    //   1715: aaload
    //   1716: astore #7
    //   1718: aload #7
    //   1720: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1723: pop
    //   1724: aload #7
    //   1726: invokevirtual getModifiers : ()I
    //   1729: invokestatic isStatic : (I)Z
    //   1732: ifeq -> 1830
    //   1735: aload #7
    //   1737: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1740: arraylength
    //   1741: iconst_2
    //   1742: if_icmpne -> 1830
    //   1745: goto -> 1752
    //   1748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1751: athrow
    //   1752: aload #7
    //   1754: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1757: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1760: if_acmpne -> 1830
    //   1763: goto -> 1770
    //   1766: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1769: athrow
    //   1770: aload #7
    //   1772: iconst_1
    //   1773: invokevirtual setAccessible : (Z)V
    //   1776: aload #7
    //   1778: aconst_null
    //   1779: iconst_2
    //   1780: anewarray java/lang/Object
    //   1783: dup
    //   1784: iconst_0
    //   1785: aload_0
    //   1786: aastore
    //   1787: dup
    //   1788: iconst_1
    //   1789: aload_1
    //   1790: ifnonnull -> 1808
    //   1793: goto -> 1800
    //   1796: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1799: athrow
    //   1800: aload_1
    //   1801: goto -> 1815
    //   1804: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1807: athrow
    //   1808: aload_1
    //   1809: checkcast [B
    //   1812: invokevirtual clone : ()Ljava/lang/Object;
    //   1815: aastore
    //   1816: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1819: checkcast java/lang/Boolean
    //   1822: invokevirtual booleanValue : ()Z
    //   1825: istore_3
    //   1826: iload_2
    //   1827: ifne -> 1844
    //   1830: iinc #6, 1
    //   1833: iload_2
    //   1834: ifne -> 1704
    //   1837: goto -> 1844
    //   1840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1843: athrow
    //   1844: iload_2
    //   1845: ifne -> 2186
    //   1848: sipush #-18339
    //   1851: sipush #14178
    //   1854: invokestatic a : (II)Ljava/lang/String;
    //   1857: iconst_1
    //   1858: ldc burp/Zs6g
    //   1860: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1863: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1866: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1869: astore #4
    //   1871: aload #4
    //   1873: arraylength
    //   1874: istore #5
    //   1876: iconst_0
    //   1877: istore #6
    //   1879: iload #6
    //   1881: iload #5
    //   1883: if_icmpge -> 2021
    //   1886: aload #4
    //   1888: iload #6
    //   1890: aaload
    //   1891: astore #7
    //   1893: aload #7
    //   1895: invokevirtual getModifiers : ()I
    //   1898: invokestatic isStatic : (I)Z
    //   1901: ifne -> 1911
    //   1904: goto -> 2014
    //   1907: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1910: athrow
    //   1911: aload #7
    //   1913: invokevirtual getType : ()Ljava/lang/Class;
    //   1916: astore #8
    //   1918: aload #8
    //   1920: ifnull -> 2001
    //   1923: aload #8
    //   1925: invokevirtual isPrimitive : ()Z
    //   1928: ifne -> 2001
    //   1931: goto -> 1938
    //   1934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1937: athrow
    //   1938: aload #8
    //   1940: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1943: ifnull -> 2001
    //   1946: goto -> 1953
    //   1949: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1952: athrow
    //   1953: aload #8
    //   1955: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1958: invokevirtual getName : ()Ljava/lang/String;
    //   1961: ifnull -> 2001
    //   1964: goto -> 1971
    //   1967: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1970: athrow
    //   1971: aload #8
    //   1973: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1976: invokevirtual getName : ()Ljava/lang/String;
    //   1979: sipush #-18358
    //   1982: sipush #-11534
    //   1985: invokestatic a : (II)Ljava/lang/String;
    //   1988: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1991: ifne -> 2001
    //   1994: goto -> 2001
    //   1997: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2000: athrow
    //   2001: aload #7
    //   2003: iconst_1
    //   2004: invokevirtual setAccessible : (Z)V
    //   2007: aload #7
    //   2009: aconst_null
    //   2010: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2013: pop
    //   2014: iinc #6, 1
    //   2017: iload_2
    //   2018: ifne -> 1879
    //   2021: sipush #-18346
    //   2024: sipush #-27226
    //   2027: invokestatic a : (II)Ljava/lang/String;
    //   2030: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2033: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2036: astore #4
    //   2038: aload #4
    //   2040: arraylength
    //   2041: istore #5
    //   2043: iconst_0
    //   2044: istore #6
    //   2046: iload #6
    //   2048: iload #5
    //   2050: if_icmpge -> 2186
    //   2053: aload #4
    //   2055: iload #6
    //   2057: aaload
    //   2058: astore #7
    //   2060: aload #7
    //   2062: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2065: pop
    //   2066: aload #7
    //   2068: invokevirtual getModifiers : ()I
    //   2071: invokestatic isStatic : (I)Z
    //   2074: ifeq -> 2172
    //   2077: aload #7
    //   2079: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2082: arraylength
    //   2083: iconst_2
    //   2084: if_icmpne -> 2172
    //   2087: goto -> 2094
    //   2090: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2093: athrow
    //   2094: aload #7
    //   2096: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2099: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2102: if_acmpne -> 2172
    //   2105: goto -> 2112
    //   2108: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2111: athrow
    //   2112: aload #7
    //   2114: iconst_1
    //   2115: invokevirtual setAccessible : (Z)V
    //   2118: aload #7
    //   2120: aconst_null
    //   2121: iconst_2
    //   2122: anewarray java/lang/Object
    //   2125: dup
    //   2126: iconst_0
    //   2127: aload_0
    //   2128: aastore
    //   2129: dup
    //   2130: iconst_1
    //   2131: aload_1
    //   2132: ifnonnull -> 2150
    //   2135: goto -> 2142
    //   2138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2141: athrow
    //   2142: aload_1
    //   2143: goto -> 2157
    //   2146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2149: athrow
    //   2150: aload_1
    //   2151: checkcast [B
    //   2154: invokevirtual clone : ()Ljava/lang/Object;
    //   2157: aastore
    //   2158: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2161: checkcast java/lang/Boolean
    //   2164: invokevirtual booleanValue : ()Z
    //   2167: istore_3
    //   2168: iload_2
    //   2169: ifne -> 2186
    //   2172: iinc #6, 1
    //   2175: iload_2
    //   2176: ifne -> 2046
    //   2179: goto -> 2186
    //   2182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2185: athrow
    //   2186: iload_3
    //   2187: ifeq -> 2192
    //   2190: iload_3
    //   2191: ireturn
    //   2192: getstatic burp/Zxd1.ZQ : Ljava/lang/String;
    //   2195: getstatic burp/Zsn3.Zy : Ljava/lang/Object;
    //   2198: checkcast java/math/BigInteger
    //   2201: invokevirtual intValue : ()I
    //   2204: bipush #32
    //   2206: irem
    //   2207: invokestatic abs : (I)I
    //   2210: invokevirtual charAt : (I)C
    //   2213: getstatic burp/Zv8d.Zi : Ljava/lang/String;
    //   2216: getstatic burp/Zzre.ZE : Ljava/lang/Object;
    //   2219: checkcast java/math/BigInteger
    //   2222: invokevirtual intValue : ()I
    //   2225: bipush #32
    //   2227: irem
    //   2228: invokestatic abs : (I)I
    //   2231: invokevirtual charAt : (I)C
    //   2234: if_icmpgt -> 2579
    //   2237: sipush #-18357
    //   2240: sipush #-9038
    //   2243: invokestatic a : (II)Ljava/lang/String;
    //   2246: iconst_1
    //   2247: ldc burp/Zt7k
    //   2249: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2252: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2255: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2258: astore #4
    //   2260: aload #4
    //   2262: arraylength
    //   2263: istore #5
    //   2265: iconst_0
    //   2266: istore #6
    //   2268: iload #6
    //   2270: iload #5
    //   2272: if_icmpge -> 2410
    //   2275: aload #4
    //   2277: iload #6
    //   2279: aaload
    //   2280: astore #7
    //   2282: aload #7
    //   2284: invokevirtual getModifiers : ()I
    //   2287: invokestatic isStatic : (I)Z
    //   2290: ifne -> 2300
    //   2293: goto -> 2403
    //   2296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2299: athrow
    //   2300: aload #7
    //   2302: invokevirtual getType : ()Ljava/lang/Class;
    //   2305: astore #8
    //   2307: aload #8
    //   2309: ifnull -> 2390
    //   2312: aload #8
    //   2314: invokevirtual isPrimitive : ()Z
    //   2317: ifne -> 2390
    //   2320: goto -> 2327
    //   2323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2326: athrow
    //   2327: aload #8
    //   2329: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2332: ifnull -> 2390
    //   2335: goto -> 2342
    //   2338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2341: athrow
    //   2342: aload #8
    //   2344: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2347: invokevirtual getName : ()Ljava/lang/String;
    //   2350: ifnull -> 2390
    //   2353: goto -> 2360
    //   2356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2359: athrow
    //   2360: aload #8
    //   2362: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2365: invokevirtual getName : ()Ljava/lang/String;
    //   2368: sipush #-18358
    //   2371: sipush #-11534
    //   2374: invokestatic a : (II)Ljava/lang/String;
    //   2377: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2380: ifne -> 2390
    //   2383: goto -> 2390
    //   2386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2389: athrow
    //   2390: aload #7
    //   2392: iconst_1
    //   2393: invokevirtual setAccessible : (Z)V
    //   2396: aload #7
    //   2398: aconst_null
    //   2399: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2402: pop
    //   2403: iinc #6, 1
    //   2406: iload_2
    //   2407: ifne -> 2268
    //   2410: sipush #-18351
    //   2413: sipush #7436
    //   2416: invokestatic a : (II)Ljava/lang/String;
    //   2419: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2422: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2425: astore #4
    //   2427: aload #4
    //   2429: arraylength
    //   2430: istore #5
    //   2432: iconst_0
    //   2433: istore #6
    //   2435: iload #6
    //   2437: iload #5
    //   2439: if_icmpge -> 2575
    //   2442: aload #4
    //   2444: iload #6
    //   2446: aaload
    //   2447: astore #7
    //   2449: aload #7
    //   2451: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2454: pop
    //   2455: aload #7
    //   2457: invokevirtual getModifiers : ()I
    //   2460: invokestatic isStatic : (I)Z
    //   2463: ifeq -> 2561
    //   2466: aload #7
    //   2468: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2471: arraylength
    //   2472: iconst_2
    //   2473: if_icmpne -> 2561
    //   2476: goto -> 2483
    //   2479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2482: athrow
    //   2483: aload #7
    //   2485: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2488: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2491: if_acmpne -> 2561
    //   2494: goto -> 2501
    //   2497: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2500: athrow
    //   2501: aload #7
    //   2503: iconst_1
    //   2504: invokevirtual setAccessible : (Z)V
    //   2507: aload #7
    //   2509: aconst_null
    //   2510: iconst_2
    //   2511: anewarray java/lang/Object
    //   2514: dup
    //   2515: iconst_0
    //   2516: aload_0
    //   2517: aastore
    //   2518: dup
    //   2519: iconst_1
    //   2520: aload_1
    //   2521: ifnonnull -> 2539
    //   2524: goto -> 2531
    //   2527: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2530: athrow
    //   2531: aload_1
    //   2532: goto -> 2546
    //   2535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2538: athrow
    //   2539: aload_1
    //   2540: checkcast [B
    //   2543: invokevirtual clone : ()Ljava/lang/Object;
    //   2546: aastore
    //   2547: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2550: checkcast java/lang/Boolean
    //   2553: invokevirtual booleanValue : ()Z
    //   2556: istore_3
    //   2557: iload_2
    //   2558: ifne -> 2575
    //   2561: iinc #6, 1
    //   2564: iload_2
    //   2565: ifne -> 2435
    //   2568: goto -> 2575
    //   2571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2574: athrow
    //   2575: iload_2
    //   2576: ifne -> 2917
    //   2579: sipush #-18349
    //   2582: sipush #-14154
    //   2585: invokestatic a : (II)Ljava/lang/String;
    //   2588: iconst_1
    //   2589: ldc burp/Zlsw
    //   2591: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2594: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2597: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2600: astore #4
    //   2602: aload #4
    //   2604: arraylength
    //   2605: istore #5
    //   2607: iconst_0
    //   2608: istore #6
    //   2610: iload #6
    //   2612: iload #5
    //   2614: if_icmpge -> 2752
    //   2617: aload #4
    //   2619: iload #6
    //   2621: aaload
    //   2622: astore #7
    //   2624: aload #7
    //   2626: invokevirtual getModifiers : ()I
    //   2629: invokestatic isStatic : (I)Z
    //   2632: ifne -> 2642
    //   2635: goto -> 2745
    //   2638: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2641: athrow
    //   2642: aload #7
    //   2644: invokevirtual getType : ()Ljava/lang/Class;
    //   2647: astore #8
    //   2649: aload #8
    //   2651: ifnull -> 2732
    //   2654: aload #8
    //   2656: invokevirtual isPrimitive : ()Z
    //   2659: ifne -> 2732
    //   2662: goto -> 2669
    //   2665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2668: athrow
    //   2669: aload #8
    //   2671: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2674: ifnull -> 2732
    //   2677: goto -> 2684
    //   2680: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2683: athrow
    //   2684: aload #8
    //   2686: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2689: invokevirtual getName : ()Ljava/lang/String;
    //   2692: ifnull -> 2732
    //   2695: goto -> 2702
    //   2698: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2701: athrow
    //   2702: aload #8
    //   2704: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2707: invokevirtual getName : ()Ljava/lang/String;
    //   2710: sipush #-18358
    //   2713: sipush #-11534
    //   2716: invokestatic a : (II)Ljava/lang/String;
    //   2719: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2722: ifne -> 2732
    //   2725: goto -> 2732
    //   2728: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2731: athrow
    //   2732: aload #7
    //   2734: iconst_1
    //   2735: invokevirtual setAccessible : (Z)V
    //   2738: aload #7
    //   2740: aconst_null
    //   2741: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2744: pop
    //   2745: iinc #6, 1
    //   2748: iload_2
    //   2749: ifne -> 2610
    //   2752: sipush #-18338
    //   2755: sipush #2301
    //   2758: invokestatic a : (II)Ljava/lang/String;
    //   2761: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2764: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2767: astore #4
    //   2769: aload #4
    //   2771: arraylength
    //   2772: istore #5
    //   2774: iconst_0
    //   2775: istore #6
    //   2777: iload #6
    //   2779: iload #5
    //   2781: if_icmpge -> 2917
    //   2784: aload #4
    //   2786: iload #6
    //   2788: aaload
    //   2789: astore #7
    //   2791: aload #7
    //   2793: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2796: pop
    //   2797: aload #7
    //   2799: invokevirtual getModifiers : ()I
    //   2802: invokestatic isStatic : (I)Z
    //   2805: ifeq -> 2903
    //   2808: aload #7
    //   2810: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2813: arraylength
    //   2814: iconst_2
    //   2815: if_icmpne -> 2903
    //   2818: goto -> 2825
    //   2821: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2824: athrow
    //   2825: aload #7
    //   2827: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2830: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2833: if_acmpne -> 2903
    //   2836: goto -> 2843
    //   2839: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2842: athrow
    //   2843: aload #7
    //   2845: iconst_1
    //   2846: invokevirtual setAccessible : (Z)V
    //   2849: aload #7
    //   2851: aconst_null
    //   2852: iconst_2
    //   2853: anewarray java/lang/Object
    //   2856: dup
    //   2857: iconst_0
    //   2858: aload_0
    //   2859: aastore
    //   2860: dup
    //   2861: iconst_1
    //   2862: aload_1
    //   2863: ifnonnull -> 2881
    //   2866: goto -> 2873
    //   2869: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2872: athrow
    //   2873: aload_1
    //   2874: goto -> 2888
    //   2877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2880: athrow
    //   2881: aload_1
    //   2882: checkcast [B
    //   2885: invokevirtual clone : ()Ljava/lang/Object;
    //   2888: aastore
    //   2889: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2892: checkcast java/lang/Boolean
    //   2895: invokevirtual booleanValue : ()Z
    //   2898: istore_3
    //   2899: iload_2
    //   2900: ifne -> 2917
    //   2903: iinc #6, 1
    //   2906: iload_2
    //   2907: ifne -> 2777
    //   2910: goto -> 2917
    //   2913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2916: athrow
    //   2917: iload_3
    //   2918: ifeq -> 2923
    //   2921: iload_3
    //   2922: ireturn
    //   2923: getstatic burp/Zgis.Zh : Ljava/lang/String;
    //   2926: getstatic burp/Ztwp.Ze : Ljava/lang/Object;
    //   2929: checkcast java/math/BigInteger
    //   2932: invokevirtual intValue : ()I
    //   2935: bipush #32
    //   2937: irem
    //   2938: invokestatic abs : (I)I
    //   2941: invokevirtual charAt : (I)C
    //   2944: getstatic burp/Zrzg.ZX : Ljava/lang/String;
    //   2947: getstatic burp/Zskf.ZQ : Ljava/lang/Object;
    //   2950: checkcast java/math/BigInteger
    //   2953: invokevirtual intValue : ()I
    //   2956: bipush #32
    //   2958: irem
    //   2959: invokestatic abs : (I)I
    //   2962: invokevirtual charAt : (I)C
    //   2965: if_icmpgt -> 3310
    //   2968: sipush #-18363
    //   2971: sipush #21806
    //   2974: invokestatic a : (II)Ljava/lang/String;
    //   2977: iconst_1
    //   2978: ldc burp/Zlpj
    //   2980: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2983: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2986: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2989: astore #4
    //   2991: aload #4
    //   2993: arraylength
    //   2994: istore #5
    //   2996: iconst_0
    //   2997: istore #6
    //   2999: iload #6
    //   3001: iload #5
    //   3003: if_icmpge -> 3141
    //   3006: aload #4
    //   3008: iload #6
    //   3010: aaload
    //   3011: astore #7
    //   3013: aload #7
    //   3015: invokevirtual getModifiers : ()I
    //   3018: invokestatic isStatic : (I)Z
    //   3021: ifne -> 3031
    //   3024: goto -> 3134
    //   3027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3030: athrow
    //   3031: aload #7
    //   3033: invokevirtual getType : ()Ljava/lang/Class;
    //   3036: astore #8
    //   3038: aload #8
    //   3040: ifnull -> 3121
    //   3043: aload #8
    //   3045: invokevirtual isPrimitive : ()Z
    //   3048: ifne -> 3121
    //   3051: goto -> 3058
    //   3054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3057: athrow
    //   3058: aload #8
    //   3060: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3063: ifnull -> 3121
    //   3066: goto -> 3073
    //   3069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3072: athrow
    //   3073: aload #8
    //   3075: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3078: invokevirtual getName : ()Ljava/lang/String;
    //   3081: ifnull -> 3121
    //   3084: goto -> 3091
    //   3087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3090: athrow
    //   3091: aload #8
    //   3093: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3096: invokevirtual getName : ()Ljava/lang/String;
    //   3099: sipush #-18358
    //   3102: sipush #-11534
    //   3105: invokestatic a : (II)Ljava/lang/String;
    //   3108: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3111: ifne -> 3121
    //   3114: goto -> 3121
    //   3117: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3120: athrow
    //   3121: aload #7
    //   3123: iconst_1
    //   3124: invokevirtual setAccessible : (Z)V
    //   3127: aload #7
    //   3129: aconst_null
    //   3130: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3133: pop
    //   3134: iinc #6, 1
    //   3137: iload_2
    //   3138: ifne -> 2999
    //   3141: sipush #-18360
    //   3144: sipush #10205
    //   3147: invokestatic a : (II)Ljava/lang/String;
    //   3150: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3153: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3156: astore #4
    //   3158: aload #4
    //   3160: arraylength
    //   3161: istore #5
    //   3163: iconst_0
    //   3164: istore #6
    //   3166: iload #6
    //   3168: iload #5
    //   3170: if_icmpge -> 3306
    //   3173: aload #4
    //   3175: iload #6
    //   3177: aaload
    //   3178: astore #7
    //   3180: aload #7
    //   3182: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3185: pop
    //   3186: aload #7
    //   3188: invokevirtual getModifiers : ()I
    //   3191: invokestatic isStatic : (I)Z
    //   3194: ifeq -> 3292
    //   3197: aload #7
    //   3199: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3202: arraylength
    //   3203: iconst_2
    //   3204: if_icmpne -> 3292
    //   3207: goto -> 3214
    //   3210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3213: athrow
    //   3214: aload #7
    //   3216: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3219: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3222: if_acmpne -> 3292
    //   3225: goto -> 3232
    //   3228: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3231: athrow
    //   3232: aload #7
    //   3234: iconst_1
    //   3235: invokevirtual setAccessible : (Z)V
    //   3238: aload #7
    //   3240: aconst_null
    //   3241: iconst_2
    //   3242: anewarray java/lang/Object
    //   3245: dup
    //   3246: iconst_0
    //   3247: aload_0
    //   3248: aastore
    //   3249: dup
    //   3250: iconst_1
    //   3251: aload_1
    //   3252: ifnonnull -> 3270
    //   3255: goto -> 3262
    //   3258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3261: athrow
    //   3262: aload_1
    //   3263: goto -> 3277
    //   3266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3269: athrow
    //   3270: aload_1
    //   3271: checkcast [B
    //   3274: invokevirtual clone : ()Ljava/lang/Object;
    //   3277: aastore
    //   3278: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3281: checkcast java/lang/Boolean
    //   3284: invokevirtual booleanValue : ()Z
    //   3287: istore_3
    //   3288: iload_2
    //   3289: ifne -> 3306
    //   3292: iinc #6, 1
    //   3295: iload_2
    //   3296: ifne -> 3166
    //   3299: goto -> 3306
    //   3302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3305: athrow
    //   3306: iload_2
    //   3307: ifne -> 3648
    //   3310: sipush #-18348
    //   3313: sipush #24976
    //   3316: invokestatic a : (II)Ljava/lang/String;
    //   3319: iconst_1
    //   3320: ldc burp/Zl3l
    //   3322: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3325: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3328: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3331: astore #4
    //   3333: aload #4
    //   3335: arraylength
    //   3336: istore #5
    //   3338: iconst_0
    //   3339: istore #6
    //   3341: iload #6
    //   3343: iload #5
    //   3345: if_icmpge -> 3483
    //   3348: aload #4
    //   3350: iload #6
    //   3352: aaload
    //   3353: astore #7
    //   3355: aload #7
    //   3357: invokevirtual getModifiers : ()I
    //   3360: invokestatic isStatic : (I)Z
    //   3363: ifne -> 3373
    //   3366: goto -> 3476
    //   3369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3372: athrow
    //   3373: aload #7
    //   3375: invokevirtual getType : ()Ljava/lang/Class;
    //   3378: astore #8
    //   3380: aload #8
    //   3382: ifnull -> 3463
    //   3385: aload #8
    //   3387: invokevirtual isPrimitive : ()Z
    //   3390: ifne -> 3463
    //   3393: goto -> 3400
    //   3396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3399: athrow
    //   3400: aload #8
    //   3402: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3405: ifnull -> 3463
    //   3408: goto -> 3415
    //   3411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3414: athrow
    //   3415: aload #8
    //   3417: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3420: invokevirtual getName : ()Ljava/lang/String;
    //   3423: ifnull -> 3463
    //   3426: goto -> 3433
    //   3429: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3432: athrow
    //   3433: aload #8
    //   3435: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3438: invokevirtual getName : ()Ljava/lang/String;
    //   3441: sipush #-18358
    //   3444: sipush #-11534
    //   3447: invokestatic a : (II)Ljava/lang/String;
    //   3450: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3453: ifne -> 3463
    //   3456: goto -> 3463
    //   3459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3462: athrow
    //   3463: aload #7
    //   3465: iconst_1
    //   3466: invokevirtual setAccessible : (Z)V
    //   3469: aload #7
    //   3471: aconst_null
    //   3472: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3475: pop
    //   3476: iinc #6, 1
    //   3479: iload_2
    //   3480: ifne -> 3341
    //   3483: sipush #-18359
    //   3486: sipush #31883
    //   3489: invokestatic a : (II)Ljava/lang/String;
    //   3492: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3495: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3498: astore #4
    //   3500: aload #4
    //   3502: arraylength
    //   3503: istore #5
    //   3505: iconst_0
    //   3506: istore #6
    //   3508: iload #6
    //   3510: iload #5
    //   3512: if_icmpge -> 3648
    //   3515: aload #4
    //   3517: iload #6
    //   3519: aaload
    //   3520: astore #7
    //   3522: aload #7
    //   3524: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3527: pop
    //   3528: aload #7
    //   3530: invokevirtual getModifiers : ()I
    //   3533: invokestatic isStatic : (I)Z
    //   3536: ifeq -> 3634
    //   3539: aload #7
    //   3541: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3544: arraylength
    //   3545: iconst_2
    //   3546: if_icmpne -> 3634
    //   3549: goto -> 3556
    //   3552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3555: athrow
    //   3556: aload #7
    //   3558: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3561: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3564: if_acmpne -> 3634
    //   3567: goto -> 3574
    //   3570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3573: athrow
    //   3574: aload #7
    //   3576: iconst_1
    //   3577: invokevirtual setAccessible : (Z)V
    //   3580: aload #7
    //   3582: aconst_null
    //   3583: iconst_2
    //   3584: anewarray java/lang/Object
    //   3587: dup
    //   3588: iconst_0
    //   3589: aload_0
    //   3590: aastore
    //   3591: dup
    //   3592: iconst_1
    //   3593: aload_1
    //   3594: ifnonnull -> 3612
    //   3597: goto -> 3604
    //   3600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3603: athrow
    //   3604: aload_1
    //   3605: goto -> 3619
    //   3608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3611: athrow
    //   3612: aload_1
    //   3613: checkcast [B
    //   3616: invokevirtual clone : ()Ljava/lang/Object;
    //   3619: aastore
    //   3620: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3623: checkcast java/lang/Boolean
    //   3626: invokevirtual booleanValue : ()Z
    //   3629: istore_3
    //   3630: iload_2
    //   3631: ifne -> 3648
    //   3634: iinc #6, 1
    //   3637: iload_2
    //   3638: ifne -> 3508
    //   3641: goto -> 3648
    //   3644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3647: athrow
    //   3648: iload_3
    //   3649: ireturn
    //   3650: astore_3
    //   3651: new java/lang/Exception
    //   3654: dup
    //   3655: aload_3
    //   3656: invokevirtual getMessage : ()Ljava/lang/String;
    //   3659: invokespecial <init> : (Ljava/lang/String;)V
    //   3662: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1460	3650	java/lang/Throwable
    //   100	114	114	java/lang/Throwable
    //   125	138	141	java/lang/Throwable
    //   130	153	156	java/lang/Throwable
    //   145	171	174	java/lang/Throwable
    //   160	201	204	java/lang/Throwable
    //   264	291	294	java/lang/Throwable
    //   281	312	315	java/lang/Throwable
    //   298	342	345	java/lang/Throwable
    //   319	353	353	java/lang/Throwable
    //   364	380	383	java/lang/Throwable
    //   387	724	727	java/lang/Throwable
    //   558	568	568	java/lang/Throwable
    //   572	584	584	java/lang/Throwable
    //   588	600	600	java/lang/Throwable
    //   604	617	617	java/lang/Throwable
    //   621	634	634	java/lang/Throwable
    //   820	834	834	java/lang/Throwable
    //   845	858	861	java/lang/Throwable
    //   850	873	876	java/lang/Throwable
    //   865	891	894	java/lang/Throwable
    //   880	921	924	java/lang/Throwable
    //   987	1014	1017	java/lang/Throwable
    //   1004	1032	1035	java/lang/Throwable
    //   1021	1062	1065	java/lang/Throwable
    //   1039	1073	1073	java/lang/Throwable
    //   1095	1106	1109	java/lang/Throwable
    //   1162	1176	1176	java/lang/Throwable
    //   1187	1200	1203	java/lang/Throwable
    //   1192	1215	1218	java/lang/Throwable
    //   1207	1233	1236	java/lang/Throwable
    //   1222	1263	1266	java/lang/Throwable
    //   1329	1356	1359	java/lang/Throwable
    //   1346	1374	1377	java/lang/Throwable
    //   1363	1404	1407	java/lang/Throwable
    //   1381	1415	1415	java/lang/Throwable
    //   1437	1448	1451	java/lang/Throwable
    //   1461	2191	3650	java/lang/Throwable
    //   1551	1565	1565	java/lang/Throwable
    //   1576	1589	1592	java/lang/Throwable
    //   1581	1604	1607	java/lang/Throwable
    //   1596	1622	1625	java/lang/Throwable
    //   1611	1652	1655	java/lang/Throwable
    //   1718	1745	1748	java/lang/Throwable
    //   1735	1763	1766	java/lang/Throwable
    //   1752	1793	1796	java/lang/Throwable
    //   1770	1804	1804	java/lang/Throwable
    //   1826	1837	1840	java/lang/Throwable
    //   1893	1907	1907	java/lang/Throwable
    //   1918	1931	1934	java/lang/Throwable
    //   1923	1946	1949	java/lang/Throwable
    //   1938	1964	1967	java/lang/Throwable
    //   1953	1994	1997	java/lang/Throwable
    //   2060	2087	2090	java/lang/Throwable
    //   2077	2105	2108	java/lang/Throwable
    //   2094	2135	2138	java/lang/Throwable
    //   2112	2146	2146	java/lang/Throwable
    //   2168	2179	2182	java/lang/Throwable
    //   2192	2922	3650	java/lang/Throwable
    //   2282	2296	2296	java/lang/Throwable
    //   2307	2320	2323	java/lang/Throwable
    //   2312	2335	2338	java/lang/Throwable
    //   2327	2353	2356	java/lang/Throwable
    //   2342	2383	2386	java/lang/Throwable
    //   2449	2476	2479	java/lang/Throwable
    //   2466	2494	2497	java/lang/Throwable
    //   2483	2524	2527	java/lang/Throwable
    //   2501	2535	2535	java/lang/Throwable
    //   2557	2568	2571	java/lang/Throwable
    //   2624	2638	2638	java/lang/Throwable
    //   2649	2662	2665	java/lang/Throwable
    //   2654	2677	2680	java/lang/Throwable
    //   2669	2695	2698	java/lang/Throwable
    //   2684	2725	2728	java/lang/Throwable
    //   2791	2818	2821	java/lang/Throwable
    //   2808	2836	2839	java/lang/Throwable
    //   2825	2866	2869	java/lang/Throwable
    //   2843	2877	2877	java/lang/Throwable
    //   2899	2910	2913	java/lang/Throwable
    //   2923	3649	3650	java/lang/Throwable
    //   3013	3027	3027	java/lang/Throwable
    //   3038	3051	3054	java/lang/Throwable
    //   3043	3066	3069	java/lang/Throwable
    //   3058	3084	3087	java/lang/Throwable
    //   3073	3114	3117	java/lang/Throwable
    //   3180	3207	3210	java/lang/Throwable
    //   3197	3225	3228	java/lang/Throwable
    //   3214	3255	3258	java/lang/Throwable
    //   3232	3266	3266	java/lang/Throwable
    //   3288	3299	3302	java/lang/Throwable
    //   3355	3369	3369	java/lang/Throwable
    //   3380	3393	3396	java/lang/Throwable
    //   3385	3408	3411	java/lang/Throwable
    //   3400	3426	3429	java/lang/Throwable
    //   3415	3456	3459	java/lang/Throwable
    //   3522	3549	3552	java/lang/Throwable
    //   3539	3567	3570	java/lang/Throwable
    //   3556	3597	3600	java/lang/Throwable
    //   3574	3608	3608	java/lang/Throwable
    //   3630	3641	3644	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'L®Ñ§íÚ\\tÀòVÒÎ]p§«JÕEhªÝ\\r¸\\tC\äYt°\\tâFÆ`Û÷õâ¼æt\\n®³¼ÔÅ7Øeë§×\\tÝëõñº9ÿh(\\b£Mø­$;MêkêÌ;AjûÕQ«ËHY°7ÕãÎ%ßFÍMmeòÓ~dÊ[RUÍ_þðRWöº|O\\rÆv+Mwm­5°Â~P"Ô Þî3{F/J;{\\f7hgÿóÈ¸ï¬Éºý/r\\tÌ¢×Øþoq\\tS$ïú¬U\\tº8'vT×\\tæÇÜ\\t°¨X4V£\\túì&i\\t%±êºYP¥K:\\nXìX¶X{zîXÂíB\Ìár&séu»ÙÓ¥ctùj*Åõ\\f5ù·Ãfv^\\b8çâþ+^Þ\\f\\f\\fú]&£ X'ÏCæÂ Û«>»Fï[ïªªíoúMÉh\\t\\n³úåX (\\t\\to=é Q:\\t\^ÏçX¶¯.ÞI\\t1h\\\t®\\t~ÿCûoÞ§\\t®øwuP½øù'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #50
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
    //   68: ldc 'éÈ-\\nY²\\t"ÉÓ*ÞYY'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #73
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
    //   129: putstatic burp/Zs4g.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zs4g.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #59
    //   214: goto -> 243
    //   217: bipush #9
    //   219: goto -> 243
    //   222: iconst_1
    //   223: goto -> 243
    //   226: bipush #114
    //   228: goto -> 243
    //   231: bipush #66
    //   233: goto -> 243
    //   236: bipush #25
    //   238: goto -> 243
    //   241: bipush #12
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
    //   300: sipush #-18343
    //   303: sipush #16658
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zs4g.ZV : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-18367
    //   319: sipush #25192
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zs4g.ZC : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB850) & 0xFFFF;
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
      char c = '³';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs4g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */