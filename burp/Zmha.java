package burp;

import java.math.BigInteger;

class Zmha extends ClassLoader {
  static String Zo;
  
  static Object ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zh(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zs(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-15518
    //   7: sipush #21692
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZI : (Ljava/lang/Object;)V
    //   19: sipush #-15510
    //   22: getstatic burp/Zezn.Zh : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zllw.ZW : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zb_u.Zp : Ljava/lang/Object;
    //   40: sipush #22570
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: iconst_1
    //   47: ldc burp/Zt7j
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
    //   165: sipush #-15517
    //   168: sipush #-15567
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
    //   207: sipush #-15508
    //   210: sipush #-14660
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
    //   234: if_icmpge -> 363
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
    //   257: ifeq -> 349
    //   260: aload #6
    //   262: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   265: arraylength
    //   266: iconst_2
    //   267: if_icmpne -> 349
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   276: athrow
    //   277: aload #6
    //   279: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   282: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   285: if_acmpne -> 349
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   294: athrow
    //   295: aload #6
    //   297: iconst_1
    //   298: invokevirtual setAccessible : (Z)V
    //   301: aload #6
    //   303: aconst_null
    //   304: iconst_2
    //   305: anewarray java/lang/Object
    //   308: dup
    //   309: iconst_0
    //   310: aload_0
    //   311: aastore
    //   312: dup
    //   313: iconst_1
    //   314: aload_1
    //   315: ifnonnull -> 333
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   324: athrow
    //   325: aload_1
    //   326: goto -> 340
    //   329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   332: athrow
    //   333: aload_1
    //   334: checkcast [B
    //   337: invokevirtual clone : ()Ljava/lang/Object;
    //   340: aastore
    //   341: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   344: pop
    //   345: iload_2
    //   346: ifeq -> 363
    //   349: iinc #5, 1
    //   352: iload_2
    //   353: ifeq -> 230
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   362: athrow
    //   363: sipush #-15511
    //   366: sipush #-19518
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: iconst_1
    //   373: ldc burp/Zebj
    //   375: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   378: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   381: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   384: astore_3
    //   385: aload_3
    //   386: arraylength
    //   387: istore #4
    //   389: iconst_0
    //   390: istore #5
    //   392: iload #5
    //   394: iload #4
    //   396: if_icmpge -> 533
    //   399: aload_3
    //   400: iload #5
    //   402: aaload
    //   403: astore #6
    //   405: aload #6
    //   407: invokevirtual getModifiers : ()I
    //   410: invokestatic isStatic : (I)Z
    //   413: ifne -> 423
    //   416: goto -> 526
    //   419: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   422: athrow
    //   423: aload #6
    //   425: invokevirtual getType : ()Ljava/lang/Class;
    //   428: astore #7
    //   430: aload #7
    //   432: ifnull -> 513
    //   435: aload #7
    //   437: invokevirtual isPrimitive : ()Z
    //   440: ifne -> 513
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   449: athrow
    //   450: aload #7
    //   452: invokevirtual getPackage : ()Ljava/lang/Package;
    //   455: ifnull -> 513
    //   458: goto -> 465
    //   461: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   464: athrow
    //   465: aload #7
    //   467: invokevirtual getPackage : ()Ljava/lang/Package;
    //   470: invokevirtual getName : ()Ljava/lang/String;
    //   473: ifnull -> 513
    //   476: goto -> 483
    //   479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   482: athrow
    //   483: aload #7
    //   485: invokevirtual getPackage : ()Ljava/lang/Package;
    //   488: invokevirtual getName : ()Ljava/lang/String;
    //   491: sipush #-15509
    //   494: sipush #-13957
    //   497: invokestatic a : (II)Ljava/lang/String;
    //   500: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   503: ifne -> 513
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   512: athrow
    //   513: aload #6
    //   515: iconst_1
    //   516: invokevirtual setAccessible : (Z)V
    //   519: aload #6
    //   521: aconst_null
    //   522: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   525: pop
    //   526: iinc #5, 1
    //   529: iload_2
    //   530: ifeq -> 392
    //   533: sipush #-15515
    //   536: sipush #-8488
    //   539: invokestatic a : (II)Ljava/lang/String;
    //   542: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   545: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   548: astore_3
    //   549: aload_3
    //   550: arraylength
    //   551: istore #4
    //   553: iconst_0
    //   554: istore #5
    //   556: iload #5
    //   558: iload #4
    //   560: if_icmpge -> 692
    //   563: aload_3
    //   564: iload #5
    //   566: aaload
    //   567: astore #6
    //   569: aload #6
    //   571: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   574: pop
    //   575: aload #6
    //   577: invokevirtual getModifiers : ()I
    //   580: invokestatic isStatic : (I)Z
    //   583: ifeq -> 678
    //   586: aload #6
    //   588: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   591: arraylength
    //   592: iconst_2
    //   593: if_icmpne -> 678
    //   596: goto -> 603
    //   599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   602: athrow
    //   603: aload #6
    //   605: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   608: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   611: invokevirtual equals : (Ljava/lang/Object;)Z
    //   614: ifeq -> 678
    //   617: goto -> 624
    //   620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   623: athrow
    //   624: aload #6
    //   626: iconst_1
    //   627: invokevirtual setAccessible : (Z)V
    //   630: aload #6
    //   632: aconst_null
    //   633: iconst_2
    //   634: anewarray java/lang/Object
    //   637: dup
    //   638: iconst_0
    //   639: aload_0
    //   640: aastore
    //   641: dup
    //   642: iconst_1
    //   643: aload_1
    //   644: ifnonnull -> 662
    //   647: goto -> 654
    //   650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   653: athrow
    //   654: aload_1
    //   655: goto -> 669
    //   658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   661: athrow
    //   662: aload_1
    //   663: checkcast [B
    //   666: invokevirtual clone : ()Ljava/lang/Object;
    //   669: aastore
    //   670: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   673: pop
    //   674: iload_2
    //   675: ifeq -> 692
    //   678: iinc #5, 1
    //   681: iload_2
    //   682: ifeq -> 556
    //   685: goto -> 692
    //   688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   691: athrow
    //   692: new java/io/ByteArrayOutputStream
    //   695: dup
    //   696: invokespecial <init> : ()V
    //   699: astore_3
    //   700: sipush #-15512
    //   703: aload_3
    //   704: sipush #202
    //   707: invokevirtual write : (I)V
    //   710: sipush #18072
    //   713: aload_3
    //   714: sipush #254
    //   717: invokevirtual write : (I)V
    //   720: aload_3
    //   721: sipush #186
    //   724: invokevirtual write : (I)V
    //   727: aload_3
    //   728: sipush #190
    //   731: invokevirtual write : (I)V
    //   734: aload_3
    //   735: iconst_0
    //   736: invokevirtual write : (I)V
    //   739: aload_3
    //   740: iconst_1
    //   741: invokevirtual write : (I)V
    //   744: aload_3
    //   745: iconst_0
    //   746: invokevirtual write : (I)V
    //   749: aload_3
    //   750: bipush #50
    //   752: invokevirtual write : (I)V
    //   755: aload_3
    //   756: getstatic burp/Zec0.Zg : Ljava/lang/Object;
    //   759: checkcast java/math/BigInteger
    //   762: invokevirtual toByteArray : ()[B
    //   765: invokevirtual write : ([B)V
    //   768: aload_3
    //   769: getstatic burp/Zry0.Zr : Ljava/lang/Object;
    //   772: checkcast java/math/BigInteger
    //   775: invokevirtual toByteArray : ()[B
    //   778: invokevirtual write : ([B)V
    //   781: aload_3
    //   782: getstatic burp/Zx_x.Zi : Ljava/lang/Object;
    //   785: checkcast java/math/BigInteger
    //   788: invokevirtual toByteArray : ()[B
    //   791: invokevirtual write : ([B)V
    //   794: aload_3
    //   795: invokevirtual toByteArray : ()[B
    //   798: astore #4
    //   800: aconst_null
    //   801: astore #5
    //   803: invokestatic a : (II)Ljava/lang/String;
    //   806: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   809: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   812: astore #6
    //   814: aload #6
    //   816: arraylength
    //   817: istore #7
    //   819: iconst_0
    //   820: istore #8
    //   822: iload #8
    //   824: iload #7
    //   826: if_icmpge -> 954
    //   829: aload #6
    //   831: iload #8
    //   833: aaload
    //   834: astore #9
    //   836: aload #9
    //   838: invokevirtual getName : ()Ljava/lang/String;
    //   841: sipush #-15519
    //   844: sipush #2278
    //   847: invokestatic a : (II)Ljava/lang/String;
    //   850: invokevirtual equals : (Ljava/lang/Object;)Z
    //   853: ifeq -> 947
    //   856: aload #9
    //   858: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   861: astore #10
    //   863: aload #10
    //   865: arraylength
    //   866: iconst_4
    //   867: if_icmpeq -> 877
    //   870: goto -> 947
    //   873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   876: athrow
    //   877: aload #10
    //   879: iconst_0
    //   880: aaload
    //   881: ldc java/lang/String
    //   883: if_acmpeq -> 893
    //   886: goto -> 947
    //   889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   892: athrow
    //   893: aload #10
    //   895: iconst_1
    //   896: aaload
    //   897: ldc [B
    //   899: if_acmpeq -> 909
    //   902: goto -> 947
    //   905: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   908: athrow
    //   909: aload #10
    //   911: iconst_2
    //   912: aaload
    //   913: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   916: if_acmpeq -> 926
    //   919: goto -> 947
    //   922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   925: athrow
    //   926: aload #10
    //   928: iconst_3
    //   929: aaload
    //   930: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   933: if_acmpeq -> 943
    //   936: goto -> 947
    //   939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   942: athrow
    //   943: aload #9
    //   945: astore #5
    //   947: iinc #8, 1
    //   950: iload_2
    //   951: ifeq -> 822
    //   954: aload #5
    //   956: iconst_1
    //   957: invokevirtual setAccessible : (Z)V
    //   960: ldc burp/Zgzv
    //   962: iconst_0
    //   963: anewarray java/lang/Class
    //   966: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   969: astore #6
    //   971: aload #6
    //   973: iconst_1
    //   974: invokevirtual setAccessible : (Z)V
    //   977: aload #5
    //   979: aload #6
    //   981: iconst_0
    //   982: anewarray java/lang/Object
    //   985: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   988: iconst_4
    //   989: anewarray java/lang/Object
    //   992: dup
    //   993: iconst_0
    //   994: sipush #-15513
    //   997: sipush #24062
    //   1000: invokestatic a : (II)Ljava/lang/String;
    //   1003: aastore
    //   1004: dup
    //   1005: iconst_1
    //   1006: aload #4
    //   1008: aastore
    //   1009: dup
    //   1010: iconst_2
    //   1011: iconst_0
    //   1012: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1015: aastore
    //   1016: dup
    //   1017: iconst_3
    //   1018: aload #4
    //   1020: arraylength
    //   1021: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1024: aastore
    //   1025: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1028: pop
    //   1029: goto -> 1033
    //   1032: astore_3
    //   1033: getstatic burp/Zxzp.ZH : Ljava/lang/String;
    //   1036: getstatic burp/Zs15.Zk : Ljava/lang/Object;
    //   1039: checkcast java/math/BigInteger
    //   1042: invokevirtual intValue : ()I
    //   1045: bipush #32
    //   1047: irem
    //   1048: invokestatic abs : (I)I
    //   1051: invokevirtual charAt : (I)C
    //   1054: getstatic burp/Zgqp.ZA : Ljava/lang/String;
    //   1057: getstatic burp/Zmji.ZB : Ljava/lang/Object;
    //   1060: checkcast java/math/BigInteger
    //   1063: invokevirtual intValue : ()I
    //   1066: bipush #32
    //   1068: irem
    //   1069: invokestatic abs : (I)I
    //   1072: invokevirtual charAt : (I)C
    //   1075: if_icmple -> 1182
    //   1078: getstatic burp/Zkig.ZE : Ljava/lang/String;
    //   1081: getstatic burp/Zk52.Zu : Ljava/lang/Object;
    //   1084: checkcast java/math/BigInteger
    //   1087: invokevirtual intValue : ()I
    //   1090: bipush #32
    //   1092: irem
    //   1093: invokestatic abs : (I)I
    //   1096: invokevirtual charAt : (I)C
    //   1099: getstatic burp/Zr4z.Zw : Ljava/lang/String;
    //   1102: getstatic burp/Zgj5.ZO : Ljava/lang/Object;
    //   1105: checkcast java/math/BigInteger
    //   1108: invokevirtual intValue : ()I
    //   1111: bipush #32
    //   1113: irem
    //   1114: invokestatic abs : (I)I
    //   1117: invokevirtual charAt : (I)C
    //   1120: if_icmpgt -> 1182
    //   1123: goto -> 1130
    //   1126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1129: athrow
    //   1130: getstatic burp/Zmt7.Zl : Ljava/lang/String;
    //   1133: getstatic burp/Zgmt.ZX : Ljava/lang/Object;
    //   1136: checkcast java/math/BigInteger
    //   1139: invokevirtual intValue : ()I
    //   1142: bipush #32
    //   1144: irem
    //   1145: invokestatic abs : (I)I
    //   1148: invokevirtual charAt : (I)C
    //   1151: getstatic burp/Ztgv.ZC : Ljava/lang/String;
    //   1154: getstatic burp/Zrd3.ZI : Ljava/lang/Object;
    //   1157: checkcast java/math/BigInteger
    //   1160: invokevirtual intValue : ()I
    //   1163: bipush #32
    //   1165: irem
    //   1166: invokestatic abs : (I)I
    //   1169: invokevirtual charAt : (I)C
    //   1172: if_icmpgt -> 1190
    //   1175: goto -> 1182
    //   1178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1181: athrow
    //   1182: iconst_1
    //   1183: goto -> 1191
    //   1186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1189: athrow
    //   1190: iconst_0
    //   1191: ireturn
    //   1192: astore_3
    //   1193: new java/lang/Exception
    //   1196: dup
    //   1197: aload_3
    //   1198: invokevirtual getMessage : ()Ljava/lang/String;
    //   1201: invokespecial <init> : (Ljava/lang/String;)V
    //   1204: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1191	1192	java/lang/Throwable
    //   79	93	93	java/lang/Throwable
    //   104	117	120	java/lang/Throwable
    //   109	132	135	java/lang/Throwable
    //   124	150	153	java/lang/Throwable
    //   139	180	183	java/lang/Throwable
    //   243	270	273	java/lang/Throwable
    //   260	288	291	java/lang/Throwable
    //   277	318	321	java/lang/Throwable
    //   295	329	329	java/lang/Throwable
    //   340	356	359	java/lang/Throwable
    //   405	419	419	java/lang/Throwable
    //   430	443	446	java/lang/Throwable
    //   435	458	461	java/lang/Throwable
    //   450	476	479	java/lang/Throwable
    //   465	506	509	java/lang/Throwable
    //   569	596	599	java/lang/Throwable
    //   586	617	620	java/lang/Throwable
    //   603	647	650	java/lang/Throwable
    //   624	658	658	java/lang/Throwable
    //   669	685	688	java/lang/Throwable
    //   692	1029	1032	java/lang/Throwable
    //   863	873	873	java/lang/Throwable
    //   877	889	889	java/lang/Throwable
    //   893	905	905	java/lang/Throwable
    //   909	922	922	java/lang/Throwable
    //   926	939	939	java/lang/Throwable
    //   1033	1123	1126	java/lang/Throwable
    //   1078	1175	1178	java/lang/Throwable
    //   1130	1186	1186	java/lang/Throwable
  }
  
  static void ZY(Object paramObject) {
    Zro2.ZF = a(-15507, -4889);
    Zro2.Zu = new BigInteger(a(-15520, 16483));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zvos.Zk.charAt(Math.abs(((BigInteger)Zgjj.ZW).intValue() % 32)) > Zxo4.ZW.charAt(Math.abs(((BigInteger)Zrpm.ZR).intValue() % 32))) {
          try {
            Zxx4.ZU(Class.forName(a(-15506, -16073)));
            if (bool)
              Zlg1.Zy(Class.forName(a(-15505, -20921))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlg1.Zy(Class.forName(a(-15505, -20921)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'n¬á·l+6Ø¸4³jØôY©{$­\´º;¼ª\\t}èb1`}  ì#Ió/çÇ¢ÂE~cïp6Ãá<~Àf\\tÃ8µ+Qhb\\t:ù}A\\tl[@G$ÕüúÝf}6o%ÈüMÊÖI¸Xs}0M5eB<ó6ûß5y|>©ü:VSòýiÌ¡eÈý2ha¤ì¾¥ñ=úøð">JPEFý3+Ò(Ä¨PÌH,Riè|½dz\\tàÑ}ª)\\tk« Y8\\t}¦'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #21
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
    //   68: ldc 'õ®u&¦0°íCB²dp6Bå+uÞ{%9\\bQý¥9dÍy'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
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
    //   129: putstatic burp/Zmha.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmha.b : [Ljava/lang/String;
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
    //   212: bipush #42
    //   214: goto -> 244
    //   217: bipush #110
    //   219: goto -> 244
    //   222: bipush #69
    //   224: goto -> 244
    //   227: bipush #28
    //   229: goto -> 244
    //   232: bipush #33
    //   234: goto -> 244
    //   237: bipush #60
    //   239: goto -> 244
    //   242: bipush #54
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
    //   300: sipush #-15516
    //   303: sipush #-27791
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zmha.Zo : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #76
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-71
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-36
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-32
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-67
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-58
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: iconst_m1
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-64
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #51
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-19
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #108
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-90
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-38
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-100
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #116
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-96
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #53
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-106
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-115
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-117
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #96
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-80
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #110
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-78
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #47
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #11
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #59
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #45
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #86
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #39
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #70
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-45
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zmha.ZM : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC369) & 0xFFFF;
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
      char c = 'â';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmha.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */