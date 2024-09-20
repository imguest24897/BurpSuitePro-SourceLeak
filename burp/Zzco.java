package burp;

import java.math.BigInteger;

class Zzco extends ClassLoader {
  static String Zu;
  
  static Object ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zs(Object paramObject) {
    Zb4m.ZQ = a(433, 17452);
    Zb4m.Zp = new BigInteger(a(447, 27590));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zb4m.ZQ.charAt(Math.abs(((BigInteger)Zbj.ZY).intValue() % 32)) <= Zlxs.ZM.charAt(Math.abs(((BigInteger)Zxo4.ZV).intValue() % 32))) {
          try {
            Zst7.ZR(Class.forName(a(432, -27964)));
            if (!bool)
              Zxt5.Zw(Class.forName(a(443, 9755))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxt5.Zw(Class.forName(a(443, 9755)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zn(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: new java/lang/String
    //   7: dup
    //   8: aload_1
    //   9: checkcast [B
    //   12: invokespecial <init> : ([B)V
    //   15: putstatic burp/Ztzh.ZE : Ljava/lang/String;
    //   18: sipush #435
    //   21: getstatic burp/Zl8s.ZY : Ljava/lang/Object;
    //   24: checkcast java/math/BigInteger
    //   27: getstatic burp/Zb29.ZM : Ljava/lang/Object;
    //   30: checkcast java/math/BigInteger
    //   33: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   36: putstatic burp/Zecm.ZJ : Ljava/lang/Object;
    //   39: sipush #-18103
    //   42: invokestatic a : (II)Ljava/lang/String;
    //   45: iconst_1
    //   46: ldc burp/Zg_y
    //   48: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   51: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   54: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   57: astore_3
    //   58: aload_3
    //   59: arraylength
    //   60: istore #4
    //   62: iconst_0
    //   63: istore #5
    //   65: iload #5
    //   67: iload #4
    //   69: if_icmpge -> 206
    //   72: aload_3
    //   73: iload #5
    //   75: aaload
    //   76: astore #6
    //   78: aload #6
    //   80: invokevirtual getModifiers : ()I
    //   83: invokestatic isStatic : (I)Z
    //   86: ifne -> 96
    //   89: goto -> 199
    //   92: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: aload #6
    //   98: invokevirtual getType : ()Ljava/lang/Class;
    //   101: astore #7
    //   103: aload #7
    //   105: ifnull -> 186
    //   108: aload #7
    //   110: invokevirtual isPrimitive : ()Z
    //   113: ifne -> 186
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   122: athrow
    //   123: aload #7
    //   125: invokevirtual getPackage : ()Ljava/lang/Package;
    //   128: ifnull -> 186
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   137: athrow
    //   138: aload #7
    //   140: invokevirtual getPackage : ()Ljava/lang/Package;
    //   143: invokevirtual getName : ()Ljava/lang/String;
    //   146: ifnull -> 186
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   155: athrow
    //   156: aload #7
    //   158: invokevirtual getPackage : ()Ljava/lang/Package;
    //   161: invokevirtual getName : ()Ljava/lang/String;
    //   164: sipush #444
    //   167: sipush #-31271
    //   170: invokestatic a : (II)Ljava/lang/String;
    //   173: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   176: ifne -> 186
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   185: athrow
    //   186: aload #6
    //   188: iconst_1
    //   189: invokevirtual setAccessible : (Z)V
    //   192: aload #6
    //   194: aconst_null
    //   195: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   198: pop
    //   199: iinc #5, 1
    //   202: iload_2
    //   203: ifne -> 65
    //   206: sipush #436
    //   209: sipush #-2105
    //   212: invokestatic a : (II)Ljava/lang/String;
    //   215: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   218: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   221: astore_3
    //   222: aload_3
    //   223: arraylength
    //   224: istore #4
    //   226: iconst_0
    //   227: istore #5
    //   229: iload #5
    //   231: iload #4
    //   233: if_icmpge -> 344
    //   236: aload_3
    //   237: iload #5
    //   239: aaload
    //   240: astore #6
    //   242: aload #6
    //   244: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   247: pop
    //   248: aload #6
    //   250: invokevirtual getModifiers : ()I
    //   253: invokestatic isStatic : (I)Z
    //   256: ifeq -> 330
    //   259: aload #6
    //   261: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   264: arraylength
    //   265: iconst_2
    //   266: if_icmpne -> 330
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   275: athrow
    //   276: aload #6
    //   278: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   281: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   284: if_acmpne -> 330
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   293: athrow
    //   294: aload #6
    //   296: iconst_1
    //   297: invokevirtual setAccessible : (Z)V
    //   300: aload #6
    //   302: aconst_null
    //   303: iconst_2
    //   304: anewarray java/lang/Object
    //   307: dup
    //   308: iconst_0
    //   309: aload_0
    //   310: aastore
    //   311: dup
    //   312: iconst_1
    //   313: aload_1
    //   314: aastore
    //   315: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   318: pop
    //   319: iload_2
    //   320: ifne -> 344
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: iinc #5, 1
    //   333: iload_2
    //   334: ifne -> 229
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   343: athrow
    //   344: sipush #434
    //   347: sipush #4825
    //   350: invokestatic a : (II)Ljava/lang/String;
    //   353: iconst_1
    //   354: ldc burp/Zl7k
    //   356: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   359: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   362: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   365: astore_3
    //   366: aload_3
    //   367: arraylength
    //   368: istore #4
    //   370: iconst_0
    //   371: istore #5
    //   373: iload #5
    //   375: iload #4
    //   377: if_icmpge -> 514
    //   380: aload_3
    //   381: iload #5
    //   383: aaload
    //   384: astore #6
    //   386: aload #6
    //   388: invokevirtual getModifiers : ()I
    //   391: invokestatic isStatic : (I)Z
    //   394: ifne -> 404
    //   397: goto -> 507
    //   400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   403: athrow
    //   404: aload #6
    //   406: invokevirtual getType : ()Ljava/lang/Class;
    //   409: astore #7
    //   411: aload #7
    //   413: ifnull -> 494
    //   416: aload #7
    //   418: invokevirtual isPrimitive : ()Z
    //   421: ifne -> 494
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   430: athrow
    //   431: aload #7
    //   433: invokevirtual getPackage : ()Ljava/lang/Package;
    //   436: ifnull -> 494
    //   439: goto -> 446
    //   442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   445: athrow
    //   446: aload #7
    //   448: invokevirtual getPackage : ()Ljava/lang/Package;
    //   451: invokevirtual getName : ()Ljava/lang/String;
    //   454: ifnull -> 494
    //   457: goto -> 464
    //   460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   463: athrow
    //   464: aload #7
    //   466: invokevirtual getPackage : ()Ljava/lang/Package;
    //   469: invokevirtual getName : ()Ljava/lang/String;
    //   472: sipush #442
    //   475: sipush #-27722
    //   478: invokestatic a : (II)Ljava/lang/String;
    //   481: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   484: ifne -> 494
    //   487: goto -> 494
    //   490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   493: athrow
    //   494: aload #6
    //   496: iconst_1
    //   497: invokevirtual setAccessible : (Z)V
    //   500: aload #6
    //   502: aconst_null
    //   503: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   506: pop
    //   507: iinc #5, 1
    //   510: iload_2
    //   511: ifne -> 373
    //   514: sipush #437
    //   517: sipush #-8267
    //   520: invokestatic a : (II)Ljava/lang/String;
    //   523: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   526: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   529: astore_3
    //   530: aload_3
    //   531: arraylength
    //   532: istore #4
    //   534: iconst_0
    //   535: istore #5
    //   537: iload #5
    //   539: iload #4
    //   541: if_icmpge -> 670
    //   544: aload_3
    //   545: iload #5
    //   547: aaload
    //   548: astore #6
    //   550: aload #6
    //   552: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   555: pop
    //   556: aload #6
    //   558: invokevirtual getModifiers : ()I
    //   561: invokestatic isStatic : (I)Z
    //   564: ifeq -> 656
    //   567: aload #6
    //   569: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   572: arraylength
    //   573: iconst_2
    //   574: if_icmpne -> 656
    //   577: goto -> 584
    //   580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   583: athrow
    //   584: aload #6
    //   586: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   589: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   592: if_acmpne -> 656
    //   595: goto -> 602
    //   598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   601: athrow
    //   602: aload #6
    //   604: iconst_1
    //   605: invokevirtual setAccessible : (Z)V
    //   608: aload #6
    //   610: aconst_null
    //   611: iconst_2
    //   612: anewarray java/lang/Object
    //   615: dup
    //   616: iconst_0
    //   617: aload_0
    //   618: aastore
    //   619: dup
    //   620: iconst_1
    //   621: aload_1
    //   622: ifnonnull -> 640
    //   625: goto -> 632
    //   628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   631: athrow
    //   632: aload_1
    //   633: goto -> 647
    //   636: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   639: athrow
    //   640: aload_1
    //   641: checkcast [B
    //   644: invokevirtual clone : ()Ljava/lang/Object;
    //   647: aastore
    //   648: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   651: pop
    //   652: iload_2
    //   653: ifne -> 670
    //   656: iinc #5, 1
    //   659: iload_2
    //   660: ifne -> 537
    //   663: goto -> 670
    //   666: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   669: athrow
    //   670: sipush #445
    //   673: sipush #-26731
    //   676: invokestatic a : (II)Ljava/lang/String;
    //   679: iconst_1
    //   680: ldc burp/Zgcg
    //   682: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   685: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   688: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   691: astore_3
    //   692: aload_3
    //   693: arraylength
    //   694: istore #4
    //   696: iconst_0
    //   697: istore #5
    //   699: iload #5
    //   701: iload #4
    //   703: if_icmpge -> 840
    //   706: aload_3
    //   707: iload #5
    //   709: aaload
    //   710: astore #6
    //   712: aload #6
    //   714: invokevirtual getModifiers : ()I
    //   717: invokestatic isStatic : (I)Z
    //   720: ifne -> 730
    //   723: goto -> 833
    //   726: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   729: athrow
    //   730: aload #6
    //   732: invokevirtual getType : ()Ljava/lang/Class;
    //   735: astore #7
    //   737: aload #7
    //   739: ifnull -> 820
    //   742: aload #7
    //   744: invokevirtual isPrimitive : ()Z
    //   747: ifne -> 820
    //   750: goto -> 757
    //   753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   756: athrow
    //   757: aload #7
    //   759: invokevirtual getPackage : ()Ljava/lang/Package;
    //   762: ifnull -> 820
    //   765: goto -> 772
    //   768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   771: athrow
    //   772: aload #7
    //   774: invokevirtual getPackage : ()Ljava/lang/Package;
    //   777: invokevirtual getName : ()Ljava/lang/String;
    //   780: ifnull -> 820
    //   783: goto -> 790
    //   786: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   789: athrow
    //   790: aload #7
    //   792: invokevirtual getPackage : ()Ljava/lang/Package;
    //   795: invokevirtual getName : ()Ljava/lang/String;
    //   798: sipush #442
    //   801: sipush #-27722
    //   804: invokestatic a : (II)Ljava/lang/String;
    //   807: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   810: ifne -> 820
    //   813: goto -> 820
    //   816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   819: athrow
    //   820: aload #6
    //   822: iconst_1
    //   823: invokevirtual setAccessible : (Z)V
    //   826: aload #6
    //   828: aconst_null
    //   829: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   832: pop
    //   833: iinc #5, 1
    //   836: iload_2
    //   837: ifne -> 699
    //   840: sipush #439
    //   843: sipush #15053
    //   846: invokestatic a : (II)Ljava/lang/String;
    //   849: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   852: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   855: astore_3
    //   856: aload_3
    //   857: arraylength
    //   858: istore #4
    //   860: iconst_0
    //   861: istore #5
    //   863: iload #5
    //   865: iload #4
    //   867: if_icmpge -> 999
    //   870: aload_3
    //   871: iload #5
    //   873: aaload
    //   874: astore #6
    //   876: aload #6
    //   878: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   881: pop
    //   882: aload #6
    //   884: invokevirtual getModifiers : ()I
    //   887: invokestatic isStatic : (I)Z
    //   890: ifeq -> 985
    //   893: aload #6
    //   895: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   898: arraylength
    //   899: iconst_2
    //   900: if_icmpne -> 985
    //   903: goto -> 910
    //   906: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   909: athrow
    //   910: aload #6
    //   912: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   915: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   918: invokevirtual equals : (Ljava/lang/Object;)Z
    //   921: ifeq -> 985
    //   924: goto -> 931
    //   927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   930: athrow
    //   931: aload #6
    //   933: iconst_1
    //   934: invokevirtual setAccessible : (Z)V
    //   937: aload #6
    //   939: aconst_null
    //   940: iconst_2
    //   941: anewarray java/lang/Object
    //   944: dup
    //   945: iconst_0
    //   946: aload_0
    //   947: aastore
    //   948: dup
    //   949: iconst_1
    //   950: aload_1
    //   951: ifnonnull -> 969
    //   954: goto -> 961
    //   957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   960: athrow
    //   961: aload_1
    //   962: goto -> 976
    //   965: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   968: athrow
    //   969: aload_1
    //   970: checkcast [B
    //   973: invokevirtual clone : ()Ljava/lang/Object;
    //   976: aastore
    //   977: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   980: pop
    //   981: iload_2
    //   982: ifne -> 999
    //   985: iinc #5, 1
    //   988: iload_2
    //   989: ifne -> 863
    //   992: goto -> 999
    //   995: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   998: athrow
    //   999: getstatic burp/Zmec.Zi : Ljava/lang/String;
    //   1002: getstatic burp/Zm52.ZR : Ljava/lang/Object;
    //   1005: checkcast java/math/BigInteger
    //   1008: invokevirtual intValue : ()I
    //   1011: bipush #32
    //   1013: irem
    //   1014: invokestatic abs : (I)I
    //   1017: invokevirtual charAt : (I)C
    //   1020: getstatic burp/Zkcd.Zj : Ljava/lang/String;
    //   1023: getstatic burp/Ze82.ZR : Ljava/lang/Object;
    //   1026: checkcast java/math/BigInteger
    //   1029: invokevirtual intValue : ()I
    //   1032: bipush #32
    //   1034: irem
    //   1035: invokestatic abs : (I)I
    //   1038: invokevirtual charAt : (I)C
    //   1041: if_icmpgt -> 1148
    //   1044: getstatic burp/Zzh1.Zn : Ljava/lang/String;
    //   1047: getstatic burp/Zs34.ZE : Ljava/lang/Object;
    //   1050: checkcast java/math/BigInteger
    //   1053: invokevirtual intValue : ()I
    //   1056: bipush #32
    //   1058: irem
    //   1059: invokestatic abs : (I)I
    //   1062: invokevirtual charAt : (I)C
    //   1065: getstatic burp/Zxjw.Zv : Ljava/lang/String;
    //   1068: getstatic burp/Zthx.ZH : Ljava/lang/Object;
    //   1071: checkcast java/math/BigInteger
    //   1074: invokevirtual intValue : ()I
    //   1077: bipush #32
    //   1079: irem
    //   1080: invokestatic abs : (I)I
    //   1083: invokevirtual charAt : (I)C
    //   1086: if_icmpgt -> 1148
    //   1089: goto -> 1096
    //   1092: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1095: athrow
    //   1096: getstatic burp/Zk8b.ZT : Ljava/lang/String;
    //   1099: getstatic burp/Zzr.ZZ : Ljava/lang/Object;
    //   1102: checkcast java/math/BigInteger
    //   1105: invokevirtual intValue : ()I
    //   1108: bipush #32
    //   1110: irem
    //   1111: invokestatic abs : (I)I
    //   1114: invokevirtual charAt : (I)C
    //   1117: getstatic burp/Zecw.Zb : Ljava/lang/String;
    //   1120: getstatic burp/Ztp.Zp : Ljava/lang/Object;
    //   1123: checkcast java/math/BigInteger
    //   1126: invokevirtual intValue : ()I
    //   1129: bipush #32
    //   1131: irem
    //   1132: invokestatic abs : (I)I
    //   1135: invokevirtual charAt : (I)C
    //   1138: if_icmple -> 1156
    //   1141: goto -> 1148
    //   1144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1147: athrow
    //   1148: iconst_1
    //   1149: goto -> 1157
    //   1152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1155: athrow
    //   1156: iconst_0
    //   1157: ireturn
    //   1158: astore_3
    //   1159: new java/lang/Exception
    //   1162: dup
    //   1163: aload_3
    //   1164: invokevirtual getMessage : ()Ljava/lang/String;
    //   1167: invokespecial <init> : (Ljava/lang/String;)V
    //   1170: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1157	1158	java/lang/Throwable
    //   78	92	92	java/lang/Throwable
    //   103	116	119	java/lang/Throwable
    //   108	131	134	java/lang/Throwable
    //   123	149	152	java/lang/Throwable
    //   138	179	182	java/lang/Throwable
    //   242	269	272	java/lang/Throwable
    //   259	287	290	java/lang/Throwable
    //   276	323	326	java/lang/Throwable
    //   294	337	340	java/lang/Throwable
    //   386	400	400	java/lang/Throwable
    //   411	424	427	java/lang/Throwable
    //   416	439	442	java/lang/Throwable
    //   431	457	460	java/lang/Throwable
    //   446	487	490	java/lang/Throwable
    //   550	577	580	java/lang/Throwable
    //   567	595	598	java/lang/Throwable
    //   584	625	628	java/lang/Throwable
    //   602	636	636	java/lang/Throwable
    //   647	663	666	java/lang/Throwable
    //   712	726	726	java/lang/Throwable
    //   737	750	753	java/lang/Throwable
    //   742	765	768	java/lang/Throwable
    //   757	783	786	java/lang/Throwable
    //   772	813	816	java/lang/Throwable
    //   876	903	906	java/lang/Throwable
    //   893	924	927	java/lang/Throwable
    //   910	954	957	java/lang/Throwable
    //   931	965	965	java/lang/Throwable
    //   976	992	995	java/lang/Throwable
    //   999	1089	1092	java/lang/Throwable
    //   1044	1141	1144	java/lang/Throwable
    //   1096	1152	1152	java/lang/Throwable
  }
  
  static void ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'LX %Mx´DXøÒOEíí®éBZó»ä²Og[¾¥ÛyjùMúÁûÐÊÄïjêÌzuE6¸cÓÿÈI7#ìÖ@ß4W×\\tÛ±F{±¦\\t_3OTqêÛï\\tK@7çb\\t÷û×kb¯V 2J¯§ÍrgpÄM·tÓ^ Æ½WÕzô°Y\W(\\t *él)VUBMÌ$kÆ`4Ô"×"<óSL\\r.|mü·âe¡Q\\nÿo\\bDÓ)¥qð(g8ÜyË£ÿìFm½;Râ±Å¬L5%¾vªë°ðëÆ >Yèä\\r\\nTnº~µúí³m6ó²¡î|\\nÅîW(¦\\tÒxsökÉ¹x'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #101
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
    //   68: ldc 'Ó´¥,ý§³\\n¸O'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #15
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
    //   129: putstatic burp/Zzco.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzco.b : [Ljava/lang/String;
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
    //   212: bipush #82
    //   214: goto -> 244
    //   217: bipush #25
    //   219: goto -> 244
    //   222: bipush #54
    //   224: goto -> 244
    //   227: bipush #104
    //   229: goto -> 244
    //   232: bipush #9
    //   234: goto -> 244
    //   237: bipush #120
    //   239: goto -> 244
    //   242: bipush #23
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
    //   300: sipush #446
    //   303: sipush #-4538
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zzco.Zu : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #438
    //   319: sipush #-12894
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zzco.ZC : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1B7) & 0xFFFF;
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
      byte b1 = 49;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzco.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */