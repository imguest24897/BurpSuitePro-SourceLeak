package burp;

import java.math.BigInteger;

class Zm14 extends ClassLoader {
  static String ZE;
  
  static Object ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZA(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ze_e.Za : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zzhu.ZW : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zzoc.Zx : Ljava/lang/Object;
    //   22: sipush #-3801
    //   25: getstatic burp/Zro_.ZP : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zm14.ZZ : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zr8r.ZR : Ljava/lang/Object;
    //   43: sipush #22319
    //   46: getstatic burp/Zl1z.ZV : Ljava/lang/Object;
    //   49: checkcast java/math/BigInteger
    //   52: getstatic burp/Zl1z.ZV : Ljava/lang/Object;
    //   55: checkcast java/math/BigInteger
    //   58: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   61: putstatic burp/Zbsc.ZA : Ljava/lang/Object;
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: ldc burp/Zza3
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
    //   186: sipush #-3793
    //   189: sipush #9570
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
    //   228: sipush #-3803
    //   231: sipush #-11121
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
    //   387: getstatic burp/Ztg3.Zg : Ljava/lang/Object;
    //   390: checkcast java/math/BigInteger
    //   393: invokevirtual intValue : ()I
    //   396: i2l
    //   397: invokestatic currentTimeMillis : ()J
    //   400: ladd
    //   401: getstatic burp/Zm14.ZZ : Ljava/lang/Object;
    //   404: checkcast java/math/BigInteger
    //   407: invokevirtual intValue : ()I
    //   410: i2l
    //   411: lcmp
    //   412: ifge -> 744
    //   415: sipush #-3797
    //   418: sipush #-28664
    //   421: invokestatic a : (II)Ljava/lang/String;
    //   424: iconst_1
    //   425: ldc burp/Zgny
    //   427: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   430: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   433: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   436: astore_3
    //   437: aload_3
    //   438: arraylength
    //   439: istore #4
    //   441: iconst_0
    //   442: istore #5
    //   444: iload #5
    //   446: iload #4
    //   448: if_icmpge -> 585
    //   451: aload_3
    //   452: iload #5
    //   454: aaload
    //   455: astore #6
    //   457: aload #6
    //   459: invokevirtual getModifiers : ()I
    //   462: invokestatic isStatic : (I)Z
    //   465: ifne -> 475
    //   468: goto -> 578
    //   471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   474: athrow
    //   475: aload #6
    //   477: invokevirtual getType : ()Ljava/lang/Class;
    //   480: astore #7
    //   482: aload #7
    //   484: ifnull -> 565
    //   487: aload #7
    //   489: invokevirtual isPrimitive : ()Z
    //   492: ifne -> 565
    //   495: goto -> 502
    //   498: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   501: athrow
    //   502: aload #7
    //   504: invokevirtual getPackage : ()Ljava/lang/Package;
    //   507: ifnull -> 565
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   516: athrow
    //   517: aload #7
    //   519: invokevirtual getPackage : ()Ljava/lang/Package;
    //   522: invokevirtual getName : ()Ljava/lang/String;
    //   525: ifnull -> 565
    //   528: goto -> 535
    //   531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   534: athrow
    //   535: aload #7
    //   537: invokevirtual getPackage : ()Ljava/lang/Package;
    //   540: invokevirtual getName : ()Ljava/lang/String;
    //   543: sipush #-3788
    //   546: sipush #-1574
    //   549: invokestatic a : (II)Ljava/lang/String;
    //   552: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   555: ifne -> 565
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   564: athrow
    //   565: aload #6
    //   567: iconst_1
    //   568: invokevirtual setAccessible : (Z)V
    //   571: aload #6
    //   573: aconst_null
    //   574: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   577: pop
    //   578: iinc #5, 1
    //   581: iload_2
    //   582: ifne -> 444
    //   585: sipush #-3808
    //   588: sipush #-31954
    //   591: invokestatic a : (II)Ljava/lang/String;
    //   594: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   597: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   600: astore_3
    //   601: aload_3
    //   602: arraylength
    //   603: istore #4
    //   605: iconst_0
    //   606: istore #5
    //   608: iload #5
    //   610: iload #4
    //   612: if_icmpge -> 744
    //   615: aload_3
    //   616: iload #5
    //   618: aaload
    //   619: astore #6
    //   621: aload #6
    //   623: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   626: pop
    //   627: aload #6
    //   629: invokevirtual getModifiers : ()I
    //   632: invokestatic isStatic : (I)Z
    //   635: ifeq -> 730
    //   638: aload #6
    //   640: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   643: arraylength
    //   644: iconst_2
    //   645: if_icmpne -> 730
    //   648: goto -> 655
    //   651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   654: athrow
    //   655: aload #6
    //   657: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   660: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   663: invokevirtual equals : (Ljava/lang/Object;)Z
    //   666: ifeq -> 730
    //   669: goto -> 676
    //   672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   675: athrow
    //   676: aload #6
    //   678: iconst_1
    //   679: invokevirtual setAccessible : (Z)V
    //   682: aload #6
    //   684: aconst_null
    //   685: iconst_2
    //   686: anewarray java/lang/Object
    //   689: dup
    //   690: iconst_0
    //   691: aload_0
    //   692: aastore
    //   693: dup
    //   694: iconst_1
    //   695: aload_1
    //   696: ifnonnull -> 714
    //   699: goto -> 706
    //   702: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   705: athrow
    //   706: aload_1
    //   707: goto -> 721
    //   710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   713: athrow
    //   714: aload_1
    //   715: checkcast [B
    //   718: invokevirtual clone : ()Ljava/lang/Object;
    //   721: aastore
    //   722: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   725: pop
    //   726: iload_2
    //   727: ifne -> 744
    //   730: iinc #5, 1
    //   733: iload_2
    //   734: ifne -> 608
    //   737: goto -> 744
    //   740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   743: athrow
    //   744: iconst_0
    //   745: istore_3
    //   746: getstatic burp/Ztg3.ZM : Ljava/lang/String;
    //   749: getstatic burp/Zl6z.Zt : Ljava/lang/Object;
    //   752: checkcast java/math/BigInteger
    //   755: invokevirtual intValue : ()I
    //   758: bipush #32
    //   760: irem
    //   761: invokestatic abs : (I)I
    //   764: invokevirtual charAt : (I)C
    //   767: getstatic burp/Zza3.ZU : Ljava/lang/String;
    //   770: getstatic burp/Zml2.Zo : Ljava/lang/Object;
    //   773: checkcast java/math/BigInteger
    //   776: invokevirtual intValue : ()I
    //   779: bipush #32
    //   781: irem
    //   782: invokestatic abs : (I)I
    //   785: invokevirtual charAt : (I)C
    //   788: if_icmpgt -> 1132
    //   791: sipush #-3805
    //   794: sipush #13124
    //   797: invokestatic a : (II)Ljava/lang/String;
    //   800: iconst_1
    //   801: ldc burp/Zeu2
    //   803: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   806: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   809: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   812: astore #4
    //   814: aload #4
    //   816: arraylength
    //   817: istore #5
    //   819: iconst_0
    //   820: istore #6
    //   822: iload #6
    //   824: iload #5
    //   826: if_icmpge -> 964
    //   829: aload #4
    //   831: iload #6
    //   833: aaload
    //   834: astore #7
    //   836: aload #7
    //   838: invokevirtual getModifiers : ()I
    //   841: invokestatic isStatic : (I)Z
    //   844: ifne -> 854
    //   847: goto -> 957
    //   850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   853: athrow
    //   854: aload #7
    //   856: invokevirtual getType : ()Ljava/lang/Class;
    //   859: astore #8
    //   861: aload #8
    //   863: ifnull -> 944
    //   866: aload #8
    //   868: invokevirtual isPrimitive : ()Z
    //   871: ifne -> 944
    //   874: goto -> 881
    //   877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   880: athrow
    //   881: aload #8
    //   883: invokevirtual getPackage : ()Ljava/lang/Package;
    //   886: ifnull -> 944
    //   889: goto -> 896
    //   892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   895: athrow
    //   896: aload #8
    //   898: invokevirtual getPackage : ()Ljava/lang/Package;
    //   901: invokevirtual getName : ()Ljava/lang/String;
    //   904: ifnull -> 944
    //   907: goto -> 914
    //   910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   913: athrow
    //   914: aload #8
    //   916: invokevirtual getPackage : ()Ljava/lang/Package;
    //   919: invokevirtual getName : ()Ljava/lang/String;
    //   922: sipush #-3788
    //   925: sipush #-1574
    //   928: invokestatic a : (II)Ljava/lang/String;
    //   931: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   934: ifne -> 944
    //   937: goto -> 944
    //   940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   943: athrow
    //   944: aload #7
    //   946: iconst_1
    //   947: invokevirtual setAccessible : (Z)V
    //   950: aload #7
    //   952: aconst_null
    //   953: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   956: pop
    //   957: iinc #6, 1
    //   960: iload_2
    //   961: ifne -> 822
    //   964: sipush #-3786
    //   967: sipush #7262
    //   970: invokestatic a : (II)Ljava/lang/String;
    //   973: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   976: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   979: astore #4
    //   981: aload #4
    //   983: arraylength
    //   984: istore #5
    //   986: iconst_0
    //   987: istore #6
    //   989: iload #6
    //   991: iload #5
    //   993: if_icmpge -> 1129
    //   996: aload #4
    //   998: iload #6
    //   1000: aaload
    //   1001: astore #7
    //   1003: aload #7
    //   1005: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1008: pop
    //   1009: aload #7
    //   1011: invokevirtual getModifiers : ()I
    //   1014: invokestatic isStatic : (I)Z
    //   1017: ifeq -> 1115
    //   1020: aload #7
    //   1022: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1025: arraylength
    //   1026: iconst_2
    //   1027: if_icmpne -> 1115
    //   1030: goto -> 1037
    //   1033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1036: athrow
    //   1037: aload #7
    //   1039: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1042: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1045: if_acmpne -> 1115
    //   1048: goto -> 1055
    //   1051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1054: athrow
    //   1055: aload #7
    //   1057: iconst_1
    //   1058: invokevirtual setAccessible : (Z)V
    //   1061: aload #7
    //   1063: aconst_null
    //   1064: iconst_2
    //   1065: anewarray java/lang/Object
    //   1068: dup
    //   1069: iconst_0
    //   1070: aload_0
    //   1071: aastore
    //   1072: dup
    //   1073: iconst_1
    //   1074: aload_1
    //   1075: ifnonnull -> 1093
    //   1078: goto -> 1085
    //   1081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1084: athrow
    //   1085: aload_1
    //   1086: goto -> 1100
    //   1089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1092: athrow
    //   1093: aload_1
    //   1094: checkcast [B
    //   1097: invokevirtual clone : ()Ljava/lang/Object;
    //   1100: aastore
    //   1101: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1104: checkcast java/lang/Boolean
    //   1107: invokevirtual booleanValue : ()Z
    //   1110: istore_3
    //   1111: iload_2
    //   1112: ifne -> 1129
    //   1115: iinc #6, 1
    //   1118: iload_2
    //   1119: ifne -> 989
    //   1122: goto -> 1129
    //   1125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1128: athrow
    //   1129: goto -> 1470
    //   1132: sipush #-3782
    //   1135: sipush #7927
    //   1138: invokestatic a : (II)Ljava/lang/String;
    //   1141: iconst_1
    //   1142: ldc burp/Ztkh
    //   1144: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1147: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1150: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1153: astore #4
    //   1155: aload #4
    //   1157: arraylength
    //   1158: istore #5
    //   1160: iconst_0
    //   1161: istore #6
    //   1163: iload #6
    //   1165: iload #5
    //   1167: if_icmpge -> 1305
    //   1170: aload #4
    //   1172: iload #6
    //   1174: aaload
    //   1175: astore #7
    //   1177: aload #7
    //   1179: invokevirtual getModifiers : ()I
    //   1182: invokestatic isStatic : (I)Z
    //   1185: ifne -> 1195
    //   1188: goto -> 1298
    //   1191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1194: athrow
    //   1195: aload #7
    //   1197: invokevirtual getType : ()Ljava/lang/Class;
    //   1200: astore #8
    //   1202: aload #8
    //   1204: ifnull -> 1285
    //   1207: aload #8
    //   1209: invokevirtual isPrimitive : ()Z
    //   1212: ifne -> 1285
    //   1215: goto -> 1222
    //   1218: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1221: athrow
    //   1222: aload #8
    //   1224: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1227: ifnull -> 1285
    //   1230: goto -> 1237
    //   1233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1236: athrow
    //   1237: aload #8
    //   1239: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1242: invokevirtual getName : ()Ljava/lang/String;
    //   1245: ifnull -> 1285
    //   1248: goto -> 1255
    //   1251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1254: athrow
    //   1255: aload #8
    //   1257: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1260: invokevirtual getName : ()Ljava/lang/String;
    //   1263: sipush #-3788
    //   1266: sipush #-1574
    //   1269: invokestatic a : (II)Ljava/lang/String;
    //   1272: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1275: ifne -> 1285
    //   1278: goto -> 1285
    //   1281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1284: athrow
    //   1285: aload #7
    //   1287: iconst_1
    //   1288: invokevirtual setAccessible : (Z)V
    //   1291: aload #7
    //   1293: aconst_null
    //   1294: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1297: pop
    //   1298: iinc #6, 1
    //   1301: iload_2
    //   1302: ifne -> 1163
    //   1305: sipush #-3795
    //   1308: sipush #31926
    //   1311: invokestatic a : (II)Ljava/lang/String;
    //   1314: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1317: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1320: astore #4
    //   1322: aload #4
    //   1324: arraylength
    //   1325: istore #5
    //   1327: iconst_0
    //   1328: istore #6
    //   1330: iload #6
    //   1332: iload #5
    //   1334: if_icmpge -> 1470
    //   1337: aload #4
    //   1339: iload #6
    //   1341: aaload
    //   1342: astore #7
    //   1344: aload #7
    //   1346: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1349: pop
    //   1350: aload #7
    //   1352: invokevirtual getModifiers : ()I
    //   1355: invokestatic isStatic : (I)Z
    //   1358: ifeq -> 1456
    //   1361: aload #7
    //   1363: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1366: arraylength
    //   1367: iconst_2
    //   1368: if_icmpne -> 1456
    //   1371: goto -> 1378
    //   1374: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1377: athrow
    //   1378: aload #7
    //   1380: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1383: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1386: if_acmpne -> 1456
    //   1389: goto -> 1396
    //   1392: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1395: athrow
    //   1396: aload #7
    //   1398: iconst_1
    //   1399: invokevirtual setAccessible : (Z)V
    //   1402: aload #7
    //   1404: aconst_null
    //   1405: iconst_2
    //   1406: anewarray java/lang/Object
    //   1409: dup
    //   1410: iconst_0
    //   1411: aload_0
    //   1412: aastore
    //   1413: dup
    //   1414: iconst_1
    //   1415: aload_1
    //   1416: ifnonnull -> 1434
    //   1419: goto -> 1426
    //   1422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1425: athrow
    //   1426: aload_1
    //   1427: goto -> 1441
    //   1430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1433: athrow
    //   1434: aload_1
    //   1435: checkcast [B
    //   1438: invokevirtual clone : ()Ljava/lang/Object;
    //   1441: aastore
    //   1442: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1445: checkcast java/lang/Boolean
    //   1448: invokevirtual booleanValue : ()Z
    //   1451: istore_3
    //   1452: iload_2
    //   1453: ifne -> 1470
    //   1456: iinc #6, 1
    //   1459: iload_2
    //   1460: ifne -> 1330
    //   1463: goto -> 1470
    //   1466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1469: athrow
    //   1470: iload_3
    //   1471: ifeq -> 1476
    //   1474: iload_3
    //   1475: ireturn
    //   1476: getstatic burp/Zz5l.ZH : Ljava/lang/String;
    //   1479: getstatic burp/Zl8s.ZY : Ljava/lang/Object;
    //   1482: checkcast java/math/BigInteger
    //   1485: invokevirtual intValue : ()I
    //   1488: bipush #32
    //   1490: irem
    //   1491: invokestatic abs : (I)I
    //   1494: invokevirtual charAt : (I)C
    //   1497: getstatic burp/Ztpg.Zr : Ljava/lang/String;
    //   1500: getstatic burp/Zg3m.ZK : Ljava/lang/Object;
    //   1503: checkcast java/math/BigInteger
    //   1506: invokevirtual intValue : ()I
    //   1509: bipush #32
    //   1511: irem
    //   1512: invokestatic abs : (I)I
    //   1515: invokevirtual charAt : (I)C
    //   1518: if_icmple -> 1863
    //   1521: sipush #-3783
    //   1524: sipush #-18880
    //   1527: invokestatic a : (II)Ljava/lang/String;
    //   1530: iconst_1
    //   1531: ldc burp/Ze_l
    //   1533: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1536: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1539: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1542: astore #4
    //   1544: aload #4
    //   1546: arraylength
    //   1547: istore #5
    //   1549: iconst_0
    //   1550: istore #6
    //   1552: iload #6
    //   1554: iload #5
    //   1556: if_icmpge -> 1694
    //   1559: aload #4
    //   1561: iload #6
    //   1563: aaload
    //   1564: astore #7
    //   1566: aload #7
    //   1568: invokevirtual getModifiers : ()I
    //   1571: invokestatic isStatic : (I)Z
    //   1574: ifne -> 1584
    //   1577: goto -> 1687
    //   1580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1583: athrow
    //   1584: aload #7
    //   1586: invokevirtual getType : ()Ljava/lang/Class;
    //   1589: astore #8
    //   1591: aload #8
    //   1593: ifnull -> 1674
    //   1596: aload #8
    //   1598: invokevirtual isPrimitive : ()Z
    //   1601: ifne -> 1674
    //   1604: goto -> 1611
    //   1607: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1610: athrow
    //   1611: aload #8
    //   1613: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1616: ifnull -> 1674
    //   1619: goto -> 1626
    //   1622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1625: athrow
    //   1626: aload #8
    //   1628: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1631: invokevirtual getName : ()Ljava/lang/String;
    //   1634: ifnull -> 1674
    //   1637: goto -> 1644
    //   1640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1643: athrow
    //   1644: aload #8
    //   1646: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1649: invokevirtual getName : ()Ljava/lang/String;
    //   1652: sipush #-3788
    //   1655: sipush #-1574
    //   1658: invokestatic a : (II)Ljava/lang/String;
    //   1661: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1664: ifne -> 1674
    //   1667: goto -> 1674
    //   1670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1673: athrow
    //   1674: aload #7
    //   1676: iconst_1
    //   1677: invokevirtual setAccessible : (Z)V
    //   1680: aload #7
    //   1682: aconst_null
    //   1683: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1686: pop
    //   1687: iinc #6, 1
    //   1690: iload_2
    //   1691: ifne -> 1552
    //   1694: sipush #-3799
    //   1697: sipush #-22117
    //   1700: invokestatic a : (II)Ljava/lang/String;
    //   1703: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1706: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1709: astore #4
    //   1711: aload #4
    //   1713: arraylength
    //   1714: istore #5
    //   1716: iconst_0
    //   1717: istore #6
    //   1719: iload #6
    //   1721: iload #5
    //   1723: if_icmpge -> 1859
    //   1726: aload #4
    //   1728: iload #6
    //   1730: aaload
    //   1731: astore #7
    //   1733: aload #7
    //   1735: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1738: pop
    //   1739: aload #7
    //   1741: invokevirtual getModifiers : ()I
    //   1744: invokestatic isStatic : (I)Z
    //   1747: ifeq -> 1845
    //   1750: aload #7
    //   1752: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1755: arraylength
    //   1756: iconst_2
    //   1757: if_icmpne -> 1845
    //   1760: goto -> 1767
    //   1763: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1766: athrow
    //   1767: aload #7
    //   1769: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1772: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1775: if_acmpne -> 1845
    //   1778: goto -> 1785
    //   1781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1784: athrow
    //   1785: aload #7
    //   1787: iconst_1
    //   1788: invokevirtual setAccessible : (Z)V
    //   1791: aload #7
    //   1793: aconst_null
    //   1794: iconst_2
    //   1795: anewarray java/lang/Object
    //   1798: dup
    //   1799: iconst_0
    //   1800: aload_0
    //   1801: aastore
    //   1802: dup
    //   1803: iconst_1
    //   1804: aload_1
    //   1805: ifnonnull -> 1823
    //   1808: goto -> 1815
    //   1811: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1814: athrow
    //   1815: aload_1
    //   1816: goto -> 1830
    //   1819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1822: athrow
    //   1823: aload_1
    //   1824: checkcast [B
    //   1827: invokevirtual clone : ()Ljava/lang/Object;
    //   1830: aastore
    //   1831: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1834: checkcast java/lang/Boolean
    //   1837: invokevirtual booleanValue : ()Z
    //   1840: istore_3
    //   1841: iload_2
    //   1842: ifne -> 1859
    //   1845: iinc #6, 1
    //   1848: iload_2
    //   1849: ifne -> 1719
    //   1852: goto -> 1859
    //   1855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1858: athrow
    //   1859: iload_2
    //   1860: ifne -> 2201
    //   1863: sipush #-3802
    //   1866: sipush #3590
    //   1869: invokestatic a : (II)Ljava/lang/String;
    //   1872: iconst_1
    //   1873: ldc burp/Zl8i
    //   1875: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1878: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1881: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1884: astore #4
    //   1886: aload #4
    //   1888: arraylength
    //   1889: istore #5
    //   1891: iconst_0
    //   1892: istore #6
    //   1894: iload #6
    //   1896: iload #5
    //   1898: if_icmpge -> 2036
    //   1901: aload #4
    //   1903: iload #6
    //   1905: aaload
    //   1906: astore #7
    //   1908: aload #7
    //   1910: invokevirtual getModifiers : ()I
    //   1913: invokestatic isStatic : (I)Z
    //   1916: ifne -> 1926
    //   1919: goto -> 2029
    //   1922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1925: athrow
    //   1926: aload #7
    //   1928: invokevirtual getType : ()Ljava/lang/Class;
    //   1931: astore #8
    //   1933: aload #8
    //   1935: ifnull -> 2016
    //   1938: aload #8
    //   1940: invokevirtual isPrimitive : ()Z
    //   1943: ifne -> 2016
    //   1946: goto -> 1953
    //   1949: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1952: athrow
    //   1953: aload #8
    //   1955: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1958: ifnull -> 2016
    //   1961: goto -> 1968
    //   1964: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1967: athrow
    //   1968: aload #8
    //   1970: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1973: invokevirtual getName : ()Ljava/lang/String;
    //   1976: ifnull -> 2016
    //   1979: goto -> 1986
    //   1982: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1985: athrow
    //   1986: aload #8
    //   1988: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1991: invokevirtual getName : ()Ljava/lang/String;
    //   1994: sipush #-3788
    //   1997: sipush #-1574
    //   2000: invokestatic a : (II)Ljava/lang/String;
    //   2003: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2006: ifne -> 2016
    //   2009: goto -> 2016
    //   2012: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2015: athrow
    //   2016: aload #7
    //   2018: iconst_1
    //   2019: invokevirtual setAccessible : (Z)V
    //   2022: aload #7
    //   2024: aconst_null
    //   2025: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2028: pop
    //   2029: iinc #6, 1
    //   2032: iload_2
    //   2033: ifne -> 1894
    //   2036: sipush #-3796
    //   2039: sipush #9577
    //   2042: invokestatic a : (II)Ljava/lang/String;
    //   2045: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2048: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2051: astore #4
    //   2053: aload #4
    //   2055: arraylength
    //   2056: istore #5
    //   2058: iconst_0
    //   2059: istore #6
    //   2061: iload #6
    //   2063: iload #5
    //   2065: if_icmpge -> 2201
    //   2068: aload #4
    //   2070: iload #6
    //   2072: aaload
    //   2073: astore #7
    //   2075: aload #7
    //   2077: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2080: pop
    //   2081: aload #7
    //   2083: invokevirtual getModifiers : ()I
    //   2086: invokestatic isStatic : (I)Z
    //   2089: ifeq -> 2187
    //   2092: aload #7
    //   2094: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2097: arraylength
    //   2098: iconst_2
    //   2099: if_icmpne -> 2187
    //   2102: goto -> 2109
    //   2105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2108: athrow
    //   2109: aload #7
    //   2111: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2114: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2117: if_acmpne -> 2187
    //   2120: goto -> 2127
    //   2123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2126: athrow
    //   2127: aload #7
    //   2129: iconst_1
    //   2130: invokevirtual setAccessible : (Z)V
    //   2133: aload #7
    //   2135: aconst_null
    //   2136: iconst_2
    //   2137: anewarray java/lang/Object
    //   2140: dup
    //   2141: iconst_0
    //   2142: aload_0
    //   2143: aastore
    //   2144: dup
    //   2145: iconst_1
    //   2146: aload_1
    //   2147: ifnonnull -> 2165
    //   2150: goto -> 2157
    //   2153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2156: athrow
    //   2157: aload_1
    //   2158: goto -> 2172
    //   2161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2164: athrow
    //   2165: aload_1
    //   2166: checkcast [B
    //   2169: invokevirtual clone : ()Ljava/lang/Object;
    //   2172: aastore
    //   2173: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2176: checkcast java/lang/Boolean
    //   2179: invokevirtual booleanValue : ()Z
    //   2182: istore_3
    //   2183: iload_2
    //   2184: ifne -> 2201
    //   2187: iinc #6, 1
    //   2190: iload_2
    //   2191: ifne -> 2061
    //   2194: goto -> 2201
    //   2197: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2200: athrow
    //   2201: iload_3
    //   2202: ifeq -> 2207
    //   2205: iload_3
    //   2206: ireturn
    //   2207: getstatic burp/Zl5.ZE : Ljava/lang/String;
    //   2210: getstatic burp/Zevc.Zm : Ljava/lang/Object;
    //   2213: checkcast java/math/BigInteger
    //   2216: invokevirtual intValue : ()I
    //   2219: bipush #32
    //   2221: irem
    //   2222: invokestatic abs : (I)I
    //   2225: invokevirtual charAt : (I)C
    //   2228: getstatic burp/Zrx5.ZD : Ljava/lang/String;
    //   2231: getstatic burp/Zszm.ZI : Ljava/lang/Object;
    //   2234: checkcast java/math/BigInteger
    //   2237: invokevirtual intValue : ()I
    //   2240: bipush #32
    //   2242: irem
    //   2243: invokestatic abs : (I)I
    //   2246: invokevirtual charAt : (I)C
    //   2249: if_icmple -> 2594
    //   2252: sipush #-3778
    //   2255: sipush #-1960
    //   2258: invokestatic a : (II)Ljava/lang/String;
    //   2261: iconst_1
    //   2262: ldc burp/Zbo7
    //   2264: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2267: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2270: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2273: astore #4
    //   2275: aload #4
    //   2277: arraylength
    //   2278: istore #5
    //   2280: iconst_0
    //   2281: istore #6
    //   2283: iload #6
    //   2285: iload #5
    //   2287: if_icmpge -> 2425
    //   2290: aload #4
    //   2292: iload #6
    //   2294: aaload
    //   2295: astore #7
    //   2297: aload #7
    //   2299: invokevirtual getModifiers : ()I
    //   2302: invokestatic isStatic : (I)Z
    //   2305: ifne -> 2315
    //   2308: goto -> 2418
    //   2311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2314: athrow
    //   2315: aload #7
    //   2317: invokevirtual getType : ()Ljava/lang/Class;
    //   2320: astore #8
    //   2322: aload #8
    //   2324: ifnull -> 2405
    //   2327: aload #8
    //   2329: invokevirtual isPrimitive : ()Z
    //   2332: ifne -> 2405
    //   2335: goto -> 2342
    //   2338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2341: athrow
    //   2342: aload #8
    //   2344: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2347: ifnull -> 2405
    //   2350: goto -> 2357
    //   2353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2356: athrow
    //   2357: aload #8
    //   2359: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2362: invokevirtual getName : ()Ljava/lang/String;
    //   2365: ifnull -> 2405
    //   2368: goto -> 2375
    //   2371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2374: athrow
    //   2375: aload #8
    //   2377: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2380: invokevirtual getName : ()Ljava/lang/String;
    //   2383: sipush #-3788
    //   2386: sipush #-1574
    //   2389: invokestatic a : (II)Ljava/lang/String;
    //   2392: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2395: ifne -> 2405
    //   2398: goto -> 2405
    //   2401: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2404: athrow
    //   2405: aload #7
    //   2407: iconst_1
    //   2408: invokevirtual setAccessible : (Z)V
    //   2411: aload #7
    //   2413: aconst_null
    //   2414: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2417: pop
    //   2418: iinc #6, 1
    //   2421: iload_2
    //   2422: ifne -> 2283
    //   2425: sipush #-3784
    //   2428: sipush #25994
    //   2431: invokestatic a : (II)Ljava/lang/String;
    //   2434: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2437: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2440: astore #4
    //   2442: aload #4
    //   2444: arraylength
    //   2445: istore #5
    //   2447: iconst_0
    //   2448: istore #6
    //   2450: iload #6
    //   2452: iload #5
    //   2454: if_icmpge -> 2590
    //   2457: aload #4
    //   2459: iload #6
    //   2461: aaload
    //   2462: astore #7
    //   2464: aload #7
    //   2466: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2469: pop
    //   2470: aload #7
    //   2472: invokevirtual getModifiers : ()I
    //   2475: invokestatic isStatic : (I)Z
    //   2478: ifeq -> 2576
    //   2481: aload #7
    //   2483: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2486: arraylength
    //   2487: iconst_2
    //   2488: if_icmpne -> 2576
    //   2491: goto -> 2498
    //   2494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2497: athrow
    //   2498: aload #7
    //   2500: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2503: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2506: if_acmpne -> 2576
    //   2509: goto -> 2516
    //   2512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2515: athrow
    //   2516: aload #7
    //   2518: iconst_1
    //   2519: invokevirtual setAccessible : (Z)V
    //   2522: aload #7
    //   2524: aconst_null
    //   2525: iconst_2
    //   2526: anewarray java/lang/Object
    //   2529: dup
    //   2530: iconst_0
    //   2531: aload_0
    //   2532: aastore
    //   2533: dup
    //   2534: iconst_1
    //   2535: aload_1
    //   2536: ifnonnull -> 2554
    //   2539: goto -> 2546
    //   2542: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2545: athrow
    //   2546: aload_1
    //   2547: goto -> 2561
    //   2550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2553: athrow
    //   2554: aload_1
    //   2555: checkcast [B
    //   2558: invokevirtual clone : ()Ljava/lang/Object;
    //   2561: aastore
    //   2562: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2565: checkcast java/lang/Boolean
    //   2568: invokevirtual booleanValue : ()Z
    //   2571: istore_3
    //   2572: iload_2
    //   2573: ifne -> 2590
    //   2576: iinc #6, 1
    //   2579: iload_2
    //   2580: ifne -> 2450
    //   2583: goto -> 2590
    //   2586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2589: athrow
    //   2590: iload_2
    //   2591: ifne -> 2932
    //   2594: sipush #-3777
    //   2597: sipush #-27199
    //   2600: invokestatic a : (II)Ljava/lang/String;
    //   2603: iconst_1
    //   2604: ldc burp/Zmrc
    //   2606: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2609: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2612: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2615: astore #4
    //   2617: aload #4
    //   2619: arraylength
    //   2620: istore #5
    //   2622: iconst_0
    //   2623: istore #6
    //   2625: iload #6
    //   2627: iload #5
    //   2629: if_icmpge -> 2767
    //   2632: aload #4
    //   2634: iload #6
    //   2636: aaload
    //   2637: astore #7
    //   2639: aload #7
    //   2641: invokevirtual getModifiers : ()I
    //   2644: invokestatic isStatic : (I)Z
    //   2647: ifne -> 2657
    //   2650: goto -> 2760
    //   2653: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2656: athrow
    //   2657: aload #7
    //   2659: invokevirtual getType : ()Ljava/lang/Class;
    //   2662: astore #8
    //   2664: aload #8
    //   2666: ifnull -> 2747
    //   2669: aload #8
    //   2671: invokevirtual isPrimitive : ()Z
    //   2674: ifne -> 2747
    //   2677: goto -> 2684
    //   2680: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2683: athrow
    //   2684: aload #8
    //   2686: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2689: ifnull -> 2747
    //   2692: goto -> 2699
    //   2695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2698: athrow
    //   2699: aload #8
    //   2701: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2704: invokevirtual getName : ()Ljava/lang/String;
    //   2707: ifnull -> 2747
    //   2710: goto -> 2717
    //   2713: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2716: athrow
    //   2717: aload #8
    //   2719: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2722: invokevirtual getName : ()Ljava/lang/String;
    //   2725: sipush #-3788
    //   2728: sipush #-1574
    //   2731: invokestatic a : (II)Ljava/lang/String;
    //   2734: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2737: ifne -> 2747
    //   2740: goto -> 2747
    //   2743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2746: athrow
    //   2747: aload #7
    //   2749: iconst_1
    //   2750: invokevirtual setAccessible : (Z)V
    //   2753: aload #7
    //   2755: aconst_null
    //   2756: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2759: pop
    //   2760: iinc #6, 1
    //   2763: iload_2
    //   2764: ifne -> 2625
    //   2767: sipush #-3804
    //   2770: sipush #-1401
    //   2773: invokestatic a : (II)Ljava/lang/String;
    //   2776: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2779: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2782: astore #4
    //   2784: aload #4
    //   2786: arraylength
    //   2787: istore #5
    //   2789: iconst_0
    //   2790: istore #6
    //   2792: iload #6
    //   2794: iload #5
    //   2796: if_icmpge -> 2932
    //   2799: aload #4
    //   2801: iload #6
    //   2803: aaload
    //   2804: astore #7
    //   2806: aload #7
    //   2808: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2811: pop
    //   2812: aload #7
    //   2814: invokevirtual getModifiers : ()I
    //   2817: invokestatic isStatic : (I)Z
    //   2820: ifeq -> 2918
    //   2823: aload #7
    //   2825: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2828: arraylength
    //   2829: iconst_2
    //   2830: if_icmpne -> 2918
    //   2833: goto -> 2840
    //   2836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2839: athrow
    //   2840: aload #7
    //   2842: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2845: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2848: if_acmpne -> 2918
    //   2851: goto -> 2858
    //   2854: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2857: athrow
    //   2858: aload #7
    //   2860: iconst_1
    //   2861: invokevirtual setAccessible : (Z)V
    //   2864: aload #7
    //   2866: aconst_null
    //   2867: iconst_2
    //   2868: anewarray java/lang/Object
    //   2871: dup
    //   2872: iconst_0
    //   2873: aload_0
    //   2874: aastore
    //   2875: dup
    //   2876: iconst_1
    //   2877: aload_1
    //   2878: ifnonnull -> 2896
    //   2881: goto -> 2888
    //   2884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2887: athrow
    //   2888: aload_1
    //   2889: goto -> 2903
    //   2892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2895: athrow
    //   2896: aload_1
    //   2897: checkcast [B
    //   2900: invokevirtual clone : ()Ljava/lang/Object;
    //   2903: aastore
    //   2904: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2907: checkcast java/lang/Boolean
    //   2910: invokevirtual booleanValue : ()Z
    //   2913: istore_3
    //   2914: iload_2
    //   2915: ifne -> 2932
    //   2918: iinc #6, 1
    //   2921: iload_2
    //   2922: ifne -> 2792
    //   2925: goto -> 2932
    //   2928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2931: athrow
    //   2932: iload_3
    //   2933: ifeq -> 2938
    //   2936: iload_3
    //   2937: ireturn
    //   2938: getstatic burp/Zs56.ZW : Ljava/lang/String;
    //   2941: getstatic burp/Zmec.ZY : Ljava/lang/Object;
    //   2944: checkcast java/math/BigInteger
    //   2947: invokevirtual intValue : ()I
    //   2950: bipush #32
    //   2952: irem
    //   2953: invokestatic abs : (I)I
    //   2956: invokevirtual charAt : (I)C
    //   2959: getstatic burp/Zrct.ZT : Ljava/lang/String;
    //   2962: getstatic burp/Zefn.ZJ : Ljava/lang/Object;
    //   2965: checkcast java/math/BigInteger
    //   2968: invokevirtual intValue : ()I
    //   2971: bipush #32
    //   2973: irem
    //   2974: invokestatic abs : (I)I
    //   2977: invokevirtual charAt : (I)C
    //   2980: if_icmpgt -> 3325
    //   2983: sipush #-3779
    //   2986: sipush #2273
    //   2989: invokestatic a : (II)Ljava/lang/String;
    //   2992: iconst_1
    //   2993: ldc burp/Zmze
    //   2995: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2998: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3001: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3004: astore #4
    //   3006: aload #4
    //   3008: arraylength
    //   3009: istore #5
    //   3011: iconst_0
    //   3012: istore #6
    //   3014: iload #6
    //   3016: iload #5
    //   3018: if_icmpge -> 3156
    //   3021: aload #4
    //   3023: iload #6
    //   3025: aaload
    //   3026: astore #7
    //   3028: aload #7
    //   3030: invokevirtual getModifiers : ()I
    //   3033: invokestatic isStatic : (I)Z
    //   3036: ifne -> 3046
    //   3039: goto -> 3149
    //   3042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3045: athrow
    //   3046: aload #7
    //   3048: invokevirtual getType : ()Ljava/lang/Class;
    //   3051: astore #8
    //   3053: aload #8
    //   3055: ifnull -> 3136
    //   3058: aload #8
    //   3060: invokevirtual isPrimitive : ()Z
    //   3063: ifne -> 3136
    //   3066: goto -> 3073
    //   3069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3072: athrow
    //   3073: aload #8
    //   3075: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3078: ifnull -> 3136
    //   3081: goto -> 3088
    //   3084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3087: athrow
    //   3088: aload #8
    //   3090: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3093: invokevirtual getName : ()Ljava/lang/String;
    //   3096: ifnull -> 3136
    //   3099: goto -> 3106
    //   3102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3105: athrow
    //   3106: aload #8
    //   3108: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3111: invokevirtual getName : ()Ljava/lang/String;
    //   3114: sipush #-3788
    //   3117: sipush #-1574
    //   3120: invokestatic a : (II)Ljava/lang/String;
    //   3123: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3126: ifne -> 3136
    //   3129: goto -> 3136
    //   3132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3135: athrow
    //   3136: aload #7
    //   3138: iconst_1
    //   3139: invokevirtual setAccessible : (Z)V
    //   3142: aload #7
    //   3144: aconst_null
    //   3145: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3148: pop
    //   3149: iinc #6, 1
    //   3152: iload_2
    //   3153: ifne -> 3014
    //   3156: sipush #-3781
    //   3159: sipush #-29845
    //   3162: invokestatic a : (II)Ljava/lang/String;
    //   3165: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3168: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3171: astore #4
    //   3173: aload #4
    //   3175: arraylength
    //   3176: istore #5
    //   3178: iconst_0
    //   3179: istore #6
    //   3181: iload #6
    //   3183: iload #5
    //   3185: if_icmpge -> 3321
    //   3188: aload #4
    //   3190: iload #6
    //   3192: aaload
    //   3193: astore #7
    //   3195: aload #7
    //   3197: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3200: pop
    //   3201: aload #7
    //   3203: invokevirtual getModifiers : ()I
    //   3206: invokestatic isStatic : (I)Z
    //   3209: ifeq -> 3307
    //   3212: aload #7
    //   3214: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3217: arraylength
    //   3218: iconst_2
    //   3219: if_icmpne -> 3307
    //   3222: goto -> 3229
    //   3225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3228: athrow
    //   3229: aload #7
    //   3231: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3234: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3237: if_acmpne -> 3307
    //   3240: goto -> 3247
    //   3243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3246: athrow
    //   3247: aload #7
    //   3249: iconst_1
    //   3250: invokevirtual setAccessible : (Z)V
    //   3253: aload #7
    //   3255: aconst_null
    //   3256: iconst_2
    //   3257: anewarray java/lang/Object
    //   3260: dup
    //   3261: iconst_0
    //   3262: aload_0
    //   3263: aastore
    //   3264: dup
    //   3265: iconst_1
    //   3266: aload_1
    //   3267: ifnonnull -> 3285
    //   3270: goto -> 3277
    //   3273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3276: athrow
    //   3277: aload_1
    //   3278: goto -> 3292
    //   3281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3284: athrow
    //   3285: aload_1
    //   3286: checkcast [B
    //   3289: invokevirtual clone : ()Ljava/lang/Object;
    //   3292: aastore
    //   3293: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3296: checkcast java/lang/Boolean
    //   3299: invokevirtual booleanValue : ()Z
    //   3302: istore_3
    //   3303: iload_2
    //   3304: ifne -> 3321
    //   3307: iinc #6, 1
    //   3310: iload_2
    //   3311: ifne -> 3181
    //   3314: goto -> 3321
    //   3317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3320: athrow
    //   3321: iload_2
    //   3322: ifne -> 3663
    //   3325: sipush #-3787
    //   3328: sipush #4074
    //   3331: invokestatic a : (II)Ljava/lang/String;
    //   3334: iconst_1
    //   3335: ldc burp/Zxc
    //   3337: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3340: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3343: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3346: astore #4
    //   3348: aload #4
    //   3350: arraylength
    //   3351: istore #5
    //   3353: iconst_0
    //   3354: istore #6
    //   3356: iload #6
    //   3358: iload #5
    //   3360: if_icmpge -> 3498
    //   3363: aload #4
    //   3365: iload #6
    //   3367: aaload
    //   3368: astore #7
    //   3370: aload #7
    //   3372: invokevirtual getModifiers : ()I
    //   3375: invokestatic isStatic : (I)Z
    //   3378: ifne -> 3388
    //   3381: goto -> 3491
    //   3384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3387: athrow
    //   3388: aload #7
    //   3390: invokevirtual getType : ()Ljava/lang/Class;
    //   3393: astore #8
    //   3395: aload #8
    //   3397: ifnull -> 3478
    //   3400: aload #8
    //   3402: invokevirtual isPrimitive : ()Z
    //   3405: ifne -> 3478
    //   3408: goto -> 3415
    //   3411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3414: athrow
    //   3415: aload #8
    //   3417: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3420: ifnull -> 3478
    //   3423: goto -> 3430
    //   3426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3429: athrow
    //   3430: aload #8
    //   3432: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3435: invokevirtual getName : ()Ljava/lang/String;
    //   3438: ifnull -> 3478
    //   3441: goto -> 3448
    //   3444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3447: athrow
    //   3448: aload #8
    //   3450: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3453: invokevirtual getName : ()Ljava/lang/String;
    //   3456: sipush #-3788
    //   3459: sipush #-1574
    //   3462: invokestatic a : (II)Ljava/lang/String;
    //   3465: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3468: ifne -> 3478
    //   3471: goto -> 3478
    //   3474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3477: athrow
    //   3478: aload #7
    //   3480: iconst_1
    //   3481: invokevirtual setAccessible : (Z)V
    //   3484: aload #7
    //   3486: aconst_null
    //   3487: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3490: pop
    //   3491: iinc #6, 1
    //   3494: iload_2
    //   3495: ifne -> 3356
    //   3498: sipush #-3800
    //   3501: sipush #-28159
    //   3504: invokestatic a : (II)Ljava/lang/String;
    //   3507: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3510: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3513: astore #4
    //   3515: aload #4
    //   3517: arraylength
    //   3518: istore #5
    //   3520: iconst_0
    //   3521: istore #6
    //   3523: iload #6
    //   3525: iload #5
    //   3527: if_icmpge -> 3663
    //   3530: aload #4
    //   3532: iload #6
    //   3534: aaload
    //   3535: astore #7
    //   3537: aload #7
    //   3539: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3542: pop
    //   3543: aload #7
    //   3545: invokevirtual getModifiers : ()I
    //   3548: invokestatic isStatic : (I)Z
    //   3551: ifeq -> 3649
    //   3554: aload #7
    //   3556: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3559: arraylength
    //   3560: iconst_2
    //   3561: if_icmpne -> 3649
    //   3564: goto -> 3571
    //   3567: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3570: athrow
    //   3571: aload #7
    //   3573: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3576: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3579: if_acmpne -> 3649
    //   3582: goto -> 3589
    //   3585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3588: athrow
    //   3589: aload #7
    //   3591: iconst_1
    //   3592: invokevirtual setAccessible : (Z)V
    //   3595: aload #7
    //   3597: aconst_null
    //   3598: iconst_2
    //   3599: anewarray java/lang/Object
    //   3602: dup
    //   3603: iconst_0
    //   3604: aload_0
    //   3605: aastore
    //   3606: dup
    //   3607: iconst_1
    //   3608: aload_1
    //   3609: ifnonnull -> 3627
    //   3612: goto -> 3619
    //   3615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3618: athrow
    //   3619: aload_1
    //   3620: goto -> 3634
    //   3623: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3626: athrow
    //   3627: aload_1
    //   3628: checkcast [B
    //   3631: invokevirtual clone : ()Ljava/lang/Object;
    //   3634: aastore
    //   3635: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3638: checkcast java/lang/Boolean
    //   3641: invokevirtual booleanValue : ()Z
    //   3644: istore_3
    //   3645: iload_2
    //   3646: ifne -> 3663
    //   3649: iinc #6, 1
    //   3652: iload_2
    //   3653: ifne -> 3523
    //   3656: goto -> 3663
    //   3659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3662: athrow
    //   3663: iload_3
    //   3664: ireturn
    //   3665: astore_3
    //   3666: new java/lang/Exception
    //   3669: dup
    //   3670: aload_3
    //   3671: invokevirtual getMessage : ()Ljava/lang/String;
    //   3674: invokespecial <init> : (Ljava/lang/String;)V
    //   3677: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1475	3665	java/lang/Throwable
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
    //   457	471	471	java/lang/Throwable
    //   482	495	498	java/lang/Throwable
    //   487	510	513	java/lang/Throwable
    //   502	528	531	java/lang/Throwable
    //   517	558	561	java/lang/Throwable
    //   621	648	651	java/lang/Throwable
    //   638	669	672	java/lang/Throwable
    //   655	699	702	java/lang/Throwable
    //   676	710	710	java/lang/Throwable
    //   721	737	740	java/lang/Throwable
    //   836	850	850	java/lang/Throwable
    //   861	874	877	java/lang/Throwable
    //   866	889	892	java/lang/Throwable
    //   881	907	910	java/lang/Throwable
    //   896	937	940	java/lang/Throwable
    //   1003	1030	1033	java/lang/Throwable
    //   1020	1048	1051	java/lang/Throwable
    //   1037	1078	1081	java/lang/Throwable
    //   1055	1089	1089	java/lang/Throwable
    //   1111	1122	1125	java/lang/Throwable
    //   1177	1191	1191	java/lang/Throwable
    //   1202	1215	1218	java/lang/Throwable
    //   1207	1230	1233	java/lang/Throwable
    //   1222	1248	1251	java/lang/Throwable
    //   1237	1278	1281	java/lang/Throwable
    //   1344	1371	1374	java/lang/Throwable
    //   1361	1389	1392	java/lang/Throwable
    //   1378	1419	1422	java/lang/Throwable
    //   1396	1430	1430	java/lang/Throwable
    //   1452	1463	1466	java/lang/Throwable
    //   1476	2206	3665	java/lang/Throwable
    //   1566	1580	1580	java/lang/Throwable
    //   1591	1604	1607	java/lang/Throwable
    //   1596	1619	1622	java/lang/Throwable
    //   1611	1637	1640	java/lang/Throwable
    //   1626	1667	1670	java/lang/Throwable
    //   1733	1760	1763	java/lang/Throwable
    //   1750	1778	1781	java/lang/Throwable
    //   1767	1808	1811	java/lang/Throwable
    //   1785	1819	1819	java/lang/Throwable
    //   1841	1852	1855	java/lang/Throwable
    //   1908	1922	1922	java/lang/Throwable
    //   1933	1946	1949	java/lang/Throwable
    //   1938	1961	1964	java/lang/Throwable
    //   1953	1979	1982	java/lang/Throwable
    //   1968	2009	2012	java/lang/Throwable
    //   2075	2102	2105	java/lang/Throwable
    //   2092	2120	2123	java/lang/Throwable
    //   2109	2150	2153	java/lang/Throwable
    //   2127	2161	2161	java/lang/Throwable
    //   2183	2194	2197	java/lang/Throwable
    //   2207	2937	3665	java/lang/Throwable
    //   2297	2311	2311	java/lang/Throwable
    //   2322	2335	2338	java/lang/Throwable
    //   2327	2350	2353	java/lang/Throwable
    //   2342	2368	2371	java/lang/Throwable
    //   2357	2398	2401	java/lang/Throwable
    //   2464	2491	2494	java/lang/Throwable
    //   2481	2509	2512	java/lang/Throwable
    //   2498	2539	2542	java/lang/Throwable
    //   2516	2550	2550	java/lang/Throwable
    //   2572	2583	2586	java/lang/Throwable
    //   2639	2653	2653	java/lang/Throwable
    //   2664	2677	2680	java/lang/Throwable
    //   2669	2692	2695	java/lang/Throwable
    //   2684	2710	2713	java/lang/Throwable
    //   2699	2740	2743	java/lang/Throwable
    //   2806	2833	2836	java/lang/Throwable
    //   2823	2851	2854	java/lang/Throwable
    //   2840	2881	2884	java/lang/Throwable
    //   2858	2892	2892	java/lang/Throwable
    //   2914	2925	2928	java/lang/Throwable
    //   2938	3664	3665	java/lang/Throwable
    //   3028	3042	3042	java/lang/Throwable
    //   3053	3066	3069	java/lang/Throwable
    //   3058	3081	3084	java/lang/Throwable
    //   3073	3099	3102	java/lang/Throwable
    //   3088	3129	3132	java/lang/Throwable
    //   3195	3222	3225	java/lang/Throwable
    //   3212	3240	3243	java/lang/Throwable
    //   3229	3270	3273	java/lang/Throwable
    //   3247	3281	3281	java/lang/Throwable
    //   3303	3314	3317	java/lang/Throwable
    //   3370	3384	3384	java/lang/Throwable
    //   3395	3408	3411	java/lang/Throwable
    //   3400	3423	3426	java/lang/Throwable
    //   3415	3441	3444	java/lang/Throwable
    //   3430	3471	3474	java/lang/Throwable
    //   3537	3564	3567	java/lang/Throwable
    //   3554	3582	3585	java/lang/Throwable
    //   3571	3612	3615	java/lang/Throwable
    //   3589	3623	3623	java/lang/Throwable
    //   3645	3656	3659	java/lang/Throwable
  }
  
  static void ZX(Object paramObject) {
    Zzh9.ZF = a(-3780, -29334);
    Zzh9.Zv = new BigInteger(a(-3807, 31279));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zsot.Zb.charAt(Math.abs(((BigInteger)Zzh9.Zv).intValue() % 32)) > Zrct.ZT.charAt(Math.abs(((BigInteger)Zth8.Zk).intValue() % 32))) {
          try {
            Zl3n.Zz(Class.forName(a(-3798, -7800)));
            if (!bool)
              Zl8s.ZG(Class.forName(a(-3794, 23889))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zl8s.ZG(Class.forName(a(-3794, 23889)));
    } catch (Throwable throwable) {}
  }
  
  static void Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'B~Ïêò+\\b©ÔåE·u4\\tkL[öNÕf©e\\r\\tçCÊ|éBán\\tÜ­M¢Ù\\tÆ¤îëøvÓ>\\t_ÝìYø\\tNúÿ Ú6í\\t4Â°'3ï¼V\\tä×ªp»Ã£A\\tðã( kÞ\\t-ù@W'ëßM?K+uøfrÀÆNç¸¹%Ì\\r[$vAçvxHÖ^5&áb'k5(/åxíI³Æd\\rgÊuÔøe3÷o¡d¥ÕuM]B BúJ<!ÄáÛ5¡VpHF| ××Y©ZOüßÕ\\tÿÕÉÅ³W§´ dÉë!\\tÃ¢îµ[qprê=7tGwvöå\\r\\bNç¶ÙÝée\\t3¨Pj/F6B9\\t<k±I®öË\\tz®yª\\n^A­\\tFÇþúû§a\\tû (ç\\t5.º7\5\G¸¬!ê'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #86
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
    //   68: ldc 'Â%§Ê´ß\\tð\\tcâßÆî'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #92
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
    //   129: putstatic burp/Zm14.a : [Ljava/lang/String;
    //   132: bipush #27
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zm14.b : [Ljava/lang/String;
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
    //   212: bipush #84
    //   214: goto -> 244
    //   217: bipush #120
    //   219: goto -> 244
    //   222: bipush #124
    //   224: goto -> 244
    //   227: bipush #71
    //   229: goto -> 244
    //   232: bipush #36
    //   234: goto -> 244
    //   237: bipush #91
    //   239: goto -> 244
    //   242: bipush #76
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
    //   300: sipush #-3806
    //   303: sipush #-11925
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zm14.ZE : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #79
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #30
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-99
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-10
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #89
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-128
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #-126
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #69
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #119
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-115
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #70
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #36
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-40
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-3
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #42
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: iconst_3
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-17
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-97
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #-58
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #33
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #34
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #-83
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #-81
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #120
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #16
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-119
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #-48
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #-82
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #-96
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-51
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #27
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #81
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zm14.ZZ : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF12C) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm14.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */