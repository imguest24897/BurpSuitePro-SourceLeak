package burp;

import java.math.BigInteger;

class Zr14 extends ClassLoader {
  static String ZL;
  
  static Object Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zl(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-6199
    //   7: sipush #26409
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Z_ : (Ljava/lang/Object;)V
    //   19: sipush #-6204
    //   22: getstatic burp/Zr6c.ZG : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zxp5.ZA : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zl1e.Zp : Ljava/lang/Object;
    //   40: sipush #7938
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: iconst_1
    //   47: ldc burp/Zbp_
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
    //   165: sipush #-6205
    //   168: sipush #12868
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
    //   207: sipush #-6200
    //   210: sipush #-6152
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
    //   366: iconst_0
    //   367: istore_3
    //   368: getstatic burp/Zrkd.ZL : Ljava/lang/String;
    //   371: getstatic burp/Zle9.ZI : Ljava/lang/Object;
    //   374: checkcast java/math/BigInteger
    //   377: invokevirtual intValue : ()I
    //   380: bipush #32
    //   382: irem
    //   383: invokestatic abs : (I)I
    //   386: invokevirtual charAt : (I)C
    //   389: getstatic burp/Zsfj.Zg : Ljava/lang/String;
    //   392: getstatic burp/Zk8i.ZN : Ljava/lang/Object;
    //   395: checkcast java/math/BigInteger
    //   398: invokevirtual intValue : ()I
    //   401: bipush #32
    //   403: irem
    //   404: invokestatic abs : (I)I
    //   407: invokevirtual charAt : (I)C
    //   410: if_icmple -> 754
    //   413: sipush #-6189
    //   416: sipush #19408
    //   419: invokestatic a : (II)Ljava/lang/String;
    //   422: iconst_1
    //   423: ldc burp/Zsxm
    //   425: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   428: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   431: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   434: astore #4
    //   436: aload #4
    //   438: arraylength
    //   439: istore #5
    //   441: iconst_0
    //   442: istore #6
    //   444: iload #6
    //   446: iload #5
    //   448: if_icmpge -> 586
    //   451: aload #4
    //   453: iload #6
    //   455: aaload
    //   456: astore #7
    //   458: aload #7
    //   460: invokevirtual getModifiers : ()I
    //   463: invokestatic isStatic : (I)Z
    //   466: ifne -> 476
    //   469: goto -> 579
    //   472: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   475: athrow
    //   476: aload #7
    //   478: invokevirtual getType : ()Ljava/lang/Class;
    //   481: astore #8
    //   483: aload #8
    //   485: ifnull -> 566
    //   488: aload #8
    //   490: invokevirtual isPrimitive : ()Z
    //   493: ifne -> 566
    //   496: goto -> 503
    //   499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   502: athrow
    //   503: aload #8
    //   505: invokevirtual getPackage : ()Ljava/lang/Package;
    //   508: ifnull -> 566
    //   511: goto -> 518
    //   514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   517: athrow
    //   518: aload #8
    //   520: invokevirtual getPackage : ()Ljava/lang/Package;
    //   523: invokevirtual getName : ()Ljava/lang/String;
    //   526: ifnull -> 566
    //   529: goto -> 536
    //   532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   535: athrow
    //   536: aload #8
    //   538: invokevirtual getPackage : ()Ljava/lang/Package;
    //   541: invokevirtual getName : ()Ljava/lang/String;
    //   544: sipush #-6194
    //   547: sipush #5899
    //   550: invokestatic a : (II)Ljava/lang/String;
    //   553: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   556: ifne -> 566
    //   559: goto -> 566
    //   562: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   565: athrow
    //   566: aload #7
    //   568: iconst_1
    //   569: invokevirtual setAccessible : (Z)V
    //   572: aload #7
    //   574: aconst_null
    //   575: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   578: pop
    //   579: iinc #6, 1
    //   582: iload_2
    //   583: ifeq -> 444
    //   586: sipush #-6198
    //   589: sipush #-22600
    //   592: invokestatic a : (II)Ljava/lang/String;
    //   595: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   598: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   601: astore #4
    //   603: aload #4
    //   605: arraylength
    //   606: istore #5
    //   608: iconst_0
    //   609: istore #6
    //   611: iload #6
    //   613: iload #5
    //   615: if_icmpge -> 751
    //   618: aload #4
    //   620: iload #6
    //   622: aaload
    //   623: astore #7
    //   625: aload #7
    //   627: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   630: pop
    //   631: aload #7
    //   633: invokevirtual getModifiers : ()I
    //   636: invokestatic isStatic : (I)Z
    //   639: ifeq -> 737
    //   642: aload #7
    //   644: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   647: arraylength
    //   648: iconst_2
    //   649: if_icmpne -> 737
    //   652: goto -> 659
    //   655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   658: athrow
    //   659: aload #7
    //   661: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   664: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   667: if_acmpne -> 737
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   676: athrow
    //   677: aload #7
    //   679: iconst_1
    //   680: invokevirtual setAccessible : (Z)V
    //   683: aload #7
    //   685: aconst_null
    //   686: iconst_2
    //   687: anewarray java/lang/Object
    //   690: dup
    //   691: iconst_0
    //   692: aload_0
    //   693: aastore
    //   694: dup
    //   695: iconst_1
    //   696: aload_1
    //   697: ifnonnull -> 715
    //   700: goto -> 707
    //   703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   706: athrow
    //   707: aload_1
    //   708: goto -> 722
    //   711: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   714: athrow
    //   715: aload_1
    //   716: checkcast [B
    //   719: invokevirtual clone : ()Ljava/lang/Object;
    //   722: aastore
    //   723: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   726: checkcast java/lang/Boolean
    //   729: invokevirtual booleanValue : ()Z
    //   732: istore_3
    //   733: iload_2
    //   734: ifeq -> 751
    //   737: iinc #6, 1
    //   740: iload_2
    //   741: ifeq -> 611
    //   744: goto -> 751
    //   747: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   750: athrow
    //   751: goto -> 1092
    //   754: sipush #-6206
    //   757: sipush #14141
    //   760: invokestatic a : (II)Ljava/lang/String;
    //   763: iconst_1
    //   764: ldc burp/Zlpu
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
    //   885: sipush #-6194
    //   888: sipush #5899
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
    //   927: sipush #-6188
    //   930: sipush #14128
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
    //   1092: iload_3
    //   1093: ifeq -> 1098
    //   1096: iload_3
    //   1097: ireturn
    //   1098: getstatic burp/Zzc9.Zv : Ljava/lang/String;
    //   1101: getstatic burp/Zeqx.Zh : Ljava/lang/Object;
    //   1104: checkcast java/math/BigInteger
    //   1107: invokevirtual intValue : ()I
    //   1110: bipush #32
    //   1112: irem
    //   1113: invokestatic abs : (I)I
    //   1116: invokevirtual charAt : (I)C
    //   1119: getstatic burp/Zrwp.ZS : Ljava/lang/String;
    //   1122: getstatic burp/Zxc0.Zl : Ljava/lang/Object;
    //   1125: checkcast java/math/BigInteger
    //   1128: invokevirtual intValue : ()I
    //   1131: bipush #32
    //   1133: irem
    //   1134: invokestatic abs : (I)I
    //   1137: invokevirtual charAt : (I)C
    //   1140: if_icmple -> 1485
    //   1143: sipush #-6193
    //   1146: sipush #-11371
    //   1149: invokestatic a : (II)Ljava/lang/String;
    //   1152: iconst_1
    //   1153: ldc burp/Zr9j
    //   1155: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1158: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1161: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1164: astore #4
    //   1166: aload #4
    //   1168: arraylength
    //   1169: istore #5
    //   1171: iconst_0
    //   1172: istore #6
    //   1174: iload #6
    //   1176: iload #5
    //   1178: if_icmpge -> 1316
    //   1181: aload #4
    //   1183: iload #6
    //   1185: aaload
    //   1186: astore #7
    //   1188: aload #7
    //   1190: invokevirtual getModifiers : ()I
    //   1193: invokestatic isStatic : (I)Z
    //   1196: ifne -> 1206
    //   1199: goto -> 1309
    //   1202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1205: athrow
    //   1206: aload #7
    //   1208: invokevirtual getType : ()Ljava/lang/Class;
    //   1211: astore #8
    //   1213: aload #8
    //   1215: ifnull -> 1296
    //   1218: aload #8
    //   1220: invokevirtual isPrimitive : ()Z
    //   1223: ifne -> 1296
    //   1226: goto -> 1233
    //   1229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1232: athrow
    //   1233: aload #8
    //   1235: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1238: ifnull -> 1296
    //   1241: goto -> 1248
    //   1244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1247: athrow
    //   1248: aload #8
    //   1250: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1253: invokevirtual getName : ()Ljava/lang/String;
    //   1256: ifnull -> 1296
    //   1259: goto -> 1266
    //   1262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1265: athrow
    //   1266: aload #8
    //   1268: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1271: invokevirtual getName : ()Ljava/lang/String;
    //   1274: sipush #-6194
    //   1277: sipush #5899
    //   1280: invokestatic a : (II)Ljava/lang/String;
    //   1283: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1286: ifne -> 1296
    //   1289: goto -> 1296
    //   1292: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1295: athrow
    //   1296: aload #7
    //   1298: iconst_1
    //   1299: invokevirtual setAccessible : (Z)V
    //   1302: aload #7
    //   1304: aconst_null
    //   1305: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1308: pop
    //   1309: iinc #6, 1
    //   1312: iload_2
    //   1313: ifeq -> 1174
    //   1316: sipush #-6208
    //   1319: sipush #4279
    //   1322: invokestatic a : (II)Ljava/lang/String;
    //   1325: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1328: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1331: astore #4
    //   1333: aload #4
    //   1335: arraylength
    //   1336: istore #5
    //   1338: iconst_0
    //   1339: istore #6
    //   1341: iload #6
    //   1343: iload #5
    //   1345: if_icmpge -> 1481
    //   1348: aload #4
    //   1350: iload #6
    //   1352: aaload
    //   1353: astore #7
    //   1355: aload #7
    //   1357: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1360: pop
    //   1361: aload #7
    //   1363: invokevirtual getModifiers : ()I
    //   1366: invokestatic isStatic : (I)Z
    //   1369: ifeq -> 1467
    //   1372: aload #7
    //   1374: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1377: arraylength
    //   1378: iconst_2
    //   1379: if_icmpne -> 1467
    //   1382: goto -> 1389
    //   1385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1388: athrow
    //   1389: aload #7
    //   1391: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1394: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1397: if_acmpne -> 1467
    //   1400: goto -> 1407
    //   1403: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1406: athrow
    //   1407: aload #7
    //   1409: iconst_1
    //   1410: invokevirtual setAccessible : (Z)V
    //   1413: aload #7
    //   1415: aconst_null
    //   1416: iconst_2
    //   1417: anewarray java/lang/Object
    //   1420: dup
    //   1421: iconst_0
    //   1422: aload_0
    //   1423: aastore
    //   1424: dup
    //   1425: iconst_1
    //   1426: aload_1
    //   1427: ifnonnull -> 1445
    //   1430: goto -> 1437
    //   1433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1436: athrow
    //   1437: aload_1
    //   1438: goto -> 1452
    //   1441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1444: athrow
    //   1445: aload_1
    //   1446: checkcast [B
    //   1449: invokevirtual clone : ()Ljava/lang/Object;
    //   1452: aastore
    //   1453: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1456: checkcast java/lang/Boolean
    //   1459: invokevirtual booleanValue : ()Z
    //   1462: istore_3
    //   1463: iload_2
    //   1464: ifeq -> 1481
    //   1467: iinc #6, 1
    //   1470: iload_2
    //   1471: ifeq -> 1341
    //   1474: goto -> 1481
    //   1477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1480: athrow
    //   1481: iload_2
    //   1482: ifeq -> 1823
    //   1485: sipush #-6192
    //   1488: sipush #-10422
    //   1491: invokestatic a : (II)Ljava/lang/String;
    //   1494: iconst_1
    //   1495: ldc burp/Zeor
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
    //   1616: sipush #-6194
    //   1619: sipush #5899
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
    //   1658: sipush #-6207
    //   1661: sipush #18961
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
    //   1823: iload_3
    //   1824: ifeq -> 1829
    //   1827: iload_3
    //   1828: ireturn
    //   1829: getstatic burp/Ztwp.ZK : Ljava/lang/String;
    //   1832: getstatic burp/Zge2.Zv : Ljava/lang/Object;
    //   1835: checkcast java/math/BigInteger
    //   1838: invokevirtual intValue : ()I
    //   1841: bipush #32
    //   1843: irem
    //   1844: invokestatic abs : (I)I
    //   1847: invokevirtual charAt : (I)C
    //   1850: getstatic burp/Zkjj.ZT : Ljava/lang/String;
    //   1853: getstatic burp/Zos.ZB : Ljava/lang/Object;
    //   1856: checkcast java/math/BigInteger
    //   1859: invokevirtual intValue : ()I
    //   1862: bipush #32
    //   1864: irem
    //   1865: invokestatic abs : (I)I
    //   1868: invokevirtual charAt : (I)C
    //   1871: if_icmpgt -> 2216
    //   1874: sipush #-6185
    //   1877: sipush #-20091
    //   1880: invokestatic a : (II)Ljava/lang/String;
    //   1883: iconst_1
    //   1884: ldc burp/Zkor
    //   1886: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1889: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1892: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1895: astore #4
    //   1897: aload #4
    //   1899: arraylength
    //   1900: istore #5
    //   1902: iconst_0
    //   1903: istore #6
    //   1905: iload #6
    //   1907: iload #5
    //   1909: if_icmpge -> 2047
    //   1912: aload #4
    //   1914: iload #6
    //   1916: aaload
    //   1917: astore #7
    //   1919: aload #7
    //   1921: invokevirtual getModifiers : ()I
    //   1924: invokestatic isStatic : (I)Z
    //   1927: ifne -> 1937
    //   1930: goto -> 2040
    //   1933: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1936: athrow
    //   1937: aload #7
    //   1939: invokevirtual getType : ()Ljava/lang/Class;
    //   1942: astore #8
    //   1944: aload #8
    //   1946: ifnull -> 2027
    //   1949: aload #8
    //   1951: invokevirtual isPrimitive : ()Z
    //   1954: ifne -> 2027
    //   1957: goto -> 1964
    //   1960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1963: athrow
    //   1964: aload #8
    //   1966: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1969: ifnull -> 2027
    //   1972: goto -> 1979
    //   1975: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1978: athrow
    //   1979: aload #8
    //   1981: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1984: invokevirtual getName : ()Ljava/lang/String;
    //   1987: ifnull -> 2027
    //   1990: goto -> 1997
    //   1993: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1996: athrow
    //   1997: aload #8
    //   1999: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2002: invokevirtual getName : ()Ljava/lang/String;
    //   2005: sipush #-6194
    //   2008: sipush #5899
    //   2011: invokestatic a : (II)Ljava/lang/String;
    //   2014: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2017: ifne -> 2027
    //   2020: goto -> 2027
    //   2023: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2026: athrow
    //   2027: aload #7
    //   2029: iconst_1
    //   2030: invokevirtual setAccessible : (Z)V
    //   2033: aload #7
    //   2035: aconst_null
    //   2036: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2039: pop
    //   2040: iinc #6, 1
    //   2043: iload_2
    //   2044: ifeq -> 1905
    //   2047: sipush #-6203
    //   2050: sipush #28506
    //   2053: invokestatic a : (II)Ljava/lang/String;
    //   2056: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2059: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2062: astore #4
    //   2064: aload #4
    //   2066: arraylength
    //   2067: istore #5
    //   2069: iconst_0
    //   2070: istore #6
    //   2072: iload #6
    //   2074: iload #5
    //   2076: if_icmpge -> 2212
    //   2079: aload #4
    //   2081: iload #6
    //   2083: aaload
    //   2084: astore #7
    //   2086: aload #7
    //   2088: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2091: pop
    //   2092: aload #7
    //   2094: invokevirtual getModifiers : ()I
    //   2097: invokestatic isStatic : (I)Z
    //   2100: ifeq -> 2198
    //   2103: aload #7
    //   2105: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2108: arraylength
    //   2109: iconst_2
    //   2110: if_icmpne -> 2198
    //   2113: goto -> 2120
    //   2116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2119: athrow
    //   2120: aload #7
    //   2122: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2125: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2128: if_acmpne -> 2198
    //   2131: goto -> 2138
    //   2134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2137: athrow
    //   2138: aload #7
    //   2140: iconst_1
    //   2141: invokevirtual setAccessible : (Z)V
    //   2144: aload #7
    //   2146: aconst_null
    //   2147: iconst_2
    //   2148: anewarray java/lang/Object
    //   2151: dup
    //   2152: iconst_0
    //   2153: aload_0
    //   2154: aastore
    //   2155: dup
    //   2156: iconst_1
    //   2157: aload_1
    //   2158: ifnonnull -> 2176
    //   2161: goto -> 2168
    //   2164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2167: athrow
    //   2168: aload_1
    //   2169: goto -> 2183
    //   2172: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2175: athrow
    //   2176: aload_1
    //   2177: checkcast [B
    //   2180: invokevirtual clone : ()Ljava/lang/Object;
    //   2183: aastore
    //   2184: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2187: checkcast java/lang/Boolean
    //   2190: invokevirtual booleanValue : ()Z
    //   2193: istore_3
    //   2194: iload_2
    //   2195: ifeq -> 2212
    //   2198: iinc #6, 1
    //   2201: iload_2
    //   2202: ifeq -> 2072
    //   2205: goto -> 2212
    //   2208: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2211: athrow
    //   2212: iload_2
    //   2213: ifeq -> 2554
    //   2216: sipush #-6202
    //   2219: sipush #-23242
    //   2222: invokestatic a : (II)Ljava/lang/String;
    //   2225: iconst_1
    //   2226: ldc burp/Zepm
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
    //   2347: sipush #-6194
    //   2350: sipush #5899
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
    //   2389: sipush #-6201
    //   2392: sipush #-4680
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
    //   2554: iload_3
    //   2555: ifeq -> 2560
    //   2558: iload_3
    //   2559: ireturn
    //   2560: getstatic burp/Zxxh.Zm : Ljava/lang/String;
    //   2563: getstatic burp/Zzna.ZD : Ljava/lang/Object;
    //   2566: checkcast java/math/BigInteger
    //   2569: invokevirtual intValue : ()I
    //   2572: bipush #32
    //   2574: irem
    //   2575: invokestatic abs : (I)I
    //   2578: invokevirtual charAt : (I)C
    //   2581: getstatic burp/Zrww.ZV : Ljava/lang/String;
    //   2584: getstatic burp/Zsjc.ZX : Ljava/lang/Object;
    //   2587: checkcast java/math/BigInteger
    //   2590: invokevirtual intValue : ()I
    //   2593: bipush #32
    //   2595: irem
    //   2596: invokestatic abs : (I)I
    //   2599: invokevirtual charAt : (I)C
    //   2602: if_icmpgt -> 2947
    //   2605: sipush #-6196
    //   2608: sipush #-22640
    //   2611: invokestatic a : (II)Ljava/lang/String;
    //   2614: iconst_1
    //   2615: ldc burp/Zmdi
    //   2617: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2620: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2623: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2626: astore #4
    //   2628: aload #4
    //   2630: arraylength
    //   2631: istore #5
    //   2633: iconst_0
    //   2634: istore #6
    //   2636: iload #6
    //   2638: iload #5
    //   2640: if_icmpge -> 2778
    //   2643: aload #4
    //   2645: iload #6
    //   2647: aaload
    //   2648: astore #7
    //   2650: aload #7
    //   2652: invokevirtual getModifiers : ()I
    //   2655: invokestatic isStatic : (I)Z
    //   2658: ifne -> 2668
    //   2661: goto -> 2771
    //   2664: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2667: athrow
    //   2668: aload #7
    //   2670: invokevirtual getType : ()Ljava/lang/Class;
    //   2673: astore #8
    //   2675: aload #8
    //   2677: ifnull -> 2758
    //   2680: aload #8
    //   2682: invokevirtual isPrimitive : ()Z
    //   2685: ifne -> 2758
    //   2688: goto -> 2695
    //   2691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2694: athrow
    //   2695: aload #8
    //   2697: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2700: ifnull -> 2758
    //   2703: goto -> 2710
    //   2706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2709: athrow
    //   2710: aload #8
    //   2712: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2715: invokevirtual getName : ()Ljava/lang/String;
    //   2718: ifnull -> 2758
    //   2721: goto -> 2728
    //   2724: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2727: athrow
    //   2728: aload #8
    //   2730: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2733: invokevirtual getName : ()Ljava/lang/String;
    //   2736: sipush #-6194
    //   2739: sipush #5899
    //   2742: invokestatic a : (II)Ljava/lang/String;
    //   2745: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2748: ifne -> 2758
    //   2751: goto -> 2758
    //   2754: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2757: athrow
    //   2758: aload #7
    //   2760: iconst_1
    //   2761: invokevirtual setAccessible : (Z)V
    //   2764: aload #7
    //   2766: aconst_null
    //   2767: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2770: pop
    //   2771: iinc #6, 1
    //   2774: iload_2
    //   2775: ifeq -> 2636
    //   2778: sipush #-6186
    //   2781: sipush #-15990
    //   2784: invokestatic a : (II)Ljava/lang/String;
    //   2787: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2790: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2793: astore #4
    //   2795: aload #4
    //   2797: arraylength
    //   2798: istore #5
    //   2800: iconst_0
    //   2801: istore #6
    //   2803: iload #6
    //   2805: iload #5
    //   2807: if_icmpge -> 2943
    //   2810: aload #4
    //   2812: iload #6
    //   2814: aaload
    //   2815: astore #7
    //   2817: aload #7
    //   2819: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2822: pop
    //   2823: aload #7
    //   2825: invokevirtual getModifiers : ()I
    //   2828: invokestatic isStatic : (I)Z
    //   2831: ifeq -> 2929
    //   2834: aload #7
    //   2836: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2839: arraylength
    //   2840: iconst_2
    //   2841: if_icmpne -> 2929
    //   2844: goto -> 2851
    //   2847: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2850: athrow
    //   2851: aload #7
    //   2853: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2856: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2859: if_acmpne -> 2929
    //   2862: goto -> 2869
    //   2865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2868: athrow
    //   2869: aload #7
    //   2871: iconst_1
    //   2872: invokevirtual setAccessible : (Z)V
    //   2875: aload #7
    //   2877: aconst_null
    //   2878: iconst_2
    //   2879: anewarray java/lang/Object
    //   2882: dup
    //   2883: iconst_0
    //   2884: aload_0
    //   2885: aastore
    //   2886: dup
    //   2887: iconst_1
    //   2888: aload_1
    //   2889: ifnonnull -> 2907
    //   2892: goto -> 2899
    //   2895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2898: athrow
    //   2899: aload_1
    //   2900: goto -> 2914
    //   2903: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2906: athrow
    //   2907: aload_1
    //   2908: checkcast [B
    //   2911: invokevirtual clone : ()Ljava/lang/Object;
    //   2914: aastore
    //   2915: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2918: checkcast java/lang/Boolean
    //   2921: invokevirtual booleanValue : ()Z
    //   2924: istore_3
    //   2925: iload_2
    //   2926: ifeq -> 2943
    //   2929: iinc #6, 1
    //   2932: iload_2
    //   2933: ifeq -> 2803
    //   2936: goto -> 2943
    //   2939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2942: athrow
    //   2943: iload_2
    //   2944: ifeq -> 3285
    //   2947: sipush #-6197
    //   2950: sipush #16412
    //   2953: invokestatic a : (II)Ljava/lang/String;
    //   2956: iconst_1
    //   2957: ldc burp/Ztg3
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
    //   3078: sipush #-6194
    //   3081: sipush #5899
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
    //   3120: sipush #-6177
    //   3123: sipush #-16427
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
    //   3285: iload_3
    //   3286: ireturn
    //   3287: astore_3
    //   3288: new java/lang/Exception
    //   3291: dup
    //   3292: aload_3
    //   3293: invokevirtual getMessage : ()Ljava/lang/String;
    //   3296: invokespecial <init> : (Ljava/lang/String;)V
    //   3299: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1097	3287	java/lang/Throwable
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
    //   458	472	472	java/lang/Throwable
    //   483	496	499	java/lang/Throwable
    //   488	511	514	java/lang/Throwable
    //   503	529	532	java/lang/Throwable
    //   518	559	562	java/lang/Throwable
    //   625	652	655	java/lang/Throwable
    //   642	670	673	java/lang/Throwable
    //   659	700	703	java/lang/Throwable
    //   677	711	711	java/lang/Throwable
    //   733	744	747	java/lang/Throwable
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
    //   1098	1828	3287	java/lang/Throwable
    //   1188	1202	1202	java/lang/Throwable
    //   1213	1226	1229	java/lang/Throwable
    //   1218	1241	1244	java/lang/Throwable
    //   1233	1259	1262	java/lang/Throwable
    //   1248	1289	1292	java/lang/Throwable
    //   1355	1382	1385	java/lang/Throwable
    //   1372	1400	1403	java/lang/Throwable
    //   1389	1430	1433	java/lang/Throwable
    //   1407	1441	1441	java/lang/Throwable
    //   1463	1474	1477	java/lang/Throwable
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
    //   1829	2559	3287	java/lang/Throwable
    //   1919	1933	1933	java/lang/Throwable
    //   1944	1957	1960	java/lang/Throwable
    //   1949	1972	1975	java/lang/Throwable
    //   1964	1990	1993	java/lang/Throwable
    //   1979	2020	2023	java/lang/Throwable
    //   2086	2113	2116	java/lang/Throwable
    //   2103	2131	2134	java/lang/Throwable
    //   2120	2161	2164	java/lang/Throwable
    //   2138	2172	2172	java/lang/Throwable
    //   2194	2205	2208	java/lang/Throwable
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
    //   2560	3286	3287	java/lang/Throwable
    //   2650	2664	2664	java/lang/Throwable
    //   2675	2688	2691	java/lang/Throwable
    //   2680	2703	2706	java/lang/Throwable
    //   2695	2721	2724	java/lang/Throwable
    //   2710	2751	2754	java/lang/Throwable
    //   2817	2844	2847	java/lang/Throwable
    //   2834	2862	2865	java/lang/Throwable
    //   2851	2892	2895	java/lang/Throwable
    //   2869	2903	2903	java/lang/Throwable
    //   2925	2936	2939	java/lang/Throwable
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
  }
  
  static void ZN(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZL(Object paramObject) {
    Zsbo.Zg = a(-6195, -16355);
    Zsbo.ZG = new BigInteger(a(-6178, -13410));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zzl4.ZT.charAt(Math.abs(((BigInteger)Zm7v.ZP).intValue() % 32)) <= Zr60.ZQ.charAt(Math.abs(((BigInteger)Zsbo.ZG).intValue() % 32))) {
          try {
            Zkde.ZC(Class.forName(a(-6179, -11198)));
            if (bool)
              Zg4l.Zq(Class.forName(a(-6187, -22727))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zg4l.Zq(Class.forName(a(-6187, -22727)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '/vÃ. \\t8Í!Y^î,\\tp?(%= à\\t³úP¿p2ÉÌW\\n\\tyÄÏâ<Õ\\t¯òÓ¾ ÞY\\tdgª\\f/D5Û¸\\t(vå´yF|Ö/É 2»ì b» çuÿ1iÜLíóº©{ÕËS\\t¦ëò$vSÈ\\t &ð¾Û%å\\t/<Ãg) \\t¥(Õ×÷¯\\tð8P}Ïh£ø\\t&vâ.& \\t­ò¾\\bÖD<\\tÁ¹ñëê\\t£ÀRø0ÚËZ\\tÔ5¼Fí\\r{¤« Ë+ì¦1;û-ÿ1Ý\\f¨CÁ¡«§²Hì×GvMÍü7ø¥g±_ªÚÂãKÊ(z¾'ë´TzÓv°9=Ã<°y~©¨°lEHküâ.înÞÓOE¨¢á¨8d¥:oÄ7c\\t$ þÅ\\rÓ¡\\tÝV[°®ÎÖÝ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #60
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
    //   68: ldc '·úäR7¨Ò\\fÊ~£ÈiBq±qJGlè¼{¶®û@r§üpîi.ÓªX½A?hØ-oñÊ?þ[ÿö¦7xj!Ìöã\\tàx`7i3Î'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #76
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #62
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
    //   129: putstatic burp/Zr14.a : [Ljava/lang/String;
    //   132: bipush #27
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zr14.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #53
    //   214: goto -> 243
    //   217: bipush #70
    //   219: goto -> 243
    //   222: bipush #103
    //   224: goto -> 243
    //   227: bipush #56
    //   229: goto -> 243
    //   232: bipush #63
    //   234: goto -> 243
    //   237: bipush #93
    //   239: goto -> 243
    //   242: iconst_2
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
    //   300: sipush #-6190
    //   303: sipush #-29590
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zr14.ZL : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-6191
    //   319: sipush #-19625
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zr14.Zy : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE7C7) & 0xFFFF;
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
      char c = ' ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr14.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */