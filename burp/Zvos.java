package burp;

import java.math.BigInteger;

class Zvos extends ClassLoader {
  static String Zk;
  
  static Object Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Ze(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #1110
    //   7: sipush #-17873
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Zy : (Ljava/lang/Object;)V
    //   19: sipush #1119
    //   22: getstatic burp/Zmpp.Z_ : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zgrz.ZX : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zrfh.ZJ : Ljava/lang/Object;
    //   40: sipush #-18121
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: iconst_1
    //   47: ldc burp/Zmze
    //   49: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   52: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   55: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   58: astore_3
    //   59: aload_3
    //   60: arraylength
    //   61: istore #4
    //   63: iconst_0
    //   64: istore #5
    //   66: iload #5
    //   68: iload #4
    //   70: if_icmpge -> 207
    //   73: aload_3
    //   74: iload #5
    //   76: aaload
    //   77: astore #6
    //   79: aload #6
    //   81: invokevirtual getModifiers : ()I
    //   84: invokestatic isStatic : (I)Z
    //   87: ifne -> 97
    //   90: goto -> 200
    //   93: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   96: athrow
    //   97: aload #6
    //   99: invokevirtual getType : ()Ljava/lang/Class;
    //   102: astore #7
    //   104: aload #7
    //   106: ifnull -> 187
    //   109: aload #7
    //   111: invokevirtual isPrimitive : ()Z
    //   114: ifne -> 187
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: ifnull -> 187
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   138: athrow
    //   139: aload #7
    //   141: invokevirtual getPackage : ()Ljava/lang/Package;
    //   144: invokevirtual getName : ()Ljava/lang/String;
    //   147: ifnull -> 187
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   156: athrow
    //   157: aload #7
    //   159: invokevirtual getPackage : ()Ljava/lang/Package;
    //   162: invokevirtual getName : ()Ljava/lang/String;
    //   165: sipush #1094
    //   168: sipush #2692
    //   171: invokestatic a : (II)Ljava/lang/String;
    //   174: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   177: ifne -> 187
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   186: athrow
    //   187: aload #6
    //   189: iconst_1
    //   190: invokevirtual setAccessible : (Z)V
    //   193: aload #6
    //   195: aconst_null
    //   196: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   199: pop
    //   200: iinc #5, 1
    //   203: iload_2
    //   204: ifeq -> 66
    //   207: sipush #1116
    //   210: sipush #-31027
    //   213: invokestatic a : (II)Ljava/lang/String;
    //   216: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   219: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   222: astore_3
    //   223: aload_3
    //   224: arraylength
    //   225: istore #4
    //   227: iconst_0
    //   228: istore #5
    //   230: iload #5
    //   232: iload #4
    //   234: if_icmpge -> 366
    //   237: aload_3
    //   238: iload #5
    //   240: aaload
    //   241: astore #6
    //   243: aload #6
    //   245: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   248: pop
    //   249: aload #6
    //   251: invokevirtual getModifiers : ()I
    //   254: invokestatic isStatic : (I)Z
    //   257: ifeq -> 352
    //   260: aload #6
    //   262: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   265: arraylength
    //   266: iconst_2
    //   267: if_icmpne -> 352
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   276: athrow
    //   277: aload #6
    //   279: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   282: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   285: invokevirtual equals : (Ljava/lang/Object;)Z
    //   288: ifeq -> 352
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: iconst_1
    //   301: invokevirtual setAccessible : (Z)V
    //   304: aload #6
    //   306: aconst_null
    //   307: iconst_2
    //   308: anewarray java/lang/Object
    //   311: dup
    //   312: iconst_0
    //   313: aload_0
    //   314: aastore
    //   315: dup
    //   316: iconst_1
    //   317: aload_1
    //   318: ifnonnull -> 336
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   327: athrow
    //   328: aload_1
    //   329: goto -> 343
    //   332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   335: athrow
    //   336: aload_1
    //   337: checkcast [B
    //   340: invokevirtual clone : ()Ljava/lang/Object;
    //   343: aastore
    //   344: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   347: pop
    //   348: iload_2
    //   349: ifeq -> 366
    //   352: iinc #5, 1
    //   355: iload_2
    //   356: ifeq -> 230
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   365: athrow
    //   366: new java/io/ByteArrayOutputStream
    //   369: dup
    //   370: invokespecial <init> : ()V
    //   373: astore_3
    //   374: sipush #1095
    //   377: aload_3
    //   378: sipush #202
    //   381: invokevirtual write : (I)V
    //   384: sipush #-21952
    //   387: aload_3
    //   388: sipush #254
    //   391: invokevirtual write : (I)V
    //   394: aload_3
    //   395: sipush #186
    //   398: invokevirtual write : (I)V
    //   401: aload_3
    //   402: sipush #190
    //   405: invokevirtual write : (I)V
    //   408: aload_3
    //   409: iconst_0
    //   410: invokevirtual write : (I)V
    //   413: aload_3
    //   414: iconst_1
    //   415: invokevirtual write : (I)V
    //   418: aload_3
    //   419: iconst_0
    //   420: invokevirtual write : (I)V
    //   423: aload_3
    //   424: bipush #50
    //   426: invokevirtual write : (I)V
    //   429: aload_3
    //   430: getstatic burp/Zbxa.ZS : Ljava/lang/Object;
    //   433: checkcast java/math/BigInteger
    //   436: invokevirtual toByteArray : ()[B
    //   439: invokevirtual write : ([B)V
    //   442: aload_3
    //   443: getstatic burp/Zez0.ZT : Ljava/lang/Object;
    //   446: checkcast java/math/BigInteger
    //   449: invokevirtual toByteArray : ()[B
    //   452: invokevirtual write : ([B)V
    //   455: aload_3
    //   456: getstatic burp/Zr9j.Zw : Ljava/lang/Object;
    //   459: checkcast java/math/BigInteger
    //   462: invokevirtual toByteArray : ()[B
    //   465: invokevirtual write : ([B)V
    //   468: aload_3
    //   469: invokevirtual toByteArray : ()[B
    //   472: astore #4
    //   474: aconst_null
    //   475: astore #5
    //   477: invokestatic a : (II)Ljava/lang/String;
    //   480: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   483: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   486: astore #6
    //   488: aload #6
    //   490: arraylength
    //   491: istore #7
    //   493: iconst_0
    //   494: istore #8
    //   496: iload #8
    //   498: iload #7
    //   500: if_icmpge -> 628
    //   503: aload #6
    //   505: iload #8
    //   507: aaload
    //   508: astore #9
    //   510: aload #9
    //   512: invokevirtual getName : ()Ljava/lang/String;
    //   515: sipush #1102
    //   518: sipush #-17640
    //   521: invokestatic a : (II)Ljava/lang/String;
    //   524: invokevirtual equals : (Ljava/lang/Object;)Z
    //   527: ifeq -> 621
    //   530: aload #9
    //   532: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   535: astore #10
    //   537: aload #10
    //   539: arraylength
    //   540: iconst_4
    //   541: if_icmpeq -> 551
    //   544: goto -> 621
    //   547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   550: athrow
    //   551: aload #10
    //   553: iconst_0
    //   554: aaload
    //   555: ldc java/lang/String
    //   557: if_acmpeq -> 567
    //   560: goto -> 621
    //   563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   566: athrow
    //   567: aload #10
    //   569: iconst_1
    //   570: aaload
    //   571: ldc [B
    //   573: if_acmpeq -> 583
    //   576: goto -> 621
    //   579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   582: athrow
    //   583: aload #10
    //   585: iconst_2
    //   586: aaload
    //   587: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   590: if_acmpeq -> 600
    //   593: goto -> 621
    //   596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   599: athrow
    //   600: aload #10
    //   602: iconst_3
    //   603: aaload
    //   604: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   607: if_acmpeq -> 617
    //   610: goto -> 621
    //   613: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   616: athrow
    //   617: aload #9
    //   619: astore #5
    //   621: iinc #8, 1
    //   624: iload_2
    //   625: ifeq -> 496
    //   628: aload #5
    //   630: iconst_1
    //   631: invokevirtual setAccessible : (Z)V
    //   634: ldc burp/Zeyd
    //   636: iconst_0
    //   637: anewarray java/lang/Class
    //   640: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   643: astore #6
    //   645: aload #6
    //   647: iconst_1
    //   648: invokevirtual setAccessible : (Z)V
    //   651: aload #5
    //   653: aload #6
    //   655: iconst_0
    //   656: anewarray java/lang/Object
    //   659: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   662: iconst_4
    //   663: anewarray java/lang/Object
    //   666: dup
    //   667: iconst_0
    //   668: sipush #1092
    //   671: sipush #-27095
    //   674: invokestatic a : (II)Ljava/lang/String;
    //   677: aastore
    //   678: dup
    //   679: iconst_1
    //   680: aload #4
    //   682: aastore
    //   683: dup
    //   684: iconst_2
    //   685: iconst_0
    //   686: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   689: aastore
    //   690: dup
    //   691: iconst_3
    //   692: aload #4
    //   694: arraylength
    //   695: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   698: aastore
    //   699: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   702: pop
    //   703: goto -> 707
    //   706: astore_3
    //   707: iconst_0
    //   708: istore_3
    //   709: getstatic burp/Zle6.Zh : Ljava/lang/String;
    //   712: getstatic burp/Zxt5.ZG : Ljava/lang/Object;
    //   715: checkcast java/math/BigInteger
    //   718: invokevirtual intValue : ()I
    //   721: bipush #32
    //   723: irem
    //   724: invokestatic abs : (I)I
    //   727: invokevirtual charAt : (I)C
    //   730: getstatic burp/Zxzp.ZH : Ljava/lang/String;
    //   733: getstatic burp/Ze4x.Zp : Ljava/lang/Object;
    //   736: checkcast java/math/BigInteger
    //   739: invokevirtual intValue : ()I
    //   742: bipush #32
    //   744: irem
    //   745: invokestatic abs : (I)I
    //   748: invokevirtual charAt : (I)C
    //   751: if_icmple -> 1096
    //   754: sipush #1115
    //   757: sipush #-22113
    //   760: invokestatic a : (II)Ljava/lang/String;
    //   763: iconst_1
    //   764: ldc burp/Zboa
    //   766: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   769: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   772: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   775: astore #4
    //   777: aload #4
    //   779: arraylength
    //   780: istore #5
    //   782: iconst_0
    //   783: istore #6
    //   785: iload #6
    //   787: iload #5
    //   789: if_icmpge -> 927
    //   792: aload #4
    //   794: iload #6
    //   796: aaload
    //   797: astore #7
    //   799: aload #7
    //   801: invokevirtual getModifiers : ()I
    //   804: invokestatic isStatic : (I)Z
    //   807: ifne -> 817
    //   810: goto -> 920
    //   813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   816: athrow
    //   817: aload #7
    //   819: invokevirtual getType : ()Ljava/lang/Class;
    //   822: astore #8
    //   824: aload #8
    //   826: ifnull -> 907
    //   829: aload #8
    //   831: invokevirtual isPrimitive : ()Z
    //   834: ifne -> 907
    //   837: goto -> 844
    //   840: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   843: athrow
    //   844: aload #8
    //   846: invokevirtual getPackage : ()Ljava/lang/Package;
    //   849: ifnull -> 907
    //   852: goto -> 859
    //   855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   858: athrow
    //   859: aload #8
    //   861: invokevirtual getPackage : ()Ljava/lang/Package;
    //   864: invokevirtual getName : ()Ljava/lang/String;
    //   867: ifnull -> 907
    //   870: goto -> 877
    //   873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   876: athrow
    //   877: aload #8
    //   879: invokevirtual getPackage : ()Ljava/lang/Package;
    //   882: invokevirtual getName : ()Ljava/lang/String;
    //   885: sipush #1104
    //   888: sipush #-26438
    //   891: invokestatic a : (II)Ljava/lang/String;
    //   894: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   897: ifne -> 907
    //   900: goto -> 907
    //   903: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   906: athrow
    //   907: aload #7
    //   909: iconst_1
    //   910: invokevirtual setAccessible : (Z)V
    //   913: aload #7
    //   915: aconst_null
    //   916: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   919: pop
    //   920: iinc #6, 1
    //   923: iload_2
    //   924: ifeq -> 785
    //   927: sipush #1118
    //   930: sipush #-10460
    //   933: invokestatic a : (II)Ljava/lang/String;
    //   936: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   939: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   942: astore #4
    //   944: aload #4
    //   946: arraylength
    //   947: istore #5
    //   949: iconst_0
    //   950: istore #6
    //   952: iload #6
    //   954: iload #5
    //   956: if_icmpge -> 1092
    //   959: aload #4
    //   961: iload #6
    //   963: aaload
    //   964: astore #7
    //   966: aload #7
    //   968: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   971: pop
    //   972: aload #7
    //   974: invokevirtual getModifiers : ()I
    //   977: invokestatic isStatic : (I)Z
    //   980: ifeq -> 1078
    //   983: aload #7
    //   985: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   988: arraylength
    //   989: iconst_2
    //   990: if_icmpne -> 1078
    //   993: goto -> 1000
    //   996: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   999: athrow
    //   1000: aload #7
    //   1002: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1005: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1008: if_acmpne -> 1078
    //   1011: goto -> 1018
    //   1014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1017: athrow
    //   1018: aload #7
    //   1020: iconst_1
    //   1021: invokevirtual setAccessible : (Z)V
    //   1024: aload #7
    //   1026: aconst_null
    //   1027: iconst_2
    //   1028: anewarray java/lang/Object
    //   1031: dup
    //   1032: iconst_0
    //   1033: aload_0
    //   1034: aastore
    //   1035: dup
    //   1036: iconst_1
    //   1037: aload_1
    //   1038: ifnonnull -> 1056
    //   1041: goto -> 1048
    //   1044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1047: athrow
    //   1048: aload_1
    //   1049: goto -> 1063
    //   1052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1055: athrow
    //   1056: aload_1
    //   1057: checkcast [B
    //   1060: invokevirtual clone : ()Ljava/lang/Object;
    //   1063: aastore
    //   1064: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1067: checkcast java/lang/Boolean
    //   1070: invokevirtual booleanValue : ()Z
    //   1073: istore_3
    //   1074: iload_2
    //   1075: ifeq -> 1092
    //   1078: iinc #6, 1
    //   1081: iload_2
    //   1082: ifeq -> 952
    //   1085: goto -> 1092
    //   1088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1091: athrow
    //   1092: iload_2
    //   1093: ifeq -> 1434
    //   1096: sipush #1117
    //   1099: sipush #27462
    //   1102: invokestatic a : (II)Ljava/lang/String;
    //   1105: iconst_1
    //   1106: ldc burp/Zbu
    //   1108: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1111: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1114: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1117: astore #4
    //   1119: aload #4
    //   1121: arraylength
    //   1122: istore #5
    //   1124: iconst_0
    //   1125: istore #6
    //   1127: iload #6
    //   1129: iload #5
    //   1131: if_icmpge -> 1269
    //   1134: aload #4
    //   1136: iload #6
    //   1138: aaload
    //   1139: astore #7
    //   1141: aload #7
    //   1143: invokevirtual getModifiers : ()I
    //   1146: invokestatic isStatic : (I)Z
    //   1149: ifne -> 1159
    //   1152: goto -> 1262
    //   1155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1158: athrow
    //   1159: aload #7
    //   1161: invokevirtual getType : ()Ljava/lang/Class;
    //   1164: astore #8
    //   1166: aload #8
    //   1168: ifnull -> 1249
    //   1171: aload #8
    //   1173: invokevirtual isPrimitive : ()Z
    //   1176: ifne -> 1249
    //   1179: goto -> 1186
    //   1182: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1185: athrow
    //   1186: aload #8
    //   1188: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1191: ifnull -> 1249
    //   1194: goto -> 1201
    //   1197: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1200: athrow
    //   1201: aload #8
    //   1203: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1206: invokevirtual getName : ()Ljava/lang/String;
    //   1209: ifnull -> 1249
    //   1212: goto -> 1219
    //   1215: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1218: athrow
    //   1219: aload #8
    //   1221: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1224: invokevirtual getName : ()Ljava/lang/String;
    //   1227: sipush #1104
    //   1230: sipush #-26438
    //   1233: invokestatic a : (II)Ljava/lang/String;
    //   1236: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1239: ifne -> 1249
    //   1242: goto -> 1249
    //   1245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1248: athrow
    //   1249: aload #7
    //   1251: iconst_1
    //   1252: invokevirtual setAccessible : (Z)V
    //   1255: aload #7
    //   1257: aconst_null
    //   1258: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1261: pop
    //   1262: iinc #6, 1
    //   1265: iload_2
    //   1266: ifeq -> 1127
    //   1269: sipush #1107
    //   1272: sipush #9082
    //   1275: invokestatic a : (II)Ljava/lang/String;
    //   1278: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1281: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1284: astore #4
    //   1286: aload #4
    //   1288: arraylength
    //   1289: istore #5
    //   1291: iconst_0
    //   1292: istore #6
    //   1294: iload #6
    //   1296: iload #5
    //   1298: if_icmpge -> 1434
    //   1301: aload #4
    //   1303: iload #6
    //   1305: aaload
    //   1306: astore #7
    //   1308: aload #7
    //   1310: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1313: pop
    //   1314: aload #7
    //   1316: invokevirtual getModifiers : ()I
    //   1319: invokestatic isStatic : (I)Z
    //   1322: ifeq -> 1420
    //   1325: aload #7
    //   1327: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1330: arraylength
    //   1331: iconst_2
    //   1332: if_icmpne -> 1420
    //   1335: goto -> 1342
    //   1338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1341: athrow
    //   1342: aload #7
    //   1344: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1347: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1350: if_acmpne -> 1420
    //   1353: goto -> 1360
    //   1356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1359: athrow
    //   1360: aload #7
    //   1362: iconst_1
    //   1363: invokevirtual setAccessible : (Z)V
    //   1366: aload #7
    //   1368: aconst_null
    //   1369: iconst_2
    //   1370: anewarray java/lang/Object
    //   1373: dup
    //   1374: iconst_0
    //   1375: aload_0
    //   1376: aastore
    //   1377: dup
    //   1378: iconst_1
    //   1379: aload_1
    //   1380: ifnonnull -> 1398
    //   1383: goto -> 1390
    //   1386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1389: athrow
    //   1390: aload_1
    //   1391: goto -> 1405
    //   1394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1397: athrow
    //   1398: aload_1
    //   1399: checkcast [B
    //   1402: invokevirtual clone : ()Ljava/lang/Object;
    //   1405: aastore
    //   1406: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1409: checkcast java/lang/Boolean
    //   1412: invokevirtual booleanValue : ()Z
    //   1415: istore_3
    //   1416: iload_2
    //   1417: ifeq -> 1434
    //   1420: iinc #6, 1
    //   1423: iload_2
    //   1424: ifeq -> 1294
    //   1427: goto -> 1434
    //   1430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1433: athrow
    //   1434: iload_3
    //   1435: ifeq -> 1440
    //   1438: iload_3
    //   1439: ireturn
    //   1440: getstatic burp/Zeuz.Zb : Ljava/lang/String;
    //   1443: getstatic burp/Zbz_.ZU : Ljava/lang/Object;
    //   1446: checkcast java/math/BigInteger
    //   1449: invokevirtual intValue : ()I
    //   1452: bipush #32
    //   1454: irem
    //   1455: invokestatic abs : (I)I
    //   1458: invokevirtual charAt : (I)C
    //   1461: getstatic burp/Zt7j.Zx : Ljava/lang/String;
    //   1464: getstatic burp/Zbo2.ZQ : Ljava/lang/Object;
    //   1467: checkcast java/math/BigInteger
    //   1470: invokevirtual intValue : ()I
    //   1473: bipush #32
    //   1475: irem
    //   1476: invokestatic abs : (I)I
    //   1479: invokevirtual charAt : (I)C
    //   1482: if_icmple -> 1827
    //   1485: sipush #1108
    //   1488: sipush #-8541
    //   1491: invokestatic a : (II)Ljava/lang/String;
    //   1494: iconst_1
    //   1495: ldc burp/Zg7z
    //   1497: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1500: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1503: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1506: astore #4
    //   1508: aload #4
    //   1510: arraylength
    //   1511: istore #5
    //   1513: iconst_0
    //   1514: istore #6
    //   1516: iload #6
    //   1518: iload #5
    //   1520: if_icmpge -> 1658
    //   1523: aload #4
    //   1525: iload #6
    //   1527: aaload
    //   1528: astore #7
    //   1530: aload #7
    //   1532: invokevirtual getModifiers : ()I
    //   1535: invokestatic isStatic : (I)Z
    //   1538: ifne -> 1548
    //   1541: goto -> 1651
    //   1544: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1547: athrow
    //   1548: aload #7
    //   1550: invokevirtual getType : ()Ljava/lang/Class;
    //   1553: astore #8
    //   1555: aload #8
    //   1557: ifnull -> 1638
    //   1560: aload #8
    //   1562: invokevirtual isPrimitive : ()Z
    //   1565: ifne -> 1638
    //   1568: goto -> 1575
    //   1571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1574: athrow
    //   1575: aload #8
    //   1577: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1580: ifnull -> 1638
    //   1583: goto -> 1590
    //   1586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1589: athrow
    //   1590: aload #8
    //   1592: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1595: invokevirtual getName : ()Ljava/lang/String;
    //   1598: ifnull -> 1638
    //   1601: goto -> 1608
    //   1604: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1607: athrow
    //   1608: aload #8
    //   1610: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1613: invokevirtual getName : ()Ljava/lang/String;
    //   1616: sipush #1104
    //   1619: sipush #-26438
    //   1622: invokestatic a : (II)Ljava/lang/String;
    //   1625: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1628: ifne -> 1638
    //   1631: goto -> 1638
    //   1634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1637: athrow
    //   1638: aload #7
    //   1640: iconst_1
    //   1641: invokevirtual setAccessible : (Z)V
    //   1644: aload #7
    //   1646: aconst_null
    //   1647: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1650: pop
    //   1651: iinc #6, 1
    //   1654: iload_2
    //   1655: ifeq -> 1516
    //   1658: sipush #1113
    //   1661: sipush #-5961
    //   1664: invokestatic a : (II)Ljava/lang/String;
    //   1667: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1670: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1673: astore #4
    //   1675: aload #4
    //   1677: arraylength
    //   1678: istore #5
    //   1680: iconst_0
    //   1681: istore #6
    //   1683: iload #6
    //   1685: iload #5
    //   1687: if_icmpge -> 1823
    //   1690: aload #4
    //   1692: iload #6
    //   1694: aaload
    //   1695: astore #7
    //   1697: aload #7
    //   1699: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1702: pop
    //   1703: aload #7
    //   1705: invokevirtual getModifiers : ()I
    //   1708: invokestatic isStatic : (I)Z
    //   1711: ifeq -> 1809
    //   1714: aload #7
    //   1716: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1719: arraylength
    //   1720: iconst_2
    //   1721: if_icmpne -> 1809
    //   1724: goto -> 1731
    //   1727: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1730: athrow
    //   1731: aload #7
    //   1733: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1736: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1739: if_acmpne -> 1809
    //   1742: goto -> 1749
    //   1745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1748: athrow
    //   1749: aload #7
    //   1751: iconst_1
    //   1752: invokevirtual setAccessible : (Z)V
    //   1755: aload #7
    //   1757: aconst_null
    //   1758: iconst_2
    //   1759: anewarray java/lang/Object
    //   1762: dup
    //   1763: iconst_0
    //   1764: aload_0
    //   1765: aastore
    //   1766: dup
    //   1767: iconst_1
    //   1768: aload_1
    //   1769: ifnonnull -> 1787
    //   1772: goto -> 1779
    //   1775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1778: athrow
    //   1779: aload_1
    //   1780: goto -> 1794
    //   1783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1786: athrow
    //   1787: aload_1
    //   1788: checkcast [B
    //   1791: invokevirtual clone : ()Ljava/lang/Object;
    //   1794: aastore
    //   1795: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1798: checkcast java/lang/Boolean
    //   1801: invokevirtual booleanValue : ()Z
    //   1804: istore_3
    //   1805: iload_2
    //   1806: ifeq -> 1823
    //   1809: iinc #6, 1
    //   1812: iload_2
    //   1813: ifeq -> 1683
    //   1816: goto -> 1823
    //   1819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1822: athrow
    //   1823: iload_2
    //   1824: ifeq -> 2165
    //   1827: sipush #1105
    //   1830: sipush #22631
    //   1833: invokestatic a : (II)Ljava/lang/String;
    //   1836: iconst_1
    //   1837: ldc burp/Zgpx
    //   1839: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1842: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1845: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1848: astore #4
    //   1850: aload #4
    //   1852: arraylength
    //   1853: istore #5
    //   1855: iconst_0
    //   1856: istore #6
    //   1858: iload #6
    //   1860: iload #5
    //   1862: if_icmpge -> 2000
    //   1865: aload #4
    //   1867: iload #6
    //   1869: aaload
    //   1870: astore #7
    //   1872: aload #7
    //   1874: invokevirtual getModifiers : ()I
    //   1877: invokestatic isStatic : (I)Z
    //   1880: ifne -> 1890
    //   1883: goto -> 1993
    //   1886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1889: athrow
    //   1890: aload #7
    //   1892: invokevirtual getType : ()Ljava/lang/Class;
    //   1895: astore #8
    //   1897: aload #8
    //   1899: ifnull -> 1980
    //   1902: aload #8
    //   1904: invokevirtual isPrimitive : ()Z
    //   1907: ifne -> 1980
    //   1910: goto -> 1917
    //   1913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1916: athrow
    //   1917: aload #8
    //   1919: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1922: ifnull -> 1980
    //   1925: goto -> 1932
    //   1928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1931: athrow
    //   1932: aload #8
    //   1934: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1937: invokevirtual getName : ()Ljava/lang/String;
    //   1940: ifnull -> 1980
    //   1943: goto -> 1950
    //   1946: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1949: athrow
    //   1950: aload #8
    //   1952: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1955: invokevirtual getName : ()Ljava/lang/String;
    //   1958: sipush #1104
    //   1961: sipush #-26438
    //   1964: invokestatic a : (II)Ljava/lang/String;
    //   1967: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1970: ifne -> 1980
    //   1973: goto -> 1980
    //   1976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1979: athrow
    //   1980: aload #7
    //   1982: iconst_1
    //   1983: invokevirtual setAccessible : (Z)V
    //   1986: aload #7
    //   1988: aconst_null
    //   1989: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1992: pop
    //   1993: iinc #6, 1
    //   1996: iload_2
    //   1997: ifeq -> 1858
    //   2000: sipush #1089
    //   2003: sipush #-16204
    //   2006: invokestatic a : (II)Ljava/lang/String;
    //   2009: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2012: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2015: astore #4
    //   2017: aload #4
    //   2019: arraylength
    //   2020: istore #5
    //   2022: iconst_0
    //   2023: istore #6
    //   2025: iload #6
    //   2027: iload #5
    //   2029: if_icmpge -> 2165
    //   2032: aload #4
    //   2034: iload #6
    //   2036: aaload
    //   2037: astore #7
    //   2039: aload #7
    //   2041: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2044: pop
    //   2045: aload #7
    //   2047: invokevirtual getModifiers : ()I
    //   2050: invokestatic isStatic : (I)Z
    //   2053: ifeq -> 2151
    //   2056: aload #7
    //   2058: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2061: arraylength
    //   2062: iconst_2
    //   2063: if_icmpne -> 2151
    //   2066: goto -> 2073
    //   2069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2072: athrow
    //   2073: aload #7
    //   2075: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2078: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2081: if_acmpne -> 2151
    //   2084: goto -> 2091
    //   2087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2090: athrow
    //   2091: aload #7
    //   2093: iconst_1
    //   2094: invokevirtual setAccessible : (Z)V
    //   2097: aload #7
    //   2099: aconst_null
    //   2100: iconst_2
    //   2101: anewarray java/lang/Object
    //   2104: dup
    //   2105: iconst_0
    //   2106: aload_0
    //   2107: aastore
    //   2108: dup
    //   2109: iconst_1
    //   2110: aload_1
    //   2111: ifnonnull -> 2129
    //   2114: goto -> 2121
    //   2117: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2120: athrow
    //   2121: aload_1
    //   2122: goto -> 2136
    //   2125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2128: athrow
    //   2129: aload_1
    //   2130: checkcast [B
    //   2133: invokevirtual clone : ()Ljava/lang/Object;
    //   2136: aastore
    //   2137: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2140: checkcast java/lang/Boolean
    //   2143: invokevirtual booleanValue : ()Z
    //   2146: istore_3
    //   2147: iload_2
    //   2148: ifeq -> 2165
    //   2151: iinc #6, 1
    //   2154: iload_2
    //   2155: ifeq -> 2025
    //   2158: goto -> 2165
    //   2161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2164: athrow
    //   2165: iload_3
    //   2166: ifeq -> 2171
    //   2169: iload_3
    //   2170: ireturn
    //   2171: getstatic burp/Ze_0.Zi : Ljava/lang/String;
    //   2174: getstatic burp/Zb38.ZC : Ljava/lang/Object;
    //   2177: checkcast java/math/BigInteger
    //   2180: invokevirtual intValue : ()I
    //   2183: bipush #32
    //   2185: irem
    //   2186: invokestatic abs : (I)I
    //   2189: invokevirtual charAt : (I)C
    //   2192: getstatic burp/Zmu6.Zl : Ljava/lang/String;
    //   2195: getstatic burp/Zg8v.ZB : Ljava/lang/Object;
    //   2198: checkcast java/math/BigInteger
    //   2201: invokevirtual intValue : ()I
    //   2204: bipush #32
    //   2206: irem
    //   2207: invokestatic abs : (I)I
    //   2210: invokevirtual charAt : (I)C
    //   2213: if_icmpgt -> 2558
    //   2216: sipush #1099
    //   2219: sipush #-14805
    //   2222: invokestatic a : (II)Ljava/lang/String;
    //   2225: iconst_1
    //   2226: ldc burp/Zz58
    //   2228: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2231: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2234: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2237: astore #4
    //   2239: aload #4
    //   2241: arraylength
    //   2242: istore #5
    //   2244: iconst_0
    //   2245: istore #6
    //   2247: iload #6
    //   2249: iload #5
    //   2251: if_icmpge -> 2389
    //   2254: aload #4
    //   2256: iload #6
    //   2258: aaload
    //   2259: astore #7
    //   2261: aload #7
    //   2263: invokevirtual getModifiers : ()I
    //   2266: invokestatic isStatic : (I)Z
    //   2269: ifne -> 2279
    //   2272: goto -> 2382
    //   2275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2278: athrow
    //   2279: aload #7
    //   2281: invokevirtual getType : ()Ljava/lang/Class;
    //   2284: astore #8
    //   2286: aload #8
    //   2288: ifnull -> 2369
    //   2291: aload #8
    //   2293: invokevirtual isPrimitive : ()Z
    //   2296: ifne -> 2369
    //   2299: goto -> 2306
    //   2302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2305: athrow
    //   2306: aload #8
    //   2308: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2311: ifnull -> 2369
    //   2314: goto -> 2321
    //   2317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2320: athrow
    //   2321: aload #8
    //   2323: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2326: invokevirtual getName : ()Ljava/lang/String;
    //   2329: ifnull -> 2369
    //   2332: goto -> 2339
    //   2335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2338: athrow
    //   2339: aload #8
    //   2341: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2344: invokevirtual getName : ()Ljava/lang/String;
    //   2347: sipush #1104
    //   2350: sipush #-26438
    //   2353: invokestatic a : (II)Ljava/lang/String;
    //   2356: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2359: ifne -> 2369
    //   2362: goto -> 2369
    //   2365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2368: athrow
    //   2369: aload #7
    //   2371: iconst_1
    //   2372: invokevirtual setAccessible : (Z)V
    //   2375: aload #7
    //   2377: aconst_null
    //   2378: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2381: pop
    //   2382: iinc #6, 1
    //   2385: iload_2
    //   2386: ifeq -> 2247
    //   2389: sipush #1093
    //   2392: sipush #999
    //   2395: invokestatic a : (II)Ljava/lang/String;
    //   2398: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2401: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2404: astore #4
    //   2406: aload #4
    //   2408: arraylength
    //   2409: istore #5
    //   2411: iconst_0
    //   2412: istore #6
    //   2414: iload #6
    //   2416: iload #5
    //   2418: if_icmpge -> 2554
    //   2421: aload #4
    //   2423: iload #6
    //   2425: aaload
    //   2426: astore #7
    //   2428: aload #7
    //   2430: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2433: pop
    //   2434: aload #7
    //   2436: invokevirtual getModifiers : ()I
    //   2439: invokestatic isStatic : (I)Z
    //   2442: ifeq -> 2540
    //   2445: aload #7
    //   2447: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2450: arraylength
    //   2451: iconst_2
    //   2452: if_icmpne -> 2540
    //   2455: goto -> 2462
    //   2458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2461: athrow
    //   2462: aload #7
    //   2464: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2467: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2470: if_acmpne -> 2540
    //   2473: goto -> 2480
    //   2476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2479: athrow
    //   2480: aload #7
    //   2482: iconst_1
    //   2483: invokevirtual setAccessible : (Z)V
    //   2486: aload #7
    //   2488: aconst_null
    //   2489: iconst_2
    //   2490: anewarray java/lang/Object
    //   2493: dup
    //   2494: iconst_0
    //   2495: aload_0
    //   2496: aastore
    //   2497: dup
    //   2498: iconst_1
    //   2499: aload_1
    //   2500: ifnonnull -> 2518
    //   2503: goto -> 2510
    //   2506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2509: athrow
    //   2510: aload_1
    //   2511: goto -> 2525
    //   2514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2517: athrow
    //   2518: aload_1
    //   2519: checkcast [B
    //   2522: invokevirtual clone : ()Ljava/lang/Object;
    //   2525: aastore
    //   2526: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2529: checkcast java/lang/Boolean
    //   2532: invokevirtual booleanValue : ()Z
    //   2535: istore_3
    //   2536: iload_2
    //   2537: ifeq -> 2554
    //   2540: iinc #6, 1
    //   2543: iload_2
    //   2544: ifeq -> 2414
    //   2547: goto -> 2554
    //   2550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2553: athrow
    //   2554: iload_2
    //   2555: ifeq -> 2896
    //   2558: sipush #1098
    //   2561: sipush #12391
    //   2564: invokestatic a : (II)Ljava/lang/String;
    //   2567: iconst_1
    //   2568: ldc burp/Zs56
    //   2570: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2573: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2576: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2579: astore #4
    //   2581: aload #4
    //   2583: arraylength
    //   2584: istore #5
    //   2586: iconst_0
    //   2587: istore #6
    //   2589: iload #6
    //   2591: iload #5
    //   2593: if_icmpge -> 2731
    //   2596: aload #4
    //   2598: iload #6
    //   2600: aaload
    //   2601: astore #7
    //   2603: aload #7
    //   2605: invokevirtual getModifiers : ()I
    //   2608: invokestatic isStatic : (I)Z
    //   2611: ifne -> 2621
    //   2614: goto -> 2724
    //   2617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2620: athrow
    //   2621: aload #7
    //   2623: invokevirtual getType : ()Ljava/lang/Class;
    //   2626: astore #8
    //   2628: aload #8
    //   2630: ifnull -> 2711
    //   2633: aload #8
    //   2635: invokevirtual isPrimitive : ()Z
    //   2638: ifne -> 2711
    //   2641: goto -> 2648
    //   2644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2647: athrow
    //   2648: aload #8
    //   2650: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2653: ifnull -> 2711
    //   2656: goto -> 2663
    //   2659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2662: athrow
    //   2663: aload #8
    //   2665: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2668: invokevirtual getName : ()Ljava/lang/String;
    //   2671: ifnull -> 2711
    //   2674: goto -> 2681
    //   2677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2680: athrow
    //   2681: aload #8
    //   2683: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2686: invokevirtual getName : ()Ljava/lang/String;
    //   2689: sipush #1104
    //   2692: sipush #-26438
    //   2695: invokestatic a : (II)Ljava/lang/String;
    //   2698: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2701: ifne -> 2711
    //   2704: goto -> 2711
    //   2707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2710: athrow
    //   2711: aload #7
    //   2713: iconst_1
    //   2714: invokevirtual setAccessible : (Z)V
    //   2717: aload #7
    //   2719: aconst_null
    //   2720: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2723: pop
    //   2724: iinc #6, 1
    //   2727: iload_2
    //   2728: ifeq -> 2589
    //   2731: sipush #1097
    //   2734: sipush #-19386
    //   2737: invokestatic a : (II)Ljava/lang/String;
    //   2740: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2743: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2746: astore #4
    //   2748: aload #4
    //   2750: arraylength
    //   2751: istore #5
    //   2753: iconst_0
    //   2754: istore #6
    //   2756: iload #6
    //   2758: iload #5
    //   2760: if_icmpge -> 2896
    //   2763: aload #4
    //   2765: iload #6
    //   2767: aaload
    //   2768: astore #7
    //   2770: aload #7
    //   2772: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2775: pop
    //   2776: aload #7
    //   2778: invokevirtual getModifiers : ()I
    //   2781: invokestatic isStatic : (I)Z
    //   2784: ifeq -> 2882
    //   2787: aload #7
    //   2789: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2792: arraylength
    //   2793: iconst_2
    //   2794: if_icmpne -> 2882
    //   2797: goto -> 2804
    //   2800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2803: athrow
    //   2804: aload #7
    //   2806: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2809: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2812: if_acmpne -> 2882
    //   2815: goto -> 2822
    //   2818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2821: athrow
    //   2822: aload #7
    //   2824: iconst_1
    //   2825: invokevirtual setAccessible : (Z)V
    //   2828: aload #7
    //   2830: aconst_null
    //   2831: iconst_2
    //   2832: anewarray java/lang/Object
    //   2835: dup
    //   2836: iconst_0
    //   2837: aload_0
    //   2838: aastore
    //   2839: dup
    //   2840: iconst_1
    //   2841: aload_1
    //   2842: ifnonnull -> 2860
    //   2845: goto -> 2852
    //   2848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2851: athrow
    //   2852: aload_1
    //   2853: goto -> 2867
    //   2856: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2859: athrow
    //   2860: aload_1
    //   2861: checkcast [B
    //   2864: invokevirtual clone : ()Ljava/lang/Object;
    //   2867: aastore
    //   2868: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2871: checkcast java/lang/Boolean
    //   2874: invokevirtual booleanValue : ()Z
    //   2877: istore_3
    //   2878: iload_2
    //   2879: ifeq -> 2896
    //   2882: iinc #6, 1
    //   2885: iload_2
    //   2886: ifeq -> 2756
    //   2889: goto -> 2896
    //   2892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2895: athrow
    //   2896: iload_3
    //   2897: ifeq -> 2902
    //   2900: iload_3
    //   2901: ireturn
    //   2902: getstatic burp/Ztgj.Zw : Ljava/lang/String;
    //   2905: getstatic burp/Zbo2.ZQ : Ljava/lang/Object;
    //   2908: checkcast java/math/BigInteger
    //   2911: invokevirtual intValue : ()I
    //   2914: bipush #32
    //   2916: irem
    //   2917: invokestatic abs : (I)I
    //   2920: invokevirtual charAt : (I)C
    //   2923: getstatic burp/Zbo2.Zr : Ljava/lang/String;
    //   2926: getstatic burp/Zgia.Zx : Ljava/lang/Object;
    //   2929: checkcast java/math/BigInteger
    //   2932: invokevirtual intValue : ()I
    //   2935: bipush #32
    //   2937: irem
    //   2938: invokestatic abs : (I)I
    //   2941: invokevirtual charAt : (I)C
    //   2944: if_icmpgt -> 3289
    //   2947: sipush #1103
    //   2950: sipush #-24438
    //   2953: invokestatic a : (II)Ljava/lang/String;
    //   2956: iconst_1
    //   2957: ldc burp/Zlo2
    //   2959: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2962: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2965: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2968: astore #4
    //   2970: aload #4
    //   2972: arraylength
    //   2973: istore #5
    //   2975: iconst_0
    //   2976: istore #6
    //   2978: iload #6
    //   2980: iload #5
    //   2982: if_icmpge -> 3120
    //   2985: aload #4
    //   2987: iload #6
    //   2989: aaload
    //   2990: astore #7
    //   2992: aload #7
    //   2994: invokevirtual getModifiers : ()I
    //   2997: invokestatic isStatic : (I)Z
    //   3000: ifne -> 3010
    //   3003: goto -> 3113
    //   3006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3009: athrow
    //   3010: aload #7
    //   3012: invokevirtual getType : ()Ljava/lang/Class;
    //   3015: astore #8
    //   3017: aload #8
    //   3019: ifnull -> 3100
    //   3022: aload #8
    //   3024: invokevirtual isPrimitive : ()Z
    //   3027: ifne -> 3100
    //   3030: goto -> 3037
    //   3033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3036: athrow
    //   3037: aload #8
    //   3039: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3042: ifnull -> 3100
    //   3045: goto -> 3052
    //   3048: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3051: athrow
    //   3052: aload #8
    //   3054: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3057: invokevirtual getName : ()Ljava/lang/String;
    //   3060: ifnull -> 3100
    //   3063: goto -> 3070
    //   3066: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3069: athrow
    //   3070: aload #8
    //   3072: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3075: invokevirtual getName : ()Ljava/lang/String;
    //   3078: sipush #1104
    //   3081: sipush #-26438
    //   3084: invokestatic a : (II)Ljava/lang/String;
    //   3087: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3090: ifne -> 3100
    //   3093: goto -> 3100
    //   3096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3099: athrow
    //   3100: aload #7
    //   3102: iconst_1
    //   3103: invokevirtual setAccessible : (Z)V
    //   3106: aload #7
    //   3108: aconst_null
    //   3109: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3112: pop
    //   3113: iinc #6, 1
    //   3116: iload_2
    //   3117: ifeq -> 2978
    //   3120: sipush #1100
    //   3123: sipush #31884
    //   3126: invokestatic a : (II)Ljava/lang/String;
    //   3129: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3132: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3135: astore #4
    //   3137: aload #4
    //   3139: arraylength
    //   3140: istore #5
    //   3142: iconst_0
    //   3143: istore #6
    //   3145: iload #6
    //   3147: iload #5
    //   3149: if_icmpge -> 3285
    //   3152: aload #4
    //   3154: iload #6
    //   3156: aaload
    //   3157: astore #7
    //   3159: aload #7
    //   3161: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3164: pop
    //   3165: aload #7
    //   3167: invokevirtual getModifiers : ()I
    //   3170: invokestatic isStatic : (I)Z
    //   3173: ifeq -> 3271
    //   3176: aload #7
    //   3178: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3181: arraylength
    //   3182: iconst_2
    //   3183: if_icmpne -> 3271
    //   3186: goto -> 3193
    //   3189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3192: athrow
    //   3193: aload #7
    //   3195: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3198: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3201: if_acmpne -> 3271
    //   3204: goto -> 3211
    //   3207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3210: athrow
    //   3211: aload #7
    //   3213: iconst_1
    //   3214: invokevirtual setAccessible : (Z)V
    //   3217: aload #7
    //   3219: aconst_null
    //   3220: iconst_2
    //   3221: anewarray java/lang/Object
    //   3224: dup
    //   3225: iconst_0
    //   3226: aload_0
    //   3227: aastore
    //   3228: dup
    //   3229: iconst_1
    //   3230: aload_1
    //   3231: ifnonnull -> 3249
    //   3234: goto -> 3241
    //   3237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3240: athrow
    //   3241: aload_1
    //   3242: goto -> 3256
    //   3245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3248: athrow
    //   3249: aload_1
    //   3250: checkcast [B
    //   3253: invokevirtual clone : ()Ljava/lang/Object;
    //   3256: aastore
    //   3257: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3260: checkcast java/lang/Boolean
    //   3263: invokevirtual booleanValue : ()Z
    //   3266: istore_3
    //   3267: iload_2
    //   3268: ifeq -> 3285
    //   3271: iinc #6, 1
    //   3274: iload_2
    //   3275: ifeq -> 3145
    //   3278: goto -> 3285
    //   3281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3284: athrow
    //   3285: iload_2
    //   3286: ifeq -> 3627
    //   3289: sipush #1101
    //   3292: sipush #-22938
    //   3295: invokestatic a : (II)Ljava/lang/String;
    //   3298: iconst_1
    //   3299: ldc burp/Zva
    //   3301: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3304: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3307: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3310: astore #4
    //   3312: aload #4
    //   3314: arraylength
    //   3315: istore #5
    //   3317: iconst_0
    //   3318: istore #6
    //   3320: iload #6
    //   3322: iload #5
    //   3324: if_icmpge -> 3462
    //   3327: aload #4
    //   3329: iload #6
    //   3331: aaload
    //   3332: astore #7
    //   3334: aload #7
    //   3336: invokevirtual getModifiers : ()I
    //   3339: invokestatic isStatic : (I)Z
    //   3342: ifne -> 3352
    //   3345: goto -> 3455
    //   3348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3351: athrow
    //   3352: aload #7
    //   3354: invokevirtual getType : ()Ljava/lang/Class;
    //   3357: astore #8
    //   3359: aload #8
    //   3361: ifnull -> 3442
    //   3364: aload #8
    //   3366: invokevirtual isPrimitive : ()Z
    //   3369: ifne -> 3442
    //   3372: goto -> 3379
    //   3375: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3378: athrow
    //   3379: aload #8
    //   3381: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3384: ifnull -> 3442
    //   3387: goto -> 3394
    //   3390: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3393: athrow
    //   3394: aload #8
    //   3396: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3399: invokevirtual getName : ()Ljava/lang/String;
    //   3402: ifnull -> 3442
    //   3405: goto -> 3412
    //   3408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3411: athrow
    //   3412: aload #8
    //   3414: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3417: invokevirtual getName : ()Ljava/lang/String;
    //   3420: sipush #1104
    //   3423: sipush #-26438
    //   3426: invokestatic a : (II)Ljava/lang/String;
    //   3429: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3432: ifne -> 3442
    //   3435: goto -> 3442
    //   3438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3441: athrow
    //   3442: aload #7
    //   3444: iconst_1
    //   3445: invokevirtual setAccessible : (Z)V
    //   3448: aload #7
    //   3450: aconst_null
    //   3451: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3454: pop
    //   3455: iinc #6, 1
    //   3458: iload_2
    //   3459: ifeq -> 3320
    //   3462: sipush #1112
    //   3465: sipush #-31341
    //   3468: invokestatic a : (II)Ljava/lang/String;
    //   3471: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3474: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3477: astore #4
    //   3479: aload #4
    //   3481: arraylength
    //   3482: istore #5
    //   3484: iconst_0
    //   3485: istore #6
    //   3487: iload #6
    //   3489: iload #5
    //   3491: if_icmpge -> 3627
    //   3494: aload #4
    //   3496: iload #6
    //   3498: aaload
    //   3499: astore #7
    //   3501: aload #7
    //   3503: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3506: pop
    //   3507: aload #7
    //   3509: invokevirtual getModifiers : ()I
    //   3512: invokestatic isStatic : (I)Z
    //   3515: ifeq -> 3613
    //   3518: aload #7
    //   3520: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3523: arraylength
    //   3524: iconst_2
    //   3525: if_icmpne -> 3613
    //   3528: goto -> 3535
    //   3531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3534: athrow
    //   3535: aload #7
    //   3537: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3540: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3543: if_acmpne -> 3613
    //   3546: goto -> 3553
    //   3549: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3552: athrow
    //   3553: aload #7
    //   3555: iconst_1
    //   3556: invokevirtual setAccessible : (Z)V
    //   3559: aload #7
    //   3561: aconst_null
    //   3562: iconst_2
    //   3563: anewarray java/lang/Object
    //   3566: dup
    //   3567: iconst_0
    //   3568: aload_0
    //   3569: aastore
    //   3570: dup
    //   3571: iconst_1
    //   3572: aload_1
    //   3573: ifnonnull -> 3591
    //   3576: goto -> 3583
    //   3579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3582: athrow
    //   3583: aload_1
    //   3584: goto -> 3598
    //   3587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3590: athrow
    //   3591: aload_1
    //   3592: checkcast [B
    //   3595: invokevirtual clone : ()Ljava/lang/Object;
    //   3598: aastore
    //   3599: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3602: checkcast java/lang/Boolean
    //   3605: invokevirtual booleanValue : ()Z
    //   3608: istore_3
    //   3609: iload_2
    //   3610: ifeq -> 3627
    //   3613: iinc #6, 1
    //   3616: iload_2
    //   3617: ifeq -> 3487
    //   3620: goto -> 3627
    //   3623: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3626: athrow
    //   3627: iload_3
    //   3628: ireturn
    //   3629: astore_3
    //   3630: new java/lang/Exception
    //   3633: dup
    //   3634: aload_3
    //   3635: invokevirtual getMessage : ()Ljava/lang/String;
    //   3638: invokespecial <init> : (Ljava/lang/String;)V
    //   3641: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1439	3629	java/lang/Throwable
    //   79	93	93	java/lang/Throwable
    //   104	117	120	java/lang/Throwable
    //   109	132	135	java/lang/Throwable
    //   124	150	153	java/lang/Throwable
    //   139	180	183	java/lang/Throwable
    //   243	270	273	java/lang/Throwable
    //   260	291	294	java/lang/Throwable
    //   277	321	324	java/lang/Throwable
    //   298	332	332	java/lang/Throwable
    //   343	359	362	java/lang/Throwable
    //   366	703	706	java/lang/Throwable
    //   537	547	547	java/lang/Throwable
    //   551	563	563	java/lang/Throwable
    //   567	579	579	java/lang/Throwable
    //   583	596	596	java/lang/Throwable
    //   600	613	613	java/lang/Throwable
    //   799	813	813	java/lang/Throwable
    //   824	837	840	java/lang/Throwable
    //   829	852	855	java/lang/Throwable
    //   844	870	873	java/lang/Throwable
    //   859	900	903	java/lang/Throwable
    //   966	993	996	java/lang/Throwable
    //   983	1011	1014	java/lang/Throwable
    //   1000	1041	1044	java/lang/Throwable
    //   1018	1052	1052	java/lang/Throwable
    //   1074	1085	1088	java/lang/Throwable
    //   1141	1155	1155	java/lang/Throwable
    //   1166	1179	1182	java/lang/Throwable
    //   1171	1194	1197	java/lang/Throwable
    //   1186	1212	1215	java/lang/Throwable
    //   1201	1242	1245	java/lang/Throwable
    //   1308	1335	1338	java/lang/Throwable
    //   1325	1353	1356	java/lang/Throwable
    //   1342	1383	1386	java/lang/Throwable
    //   1360	1394	1394	java/lang/Throwable
    //   1416	1427	1430	java/lang/Throwable
    //   1440	2170	3629	java/lang/Throwable
    //   1530	1544	1544	java/lang/Throwable
    //   1555	1568	1571	java/lang/Throwable
    //   1560	1583	1586	java/lang/Throwable
    //   1575	1601	1604	java/lang/Throwable
    //   1590	1631	1634	java/lang/Throwable
    //   1697	1724	1727	java/lang/Throwable
    //   1714	1742	1745	java/lang/Throwable
    //   1731	1772	1775	java/lang/Throwable
    //   1749	1783	1783	java/lang/Throwable
    //   1805	1816	1819	java/lang/Throwable
    //   1872	1886	1886	java/lang/Throwable
    //   1897	1910	1913	java/lang/Throwable
    //   1902	1925	1928	java/lang/Throwable
    //   1917	1943	1946	java/lang/Throwable
    //   1932	1973	1976	java/lang/Throwable
    //   2039	2066	2069	java/lang/Throwable
    //   2056	2084	2087	java/lang/Throwable
    //   2073	2114	2117	java/lang/Throwable
    //   2091	2125	2125	java/lang/Throwable
    //   2147	2158	2161	java/lang/Throwable
    //   2171	2901	3629	java/lang/Throwable
    //   2261	2275	2275	java/lang/Throwable
    //   2286	2299	2302	java/lang/Throwable
    //   2291	2314	2317	java/lang/Throwable
    //   2306	2332	2335	java/lang/Throwable
    //   2321	2362	2365	java/lang/Throwable
    //   2428	2455	2458	java/lang/Throwable
    //   2445	2473	2476	java/lang/Throwable
    //   2462	2503	2506	java/lang/Throwable
    //   2480	2514	2514	java/lang/Throwable
    //   2536	2547	2550	java/lang/Throwable
    //   2603	2617	2617	java/lang/Throwable
    //   2628	2641	2644	java/lang/Throwable
    //   2633	2656	2659	java/lang/Throwable
    //   2648	2674	2677	java/lang/Throwable
    //   2663	2704	2707	java/lang/Throwable
    //   2770	2797	2800	java/lang/Throwable
    //   2787	2815	2818	java/lang/Throwable
    //   2804	2845	2848	java/lang/Throwable
    //   2822	2856	2856	java/lang/Throwable
    //   2878	2889	2892	java/lang/Throwable
    //   2902	3628	3629	java/lang/Throwable
    //   2992	3006	3006	java/lang/Throwable
    //   3017	3030	3033	java/lang/Throwable
    //   3022	3045	3048	java/lang/Throwable
    //   3037	3063	3066	java/lang/Throwable
    //   3052	3093	3096	java/lang/Throwable
    //   3159	3186	3189	java/lang/Throwable
    //   3176	3204	3207	java/lang/Throwable
    //   3193	3234	3237	java/lang/Throwable
    //   3211	3245	3245	java/lang/Throwable
    //   3267	3278	3281	java/lang/Throwable
    //   3334	3348	3348	java/lang/Throwable
    //   3359	3372	3375	java/lang/Throwable
    //   3364	3387	3390	java/lang/Throwable
    //   3379	3405	3408	java/lang/Throwable
    //   3394	3435	3438	java/lang/Throwable
    //   3501	3528	3531	java/lang/Throwable
    //   3518	3546	3549	java/lang/Throwable
    //   3535	3576	3579	java/lang/Throwable
    //   3553	3587	3587	java/lang/Throwable
    //   3609	3620	3623	java/lang/Throwable
  }
  
  static void ZB(Object paramObject) {
    Zkq9.ZO = a(1111, 21135);
    Zkq9.Ze = new BigInteger(a(1109, 31342));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zmuj.ZG.charAt(Math.abs(((BigInteger)Zk88.ZX).intValue() % 32)) <= Ztip.Z_.charAt(Math.abs(((BigInteger)Zf.Zh).intValue() % 32))) {
          try {
            Zlot.Zl(Class.forName(a(1106, 4092)));
            if (!bool)
              Zlo4.Zr(Class.forName(a(1096, 11690))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlo4.Zr(Class.forName(a(1096, 11690)));
    } catch (Throwable throwable) {}
  }
  
  static void ZG(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¼)W/ÅjÂY\\tFó\\bt.ø³ò\\tÑ1ú,póÆÚ\\t­¿-hð\\tÖylYLê\\t#hK{»Ñ \\tªÞÑL~:2 ©mÄí\\bnmß¯Uø_ ñ±ò7BÆF\\tÎ5_¬ÔÀ\\nMïOÑÿæ½j°ôä*ð×âÔ\ç8Á\\rAúkDüùx(Lr2\\néìMF\\fW#<SD]>A·;càFxñ4Î(Ïzõv¥¬+£\\tÂù5<ÐF·« 4êEt¨r£©£/~àpFÃ1ç%®QvòxÍ\\f\\tÅ ²/ =þº\\tI&éÎ¯W%yd%\\tkü­Ä(5\\t¹Ø÷ÑTä-\\n\\t6ÑÌïpCY\\tå|{ ÒÃ\\t]9k-BÓÜA"/Vä3ïÇ§~k\\tv¶Üîí\\rì\\tÁ2?0>¸¾\\t[¾«ÝZÍ"\\tIþéÕÌ*\\tü_ÙÄMWX\\bÞÏóL8E'ï)p}û|næwÄ=}ãAyóU¥'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #25
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
    //   68: ldc 'àC\\tIëh0§í\\t'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #19
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
    //   128: putstatic burp/Zvos.a : [Ljava/lang/String;
    //   131: bipush #29
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zvos.b : [Ljava/lang/String;
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
    //   212: bipush #36
    //   214: goto -> 244
    //   217: bipush #77
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #50
    //   229: goto -> 244
    //   232: bipush #67
    //   234: goto -> 244
    //   237: bipush #46
    //   239: goto -> 244
    //   242: bipush #19
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
    //   300: sipush #1114
    //   303: sipush #14886
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zvos.Zk : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #54
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #54
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #45
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-49
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #106
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-15
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #35
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #113
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #50
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-94
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #27
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-86
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #16
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #45
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-45
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-39
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-115
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #125
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #106
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #92
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #78
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-92
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #46
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-120
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-69
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-58
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-103
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #57
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-55
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-82
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #119
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #62
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zvos.Zr : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x45D) & 0xFFFF;
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
      byte b1 = 6;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvos.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */