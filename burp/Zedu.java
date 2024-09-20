package burp;

import java.math.BigInteger;

class Zedu extends ClassLoader {
  static String ZD;
  
  static Object ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZH(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zmpx.ZZ : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zm0d.Zz : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zz4a.ZB : Ljava/lang/Object;
    //   22: ldc2_w 8682522807148012
    //   25: invokestatic currentTimeMillis : ()J
    //   28: lxor
    //   29: lstore #4
    //   31: lload #4
    //   33: ldc2_w 25214903917
    //   36: lmul
    //   37: ldc2_w 11
    //   40: ladd
    //   41: ldc2_w 281474976710655
    //   44: land
    //   45: lstore #4
    //   47: lload #4
    //   49: bipush #32
    //   51: lshl
    //   52: lstore #6
    //   54: lload #4
    //   56: ldc2_w 25214903917
    //   59: lmul
    //   60: ldc2_w 11
    //   63: ladd
    //   64: ldc2_w 281474976710655
    //   67: land
    //   68: lstore #4
    //   70: lload #6
    //   72: lload #4
    //   74: ladd
    //   75: lstore #6
    //   77: bipush #16
    //   79: newarray byte
    //   81: dup
    //   82: iconst_0
    //   83: bipush #48
    //   85: bastore
    //   86: dup
    //   87: iconst_1
    //   88: bipush #49
    //   90: bastore
    //   91: dup
    //   92: iconst_2
    //   93: bipush #50
    //   95: bastore
    //   96: dup
    //   97: iconst_3
    //   98: bipush #51
    //   100: bastore
    //   101: dup
    //   102: iconst_4
    //   103: bipush #52
    //   105: bastore
    //   106: dup
    //   107: iconst_5
    //   108: bipush #53
    //   110: bastore
    //   111: dup
    //   112: bipush #6
    //   114: bipush #54
    //   116: bastore
    //   117: dup
    //   118: bipush #7
    //   120: bipush #55
    //   122: bastore
    //   123: dup
    //   124: bipush #8
    //   126: bipush #56
    //   128: bastore
    //   129: dup
    //   130: bipush #9
    //   132: bipush #57
    //   134: bastore
    //   135: dup
    //   136: bipush #10
    //   138: bipush #97
    //   140: bastore
    //   141: dup
    //   142: bipush #11
    //   144: bipush #98
    //   146: bastore
    //   147: dup
    //   148: bipush #12
    //   150: bipush #99
    //   152: bastore
    //   153: dup
    //   154: bipush #13
    //   156: bipush #100
    //   158: bastore
    //   159: dup
    //   160: bipush #14
    //   162: bipush #101
    //   164: bastore
    //   165: dup
    //   166: bipush #15
    //   168: bipush #102
    //   170: bastore
    //   171: astore #8
    //   173: bipush #64
    //   175: newarray byte
    //   177: astore #9
    //   179: bipush #64
    //   181: istore #10
    //   183: bipush #16
    //   185: istore #11
    //   187: iload #11
    //   189: iconst_1
    //   190: isub
    //   191: i2l
    //   192: lstore #12
    //   194: aload #9
    //   196: iinc #10, -1
    //   199: iload #10
    //   201: aload #8
    //   203: lload #6
    //   205: lload #12
    //   207: land
    //   208: l2i
    //   209: baload
    //   210: bastore
    //   211: lload #6
    //   213: iconst_4
    //   214: lushr
    //   215: lstore #6
    //   217: lload #6
    //   219: lconst_0
    //   220: lcmp
    //   221: ifne -> 194
    //   224: bipush #64
    //   226: iload #10
    //   228: isub
    //   229: newarray byte
    //   231: astore_3
    //   232: iconst_0
    //   233: istore #14
    //   235: iload #14
    //   237: aload_3
    //   238: arraylength
    //   239: if_icmpge -> 261
    //   242: aload_3
    //   243: iload #14
    //   245: aload #9
    //   247: iload #10
    //   249: iload #14
    //   251: iadd
    //   252: baload
    //   253: bastore
    //   254: iinc #14, 1
    //   257: iload_2
    //   258: ifne -> 235
    //   261: aload_3
    //   262: arraylength
    //   263: bipush #10
    //   265: if_icmplt -> 31
    //   268: sipush #-3974
    //   271: sipush #-26691
    //   274: invokestatic a : (II)Ljava/lang/String;
    //   277: iconst_1
    //   278: ldc burp/Zera
    //   280: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   283: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   286: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   289: astore_3
    //   290: aload_3
    //   291: arraylength
    //   292: istore #4
    //   294: iconst_0
    //   295: istore #5
    //   297: iload #5
    //   299: iload #4
    //   301: if_icmpge -> 438
    //   304: aload_3
    //   305: iload #5
    //   307: aaload
    //   308: astore #6
    //   310: aload #6
    //   312: invokevirtual getModifiers : ()I
    //   315: invokestatic isStatic : (I)Z
    //   318: ifne -> 328
    //   321: goto -> 431
    //   324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   327: athrow
    //   328: aload #6
    //   330: invokevirtual getType : ()Ljava/lang/Class;
    //   333: astore #7
    //   335: aload #7
    //   337: ifnull -> 418
    //   340: aload #7
    //   342: invokevirtual isPrimitive : ()Z
    //   345: ifne -> 418
    //   348: goto -> 355
    //   351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   354: athrow
    //   355: aload #7
    //   357: invokevirtual getPackage : ()Ljava/lang/Package;
    //   360: ifnull -> 418
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   369: athrow
    //   370: aload #7
    //   372: invokevirtual getPackage : ()Ljava/lang/Package;
    //   375: invokevirtual getName : ()Ljava/lang/String;
    //   378: ifnull -> 418
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   387: athrow
    //   388: aload #7
    //   390: invokevirtual getPackage : ()Ljava/lang/Package;
    //   393: invokevirtual getName : ()Ljava/lang/String;
    //   396: sipush #-3998
    //   399: sipush #-32515
    //   402: invokestatic a : (II)Ljava/lang/String;
    //   405: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   408: ifne -> 418
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   417: athrow
    //   418: aload #6
    //   420: iconst_1
    //   421: invokevirtual setAccessible : (Z)V
    //   424: aload #6
    //   426: aconst_null
    //   427: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   430: pop
    //   431: iinc #5, 1
    //   434: iload_2
    //   435: ifne -> 297
    //   438: sipush #-4000
    //   441: sipush #17726
    //   444: invokestatic a : (II)Ljava/lang/String;
    //   447: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   450: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   453: astore_3
    //   454: aload_3
    //   455: arraylength
    //   456: istore #4
    //   458: iconst_0
    //   459: istore #5
    //   461: iload #5
    //   463: iload #4
    //   465: if_icmpge -> 597
    //   468: aload_3
    //   469: iload #5
    //   471: aaload
    //   472: astore #6
    //   474: aload #6
    //   476: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   479: pop
    //   480: aload #6
    //   482: invokevirtual getModifiers : ()I
    //   485: invokestatic isStatic : (I)Z
    //   488: ifeq -> 583
    //   491: aload #6
    //   493: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   496: arraylength
    //   497: iconst_2
    //   498: if_icmpne -> 583
    //   501: goto -> 508
    //   504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   507: athrow
    //   508: aload #6
    //   510: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   513: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   516: invokevirtual equals : (Ljava/lang/Object;)Z
    //   519: ifeq -> 583
    //   522: goto -> 529
    //   525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   528: athrow
    //   529: aload #6
    //   531: iconst_1
    //   532: invokevirtual setAccessible : (Z)V
    //   535: aload #6
    //   537: aconst_null
    //   538: iconst_2
    //   539: anewarray java/lang/Object
    //   542: dup
    //   543: iconst_0
    //   544: aload_0
    //   545: aastore
    //   546: dup
    //   547: iconst_1
    //   548: aload_1
    //   549: ifnonnull -> 567
    //   552: goto -> 559
    //   555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   558: athrow
    //   559: aload_1
    //   560: goto -> 574
    //   563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   566: athrow
    //   567: aload_1
    //   568: checkcast [B
    //   571: invokevirtual clone : ()Ljava/lang/Object;
    //   574: aastore
    //   575: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   578: pop
    //   579: iload_2
    //   580: ifne -> 597
    //   583: iinc #5, 1
    //   586: iload_2
    //   587: ifne -> 461
    //   590: goto -> 597
    //   593: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   596: athrow
    //   597: new java/io/ByteArrayOutputStream
    //   600: dup
    //   601: invokespecial <init> : ()V
    //   604: astore_3
    //   605: sipush #-3969
    //   608: aload_3
    //   609: sipush #202
    //   612: invokevirtual write : (I)V
    //   615: sipush #337
    //   618: aload_3
    //   619: sipush #254
    //   622: invokevirtual write : (I)V
    //   625: aload_3
    //   626: sipush #186
    //   629: invokevirtual write : (I)V
    //   632: aload_3
    //   633: sipush #190
    //   636: invokevirtual write : (I)V
    //   639: aload_3
    //   640: iconst_0
    //   641: invokevirtual write : (I)V
    //   644: aload_3
    //   645: iconst_1
    //   646: invokevirtual write : (I)V
    //   649: aload_3
    //   650: iconst_0
    //   651: invokevirtual write : (I)V
    //   654: aload_3
    //   655: bipush #50
    //   657: invokevirtual write : (I)V
    //   660: aload_3
    //   661: getstatic burp/Zz75.ZX : Ljava/lang/Object;
    //   664: checkcast java/math/BigInteger
    //   667: invokevirtual toByteArray : ()[B
    //   670: invokevirtual write : ([B)V
    //   673: aload_3
    //   674: getstatic burp/Zeqr.ZM : Ljava/lang/Object;
    //   677: checkcast java/math/BigInteger
    //   680: invokevirtual toByteArray : ()[B
    //   683: invokevirtual write : ([B)V
    //   686: aload_3
    //   687: getstatic burp/Ztg3.Zg : Ljava/lang/Object;
    //   690: checkcast java/math/BigInteger
    //   693: invokevirtual toByteArray : ()[B
    //   696: invokevirtual write : ([B)V
    //   699: aload_3
    //   700: invokevirtual toByteArray : ()[B
    //   703: astore #4
    //   705: aconst_null
    //   706: astore #5
    //   708: invokestatic a : (II)Ljava/lang/String;
    //   711: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   714: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   717: astore #6
    //   719: aload #6
    //   721: arraylength
    //   722: istore #7
    //   724: iconst_0
    //   725: istore #8
    //   727: iload #8
    //   729: iload #7
    //   731: if_icmpge -> 859
    //   734: aload #6
    //   736: iload #8
    //   738: aaload
    //   739: astore #9
    //   741: aload #9
    //   743: invokevirtual getName : ()Ljava/lang/String;
    //   746: sipush #-3985
    //   749: sipush #-31380
    //   752: invokestatic a : (II)Ljava/lang/String;
    //   755: invokevirtual equals : (Ljava/lang/Object;)Z
    //   758: ifeq -> 852
    //   761: aload #9
    //   763: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   766: astore #10
    //   768: aload #10
    //   770: arraylength
    //   771: iconst_4
    //   772: if_icmpeq -> 782
    //   775: goto -> 852
    //   778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   781: athrow
    //   782: aload #10
    //   784: iconst_0
    //   785: aaload
    //   786: ldc java/lang/String
    //   788: if_acmpeq -> 798
    //   791: goto -> 852
    //   794: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   797: athrow
    //   798: aload #10
    //   800: iconst_1
    //   801: aaload
    //   802: ldc [B
    //   804: if_acmpeq -> 814
    //   807: goto -> 852
    //   810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   813: athrow
    //   814: aload #10
    //   816: iconst_2
    //   817: aaload
    //   818: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   821: if_acmpeq -> 831
    //   824: goto -> 852
    //   827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   830: athrow
    //   831: aload #10
    //   833: iconst_3
    //   834: aaload
    //   835: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   838: if_acmpeq -> 848
    //   841: goto -> 852
    //   844: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   847: athrow
    //   848: aload #9
    //   850: astore #5
    //   852: iinc #8, 1
    //   855: iload_2
    //   856: ifne -> 727
    //   859: aload #5
    //   861: iconst_1
    //   862: invokevirtual setAccessible : (Z)V
    //   865: ldc burp/Zb_c
    //   867: iconst_0
    //   868: anewarray java/lang/Class
    //   871: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   874: astore #6
    //   876: aload #6
    //   878: iconst_1
    //   879: invokevirtual setAccessible : (Z)V
    //   882: aload #5
    //   884: aload #6
    //   886: iconst_0
    //   887: anewarray java/lang/Object
    //   890: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   893: iconst_4
    //   894: anewarray java/lang/Object
    //   897: dup
    //   898: iconst_0
    //   899: sipush #-3975
    //   902: sipush #-8656
    //   905: invokestatic a : (II)Ljava/lang/String;
    //   908: aastore
    //   909: dup
    //   910: iconst_1
    //   911: aload #4
    //   913: aastore
    //   914: dup
    //   915: iconst_2
    //   916: iconst_0
    //   917: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   920: aastore
    //   921: dup
    //   922: iconst_3
    //   923: aload #4
    //   925: arraylength
    //   926: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   929: aastore
    //   930: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   933: pop
    //   934: goto -> 938
    //   937: astore_3
    //   938: iconst_0
    //   939: istore_3
    //   940: getstatic burp/Zz0b.ZD : Ljava/lang/String;
    //   943: getstatic burp/Ze84.Zj : Ljava/lang/Object;
    //   946: checkcast java/math/BigInteger
    //   949: invokevirtual intValue : ()I
    //   952: bipush #32
    //   954: irem
    //   955: invokestatic abs : (I)I
    //   958: invokevirtual charAt : (I)C
    //   961: getstatic burp/Zrd3.Z_ : Ljava/lang/String;
    //   964: getstatic burp/Zse8.Zn : Ljava/lang/Object;
    //   967: checkcast java/math/BigInteger
    //   970: invokevirtual intValue : ()I
    //   973: bipush #32
    //   975: irem
    //   976: invokestatic abs : (I)I
    //   979: invokevirtual charAt : (I)C
    //   982: if_icmpgt -> 1327
    //   985: sipush #-3991
    //   988: sipush #6259
    //   991: invokestatic a : (II)Ljava/lang/String;
    //   994: iconst_1
    //   995: ldc burp/Zg_p
    //   997: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1000: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1003: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1006: astore #4
    //   1008: aload #4
    //   1010: arraylength
    //   1011: istore #5
    //   1013: iconst_0
    //   1014: istore #6
    //   1016: iload #6
    //   1018: iload #5
    //   1020: if_icmpge -> 1158
    //   1023: aload #4
    //   1025: iload #6
    //   1027: aaload
    //   1028: astore #7
    //   1030: aload #7
    //   1032: invokevirtual getModifiers : ()I
    //   1035: invokestatic isStatic : (I)Z
    //   1038: ifne -> 1048
    //   1041: goto -> 1151
    //   1044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1047: athrow
    //   1048: aload #7
    //   1050: invokevirtual getType : ()Ljava/lang/Class;
    //   1053: astore #8
    //   1055: aload #8
    //   1057: ifnull -> 1138
    //   1060: aload #8
    //   1062: invokevirtual isPrimitive : ()Z
    //   1065: ifne -> 1138
    //   1068: goto -> 1075
    //   1071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1074: athrow
    //   1075: aload #8
    //   1077: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1080: ifnull -> 1138
    //   1083: goto -> 1090
    //   1086: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1089: athrow
    //   1090: aload #8
    //   1092: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1095: invokevirtual getName : ()Ljava/lang/String;
    //   1098: ifnull -> 1138
    //   1101: goto -> 1108
    //   1104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1107: athrow
    //   1108: aload #8
    //   1110: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1113: invokevirtual getName : ()Ljava/lang/String;
    //   1116: sipush #-3976
    //   1119: sipush #21742
    //   1122: invokestatic a : (II)Ljava/lang/String;
    //   1125: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1128: ifne -> 1138
    //   1131: goto -> 1138
    //   1134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1137: athrow
    //   1138: aload #7
    //   1140: iconst_1
    //   1141: invokevirtual setAccessible : (Z)V
    //   1144: aload #7
    //   1146: aconst_null
    //   1147: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1150: pop
    //   1151: iinc #6, 1
    //   1154: iload_2
    //   1155: ifne -> 1016
    //   1158: sipush #-3990
    //   1161: sipush #30222
    //   1164: invokestatic a : (II)Ljava/lang/String;
    //   1167: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1170: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1173: astore #4
    //   1175: aload #4
    //   1177: arraylength
    //   1178: istore #5
    //   1180: iconst_0
    //   1181: istore #6
    //   1183: iload #6
    //   1185: iload #5
    //   1187: if_icmpge -> 1323
    //   1190: aload #4
    //   1192: iload #6
    //   1194: aaload
    //   1195: astore #7
    //   1197: aload #7
    //   1199: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1202: pop
    //   1203: aload #7
    //   1205: invokevirtual getModifiers : ()I
    //   1208: invokestatic isStatic : (I)Z
    //   1211: ifeq -> 1309
    //   1214: aload #7
    //   1216: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1219: arraylength
    //   1220: iconst_2
    //   1221: if_icmpne -> 1309
    //   1224: goto -> 1231
    //   1227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1230: athrow
    //   1231: aload #7
    //   1233: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1236: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1239: if_acmpne -> 1309
    //   1242: goto -> 1249
    //   1245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1248: athrow
    //   1249: aload #7
    //   1251: iconst_1
    //   1252: invokevirtual setAccessible : (Z)V
    //   1255: aload #7
    //   1257: aconst_null
    //   1258: iconst_2
    //   1259: anewarray java/lang/Object
    //   1262: dup
    //   1263: iconst_0
    //   1264: aload_0
    //   1265: aastore
    //   1266: dup
    //   1267: iconst_1
    //   1268: aload_1
    //   1269: ifnonnull -> 1287
    //   1272: goto -> 1279
    //   1275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1278: athrow
    //   1279: aload_1
    //   1280: goto -> 1294
    //   1283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1286: athrow
    //   1287: aload_1
    //   1288: checkcast [B
    //   1291: invokevirtual clone : ()Ljava/lang/Object;
    //   1294: aastore
    //   1295: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1298: checkcast java/lang/Boolean
    //   1301: invokevirtual booleanValue : ()Z
    //   1304: istore_3
    //   1305: iload_2
    //   1306: ifne -> 1323
    //   1309: iinc #6, 1
    //   1312: iload_2
    //   1313: ifne -> 1183
    //   1316: goto -> 1323
    //   1319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1322: athrow
    //   1323: iload_2
    //   1324: ifne -> 1665
    //   1327: sipush #-3977
    //   1330: sipush #20199
    //   1333: invokestatic a : (II)Ljava/lang/String;
    //   1336: iconst_1
    //   1337: ldc burp/Ztnw
    //   1339: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1342: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1345: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1348: astore #4
    //   1350: aload #4
    //   1352: arraylength
    //   1353: istore #5
    //   1355: iconst_0
    //   1356: istore #6
    //   1358: iload #6
    //   1360: iload #5
    //   1362: if_icmpge -> 1500
    //   1365: aload #4
    //   1367: iload #6
    //   1369: aaload
    //   1370: astore #7
    //   1372: aload #7
    //   1374: invokevirtual getModifiers : ()I
    //   1377: invokestatic isStatic : (I)Z
    //   1380: ifne -> 1390
    //   1383: goto -> 1493
    //   1386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1389: athrow
    //   1390: aload #7
    //   1392: invokevirtual getType : ()Ljava/lang/Class;
    //   1395: astore #8
    //   1397: aload #8
    //   1399: ifnull -> 1480
    //   1402: aload #8
    //   1404: invokevirtual isPrimitive : ()Z
    //   1407: ifne -> 1480
    //   1410: goto -> 1417
    //   1413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1416: athrow
    //   1417: aload #8
    //   1419: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1422: ifnull -> 1480
    //   1425: goto -> 1432
    //   1428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1431: athrow
    //   1432: aload #8
    //   1434: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1437: invokevirtual getName : ()Ljava/lang/String;
    //   1440: ifnull -> 1480
    //   1443: goto -> 1450
    //   1446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1449: athrow
    //   1450: aload #8
    //   1452: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1455: invokevirtual getName : ()Ljava/lang/String;
    //   1458: sipush #-3976
    //   1461: sipush #21742
    //   1464: invokestatic a : (II)Ljava/lang/String;
    //   1467: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1470: ifne -> 1480
    //   1473: goto -> 1480
    //   1476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1479: athrow
    //   1480: aload #7
    //   1482: iconst_1
    //   1483: invokevirtual setAccessible : (Z)V
    //   1486: aload #7
    //   1488: aconst_null
    //   1489: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1492: pop
    //   1493: iinc #6, 1
    //   1496: iload_2
    //   1497: ifne -> 1358
    //   1500: sipush #-3971
    //   1503: sipush #22100
    //   1506: invokestatic a : (II)Ljava/lang/String;
    //   1509: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1512: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1515: astore #4
    //   1517: aload #4
    //   1519: arraylength
    //   1520: istore #5
    //   1522: iconst_0
    //   1523: istore #6
    //   1525: iload #6
    //   1527: iload #5
    //   1529: if_icmpge -> 1665
    //   1532: aload #4
    //   1534: iload #6
    //   1536: aaload
    //   1537: astore #7
    //   1539: aload #7
    //   1541: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1544: pop
    //   1545: aload #7
    //   1547: invokevirtual getModifiers : ()I
    //   1550: invokestatic isStatic : (I)Z
    //   1553: ifeq -> 1651
    //   1556: aload #7
    //   1558: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1561: arraylength
    //   1562: iconst_2
    //   1563: if_icmpne -> 1651
    //   1566: goto -> 1573
    //   1569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1572: athrow
    //   1573: aload #7
    //   1575: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1578: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1581: if_acmpne -> 1651
    //   1584: goto -> 1591
    //   1587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1590: athrow
    //   1591: aload #7
    //   1593: iconst_1
    //   1594: invokevirtual setAccessible : (Z)V
    //   1597: aload #7
    //   1599: aconst_null
    //   1600: iconst_2
    //   1601: anewarray java/lang/Object
    //   1604: dup
    //   1605: iconst_0
    //   1606: aload_0
    //   1607: aastore
    //   1608: dup
    //   1609: iconst_1
    //   1610: aload_1
    //   1611: ifnonnull -> 1629
    //   1614: goto -> 1621
    //   1617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1620: athrow
    //   1621: aload_1
    //   1622: goto -> 1636
    //   1625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1628: athrow
    //   1629: aload_1
    //   1630: checkcast [B
    //   1633: invokevirtual clone : ()Ljava/lang/Object;
    //   1636: aastore
    //   1637: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1640: checkcast java/lang/Boolean
    //   1643: invokevirtual booleanValue : ()Z
    //   1646: istore_3
    //   1647: iload_2
    //   1648: ifne -> 1665
    //   1651: iinc #6, 1
    //   1654: iload_2
    //   1655: ifne -> 1525
    //   1658: goto -> 1665
    //   1661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1664: athrow
    //   1665: iload_3
    //   1666: ifeq -> 1671
    //   1669: iload_3
    //   1670: ireturn
    //   1671: getstatic burp/Zxan.ZJ : Ljava/lang/String;
    //   1674: getstatic burp/Zgei.ZN : Ljava/lang/Object;
    //   1677: checkcast java/math/BigInteger
    //   1680: invokevirtual intValue : ()I
    //   1683: bipush #32
    //   1685: irem
    //   1686: invokestatic abs : (I)I
    //   1689: invokevirtual charAt : (I)C
    //   1692: getstatic burp/Zrkw.ZU : Ljava/lang/String;
    //   1695: getstatic burp/Zse8.Zn : Ljava/lang/Object;
    //   1698: checkcast java/math/BigInteger
    //   1701: invokevirtual intValue : ()I
    //   1704: bipush #32
    //   1706: irem
    //   1707: invokestatic abs : (I)I
    //   1710: invokevirtual charAt : (I)C
    //   1713: if_icmple -> 2058
    //   1716: sipush #-3978
    //   1719: sipush #21284
    //   1722: invokestatic a : (II)Ljava/lang/String;
    //   1725: iconst_1
    //   1726: ldc burp/Zgre
    //   1728: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1731: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1734: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1737: astore #4
    //   1739: aload #4
    //   1741: arraylength
    //   1742: istore #5
    //   1744: iconst_0
    //   1745: istore #6
    //   1747: iload #6
    //   1749: iload #5
    //   1751: if_icmpge -> 1889
    //   1754: aload #4
    //   1756: iload #6
    //   1758: aaload
    //   1759: astore #7
    //   1761: aload #7
    //   1763: invokevirtual getModifiers : ()I
    //   1766: invokestatic isStatic : (I)Z
    //   1769: ifne -> 1779
    //   1772: goto -> 1882
    //   1775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1778: athrow
    //   1779: aload #7
    //   1781: invokevirtual getType : ()Ljava/lang/Class;
    //   1784: astore #8
    //   1786: aload #8
    //   1788: ifnull -> 1869
    //   1791: aload #8
    //   1793: invokevirtual isPrimitive : ()Z
    //   1796: ifne -> 1869
    //   1799: goto -> 1806
    //   1802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1805: athrow
    //   1806: aload #8
    //   1808: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1811: ifnull -> 1869
    //   1814: goto -> 1821
    //   1817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1820: athrow
    //   1821: aload #8
    //   1823: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1826: invokevirtual getName : ()Ljava/lang/String;
    //   1829: ifnull -> 1869
    //   1832: goto -> 1839
    //   1835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1838: athrow
    //   1839: aload #8
    //   1841: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1844: invokevirtual getName : ()Ljava/lang/String;
    //   1847: sipush #-3976
    //   1850: sipush #21742
    //   1853: invokestatic a : (II)Ljava/lang/String;
    //   1856: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1859: ifne -> 1869
    //   1862: goto -> 1869
    //   1865: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1868: athrow
    //   1869: aload #7
    //   1871: iconst_1
    //   1872: invokevirtual setAccessible : (Z)V
    //   1875: aload #7
    //   1877: aconst_null
    //   1878: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1881: pop
    //   1882: iinc #6, 1
    //   1885: iload_2
    //   1886: ifne -> 1747
    //   1889: sipush #-3992
    //   1892: sipush #9303
    //   1895: invokestatic a : (II)Ljava/lang/String;
    //   1898: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1901: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1904: astore #4
    //   1906: aload #4
    //   1908: arraylength
    //   1909: istore #5
    //   1911: iconst_0
    //   1912: istore #6
    //   1914: iload #6
    //   1916: iload #5
    //   1918: if_icmpge -> 2054
    //   1921: aload #4
    //   1923: iload #6
    //   1925: aaload
    //   1926: astore #7
    //   1928: aload #7
    //   1930: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1933: pop
    //   1934: aload #7
    //   1936: invokevirtual getModifiers : ()I
    //   1939: invokestatic isStatic : (I)Z
    //   1942: ifeq -> 2040
    //   1945: aload #7
    //   1947: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1950: arraylength
    //   1951: iconst_2
    //   1952: if_icmpne -> 2040
    //   1955: goto -> 1962
    //   1958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1961: athrow
    //   1962: aload #7
    //   1964: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1967: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1970: if_acmpne -> 2040
    //   1973: goto -> 1980
    //   1976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1979: athrow
    //   1980: aload #7
    //   1982: iconst_1
    //   1983: invokevirtual setAccessible : (Z)V
    //   1986: aload #7
    //   1988: aconst_null
    //   1989: iconst_2
    //   1990: anewarray java/lang/Object
    //   1993: dup
    //   1994: iconst_0
    //   1995: aload_0
    //   1996: aastore
    //   1997: dup
    //   1998: iconst_1
    //   1999: aload_1
    //   2000: ifnonnull -> 2018
    //   2003: goto -> 2010
    //   2006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2009: athrow
    //   2010: aload_1
    //   2011: goto -> 2025
    //   2014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2017: athrow
    //   2018: aload_1
    //   2019: checkcast [B
    //   2022: invokevirtual clone : ()Ljava/lang/Object;
    //   2025: aastore
    //   2026: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2029: checkcast java/lang/Boolean
    //   2032: invokevirtual booleanValue : ()Z
    //   2035: istore_3
    //   2036: iload_2
    //   2037: ifne -> 2054
    //   2040: iinc #6, 1
    //   2043: iload_2
    //   2044: ifne -> 1914
    //   2047: goto -> 2054
    //   2050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2053: athrow
    //   2054: iload_2
    //   2055: ifne -> 2396
    //   2058: sipush #-3984
    //   2061: sipush #20723
    //   2064: invokestatic a : (II)Ljava/lang/String;
    //   2067: iconst_1
    //   2068: ldc burp/Zeig
    //   2070: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2073: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2076: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2079: astore #4
    //   2081: aload #4
    //   2083: arraylength
    //   2084: istore #5
    //   2086: iconst_0
    //   2087: istore #6
    //   2089: iload #6
    //   2091: iload #5
    //   2093: if_icmpge -> 2231
    //   2096: aload #4
    //   2098: iload #6
    //   2100: aaload
    //   2101: astore #7
    //   2103: aload #7
    //   2105: invokevirtual getModifiers : ()I
    //   2108: invokestatic isStatic : (I)Z
    //   2111: ifne -> 2121
    //   2114: goto -> 2224
    //   2117: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2120: athrow
    //   2121: aload #7
    //   2123: invokevirtual getType : ()Ljava/lang/Class;
    //   2126: astore #8
    //   2128: aload #8
    //   2130: ifnull -> 2211
    //   2133: aload #8
    //   2135: invokevirtual isPrimitive : ()Z
    //   2138: ifne -> 2211
    //   2141: goto -> 2148
    //   2144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2147: athrow
    //   2148: aload #8
    //   2150: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2153: ifnull -> 2211
    //   2156: goto -> 2163
    //   2159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2162: athrow
    //   2163: aload #8
    //   2165: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2168: invokevirtual getName : ()Ljava/lang/String;
    //   2171: ifnull -> 2211
    //   2174: goto -> 2181
    //   2177: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2180: athrow
    //   2181: aload #8
    //   2183: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2186: invokevirtual getName : ()Ljava/lang/String;
    //   2189: sipush #-3976
    //   2192: sipush #21742
    //   2195: invokestatic a : (II)Ljava/lang/String;
    //   2198: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2201: ifne -> 2211
    //   2204: goto -> 2211
    //   2207: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2210: athrow
    //   2211: aload #7
    //   2213: iconst_1
    //   2214: invokevirtual setAccessible : (Z)V
    //   2217: aload #7
    //   2219: aconst_null
    //   2220: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2223: pop
    //   2224: iinc #6, 1
    //   2227: iload_2
    //   2228: ifne -> 2089
    //   2231: sipush #-3983
    //   2234: sipush #-32026
    //   2237: invokestatic a : (II)Ljava/lang/String;
    //   2240: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2243: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2246: astore #4
    //   2248: aload #4
    //   2250: arraylength
    //   2251: istore #5
    //   2253: iconst_0
    //   2254: istore #6
    //   2256: iload #6
    //   2258: iload #5
    //   2260: if_icmpge -> 2396
    //   2263: aload #4
    //   2265: iload #6
    //   2267: aaload
    //   2268: astore #7
    //   2270: aload #7
    //   2272: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2275: pop
    //   2276: aload #7
    //   2278: invokevirtual getModifiers : ()I
    //   2281: invokestatic isStatic : (I)Z
    //   2284: ifeq -> 2382
    //   2287: aload #7
    //   2289: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2292: arraylength
    //   2293: iconst_2
    //   2294: if_icmpne -> 2382
    //   2297: goto -> 2304
    //   2300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2303: athrow
    //   2304: aload #7
    //   2306: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2309: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2312: if_acmpne -> 2382
    //   2315: goto -> 2322
    //   2318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2321: athrow
    //   2322: aload #7
    //   2324: iconst_1
    //   2325: invokevirtual setAccessible : (Z)V
    //   2328: aload #7
    //   2330: aconst_null
    //   2331: iconst_2
    //   2332: anewarray java/lang/Object
    //   2335: dup
    //   2336: iconst_0
    //   2337: aload_0
    //   2338: aastore
    //   2339: dup
    //   2340: iconst_1
    //   2341: aload_1
    //   2342: ifnonnull -> 2360
    //   2345: goto -> 2352
    //   2348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2351: athrow
    //   2352: aload_1
    //   2353: goto -> 2367
    //   2356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2359: athrow
    //   2360: aload_1
    //   2361: checkcast [B
    //   2364: invokevirtual clone : ()Ljava/lang/Object;
    //   2367: aastore
    //   2368: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2371: checkcast java/lang/Boolean
    //   2374: invokevirtual booleanValue : ()Z
    //   2377: istore_3
    //   2378: iload_2
    //   2379: ifne -> 2396
    //   2382: iinc #6, 1
    //   2385: iload_2
    //   2386: ifne -> 2256
    //   2389: goto -> 2396
    //   2392: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2395: athrow
    //   2396: iload_3
    //   2397: ifeq -> 2402
    //   2400: iload_3
    //   2401: ireturn
    //   2402: getstatic burp/Ztwp.ZK : Ljava/lang/String;
    //   2405: getstatic burp/Zmh3.ZF : Ljava/lang/Object;
    //   2408: checkcast java/math/BigInteger
    //   2411: invokevirtual intValue : ()I
    //   2414: bipush #32
    //   2416: irem
    //   2417: invokestatic abs : (I)I
    //   2420: invokevirtual charAt : (I)C
    //   2423: getstatic burp/Zk8f.ZV : Ljava/lang/String;
    //   2426: getstatic burp/Zmyk.Za : Ljava/lang/Object;
    //   2429: checkcast java/math/BigInteger
    //   2432: invokevirtual intValue : ()I
    //   2435: bipush #32
    //   2437: irem
    //   2438: invokestatic abs : (I)I
    //   2441: invokevirtual charAt : (I)C
    //   2444: if_icmpgt -> 2789
    //   2447: sipush #-3987
    //   2450: sipush #9680
    //   2453: invokestatic a : (II)Ljava/lang/String;
    //   2456: iconst_1
    //   2457: ldc burp/Zbj
    //   2459: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2462: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2465: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2468: astore #4
    //   2470: aload #4
    //   2472: arraylength
    //   2473: istore #5
    //   2475: iconst_0
    //   2476: istore #6
    //   2478: iload #6
    //   2480: iload #5
    //   2482: if_icmpge -> 2620
    //   2485: aload #4
    //   2487: iload #6
    //   2489: aaload
    //   2490: astore #7
    //   2492: aload #7
    //   2494: invokevirtual getModifiers : ()I
    //   2497: invokestatic isStatic : (I)Z
    //   2500: ifne -> 2510
    //   2503: goto -> 2613
    //   2506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2509: athrow
    //   2510: aload #7
    //   2512: invokevirtual getType : ()Ljava/lang/Class;
    //   2515: astore #8
    //   2517: aload #8
    //   2519: ifnull -> 2600
    //   2522: aload #8
    //   2524: invokevirtual isPrimitive : ()Z
    //   2527: ifne -> 2600
    //   2530: goto -> 2537
    //   2533: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2536: athrow
    //   2537: aload #8
    //   2539: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2542: ifnull -> 2600
    //   2545: goto -> 2552
    //   2548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2551: athrow
    //   2552: aload #8
    //   2554: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2557: invokevirtual getName : ()Ljava/lang/String;
    //   2560: ifnull -> 2600
    //   2563: goto -> 2570
    //   2566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2569: athrow
    //   2570: aload #8
    //   2572: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2575: invokevirtual getName : ()Ljava/lang/String;
    //   2578: sipush #-3976
    //   2581: sipush #21742
    //   2584: invokestatic a : (II)Ljava/lang/String;
    //   2587: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2590: ifne -> 2600
    //   2593: goto -> 2600
    //   2596: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2599: athrow
    //   2600: aload #7
    //   2602: iconst_1
    //   2603: invokevirtual setAccessible : (Z)V
    //   2606: aload #7
    //   2608: aconst_null
    //   2609: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2612: pop
    //   2613: iinc #6, 1
    //   2616: iload_2
    //   2617: ifne -> 2478
    //   2620: sipush #-3999
    //   2623: sipush #-25097
    //   2626: invokestatic a : (II)Ljava/lang/String;
    //   2629: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2632: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2635: astore #4
    //   2637: aload #4
    //   2639: arraylength
    //   2640: istore #5
    //   2642: iconst_0
    //   2643: istore #6
    //   2645: iload #6
    //   2647: iload #5
    //   2649: if_icmpge -> 2785
    //   2652: aload #4
    //   2654: iload #6
    //   2656: aaload
    //   2657: astore #7
    //   2659: aload #7
    //   2661: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2664: pop
    //   2665: aload #7
    //   2667: invokevirtual getModifiers : ()I
    //   2670: invokestatic isStatic : (I)Z
    //   2673: ifeq -> 2771
    //   2676: aload #7
    //   2678: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2681: arraylength
    //   2682: iconst_2
    //   2683: if_icmpne -> 2771
    //   2686: goto -> 2693
    //   2689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2692: athrow
    //   2693: aload #7
    //   2695: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2698: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2701: if_acmpne -> 2771
    //   2704: goto -> 2711
    //   2707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2710: athrow
    //   2711: aload #7
    //   2713: iconst_1
    //   2714: invokevirtual setAccessible : (Z)V
    //   2717: aload #7
    //   2719: aconst_null
    //   2720: iconst_2
    //   2721: anewarray java/lang/Object
    //   2724: dup
    //   2725: iconst_0
    //   2726: aload_0
    //   2727: aastore
    //   2728: dup
    //   2729: iconst_1
    //   2730: aload_1
    //   2731: ifnonnull -> 2749
    //   2734: goto -> 2741
    //   2737: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2740: athrow
    //   2741: aload_1
    //   2742: goto -> 2756
    //   2745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2748: athrow
    //   2749: aload_1
    //   2750: checkcast [B
    //   2753: invokevirtual clone : ()Ljava/lang/Object;
    //   2756: aastore
    //   2757: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2760: checkcast java/lang/Boolean
    //   2763: invokevirtual booleanValue : ()Z
    //   2766: istore_3
    //   2767: iload_2
    //   2768: ifne -> 2785
    //   2771: iinc #6, 1
    //   2774: iload_2
    //   2775: ifne -> 2645
    //   2778: goto -> 2785
    //   2781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2784: athrow
    //   2785: iload_2
    //   2786: ifne -> 3127
    //   2789: sipush #-3986
    //   2792: sipush #-14039
    //   2795: invokestatic a : (II)Ljava/lang/String;
    //   2798: iconst_1
    //   2799: ldc burp/Zty4
    //   2801: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2804: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2807: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2810: astore #4
    //   2812: aload #4
    //   2814: arraylength
    //   2815: istore #5
    //   2817: iconst_0
    //   2818: istore #6
    //   2820: iload #6
    //   2822: iload #5
    //   2824: if_icmpge -> 2962
    //   2827: aload #4
    //   2829: iload #6
    //   2831: aaload
    //   2832: astore #7
    //   2834: aload #7
    //   2836: invokevirtual getModifiers : ()I
    //   2839: invokestatic isStatic : (I)Z
    //   2842: ifne -> 2852
    //   2845: goto -> 2955
    //   2848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2851: athrow
    //   2852: aload #7
    //   2854: invokevirtual getType : ()Ljava/lang/Class;
    //   2857: astore #8
    //   2859: aload #8
    //   2861: ifnull -> 2942
    //   2864: aload #8
    //   2866: invokevirtual isPrimitive : ()Z
    //   2869: ifne -> 2942
    //   2872: goto -> 2879
    //   2875: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2878: athrow
    //   2879: aload #8
    //   2881: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2884: ifnull -> 2942
    //   2887: goto -> 2894
    //   2890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2893: athrow
    //   2894: aload #8
    //   2896: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2899: invokevirtual getName : ()Ljava/lang/String;
    //   2902: ifnull -> 2942
    //   2905: goto -> 2912
    //   2908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2911: athrow
    //   2912: aload #8
    //   2914: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2917: invokevirtual getName : ()Ljava/lang/String;
    //   2920: sipush #-3976
    //   2923: sipush #21742
    //   2926: invokestatic a : (II)Ljava/lang/String;
    //   2929: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2932: ifne -> 2942
    //   2935: goto -> 2942
    //   2938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2941: athrow
    //   2942: aload #7
    //   2944: iconst_1
    //   2945: invokevirtual setAccessible : (Z)V
    //   2948: aload #7
    //   2950: aconst_null
    //   2951: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2954: pop
    //   2955: iinc #6, 1
    //   2958: iload_2
    //   2959: ifne -> 2820
    //   2962: sipush #-3979
    //   2965: sipush #27465
    //   2968: invokestatic a : (II)Ljava/lang/String;
    //   2971: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2974: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2977: astore #4
    //   2979: aload #4
    //   2981: arraylength
    //   2982: istore #5
    //   2984: iconst_0
    //   2985: istore #6
    //   2987: iload #6
    //   2989: iload #5
    //   2991: if_icmpge -> 3127
    //   2994: aload #4
    //   2996: iload #6
    //   2998: aaload
    //   2999: astore #7
    //   3001: aload #7
    //   3003: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3006: pop
    //   3007: aload #7
    //   3009: invokevirtual getModifiers : ()I
    //   3012: invokestatic isStatic : (I)Z
    //   3015: ifeq -> 3113
    //   3018: aload #7
    //   3020: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3023: arraylength
    //   3024: iconst_2
    //   3025: if_icmpne -> 3113
    //   3028: goto -> 3035
    //   3031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3034: athrow
    //   3035: aload #7
    //   3037: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3040: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3043: if_acmpne -> 3113
    //   3046: goto -> 3053
    //   3049: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3052: athrow
    //   3053: aload #7
    //   3055: iconst_1
    //   3056: invokevirtual setAccessible : (Z)V
    //   3059: aload #7
    //   3061: aconst_null
    //   3062: iconst_2
    //   3063: anewarray java/lang/Object
    //   3066: dup
    //   3067: iconst_0
    //   3068: aload_0
    //   3069: aastore
    //   3070: dup
    //   3071: iconst_1
    //   3072: aload_1
    //   3073: ifnonnull -> 3091
    //   3076: goto -> 3083
    //   3079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3082: athrow
    //   3083: aload_1
    //   3084: goto -> 3098
    //   3087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3090: athrow
    //   3091: aload_1
    //   3092: checkcast [B
    //   3095: invokevirtual clone : ()Ljava/lang/Object;
    //   3098: aastore
    //   3099: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3102: checkcast java/lang/Boolean
    //   3105: invokevirtual booleanValue : ()Z
    //   3108: istore_3
    //   3109: iload_2
    //   3110: ifne -> 3127
    //   3113: iinc #6, 1
    //   3116: iload_2
    //   3117: ifne -> 2987
    //   3120: goto -> 3127
    //   3123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3126: athrow
    //   3127: iload_3
    //   3128: ifeq -> 3133
    //   3131: iload_3
    //   3132: ireturn
    //   3133: getstatic burp/Zrnt.Zy : Ljava/lang/String;
    //   3136: getstatic burp/Zml9.ZH : Ljava/lang/Object;
    //   3139: checkcast java/math/BigInteger
    //   3142: invokevirtual intValue : ()I
    //   3145: bipush #32
    //   3147: irem
    //   3148: invokestatic abs : (I)I
    //   3151: invokevirtual charAt : (I)C
    //   3154: getstatic burp/Zlt1.ZA : Ljava/lang/String;
    //   3157: getstatic burp/Zrfs.ZV : Ljava/lang/Object;
    //   3160: checkcast java/math/BigInteger
    //   3163: invokevirtual intValue : ()I
    //   3166: bipush #32
    //   3168: irem
    //   3169: invokestatic abs : (I)I
    //   3172: invokevirtual charAt : (I)C
    //   3175: if_icmpgt -> 3520
    //   3178: sipush #-3980
    //   3181: sipush #10342
    //   3184: invokestatic a : (II)Ljava/lang/String;
    //   3187: iconst_1
    //   3188: ldc burp/Zrh1
    //   3190: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3193: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3196: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3199: astore #4
    //   3201: aload #4
    //   3203: arraylength
    //   3204: istore #5
    //   3206: iconst_0
    //   3207: istore #6
    //   3209: iload #6
    //   3211: iload #5
    //   3213: if_icmpge -> 3351
    //   3216: aload #4
    //   3218: iload #6
    //   3220: aaload
    //   3221: astore #7
    //   3223: aload #7
    //   3225: invokevirtual getModifiers : ()I
    //   3228: invokestatic isStatic : (I)Z
    //   3231: ifne -> 3241
    //   3234: goto -> 3344
    //   3237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3240: athrow
    //   3241: aload #7
    //   3243: invokevirtual getType : ()Ljava/lang/Class;
    //   3246: astore #8
    //   3248: aload #8
    //   3250: ifnull -> 3331
    //   3253: aload #8
    //   3255: invokevirtual isPrimitive : ()Z
    //   3258: ifne -> 3331
    //   3261: goto -> 3268
    //   3264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3267: athrow
    //   3268: aload #8
    //   3270: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3273: ifnull -> 3331
    //   3276: goto -> 3283
    //   3279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3282: athrow
    //   3283: aload #8
    //   3285: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3288: invokevirtual getName : ()Ljava/lang/String;
    //   3291: ifnull -> 3331
    //   3294: goto -> 3301
    //   3297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3300: athrow
    //   3301: aload #8
    //   3303: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3306: invokevirtual getName : ()Ljava/lang/String;
    //   3309: sipush #-3976
    //   3312: sipush #21742
    //   3315: invokestatic a : (II)Ljava/lang/String;
    //   3318: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3321: ifne -> 3331
    //   3324: goto -> 3331
    //   3327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3330: athrow
    //   3331: aload #7
    //   3333: iconst_1
    //   3334: invokevirtual setAccessible : (Z)V
    //   3337: aload #7
    //   3339: aconst_null
    //   3340: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3343: pop
    //   3344: iinc #6, 1
    //   3347: iload_2
    //   3348: ifne -> 3209
    //   3351: sipush #-3970
    //   3354: sipush #-6176
    //   3357: invokestatic a : (II)Ljava/lang/String;
    //   3360: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3363: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3366: astore #4
    //   3368: aload #4
    //   3370: arraylength
    //   3371: istore #5
    //   3373: iconst_0
    //   3374: istore #6
    //   3376: iload #6
    //   3378: iload #5
    //   3380: if_icmpge -> 3516
    //   3383: aload #4
    //   3385: iload #6
    //   3387: aaload
    //   3388: astore #7
    //   3390: aload #7
    //   3392: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3395: pop
    //   3396: aload #7
    //   3398: invokevirtual getModifiers : ()I
    //   3401: invokestatic isStatic : (I)Z
    //   3404: ifeq -> 3502
    //   3407: aload #7
    //   3409: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3412: arraylength
    //   3413: iconst_2
    //   3414: if_icmpne -> 3502
    //   3417: goto -> 3424
    //   3420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3423: athrow
    //   3424: aload #7
    //   3426: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3429: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3432: if_acmpne -> 3502
    //   3435: goto -> 3442
    //   3438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3441: athrow
    //   3442: aload #7
    //   3444: iconst_1
    //   3445: invokevirtual setAccessible : (Z)V
    //   3448: aload #7
    //   3450: aconst_null
    //   3451: iconst_2
    //   3452: anewarray java/lang/Object
    //   3455: dup
    //   3456: iconst_0
    //   3457: aload_0
    //   3458: aastore
    //   3459: dup
    //   3460: iconst_1
    //   3461: aload_1
    //   3462: ifnonnull -> 3480
    //   3465: goto -> 3472
    //   3468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3471: athrow
    //   3472: aload_1
    //   3473: goto -> 3487
    //   3476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3479: athrow
    //   3480: aload_1
    //   3481: checkcast [B
    //   3484: invokevirtual clone : ()Ljava/lang/Object;
    //   3487: aastore
    //   3488: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3491: checkcast java/lang/Boolean
    //   3494: invokevirtual booleanValue : ()Z
    //   3497: istore_3
    //   3498: iload_2
    //   3499: ifne -> 3516
    //   3502: iinc #6, 1
    //   3505: iload_2
    //   3506: ifne -> 3376
    //   3509: goto -> 3516
    //   3512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3515: athrow
    //   3516: iload_2
    //   3517: ifne -> 3858
    //   3520: sipush #-3988
    //   3523: sipush #-1708
    //   3526: invokestatic a : (II)Ljava/lang/String;
    //   3529: iconst_1
    //   3530: ldc burp/Zkcd
    //   3532: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3535: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3538: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3541: astore #4
    //   3543: aload #4
    //   3545: arraylength
    //   3546: istore #5
    //   3548: iconst_0
    //   3549: istore #6
    //   3551: iload #6
    //   3553: iload #5
    //   3555: if_icmpge -> 3693
    //   3558: aload #4
    //   3560: iload #6
    //   3562: aaload
    //   3563: astore #7
    //   3565: aload #7
    //   3567: invokevirtual getModifiers : ()I
    //   3570: invokestatic isStatic : (I)Z
    //   3573: ifne -> 3583
    //   3576: goto -> 3686
    //   3579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3582: athrow
    //   3583: aload #7
    //   3585: invokevirtual getType : ()Ljava/lang/Class;
    //   3588: astore #8
    //   3590: aload #8
    //   3592: ifnull -> 3673
    //   3595: aload #8
    //   3597: invokevirtual isPrimitive : ()Z
    //   3600: ifne -> 3673
    //   3603: goto -> 3610
    //   3606: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3609: athrow
    //   3610: aload #8
    //   3612: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3615: ifnull -> 3673
    //   3618: goto -> 3625
    //   3621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3624: athrow
    //   3625: aload #8
    //   3627: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3630: invokevirtual getName : ()Ljava/lang/String;
    //   3633: ifnull -> 3673
    //   3636: goto -> 3643
    //   3639: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3642: athrow
    //   3643: aload #8
    //   3645: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3648: invokevirtual getName : ()Ljava/lang/String;
    //   3651: sipush #-3976
    //   3654: sipush #21742
    //   3657: invokestatic a : (II)Ljava/lang/String;
    //   3660: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3663: ifne -> 3673
    //   3666: goto -> 3673
    //   3669: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3672: athrow
    //   3673: aload #7
    //   3675: iconst_1
    //   3676: invokevirtual setAccessible : (Z)V
    //   3679: aload #7
    //   3681: aconst_null
    //   3682: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3685: pop
    //   3686: iinc #6, 1
    //   3689: iload_2
    //   3690: ifne -> 3551
    //   3693: sipush #-3997
    //   3696: sipush #-21243
    //   3699: invokestatic a : (II)Ljava/lang/String;
    //   3702: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3705: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3708: astore #4
    //   3710: aload #4
    //   3712: arraylength
    //   3713: istore #5
    //   3715: iconst_0
    //   3716: istore #6
    //   3718: iload #6
    //   3720: iload #5
    //   3722: if_icmpge -> 3858
    //   3725: aload #4
    //   3727: iload #6
    //   3729: aaload
    //   3730: astore #7
    //   3732: aload #7
    //   3734: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3737: pop
    //   3738: aload #7
    //   3740: invokevirtual getModifiers : ()I
    //   3743: invokestatic isStatic : (I)Z
    //   3746: ifeq -> 3844
    //   3749: aload #7
    //   3751: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3754: arraylength
    //   3755: iconst_2
    //   3756: if_icmpne -> 3844
    //   3759: goto -> 3766
    //   3762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3765: athrow
    //   3766: aload #7
    //   3768: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3771: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3774: if_acmpne -> 3844
    //   3777: goto -> 3784
    //   3780: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3783: athrow
    //   3784: aload #7
    //   3786: iconst_1
    //   3787: invokevirtual setAccessible : (Z)V
    //   3790: aload #7
    //   3792: aconst_null
    //   3793: iconst_2
    //   3794: anewarray java/lang/Object
    //   3797: dup
    //   3798: iconst_0
    //   3799: aload_0
    //   3800: aastore
    //   3801: dup
    //   3802: iconst_1
    //   3803: aload_1
    //   3804: ifnonnull -> 3822
    //   3807: goto -> 3814
    //   3810: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3813: athrow
    //   3814: aload_1
    //   3815: goto -> 3829
    //   3818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3821: athrow
    //   3822: aload_1
    //   3823: checkcast [B
    //   3826: invokevirtual clone : ()Ljava/lang/Object;
    //   3829: aastore
    //   3830: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3833: checkcast java/lang/Boolean
    //   3836: invokevirtual booleanValue : ()Z
    //   3839: istore_3
    //   3840: iload_2
    //   3841: ifne -> 3858
    //   3844: iinc #6, 1
    //   3847: iload_2
    //   3848: ifne -> 3718
    //   3851: goto -> 3858
    //   3854: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3857: athrow
    //   3858: iload_3
    //   3859: ireturn
    //   3860: astore_3
    //   3861: new java/lang/Exception
    //   3864: dup
    //   3865: aload_3
    //   3866: invokevirtual getMessage : ()Ljava/lang/String;
    //   3869: invokespecial <init> : (Ljava/lang/String;)V
    //   3872: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1670	3860	java/lang/Throwable
    //   310	324	324	java/lang/Throwable
    //   335	348	351	java/lang/Throwable
    //   340	363	366	java/lang/Throwable
    //   355	381	384	java/lang/Throwable
    //   370	411	414	java/lang/Throwable
    //   474	501	504	java/lang/Throwable
    //   491	522	525	java/lang/Throwable
    //   508	552	555	java/lang/Throwable
    //   529	563	563	java/lang/Throwable
    //   574	590	593	java/lang/Throwable
    //   597	934	937	java/lang/Throwable
    //   768	778	778	java/lang/Throwable
    //   782	794	794	java/lang/Throwable
    //   798	810	810	java/lang/Throwable
    //   814	827	827	java/lang/Throwable
    //   831	844	844	java/lang/Throwable
    //   1030	1044	1044	java/lang/Throwable
    //   1055	1068	1071	java/lang/Throwable
    //   1060	1083	1086	java/lang/Throwable
    //   1075	1101	1104	java/lang/Throwable
    //   1090	1131	1134	java/lang/Throwable
    //   1197	1224	1227	java/lang/Throwable
    //   1214	1242	1245	java/lang/Throwable
    //   1231	1272	1275	java/lang/Throwable
    //   1249	1283	1283	java/lang/Throwable
    //   1305	1316	1319	java/lang/Throwable
    //   1372	1386	1386	java/lang/Throwable
    //   1397	1410	1413	java/lang/Throwable
    //   1402	1425	1428	java/lang/Throwable
    //   1417	1443	1446	java/lang/Throwable
    //   1432	1473	1476	java/lang/Throwable
    //   1539	1566	1569	java/lang/Throwable
    //   1556	1584	1587	java/lang/Throwable
    //   1573	1614	1617	java/lang/Throwable
    //   1591	1625	1625	java/lang/Throwable
    //   1647	1658	1661	java/lang/Throwable
    //   1671	2401	3860	java/lang/Throwable
    //   1761	1775	1775	java/lang/Throwable
    //   1786	1799	1802	java/lang/Throwable
    //   1791	1814	1817	java/lang/Throwable
    //   1806	1832	1835	java/lang/Throwable
    //   1821	1862	1865	java/lang/Throwable
    //   1928	1955	1958	java/lang/Throwable
    //   1945	1973	1976	java/lang/Throwable
    //   1962	2003	2006	java/lang/Throwable
    //   1980	2014	2014	java/lang/Throwable
    //   2036	2047	2050	java/lang/Throwable
    //   2103	2117	2117	java/lang/Throwable
    //   2128	2141	2144	java/lang/Throwable
    //   2133	2156	2159	java/lang/Throwable
    //   2148	2174	2177	java/lang/Throwable
    //   2163	2204	2207	java/lang/Throwable
    //   2270	2297	2300	java/lang/Throwable
    //   2287	2315	2318	java/lang/Throwable
    //   2304	2345	2348	java/lang/Throwable
    //   2322	2356	2356	java/lang/Throwable
    //   2378	2389	2392	java/lang/Throwable
    //   2402	3132	3860	java/lang/Throwable
    //   2492	2506	2506	java/lang/Throwable
    //   2517	2530	2533	java/lang/Throwable
    //   2522	2545	2548	java/lang/Throwable
    //   2537	2563	2566	java/lang/Throwable
    //   2552	2593	2596	java/lang/Throwable
    //   2659	2686	2689	java/lang/Throwable
    //   2676	2704	2707	java/lang/Throwable
    //   2693	2734	2737	java/lang/Throwable
    //   2711	2745	2745	java/lang/Throwable
    //   2767	2778	2781	java/lang/Throwable
    //   2834	2848	2848	java/lang/Throwable
    //   2859	2872	2875	java/lang/Throwable
    //   2864	2887	2890	java/lang/Throwable
    //   2879	2905	2908	java/lang/Throwable
    //   2894	2935	2938	java/lang/Throwable
    //   3001	3028	3031	java/lang/Throwable
    //   3018	3046	3049	java/lang/Throwable
    //   3035	3076	3079	java/lang/Throwable
    //   3053	3087	3087	java/lang/Throwable
    //   3109	3120	3123	java/lang/Throwable
    //   3133	3859	3860	java/lang/Throwable
    //   3223	3237	3237	java/lang/Throwable
    //   3248	3261	3264	java/lang/Throwable
    //   3253	3276	3279	java/lang/Throwable
    //   3268	3294	3297	java/lang/Throwable
    //   3283	3324	3327	java/lang/Throwable
    //   3390	3417	3420	java/lang/Throwable
    //   3407	3435	3438	java/lang/Throwable
    //   3424	3465	3468	java/lang/Throwable
    //   3442	3476	3476	java/lang/Throwable
    //   3498	3509	3512	java/lang/Throwable
    //   3565	3579	3579	java/lang/Throwable
    //   3590	3603	3606	java/lang/Throwable
    //   3595	3618	3621	java/lang/Throwable
    //   3610	3636	3639	java/lang/Throwable
    //   3625	3666	3669	java/lang/Throwable
    //   3732	3759	3762	java/lang/Throwable
    //   3749	3777	3780	java/lang/Throwable
    //   3766	3807	3810	java/lang/Throwable
    //   3784	3818	3818	java/lang/Throwable
    //   3840	3851	3854	java/lang/Throwable
  }
  
  static void Zu(Object paramObject) {
    Zm8j.Zp = a(-3981, 29651);
    Zm8j.Zj = new BigInteger(a(-3973, 29838));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Ze4w.Zc.charAt(Math.abs(((BigInteger)Zmhq.ZK).intValue() % 32)) > Zmc_.Zb.charAt(Math.abs(((BigInteger)Zku9.Zp).intValue() % 32))) {
          try {
            Zg1k.ZQ(Class.forName(a(-3989, -22860)));
            if (!bool)
              Zs1d.ZC(Class.forName(a(-3982, -12613))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zs1d.ZC(Class.forName(a(-3982, -12613)));
    } catch (Throwable throwable) {}
  }
  
  static void ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '­×v\\b~î èxº@×Âá@2ÌµcÖ÷tKtÀv.Î5 £Øm¶KåòzÞäGf°»uéÃJ§ÏmãÍÊæÝF\\t­¯ú¡íu8\\bjDxå\\fúÎ÷c¼¿C+ÞU$uÏ]ÆD\\tF¯¥JOÚÓ\\b°BáÌ¾ ¶ä×âý*g.WÝÆgó³÷||1!s½(|`LNoN èe~è¬_¡nXÙ)ÛÚß$<µÄ*ÅÓlÕ\\f.\\tJ®zZÝ\\tAõgê¼dY±\\tV«!àýç/\\bj<×ú\\nÓ\\tÄë×)ªü³\\n¤\\tìÒ\\n\\t¥´-\\t©³z" 9\\tí?é·ä\\tQ}~ÿ\\rYù\\tµ^â3b\\tÉ^v*5ÐtÀç£6¨SXë¼\\t$ÜËÏ) Þ«\\tÔ!Õpê×¡3 \\t6áÇpÏ\\t,ÜÊÏ\\t Ò8Ë6'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
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
    //   68: ldc '½ËÜîá3\\t¦uæÃmÔ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #114
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
    //   129: putstatic burp/Zedu.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zedu.b : [Ljava/lang/String;
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
    //   212: bipush #111
    //   214: goto -> 244
    //   217: bipush #32
    //   219: goto -> 244
    //   222: bipush #55
    //   224: goto -> 244
    //   227: bipush #50
    //   229: goto -> 244
    //   232: bipush #109
    //   234: goto -> 244
    //   237: bipush #114
    //   239: goto -> 244
    //   242: bipush #17
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
    //   300: sipush #-3972
    //   303: sipush #1529
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zedu.ZD : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #62
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #77
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #46
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: iconst_2
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-53
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #14
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #12
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-45
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #40
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #122
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #125
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-13
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #84
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-11
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-107
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-64
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: iconst_m1
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-63
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #30
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #-71
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #-69
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #-76
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #30
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #14
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #59
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #76
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: iconst_5
    //   473: bastore
    //   474: dup
    //   475: bipush #27
    //   477: bipush #36
    //   479: bastore
    //   480: dup
    //   481: bipush #28
    //   483: bipush #-20
    //   485: bastore
    //   486: dup
    //   487: bipush #29
    //   489: bipush #-38
    //   491: bastore
    //   492: dup
    //   493: bipush #30
    //   495: bipush #81
    //   497: bastore
    //   498: dup
    //   499: bipush #31
    //   501: bipush #-29
    //   503: bastore
    //   504: invokespecial <init> : (I[B)V
    //   507: putstatic burp/Zedu.ZL : Ljava/lang/Object;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF07B) & 0xFFFF;
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
      byte b1 = 34;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */