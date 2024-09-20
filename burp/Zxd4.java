package burp;

import java.math.BigInteger;

class Zxd4 extends ClassLoader {
  static String Zf;
  
  static Object Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #-31163
    //   7: sipush #1700
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Zs : (Ljava/lang/Object;)V
    //   19: sipush #-31167
    //   22: getstatic burp/Zzvr.Z_ : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zrt9.Zy : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zz5d.Zk : Ljava/lang/Object;
    //   40: sipush #18519
    //   43: getstatic burp/Zg1k.ZG : Ljava/lang/Object;
    //   46: checkcast java/math/BigInteger
    //   49: getstatic burp/Zkw.ZY : Ljava/lang/Object;
    //   52: checkcast java/math/BigInteger
    //   55: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   58: putstatic burp/Zz3k.Zz : Ljava/lang/Object;
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: iconst_1
    //   65: ldc burp/Zx_u
    //   67: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   70: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   73: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   76: astore_3
    //   77: aload_3
    //   78: arraylength
    //   79: istore #4
    //   81: iconst_0
    //   82: istore #5
    //   84: iload #5
    //   86: iload #4
    //   88: if_icmpge -> 225
    //   91: aload_3
    //   92: iload #5
    //   94: aaload
    //   95: astore #6
    //   97: aload #6
    //   99: invokevirtual getModifiers : ()I
    //   102: invokestatic isStatic : (I)Z
    //   105: ifne -> 115
    //   108: goto -> 218
    //   111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   114: athrow
    //   115: aload #6
    //   117: invokevirtual getType : ()Ljava/lang/Class;
    //   120: astore #7
    //   122: aload #7
    //   124: ifnull -> 205
    //   127: aload #7
    //   129: invokevirtual isPrimitive : ()Z
    //   132: ifne -> 205
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: ifnull -> 205
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   156: athrow
    //   157: aload #7
    //   159: invokevirtual getPackage : ()Ljava/lang/Package;
    //   162: invokevirtual getName : ()Ljava/lang/String;
    //   165: ifnull -> 205
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   174: athrow
    //   175: aload #7
    //   177: invokevirtual getPackage : ()Ljava/lang/Package;
    //   180: invokevirtual getName : ()Ljava/lang/String;
    //   183: sipush #-31154
    //   186: sipush #726
    //   189: invokestatic a : (II)Ljava/lang/String;
    //   192: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   195: ifne -> 205
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   204: athrow
    //   205: aload #6
    //   207: iconst_1
    //   208: invokevirtual setAccessible : (Z)V
    //   211: aload #6
    //   213: aconst_null
    //   214: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   217: pop
    //   218: iinc #5, 1
    //   221: iload_2
    //   222: ifeq -> 84
    //   225: sipush #-31160
    //   228: sipush #8228
    //   231: invokestatic a : (II)Ljava/lang/String;
    //   234: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   237: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   240: astore_3
    //   241: aload_3
    //   242: arraylength
    //   243: istore #4
    //   245: iconst_0
    //   246: istore #5
    //   248: iload #5
    //   250: iload #4
    //   252: if_icmpge -> 363
    //   255: aload_3
    //   256: iload #5
    //   258: aaload
    //   259: astore #6
    //   261: aload #6
    //   263: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   266: pop
    //   267: aload #6
    //   269: invokevirtual getModifiers : ()I
    //   272: invokestatic isStatic : (I)Z
    //   275: ifeq -> 349
    //   278: aload #6
    //   280: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   283: arraylength
    //   284: iconst_2
    //   285: if_icmpne -> 349
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   294: athrow
    //   295: aload #6
    //   297: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   300: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   303: if_acmpne -> 349
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload #6
    //   315: iconst_1
    //   316: invokevirtual setAccessible : (Z)V
    //   319: aload #6
    //   321: aconst_null
    //   322: iconst_2
    //   323: anewarray java/lang/Object
    //   326: dup
    //   327: iconst_0
    //   328: aload_0
    //   329: aastore
    //   330: dup
    //   331: iconst_1
    //   332: aload_1
    //   333: aastore
    //   334: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   337: pop
    //   338: iload_2
    //   339: ifeq -> 363
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: iinc #5, 1
    //   352: iload_2
    //   353: ifeq -> 248
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   362: athrow
    //   363: sipush #-31157
    //   366: sipush #12419
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: iconst_1
    //   373: ldc burp/Zeuz
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
    //   491: sipush #-31155
    //   494: sipush #29647
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
    //   533: sipush #-31166
    //   536: sipush #13187
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
    //   560: if_icmpge -> 689
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
    //   583: ifeq -> 675
    //   586: aload #6
    //   588: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   591: arraylength
    //   592: iconst_2
    //   593: if_icmpne -> 675
    //   596: goto -> 603
    //   599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   602: athrow
    //   603: aload #6
    //   605: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   608: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   611: if_acmpne -> 675
    //   614: goto -> 621
    //   617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   620: athrow
    //   621: aload #6
    //   623: iconst_1
    //   624: invokevirtual setAccessible : (Z)V
    //   627: aload #6
    //   629: aconst_null
    //   630: iconst_2
    //   631: anewarray java/lang/Object
    //   634: dup
    //   635: iconst_0
    //   636: aload_0
    //   637: aastore
    //   638: dup
    //   639: iconst_1
    //   640: aload_1
    //   641: ifnonnull -> 659
    //   644: goto -> 651
    //   647: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   650: athrow
    //   651: aload_1
    //   652: goto -> 666
    //   655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   658: athrow
    //   659: aload_1
    //   660: checkcast [B
    //   663: invokevirtual clone : ()Ljava/lang/Object;
    //   666: aastore
    //   667: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   670: pop
    //   671: iload_2
    //   672: ifeq -> 689
    //   675: iinc #5, 1
    //   678: iload_2
    //   679: ifeq -> 556
    //   682: goto -> 689
    //   685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   688: athrow
    //   689: sipush #-31162
    //   692: sipush #-5806
    //   695: invokestatic a : (II)Ljava/lang/String;
    //   698: iconst_1
    //   699: ldc burp/Zt4g
    //   701: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   704: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   707: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   710: astore_3
    //   711: aload_3
    //   712: arraylength
    //   713: istore #4
    //   715: iconst_0
    //   716: istore #5
    //   718: iload #5
    //   720: iload #4
    //   722: if_icmpge -> 859
    //   725: aload_3
    //   726: iload #5
    //   728: aaload
    //   729: astore #6
    //   731: aload #6
    //   733: invokevirtual getModifiers : ()I
    //   736: invokestatic isStatic : (I)Z
    //   739: ifne -> 749
    //   742: goto -> 852
    //   745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   748: athrow
    //   749: aload #6
    //   751: invokevirtual getType : ()Ljava/lang/Class;
    //   754: astore #7
    //   756: aload #7
    //   758: ifnull -> 839
    //   761: aload #7
    //   763: invokevirtual isPrimitive : ()Z
    //   766: ifne -> 839
    //   769: goto -> 776
    //   772: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   775: athrow
    //   776: aload #7
    //   778: invokevirtual getPackage : ()Ljava/lang/Package;
    //   781: ifnull -> 839
    //   784: goto -> 791
    //   787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   790: athrow
    //   791: aload #7
    //   793: invokevirtual getPackage : ()Ljava/lang/Package;
    //   796: invokevirtual getName : ()Ljava/lang/String;
    //   799: ifnull -> 839
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   808: athrow
    //   809: aload #7
    //   811: invokevirtual getPackage : ()Ljava/lang/Package;
    //   814: invokevirtual getName : ()Ljava/lang/String;
    //   817: sipush #-31155
    //   820: sipush #29647
    //   823: invokestatic a : (II)Ljava/lang/String;
    //   826: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   829: ifne -> 839
    //   832: goto -> 839
    //   835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   838: athrow
    //   839: aload #6
    //   841: iconst_1
    //   842: invokevirtual setAccessible : (Z)V
    //   845: aload #6
    //   847: aconst_null
    //   848: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   851: pop
    //   852: iinc #5, 1
    //   855: iload_2
    //   856: ifeq -> 718
    //   859: sipush #-31159
    //   862: sipush #-30365
    //   865: invokestatic a : (II)Ljava/lang/String;
    //   868: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   871: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   874: astore_3
    //   875: aload_3
    //   876: arraylength
    //   877: istore #4
    //   879: iconst_0
    //   880: istore #5
    //   882: iload #5
    //   884: iload #4
    //   886: if_icmpge -> 1018
    //   889: aload_3
    //   890: iload #5
    //   892: aaload
    //   893: astore #6
    //   895: aload #6
    //   897: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   900: pop
    //   901: aload #6
    //   903: invokevirtual getModifiers : ()I
    //   906: invokestatic isStatic : (I)Z
    //   909: ifeq -> 1004
    //   912: aload #6
    //   914: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   917: arraylength
    //   918: iconst_2
    //   919: if_icmpne -> 1004
    //   922: goto -> 929
    //   925: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   928: athrow
    //   929: aload #6
    //   931: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   934: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   937: invokevirtual equals : (Ljava/lang/Object;)Z
    //   940: ifeq -> 1004
    //   943: goto -> 950
    //   946: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   949: athrow
    //   950: aload #6
    //   952: iconst_1
    //   953: invokevirtual setAccessible : (Z)V
    //   956: aload #6
    //   958: aconst_null
    //   959: iconst_2
    //   960: anewarray java/lang/Object
    //   963: dup
    //   964: iconst_0
    //   965: aload_0
    //   966: aastore
    //   967: dup
    //   968: iconst_1
    //   969: aload_1
    //   970: ifnonnull -> 988
    //   973: goto -> 980
    //   976: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   979: athrow
    //   980: aload_1
    //   981: goto -> 995
    //   984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   987: athrow
    //   988: aload_1
    //   989: checkcast [B
    //   992: invokevirtual clone : ()Ljava/lang/Object;
    //   995: aastore
    //   996: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   999: pop
    //   1000: iload_2
    //   1001: ifeq -> 1018
    //   1004: iinc #5, 1
    //   1007: iload_2
    //   1008: ifeq -> 882
    //   1011: goto -> 1018
    //   1014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1017: athrow
    //   1018: iconst_0
    //   1019: istore_3
    //   1020: sipush #-31153
    //   1023: sipush #14653
    //   1026: invokestatic a : (II)Ljava/lang/String;
    //   1029: iconst_1
    //   1030: ldc burp/Zr_z
    //   1032: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1035: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1038: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1041: astore #4
    //   1043: aload #4
    //   1045: arraylength
    //   1046: istore #5
    //   1048: iconst_0
    //   1049: istore #6
    //   1051: iload #6
    //   1053: iload #5
    //   1055: if_icmpge -> 1193
    //   1058: aload #4
    //   1060: iload #6
    //   1062: aaload
    //   1063: astore #7
    //   1065: aload #7
    //   1067: invokevirtual getModifiers : ()I
    //   1070: invokestatic isStatic : (I)Z
    //   1073: ifne -> 1083
    //   1076: goto -> 1186
    //   1079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1082: athrow
    //   1083: aload #7
    //   1085: invokevirtual getType : ()Ljava/lang/Class;
    //   1088: astore #8
    //   1090: aload #8
    //   1092: ifnull -> 1173
    //   1095: aload #8
    //   1097: invokevirtual isPrimitive : ()Z
    //   1100: ifne -> 1173
    //   1103: goto -> 1110
    //   1106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1109: athrow
    //   1110: aload #8
    //   1112: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1115: ifnull -> 1173
    //   1118: goto -> 1125
    //   1121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1124: athrow
    //   1125: aload #8
    //   1127: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1130: invokevirtual getName : ()Ljava/lang/String;
    //   1133: ifnull -> 1173
    //   1136: goto -> 1143
    //   1139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1142: athrow
    //   1143: aload #8
    //   1145: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1148: invokevirtual getName : ()Ljava/lang/String;
    //   1151: sipush #-31155
    //   1154: sipush #29647
    //   1157: invokestatic a : (II)Ljava/lang/String;
    //   1160: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1163: ifne -> 1173
    //   1166: goto -> 1173
    //   1169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1172: athrow
    //   1173: aload #7
    //   1175: iconst_1
    //   1176: invokevirtual setAccessible : (Z)V
    //   1179: aload #7
    //   1181: aconst_null
    //   1182: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1185: pop
    //   1186: iinc #6, 1
    //   1189: iload_2
    //   1190: ifeq -> 1051
    //   1193: sipush #-31161
    //   1196: sipush #31939
    //   1199: invokestatic a : (II)Ljava/lang/String;
    //   1202: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1205: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1208: astore #4
    //   1210: aload #4
    //   1212: arraylength
    //   1213: istore #5
    //   1215: iconst_0
    //   1216: istore #6
    //   1218: iload #6
    //   1220: iload #5
    //   1222: if_icmpge -> 1358
    //   1225: aload #4
    //   1227: iload #6
    //   1229: aaload
    //   1230: astore #7
    //   1232: aload #7
    //   1234: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1237: pop
    //   1238: aload #7
    //   1240: invokevirtual getModifiers : ()I
    //   1243: invokestatic isStatic : (I)Z
    //   1246: ifeq -> 1344
    //   1249: aload #7
    //   1251: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1254: arraylength
    //   1255: iconst_2
    //   1256: if_icmpne -> 1344
    //   1259: goto -> 1266
    //   1262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1265: athrow
    //   1266: aload #7
    //   1268: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1271: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1274: if_acmpne -> 1344
    //   1277: goto -> 1284
    //   1280: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1283: athrow
    //   1284: aload #7
    //   1286: iconst_1
    //   1287: invokevirtual setAccessible : (Z)V
    //   1290: aload #7
    //   1292: aconst_null
    //   1293: iconst_2
    //   1294: anewarray java/lang/Object
    //   1297: dup
    //   1298: iconst_0
    //   1299: aload_0
    //   1300: aastore
    //   1301: dup
    //   1302: iconst_1
    //   1303: aload_1
    //   1304: ifnonnull -> 1322
    //   1307: goto -> 1314
    //   1310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1313: athrow
    //   1314: aload_1
    //   1315: goto -> 1329
    //   1318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1321: athrow
    //   1322: aload_1
    //   1323: checkcast [B
    //   1326: invokevirtual clone : ()Ljava/lang/Object;
    //   1329: aastore
    //   1330: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1333: checkcast java/lang/Boolean
    //   1336: invokevirtual booleanValue : ()Z
    //   1339: istore_3
    //   1340: iload_2
    //   1341: ifeq -> 1358
    //   1344: iinc #6, 1
    //   1347: iload_2
    //   1348: ifeq -> 1218
    //   1351: goto -> 1358
    //   1354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1357: athrow
    //   1358: iload_3
    //   1359: ireturn
    //   1360: astore_3
    //   1361: new java/lang/Exception
    //   1364: dup
    //   1365: aload_3
    //   1366: invokevirtual getMessage : ()Ljava/lang/String;
    //   1369: invokespecial <init> : (Ljava/lang/String;)V
    //   1372: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1359	1360	java/lang/Throwable
    //   97	111	111	java/lang/Throwable
    //   122	135	138	java/lang/Throwable
    //   127	150	153	java/lang/Throwable
    //   142	168	171	java/lang/Throwable
    //   157	198	201	java/lang/Throwable
    //   261	288	291	java/lang/Throwable
    //   278	306	309	java/lang/Throwable
    //   295	342	345	java/lang/Throwable
    //   313	356	359	java/lang/Throwable
    //   405	419	419	java/lang/Throwable
    //   430	443	446	java/lang/Throwable
    //   435	458	461	java/lang/Throwable
    //   450	476	479	java/lang/Throwable
    //   465	506	509	java/lang/Throwable
    //   569	596	599	java/lang/Throwable
    //   586	614	617	java/lang/Throwable
    //   603	644	647	java/lang/Throwable
    //   621	655	655	java/lang/Throwable
    //   666	682	685	java/lang/Throwable
    //   731	745	745	java/lang/Throwable
    //   756	769	772	java/lang/Throwable
    //   761	784	787	java/lang/Throwable
    //   776	802	805	java/lang/Throwable
    //   791	832	835	java/lang/Throwable
    //   895	922	925	java/lang/Throwable
    //   912	943	946	java/lang/Throwable
    //   929	973	976	java/lang/Throwable
    //   950	984	984	java/lang/Throwable
    //   995	1011	1014	java/lang/Throwable
    //   1065	1079	1079	java/lang/Throwable
    //   1090	1103	1106	java/lang/Throwable
    //   1095	1118	1121	java/lang/Throwable
    //   1110	1136	1139	java/lang/Throwable
    //   1125	1166	1169	java/lang/Throwable
    //   1232	1259	1262	java/lang/Throwable
    //   1249	1277	1280	java/lang/Throwable
    //   1266	1307	1310	java/lang/Throwable
    //   1284	1318	1318	java/lang/Throwable
    //   1340	1351	1354	java/lang/Throwable
  }
  
  static void ZK(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZO(Object paramObject) {
    Zlo4.Zn = a(-31158, -12766);
    Zlo4.ZC = new BigInteger(a(-31156, -20144));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zzri.ZL.charAt(Math.abs(((BigInteger)Zxc.ZR).intValue() % 32)) <= Zrly.ZS.charAt(Math.abs(((BigInteger)Ztp.Zp).intValue() % 32))) {
          try {
            Zml.Zs(Class.forName(a(-31165, -23408)));
            if (!bool)
              Zbp_.Zi(Class.forName(a(-31168, -14402))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zbp_.Zi(Class.forName(a(-31168, -14402)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¥ä)\\tüÉ¾)f£L\\fýHÛ¤ògUöÖPâËÓ¬øJq»;ß$5Vd\\rF¹ZÔ úøâ/¼nþÙ2%¯.9Èð\\tij&ð±þY²P>´:ááj¡ B³§:ã<b7<¿iänÕ\\n"¡Î#äy®:8ö¯ò©WBD\\tU7G#\\tÐ¨Lùq4\\tÜfÍQ>ÂPá\\t;´1¡ë~\\b¥8âÛ»®| Ú¥I(Äb.+6>¾"é£oÆDÓF¡9;P\\ta§ziÈÅÛ°:\\t6ÍQpI\\tÉe¤+| µ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #104
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
    //   67: ldc '+tfFuC¹Ä\\toîËÄvÏ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #91
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
    //   128: putstatic burp/Zxd4.a : [Ljava/lang/String;
    //   131: bipush #16
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zxd4.b : [Ljava/lang/String;
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
    //   212: bipush #11
    //   214: goto -> 244
    //   217: bipush #120
    //   219: goto -> 244
    //   222: bipush #14
    //   224: goto -> 244
    //   227: bipush #92
    //   229: goto -> 244
    //   232: bipush #49
    //   234: goto -> 244
    //   237: bipush #34
    //   239: goto -> 244
    //   242: bipush #15
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
    //   300: sipush #-31164
    //   303: sipush #25527
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zxd4.Zf : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #44
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #34
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-23
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-111
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-20
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-41
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #106
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #103
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-10
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-87
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-100
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #102
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-108
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-122
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: iconst_m1
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-12
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-52
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-36
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #64
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-74
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #39
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-62
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-97
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #81
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #46
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-78
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #92
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #25
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-48
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-93
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #48
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-3
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zxd4.Zt : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF864E) & 0xFFFF;
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
      char c = 'à';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxd4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */