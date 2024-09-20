package burp;

import java.math.BigInteger;

class Zlc5 extends ClassLoader {
  static String Z_;
  
  static Object ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZP(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: ldc2_w 8682522807148012
    //   7: invokestatic currentTimeMillis : ()J
    //   10: lxor
    //   11: lstore #4
    //   13: lload #4
    //   15: ldc2_w 25214903917
    //   18: lmul
    //   19: ldc2_w 11
    //   22: ladd
    //   23: ldc2_w 281474976710655
    //   26: land
    //   27: lstore #4
    //   29: lload #4
    //   31: bipush #32
    //   33: lshl
    //   34: lstore #6
    //   36: lload #4
    //   38: ldc2_w 25214903917
    //   41: lmul
    //   42: ldc2_w 11
    //   45: ladd
    //   46: ldc2_w 281474976710655
    //   49: land
    //   50: lstore #4
    //   52: lload #6
    //   54: lload #4
    //   56: ladd
    //   57: lstore #6
    //   59: bipush #16
    //   61: newarray byte
    //   63: dup
    //   64: iconst_0
    //   65: bipush #48
    //   67: bastore
    //   68: dup
    //   69: iconst_1
    //   70: bipush #49
    //   72: bastore
    //   73: dup
    //   74: iconst_2
    //   75: bipush #50
    //   77: bastore
    //   78: dup
    //   79: iconst_3
    //   80: bipush #51
    //   82: bastore
    //   83: dup
    //   84: iconst_4
    //   85: bipush #52
    //   87: bastore
    //   88: dup
    //   89: iconst_5
    //   90: bipush #53
    //   92: bastore
    //   93: dup
    //   94: bipush #6
    //   96: bipush #54
    //   98: bastore
    //   99: dup
    //   100: bipush #7
    //   102: bipush #55
    //   104: bastore
    //   105: dup
    //   106: bipush #8
    //   108: bipush #56
    //   110: bastore
    //   111: dup
    //   112: bipush #9
    //   114: bipush #57
    //   116: bastore
    //   117: dup
    //   118: bipush #10
    //   120: bipush #97
    //   122: bastore
    //   123: dup
    //   124: bipush #11
    //   126: bipush #98
    //   128: bastore
    //   129: dup
    //   130: bipush #12
    //   132: bipush #99
    //   134: bastore
    //   135: dup
    //   136: bipush #13
    //   138: bipush #100
    //   140: bastore
    //   141: dup
    //   142: bipush #14
    //   144: bipush #101
    //   146: bastore
    //   147: dup
    //   148: bipush #15
    //   150: bipush #102
    //   152: bastore
    //   153: astore #8
    //   155: bipush #64
    //   157: newarray byte
    //   159: astore #9
    //   161: bipush #64
    //   163: istore #10
    //   165: bipush #16
    //   167: istore #11
    //   169: iload #11
    //   171: iconst_1
    //   172: isub
    //   173: i2l
    //   174: lstore #12
    //   176: aload #9
    //   178: iinc #10, -1
    //   181: iload #10
    //   183: aload #8
    //   185: lload #6
    //   187: lload #12
    //   189: land
    //   190: l2i
    //   191: baload
    //   192: bastore
    //   193: lload #6
    //   195: iconst_4
    //   196: lushr
    //   197: lstore #6
    //   199: lload #6
    //   201: lconst_0
    //   202: lcmp
    //   203: ifne -> 176
    //   206: bipush #64
    //   208: iload #10
    //   210: isub
    //   211: newarray byte
    //   213: astore_3
    //   214: iconst_0
    //   215: istore #14
    //   217: iload #14
    //   219: aload_3
    //   220: arraylength
    //   221: if_icmpge -> 243
    //   224: aload_3
    //   225: iload #14
    //   227: aload #9
    //   229: iload #10
    //   231: iload #14
    //   233: iadd
    //   234: baload
    //   235: bastore
    //   236: iinc #14, 1
    //   239: iload_2
    //   240: ifne -> 217
    //   243: aload_3
    //   244: arraylength
    //   245: bipush #10
    //   247: if_icmplt -> 13
    //   250: sipush #-4837
    //   253: sipush #-3821
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: iconst_1
    //   260: ldc burp/Zrvb
    //   262: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   265: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   268: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   271: astore_3
    //   272: aload_3
    //   273: arraylength
    //   274: istore #4
    //   276: iconst_0
    //   277: istore #5
    //   279: iload #5
    //   281: iload #4
    //   283: if_icmpge -> 420
    //   286: aload_3
    //   287: iload #5
    //   289: aaload
    //   290: astore #6
    //   292: aload #6
    //   294: invokevirtual getModifiers : ()I
    //   297: invokestatic isStatic : (I)Z
    //   300: ifne -> 310
    //   303: goto -> 413
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: aload #6
    //   312: invokevirtual getType : ()Ljava/lang/Class;
    //   315: astore #7
    //   317: aload #7
    //   319: ifnull -> 400
    //   322: aload #7
    //   324: invokevirtual isPrimitive : ()Z
    //   327: ifne -> 400
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   336: athrow
    //   337: aload #7
    //   339: invokevirtual getPackage : ()Ljava/lang/Package;
    //   342: ifnull -> 400
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   351: athrow
    //   352: aload #7
    //   354: invokevirtual getPackage : ()Ljava/lang/Package;
    //   357: invokevirtual getName : ()Ljava/lang/String;
    //   360: ifnull -> 400
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   369: athrow
    //   370: aload #7
    //   372: invokevirtual getPackage : ()Ljava/lang/Package;
    //   375: invokevirtual getName : ()Ljava/lang/String;
    //   378: sipush #-4844
    //   381: sipush #-2390
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   390: ifne -> 400
    //   393: goto -> 400
    //   396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   399: athrow
    //   400: aload #6
    //   402: iconst_1
    //   403: invokevirtual setAccessible : (Z)V
    //   406: aload #6
    //   408: aconst_null
    //   409: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   412: pop
    //   413: iinc #5, 1
    //   416: iload_2
    //   417: ifne -> 279
    //   420: sipush #-4851
    //   423: sipush #22381
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   432: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   435: astore_3
    //   436: aload_3
    //   437: arraylength
    //   438: istore #4
    //   440: iconst_0
    //   441: istore #5
    //   443: iload #5
    //   445: iload #4
    //   447: if_icmpge -> 579
    //   450: aload_3
    //   451: iload #5
    //   453: aaload
    //   454: astore #6
    //   456: aload #6
    //   458: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   461: pop
    //   462: aload #6
    //   464: invokevirtual getModifiers : ()I
    //   467: invokestatic isStatic : (I)Z
    //   470: ifeq -> 565
    //   473: aload #6
    //   475: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   478: arraylength
    //   479: iconst_2
    //   480: if_icmpne -> 565
    //   483: goto -> 490
    //   486: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   489: athrow
    //   490: aload #6
    //   492: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   495: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   498: invokevirtual equals : (Ljava/lang/Object;)Z
    //   501: ifeq -> 565
    //   504: goto -> 511
    //   507: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   510: athrow
    //   511: aload #6
    //   513: iconst_1
    //   514: invokevirtual setAccessible : (Z)V
    //   517: aload #6
    //   519: aconst_null
    //   520: iconst_2
    //   521: anewarray java/lang/Object
    //   524: dup
    //   525: iconst_0
    //   526: aload_0
    //   527: aastore
    //   528: dup
    //   529: iconst_1
    //   530: aload_1
    //   531: ifnonnull -> 549
    //   534: goto -> 541
    //   537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   540: athrow
    //   541: aload_1
    //   542: goto -> 556
    //   545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   548: athrow
    //   549: aload_1
    //   550: checkcast [B
    //   553: invokevirtual clone : ()Ljava/lang/Object;
    //   556: aastore
    //   557: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   560: pop
    //   561: iload_2
    //   562: ifne -> 579
    //   565: iinc #5, 1
    //   568: iload_2
    //   569: ifne -> 443
    //   572: goto -> 579
    //   575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   578: athrow
    //   579: getstatic burp/Zm06.ZU : Ljava/lang/Object;
    //   582: checkcast java/math/BigInteger
    //   585: invokevirtual intValue : ()I
    //   588: i2l
    //   589: invokestatic currentTimeMillis : ()J
    //   592: ladd
    //   593: getstatic burp/Zty5.Zf : Ljava/lang/Object;
    //   596: checkcast java/math/BigInteger
    //   599: invokevirtual intValue : ()I
    //   602: i2l
    //   603: lcmp
    //   604: ifge -> 936
    //   607: sipush #-4855
    //   610: sipush #-7019
    //   613: invokestatic a : (II)Ljava/lang/String;
    //   616: iconst_1
    //   617: ldc burp/Zlhm
    //   619: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   622: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   625: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   628: astore_3
    //   629: aload_3
    //   630: arraylength
    //   631: istore #4
    //   633: iconst_0
    //   634: istore #5
    //   636: iload #5
    //   638: iload #4
    //   640: if_icmpge -> 777
    //   643: aload_3
    //   644: iload #5
    //   646: aaload
    //   647: astore #6
    //   649: aload #6
    //   651: invokevirtual getModifiers : ()I
    //   654: invokestatic isStatic : (I)Z
    //   657: ifne -> 667
    //   660: goto -> 770
    //   663: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   666: athrow
    //   667: aload #6
    //   669: invokevirtual getType : ()Ljava/lang/Class;
    //   672: astore #7
    //   674: aload #7
    //   676: ifnull -> 757
    //   679: aload #7
    //   681: invokevirtual isPrimitive : ()Z
    //   684: ifne -> 757
    //   687: goto -> 694
    //   690: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   693: athrow
    //   694: aload #7
    //   696: invokevirtual getPackage : ()Ljava/lang/Package;
    //   699: ifnull -> 757
    //   702: goto -> 709
    //   705: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   708: athrow
    //   709: aload #7
    //   711: invokevirtual getPackage : ()Ljava/lang/Package;
    //   714: invokevirtual getName : ()Ljava/lang/String;
    //   717: ifnull -> 757
    //   720: goto -> 727
    //   723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   726: athrow
    //   727: aload #7
    //   729: invokevirtual getPackage : ()Ljava/lang/Package;
    //   732: invokevirtual getName : ()Ljava/lang/String;
    //   735: sipush #-4862
    //   738: sipush #-2532
    //   741: invokestatic a : (II)Ljava/lang/String;
    //   744: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   747: ifne -> 757
    //   750: goto -> 757
    //   753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   756: athrow
    //   757: aload #6
    //   759: iconst_1
    //   760: invokevirtual setAccessible : (Z)V
    //   763: aload #6
    //   765: aconst_null
    //   766: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   769: pop
    //   770: iinc #5, 1
    //   773: iload_2
    //   774: ifne -> 636
    //   777: sipush #-4849
    //   780: sipush #31323
    //   783: invokestatic a : (II)Ljava/lang/String;
    //   786: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   789: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   792: astore_3
    //   793: aload_3
    //   794: arraylength
    //   795: istore #4
    //   797: iconst_0
    //   798: istore #5
    //   800: iload #5
    //   802: iload #4
    //   804: if_icmpge -> 936
    //   807: aload_3
    //   808: iload #5
    //   810: aaload
    //   811: astore #6
    //   813: aload #6
    //   815: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   818: pop
    //   819: aload #6
    //   821: invokevirtual getModifiers : ()I
    //   824: invokestatic isStatic : (I)Z
    //   827: ifeq -> 922
    //   830: aload #6
    //   832: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   835: arraylength
    //   836: iconst_2
    //   837: if_icmpne -> 922
    //   840: goto -> 847
    //   843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   846: athrow
    //   847: aload #6
    //   849: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   852: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   855: invokevirtual equals : (Ljava/lang/Object;)Z
    //   858: ifeq -> 922
    //   861: goto -> 868
    //   864: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   867: athrow
    //   868: aload #6
    //   870: iconst_1
    //   871: invokevirtual setAccessible : (Z)V
    //   874: aload #6
    //   876: aconst_null
    //   877: iconst_2
    //   878: anewarray java/lang/Object
    //   881: dup
    //   882: iconst_0
    //   883: aload_0
    //   884: aastore
    //   885: dup
    //   886: iconst_1
    //   887: aload_1
    //   888: ifnonnull -> 906
    //   891: goto -> 898
    //   894: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   897: athrow
    //   898: aload_1
    //   899: goto -> 913
    //   902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   905: athrow
    //   906: aload_1
    //   907: checkcast [B
    //   910: invokevirtual clone : ()Ljava/lang/Object;
    //   913: aastore
    //   914: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   917: pop
    //   918: iload_2
    //   919: ifne -> 936
    //   922: iinc #5, 1
    //   925: iload_2
    //   926: ifne -> 800
    //   929: goto -> 936
    //   932: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   935: athrow
    //   936: iconst_0
    //   937: istore_3
    //   938: getstatic burp/Zr8g.ZH : Ljava/lang/String;
    //   941: getstatic burp/Zs33.ZT : Ljava/lang/Object;
    //   944: checkcast java/math/BigInteger
    //   947: invokevirtual intValue : ()I
    //   950: bipush #32
    //   952: irem
    //   953: invokestatic abs : (I)I
    //   956: invokevirtual charAt : (I)C
    //   959: getstatic burp/Zb3p.ZX : Ljava/lang/String;
    //   962: getstatic burp/Zmt6.ZK : Ljava/lang/Object;
    //   965: checkcast java/math/BigInteger
    //   968: invokevirtual intValue : ()I
    //   971: bipush #32
    //   973: irem
    //   974: invokestatic abs : (I)I
    //   977: invokevirtual charAt : (I)C
    //   980: if_icmpgt -> 1324
    //   983: sipush #-4864
    //   986: sipush #8400
    //   989: invokestatic a : (II)Ljava/lang/String;
    //   992: iconst_1
    //   993: ldc burp/Zrp3
    //   995: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   998: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1001: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1004: astore #4
    //   1006: aload #4
    //   1008: arraylength
    //   1009: istore #5
    //   1011: iconst_0
    //   1012: istore #6
    //   1014: iload #6
    //   1016: iload #5
    //   1018: if_icmpge -> 1156
    //   1021: aload #4
    //   1023: iload #6
    //   1025: aaload
    //   1026: astore #7
    //   1028: aload #7
    //   1030: invokevirtual getModifiers : ()I
    //   1033: invokestatic isStatic : (I)Z
    //   1036: ifne -> 1046
    //   1039: goto -> 1149
    //   1042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1045: athrow
    //   1046: aload #7
    //   1048: invokevirtual getType : ()Ljava/lang/Class;
    //   1051: astore #8
    //   1053: aload #8
    //   1055: ifnull -> 1136
    //   1058: aload #8
    //   1060: invokevirtual isPrimitive : ()Z
    //   1063: ifne -> 1136
    //   1066: goto -> 1073
    //   1069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1072: athrow
    //   1073: aload #8
    //   1075: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1078: ifnull -> 1136
    //   1081: goto -> 1088
    //   1084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1087: athrow
    //   1088: aload #8
    //   1090: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1093: invokevirtual getName : ()Ljava/lang/String;
    //   1096: ifnull -> 1136
    //   1099: goto -> 1106
    //   1102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1105: athrow
    //   1106: aload #8
    //   1108: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1111: invokevirtual getName : ()Ljava/lang/String;
    //   1114: sipush #-4862
    //   1117: sipush #-2532
    //   1120: invokestatic a : (II)Ljava/lang/String;
    //   1123: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1126: ifne -> 1136
    //   1129: goto -> 1136
    //   1132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1135: athrow
    //   1136: aload #7
    //   1138: iconst_1
    //   1139: invokevirtual setAccessible : (Z)V
    //   1142: aload #7
    //   1144: aconst_null
    //   1145: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1148: pop
    //   1149: iinc #6, 1
    //   1152: iload_2
    //   1153: ifne -> 1014
    //   1156: sipush #-4860
    //   1159: sipush #-12401
    //   1162: invokestatic a : (II)Ljava/lang/String;
    //   1165: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1168: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1171: astore #4
    //   1173: aload #4
    //   1175: arraylength
    //   1176: istore #5
    //   1178: iconst_0
    //   1179: istore #6
    //   1181: iload #6
    //   1183: iload #5
    //   1185: if_icmpge -> 1321
    //   1188: aload #4
    //   1190: iload #6
    //   1192: aaload
    //   1193: astore #7
    //   1195: aload #7
    //   1197: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1200: pop
    //   1201: aload #7
    //   1203: invokevirtual getModifiers : ()I
    //   1206: invokestatic isStatic : (I)Z
    //   1209: ifeq -> 1307
    //   1212: aload #7
    //   1214: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1217: arraylength
    //   1218: iconst_2
    //   1219: if_icmpne -> 1307
    //   1222: goto -> 1229
    //   1225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1228: athrow
    //   1229: aload #7
    //   1231: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1234: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1237: if_acmpne -> 1307
    //   1240: goto -> 1247
    //   1243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1246: athrow
    //   1247: aload #7
    //   1249: iconst_1
    //   1250: invokevirtual setAccessible : (Z)V
    //   1253: aload #7
    //   1255: aconst_null
    //   1256: iconst_2
    //   1257: anewarray java/lang/Object
    //   1260: dup
    //   1261: iconst_0
    //   1262: aload_0
    //   1263: aastore
    //   1264: dup
    //   1265: iconst_1
    //   1266: aload_1
    //   1267: ifnonnull -> 1285
    //   1270: goto -> 1277
    //   1273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1276: athrow
    //   1277: aload_1
    //   1278: goto -> 1292
    //   1281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1284: athrow
    //   1285: aload_1
    //   1286: checkcast [B
    //   1289: invokevirtual clone : ()Ljava/lang/Object;
    //   1292: aastore
    //   1293: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1296: checkcast java/lang/Boolean
    //   1299: invokevirtual booleanValue : ()Z
    //   1302: istore_3
    //   1303: iload_2
    //   1304: ifne -> 1321
    //   1307: iinc #6, 1
    //   1310: iload_2
    //   1311: ifne -> 1181
    //   1314: goto -> 1321
    //   1317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1320: athrow
    //   1321: goto -> 1661
    //   1324: sipush #-4858
    //   1327: sipush #-15800
    //   1330: invokestatic a : (II)Ljava/lang/String;
    //   1333: iconst_1
    //   1334: ldc burp/Zgzv
    //   1336: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1339: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1342: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1345: astore #4
    //   1347: aload #4
    //   1349: arraylength
    //   1350: istore #5
    //   1352: iconst_0
    //   1353: istore #6
    //   1355: iload #6
    //   1357: iload #5
    //   1359: if_icmpge -> 1497
    //   1362: aload #4
    //   1364: iload #6
    //   1366: aaload
    //   1367: astore #7
    //   1369: aload #7
    //   1371: invokevirtual getModifiers : ()I
    //   1374: invokestatic isStatic : (I)Z
    //   1377: ifne -> 1387
    //   1380: goto -> 1490
    //   1383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1386: athrow
    //   1387: aload #7
    //   1389: invokevirtual getType : ()Ljava/lang/Class;
    //   1392: astore #8
    //   1394: aload #8
    //   1396: ifnull -> 1477
    //   1399: aload #8
    //   1401: invokevirtual isPrimitive : ()Z
    //   1404: ifne -> 1477
    //   1407: goto -> 1414
    //   1410: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1413: athrow
    //   1414: aload #8
    //   1416: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1419: ifnull -> 1477
    //   1422: goto -> 1429
    //   1425: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1428: athrow
    //   1429: aload #8
    //   1431: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1434: invokevirtual getName : ()Ljava/lang/String;
    //   1437: ifnull -> 1477
    //   1440: goto -> 1447
    //   1443: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1446: athrow
    //   1447: aload #8
    //   1449: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1452: invokevirtual getName : ()Ljava/lang/String;
    //   1455: sipush #-4862
    //   1458: sipush #-2532
    //   1461: invokestatic a : (II)Ljava/lang/String;
    //   1464: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1467: ifne -> 1477
    //   1470: goto -> 1477
    //   1473: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1476: athrow
    //   1477: aload #7
    //   1479: iconst_1
    //   1480: invokevirtual setAccessible : (Z)V
    //   1483: aload #7
    //   1485: aconst_null
    //   1486: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1489: pop
    //   1490: iinc #6, 1
    //   1493: iload_2
    //   1494: ifne -> 1355
    //   1497: sipush #-4852
    //   1500: bipush #67
    //   1502: invokestatic a : (II)Ljava/lang/String;
    //   1505: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1508: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1511: astore #4
    //   1513: aload #4
    //   1515: arraylength
    //   1516: istore #5
    //   1518: iconst_0
    //   1519: istore #6
    //   1521: iload #6
    //   1523: iload #5
    //   1525: if_icmpge -> 1661
    //   1528: aload #4
    //   1530: iload #6
    //   1532: aaload
    //   1533: astore #7
    //   1535: aload #7
    //   1537: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1540: pop
    //   1541: aload #7
    //   1543: invokevirtual getModifiers : ()I
    //   1546: invokestatic isStatic : (I)Z
    //   1549: ifeq -> 1647
    //   1552: aload #7
    //   1554: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1557: arraylength
    //   1558: iconst_2
    //   1559: if_icmpne -> 1647
    //   1562: goto -> 1569
    //   1565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1568: athrow
    //   1569: aload #7
    //   1571: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1574: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1577: if_acmpne -> 1647
    //   1580: goto -> 1587
    //   1583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1586: athrow
    //   1587: aload #7
    //   1589: iconst_1
    //   1590: invokevirtual setAccessible : (Z)V
    //   1593: aload #7
    //   1595: aconst_null
    //   1596: iconst_2
    //   1597: anewarray java/lang/Object
    //   1600: dup
    //   1601: iconst_0
    //   1602: aload_0
    //   1603: aastore
    //   1604: dup
    //   1605: iconst_1
    //   1606: aload_1
    //   1607: ifnonnull -> 1625
    //   1610: goto -> 1617
    //   1613: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1616: athrow
    //   1617: aload_1
    //   1618: goto -> 1632
    //   1621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1624: athrow
    //   1625: aload_1
    //   1626: checkcast [B
    //   1629: invokevirtual clone : ()Ljava/lang/Object;
    //   1632: aastore
    //   1633: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1636: checkcast java/lang/Boolean
    //   1639: invokevirtual booleanValue : ()Z
    //   1642: istore_3
    //   1643: iload_2
    //   1644: ifne -> 1661
    //   1647: iinc #6, 1
    //   1650: iload_2
    //   1651: ifne -> 1521
    //   1654: goto -> 1661
    //   1657: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1660: athrow
    //   1661: iload_3
    //   1662: ifeq -> 1667
    //   1665: iload_3
    //   1666: ireturn
    //   1667: getstatic burp/Zko9.Zf : Ljava/lang/String;
    //   1670: getstatic burp/Zl1u.Zq : Ljava/lang/Object;
    //   1673: checkcast java/math/BigInteger
    //   1676: invokevirtual intValue : ()I
    //   1679: bipush #32
    //   1681: irem
    //   1682: invokestatic abs : (I)I
    //   1685: invokevirtual charAt : (I)C
    //   1688: getstatic burp/Zgwq.ZV : Ljava/lang/String;
    //   1691: getstatic burp/Zs36.Zs : Ljava/lang/Object;
    //   1694: checkcast java/math/BigInteger
    //   1697: invokevirtual intValue : ()I
    //   1700: bipush #32
    //   1702: irem
    //   1703: invokestatic abs : (I)I
    //   1706: invokevirtual charAt : (I)C
    //   1709: if_icmple -> 2054
    //   1712: sipush #-4850
    //   1715: sipush #19292
    //   1718: invokestatic a : (II)Ljava/lang/String;
    //   1721: iconst_1
    //   1722: ldc burp/Zzwl
    //   1724: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1727: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1730: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1733: astore #4
    //   1735: aload #4
    //   1737: arraylength
    //   1738: istore #5
    //   1740: iconst_0
    //   1741: istore #6
    //   1743: iload #6
    //   1745: iload #5
    //   1747: if_icmpge -> 1885
    //   1750: aload #4
    //   1752: iload #6
    //   1754: aaload
    //   1755: astore #7
    //   1757: aload #7
    //   1759: invokevirtual getModifiers : ()I
    //   1762: invokestatic isStatic : (I)Z
    //   1765: ifne -> 1775
    //   1768: goto -> 1878
    //   1771: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1774: athrow
    //   1775: aload #7
    //   1777: invokevirtual getType : ()Ljava/lang/Class;
    //   1780: astore #8
    //   1782: aload #8
    //   1784: ifnull -> 1865
    //   1787: aload #8
    //   1789: invokevirtual isPrimitive : ()Z
    //   1792: ifne -> 1865
    //   1795: goto -> 1802
    //   1798: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1801: athrow
    //   1802: aload #8
    //   1804: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1807: ifnull -> 1865
    //   1810: goto -> 1817
    //   1813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1816: athrow
    //   1817: aload #8
    //   1819: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1822: invokevirtual getName : ()Ljava/lang/String;
    //   1825: ifnull -> 1865
    //   1828: goto -> 1835
    //   1831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1834: athrow
    //   1835: aload #8
    //   1837: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1840: invokevirtual getName : ()Ljava/lang/String;
    //   1843: sipush #-4862
    //   1846: sipush #-2532
    //   1849: invokestatic a : (II)Ljava/lang/String;
    //   1852: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1855: ifne -> 1865
    //   1858: goto -> 1865
    //   1861: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1864: athrow
    //   1865: aload #7
    //   1867: iconst_1
    //   1868: invokevirtual setAccessible : (Z)V
    //   1871: aload #7
    //   1873: aconst_null
    //   1874: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1877: pop
    //   1878: iinc #6, 1
    //   1881: iload_2
    //   1882: ifne -> 1743
    //   1885: sipush #-4843
    //   1888: sipush #11838
    //   1891: invokestatic a : (II)Ljava/lang/String;
    //   1894: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1897: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1900: astore #4
    //   1902: aload #4
    //   1904: arraylength
    //   1905: istore #5
    //   1907: iconst_0
    //   1908: istore #6
    //   1910: iload #6
    //   1912: iload #5
    //   1914: if_icmpge -> 2050
    //   1917: aload #4
    //   1919: iload #6
    //   1921: aaload
    //   1922: astore #7
    //   1924: aload #7
    //   1926: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1929: pop
    //   1930: aload #7
    //   1932: invokevirtual getModifiers : ()I
    //   1935: invokestatic isStatic : (I)Z
    //   1938: ifeq -> 2036
    //   1941: aload #7
    //   1943: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1946: arraylength
    //   1947: iconst_2
    //   1948: if_icmpne -> 2036
    //   1951: goto -> 1958
    //   1954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1957: athrow
    //   1958: aload #7
    //   1960: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1963: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1966: if_acmpne -> 2036
    //   1969: goto -> 1976
    //   1972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1975: athrow
    //   1976: aload #7
    //   1978: iconst_1
    //   1979: invokevirtual setAccessible : (Z)V
    //   1982: aload #7
    //   1984: aconst_null
    //   1985: iconst_2
    //   1986: anewarray java/lang/Object
    //   1989: dup
    //   1990: iconst_0
    //   1991: aload_0
    //   1992: aastore
    //   1993: dup
    //   1994: iconst_1
    //   1995: aload_1
    //   1996: ifnonnull -> 2014
    //   1999: goto -> 2006
    //   2002: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2005: athrow
    //   2006: aload_1
    //   2007: goto -> 2021
    //   2010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2013: athrow
    //   2014: aload_1
    //   2015: checkcast [B
    //   2018: invokevirtual clone : ()Ljava/lang/Object;
    //   2021: aastore
    //   2022: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2025: checkcast java/lang/Boolean
    //   2028: invokevirtual booleanValue : ()Z
    //   2031: istore_3
    //   2032: iload_2
    //   2033: ifne -> 2050
    //   2036: iinc #6, 1
    //   2039: iload_2
    //   2040: ifne -> 1910
    //   2043: goto -> 2050
    //   2046: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2049: athrow
    //   2050: iload_2
    //   2051: ifne -> 2392
    //   2054: sipush #-4856
    //   2057: sipush #15953
    //   2060: invokestatic a : (II)Ljava/lang/String;
    //   2063: iconst_1
    //   2064: ldc burp/Zmt_
    //   2066: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2069: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2072: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2075: astore #4
    //   2077: aload #4
    //   2079: arraylength
    //   2080: istore #5
    //   2082: iconst_0
    //   2083: istore #6
    //   2085: iload #6
    //   2087: iload #5
    //   2089: if_icmpge -> 2227
    //   2092: aload #4
    //   2094: iload #6
    //   2096: aaload
    //   2097: astore #7
    //   2099: aload #7
    //   2101: invokevirtual getModifiers : ()I
    //   2104: invokestatic isStatic : (I)Z
    //   2107: ifne -> 2117
    //   2110: goto -> 2220
    //   2113: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2116: athrow
    //   2117: aload #7
    //   2119: invokevirtual getType : ()Ljava/lang/Class;
    //   2122: astore #8
    //   2124: aload #8
    //   2126: ifnull -> 2207
    //   2129: aload #8
    //   2131: invokevirtual isPrimitive : ()Z
    //   2134: ifne -> 2207
    //   2137: goto -> 2144
    //   2140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2143: athrow
    //   2144: aload #8
    //   2146: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2149: ifnull -> 2207
    //   2152: goto -> 2159
    //   2155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2158: athrow
    //   2159: aload #8
    //   2161: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2164: invokevirtual getName : ()Ljava/lang/String;
    //   2167: ifnull -> 2207
    //   2170: goto -> 2177
    //   2173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2176: athrow
    //   2177: aload #8
    //   2179: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2182: invokevirtual getName : ()Ljava/lang/String;
    //   2185: sipush #-4862
    //   2188: sipush #-2532
    //   2191: invokestatic a : (II)Ljava/lang/String;
    //   2194: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2197: ifne -> 2207
    //   2200: goto -> 2207
    //   2203: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2206: athrow
    //   2207: aload #7
    //   2209: iconst_1
    //   2210: invokevirtual setAccessible : (Z)V
    //   2213: aload #7
    //   2215: aconst_null
    //   2216: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2219: pop
    //   2220: iinc #6, 1
    //   2223: iload_2
    //   2224: ifne -> 2085
    //   2227: sipush #-4853
    //   2230: sipush #-14818
    //   2233: invokestatic a : (II)Ljava/lang/String;
    //   2236: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2239: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2242: astore #4
    //   2244: aload #4
    //   2246: arraylength
    //   2247: istore #5
    //   2249: iconst_0
    //   2250: istore #6
    //   2252: iload #6
    //   2254: iload #5
    //   2256: if_icmpge -> 2392
    //   2259: aload #4
    //   2261: iload #6
    //   2263: aaload
    //   2264: astore #7
    //   2266: aload #7
    //   2268: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2271: pop
    //   2272: aload #7
    //   2274: invokevirtual getModifiers : ()I
    //   2277: invokestatic isStatic : (I)Z
    //   2280: ifeq -> 2378
    //   2283: aload #7
    //   2285: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2288: arraylength
    //   2289: iconst_2
    //   2290: if_icmpne -> 2378
    //   2293: goto -> 2300
    //   2296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2299: athrow
    //   2300: aload #7
    //   2302: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2305: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2308: if_acmpne -> 2378
    //   2311: goto -> 2318
    //   2314: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2317: athrow
    //   2318: aload #7
    //   2320: iconst_1
    //   2321: invokevirtual setAccessible : (Z)V
    //   2324: aload #7
    //   2326: aconst_null
    //   2327: iconst_2
    //   2328: anewarray java/lang/Object
    //   2331: dup
    //   2332: iconst_0
    //   2333: aload_0
    //   2334: aastore
    //   2335: dup
    //   2336: iconst_1
    //   2337: aload_1
    //   2338: ifnonnull -> 2356
    //   2341: goto -> 2348
    //   2344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2347: athrow
    //   2348: aload_1
    //   2349: goto -> 2363
    //   2352: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2355: athrow
    //   2356: aload_1
    //   2357: checkcast [B
    //   2360: invokevirtual clone : ()Ljava/lang/Object;
    //   2363: aastore
    //   2364: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2367: checkcast java/lang/Boolean
    //   2370: invokevirtual booleanValue : ()Z
    //   2373: istore_3
    //   2374: iload_2
    //   2375: ifne -> 2392
    //   2378: iinc #6, 1
    //   2381: iload_2
    //   2382: ifne -> 2252
    //   2385: goto -> 2392
    //   2388: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2391: athrow
    //   2392: iload_3
    //   2393: ifeq -> 2398
    //   2396: iload_3
    //   2397: ireturn
    //   2398: getstatic burp/Zkvr.Zm : Ljava/lang/String;
    //   2401: getstatic burp/Zewo.ZZ : Ljava/lang/Object;
    //   2404: checkcast java/math/BigInteger
    //   2407: invokevirtual intValue : ()I
    //   2410: bipush #32
    //   2412: irem
    //   2413: invokestatic abs : (I)I
    //   2416: invokevirtual charAt : (I)C
    //   2419: getstatic burp/Ztd6.Zu : Ljava/lang/String;
    //   2422: getstatic burp/Zsej.ZT : Ljava/lang/Object;
    //   2425: checkcast java/math/BigInteger
    //   2428: invokevirtual intValue : ()I
    //   2431: bipush #32
    //   2433: irem
    //   2434: invokestatic abs : (I)I
    //   2437: invokevirtual charAt : (I)C
    //   2440: if_icmple -> 2785
    //   2443: sipush #-4846
    //   2446: sipush #-8882
    //   2449: invokestatic a : (II)Ljava/lang/String;
    //   2452: iconst_1
    //   2453: ldc burp/Zz0j
    //   2455: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2458: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2461: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2464: astore #4
    //   2466: aload #4
    //   2468: arraylength
    //   2469: istore #5
    //   2471: iconst_0
    //   2472: istore #6
    //   2474: iload #6
    //   2476: iload #5
    //   2478: if_icmpge -> 2616
    //   2481: aload #4
    //   2483: iload #6
    //   2485: aaload
    //   2486: astore #7
    //   2488: aload #7
    //   2490: invokevirtual getModifiers : ()I
    //   2493: invokestatic isStatic : (I)Z
    //   2496: ifne -> 2506
    //   2499: goto -> 2609
    //   2502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2505: athrow
    //   2506: aload #7
    //   2508: invokevirtual getType : ()Ljava/lang/Class;
    //   2511: astore #8
    //   2513: aload #8
    //   2515: ifnull -> 2596
    //   2518: aload #8
    //   2520: invokevirtual isPrimitive : ()Z
    //   2523: ifne -> 2596
    //   2526: goto -> 2533
    //   2529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2532: athrow
    //   2533: aload #8
    //   2535: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2538: ifnull -> 2596
    //   2541: goto -> 2548
    //   2544: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2547: athrow
    //   2548: aload #8
    //   2550: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2553: invokevirtual getName : ()Ljava/lang/String;
    //   2556: ifnull -> 2596
    //   2559: goto -> 2566
    //   2562: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2565: athrow
    //   2566: aload #8
    //   2568: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2571: invokevirtual getName : ()Ljava/lang/String;
    //   2574: sipush #-4862
    //   2577: sipush #-2532
    //   2580: invokestatic a : (II)Ljava/lang/String;
    //   2583: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2586: ifne -> 2596
    //   2589: goto -> 2596
    //   2592: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2595: athrow
    //   2596: aload #7
    //   2598: iconst_1
    //   2599: invokevirtual setAccessible : (Z)V
    //   2602: aload #7
    //   2604: aconst_null
    //   2605: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2608: pop
    //   2609: iinc #6, 1
    //   2612: iload_2
    //   2613: ifne -> 2474
    //   2616: sipush #-4861
    //   2619: sipush #-1239
    //   2622: invokestatic a : (II)Ljava/lang/String;
    //   2625: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2628: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2631: astore #4
    //   2633: aload #4
    //   2635: arraylength
    //   2636: istore #5
    //   2638: iconst_0
    //   2639: istore #6
    //   2641: iload #6
    //   2643: iload #5
    //   2645: if_icmpge -> 2781
    //   2648: aload #4
    //   2650: iload #6
    //   2652: aaload
    //   2653: astore #7
    //   2655: aload #7
    //   2657: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2660: pop
    //   2661: aload #7
    //   2663: invokevirtual getModifiers : ()I
    //   2666: invokestatic isStatic : (I)Z
    //   2669: ifeq -> 2767
    //   2672: aload #7
    //   2674: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2677: arraylength
    //   2678: iconst_2
    //   2679: if_icmpne -> 2767
    //   2682: goto -> 2689
    //   2685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2688: athrow
    //   2689: aload #7
    //   2691: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2694: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2697: if_acmpne -> 2767
    //   2700: goto -> 2707
    //   2703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2706: athrow
    //   2707: aload #7
    //   2709: iconst_1
    //   2710: invokevirtual setAccessible : (Z)V
    //   2713: aload #7
    //   2715: aconst_null
    //   2716: iconst_2
    //   2717: anewarray java/lang/Object
    //   2720: dup
    //   2721: iconst_0
    //   2722: aload_0
    //   2723: aastore
    //   2724: dup
    //   2725: iconst_1
    //   2726: aload_1
    //   2727: ifnonnull -> 2745
    //   2730: goto -> 2737
    //   2733: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2736: athrow
    //   2737: aload_1
    //   2738: goto -> 2752
    //   2741: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2744: athrow
    //   2745: aload_1
    //   2746: checkcast [B
    //   2749: invokevirtual clone : ()Ljava/lang/Object;
    //   2752: aastore
    //   2753: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2756: checkcast java/lang/Boolean
    //   2759: invokevirtual booleanValue : ()Z
    //   2762: istore_3
    //   2763: iload_2
    //   2764: ifne -> 2781
    //   2767: iinc #6, 1
    //   2770: iload_2
    //   2771: ifne -> 2641
    //   2774: goto -> 2781
    //   2777: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2780: athrow
    //   2781: iload_2
    //   2782: ifne -> 3123
    //   2785: sipush #-4859
    //   2788: sipush #14623
    //   2791: invokestatic a : (II)Ljava/lang/String;
    //   2794: iconst_1
    //   2795: ldc burp/Zmcq
    //   2797: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2800: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2803: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2806: astore #4
    //   2808: aload #4
    //   2810: arraylength
    //   2811: istore #5
    //   2813: iconst_0
    //   2814: istore #6
    //   2816: iload #6
    //   2818: iload #5
    //   2820: if_icmpge -> 2958
    //   2823: aload #4
    //   2825: iload #6
    //   2827: aaload
    //   2828: astore #7
    //   2830: aload #7
    //   2832: invokevirtual getModifiers : ()I
    //   2835: invokestatic isStatic : (I)Z
    //   2838: ifne -> 2848
    //   2841: goto -> 2951
    //   2844: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2847: athrow
    //   2848: aload #7
    //   2850: invokevirtual getType : ()Ljava/lang/Class;
    //   2853: astore #8
    //   2855: aload #8
    //   2857: ifnull -> 2938
    //   2860: aload #8
    //   2862: invokevirtual isPrimitive : ()Z
    //   2865: ifne -> 2938
    //   2868: goto -> 2875
    //   2871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2874: athrow
    //   2875: aload #8
    //   2877: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2880: ifnull -> 2938
    //   2883: goto -> 2890
    //   2886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2889: athrow
    //   2890: aload #8
    //   2892: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2895: invokevirtual getName : ()Ljava/lang/String;
    //   2898: ifnull -> 2938
    //   2901: goto -> 2908
    //   2904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2907: athrow
    //   2908: aload #8
    //   2910: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2913: invokevirtual getName : ()Ljava/lang/String;
    //   2916: sipush #-4862
    //   2919: sipush #-2532
    //   2922: invokestatic a : (II)Ljava/lang/String;
    //   2925: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2928: ifne -> 2938
    //   2931: goto -> 2938
    //   2934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2937: athrow
    //   2938: aload #7
    //   2940: iconst_1
    //   2941: invokevirtual setAccessible : (Z)V
    //   2944: aload #7
    //   2946: aconst_null
    //   2947: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2950: pop
    //   2951: iinc #6, 1
    //   2954: iload_2
    //   2955: ifne -> 2816
    //   2958: sipush #-4848
    //   2961: sipush #-16834
    //   2964: invokestatic a : (II)Ljava/lang/String;
    //   2967: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2970: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2973: astore #4
    //   2975: aload #4
    //   2977: arraylength
    //   2978: istore #5
    //   2980: iconst_0
    //   2981: istore #6
    //   2983: iload #6
    //   2985: iload #5
    //   2987: if_icmpge -> 3123
    //   2990: aload #4
    //   2992: iload #6
    //   2994: aaload
    //   2995: astore #7
    //   2997: aload #7
    //   2999: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3002: pop
    //   3003: aload #7
    //   3005: invokevirtual getModifiers : ()I
    //   3008: invokestatic isStatic : (I)Z
    //   3011: ifeq -> 3109
    //   3014: aload #7
    //   3016: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3019: arraylength
    //   3020: iconst_2
    //   3021: if_icmpne -> 3109
    //   3024: goto -> 3031
    //   3027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3030: athrow
    //   3031: aload #7
    //   3033: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3036: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3039: if_acmpne -> 3109
    //   3042: goto -> 3049
    //   3045: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3048: athrow
    //   3049: aload #7
    //   3051: iconst_1
    //   3052: invokevirtual setAccessible : (Z)V
    //   3055: aload #7
    //   3057: aconst_null
    //   3058: iconst_2
    //   3059: anewarray java/lang/Object
    //   3062: dup
    //   3063: iconst_0
    //   3064: aload_0
    //   3065: aastore
    //   3066: dup
    //   3067: iconst_1
    //   3068: aload_1
    //   3069: ifnonnull -> 3087
    //   3072: goto -> 3079
    //   3075: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3078: athrow
    //   3079: aload_1
    //   3080: goto -> 3094
    //   3083: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3086: athrow
    //   3087: aload_1
    //   3088: checkcast [B
    //   3091: invokevirtual clone : ()Ljava/lang/Object;
    //   3094: aastore
    //   3095: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3098: checkcast java/lang/Boolean
    //   3101: invokevirtual booleanValue : ()Z
    //   3104: istore_3
    //   3105: iload_2
    //   3106: ifne -> 3123
    //   3109: iinc #6, 1
    //   3112: iload_2
    //   3113: ifne -> 2983
    //   3116: goto -> 3123
    //   3119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3122: athrow
    //   3123: iload_3
    //   3124: ifeq -> 3129
    //   3127: iload_3
    //   3128: ireturn
    //   3129: getstatic burp/Ztd6.Zu : Ljava/lang/String;
    //   3132: getstatic burp/Ztpa.Zv : Ljava/lang/Object;
    //   3135: checkcast java/math/BigInteger
    //   3138: invokevirtual intValue : ()I
    //   3141: bipush #32
    //   3143: irem
    //   3144: invokestatic abs : (I)I
    //   3147: invokevirtual charAt : (I)C
    //   3150: getstatic burp/Zxoa.Z_ : Ljava/lang/String;
    //   3153: getstatic burp/Zoa.ZI : Ljava/lang/Object;
    //   3156: checkcast java/math/BigInteger
    //   3159: invokevirtual intValue : ()I
    //   3162: bipush #32
    //   3164: irem
    //   3165: invokestatic abs : (I)I
    //   3168: invokevirtual charAt : (I)C
    //   3171: if_icmpgt -> 3516
    //   3174: sipush #-4847
    //   3177: sipush #-29954
    //   3180: invokestatic a : (II)Ljava/lang/String;
    //   3183: iconst_1
    //   3184: ldc burp/Ztsj
    //   3186: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3189: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3192: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3195: astore #4
    //   3197: aload #4
    //   3199: arraylength
    //   3200: istore #5
    //   3202: iconst_0
    //   3203: istore #6
    //   3205: iload #6
    //   3207: iload #5
    //   3209: if_icmpge -> 3347
    //   3212: aload #4
    //   3214: iload #6
    //   3216: aaload
    //   3217: astore #7
    //   3219: aload #7
    //   3221: invokevirtual getModifiers : ()I
    //   3224: invokestatic isStatic : (I)Z
    //   3227: ifne -> 3237
    //   3230: goto -> 3340
    //   3233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3236: athrow
    //   3237: aload #7
    //   3239: invokevirtual getType : ()Ljava/lang/Class;
    //   3242: astore #8
    //   3244: aload #8
    //   3246: ifnull -> 3327
    //   3249: aload #8
    //   3251: invokevirtual isPrimitive : ()Z
    //   3254: ifne -> 3327
    //   3257: goto -> 3264
    //   3260: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3263: athrow
    //   3264: aload #8
    //   3266: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3269: ifnull -> 3327
    //   3272: goto -> 3279
    //   3275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3278: athrow
    //   3279: aload #8
    //   3281: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3284: invokevirtual getName : ()Ljava/lang/String;
    //   3287: ifnull -> 3327
    //   3290: goto -> 3297
    //   3293: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3296: athrow
    //   3297: aload #8
    //   3299: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3302: invokevirtual getName : ()Ljava/lang/String;
    //   3305: sipush #-4862
    //   3308: sipush #-2532
    //   3311: invokestatic a : (II)Ljava/lang/String;
    //   3314: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3317: ifne -> 3327
    //   3320: goto -> 3327
    //   3323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3326: athrow
    //   3327: aload #7
    //   3329: iconst_1
    //   3330: invokevirtual setAccessible : (Z)V
    //   3333: aload #7
    //   3335: aconst_null
    //   3336: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3339: pop
    //   3340: iinc #6, 1
    //   3343: iload_2
    //   3344: ifne -> 3205
    //   3347: sipush #-4842
    //   3350: sipush #4894
    //   3353: invokestatic a : (II)Ljava/lang/String;
    //   3356: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3359: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3362: astore #4
    //   3364: aload #4
    //   3366: arraylength
    //   3367: istore #5
    //   3369: iconst_0
    //   3370: istore #6
    //   3372: iload #6
    //   3374: iload #5
    //   3376: if_icmpge -> 3512
    //   3379: aload #4
    //   3381: iload #6
    //   3383: aaload
    //   3384: astore #7
    //   3386: aload #7
    //   3388: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3391: pop
    //   3392: aload #7
    //   3394: invokevirtual getModifiers : ()I
    //   3397: invokestatic isStatic : (I)Z
    //   3400: ifeq -> 3498
    //   3403: aload #7
    //   3405: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3408: arraylength
    //   3409: iconst_2
    //   3410: if_icmpne -> 3498
    //   3413: goto -> 3420
    //   3416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3419: athrow
    //   3420: aload #7
    //   3422: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3425: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3428: if_acmpne -> 3498
    //   3431: goto -> 3438
    //   3434: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3437: athrow
    //   3438: aload #7
    //   3440: iconst_1
    //   3441: invokevirtual setAccessible : (Z)V
    //   3444: aload #7
    //   3446: aconst_null
    //   3447: iconst_2
    //   3448: anewarray java/lang/Object
    //   3451: dup
    //   3452: iconst_0
    //   3453: aload_0
    //   3454: aastore
    //   3455: dup
    //   3456: iconst_1
    //   3457: aload_1
    //   3458: ifnonnull -> 3476
    //   3461: goto -> 3468
    //   3464: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3467: athrow
    //   3468: aload_1
    //   3469: goto -> 3483
    //   3472: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3475: athrow
    //   3476: aload_1
    //   3477: checkcast [B
    //   3480: invokevirtual clone : ()Ljava/lang/Object;
    //   3483: aastore
    //   3484: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3487: checkcast java/lang/Boolean
    //   3490: invokevirtual booleanValue : ()Z
    //   3493: istore_3
    //   3494: iload_2
    //   3495: ifne -> 3512
    //   3498: iinc #6, 1
    //   3501: iload_2
    //   3502: ifne -> 3372
    //   3505: goto -> 3512
    //   3508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3511: athrow
    //   3512: iload_2
    //   3513: ifne -> 3854
    //   3516: sipush #-4845
    //   3519: sipush #-9503
    //   3522: invokestatic a : (II)Ljava/lang/String;
    //   3525: iconst_1
    //   3526: ldc burp/Zs1d
    //   3528: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3531: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3534: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3537: astore #4
    //   3539: aload #4
    //   3541: arraylength
    //   3542: istore #5
    //   3544: iconst_0
    //   3545: istore #6
    //   3547: iload #6
    //   3549: iload #5
    //   3551: if_icmpge -> 3689
    //   3554: aload #4
    //   3556: iload #6
    //   3558: aaload
    //   3559: astore #7
    //   3561: aload #7
    //   3563: invokevirtual getModifiers : ()I
    //   3566: invokestatic isStatic : (I)Z
    //   3569: ifne -> 3579
    //   3572: goto -> 3682
    //   3575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3578: athrow
    //   3579: aload #7
    //   3581: invokevirtual getType : ()Ljava/lang/Class;
    //   3584: astore #8
    //   3586: aload #8
    //   3588: ifnull -> 3669
    //   3591: aload #8
    //   3593: invokevirtual isPrimitive : ()Z
    //   3596: ifne -> 3669
    //   3599: goto -> 3606
    //   3602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3605: athrow
    //   3606: aload #8
    //   3608: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3611: ifnull -> 3669
    //   3614: goto -> 3621
    //   3617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3620: athrow
    //   3621: aload #8
    //   3623: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3626: invokevirtual getName : ()Ljava/lang/String;
    //   3629: ifnull -> 3669
    //   3632: goto -> 3639
    //   3635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3638: athrow
    //   3639: aload #8
    //   3641: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3644: invokevirtual getName : ()Ljava/lang/String;
    //   3647: sipush #-4862
    //   3650: sipush #-2532
    //   3653: invokestatic a : (II)Ljava/lang/String;
    //   3656: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3659: ifne -> 3669
    //   3662: goto -> 3669
    //   3665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3668: athrow
    //   3669: aload #7
    //   3671: iconst_1
    //   3672: invokevirtual setAccessible : (Z)V
    //   3675: aload #7
    //   3677: aconst_null
    //   3678: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3681: pop
    //   3682: iinc #6, 1
    //   3685: iload_2
    //   3686: ifne -> 3547
    //   3689: sipush #-4840
    //   3692: sipush #9001
    //   3695: invokestatic a : (II)Ljava/lang/String;
    //   3698: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3701: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3704: astore #4
    //   3706: aload #4
    //   3708: arraylength
    //   3709: istore #5
    //   3711: iconst_0
    //   3712: istore #6
    //   3714: iload #6
    //   3716: iload #5
    //   3718: if_icmpge -> 3854
    //   3721: aload #4
    //   3723: iload #6
    //   3725: aaload
    //   3726: astore #7
    //   3728: aload #7
    //   3730: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3733: pop
    //   3734: aload #7
    //   3736: invokevirtual getModifiers : ()I
    //   3739: invokestatic isStatic : (I)Z
    //   3742: ifeq -> 3840
    //   3745: aload #7
    //   3747: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3750: arraylength
    //   3751: iconst_2
    //   3752: if_icmpne -> 3840
    //   3755: goto -> 3762
    //   3758: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3761: athrow
    //   3762: aload #7
    //   3764: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3767: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3770: if_acmpne -> 3840
    //   3773: goto -> 3780
    //   3776: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3779: athrow
    //   3780: aload #7
    //   3782: iconst_1
    //   3783: invokevirtual setAccessible : (Z)V
    //   3786: aload #7
    //   3788: aconst_null
    //   3789: iconst_2
    //   3790: anewarray java/lang/Object
    //   3793: dup
    //   3794: iconst_0
    //   3795: aload_0
    //   3796: aastore
    //   3797: dup
    //   3798: iconst_1
    //   3799: aload_1
    //   3800: ifnonnull -> 3818
    //   3803: goto -> 3810
    //   3806: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3809: athrow
    //   3810: aload_1
    //   3811: goto -> 3825
    //   3814: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3817: athrow
    //   3818: aload_1
    //   3819: checkcast [B
    //   3822: invokevirtual clone : ()Ljava/lang/Object;
    //   3825: aastore
    //   3826: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3829: checkcast java/lang/Boolean
    //   3832: invokevirtual booleanValue : ()Z
    //   3835: istore_3
    //   3836: iload_2
    //   3837: ifne -> 3854
    //   3840: iinc #6, 1
    //   3843: iload_2
    //   3844: ifne -> 3714
    //   3847: goto -> 3854
    //   3850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3853: athrow
    //   3854: iload_3
    //   3855: ireturn
    //   3856: astore_3
    //   3857: new java/lang/Exception
    //   3860: dup
    //   3861: aload_3
    //   3862: invokevirtual getMessage : ()Ljava/lang/String;
    //   3865: invokespecial <init> : (Ljava/lang/String;)V
    //   3868: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1666	3856	java/lang/Throwable
    //   292	306	306	java/lang/Throwable
    //   317	330	333	java/lang/Throwable
    //   322	345	348	java/lang/Throwable
    //   337	363	366	java/lang/Throwable
    //   352	393	396	java/lang/Throwable
    //   456	483	486	java/lang/Throwable
    //   473	504	507	java/lang/Throwable
    //   490	534	537	java/lang/Throwable
    //   511	545	545	java/lang/Throwable
    //   556	572	575	java/lang/Throwable
    //   649	663	663	java/lang/Throwable
    //   674	687	690	java/lang/Throwable
    //   679	702	705	java/lang/Throwable
    //   694	720	723	java/lang/Throwable
    //   709	750	753	java/lang/Throwable
    //   813	840	843	java/lang/Throwable
    //   830	861	864	java/lang/Throwable
    //   847	891	894	java/lang/Throwable
    //   868	902	902	java/lang/Throwable
    //   913	929	932	java/lang/Throwable
    //   1028	1042	1042	java/lang/Throwable
    //   1053	1066	1069	java/lang/Throwable
    //   1058	1081	1084	java/lang/Throwable
    //   1073	1099	1102	java/lang/Throwable
    //   1088	1129	1132	java/lang/Throwable
    //   1195	1222	1225	java/lang/Throwable
    //   1212	1240	1243	java/lang/Throwable
    //   1229	1270	1273	java/lang/Throwable
    //   1247	1281	1281	java/lang/Throwable
    //   1303	1314	1317	java/lang/Throwable
    //   1369	1383	1383	java/lang/Throwable
    //   1394	1407	1410	java/lang/Throwable
    //   1399	1422	1425	java/lang/Throwable
    //   1414	1440	1443	java/lang/Throwable
    //   1429	1470	1473	java/lang/Throwable
    //   1535	1562	1565	java/lang/Throwable
    //   1552	1580	1583	java/lang/Throwable
    //   1569	1610	1613	java/lang/Throwable
    //   1587	1621	1621	java/lang/Throwable
    //   1643	1654	1657	java/lang/Throwable
    //   1667	2397	3856	java/lang/Throwable
    //   1757	1771	1771	java/lang/Throwable
    //   1782	1795	1798	java/lang/Throwable
    //   1787	1810	1813	java/lang/Throwable
    //   1802	1828	1831	java/lang/Throwable
    //   1817	1858	1861	java/lang/Throwable
    //   1924	1951	1954	java/lang/Throwable
    //   1941	1969	1972	java/lang/Throwable
    //   1958	1999	2002	java/lang/Throwable
    //   1976	2010	2010	java/lang/Throwable
    //   2032	2043	2046	java/lang/Throwable
    //   2099	2113	2113	java/lang/Throwable
    //   2124	2137	2140	java/lang/Throwable
    //   2129	2152	2155	java/lang/Throwable
    //   2144	2170	2173	java/lang/Throwable
    //   2159	2200	2203	java/lang/Throwable
    //   2266	2293	2296	java/lang/Throwable
    //   2283	2311	2314	java/lang/Throwable
    //   2300	2341	2344	java/lang/Throwable
    //   2318	2352	2352	java/lang/Throwable
    //   2374	2385	2388	java/lang/Throwable
    //   2398	3128	3856	java/lang/Throwable
    //   2488	2502	2502	java/lang/Throwable
    //   2513	2526	2529	java/lang/Throwable
    //   2518	2541	2544	java/lang/Throwable
    //   2533	2559	2562	java/lang/Throwable
    //   2548	2589	2592	java/lang/Throwable
    //   2655	2682	2685	java/lang/Throwable
    //   2672	2700	2703	java/lang/Throwable
    //   2689	2730	2733	java/lang/Throwable
    //   2707	2741	2741	java/lang/Throwable
    //   2763	2774	2777	java/lang/Throwable
    //   2830	2844	2844	java/lang/Throwable
    //   2855	2868	2871	java/lang/Throwable
    //   2860	2883	2886	java/lang/Throwable
    //   2875	2901	2904	java/lang/Throwable
    //   2890	2931	2934	java/lang/Throwable
    //   2997	3024	3027	java/lang/Throwable
    //   3014	3042	3045	java/lang/Throwable
    //   3031	3072	3075	java/lang/Throwable
    //   3049	3083	3083	java/lang/Throwable
    //   3105	3116	3119	java/lang/Throwable
    //   3129	3855	3856	java/lang/Throwable
    //   3219	3233	3233	java/lang/Throwable
    //   3244	3257	3260	java/lang/Throwable
    //   3249	3272	3275	java/lang/Throwable
    //   3264	3290	3293	java/lang/Throwable
    //   3279	3320	3323	java/lang/Throwable
    //   3386	3413	3416	java/lang/Throwable
    //   3403	3431	3434	java/lang/Throwable
    //   3420	3461	3464	java/lang/Throwable
    //   3438	3472	3472	java/lang/Throwable
    //   3494	3505	3508	java/lang/Throwable
    //   3561	3575	3575	java/lang/Throwable
    //   3586	3599	3602	java/lang/Throwable
    //   3591	3614	3617	java/lang/Throwable
    //   3606	3632	3635	java/lang/Throwable
    //   3621	3662	3665	java/lang/Throwable
    //   3728	3755	3758	java/lang/Throwable
    //   3745	3773	3776	java/lang/Throwable
    //   3762	3803	3806	java/lang/Throwable
    //   3780	3814	3814	java/lang/Throwable
    //   3836	3847	3850	java/lang/Throwable
  }
  
  static void Zp(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZJ(Object paramObject) {
    Zttj.ZN = a(-4838, -5714);
    Zttj.ZF = new BigInteger(a(-4841, -5043));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zb9k.Za.charAt(Math.abs(((BigInteger)Zsej.ZT).intValue() % 32)) <= Zgkl.ZR.charAt(Math.abs(((BigInteger)Zlyf.Zm).intValue() % 32))) {
          try {
            Zzv.ZN(Class.forName(a(-4863, 7035)));
            if (!bool)
              Zb8x.ZK(Class.forName(a(-4857, 26004))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zb8x.ZK(Class.forName(a(-4857, 26004)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÁÛÍ`\\t©Ãü'{V\\tV)Ùìfh9\\tóoöb\\trÄ»d¹ÌÔÐ\\tÆ«-n¶~Ê\\tÄ8m¾J¼¤\\twa7p/GDÞ âõòEBwÀ!<2Æ\\fÂÞú3µQ¦À\\bh×\\tä`i>+Ì\\tn?8üVÝ2d\\t¢É¡"'³J\\t8WùJb³þ\\týàJZ)Þx\\tåIH:À\\tí¡\\tè¢èO ¬f\\tV?¹ôþÒvÈ\\tæÓ)a6åH\\têV¨Ñóß\\tcËb \M\\t0ó;m®õ(¯MÿN4ºdÝv`N² ù1KòG7i ­h,JÆ¦Ï\\bäByR ò±ûZû°,¿nklÃ·u\\t­6q¹Û,\\t©eÀ·?>)" ¶\\tÝÉÂ8îG\­åfKÝ@-~Û$Õ¾)'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #121
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'Ä)rW-[\\b)RzÂº¿'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #16
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
    //   128: putstatic burp/Zlc5.a : [Ljava/lang/String;
    //   131: bipush #27
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zlc5.b : [Ljava/lang/String;
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
    //   212: bipush #53
    //   214: goto -> 244
    //   217: bipush #30
    //   219: goto -> 244
    //   222: bipush #89
    //   224: goto -> 244
    //   227: bipush #37
    //   229: goto -> 244
    //   232: bipush #124
    //   234: goto -> 244
    //   237: bipush #31
    //   239: goto -> 244
    //   242: bipush #8
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: sipush #-4854
    //   303: sipush #2989
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zlc5.Z_ : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #82
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-22
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-90
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #56
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-40
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-105
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-71
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-6
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #8
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-75
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #94
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #7
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #61
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-91
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #49
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #8
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #108
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-113
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-127
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-39
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-30
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #92
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-58
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-60
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #21
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: iconst_0
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #50
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #8
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #8
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #56
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: iconst_m1
    //   497: bastore
    //   498: dup
    //   499: bipush #31
    //   501: bipush #-6
    //   503: bastore
    //   504: invokespecial <init> : ([B)V
    //   507: putstatic burp/Zlc5.ZH : Ljava/lang/Object;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFED02) & 0xFFFF;
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
      byte b1 = 35;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlc5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */