package burp;

import java.math.BigInteger;

class Zlp7 extends ClassLoader {
  static Object ZM;
  
  static String ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zp(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zs4v.ZB : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zlem.ZI : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zsun.ZP : Ljava/lang/Object;
    //   22: sipush #-27512
    //   25: sipush #16571
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zlzo
    //   34: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   37: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   40: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   43: astore_3
    //   44: aload_3
    //   45: arraylength
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iload #5
    //   53: iload #4
    //   55: if_icmpge -> 192
    //   58: aload_3
    //   59: iload #5
    //   61: aaload
    //   62: astore #6
    //   64: aload #6
    //   66: invokevirtual getModifiers : ()I
    //   69: invokestatic isStatic : (I)Z
    //   72: ifne -> 82
    //   75: goto -> 185
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: aload #6
    //   84: invokevirtual getType : ()Ljava/lang/Class;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 172
    //   94: aload #7
    //   96: invokevirtual isPrimitive : ()Z
    //   99: ifne -> 172
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   108: athrow
    //   109: aload #7
    //   111: invokevirtual getPackage : ()Ljava/lang/Package;
    //   114: ifnull -> 172
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: invokevirtual getName : ()Ljava/lang/String;
    //   132: ifnull -> 172
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: sipush #-27516
    //   153: sipush #-30283
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   162: ifne -> 172
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   171: athrow
    //   172: aload #6
    //   174: iconst_1
    //   175: invokevirtual setAccessible : (Z)V
    //   178: aload #6
    //   180: aconst_null
    //   181: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: iinc #5, 1
    //   188: iload_2
    //   189: ifne -> 51
    //   192: sipush #-27514
    //   195: sipush #-30078
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   204: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   207: astore_3
    //   208: aload_3
    //   209: arraylength
    //   210: istore #4
    //   212: iconst_0
    //   213: istore #5
    //   215: iload #5
    //   217: iload #4
    //   219: if_icmpge -> 330
    //   222: aload_3
    //   223: iload #5
    //   225: aaload
    //   226: astore #6
    //   228: aload #6
    //   230: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   233: pop
    //   234: aload #6
    //   236: invokevirtual getModifiers : ()I
    //   239: invokestatic isStatic : (I)Z
    //   242: ifeq -> 316
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 316
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   270: if_acmpne -> 316
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   279: athrow
    //   280: aload #6
    //   282: iconst_1
    //   283: invokevirtual setAccessible : (Z)V
    //   286: aload #6
    //   288: aconst_null
    //   289: iconst_2
    //   290: anewarray java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: aastore
    //   297: dup
    //   298: iconst_1
    //   299: aload_1
    //   300: aastore
    //   301: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   304: pop
    //   305: iload_2
    //   306: ifne -> 330
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: iinc #5, 1
    //   319: iload_2
    //   320: ifne -> 215
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: sipush #-27505
    //   333: sipush #27308
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: iconst_1
    //   340: ldc burp/Zxyp
    //   342: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   345: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   348: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   351: astore_3
    //   352: aload_3
    //   353: arraylength
    //   354: istore #4
    //   356: iconst_0
    //   357: istore #5
    //   359: iload #5
    //   361: iload #4
    //   363: if_icmpge -> 500
    //   366: aload_3
    //   367: iload #5
    //   369: aaload
    //   370: astore #6
    //   372: aload #6
    //   374: invokevirtual getModifiers : ()I
    //   377: invokestatic isStatic : (I)Z
    //   380: ifne -> 390
    //   383: goto -> 493
    //   386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   389: athrow
    //   390: aload #6
    //   392: invokevirtual getType : ()Ljava/lang/Class;
    //   395: astore #7
    //   397: aload #7
    //   399: ifnull -> 480
    //   402: aload #7
    //   404: invokevirtual isPrimitive : ()Z
    //   407: ifne -> 480
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   416: athrow
    //   417: aload #7
    //   419: invokevirtual getPackage : ()Ljava/lang/Package;
    //   422: ifnull -> 480
    //   425: goto -> 432
    //   428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   431: athrow
    //   432: aload #7
    //   434: invokevirtual getPackage : ()Ljava/lang/Package;
    //   437: invokevirtual getName : ()Ljava/lang/String;
    //   440: ifnull -> 480
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   449: athrow
    //   450: aload #7
    //   452: invokevirtual getPackage : ()Ljava/lang/Package;
    //   455: invokevirtual getName : ()Ljava/lang/String;
    //   458: sipush #-27520
    //   461: sipush #-10684
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   470: ifne -> 480
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   479: athrow
    //   480: aload #6
    //   482: iconst_1
    //   483: invokevirtual setAccessible : (Z)V
    //   486: aload #6
    //   488: aconst_null
    //   489: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   492: pop
    //   493: iinc #5, 1
    //   496: iload_2
    //   497: ifne -> 359
    //   500: sipush #-27509
    //   503: sipush #18008
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   512: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   515: astore_3
    //   516: aload_3
    //   517: arraylength
    //   518: istore #4
    //   520: iconst_0
    //   521: istore #5
    //   523: iload #5
    //   525: iload #4
    //   527: if_icmpge -> 656
    //   530: aload_3
    //   531: iload #5
    //   533: aaload
    //   534: astore #6
    //   536: aload #6
    //   538: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   541: pop
    //   542: aload #6
    //   544: invokevirtual getModifiers : ()I
    //   547: invokestatic isStatic : (I)Z
    //   550: ifeq -> 642
    //   553: aload #6
    //   555: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   558: arraylength
    //   559: iconst_2
    //   560: if_icmpne -> 642
    //   563: goto -> 570
    //   566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   569: athrow
    //   570: aload #6
    //   572: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   575: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   578: if_acmpne -> 642
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload #6
    //   590: iconst_1
    //   591: invokevirtual setAccessible : (Z)V
    //   594: aload #6
    //   596: aconst_null
    //   597: iconst_2
    //   598: anewarray java/lang/Object
    //   601: dup
    //   602: iconst_0
    //   603: aload_0
    //   604: aastore
    //   605: dup
    //   606: iconst_1
    //   607: aload_1
    //   608: ifnonnull -> 626
    //   611: goto -> 618
    //   614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   617: athrow
    //   618: aload_1
    //   619: goto -> 633
    //   622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   625: athrow
    //   626: aload_1
    //   627: checkcast [B
    //   630: invokevirtual clone : ()Ljava/lang/Object;
    //   633: aastore
    //   634: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   637: pop
    //   638: iload_2
    //   639: ifne -> 656
    //   642: iinc #5, 1
    //   645: iload_2
    //   646: ifne -> 523
    //   649: goto -> 656
    //   652: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   655: athrow
    //   656: sipush #-27506
    //   659: sipush #-2218
    //   662: invokestatic a : (II)Ljava/lang/String;
    //   665: iconst_1
    //   666: ldc burp/Zl3j
    //   668: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   671: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   674: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   677: astore_3
    //   678: aload_3
    //   679: arraylength
    //   680: istore #4
    //   682: iconst_0
    //   683: istore #5
    //   685: iload #5
    //   687: iload #4
    //   689: if_icmpge -> 826
    //   692: aload_3
    //   693: iload #5
    //   695: aaload
    //   696: astore #6
    //   698: aload #6
    //   700: invokevirtual getModifiers : ()I
    //   703: invokestatic isStatic : (I)Z
    //   706: ifne -> 716
    //   709: goto -> 819
    //   712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   715: athrow
    //   716: aload #6
    //   718: invokevirtual getType : ()Ljava/lang/Class;
    //   721: astore #7
    //   723: aload #7
    //   725: ifnull -> 806
    //   728: aload #7
    //   730: invokevirtual isPrimitive : ()Z
    //   733: ifne -> 806
    //   736: goto -> 743
    //   739: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   742: athrow
    //   743: aload #7
    //   745: invokevirtual getPackage : ()Ljava/lang/Package;
    //   748: ifnull -> 806
    //   751: goto -> 758
    //   754: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   757: athrow
    //   758: aload #7
    //   760: invokevirtual getPackage : ()Ljava/lang/Package;
    //   763: invokevirtual getName : ()Ljava/lang/String;
    //   766: ifnull -> 806
    //   769: goto -> 776
    //   772: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   775: athrow
    //   776: aload #7
    //   778: invokevirtual getPackage : ()Ljava/lang/Package;
    //   781: invokevirtual getName : ()Ljava/lang/String;
    //   784: sipush #-27520
    //   787: sipush #-10684
    //   790: invokestatic a : (II)Ljava/lang/String;
    //   793: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   796: ifne -> 806
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   805: athrow
    //   806: aload #6
    //   808: iconst_1
    //   809: invokevirtual setAccessible : (Z)V
    //   812: aload #6
    //   814: aconst_null
    //   815: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   818: pop
    //   819: iinc #5, 1
    //   822: iload_2
    //   823: ifne -> 685
    //   826: sipush #-27510
    //   829: sipush #-5332
    //   832: invokestatic a : (II)Ljava/lang/String;
    //   835: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   838: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   841: astore_3
    //   842: aload_3
    //   843: arraylength
    //   844: istore #4
    //   846: iconst_0
    //   847: istore #5
    //   849: iload #5
    //   851: iload #4
    //   853: if_icmpge -> 985
    //   856: aload_3
    //   857: iload #5
    //   859: aaload
    //   860: astore #6
    //   862: aload #6
    //   864: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   867: pop
    //   868: aload #6
    //   870: invokevirtual getModifiers : ()I
    //   873: invokestatic isStatic : (I)Z
    //   876: ifeq -> 971
    //   879: aload #6
    //   881: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   884: arraylength
    //   885: iconst_2
    //   886: if_icmpne -> 971
    //   889: goto -> 896
    //   892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   895: athrow
    //   896: aload #6
    //   898: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   901: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   904: invokevirtual equals : (Ljava/lang/Object;)Z
    //   907: ifeq -> 971
    //   910: goto -> 917
    //   913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   916: athrow
    //   917: aload #6
    //   919: iconst_1
    //   920: invokevirtual setAccessible : (Z)V
    //   923: aload #6
    //   925: aconst_null
    //   926: iconst_2
    //   927: anewarray java/lang/Object
    //   930: dup
    //   931: iconst_0
    //   932: aload_0
    //   933: aastore
    //   934: dup
    //   935: iconst_1
    //   936: aload_1
    //   937: ifnonnull -> 955
    //   940: goto -> 947
    //   943: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   946: athrow
    //   947: aload_1
    //   948: goto -> 962
    //   951: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   954: athrow
    //   955: aload_1
    //   956: checkcast [B
    //   959: invokevirtual clone : ()Ljava/lang/Object;
    //   962: aastore
    //   963: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   966: pop
    //   967: iload_2
    //   968: ifne -> 985
    //   971: iinc #5, 1
    //   974: iload_2
    //   975: ifne -> 849
    //   978: goto -> 985
    //   981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   984: athrow
    //   985: iconst_0
    //   986: istore_3
    //   987: sipush #-27518
    //   990: sipush #-7532
    //   993: invokestatic a : (II)Ljava/lang/String;
    //   996: iconst_1
    //   997: ldc burp/Zzou
    //   999: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1002: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1005: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1008: astore #4
    //   1010: aload #4
    //   1012: arraylength
    //   1013: istore #5
    //   1015: iconst_0
    //   1016: istore #6
    //   1018: iload #6
    //   1020: iload #5
    //   1022: if_icmpge -> 1160
    //   1025: aload #4
    //   1027: iload #6
    //   1029: aaload
    //   1030: astore #7
    //   1032: aload #7
    //   1034: invokevirtual getModifiers : ()I
    //   1037: invokestatic isStatic : (I)Z
    //   1040: ifne -> 1050
    //   1043: goto -> 1153
    //   1046: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1049: athrow
    //   1050: aload #7
    //   1052: invokevirtual getType : ()Ljava/lang/Class;
    //   1055: astore #8
    //   1057: aload #8
    //   1059: ifnull -> 1140
    //   1062: aload #8
    //   1064: invokevirtual isPrimitive : ()Z
    //   1067: ifne -> 1140
    //   1070: goto -> 1077
    //   1073: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1076: athrow
    //   1077: aload #8
    //   1079: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1082: ifnull -> 1140
    //   1085: goto -> 1092
    //   1088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1091: athrow
    //   1092: aload #8
    //   1094: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1097: invokevirtual getName : ()Ljava/lang/String;
    //   1100: ifnull -> 1140
    //   1103: goto -> 1110
    //   1106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1109: athrow
    //   1110: aload #8
    //   1112: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1115: invokevirtual getName : ()Ljava/lang/String;
    //   1118: sipush #-27520
    //   1121: sipush #-10684
    //   1124: invokestatic a : (II)Ljava/lang/String;
    //   1127: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1130: ifne -> 1140
    //   1133: goto -> 1140
    //   1136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1139: athrow
    //   1140: aload #7
    //   1142: iconst_1
    //   1143: invokevirtual setAccessible : (Z)V
    //   1146: aload #7
    //   1148: aconst_null
    //   1149: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1152: pop
    //   1153: iinc #6, 1
    //   1156: iload_2
    //   1157: ifne -> 1018
    //   1160: sipush #-27513
    //   1163: sipush #-9765
    //   1166: invokestatic a : (II)Ljava/lang/String;
    //   1169: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1172: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1175: astore #4
    //   1177: aload #4
    //   1179: arraylength
    //   1180: istore #5
    //   1182: iconst_0
    //   1183: istore #6
    //   1185: iload #6
    //   1187: iload #5
    //   1189: if_icmpge -> 1325
    //   1192: aload #4
    //   1194: iload #6
    //   1196: aaload
    //   1197: astore #7
    //   1199: aload #7
    //   1201: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1204: pop
    //   1205: aload #7
    //   1207: invokevirtual getModifiers : ()I
    //   1210: invokestatic isStatic : (I)Z
    //   1213: ifeq -> 1311
    //   1216: aload #7
    //   1218: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1221: arraylength
    //   1222: iconst_2
    //   1223: if_icmpne -> 1311
    //   1226: goto -> 1233
    //   1229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1232: athrow
    //   1233: aload #7
    //   1235: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1238: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1241: if_acmpne -> 1311
    //   1244: goto -> 1251
    //   1247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1250: athrow
    //   1251: aload #7
    //   1253: iconst_1
    //   1254: invokevirtual setAccessible : (Z)V
    //   1257: aload #7
    //   1259: aconst_null
    //   1260: iconst_2
    //   1261: anewarray java/lang/Object
    //   1264: dup
    //   1265: iconst_0
    //   1266: aload_0
    //   1267: aastore
    //   1268: dup
    //   1269: iconst_1
    //   1270: aload_1
    //   1271: ifnonnull -> 1289
    //   1274: goto -> 1281
    //   1277: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1280: athrow
    //   1281: aload_1
    //   1282: goto -> 1296
    //   1285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1288: athrow
    //   1289: aload_1
    //   1290: checkcast [B
    //   1293: invokevirtual clone : ()Ljava/lang/Object;
    //   1296: aastore
    //   1297: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1300: checkcast java/lang/Boolean
    //   1303: invokevirtual booleanValue : ()Z
    //   1306: istore_3
    //   1307: iload_2
    //   1308: ifne -> 1325
    //   1311: iinc #6, 1
    //   1314: iload_2
    //   1315: ifne -> 1185
    //   1318: goto -> 1325
    //   1321: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1324: athrow
    //   1325: iload_3
    //   1326: ireturn
    //   1327: astore_3
    //   1328: new java/lang/Exception
    //   1331: dup
    //   1332: aload_3
    //   1333: invokevirtual getMessage : ()Ljava/lang/String;
    //   1336: invokespecial <init> : (Ljava/lang/String;)V
    //   1339: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1326	1327	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	273	276	java/lang/Throwable
    //   262	309	312	java/lang/Throwable
    //   280	323	326	java/lang/Throwable
    //   372	386	386	java/lang/Throwable
    //   397	410	413	java/lang/Throwable
    //   402	425	428	java/lang/Throwable
    //   417	443	446	java/lang/Throwable
    //   432	473	476	java/lang/Throwable
    //   536	563	566	java/lang/Throwable
    //   553	581	584	java/lang/Throwable
    //   570	611	614	java/lang/Throwable
    //   588	622	622	java/lang/Throwable
    //   633	649	652	java/lang/Throwable
    //   698	712	712	java/lang/Throwable
    //   723	736	739	java/lang/Throwable
    //   728	751	754	java/lang/Throwable
    //   743	769	772	java/lang/Throwable
    //   758	799	802	java/lang/Throwable
    //   862	889	892	java/lang/Throwable
    //   879	910	913	java/lang/Throwable
    //   896	940	943	java/lang/Throwable
    //   917	951	951	java/lang/Throwable
    //   962	978	981	java/lang/Throwable
    //   1032	1046	1046	java/lang/Throwable
    //   1057	1070	1073	java/lang/Throwable
    //   1062	1085	1088	java/lang/Throwable
    //   1077	1103	1106	java/lang/Throwable
    //   1092	1133	1136	java/lang/Throwable
    //   1199	1226	1229	java/lang/Throwable
    //   1216	1244	1247	java/lang/Throwable
    //   1233	1274	1277	java/lang/Throwable
    //   1251	1285	1285	java/lang/Throwable
    //   1307	1318	1321	java/lang/Throwable
  }
  
  static void Zl(Object paramObject) {
    Zr8s.ZA = a(-27508, 8959);
    Zr8s.Zt = new BigInteger(a(-27519, 8687));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zek5.ZE.charAt(Math.abs(((BigInteger)Zsq5.ZF).intValue() % 32)) <= Zttq.ZO.charAt(Math.abs(((BigInteger)Zrd0.Zs).intValue() % 32))) {
          try {
            Ztzj.Zy(Class.forName(a(-27515, -21709)));
            if (bool)
              Zz9v.ZV(Class.forName(a(-27511, -2850))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zz9v.ZV(Class.forName(a(-27511, -2850)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'MQÉ#<WÑ ³8@ê¶weù.V6ïy\1ã[8\\nÂIKñ\\b+¦âïM0kpøÎ°«\\tã?X­®j>Ó0¦A¦¦jÍkP¹\\tC»eHC·`«ÝFBÄ2NÍ¼ô;¤Ô`vÈ®y*TÄ\\t\\tÃCêiG\\bZ\\t¯ïDÆBÙDöbðý%\\t¾xf4ÌÃç\\t÷xO4#uÇl\\tþ®nîÜì²ú\\t/æTç@ýð\\t\\r©ÈÀ1\\tLã8GÍé¤UÂ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #30
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
    //   68: ldc 'Wg°êVf sÏhc´'B\\fèã©,Â«!mÚ(,±ª£«M\\t'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #78
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
    //   129: putstatic burp/Zlp7.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlp7.b : [Ljava/lang/String;
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
    //   212: bipush #26
    //   214: goto -> 244
    //   217: bipush #67
    //   219: goto -> 244
    //   222: bipush #115
    //   224: goto -> 244
    //   227: bipush #37
    //   229: goto -> 244
    //   232: bipush #107
    //   234: goto -> 244
    //   237: bipush #92
    //   239: goto -> 244
    //   242: bipush #50
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #67
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #45
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #101
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-32
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #52
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #78
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #63
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-81
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-125
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #109
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-36
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #12
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #107
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-15
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-28
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: iconst_m1
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-77
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-119
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-89
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-29
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #58
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #125
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: iconst_0
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-100
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #-96
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #100
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #22
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-112
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #-110
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-34
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-79
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-115
    //   492: bastore
    //   493: invokespecial <init> : (I[B)V
    //   496: putstatic burp/Zlp7.ZM : Ljava/lang/Object;
    //   499: sipush #-27517
    //   502: sipush #18712
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zlp7.ZO : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9482) & 0xFFFF;
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
      byte b1 = 84;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlp7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */