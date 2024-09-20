package burp;

import java.math.BigInteger;

class Zm_w extends ClassLoader {
  static Object ZW;
  
  static String ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZL(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zztx.ZM : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zx_u.Zy : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ze6k.Zs : Ljava/lang/Object;
    //   22: sipush #4372
    //   25: sipush #1784
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zxwl
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
    //   150: sipush #4378
    //   153: sipush #-19612
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
    //   192: sipush #4377
    //   195: sipush #8635
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
    //   219: if_icmpge -> 351
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
    //   242: ifeq -> 337
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 337
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   270: invokevirtual equals : (Ljava/lang/Object;)Z
    //   273: ifeq -> 337
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   282: athrow
    //   283: aload #6
    //   285: iconst_1
    //   286: invokevirtual setAccessible : (Z)V
    //   289: aload #6
    //   291: aconst_null
    //   292: iconst_2
    //   293: anewarray java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_0
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_1
    //   303: ifnonnull -> 321
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload_1
    //   314: goto -> 328
    //   317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   320: athrow
    //   321: aload_1
    //   322: checkcast [B
    //   325: invokevirtual clone : ()Ljava/lang/Object;
    //   328: aastore
    //   329: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   332: pop
    //   333: iload_2
    //   334: ifne -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifne -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: getstatic burp/Zs15.Zk : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual intValue : ()I
    //   360: i2l
    //   361: invokestatic currentTimeMillis : ()J
    //   364: ladd
    //   365: getstatic burp/Zcc.Zd : Ljava/lang/Object;
    //   368: checkcast java/math/BigInteger
    //   371: invokevirtual intValue : ()I
    //   374: i2l
    //   375: lcmp
    //   376: ifge -> 708
    //   379: sipush #4371
    //   382: sipush #13734
    //   385: invokestatic a : (II)Ljava/lang/String;
    //   388: iconst_1
    //   389: ldc burp/Zlpj
    //   391: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   394: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   397: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   400: astore_3
    //   401: aload_3
    //   402: arraylength
    //   403: istore #4
    //   405: iconst_0
    //   406: istore #5
    //   408: iload #5
    //   410: iload #4
    //   412: if_icmpge -> 549
    //   415: aload_3
    //   416: iload #5
    //   418: aaload
    //   419: astore #6
    //   421: aload #6
    //   423: invokevirtual getModifiers : ()I
    //   426: invokestatic isStatic : (I)Z
    //   429: ifne -> 439
    //   432: goto -> 542
    //   435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   438: athrow
    //   439: aload #6
    //   441: invokevirtual getType : ()Ljava/lang/Class;
    //   444: astore #7
    //   446: aload #7
    //   448: ifnull -> 529
    //   451: aload #7
    //   453: invokevirtual isPrimitive : ()Z
    //   456: ifne -> 529
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   465: athrow
    //   466: aload #7
    //   468: invokevirtual getPackage : ()Ljava/lang/Package;
    //   471: ifnull -> 529
    //   474: goto -> 481
    //   477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   480: athrow
    //   481: aload #7
    //   483: invokevirtual getPackage : ()Ljava/lang/Package;
    //   486: invokevirtual getName : ()Ljava/lang/String;
    //   489: ifnull -> 529
    //   492: goto -> 499
    //   495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   498: athrow
    //   499: aload #7
    //   501: invokevirtual getPackage : ()Ljava/lang/Package;
    //   504: invokevirtual getName : ()Ljava/lang/String;
    //   507: sipush #4368
    //   510: sipush #-441
    //   513: invokestatic a : (II)Ljava/lang/String;
    //   516: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   519: ifne -> 529
    //   522: goto -> 529
    //   525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   528: athrow
    //   529: aload #6
    //   531: iconst_1
    //   532: invokevirtual setAccessible : (Z)V
    //   535: aload #6
    //   537: aconst_null
    //   538: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   541: pop
    //   542: iinc #5, 1
    //   545: iload_2
    //   546: ifne -> 408
    //   549: sipush #4373
    //   552: sipush #30441
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   561: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   564: astore_3
    //   565: aload_3
    //   566: arraylength
    //   567: istore #4
    //   569: iconst_0
    //   570: istore #5
    //   572: iload #5
    //   574: iload #4
    //   576: if_icmpge -> 708
    //   579: aload_3
    //   580: iload #5
    //   582: aaload
    //   583: astore #6
    //   585: aload #6
    //   587: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   590: pop
    //   591: aload #6
    //   593: invokevirtual getModifiers : ()I
    //   596: invokestatic isStatic : (I)Z
    //   599: ifeq -> 694
    //   602: aload #6
    //   604: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   607: arraylength
    //   608: iconst_2
    //   609: if_icmpne -> 694
    //   612: goto -> 619
    //   615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   618: athrow
    //   619: aload #6
    //   621: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   624: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   627: invokevirtual equals : (Ljava/lang/Object;)Z
    //   630: ifeq -> 694
    //   633: goto -> 640
    //   636: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   639: athrow
    //   640: aload #6
    //   642: iconst_1
    //   643: invokevirtual setAccessible : (Z)V
    //   646: aload #6
    //   648: aconst_null
    //   649: iconst_2
    //   650: anewarray java/lang/Object
    //   653: dup
    //   654: iconst_0
    //   655: aload_0
    //   656: aastore
    //   657: dup
    //   658: iconst_1
    //   659: aload_1
    //   660: ifnonnull -> 678
    //   663: goto -> 670
    //   666: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   669: athrow
    //   670: aload_1
    //   671: goto -> 685
    //   674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   677: athrow
    //   678: aload_1
    //   679: checkcast [B
    //   682: invokevirtual clone : ()Ljava/lang/Object;
    //   685: aastore
    //   686: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   689: pop
    //   690: iload_2
    //   691: ifne -> 708
    //   694: iinc #5, 1
    //   697: iload_2
    //   698: ifne -> 572
    //   701: goto -> 708
    //   704: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   707: athrow
    //   708: new java/io/ByteArrayOutputStream
    //   711: dup
    //   712: invokespecial <init> : ()V
    //   715: astore_3
    //   716: sipush #4375
    //   719: aload_3
    //   720: sipush #202
    //   723: invokevirtual write : (I)V
    //   726: sipush #11753
    //   729: aload_3
    //   730: sipush #254
    //   733: invokevirtual write : (I)V
    //   736: aload_3
    //   737: sipush #186
    //   740: invokevirtual write : (I)V
    //   743: aload_3
    //   744: sipush #190
    //   747: invokevirtual write : (I)V
    //   750: aload_3
    //   751: iconst_0
    //   752: invokevirtual write : (I)V
    //   755: aload_3
    //   756: iconst_1
    //   757: invokevirtual write : (I)V
    //   760: aload_3
    //   761: iconst_0
    //   762: invokevirtual write : (I)V
    //   765: aload_3
    //   766: bipush #50
    //   768: invokevirtual write : (I)V
    //   771: aload_3
    //   772: getstatic burp/Zsej.ZT : Ljava/lang/Object;
    //   775: checkcast java/math/BigInteger
    //   778: invokevirtual toByteArray : ()[B
    //   781: invokevirtual write : ([B)V
    //   784: aload_3
    //   785: getstatic burp/Zkdc.Zv : Ljava/lang/Object;
    //   788: checkcast java/math/BigInteger
    //   791: invokevirtual toByteArray : ()[B
    //   794: invokevirtual write : ([B)V
    //   797: aload_3
    //   798: getstatic burp/Zx4u.Zn : Ljava/lang/Object;
    //   801: checkcast java/math/BigInteger
    //   804: invokevirtual toByteArray : ()[B
    //   807: invokevirtual write : ([B)V
    //   810: aload_3
    //   811: invokevirtual toByteArray : ()[B
    //   814: astore #4
    //   816: aconst_null
    //   817: astore #5
    //   819: invokestatic a : (II)Ljava/lang/String;
    //   822: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   825: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   828: astore #6
    //   830: aload #6
    //   832: arraylength
    //   833: istore #7
    //   835: iconst_0
    //   836: istore #8
    //   838: iload #8
    //   840: iload #7
    //   842: if_icmpge -> 970
    //   845: aload #6
    //   847: iload #8
    //   849: aaload
    //   850: astore #9
    //   852: aload #9
    //   854: invokevirtual getName : ()Ljava/lang/String;
    //   857: sipush #4381
    //   860: sipush #-22516
    //   863: invokestatic a : (II)Ljava/lang/String;
    //   866: invokevirtual equals : (Ljava/lang/Object;)Z
    //   869: ifeq -> 963
    //   872: aload #9
    //   874: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   877: astore #10
    //   879: aload #10
    //   881: arraylength
    //   882: iconst_4
    //   883: if_icmpeq -> 893
    //   886: goto -> 963
    //   889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   892: athrow
    //   893: aload #10
    //   895: iconst_0
    //   896: aaload
    //   897: ldc java/lang/String
    //   899: if_acmpeq -> 909
    //   902: goto -> 963
    //   905: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   908: athrow
    //   909: aload #10
    //   911: iconst_1
    //   912: aaload
    //   913: ldc [B
    //   915: if_acmpeq -> 925
    //   918: goto -> 963
    //   921: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   924: athrow
    //   925: aload #10
    //   927: iconst_2
    //   928: aaload
    //   929: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   932: if_acmpeq -> 942
    //   935: goto -> 963
    //   938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   941: athrow
    //   942: aload #10
    //   944: iconst_3
    //   945: aaload
    //   946: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   949: if_acmpeq -> 959
    //   952: goto -> 963
    //   955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   958: athrow
    //   959: aload #9
    //   961: astore #5
    //   963: iinc #8, 1
    //   966: iload_2
    //   967: ifne -> 838
    //   970: aload #5
    //   972: iconst_1
    //   973: invokevirtual setAccessible : (Z)V
    //   976: ldc burp/Ze0z
    //   978: iconst_0
    //   979: anewarray java/lang/Class
    //   982: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   985: astore #6
    //   987: aload #6
    //   989: iconst_1
    //   990: invokevirtual setAccessible : (Z)V
    //   993: aload #5
    //   995: aload #6
    //   997: iconst_0
    //   998: anewarray java/lang/Object
    //   1001: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1004: iconst_4
    //   1005: anewarray java/lang/Object
    //   1008: dup
    //   1009: iconst_0
    //   1010: sipush #4370
    //   1013: sipush #-25046
    //   1016: invokestatic a : (II)Ljava/lang/String;
    //   1019: aastore
    //   1020: dup
    //   1021: iconst_1
    //   1022: aload #4
    //   1024: aastore
    //   1025: dup
    //   1026: iconst_2
    //   1027: iconst_0
    //   1028: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1031: aastore
    //   1032: dup
    //   1033: iconst_3
    //   1034: aload #4
    //   1036: arraylength
    //   1037: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1040: aastore
    //   1041: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1044: pop
    //   1045: goto -> 1049
    //   1048: astore_3
    //   1049: getstatic burp/Zgr4.Zi : Ljava/lang/String;
    //   1052: getstatic burp/Zgco.Zx : Ljava/lang/Object;
    //   1055: checkcast java/math/BigInteger
    //   1058: invokevirtual intValue : ()I
    //   1061: bipush #32
    //   1063: irem
    //   1064: invokestatic abs : (I)I
    //   1067: invokevirtual charAt : (I)C
    //   1070: getstatic burp/Zty4.Zu : Ljava/lang/String;
    //   1073: getstatic burp/Zxyu.Zp : Ljava/lang/Object;
    //   1076: checkcast java/math/BigInteger
    //   1079: invokevirtual intValue : ()I
    //   1082: bipush #32
    //   1084: irem
    //   1085: invokestatic abs : (I)I
    //   1088: invokevirtual charAt : (I)C
    //   1091: if_icmpgt -> 1206
    //   1094: getstatic burp/Zgr4.Zi : Ljava/lang/String;
    //   1097: getstatic burp/Zg27.ZQ : Ljava/lang/Object;
    //   1100: checkcast java/math/BigInteger
    //   1103: invokevirtual intValue : ()I
    //   1106: bipush #32
    //   1108: irem
    //   1109: invokestatic abs : (I)I
    //   1112: invokevirtual charAt : (I)C
    //   1115: getstatic burp/Zm81.ZY : Ljava/lang/String;
    //   1118: getstatic burp/Ze08.ZJ : Ljava/lang/Object;
    //   1121: checkcast java/math/BigInteger
    //   1124: invokevirtual intValue : ()I
    //   1127: bipush #32
    //   1129: irem
    //   1130: invokestatic abs : (I)I
    //   1133: invokevirtual charAt : (I)C
    //   1136: if_icmple -> 1206
    //   1139: goto -> 1146
    //   1142: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1145: athrow
    //   1146: getstatic burp/Zxjm.ZG : Ljava/lang/String;
    //   1149: getstatic burp/Zty2.Zl : Ljava/lang/Object;
    //   1152: checkcast java/math/BigInteger
    //   1155: invokevirtual intValue : ()I
    //   1158: bipush #32
    //   1160: irem
    //   1161: invokestatic abs : (I)I
    //   1164: invokevirtual charAt : (I)C
    //   1167: getstatic burp/Zlh2.Zf : Ljava/lang/String;
    //   1170: getstatic burp/Zty4.ZQ : Ljava/lang/Object;
    //   1173: checkcast java/math/BigInteger
    //   1176: invokevirtual intValue : ()I
    //   1179: bipush #32
    //   1181: irem
    //   1182: invokestatic abs : (I)I
    //   1185: invokevirtual charAt : (I)C
    //   1188: if_icmpgt -> 1206
    //   1191: goto -> 1198
    //   1194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1197: athrow
    //   1198: iconst_1
    //   1199: goto -> 1207
    //   1202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1205: athrow
    //   1206: iconst_0
    //   1207: ireturn
    //   1208: astore_3
    //   1209: new java/lang/Exception
    //   1212: dup
    //   1213: aload_3
    //   1214: invokevirtual getMessage : ()Ljava/lang/String;
    //   1217: invokespecial <init> : (Ljava/lang/String;)V
    //   1220: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1207	1208	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	276	279	java/lang/Throwable
    //   262	306	309	java/lang/Throwable
    //   283	317	317	java/lang/Throwable
    //   328	344	347	java/lang/Throwable
    //   421	435	435	java/lang/Throwable
    //   446	459	462	java/lang/Throwable
    //   451	474	477	java/lang/Throwable
    //   466	492	495	java/lang/Throwable
    //   481	522	525	java/lang/Throwable
    //   585	612	615	java/lang/Throwable
    //   602	633	636	java/lang/Throwable
    //   619	663	666	java/lang/Throwable
    //   640	674	674	java/lang/Throwable
    //   685	701	704	java/lang/Throwable
    //   708	1045	1048	java/lang/Throwable
    //   879	889	889	java/lang/Throwable
    //   893	905	905	java/lang/Throwable
    //   909	921	921	java/lang/Throwable
    //   925	938	938	java/lang/Throwable
    //   942	955	955	java/lang/Throwable
    //   1049	1139	1142	java/lang/Throwable
    //   1094	1191	1194	java/lang/Throwable
    //   1146	1202	1202	java/lang/Throwable
  }
  
  static void Zr(Object paramObject) {
    Zcc.Zb = a(4380, -29685);
    Zcc.Zd = new BigInteger(a(4374, 7908));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgr4.Zi.charAt(Math.abs(((BigInteger)Zcc.Zd).intValue() % 32)) > Zcc.Zb.charAt(Math.abs(((BigInteger)Zgr4.ZL).intValue() % 32))) {
          try {
            Zem6.Ze(Class.forName(a(4379, 6971)));
            if (!bool)
              Zkaw.ZA(Class.forName(a(4369, 15070))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkaw.ZA(Class.forName(a(4369, 15070)));
    } catch (Throwable throwable) {}
  }
  
  static void Zz(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ':ô6\\tYrzæÈ(\\bÛ*«ÏÅ\\tµQç(çi¥\\tf'LgG<\\t]¿ú_%+MÇmp¨*ýVÎv0kG21I/k­ÙoÆÏxêzýþ·}ý%d/Â£Hc|`"¶g<Â/ññò\\t¼Ìe)HãÉ1fR:£*·ª-n[¶V±üXà¬<Wl WØÉ¿14³ç­\\n­1PÁ4»S{=GÇ\\tS;ø³ÑîÛHXy\\t WQBþ M¦'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #83
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
    //   67: ldc 'Bô¼ÝÇÖÇ*º)¡ÿ4ý§Ç)_#î>H9Qg$ÝÓ,­ÜN'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #32
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #85
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
    //   128: putstatic burp/Zm_w.a : [Ljava/lang/String;
    //   131: bipush #14
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zm_w.b : [Ljava/lang/String;
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
    //   212: bipush #74
    //   214: goto -> 244
    //   217: bipush #42
    //   219: goto -> 244
    //   222: bipush #125
    //   224: goto -> 244
    //   227: bipush #127
    //   229: goto -> 244
    //   232: bipush #80
    //   234: goto -> 244
    //   237: bipush #60
    //   239: goto -> 244
    //   242: bipush #66
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #17
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-71
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-56
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #127
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #104
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #79
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #88
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-48
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-126
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #41
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-65
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-88
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-78
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-112
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #18
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #56
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #12
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #40
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #51
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #110
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #-9
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-26
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-29
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-123
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #-96
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #106
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-47
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #86
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-68
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #-96
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #38
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-87
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zm_w.ZW : Ljava/lang/Object;
    //   501: sipush #4376
    //   504: sipush #1702
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zm_w.ZA : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1110) & 0xFFFF;
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
      char c = 'Ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm_w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */