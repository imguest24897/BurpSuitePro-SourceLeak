package burp;

import java.math.BigInteger;

class Ztev extends ClassLoader {
  static String Zp;
  
  static Object Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZJ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zxe.Zg : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zr4k.Zf : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zm0v.ZH : Ljava/lang/Object;
    //   22: sipush #-28368
    //   25: getstatic burp/Zct.ZW : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zzvr.Z_ : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zelc.ZR : Ljava/lang/Object;
    //   43: sipush #-20432
    //   46: getstatic burp/Zty2.Zl : Ljava/lang/Object;
    //   49: checkcast java/math/BigInteger
    //   52: getstatic burp/Zl8l.ZJ : Ljava/lang/Object;
    //   55: checkcast java/math/BigInteger
    //   58: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   61: putstatic burp/Zt5t.Za : Ljava/lang/Object;
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: ldc burp/Zkdc
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
    //   186: sipush #-28357
    //   189: sipush #-30928
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
    //   228: sipush #-28369
    //   231: sipush #32224
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
    //   387: iconst_0
    //   388: istore_3
    //   389: getstatic burp/Zlg1.ZG : Ljava/lang/String;
    //   392: getstatic burp/Zgvf.Zd : Ljava/lang/Object;
    //   395: checkcast java/math/BigInteger
    //   398: invokevirtual intValue : ()I
    //   401: bipush #32
    //   403: irem
    //   404: invokestatic abs : (I)I
    //   407: invokevirtual charAt : (I)C
    //   410: getstatic burp/Zlpl.ZO : Ljava/lang/String;
    //   413: getstatic burp/Zz9v.Zl : Ljava/lang/Object;
    //   416: checkcast java/math/BigInteger
    //   419: invokevirtual intValue : ()I
    //   422: bipush #32
    //   424: irem
    //   425: invokestatic abs : (I)I
    //   428: invokevirtual charAt : (I)C
    //   431: if_icmpgt -> 775
    //   434: sipush #-28376
    //   437: sipush #5969
    //   440: invokestatic a : (II)Ljava/lang/String;
    //   443: iconst_1
    //   444: ldc burp/Zx_u
    //   446: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   449: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   452: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   455: astore #4
    //   457: aload #4
    //   459: arraylength
    //   460: istore #5
    //   462: iconst_0
    //   463: istore #6
    //   465: iload #6
    //   467: iload #5
    //   469: if_icmpge -> 607
    //   472: aload #4
    //   474: iload #6
    //   476: aaload
    //   477: astore #7
    //   479: aload #7
    //   481: invokevirtual getModifiers : ()I
    //   484: invokestatic isStatic : (I)Z
    //   487: ifne -> 497
    //   490: goto -> 600
    //   493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   496: athrow
    //   497: aload #7
    //   499: invokevirtual getType : ()Ljava/lang/Class;
    //   502: astore #8
    //   504: aload #8
    //   506: ifnull -> 587
    //   509: aload #8
    //   511: invokevirtual isPrimitive : ()Z
    //   514: ifne -> 587
    //   517: goto -> 524
    //   520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   523: athrow
    //   524: aload #8
    //   526: invokevirtual getPackage : ()Ljava/lang/Package;
    //   529: ifnull -> 587
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: aload #8
    //   541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   544: invokevirtual getName : ()Ljava/lang/String;
    //   547: ifnull -> 587
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   556: athrow
    //   557: aload #8
    //   559: invokevirtual getPackage : ()Ljava/lang/Package;
    //   562: invokevirtual getName : ()Ljava/lang/String;
    //   565: sipush #-28355
    //   568: sipush #9840
    //   571: invokestatic a : (II)Ljava/lang/String;
    //   574: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   577: ifne -> 587
    //   580: goto -> 587
    //   583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   586: athrow
    //   587: aload #7
    //   589: iconst_1
    //   590: invokevirtual setAccessible : (Z)V
    //   593: aload #7
    //   595: aconst_null
    //   596: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   599: pop
    //   600: iinc #6, 1
    //   603: iload_2
    //   604: ifne -> 465
    //   607: sipush #-28371
    //   610: sipush #-14673
    //   613: invokestatic a : (II)Ljava/lang/String;
    //   616: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   619: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   622: astore #4
    //   624: aload #4
    //   626: arraylength
    //   627: istore #5
    //   629: iconst_0
    //   630: istore #6
    //   632: iload #6
    //   634: iload #5
    //   636: if_icmpge -> 772
    //   639: aload #4
    //   641: iload #6
    //   643: aaload
    //   644: astore #7
    //   646: aload #7
    //   648: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   651: pop
    //   652: aload #7
    //   654: invokevirtual getModifiers : ()I
    //   657: invokestatic isStatic : (I)Z
    //   660: ifeq -> 758
    //   663: aload #7
    //   665: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   668: arraylength
    //   669: iconst_2
    //   670: if_icmpne -> 758
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   679: athrow
    //   680: aload #7
    //   682: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   685: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   688: if_acmpne -> 758
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   697: athrow
    //   698: aload #7
    //   700: iconst_1
    //   701: invokevirtual setAccessible : (Z)V
    //   704: aload #7
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
    //   747: checkcast java/lang/Boolean
    //   750: invokevirtual booleanValue : ()Z
    //   753: istore_3
    //   754: iload_2
    //   755: ifne -> 772
    //   758: iinc #6, 1
    //   761: iload_2
    //   762: ifne -> 632
    //   765: goto -> 772
    //   768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   771: athrow
    //   772: goto -> 1113
    //   775: sipush #-28374
    //   778: sipush #-27686
    //   781: invokestatic a : (II)Ljava/lang/String;
    //   784: iconst_1
    //   785: ldc burp/Zec_
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
    //   906: sipush #-28355
    //   909: sipush #9840
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
    //   948: sipush #-28377
    //   951: sipush #-371
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
    //   1113: iload_3
    //   1114: ifeq -> 1119
    //   1117: iload_3
    //   1118: ireturn
    //   1119: getstatic burp/Zgyk.ZB : Ljava/lang/String;
    //   1122: getstatic burp/Ztt0.ZF : Ljava/lang/Object;
    //   1125: checkcast java/math/BigInteger
    //   1128: invokevirtual intValue : ()I
    //   1131: bipush #32
    //   1133: irem
    //   1134: invokestatic abs : (I)I
    //   1137: invokevirtual charAt : (I)C
    //   1140: getstatic burp/Zrj3.ZT : Ljava/lang/String;
    //   1143: getstatic burp/Zs9k.ZX : Ljava/lang/Object;
    //   1146: checkcast java/math/BigInteger
    //   1149: invokevirtual intValue : ()I
    //   1152: bipush #32
    //   1154: irem
    //   1155: invokestatic abs : (I)I
    //   1158: invokevirtual charAt : (I)C
    //   1161: if_icmple -> 1506
    //   1164: sipush #-28372
    //   1167: sipush #-26537
    //   1170: invokestatic a : (II)Ljava/lang/String;
    //   1173: iconst_1
    //   1174: ldc burp/Ze3j
    //   1176: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1179: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1182: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1185: astore #4
    //   1187: aload #4
    //   1189: arraylength
    //   1190: istore #5
    //   1192: iconst_0
    //   1193: istore #6
    //   1195: iload #6
    //   1197: iload #5
    //   1199: if_icmpge -> 1337
    //   1202: aload #4
    //   1204: iload #6
    //   1206: aaload
    //   1207: astore #7
    //   1209: aload #7
    //   1211: invokevirtual getModifiers : ()I
    //   1214: invokestatic isStatic : (I)Z
    //   1217: ifne -> 1227
    //   1220: goto -> 1330
    //   1223: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1226: athrow
    //   1227: aload #7
    //   1229: invokevirtual getType : ()Ljava/lang/Class;
    //   1232: astore #8
    //   1234: aload #8
    //   1236: ifnull -> 1317
    //   1239: aload #8
    //   1241: invokevirtual isPrimitive : ()Z
    //   1244: ifne -> 1317
    //   1247: goto -> 1254
    //   1250: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1253: athrow
    //   1254: aload #8
    //   1256: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1259: ifnull -> 1317
    //   1262: goto -> 1269
    //   1265: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1268: athrow
    //   1269: aload #8
    //   1271: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1274: invokevirtual getName : ()Ljava/lang/String;
    //   1277: ifnull -> 1317
    //   1280: goto -> 1287
    //   1283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1286: athrow
    //   1287: aload #8
    //   1289: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1292: invokevirtual getName : ()Ljava/lang/String;
    //   1295: sipush #-28355
    //   1298: sipush #9840
    //   1301: invokestatic a : (II)Ljava/lang/String;
    //   1304: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1307: ifne -> 1317
    //   1310: goto -> 1317
    //   1313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1316: athrow
    //   1317: aload #7
    //   1319: iconst_1
    //   1320: invokevirtual setAccessible : (Z)V
    //   1323: aload #7
    //   1325: aconst_null
    //   1326: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1329: pop
    //   1330: iinc #6, 1
    //   1333: iload_2
    //   1334: ifne -> 1195
    //   1337: sipush #-28363
    //   1340: sipush #-3717
    //   1343: invokestatic a : (II)Ljava/lang/String;
    //   1346: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1349: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1352: astore #4
    //   1354: aload #4
    //   1356: arraylength
    //   1357: istore #5
    //   1359: iconst_0
    //   1360: istore #6
    //   1362: iload #6
    //   1364: iload #5
    //   1366: if_icmpge -> 1502
    //   1369: aload #4
    //   1371: iload #6
    //   1373: aaload
    //   1374: astore #7
    //   1376: aload #7
    //   1378: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1381: pop
    //   1382: aload #7
    //   1384: invokevirtual getModifiers : ()I
    //   1387: invokestatic isStatic : (I)Z
    //   1390: ifeq -> 1488
    //   1393: aload #7
    //   1395: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1398: arraylength
    //   1399: iconst_2
    //   1400: if_icmpne -> 1488
    //   1403: goto -> 1410
    //   1406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1409: athrow
    //   1410: aload #7
    //   1412: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1415: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1418: if_acmpne -> 1488
    //   1421: goto -> 1428
    //   1424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1427: athrow
    //   1428: aload #7
    //   1430: iconst_1
    //   1431: invokevirtual setAccessible : (Z)V
    //   1434: aload #7
    //   1436: aconst_null
    //   1437: iconst_2
    //   1438: anewarray java/lang/Object
    //   1441: dup
    //   1442: iconst_0
    //   1443: aload_0
    //   1444: aastore
    //   1445: dup
    //   1446: iconst_1
    //   1447: aload_1
    //   1448: ifnonnull -> 1466
    //   1451: goto -> 1458
    //   1454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1457: athrow
    //   1458: aload_1
    //   1459: goto -> 1473
    //   1462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1465: athrow
    //   1466: aload_1
    //   1467: checkcast [B
    //   1470: invokevirtual clone : ()Ljava/lang/Object;
    //   1473: aastore
    //   1474: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1477: checkcast java/lang/Boolean
    //   1480: invokevirtual booleanValue : ()Z
    //   1483: istore_3
    //   1484: iload_2
    //   1485: ifne -> 1502
    //   1488: iinc #6, 1
    //   1491: iload_2
    //   1492: ifne -> 1362
    //   1495: goto -> 1502
    //   1498: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1501: athrow
    //   1502: iload_2
    //   1503: ifne -> 1844
    //   1506: sipush #-28366
    //   1509: sipush #20932
    //   1512: invokestatic a : (II)Ljava/lang/String;
    //   1515: iconst_1
    //   1516: ldc burp/Zrcx
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
    //   1637: sipush #-28355
    //   1640: sipush #9840
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
    //   1679: sipush #-28354
    //   1682: sipush #25670
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
    //   1844: iload_3
    //   1845: ifeq -> 1850
    //   1848: iload_3
    //   1849: ireturn
    //   1850: getstatic burp/Zeud.Za : Ljava/lang/String;
    //   1853: getstatic burp/Ztmy.ZH : Ljava/lang/Object;
    //   1856: checkcast java/math/BigInteger
    //   1859: invokevirtual intValue : ()I
    //   1862: bipush #32
    //   1864: irem
    //   1865: invokestatic abs : (I)I
    //   1868: invokevirtual charAt : (I)C
    //   1871: getstatic burp/Zsk2.ZE : Ljava/lang/String;
    //   1874: getstatic burp/Zeno.Zo : Ljava/lang/Object;
    //   1877: checkcast java/math/BigInteger
    //   1880: invokevirtual intValue : ()I
    //   1883: bipush #32
    //   1885: irem
    //   1886: invokestatic abs : (I)I
    //   1889: invokevirtual charAt : (I)C
    //   1892: if_icmple -> 2237
    //   1895: sipush #-28375
    //   1898: sipush #1623
    //   1901: invokestatic a : (II)Ljava/lang/String;
    //   1904: iconst_1
    //   1905: ldc burp/Zr_y
    //   1907: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1910: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1913: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1916: astore #4
    //   1918: aload #4
    //   1920: arraylength
    //   1921: istore #5
    //   1923: iconst_0
    //   1924: istore #6
    //   1926: iload #6
    //   1928: iload #5
    //   1930: if_icmpge -> 2068
    //   1933: aload #4
    //   1935: iload #6
    //   1937: aaload
    //   1938: astore #7
    //   1940: aload #7
    //   1942: invokevirtual getModifiers : ()I
    //   1945: invokestatic isStatic : (I)Z
    //   1948: ifne -> 1958
    //   1951: goto -> 2061
    //   1954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1957: athrow
    //   1958: aload #7
    //   1960: invokevirtual getType : ()Ljava/lang/Class;
    //   1963: astore #8
    //   1965: aload #8
    //   1967: ifnull -> 2048
    //   1970: aload #8
    //   1972: invokevirtual isPrimitive : ()Z
    //   1975: ifne -> 2048
    //   1978: goto -> 1985
    //   1981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1984: athrow
    //   1985: aload #8
    //   1987: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1990: ifnull -> 2048
    //   1993: goto -> 2000
    //   1996: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1999: athrow
    //   2000: aload #8
    //   2002: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2005: invokevirtual getName : ()Ljava/lang/String;
    //   2008: ifnull -> 2048
    //   2011: goto -> 2018
    //   2014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2017: athrow
    //   2018: aload #8
    //   2020: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2023: invokevirtual getName : ()Ljava/lang/String;
    //   2026: sipush #-28355
    //   2029: sipush #9840
    //   2032: invokestatic a : (II)Ljava/lang/String;
    //   2035: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2038: ifne -> 2048
    //   2041: goto -> 2048
    //   2044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2047: athrow
    //   2048: aload #7
    //   2050: iconst_1
    //   2051: invokevirtual setAccessible : (Z)V
    //   2054: aload #7
    //   2056: aconst_null
    //   2057: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2060: pop
    //   2061: iinc #6, 1
    //   2064: iload_2
    //   2065: ifne -> 1926
    //   2068: sipush #-28361
    //   2071: sipush #22032
    //   2074: invokestatic a : (II)Ljava/lang/String;
    //   2077: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2080: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2083: astore #4
    //   2085: aload #4
    //   2087: arraylength
    //   2088: istore #5
    //   2090: iconst_0
    //   2091: istore #6
    //   2093: iload #6
    //   2095: iload #5
    //   2097: if_icmpge -> 2233
    //   2100: aload #4
    //   2102: iload #6
    //   2104: aaload
    //   2105: astore #7
    //   2107: aload #7
    //   2109: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2112: pop
    //   2113: aload #7
    //   2115: invokevirtual getModifiers : ()I
    //   2118: invokestatic isStatic : (I)Z
    //   2121: ifeq -> 2219
    //   2124: aload #7
    //   2126: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2129: arraylength
    //   2130: iconst_2
    //   2131: if_icmpne -> 2219
    //   2134: goto -> 2141
    //   2137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2140: athrow
    //   2141: aload #7
    //   2143: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2146: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2149: if_acmpne -> 2219
    //   2152: goto -> 2159
    //   2155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2158: athrow
    //   2159: aload #7
    //   2161: iconst_1
    //   2162: invokevirtual setAccessible : (Z)V
    //   2165: aload #7
    //   2167: aconst_null
    //   2168: iconst_2
    //   2169: anewarray java/lang/Object
    //   2172: dup
    //   2173: iconst_0
    //   2174: aload_0
    //   2175: aastore
    //   2176: dup
    //   2177: iconst_1
    //   2178: aload_1
    //   2179: ifnonnull -> 2197
    //   2182: goto -> 2189
    //   2185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2188: athrow
    //   2189: aload_1
    //   2190: goto -> 2204
    //   2193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2196: athrow
    //   2197: aload_1
    //   2198: checkcast [B
    //   2201: invokevirtual clone : ()Ljava/lang/Object;
    //   2204: aastore
    //   2205: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2208: checkcast java/lang/Boolean
    //   2211: invokevirtual booleanValue : ()Z
    //   2214: istore_3
    //   2215: iload_2
    //   2216: ifne -> 2233
    //   2219: iinc #6, 1
    //   2222: iload_2
    //   2223: ifne -> 2093
    //   2226: goto -> 2233
    //   2229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2232: athrow
    //   2233: iload_2
    //   2234: ifne -> 2575
    //   2237: sipush #-28373
    //   2240: sipush #-20865
    //   2243: invokestatic a : (II)Ljava/lang/String;
    //   2246: iconst_1
    //   2247: ldc burp/Zkku
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
    //   2368: sipush #-28355
    //   2371: sipush #9840
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
    //   2410: sipush #-28359
    //   2413: sipush #-28262
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
    //   2575: iload_3
    //   2576: ifeq -> 2581
    //   2579: iload_3
    //   2580: ireturn
    //   2581: getstatic burp/Zgvl.Zc : Ljava/lang/String;
    //   2584: getstatic burp/Ze0w.ZU : Ljava/lang/Object;
    //   2587: checkcast java/math/BigInteger
    //   2590: invokevirtual intValue : ()I
    //   2593: bipush #32
    //   2595: irem
    //   2596: invokestatic abs : (I)I
    //   2599: invokevirtual charAt : (I)C
    //   2602: getstatic burp/Ze0w.ZT : Ljava/lang/String;
    //   2605: getstatic burp/Zle4.Zh : Ljava/lang/Object;
    //   2608: checkcast java/math/BigInteger
    //   2611: invokevirtual intValue : ()I
    //   2614: bipush #32
    //   2616: irem
    //   2617: invokestatic abs : (I)I
    //   2620: invokevirtual charAt : (I)C
    //   2623: if_icmpgt -> 2968
    //   2626: sipush #-28356
    //   2629: sipush #28749
    //   2632: invokestatic a : (II)Ljava/lang/String;
    //   2635: iconst_1
    //   2636: ldc burp/Zb8_
    //   2638: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2641: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2644: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2647: astore #4
    //   2649: aload #4
    //   2651: arraylength
    //   2652: istore #5
    //   2654: iconst_0
    //   2655: istore #6
    //   2657: iload #6
    //   2659: iload #5
    //   2661: if_icmpge -> 2799
    //   2664: aload #4
    //   2666: iload #6
    //   2668: aaload
    //   2669: astore #7
    //   2671: aload #7
    //   2673: invokevirtual getModifiers : ()I
    //   2676: invokestatic isStatic : (I)Z
    //   2679: ifne -> 2689
    //   2682: goto -> 2792
    //   2685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2688: athrow
    //   2689: aload #7
    //   2691: invokevirtual getType : ()Ljava/lang/Class;
    //   2694: astore #8
    //   2696: aload #8
    //   2698: ifnull -> 2779
    //   2701: aload #8
    //   2703: invokevirtual isPrimitive : ()Z
    //   2706: ifne -> 2779
    //   2709: goto -> 2716
    //   2712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2715: athrow
    //   2716: aload #8
    //   2718: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2721: ifnull -> 2779
    //   2724: goto -> 2731
    //   2727: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2730: athrow
    //   2731: aload #8
    //   2733: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2736: invokevirtual getName : ()Ljava/lang/String;
    //   2739: ifnull -> 2779
    //   2742: goto -> 2749
    //   2745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2748: athrow
    //   2749: aload #8
    //   2751: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2754: invokevirtual getName : ()Ljava/lang/String;
    //   2757: sipush #-28355
    //   2760: sipush #9840
    //   2763: invokestatic a : (II)Ljava/lang/String;
    //   2766: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2769: ifne -> 2779
    //   2772: goto -> 2779
    //   2775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2778: athrow
    //   2779: aload #7
    //   2781: iconst_1
    //   2782: invokevirtual setAccessible : (Z)V
    //   2785: aload #7
    //   2787: aconst_null
    //   2788: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2791: pop
    //   2792: iinc #6, 1
    //   2795: iload_2
    //   2796: ifne -> 2657
    //   2799: sipush #-28360
    //   2802: sipush #18059
    //   2805: invokestatic a : (II)Ljava/lang/String;
    //   2808: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2811: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2814: astore #4
    //   2816: aload #4
    //   2818: arraylength
    //   2819: istore #5
    //   2821: iconst_0
    //   2822: istore #6
    //   2824: iload #6
    //   2826: iload #5
    //   2828: if_icmpge -> 2964
    //   2831: aload #4
    //   2833: iload #6
    //   2835: aaload
    //   2836: astore #7
    //   2838: aload #7
    //   2840: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2843: pop
    //   2844: aload #7
    //   2846: invokevirtual getModifiers : ()I
    //   2849: invokestatic isStatic : (I)Z
    //   2852: ifeq -> 2950
    //   2855: aload #7
    //   2857: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2860: arraylength
    //   2861: iconst_2
    //   2862: if_icmpne -> 2950
    //   2865: goto -> 2872
    //   2868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2871: athrow
    //   2872: aload #7
    //   2874: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2877: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2880: if_acmpne -> 2950
    //   2883: goto -> 2890
    //   2886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2889: athrow
    //   2890: aload #7
    //   2892: iconst_1
    //   2893: invokevirtual setAccessible : (Z)V
    //   2896: aload #7
    //   2898: aconst_null
    //   2899: iconst_2
    //   2900: anewarray java/lang/Object
    //   2903: dup
    //   2904: iconst_0
    //   2905: aload_0
    //   2906: aastore
    //   2907: dup
    //   2908: iconst_1
    //   2909: aload_1
    //   2910: ifnonnull -> 2928
    //   2913: goto -> 2920
    //   2916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2919: athrow
    //   2920: aload_1
    //   2921: goto -> 2935
    //   2924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2927: athrow
    //   2928: aload_1
    //   2929: checkcast [B
    //   2932: invokevirtual clone : ()Ljava/lang/Object;
    //   2935: aastore
    //   2936: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2939: checkcast java/lang/Boolean
    //   2942: invokevirtual booleanValue : ()Z
    //   2945: istore_3
    //   2946: iload_2
    //   2947: ifne -> 2964
    //   2950: iinc #6, 1
    //   2953: iload_2
    //   2954: ifne -> 2824
    //   2957: goto -> 2964
    //   2960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2963: athrow
    //   2964: iload_2
    //   2965: ifne -> 3306
    //   2968: sipush #-28367
    //   2971: sipush #25687
    //   2974: invokestatic a : (II)Ljava/lang/String;
    //   2977: iconst_1
    //   2978: ldc burp/Zgwq
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
    //   3099: sipush #-28355
    //   3102: sipush #9840
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
    //   3141: sipush #-28358
    //   3144: sipush #-30821
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
    //   3306: iload_3
    //   3307: ireturn
    //   3308: astore_3
    //   3309: new java/lang/Exception
    //   3312: dup
    //   3313: aload_3
    //   3314: invokevirtual getMessage : ()Ljava/lang/String;
    //   3317: invokespecial <init> : (Ljava/lang/String;)V
    //   3320: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1118	3308	java/lang/Throwable
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
    //   479	493	493	java/lang/Throwable
    //   504	517	520	java/lang/Throwable
    //   509	532	535	java/lang/Throwable
    //   524	550	553	java/lang/Throwable
    //   539	580	583	java/lang/Throwable
    //   646	673	676	java/lang/Throwable
    //   663	691	694	java/lang/Throwable
    //   680	721	724	java/lang/Throwable
    //   698	732	732	java/lang/Throwable
    //   754	765	768	java/lang/Throwable
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
    //   1119	1849	3308	java/lang/Throwable
    //   1209	1223	1223	java/lang/Throwable
    //   1234	1247	1250	java/lang/Throwable
    //   1239	1262	1265	java/lang/Throwable
    //   1254	1280	1283	java/lang/Throwable
    //   1269	1310	1313	java/lang/Throwable
    //   1376	1403	1406	java/lang/Throwable
    //   1393	1421	1424	java/lang/Throwable
    //   1410	1451	1454	java/lang/Throwable
    //   1428	1462	1462	java/lang/Throwable
    //   1484	1495	1498	java/lang/Throwable
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
    //   1850	2580	3308	java/lang/Throwable
    //   1940	1954	1954	java/lang/Throwable
    //   1965	1978	1981	java/lang/Throwable
    //   1970	1993	1996	java/lang/Throwable
    //   1985	2011	2014	java/lang/Throwable
    //   2000	2041	2044	java/lang/Throwable
    //   2107	2134	2137	java/lang/Throwable
    //   2124	2152	2155	java/lang/Throwable
    //   2141	2182	2185	java/lang/Throwable
    //   2159	2193	2193	java/lang/Throwable
    //   2215	2226	2229	java/lang/Throwable
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
    //   2581	3307	3308	java/lang/Throwable
    //   2671	2685	2685	java/lang/Throwable
    //   2696	2709	2712	java/lang/Throwable
    //   2701	2724	2727	java/lang/Throwable
    //   2716	2742	2745	java/lang/Throwable
    //   2731	2772	2775	java/lang/Throwable
    //   2838	2865	2868	java/lang/Throwable
    //   2855	2883	2886	java/lang/Throwable
    //   2872	2913	2916	java/lang/Throwable
    //   2890	2924	2924	java/lang/Throwable
    //   2946	2957	2960	java/lang/Throwable
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
  }
  
  static void ZB(Object paramObject) {
    Zrpx.ZM = a(-28353, -25748);
    Zrpx.Zi = new BigInteger(a(-28364, 15730));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zb_c.ZS.charAt(Math.abs(((BigInteger)Zdm.ZA).intValue() % 32)) <= Zr9p.Za.charAt(Math.abs(((BigInteger)Zb_c.ZN).intValue() % 32))) {
          try {
            Zdm.Zw(Class.forName(a(-28370, 3375)));
            if (bool)
              Zmuj.ZU(Class.forName(a(-28365, 3303))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zmuj.ZU(Class.forName(a(-28365, 3303)));
    } catch (Throwable throwable) {}
  }
  
  static void ZW(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '&WÍöüåÖù9qÆ!TºÆp»2Ðò/"}t¬?Î\\tp&héÕõýÙ¢\\tÚÍ=y"F4Ë¦\\tÁUø/v&\\tÔëü½Þ<ß\\t {f¯IæF\\tWcOs· ,ª_Z²}WA«Tpï¯-¡b¯çáv_Ê,ÊÊ¸\\tAÿN?LUÇMÄ$ÇÑÚ÷=ð¤=é0ÙÉ-öt×q(¨oä´189×ÞÇßL^IE©¾úòÁÔz*Þ!ôd+5'ë\\t»hÍ§Ð1Ë=\\t«&µAßì3²\\tMjÏ|ØLÂZ\\tË/f?\\t¾ï±=³Î¹Yh\\t`vjÈ¨Ë\\t\Síª8<ÈOH\\tM6Ï|©UæW\\tS6\\f©Dâþ\\t~©²°?Ì;7\\tj±+öà·Ñ%d'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #43
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
    //   68: ldc 'ë±ØØDx>\\tg¤ þ+õ¦'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #77
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
    //   129: putstatic burp/Ztev.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztev.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_3
    //   213: goto -> 243
    //   216: bipush #32
    //   218: goto -> 243
    //   221: bipush #20
    //   223: goto -> 243
    //   226: bipush #33
    //   228: goto -> 243
    //   231: bipush #91
    //   233: goto -> 243
    //   236: bipush #39
    //   238: goto -> 243
    //   241: bipush #102
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
    //   300: sipush #-28362
    //   303: sipush #-23790
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztev.Zp : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #74
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-101
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-113
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-35
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-60
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-117
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-22
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #114
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-7
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-58
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-49
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-96
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #53
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-40
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #122
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #44
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #121
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #36
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #61
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #18
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #62
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-123
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #116
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-47
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #24
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #-112
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #-68
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-46
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #19
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #103
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #-42
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #115
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Ztev.Zr : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF913F) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztev.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */