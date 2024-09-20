package burp;

import java.math.BigInteger;

class Zkq9 extends ClassLoader {
  static Object Ze;
  
  static String ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zlot.ZJ : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zgu4.Zs : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zlna.ZG : Ljava/lang/Object;
    //   22: sipush #24328
    //   25: getstatic burp/Zg_5.ZA : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zmha.ZM : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zgii.ZD : Ljava/lang/Object;
    //   43: sipush #4179
    //   46: getstatic burp/Zg3m.ZK : Ljava/lang/Object;
    //   49: checkcast java/math/BigInteger
    //   52: getstatic burp/Zgzv.Zb : Ljava/lang/Object;
    //   55: checkcast java/math/BigInteger
    //   58: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   61: putstatic burp/Zrqd.Zi : Ljava/lang/Object;
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: ldc burp/Zb3r
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
    //   186: sipush #24334
    //   189: sipush #22407
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
    //   225: ifeq -> 87
    //   228: sipush #24335
    //   231: sipush #18375
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
    //   255: if_icmpge -> 366
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
    //   278: ifeq -> 352
    //   281: aload #6
    //   283: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   286: arraylength
    //   287: iconst_2
    //   288: if_icmpne -> 352
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   303: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   306: if_acmpne -> 352
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: aload #6
    //   318: iconst_1
    //   319: invokevirtual setAccessible : (Z)V
    //   322: aload #6
    //   324: aconst_null
    //   325: iconst_2
    //   326: anewarray java/lang/Object
    //   329: dup
    //   330: iconst_0
    //   331: aload_0
    //   332: aastore
    //   333: dup
    //   334: iconst_1
    //   335: aload_1
    //   336: aastore
    //   337: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   340: pop
    //   341: iload_2
    //   342: ifeq -> 366
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   351: athrow
    //   352: iinc #5, 1
    //   355: iload_2
    //   356: ifeq -> 251
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   365: athrow
    //   366: sipush #24343
    //   369: sipush #8016
    //   372: invokestatic a : (II)Ljava/lang/String;
    //   375: iconst_1
    //   376: ldc burp/Zxz_
    //   378: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   381: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   384: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   387: astore_3
    //   388: aload_3
    //   389: arraylength
    //   390: istore #4
    //   392: iconst_0
    //   393: istore #5
    //   395: iload #5
    //   397: iload #4
    //   399: if_icmpge -> 536
    //   402: aload_3
    //   403: iload #5
    //   405: aaload
    //   406: astore #6
    //   408: aload #6
    //   410: invokevirtual getModifiers : ()I
    //   413: invokestatic isStatic : (I)Z
    //   416: ifne -> 426
    //   419: goto -> 529
    //   422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   425: athrow
    //   426: aload #6
    //   428: invokevirtual getType : ()Ljava/lang/Class;
    //   431: astore #7
    //   433: aload #7
    //   435: ifnull -> 516
    //   438: aload #7
    //   440: invokevirtual isPrimitive : ()Z
    //   443: ifne -> 516
    //   446: goto -> 453
    //   449: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   452: athrow
    //   453: aload #7
    //   455: invokevirtual getPackage : ()Ljava/lang/Package;
    //   458: ifnull -> 516
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   467: athrow
    //   468: aload #7
    //   470: invokevirtual getPackage : ()Ljava/lang/Package;
    //   473: invokevirtual getName : ()Ljava/lang/String;
    //   476: ifnull -> 516
    //   479: goto -> 486
    //   482: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   485: athrow
    //   486: aload #7
    //   488: invokevirtual getPackage : ()Ljava/lang/Package;
    //   491: invokevirtual getName : ()Ljava/lang/String;
    //   494: sipush #24326
    //   497: sipush #9544
    //   500: invokestatic a : (II)Ljava/lang/String;
    //   503: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   506: ifne -> 516
    //   509: goto -> 516
    //   512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   515: athrow
    //   516: aload #6
    //   518: iconst_1
    //   519: invokevirtual setAccessible : (Z)V
    //   522: aload #6
    //   524: aconst_null
    //   525: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   528: pop
    //   529: iinc #5, 1
    //   532: iload_2
    //   533: ifeq -> 395
    //   536: sipush #24329
    //   539: sipush #-16763
    //   542: invokestatic a : (II)Ljava/lang/String;
    //   545: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   548: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   551: astore_3
    //   552: aload_3
    //   553: arraylength
    //   554: istore #4
    //   556: iconst_0
    //   557: istore #5
    //   559: iload #5
    //   561: iload #4
    //   563: if_icmpge -> 692
    //   566: aload_3
    //   567: iload #5
    //   569: aaload
    //   570: astore #6
    //   572: aload #6
    //   574: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   577: pop
    //   578: aload #6
    //   580: invokevirtual getModifiers : ()I
    //   583: invokestatic isStatic : (I)Z
    //   586: ifeq -> 678
    //   589: aload #6
    //   591: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   594: arraylength
    //   595: iconst_2
    //   596: if_icmpne -> 678
    //   599: goto -> 606
    //   602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   605: athrow
    //   606: aload #6
    //   608: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   611: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   614: if_acmpne -> 678
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
    //   682: ifeq -> 559
    //   685: goto -> 692
    //   688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   691: athrow
    //   692: sipush #24341
    //   695: sipush #14769
    //   698: invokestatic a : (II)Ljava/lang/String;
    //   701: iconst_1
    //   702: ldc burp/Zg7w
    //   704: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   707: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   710: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   713: astore_3
    //   714: aload_3
    //   715: arraylength
    //   716: istore #4
    //   718: iconst_0
    //   719: istore #5
    //   721: iload #5
    //   723: iload #4
    //   725: if_icmpge -> 862
    //   728: aload_3
    //   729: iload #5
    //   731: aaload
    //   732: astore #6
    //   734: aload #6
    //   736: invokevirtual getModifiers : ()I
    //   739: invokestatic isStatic : (I)Z
    //   742: ifne -> 752
    //   745: goto -> 855
    //   748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   751: athrow
    //   752: aload #6
    //   754: invokevirtual getType : ()Ljava/lang/Class;
    //   757: astore #7
    //   759: aload #7
    //   761: ifnull -> 842
    //   764: aload #7
    //   766: invokevirtual isPrimitive : ()Z
    //   769: ifne -> 842
    //   772: goto -> 779
    //   775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   778: athrow
    //   779: aload #7
    //   781: invokevirtual getPackage : ()Ljava/lang/Package;
    //   784: ifnull -> 842
    //   787: goto -> 794
    //   790: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   793: athrow
    //   794: aload #7
    //   796: invokevirtual getPackage : ()Ljava/lang/Package;
    //   799: invokevirtual getName : ()Ljava/lang/String;
    //   802: ifnull -> 842
    //   805: goto -> 812
    //   808: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   811: athrow
    //   812: aload #7
    //   814: invokevirtual getPackage : ()Ljava/lang/Package;
    //   817: invokevirtual getName : ()Ljava/lang/String;
    //   820: sipush #24326
    //   823: sipush #9544
    //   826: invokestatic a : (II)Ljava/lang/String;
    //   829: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   832: ifne -> 842
    //   835: goto -> 842
    //   838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   841: athrow
    //   842: aload #6
    //   844: iconst_1
    //   845: invokevirtual setAccessible : (Z)V
    //   848: aload #6
    //   850: aconst_null
    //   851: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   854: pop
    //   855: iinc #5, 1
    //   858: iload_2
    //   859: ifeq -> 721
    //   862: sipush #24325
    //   865: sipush #29812
    //   868: invokestatic a : (II)Ljava/lang/String;
    //   871: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   874: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   877: astore_3
    //   878: aload_3
    //   879: arraylength
    //   880: istore #4
    //   882: iconst_0
    //   883: istore #5
    //   885: iload #5
    //   887: iload #4
    //   889: if_icmpge -> 1021
    //   892: aload_3
    //   893: iload #5
    //   895: aaload
    //   896: astore #6
    //   898: aload #6
    //   900: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   903: pop
    //   904: aload #6
    //   906: invokevirtual getModifiers : ()I
    //   909: invokestatic isStatic : (I)Z
    //   912: ifeq -> 1007
    //   915: aload #6
    //   917: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   920: arraylength
    //   921: iconst_2
    //   922: if_icmpne -> 1007
    //   925: goto -> 932
    //   928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   931: athrow
    //   932: aload #6
    //   934: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   937: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   940: invokevirtual equals : (Ljava/lang/Object;)Z
    //   943: ifeq -> 1007
    //   946: goto -> 953
    //   949: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   952: athrow
    //   953: aload #6
    //   955: iconst_1
    //   956: invokevirtual setAccessible : (Z)V
    //   959: aload #6
    //   961: aconst_null
    //   962: iconst_2
    //   963: anewarray java/lang/Object
    //   966: dup
    //   967: iconst_0
    //   968: aload_0
    //   969: aastore
    //   970: dup
    //   971: iconst_1
    //   972: aload_1
    //   973: ifnonnull -> 991
    //   976: goto -> 983
    //   979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   982: athrow
    //   983: aload_1
    //   984: goto -> 998
    //   987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   990: athrow
    //   991: aload_1
    //   992: checkcast [B
    //   995: invokevirtual clone : ()Ljava/lang/Object;
    //   998: aastore
    //   999: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1002: pop
    //   1003: iload_2
    //   1004: ifeq -> 1021
    //   1007: iinc #5, 1
    //   1010: iload_2
    //   1011: ifeq -> 885
    //   1014: goto -> 1021
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: iconst_0
    //   1022: istore_3
    //   1023: getstatic burp/Zg8v.Zd : Ljava/lang/String;
    //   1026: getstatic burp/Zrn0.ZE : Ljava/lang/Object;
    //   1029: checkcast java/math/BigInteger
    //   1032: invokevirtual intValue : ()I
    //   1035: bipush #32
    //   1037: irem
    //   1038: invokestatic abs : (I)I
    //   1041: invokevirtual charAt : (I)C
    //   1044: getstatic burp/Ztp.ZG : Ljava/lang/String;
    //   1047: getstatic burp/Zb0s.Zv : Ljava/lang/Object;
    //   1050: checkcast java/math/BigInteger
    //   1053: invokevirtual intValue : ()I
    //   1056: bipush #32
    //   1058: irem
    //   1059: invokestatic abs : (I)I
    //   1062: invokevirtual charAt : (I)C
    //   1065: if_icmpgt -> 1409
    //   1068: sipush #24332
    //   1071: sipush #14058
    //   1074: invokestatic a : (II)Ljava/lang/String;
    //   1077: iconst_1
    //   1078: ldc burp/Zl8y
    //   1080: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1083: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1086: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1089: astore #4
    //   1091: aload #4
    //   1093: arraylength
    //   1094: istore #5
    //   1096: iconst_0
    //   1097: istore #6
    //   1099: iload #6
    //   1101: iload #5
    //   1103: if_icmpge -> 1241
    //   1106: aload #4
    //   1108: iload #6
    //   1110: aaload
    //   1111: astore #7
    //   1113: aload #7
    //   1115: invokevirtual getModifiers : ()I
    //   1118: invokestatic isStatic : (I)Z
    //   1121: ifne -> 1131
    //   1124: goto -> 1234
    //   1127: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1130: athrow
    //   1131: aload #7
    //   1133: invokevirtual getType : ()Ljava/lang/Class;
    //   1136: astore #8
    //   1138: aload #8
    //   1140: ifnull -> 1221
    //   1143: aload #8
    //   1145: invokevirtual isPrimitive : ()Z
    //   1148: ifne -> 1221
    //   1151: goto -> 1158
    //   1154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1157: athrow
    //   1158: aload #8
    //   1160: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1163: ifnull -> 1221
    //   1166: goto -> 1173
    //   1169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1172: athrow
    //   1173: aload #8
    //   1175: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1178: invokevirtual getName : ()Ljava/lang/String;
    //   1181: ifnull -> 1221
    //   1184: goto -> 1191
    //   1187: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1190: athrow
    //   1191: aload #8
    //   1193: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1196: invokevirtual getName : ()Ljava/lang/String;
    //   1199: sipush #24326
    //   1202: sipush #9544
    //   1205: invokestatic a : (II)Ljava/lang/String;
    //   1208: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1211: ifne -> 1221
    //   1214: goto -> 1221
    //   1217: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1220: athrow
    //   1221: aload #7
    //   1223: iconst_1
    //   1224: invokevirtual setAccessible : (Z)V
    //   1227: aload #7
    //   1229: aconst_null
    //   1230: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1233: pop
    //   1234: iinc #6, 1
    //   1237: iload_2
    //   1238: ifeq -> 1099
    //   1241: sipush #24340
    //   1244: sipush #9480
    //   1247: invokestatic a : (II)Ljava/lang/String;
    //   1250: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1253: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1256: astore #4
    //   1258: aload #4
    //   1260: arraylength
    //   1261: istore #5
    //   1263: iconst_0
    //   1264: istore #6
    //   1266: iload #6
    //   1268: iload #5
    //   1270: if_icmpge -> 1406
    //   1273: aload #4
    //   1275: iload #6
    //   1277: aaload
    //   1278: astore #7
    //   1280: aload #7
    //   1282: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1285: pop
    //   1286: aload #7
    //   1288: invokevirtual getModifiers : ()I
    //   1291: invokestatic isStatic : (I)Z
    //   1294: ifeq -> 1392
    //   1297: aload #7
    //   1299: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1302: arraylength
    //   1303: iconst_2
    //   1304: if_icmpne -> 1392
    //   1307: goto -> 1314
    //   1310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1313: athrow
    //   1314: aload #7
    //   1316: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1319: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1322: if_acmpne -> 1392
    //   1325: goto -> 1332
    //   1328: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1331: athrow
    //   1332: aload #7
    //   1334: iconst_1
    //   1335: invokevirtual setAccessible : (Z)V
    //   1338: aload #7
    //   1340: aconst_null
    //   1341: iconst_2
    //   1342: anewarray java/lang/Object
    //   1345: dup
    //   1346: iconst_0
    //   1347: aload_0
    //   1348: aastore
    //   1349: dup
    //   1350: iconst_1
    //   1351: aload_1
    //   1352: ifnonnull -> 1370
    //   1355: goto -> 1362
    //   1358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1361: athrow
    //   1362: aload_1
    //   1363: goto -> 1377
    //   1366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1369: athrow
    //   1370: aload_1
    //   1371: checkcast [B
    //   1374: invokevirtual clone : ()Ljava/lang/Object;
    //   1377: aastore
    //   1378: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1381: checkcast java/lang/Boolean
    //   1384: invokevirtual booleanValue : ()Z
    //   1387: istore_3
    //   1388: iload_2
    //   1389: ifeq -> 1406
    //   1392: iinc #6, 1
    //   1395: iload_2
    //   1396: ifeq -> 1266
    //   1399: goto -> 1406
    //   1402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1405: athrow
    //   1406: goto -> 1747
    //   1409: sipush #24331
    //   1412: sipush #16070
    //   1415: invokestatic a : (II)Ljava/lang/String;
    //   1418: iconst_1
    //   1419: ldc burp/Zgre
    //   1421: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1424: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1427: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1430: astore #4
    //   1432: aload #4
    //   1434: arraylength
    //   1435: istore #5
    //   1437: iconst_0
    //   1438: istore #6
    //   1440: iload #6
    //   1442: iload #5
    //   1444: if_icmpge -> 1582
    //   1447: aload #4
    //   1449: iload #6
    //   1451: aaload
    //   1452: astore #7
    //   1454: aload #7
    //   1456: invokevirtual getModifiers : ()I
    //   1459: invokestatic isStatic : (I)Z
    //   1462: ifne -> 1472
    //   1465: goto -> 1575
    //   1468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1471: athrow
    //   1472: aload #7
    //   1474: invokevirtual getType : ()Ljava/lang/Class;
    //   1477: astore #8
    //   1479: aload #8
    //   1481: ifnull -> 1562
    //   1484: aload #8
    //   1486: invokevirtual isPrimitive : ()Z
    //   1489: ifne -> 1562
    //   1492: goto -> 1499
    //   1495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1498: athrow
    //   1499: aload #8
    //   1501: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1504: ifnull -> 1562
    //   1507: goto -> 1514
    //   1510: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1513: athrow
    //   1514: aload #8
    //   1516: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1519: invokevirtual getName : ()Ljava/lang/String;
    //   1522: ifnull -> 1562
    //   1525: goto -> 1532
    //   1528: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1531: athrow
    //   1532: aload #8
    //   1534: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1537: invokevirtual getName : ()Ljava/lang/String;
    //   1540: sipush #24326
    //   1543: sipush #9544
    //   1546: invokestatic a : (II)Ljava/lang/String;
    //   1549: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1552: ifne -> 1562
    //   1555: goto -> 1562
    //   1558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1561: athrow
    //   1562: aload #7
    //   1564: iconst_1
    //   1565: invokevirtual setAccessible : (Z)V
    //   1568: aload #7
    //   1570: aconst_null
    //   1571: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1574: pop
    //   1575: iinc #6, 1
    //   1578: iload_2
    //   1579: ifeq -> 1440
    //   1582: sipush #24337
    //   1585: sipush #17732
    //   1588: invokestatic a : (II)Ljava/lang/String;
    //   1591: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1594: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1597: astore #4
    //   1599: aload #4
    //   1601: arraylength
    //   1602: istore #5
    //   1604: iconst_0
    //   1605: istore #6
    //   1607: iload #6
    //   1609: iload #5
    //   1611: if_icmpge -> 1747
    //   1614: aload #4
    //   1616: iload #6
    //   1618: aaload
    //   1619: astore #7
    //   1621: aload #7
    //   1623: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1626: pop
    //   1627: aload #7
    //   1629: invokevirtual getModifiers : ()I
    //   1632: invokestatic isStatic : (I)Z
    //   1635: ifeq -> 1733
    //   1638: aload #7
    //   1640: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1643: arraylength
    //   1644: iconst_2
    //   1645: if_icmpne -> 1733
    //   1648: goto -> 1655
    //   1651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1654: athrow
    //   1655: aload #7
    //   1657: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1660: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1663: if_acmpne -> 1733
    //   1666: goto -> 1673
    //   1669: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1672: athrow
    //   1673: aload #7
    //   1675: iconst_1
    //   1676: invokevirtual setAccessible : (Z)V
    //   1679: aload #7
    //   1681: aconst_null
    //   1682: iconst_2
    //   1683: anewarray java/lang/Object
    //   1686: dup
    //   1687: iconst_0
    //   1688: aload_0
    //   1689: aastore
    //   1690: dup
    //   1691: iconst_1
    //   1692: aload_1
    //   1693: ifnonnull -> 1711
    //   1696: goto -> 1703
    //   1699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1702: athrow
    //   1703: aload_1
    //   1704: goto -> 1718
    //   1707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1710: athrow
    //   1711: aload_1
    //   1712: checkcast [B
    //   1715: invokevirtual clone : ()Ljava/lang/Object;
    //   1718: aastore
    //   1719: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1722: checkcast java/lang/Boolean
    //   1725: invokevirtual booleanValue : ()Z
    //   1728: istore_3
    //   1729: iload_2
    //   1730: ifeq -> 1747
    //   1733: iinc #6, 1
    //   1736: iload_2
    //   1737: ifeq -> 1607
    //   1740: goto -> 1747
    //   1743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1746: athrow
    //   1747: iload_3
    //   1748: ifeq -> 1753
    //   1751: iload_3
    //   1752: ireturn
    //   1753: getstatic burp/Zmgl.Zh : Ljava/lang/String;
    //   1756: getstatic burp/Zgjj.ZW : Ljava/lang/Object;
    //   1759: checkcast java/math/BigInteger
    //   1762: invokevirtual intValue : ()I
    //   1765: bipush #32
    //   1767: irem
    //   1768: invokestatic abs : (I)I
    //   1771: invokevirtual charAt : (I)C
    //   1774: getstatic burp/Zl8i.Zb : Ljava/lang/String;
    //   1777: getstatic burp/Zgre.ZD : Ljava/lang/Object;
    //   1780: checkcast java/math/BigInteger
    //   1783: invokevirtual intValue : ()I
    //   1786: bipush #32
    //   1788: irem
    //   1789: invokestatic abs : (I)I
    //   1792: invokevirtual charAt : (I)C
    //   1795: if_icmpgt -> 2140
    //   1798: sipush #24327
    //   1801: sipush #26054
    //   1804: invokestatic a : (II)Ljava/lang/String;
    //   1807: iconst_1
    //   1808: ldc burp/Zbzc
    //   1810: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1813: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1816: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1819: astore #4
    //   1821: aload #4
    //   1823: arraylength
    //   1824: istore #5
    //   1826: iconst_0
    //   1827: istore #6
    //   1829: iload #6
    //   1831: iload #5
    //   1833: if_icmpge -> 1971
    //   1836: aload #4
    //   1838: iload #6
    //   1840: aaload
    //   1841: astore #7
    //   1843: aload #7
    //   1845: invokevirtual getModifiers : ()I
    //   1848: invokestatic isStatic : (I)Z
    //   1851: ifne -> 1861
    //   1854: goto -> 1964
    //   1857: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1860: athrow
    //   1861: aload #7
    //   1863: invokevirtual getType : ()Ljava/lang/Class;
    //   1866: astore #8
    //   1868: aload #8
    //   1870: ifnull -> 1951
    //   1873: aload #8
    //   1875: invokevirtual isPrimitive : ()Z
    //   1878: ifne -> 1951
    //   1881: goto -> 1888
    //   1884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1887: athrow
    //   1888: aload #8
    //   1890: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1893: ifnull -> 1951
    //   1896: goto -> 1903
    //   1899: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1902: athrow
    //   1903: aload #8
    //   1905: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1908: invokevirtual getName : ()Ljava/lang/String;
    //   1911: ifnull -> 1951
    //   1914: goto -> 1921
    //   1917: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1920: athrow
    //   1921: aload #8
    //   1923: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1926: invokevirtual getName : ()Ljava/lang/String;
    //   1929: sipush #24326
    //   1932: sipush #9544
    //   1935: invokestatic a : (II)Ljava/lang/String;
    //   1938: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1941: ifne -> 1951
    //   1944: goto -> 1951
    //   1947: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1950: athrow
    //   1951: aload #7
    //   1953: iconst_1
    //   1954: invokevirtual setAccessible : (Z)V
    //   1957: aload #7
    //   1959: aconst_null
    //   1960: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1963: pop
    //   1964: iinc #6, 1
    //   1967: iload_2
    //   1968: ifeq -> 1829
    //   1971: sipush #24348
    //   1974: sipush #-4737
    //   1977: invokestatic a : (II)Ljava/lang/String;
    //   1980: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1983: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1986: astore #4
    //   1988: aload #4
    //   1990: arraylength
    //   1991: istore #5
    //   1993: iconst_0
    //   1994: istore #6
    //   1996: iload #6
    //   1998: iload #5
    //   2000: if_icmpge -> 2136
    //   2003: aload #4
    //   2005: iload #6
    //   2007: aaload
    //   2008: astore #7
    //   2010: aload #7
    //   2012: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2015: pop
    //   2016: aload #7
    //   2018: invokevirtual getModifiers : ()I
    //   2021: invokestatic isStatic : (I)Z
    //   2024: ifeq -> 2122
    //   2027: aload #7
    //   2029: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2032: arraylength
    //   2033: iconst_2
    //   2034: if_icmpne -> 2122
    //   2037: goto -> 2044
    //   2040: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2043: athrow
    //   2044: aload #7
    //   2046: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2049: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2052: if_acmpne -> 2122
    //   2055: goto -> 2062
    //   2058: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2061: athrow
    //   2062: aload #7
    //   2064: iconst_1
    //   2065: invokevirtual setAccessible : (Z)V
    //   2068: aload #7
    //   2070: aconst_null
    //   2071: iconst_2
    //   2072: anewarray java/lang/Object
    //   2075: dup
    //   2076: iconst_0
    //   2077: aload_0
    //   2078: aastore
    //   2079: dup
    //   2080: iconst_1
    //   2081: aload_1
    //   2082: ifnonnull -> 2100
    //   2085: goto -> 2092
    //   2088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2091: athrow
    //   2092: aload_1
    //   2093: goto -> 2107
    //   2096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2099: athrow
    //   2100: aload_1
    //   2101: checkcast [B
    //   2104: invokevirtual clone : ()Ljava/lang/Object;
    //   2107: aastore
    //   2108: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2111: checkcast java/lang/Boolean
    //   2114: invokevirtual booleanValue : ()Z
    //   2117: istore_3
    //   2118: iload_2
    //   2119: ifeq -> 2136
    //   2122: iinc #6, 1
    //   2125: iload_2
    //   2126: ifeq -> 1996
    //   2129: goto -> 2136
    //   2132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2135: athrow
    //   2136: iload_2
    //   2137: ifeq -> 2478
    //   2140: sipush #24322
    //   2143: sipush #-3415
    //   2146: invokestatic a : (II)Ljava/lang/String;
    //   2149: iconst_1
    //   2150: ldc burp/Zrd3
    //   2152: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2155: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2158: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2161: astore #4
    //   2163: aload #4
    //   2165: arraylength
    //   2166: istore #5
    //   2168: iconst_0
    //   2169: istore #6
    //   2171: iload #6
    //   2173: iload #5
    //   2175: if_icmpge -> 2313
    //   2178: aload #4
    //   2180: iload #6
    //   2182: aaload
    //   2183: astore #7
    //   2185: aload #7
    //   2187: invokevirtual getModifiers : ()I
    //   2190: invokestatic isStatic : (I)Z
    //   2193: ifne -> 2203
    //   2196: goto -> 2306
    //   2199: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2202: athrow
    //   2203: aload #7
    //   2205: invokevirtual getType : ()Ljava/lang/Class;
    //   2208: astore #8
    //   2210: aload #8
    //   2212: ifnull -> 2293
    //   2215: aload #8
    //   2217: invokevirtual isPrimitive : ()Z
    //   2220: ifne -> 2293
    //   2223: goto -> 2230
    //   2226: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2229: athrow
    //   2230: aload #8
    //   2232: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2235: ifnull -> 2293
    //   2238: goto -> 2245
    //   2241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2244: athrow
    //   2245: aload #8
    //   2247: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2250: invokevirtual getName : ()Ljava/lang/String;
    //   2253: ifnull -> 2293
    //   2256: goto -> 2263
    //   2259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2262: athrow
    //   2263: aload #8
    //   2265: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2268: invokevirtual getName : ()Ljava/lang/String;
    //   2271: sipush #24326
    //   2274: sipush #9544
    //   2277: invokestatic a : (II)Ljava/lang/String;
    //   2280: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2283: ifne -> 2293
    //   2286: goto -> 2293
    //   2289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2292: athrow
    //   2293: aload #7
    //   2295: iconst_1
    //   2296: invokevirtual setAccessible : (Z)V
    //   2299: aload #7
    //   2301: aconst_null
    //   2302: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2305: pop
    //   2306: iinc #6, 1
    //   2309: iload_2
    //   2310: ifeq -> 2171
    //   2313: sipush #24320
    //   2316: sipush #10861
    //   2319: invokestatic a : (II)Ljava/lang/String;
    //   2322: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2325: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2328: astore #4
    //   2330: aload #4
    //   2332: arraylength
    //   2333: istore #5
    //   2335: iconst_0
    //   2336: istore #6
    //   2338: iload #6
    //   2340: iload #5
    //   2342: if_icmpge -> 2478
    //   2345: aload #4
    //   2347: iload #6
    //   2349: aaload
    //   2350: astore #7
    //   2352: aload #7
    //   2354: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2357: pop
    //   2358: aload #7
    //   2360: invokevirtual getModifiers : ()I
    //   2363: invokestatic isStatic : (I)Z
    //   2366: ifeq -> 2464
    //   2369: aload #7
    //   2371: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2374: arraylength
    //   2375: iconst_2
    //   2376: if_icmpne -> 2464
    //   2379: goto -> 2386
    //   2382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2385: athrow
    //   2386: aload #7
    //   2388: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2391: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2394: if_acmpne -> 2464
    //   2397: goto -> 2404
    //   2400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2403: athrow
    //   2404: aload #7
    //   2406: iconst_1
    //   2407: invokevirtual setAccessible : (Z)V
    //   2410: aload #7
    //   2412: aconst_null
    //   2413: iconst_2
    //   2414: anewarray java/lang/Object
    //   2417: dup
    //   2418: iconst_0
    //   2419: aload_0
    //   2420: aastore
    //   2421: dup
    //   2422: iconst_1
    //   2423: aload_1
    //   2424: ifnonnull -> 2442
    //   2427: goto -> 2434
    //   2430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2433: athrow
    //   2434: aload_1
    //   2435: goto -> 2449
    //   2438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2441: athrow
    //   2442: aload_1
    //   2443: checkcast [B
    //   2446: invokevirtual clone : ()Ljava/lang/Object;
    //   2449: aastore
    //   2450: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2453: checkcast java/lang/Boolean
    //   2456: invokevirtual booleanValue : ()Z
    //   2459: istore_3
    //   2460: iload_2
    //   2461: ifeq -> 2478
    //   2464: iinc #6, 1
    //   2467: iload_2
    //   2468: ifeq -> 2338
    //   2471: goto -> 2478
    //   2474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2477: athrow
    //   2478: iload_3
    //   2479: ifeq -> 2484
    //   2482: iload_3
    //   2483: ireturn
    //   2484: getstatic burp/Zml.ZN : Ljava/lang/String;
    //   2487: getstatic burp/Zmgl.ZI : Ljava/lang/Object;
    //   2490: checkcast java/math/BigInteger
    //   2493: invokevirtual intValue : ()I
    //   2496: bipush #32
    //   2498: irem
    //   2499: invokestatic abs : (I)I
    //   2502: invokevirtual charAt : (I)C
    //   2505: getstatic burp/Zxc.Zx : Ljava/lang/String;
    //   2508: getstatic burp/Ztsj.Zc : Ljava/lang/Object;
    //   2511: checkcast java/math/BigInteger
    //   2514: invokevirtual intValue : ()I
    //   2517: bipush #32
    //   2519: irem
    //   2520: invokestatic abs : (I)I
    //   2523: invokevirtual charAt : (I)C
    //   2526: if_icmple -> 2871
    //   2529: sipush #24338
    //   2532: sipush #-11283
    //   2535: invokestatic a : (II)Ljava/lang/String;
    //   2538: iconst_1
    //   2539: ldc burp/Zeyd
    //   2541: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2544: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2547: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2550: astore #4
    //   2552: aload #4
    //   2554: arraylength
    //   2555: istore #5
    //   2557: iconst_0
    //   2558: istore #6
    //   2560: iload #6
    //   2562: iload #5
    //   2564: if_icmpge -> 2702
    //   2567: aload #4
    //   2569: iload #6
    //   2571: aaload
    //   2572: astore #7
    //   2574: aload #7
    //   2576: invokevirtual getModifiers : ()I
    //   2579: invokestatic isStatic : (I)Z
    //   2582: ifne -> 2592
    //   2585: goto -> 2695
    //   2588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2591: athrow
    //   2592: aload #7
    //   2594: invokevirtual getType : ()Ljava/lang/Class;
    //   2597: astore #8
    //   2599: aload #8
    //   2601: ifnull -> 2682
    //   2604: aload #8
    //   2606: invokevirtual isPrimitive : ()Z
    //   2609: ifne -> 2682
    //   2612: goto -> 2619
    //   2615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2618: athrow
    //   2619: aload #8
    //   2621: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2624: ifnull -> 2682
    //   2627: goto -> 2634
    //   2630: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2633: athrow
    //   2634: aload #8
    //   2636: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2639: invokevirtual getName : ()Ljava/lang/String;
    //   2642: ifnull -> 2682
    //   2645: goto -> 2652
    //   2648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2651: athrow
    //   2652: aload #8
    //   2654: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2657: invokevirtual getName : ()Ljava/lang/String;
    //   2660: sipush #24326
    //   2663: sipush #9544
    //   2666: invokestatic a : (II)Ljava/lang/String;
    //   2669: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2672: ifne -> 2682
    //   2675: goto -> 2682
    //   2678: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2681: athrow
    //   2682: aload #7
    //   2684: iconst_1
    //   2685: invokevirtual setAccessible : (Z)V
    //   2688: aload #7
    //   2690: aconst_null
    //   2691: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2694: pop
    //   2695: iinc #6, 1
    //   2698: iload_2
    //   2699: ifeq -> 2560
    //   2702: sipush #24324
    //   2705: sipush #-13865
    //   2708: invokestatic a : (II)Ljava/lang/String;
    //   2711: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2714: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2717: astore #4
    //   2719: aload #4
    //   2721: arraylength
    //   2722: istore #5
    //   2724: iconst_0
    //   2725: istore #6
    //   2727: iload #6
    //   2729: iload #5
    //   2731: if_icmpge -> 2867
    //   2734: aload #4
    //   2736: iload #6
    //   2738: aaload
    //   2739: astore #7
    //   2741: aload #7
    //   2743: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2746: pop
    //   2747: aload #7
    //   2749: invokevirtual getModifiers : ()I
    //   2752: invokestatic isStatic : (I)Z
    //   2755: ifeq -> 2853
    //   2758: aload #7
    //   2760: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2763: arraylength
    //   2764: iconst_2
    //   2765: if_icmpne -> 2853
    //   2768: goto -> 2775
    //   2771: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2774: athrow
    //   2775: aload #7
    //   2777: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2780: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2783: if_acmpne -> 2853
    //   2786: goto -> 2793
    //   2789: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2792: athrow
    //   2793: aload #7
    //   2795: iconst_1
    //   2796: invokevirtual setAccessible : (Z)V
    //   2799: aload #7
    //   2801: aconst_null
    //   2802: iconst_2
    //   2803: anewarray java/lang/Object
    //   2806: dup
    //   2807: iconst_0
    //   2808: aload_0
    //   2809: aastore
    //   2810: dup
    //   2811: iconst_1
    //   2812: aload_1
    //   2813: ifnonnull -> 2831
    //   2816: goto -> 2823
    //   2819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2822: athrow
    //   2823: aload_1
    //   2824: goto -> 2838
    //   2827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2830: athrow
    //   2831: aload_1
    //   2832: checkcast [B
    //   2835: invokevirtual clone : ()Ljava/lang/Object;
    //   2838: aastore
    //   2839: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2842: checkcast java/lang/Boolean
    //   2845: invokevirtual booleanValue : ()Z
    //   2848: istore_3
    //   2849: iload_2
    //   2850: ifeq -> 2867
    //   2853: iinc #6, 1
    //   2856: iload_2
    //   2857: ifeq -> 2727
    //   2860: goto -> 2867
    //   2863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2866: athrow
    //   2867: iload_2
    //   2868: ifeq -> 3209
    //   2871: sipush #24323
    //   2874: sipush #-25501
    //   2877: invokestatic a : (II)Ljava/lang/String;
    //   2880: iconst_1
    //   2881: ldc burp/Zeqo
    //   2883: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2886: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2889: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2892: astore #4
    //   2894: aload #4
    //   2896: arraylength
    //   2897: istore #5
    //   2899: iconst_0
    //   2900: istore #6
    //   2902: iload #6
    //   2904: iload #5
    //   2906: if_icmpge -> 3044
    //   2909: aload #4
    //   2911: iload #6
    //   2913: aaload
    //   2914: astore #7
    //   2916: aload #7
    //   2918: invokevirtual getModifiers : ()I
    //   2921: invokestatic isStatic : (I)Z
    //   2924: ifne -> 2934
    //   2927: goto -> 3037
    //   2930: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2933: athrow
    //   2934: aload #7
    //   2936: invokevirtual getType : ()Ljava/lang/Class;
    //   2939: astore #8
    //   2941: aload #8
    //   2943: ifnull -> 3024
    //   2946: aload #8
    //   2948: invokevirtual isPrimitive : ()Z
    //   2951: ifne -> 3024
    //   2954: goto -> 2961
    //   2957: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2960: athrow
    //   2961: aload #8
    //   2963: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2966: ifnull -> 3024
    //   2969: goto -> 2976
    //   2972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2975: athrow
    //   2976: aload #8
    //   2978: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2981: invokevirtual getName : ()Ljava/lang/String;
    //   2984: ifnull -> 3024
    //   2987: goto -> 2994
    //   2990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2993: athrow
    //   2994: aload #8
    //   2996: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2999: invokevirtual getName : ()Ljava/lang/String;
    //   3002: sipush #24326
    //   3005: sipush #9544
    //   3008: invokestatic a : (II)Ljava/lang/String;
    //   3011: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3014: ifne -> 3024
    //   3017: goto -> 3024
    //   3020: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3023: athrow
    //   3024: aload #7
    //   3026: iconst_1
    //   3027: invokevirtual setAccessible : (Z)V
    //   3030: aload #7
    //   3032: aconst_null
    //   3033: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3036: pop
    //   3037: iinc #6, 1
    //   3040: iload_2
    //   3041: ifeq -> 2902
    //   3044: sipush #24336
    //   3047: sipush #-26867
    //   3050: invokestatic a : (II)Ljava/lang/String;
    //   3053: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3056: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3059: astore #4
    //   3061: aload #4
    //   3063: arraylength
    //   3064: istore #5
    //   3066: iconst_0
    //   3067: istore #6
    //   3069: iload #6
    //   3071: iload #5
    //   3073: if_icmpge -> 3209
    //   3076: aload #4
    //   3078: iload #6
    //   3080: aaload
    //   3081: astore #7
    //   3083: aload #7
    //   3085: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3088: pop
    //   3089: aload #7
    //   3091: invokevirtual getModifiers : ()I
    //   3094: invokestatic isStatic : (I)Z
    //   3097: ifeq -> 3195
    //   3100: aload #7
    //   3102: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3105: arraylength
    //   3106: iconst_2
    //   3107: if_icmpne -> 3195
    //   3110: goto -> 3117
    //   3113: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3116: athrow
    //   3117: aload #7
    //   3119: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3122: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3125: if_acmpne -> 3195
    //   3128: goto -> 3135
    //   3131: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3134: athrow
    //   3135: aload #7
    //   3137: iconst_1
    //   3138: invokevirtual setAccessible : (Z)V
    //   3141: aload #7
    //   3143: aconst_null
    //   3144: iconst_2
    //   3145: anewarray java/lang/Object
    //   3148: dup
    //   3149: iconst_0
    //   3150: aload_0
    //   3151: aastore
    //   3152: dup
    //   3153: iconst_1
    //   3154: aload_1
    //   3155: ifnonnull -> 3173
    //   3158: goto -> 3165
    //   3161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3164: athrow
    //   3165: aload_1
    //   3166: goto -> 3180
    //   3169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3172: athrow
    //   3173: aload_1
    //   3174: checkcast [B
    //   3177: invokevirtual clone : ()Ljava/lang/Object;
    //   3180: aastore
    //   3181: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3184: checkcast java/lang/Boolean
    //   3187: invokevirtual booleanValue : ()Z
    //   3190: istore_3
    //   3191: iload_2
    //   3192: ifeq -> 3209
    //   3195: iinc #6, 1
    //   3198: iload_2
    //   3199: ifeq -> 3069
    //   3202: goto -> 3209
    //   3205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3208: athrow
    //   3209: iload_3
    //   3210: ifeq -> 3215
    //   3213: iload_3
    //   3214: ireturn
    //   3215: getstatic burp/Zlbt.ZE : Ljava/lang/String;
    //   3218: getstatic burp/Zbj.ZY : Ljava/lang/Object;
    //   3221: checkcast java/math/BigInteger
    //   3224: invokevirtual intValue : ()I
    //   3227: bipush #32
    //   3229: irem
    //   3230: invokestatic abs : (I)I
    //   3233: invokevirtual charAt : (I)C
    //   3236: getstatic burp/Ztp.ZG : Ljava/lang/String;
    //   3239: getstatic burp/Zxc.ZR : Ljava/lang/Object;
    //   3242: checkcast java/math/BigInteger
    //   3245: invokevirtual intValue : ()I
    //   3248: bipush #32
    //   3250: irem
    //   3251: invokestatic abs : (I)I
    //   3254: invokevirtual charAt : (I)C
    //   3257: if_icmpgt -> 3602
    //   3260: sipush #24321
    //   3263: sipush #25341
    //   3266: invokestatic a : (II)Ljava/lang/String;
    //   3269: iconst_1
    //   3270: ldc burp/Zz6t
    //   3272: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3275: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3278: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3281: astore #4
    //   3283: aload #4
    //   3285: arraylength
    //   3286: istore #5
    //   3288: iconst_0
    //   3289: istore #6
    //   3291: iload #6
    //   3293: iload #5
    //   3295: if_icmpge -> 3433
    //   3298: aload #4
    //   3300: iload #6
    //   3302: aaload
    //   3303: astore #7
    //   3305: aload #7
    //   3307: invokevirtual getModifiers : ()I
    //   3310: invokestatic isStatic : (I)Z
    //   3313: ifne -> 3323
    //   3316: goto -> 3426
    //   3319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3322: athrow
    //   3323: aload #7
    //   3325: invokevirtual getType : ()Ljava/lang/Class;
    //   3328: astore #8
    //   3330: aload #8
    //   3332: ifnull -> 3413
    //   3335: aload #8
    //   3337: invokevirtual isPrimitive : ()Z
    //   3340: ifne -> 3413
    //   3343: goto -> 3350
    //   3346: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3349: athrow
    //   3350: aload #8
    //   3352: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3355: ifnull -> 3413
    //   3358: goto -> 3365
    //   3361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3364: athrow
    //   3365: aload #8
    //   3367: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3370: invokevirtual getName : ()Ljava/lang/String;
    //   3373: ifnull -> 3413
    //   3376: goto -> 3383
    //   3379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3382: athrow
    //   3383: aload #8
    //   3385: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3388: invokevirtual getName : ()Ljava/lang/String;
    //   3391: sipush #24326
    //   3394: sipush #9544
    //   3397: invokestatic a : (II)Ljava/lang/String;
    //   3400: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3403: ifne -> 3413
    //   3406: goto -> 3413
    //   3409: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3412: athrow
    //   3413: aload #7
    //   3415: iconst_1
    //   3416: invokevirtual setAccessible : (Z)V
    //   3419: aload #7
    //   3421: aconst_null
    //   3422: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3425: pop
    //   3426: iinc #6, 1
    //   3429: iload_2
    //   3430: ifeq -> 3291
    //   3433: sipush #24350
    //   3436: sipush #4104
    //   3439: invokestatic a : (II)Ljava/lang/String;
    //   3442: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3445: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3448: astore #4
    //   3450: aload #4
    //   3452: arraylength
    //   3453: istore #5
    //   3455: iconst_0
    //   3456: istore #6
    //   3458: iload #6
    //   3460: iload #5
    //   3462: if_icmpge -> 3598
    //   3465: aload #4
    //   3467: iload #6
    //   3469: aaload
    //   3470: astore #7
    //   3472: aload #7
    //   3474: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3477: pop
    //   3478: aload #7
    //   3480: invokevirtual getModifiers : ()I
    //   3483: invokestatic isStatic : (I)Z
    //   3486: ifeq -> 3584
    //   3489: aload #7
    //   3491: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3494: arraylength
    //   3495: iconst_2
    //   3496: if_icmpne -> 3584
    //   3499: goto -> 3506
    //   3502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3505: athrow
    //   3506: aload #7
    //   3508: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3511: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3514: if_acmpne -> 3584
    //   3517: goto -> 3524
    //   3520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3523: athrow
    //   3524: aload #7
    //   3526: iconst_1
    //   3527: invokevirtual setAccessible : (Z)V
    //   3530: aload #7
    //   3532: aconst_null
    //   3533: iconst_2
    //   3534: anewarray java/lang/Object
    //   3537: dup
    //   3538: iconst_0
    //   3539: aload_0
    //   3540: aastore
    //   3541: dup
    //   3542: iconst_1
    //   3543: aload_1
    //   3544: ifnonnull -> 3562
    //   3547: goto -> 3554
    //   3550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3553: athrow
    //   3554: aload_1
    //   3555: goto -> 3569
    //   3558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3561: athrow
    //   3562: aload_1
    //   3563: checkcast [B
    //   3566: invokevirtual clone : ()Ljava/lang/Object;
    //   3569: aastore
    //   3570: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3573: checkcast java/lang/Boolean
    //   3576: invokevirtual booleanValue : ()Z
    //   3579: istore_3
    //   3580: iload_2
    //   3581: ifeq -> 3598
    //   3584: iinc #6, 1
    //   3587: iload_2
    //   3588: ifeq -> 3458
    //   3591: goto -> 3598
    //   3594: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3597: athrow
    //   3598: iload_2
    //   3599: ifeq -> 3940
    //   3602: sipush #24330
    //   3605: sipush #-6261
    //   3608: invokestatic a : (II)Ljava/lang/String;
    //   3611: iconst_1
    //   3612: ldc burp/Zlv6
    //   3614: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3617: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3620: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3623: astore #4
    //   3625: aload #4
    //   3627: arraylength
    //   3628: istore #5
    //   3630: iconst_0
    //   3631: istore #6
    //   3633: iload #6
    //   3635: iload #5
    //   3637: if_icmpge -> 3775
    //   3640: aload #4
    //   3642: iload #6
    //   3644: aaload
    //   3645: astore #7
    //   3647: aload #7
    //   3649: invokevirtual getModifiers : ()I
    //   3652: invokestatic isStatic : (I)Z
    //   3655: ifne -> 3665
    //   3658: goto -> 3768
    //   3661: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3664: athrow
    //   3665: aload #7
    //   3667: invokevirtual getType : ()Ljava/lang/Class;
    //   3670: astore #8
    //   3672: aload #8
    //   3674: ifnull -> 3755
    //   3677: aload #8
    //   3679: invokevirtual isPrimitive : ()Z
    //   3682: ifne -> 3755
    //   3685: goto -> 3692
    //   3688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3691: athrow
    //   3692: aload #8
    //   3694: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3697: ifnull -> 3755
    //   3700: goto -> 3707
    //   3703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3706: athrow
    //   3707: aload #8
    //   3709: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3712: invokevirtual getName : ()Ljava/lang/String;
    //   3715: ifnull -> 3755
    //   3718: goto -> 3725
    //   3721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3724: athrow
    //   3725: aload #8
    //   3727: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3730: invokevirtual getName : ()Ljava/lang/String;
    //   3733: sipush #24326
    //   3736: sipush #9544
    //   3739: invokestatic a : (II)Ljava/lang/String;
    //   3742: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3745: ifne -> 3755
    //   3748: goto -> 3755
    //   3751: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3754: athrow
    //   3755: aload #7
    //   3757: iconst_1
    //   3758: invokevirtual setAccessible : (Z)V
    //   3761: aload #7
    //   3763: aconst_null
    //   3764: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3767: pop
    //   3768: iinc #6, 1
    //   3771: iload_2
    //   3772: ifeq -> 3633
    //   3775: sipush #24342
    //   3778: sipush #31570
    //   3781: invokestatic a : (II)Ljava/lang/String;
    //   3784: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3787: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3790: astore #4
    //   3792: aload #4
    //   3794: arraylength
    //   3795: istore #5
    //   3797: iconst_0
    //   3798: istore #6
    //   3800: iload #6
    //   3802: iload #5
    //   3804: if_icmpge -> 3940
    //   3807: aload #4
    //   3809: iload #6
    //   3811: aaload
    //   3812: astore #7
    //   3814: aload #7
    //   3816: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3819: pop
    //   3820: aload #7
    //   3822: invokevirtual getModifiers : ()I
    //   3825: invokestatic isStatic : (I)Z
    //   3828: ifeq -> 3926
    //   3831: aload #7
    //   3833: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3836: arraylength
    //   3837: iconst_2
    //   3838: if_icmpne -> 3926
    //   3841: goto -> 3848
    //   3844: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3847: athrow
    //   3848: aload #7
    //   3850: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3853: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3856: if_acmpne -> 3926
    //   3859: goto -> 3866
    //   3862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3865: athrow
    //   3866: aload #7
    //   3868: iconst_1
    //   3869: invokevirtual setAccessible : (Z)V
    //   3872: aload #7
    //   3874: aconst_null
    //   3875: iconst_2
    //   3876: anewarray java/lang/Object
    //   3879: dup
    //   3880: iconst_0
    //   3881: aload_0
    //   3882: aastore
    //   3883: dup
    //   3884: iconst_1
    //   3885: aload_1
    //   3886: ifnonnull -> 3904
    //   3889: goto -> 3896
    //   3892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3895: athrow
    //   3896: aload_1
    //   3897: goto -> 3911
    //   3900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3903: athrow
    //   3904: aload_1
    //   3905: checkcast [B
    //   3908: invokevirtual clone : ()Ljava/lang/Object;
    //   3911: aastore
    //   3912: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3915: checkcast java/lang/Boolean
    //   3918: invokevirtual booleanValue : ()Z
    //   3921: istore_3
    //   3922: iload_2
    //   3923: ifeq -> 3940
    //   3926: iinc #6, 1
    //   3929: iload_2
    //   3930: ifeq -> 3800
    //   3933: goto -> 3940
    //   3936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3939: athrow
    //   3940: iload_3
    //   3941: ireturn
    //   3942: astore_3
    //   3943: new java/lang/Exception
    //   3946: dup
    //   3947: aload_3
    //   3948: invokevirtual getMessage : ()Ljava/lang/String;
    //   3951: invokespecial <init> : (Ljava/lang/String;)V
    //   3954: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1752	3942	java/lang/Throwable
    //   100	114	114	java/lang/Throwable
    //   125	138	141	java/lang/Throwable
    //   130	153	156	java/lang/Throwable
    //   145	171	174	java/lang/Throwable
    //   160	201	204	java/lang/Throwable
    //   264	291	294	java/lang/Throwable
    //   281	309	312	java/lang/Throwable
    //   298	345	348	java/lang/Throwable
    //   316	359	362	java/lang/Throwable
    //   408	422	422	java/lang/Throwable
    //   433	446	449	java/lang/Throwable
    //   438	461	464	java/lang/Throwable
    //   453	479	482	java/lang/Throwable
    //   468	509	512	java/lang/Throwable
    //   572	599	602	java/lang/Throwable
    //   589	617	620	java/lang/Throwable
    //   606	647	650	java/lang/Throwable
    //   624	658	658	java/lang/Throwable
    //   669	685	688	java/lang/Throwable
    //   734	748	748	java/lang/Throwable
    //   759	772	775	java/lang/Throwable
    //   764	787	790	java/lang/Throwable
    //   779	805	808	java/lang/Throwable
    //   794	835	838	java/lang/Throwable
    //   898	925	928	java/lang/Throwable
    //   915	946	949	java/lang/Throwable
    //   932	976	979	java/lang/Throwable
    //   953	987	987	java/lang/Throwable
    //   998	1014	1017	java/lang/Throwable
    //   1113	1127	1127	java/lang/Throwable
    //   1138	1151	1154	java/lang/Throwable
    //   1143	1166	1169	java/lang/Throwable
    //   1158	1184	1187	java/lang/Throwable
    //   1173	1214	1217	java/lang/Throwable
    //   1280	1307	1310	java/lang/Throwable
    //   1297	1325	1328	java/lang/Throwable
    //   1314	1355	1358	java/lang/Throwable
    //   1332	1366	1366	java/lang/Throwable
    //   1388	1399	1402	java/lang/Throwable
    //   1454	1468	1468	java/lang/Throwable
    //   1479	1492	1495	java/lang/Throwable
    //   1484	1507	1510	java/lang/Throwable
    //   1499	1525	1528	java/lang/Throwable
    //   1514	1555	1558	java/lang/Throwable
    //   1621	1648	1651	java/lang/Throwable
    //   1638	1666	1669	java/lang/Throwable
    //   1655	1696	1699	java/lang/Throwable
    //   1673	1707	1707	java/lang/Throwable
    //   1729	1740	1743	java/lang/Throwable
    //   1753	2483	3942	java/lang/Throwable
    //   1843	1857	1857	java/lang/Throwable
    //   1868	1881	1884	java/lang/Throwable
    //   1873	1896	1899	java/lang/Throwable
    //   1888	1914	1917	java/lang/Throwable
    //   1903	1944	1947	java/lang/Throwable
    //   2010	2037	2040	java/lang/Throwable
    //   2027	2055	2058	java/lang/Throwable
    //   2044	2085	2088	java/lang/Throwable
    //   2062	2096	2096	java/lang/Throwable
    //   2118	2129	2132	java/lang/Throwable
    //   2185	2199	2199	java/lang/Throwable
    //   2210	2223	2226	java/lang/Throwable
    //   2215	2238	2241	java/lang/Throwable
    //   2230	2256	2259	java/lang/Throwable
    //   2245	2286	2289	java/lang/Throwable
    //   2352	2379	2382	java/lang/Throwable
    //   2369	2397	2400	java/lang/Throwable
    //   2386	2427	2430	java/lang/Throwable
    //   2404	2438	2438	java/lang/Throwable
    //   2460	2471	2474	java/lang/Throwable
    //   2484	3214	3942	java/lang/Throwable
    //   2574	2588	2588	java/lang/Throwable
    //   2599	2612	2615	java/lang/Throwable
    //   2604	2627	2630	java/lang/Throwable
    //   2619	2645	2648	java/lang/Throwable
    //   2634	2675	2678	java/lang/Throwable
    //   2741	2768	2771	java/lang/Throwable
    //   2758	2786	2789	java/lang/Throwable
    //   2775	2816	2819	java/lang/Throwable
    //   2793	2827	2827	java/lang/Throwable
    //   2849	2860	2863	java/lang/Throwable
    //   2916	2930	2930	java/lang/Throwable
    //   2941	2954	2957	java/lang/Throwable
    //   2946	2969	2972	java/lang/Throwable
    //   2961	2987	2990	java/lang/Throwable
    //   2976	3017	3020	java/lang/Throwable
    //   3083	3110	3113	java/lang/Throwable
    //   3100	3128	3131	java/lang/Throwable
    //   3117	3158	3161	java/lang/Throwable
    //   3135	3169	3169	java/lang/Throwable
    //   3191	3202	3205	java/lang/Throwable
    //   3215	3941	3942	java/lang/Throwable
    //   3305	3319	3319	java/lang/Throwable
    //   3330	3343	3346	java/lang/Throwable
    //   3335	3358	3361	java/lang/Throwable
    //   3350	3376	3379	java/lang/Throwable
    //   3365	3406	3409	java/lang/Throwable
    //   3472	3499	3502	java/lang/Throwable
    //   3489	3517	3520	java/lang/Throwable
    //   3506	3547	3550	java/lang/Throwable
    //   3524	3558	3558	java/lang/Throwable
    //   3580	3591	3594	java/lang/Throwable
    //   3647	3661	3661	java/lang/Throwable
    //   3672	3685	3688	java/lang/Throwable
    //   3677	3700	3703	java/lang/Throwable
    //   3692	3718	3721	java/lang/Throwable
    //   3707	3748	3751	java/lang/Throwable
    //   3814	3841	3844	java/lang/Throwable
    //   3831	3859	3862	java/lang/Throwable
    //   3848	3889	3892	java/lang/Throwable
    //   3866	3900	3900	java/lang/Throwable
    //   3922	3933	3936	java/lang/Throwable
  }
  
  static void Zw(Object paramObject) {
    Zzh1.Zn = a(24349, 29922);
    Zzh1.Zf = new BigInteger(a(24339, -10837));
  }
  
  static void ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ò]\zU±µ\\ty!ÅãýÉÂR^ä\\t¨¶xú¢G\\tÇ}þ.Õ «\\tVí;H¶Bº\\t ®# ¼\\tfRÊä¨iÛpç\\tÿÖùtÎ{\\t7a ²£R_Ö;Î»¡=ÃxÐàÓ\©0O{Þ°D?±\\t+Öct{k*w\\tËiõy\\tOiï\\f[ø4\\tÄÝ"W¾\\tk×Ã»ó<\\tK\\toSØ*\\tÔ1bäÝ\\tðô0òó*Í\\tã¯z[¾\\bæ\\bÑ2<èvè_\\taåM¥gø,\\t\\bd¯} w©Mdó±pXa7«Á°Kor]tiÉfáÐ*¬.b"UopÏö©£ll¶È¿K¯ub~g+84^1üuT=Ñ¾E·(»Ú\qS\\bf7b¹%o'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #88
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
    //   68: ldc 'G0-ýh"ßþ Uj .G\\rÄKåâõ»ó¸´P>\\te42G\\b}'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_3
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zkq9.a : [Ljava/lang/String;
    //   131: bipush #27
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zkq9.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #96
    //   214: goto -> 243
    //   217: bipush #10
    //   219: goto -> 243
    //   222: iconst_5
    //   223: goto -> 243
    //   226: bipush #23
    //   228: goto -> 243
    //   231: bipush #16
    //   233: goto -> 243
    //   236: bipush #96
    //   238: goto -> 243
    //   241: bipush #7
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #63
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-36
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-12
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-89
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #113
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #56
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #79
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #48
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #49
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #102
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #113
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-12
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-126
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-67
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-48
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-13
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #72
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-75
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #36
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-122
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #9
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-123
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #79
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-5
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #-25
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-123
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-39
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-28
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-89
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #-53
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #26
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #69
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zkq9.Ze : Ljava/lang/Object;
    //   501: sipush #24333
    //   504: sipush #-11588
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zkq9.ZO : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5F04) & 0xFFFF;
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
      char c = 'Ð';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkq9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */