package burp;

import java.math.BigInteger;

class Ztdl extends ClassLoader {
  static String ZK;
  
  static Object Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZM(Object paramObject) {
    Zzr8.ZY = a(18865, -14481);
    Zzr8.ZC = new BigInteger(a(18852, -12825));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zsbv.Zr.charAt(Math.abs(((BigInteger)Zrqi.Zb).intValue() % 32)) <= Zb87.ZK.charAt(Math.abs(((BigInteger)Zgio.ZP).intValue() % 32))) {
          try {
            Zmjr.ZM(Class.forName(a(18867, -15263)));
            if (!bool)
              Zrzg.ZU(Class.forName(a(18855, 20006))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrzg.ZU(Class.forName(a(18855, 20006)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZE(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   250: getstatic burp/Zlsg.ZD : Ljava/lang/Object;
    //   253: checkcast java/math/BigInteger
    //   256: getstatic burp/Zt7x.ZE : Ljava/lang/Object;
    //   259: checkcast java/math/BigInteger
    //   262: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   265: putstatic burp/Zb_1.ZK : Ljava/lang/Object;
    //   268: sipush #18862
    //   271: sipush #-23679
    //   274: invokestatic a : (II)Ljava/lang/String;
    //   277: iconst_1
    //   278: ldc burp/Zgd7
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
    //   396: sipush #18849
    //   399: sipush #12164
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
    //   438: sipush #18859
    //   441: sipush #-2316
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
    //   597: iconst_0
    //   598: istore_3
    //   599: getstatic burp/Zs1k.Zd : Ljava/lang/String;
    //   602: getstatic burp/Zxd1.Zc : Ljava/lang/Object;
    //   605: checkcast java/math/BigInteger
    //   608: invokevirtual intValue : ()I
    //   611: bipush #32
    //   613: irem
    //   614: invokestatic abs : (I)I
    //   617: invokevirtual charAt : (I)C
    //   620: getstatic burp/Zea.Zj : Ljava/lang/String;
    //   623: getstatic burp/Zea.ZO : Ljava/lang/Object;
    //   626: checkcast java/math/BigInteger
    //   629: invokevirtual intValue : ()I
    //   632: bipush #32
    //   634: irem
    //   635: invokestatic abs : (I)I
    //   638: invokevirtual charAt : (I)C
    //   641: if_icmple -> 985
    //   644: sipush #18864
    //   647: sipush #9201
    //   650: invokestatic a : (II)Ljava/lang/String;
    //   653: iconst_1
    //   654: ldc burp/Zr14
    //   656: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   659: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   662: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   665: astore #4
    //   667: aload #4
    //   669: arraylength
    //   670: istore #5
    //   672: iconst_0
    //   673: istore #6
    //   675: iload #6
    //   677: iload #5
    //   679: if_icmpge -> 817
    //   682: aload #4
    //   684: iload #6
    //   686: aaload
    //   687: astore #7
    //   689: aload #7
    //   691: invokevirtual getModifiers : ()I
    //   694: invokestatic isStatic : (I)Z
    //   697: ifne -> 707
    //   700: goto -> 810
    //   703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   706: athrow
    //   707: aload #7
    //   709: invokevirtual getType : ()Ljava/lang/Class;
    //   712: astore #8
    //   714: aload #8
    //   716: ifnull -> 797
    //   719: aload #8
    //   721: invokevirtual isPrimitive : ()Z
    //   724: ifne -> 797
    //   727: goto -> 734
    //   730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   733: athrow
    //   734: aload #8
    //   736: invokevirtual getPackage : ()Ljava/lang/Package;
    //   739: ifnull -> 797
    //   742: goto -> 749
    //   745: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   748: athrow
    //   749: aload #8
    //   751: invokevirtual getPackage : ()Ljava/lang/Package;
    //   754: invokevirtual getName : ()Ljava/lang/String;
    //   757: ifnull -> 797
    //   760: goto -> 767
    //   763: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   766: athrow
    //   767: aload #8
    //   769: invokevirtual getPackage : ()Ljava/lang/Package;
    //   772: invokevirtual getName : ()Ljava/lang/String;
    //   775: sipush #18863
    //   778: sipush #4337
    //   781: invokestatic a : (II)Ljava/lang/String;
    //   784: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   787: ifne -> 797
    //   790: goto -> 797
    //   793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   796: athrow
    //   797: aload #7
    //   799: iconst_1
    //   800: invokevirtual setAccessible : (Z)V
    //   803: aload #7
    //   805: aconst_null
    //   806: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   809: pop
    //   810: iinc #6, 1
    //   813: iload_2
    //   814: ifne -> 675
    //   817: sipush #18875
    //   820: sipush #6311
    //   823: invokestatic a : (II)Ljava/lang/String;
    //   826: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   829: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   832: astore #4
    //   834: aload #4
    //   836: arraylength
    //   837: istore #5
    //   839: iconst_0
    //   840: istore #6
    //   842: iload #6
    //   844: iload #5
    //   846: if_icmpge -> 982
    //   849: aload #4
    //   851: iload #6
    //   853: aaload
    //   854: astore #7
    //   856: aload #7
    //   858: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   861: pop
    //   862: aload #7
    //   864: invokevirtual getModifiers : ()I
    //   867: invokestatic isStatic : (I)Z
    //   870: ifeq -> 968
    //   873: aload #7
    //   875: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   878: arraylength
    //   879: iconst_2
    //   880: if_icmpne -> 968
    //   883: goto -> 890
    //   886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   889: athrow
    //   890: aload #7
    //   892: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   895: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   898: if_acmpne -> 968
    //   901: goto -> 908
    //   904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   907: athrow
    //   908: aload #7
    //   910: iconst_1
    //   911: invokevirtual setAccessible : (Z)V
    //   914: aload #7
    //   916: aconst_null
    //   917: iconst_2
    //   918: anewarray java/lang/Object
    //   921: dup
    //   922: iconst_0
    //   923: aload_0
    //   924: aastore
    //   925: dup
    //   926: iconst_1
    //   927: aload_1
    //   928: ifnonnull -> 946
    //   931: goto -> 938
    //   934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   937: athrow
    //   938: aload_1
    //   939: goto -> 953
    //   942: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   945: athrow
    //   946: aload_1
    //   947: checkcast [B
    //   950: invokevirtual clone : ()Ljava/lang/Object;
    //   953: aastore
    //   954: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   957: checkcast java/lang/Boolean
    //   960: invokevirtual booleanValue : ()Z
    //   963: istore_3
    //   964: iload_2
    //   965: ifne -> 982
    //   968: iinc #6, 1
    //   971: iload_2
    //   972: ifne -> 842
    //   975: goto -> 982
    //   978: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   981: athrow
    //   982: goto -> 1323
    //   985: sipush #18871
    //   988: sipush #2474
    //   991: invokestatic a : (II)Ljava/lang/String;
    //   994: iconst_1
    //   995: ldc burp/Zzox
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
    //   1116: sipush #18863
    //   1119: sipush #4337
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
    //   1158: sipush #18866
    //   1161: sipush #31342
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
    //   1323: iload_3
    //   1324: ifeq -> 1329
    //   1327: iload_3
    //   1328: ireturn
    //   1329: getstatic burp/Zsdl.ZJ : Ljava/lang/String;
    //   1332: getstatic burp/Zzpm.Ze : Ljava/lang/Object;
    //   1335: checkcast java/math/BigInteger
    //   1338: invokevirtual intValue : ()I
    //   1341: bipush #32
    //   1343: irem
    //   1344: invokestatic abs : (I)I
    //   1347: invokevirtual charAt : (I)C
    //   1350: getstatic burp/Zrt3.Zu : Ljava/lang/String;
    //   1353: getstatic burp/Zkdq.ZG : Ljava/lang/Object;
    //   1356: checkcast java/math/BigInteger
    //   1359: invokevirtual intValue : ()I
    //   1362: bipush #32
    //   1364: irem
    //   1365: invokestatic abs : (I)I
    //   1368: invokevirtual charAt : (I)C
    //   1371: if_icmple -> 1716
    //   1374: sipush #18870
    //   1377: sipush #-20664
    //   1380: invokestatic a : (II)Ljava/lang/String;
    //   1383: iconst_1
    //   1384: ldc burp/Zxti
    //   1386: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1389: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1392: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1395: astore #4
    //   1397: aload #4
    //   1399: arraylength
    //   1400: istore #5
    //   1402: iconst_0
    //   1403: istore #6
    //   1405: iload #6
    //   1407: iload #5
    //   1409: if_icmpge -> 1547
    //   1412: aload #4
    //   1414: iload #6
    //   1416: aaload
    //   1417: astore #7
    //   1419: aload #7
    //   1421: invokevirtual getModifiers : ()I
    //   1424: invokestatic isStatic : (I)Z
    //   1427: ifne -> 1437
    //   1430: goto -> 1540
    //   1433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1436: athrow
    //   1437: aload #7
    //   1439: invokevirtual getType : ()Ljava/lang/Class;
    //   1442: astore #8
    //   1444: aload #8
    //   1446: ifnull -> 1527
    //   1449: aload #8
    //   1451: invokevirtual isPrimitive : ()Z
    //   1454: ifne -> 1527
    //   1457: goto -> 1464
    //   1460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1463: athrow
    //   1464: aload #8
    //   1466: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1469: ifnull -> 1527
    //   1472: goto -> 1479
    //   1475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1478: athrow
    //   1479: aload #8
    //   1481: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1484: invokevirtual getName : ()Ljava/lang/String;
    //   1487: ifnull -> 1527
    //   1490: goto -> 1497
    //   1493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1496: athrow
    //   1497: aload #8
    //   1499: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1502: invokevirtual getName : ()Ljava/lang/String;
    //   1505: sipush #18863
    //   1508: sipush #4337
    //   1511: invokestatic a : (II)Ljava/lang/String;
    //   1514: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1517: ifne -> 1527
    //   1520: goto -> 1527
    //   1523: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1526: athrow
    //   1527: aload #7
    //   1529: iconst_1
    //   1530: invokevirtual setAccessible : (Z)V
    //   1533: aload #7
    //   1535: aconst_null
    //   1536: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1539: pop
    //   1540: iinc #6, 1
    //   1543: iload_2
    //   1544: ifne -> 1405
    //   1547: sipush #18861
    //   1550: sipush #23890
    //   1553: invokestatic a : (II)Ljava/lang/String;
    //   1556: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1559: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1562: astore #4
    //   1564: aload #4
    //   1566: arraylength
    //   1567: istore #5
    //   1569: iconst_0
    //   1570: istore #6
    //   1572: iload #6
    //   1574: iload #5
    //   1576: if_icmpge -> 1712
    //   1579: aload #4
    //   1581: iload #6
    //   1583: aaload
    //   1584: astore #7
    //   1586: aload #7
    //   1588: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1591: pop
    //   1592: aload #7
    //   1594: invokevirtual getModifiers : ()I
    //   1597: invokestatic isStatic : (I)Z
    //   1600: ifeq -> 1698
    //   1603: aload #7
    //   1605: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1608: arraylength
    //   1609: iconst_2
    //   1610: if_icmpne -> 1698
    //   1613: goto -> 1620
    //   1616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1619: athrow
    //   1620: aload #7
    //   1622: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1625: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1628: if_acmpne -> 1698
    //   1631: goto -> 1638
    //   1634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1637: athrow
    //   1638: aload #7
    //   1640: iconst_1
    //   1641: invokevirtual setAccessible : (Z)V
    //   1644: aload #7
    //   1646: aconst_null
    //   1647: iconst_2
    //   1648: anewarray java/lang/Object
    //   1651: dup
    //   1652: iconst_0
    //   1653: aload_0
    //   1654: aastore
    //   1655: dup
    //   1656: iconst_1
    //   1657: aload_1
    //   1658: ifnonnull -> 1676
    //   1661: goto -> 1668
    //   1664: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1667: athrow
    //   1668: aload_1
    //   1669: goto -> 1683
    //   1672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1675: athrow
    //   1676: aload_1
    //   1677: checkcast [B
    //   1680: invokevirtual clone : ()Ljava/lang/Object;
    //   1683: aastore
    //   1684: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1687: checkcast java/lang/Boolean
    //   1690: invokevirtual booleanValue : ()Z
    //   1693: istore_3
    //   1694: iload_2
    //   1695: ifne -> 1712
    //   1698: iinc #6, 1
    //   1701: iload_2
    //   1702: ifne -> 1572
    //   1705: goto -> 1712
    //   1708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1711: athrow
    //   1712: iload_2
    //   1713: ifne -> 2054
    //   1716: sipush #18857
    //   1719: sipush #-14160
    //   1722: invokestatic a : (II)Ljava/lang/String;
    //   1725: iconst_1
    //   1726: ldc burp/Zzmw
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
    //   1847: sipush #18863
    //   1850: sipush #4337
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
    //   1889: sipush #18869
    //   1892: sipush #-8575
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
    //   2054: iload_3
    //   2055: ifeq -> 2060
    //   2058: iload_3
    //   2059: ireturn
    //   2060: getstatic burp/Zscz.ZJ : Ljava/lang/String;
    //   2063: getstatic burp/Zzac.ZH : Ljava/lang/Object;
    //   2066: checkcast java/math/BigInteger
    //   2069: invokevirtual intValue : ()I
    //   2072: bipush #32
    //   2074: irem
    //   2075: invokestatic abs : (I)I
    //   2078: invokevirtual charAt : (I)C
    //   2081: getstatic burp/Znu.ZF : Ljava/lang/String;
    //   2084: getstatic burp/Zmt_.Zl : Ljava/lang/Object;
    //   2087: checkcast java/math/BigInteger
    //   2090: invokevirtual intValue : ()I
    //   2093: bipush #32
    //   2095: irem
    //   2096: invokestatic abs : (I)I
    //   2099: invokevirtual charAt : (I)C
    //   2102: if_icmpgt -> 2447
    //   2105: sipush #18856
    //   2108: sipush #-19124
    //   2111: invokestatic a : (II)Ljava/lang/String;
    //   2114: iconst_1
    //   2115: ldc burp/Zty2
    //   2117: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2120: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2123: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2126: astore #4
    //   2128: aload #4
    //   2130: arraylength
    //   2131: istore #5
    //   2133: iconst_0
    //   2134: istore #6
    //   2136: iload #6
    //   2138: iload #5
    //   2140: if_icmpge -> 2278
    //   2143: aload #4
    //   2145: iload #6
    //   2147: aaload
    //   2148: astore #7
    //   2150: aload #7
    //   2152: invokevirtual getModifiers : ()I
    //   2155: invokestatic isStatic : (I)Z
    //   2158: ifne -> 2168
    //   2161: goto -> 2271
    //   2164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2167: athrow
    //   2168: aload #7
    //   2170: invokevirtual getType : ()Ljava/lang/Class;
    //   2173: astore #8
    //   2175: aload #8
    //   2177: ifnull -> 2258
    //   2180: aload #8
    //   2182: invokevirtual isPrimitive : ()Z
    //   2185: ifne -> 2258
    //   2188: goto -> 2195
    //   2191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2194: athrow
    //   2195: aload #8
    //   2197: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2200: ifnull -> 2258
    //   2203: goto -> 2210
    //   2206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2209: athrow
    //   2210: aload #8
    //   2212: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2215: invokevirtual getName : ()Ljava/lang/String;
    //   2218: ifnull -> 2258
    //   2221: goto -> 2228
    //   2224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2227: athrow
    //   2228: aload #8
    //   2230: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2233: invokevirtual getName : ()Ljava/lang/String;
    //   2236: sipush #18863
    //   2239: sipush #4337
    //   2242: invokestatic a : (II)Ljava/lang/String;
    //   2245: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2248: ifne -> 2258
    //   2251: goto -> 2258
    //   2254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2257: athrow
    //   2258: aload #7
    //   2260: iconst_1
    //   2261: invokevirtual setAccessible : (Z)V
    //   2264: aload #7
    //   2266: aconst_null
    //   2267: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2270: pop
    //   2271: iinc #6, 1
    //   2274: iload_2
    //   2275: ifne -> 2136
    //   2278: sipush #18853
    //   2281: sipush #29366
    //   2284: invokestatic a : (II)Ljava/lang/String;
    //   2287: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2290: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2293: astore #4
    //   2295: aload #4
    //   2297: arraylength
    //   2298: istore #5
    //   2300: iconst_0
    //   2301: istore #6
    //   2303: iload #6
    //   2305: iload #5
    //   2307: if_icmpge -> 2443
    //   2310: aload #4
    //   2312: iload #6
    //   2314: aaload
    //   2315: astore #7
    //   2317: aload #7
    //   2319: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2322: pop
    //   2323: aload #7
    //   2325: invokevirtual getModifiers : ()I
    //   2328: invokestatic isStatic : (I)Z
    //   2331: ifeq -> 2429
    //   2334: aload #7
    //   2336: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2339: arraylength
    //   2340: iconst_2
    //   2341: if_icmpne -> 2429
    //   2344: goto -> 2351
    //   2347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2350: athrow
    //   2351: aload #7
    //   2353: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2356: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2359: if_acmpne -> 2429
    //   2362: goto -> 2369
    //   2365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2368: athrow
    //   2369: aload #7
    //   2371: iconst_1
    //   2372: invokevirtual setAccessible : (Z)V
    //   2375: aload #7
    //   2377: aconst_null
    //   2378: iconst_2
    //   2379: anewarray java/lang/Object
    //   2382: dup
    //   2383: iconst_0
    //   2384: aload_0
    //   2385: aastore
    //   2386: dup
    //   2387: iconst_1
    //   2388: aload_1
    //   2389: ifnonnull -> 2407
    //   2392: goto -> 2399
    //   2395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2398: athrow
    //   2399: aload_1
    //   2400: goto -> 2414
    //   2403: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2406: athrow
    //   2407: aload_1
    //   2408: checkcast [B
    //   2411: invokevirtual clone : ()Ljava/lang/Object;
    //   2414: aastore
    //   2415: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2418: checkcast java/lang/Boolean
    //   2421: invokevirtual booleanValue : ()Z
    //   2424: istore_3
    //   2425: iload_2
    //   2426: ifne -> 2443
    //   2429: iinc #6, 1
    //   2432: iload_2
    //   2433: ifne -> 2303
    //   2436: goto -> 2443
    //   2439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2442: athrow
    //   2443: iload_2
    //   2444: ifne -> 2785
    //   2447: sipush #18868
    //   2450: sipush #2926
    //   2453: invokestatic a : (II)Ljava/lang/String;
    //   2456: iconst_1
    //   2457: ldc burp/Zzuh
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
    //   2578: sipush #18863
    //   2581: sipush #4337
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
    //   2620: sipush #18854
    //   2623: sipush #25539
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
    //   2785: iload_3
    //   2786: ifeq -> 2791
    //   2789: iload_3
    //   2790: ireturn
    //   2791: getstatic burp/Zttd.Ze : Ljava/lang/String;
    //   2794: getstatic burp/Zelt.ZC : Ljava/lang/Object;
    //   2797: checkcast java/math/BigInteger
    //   2800: invokevirtual intValue : ()I
    //   2803: bipush #32
    //   2805: irem
    //   2806: invokestatic abs : (I)I
    //   2809: invokevirtual charAt : (I)C
    //   2812: getstatic burp/Ze6w.ZY : Ljava/lang/String;
    //   2815: getstatic burp/Zry1.Zf : Ljava/lang/Object;
    //   2818: checkcast java/math/BigInteger
    //   2821: invokevirtual intValue : ()I
    //   2824: bipush #32
    //   2826: irem
    //   2827: invokestatic abs : (I)I
    //   2830: invokevirtual charAt : (I)C
    //   2833: if_icmple -> 3178
    //   2836: sipush #18851
    //   2839: sipush #11333
    //   2842: invokestatic a : (II)Ljava/lang/String;
    //   2845: iconst_1
    //   2846: ldc burp/Zmwx
    //   2848: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2851: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2854: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2857: astore #4
    //   2859: aload #4
    //   2861: arraylength
    //   2862: istore #5
    //   2864: iconst_0
    //   2865: istore #6
    //   2867: iload #6
    //   2869: iload #5
    //   2871: if_icmpge -> 3009
    //   2874: aload #4
    //   2876: iload #6
    //   2878: aaload
    //   2879: astore #7
    //   2881: aload #7
    //   2883: invokevirtual getModifiers : ()I
    //   2886: invokestatic isStatic : (I)Z
    //   2889: ifne -> 2899
    //   2892: goto -> 3002
    //   2895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2898: athrow
    //   2899: aload #7
    //   2901: invokevirtual getType : ()Ljava/lang/Class;
    //   2904: astore #8
    //   2906: aload #8
    //   2908: ifnull -> 2989
    //   2911: aload #8
    //   2913: invokevirtual isPrimitive : ()Z
    //   2916: ifne -> 2989
    //   2919: goto -> 2926
    //   2922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2925: athrow
    //   2926: aload #8
    //   2928: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2931: ifnull -> 2989
    //   2934: goto -> 2941
    //   2937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2940: athrow
    //   2941: aload #8
    //   2943: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2946: invokevirtual getName : ()Ljava/lang/String;
    //   2949: ifnull -> 2989
    //   2952: goto -> 2959
    //   2955: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2958: athrow
    //   2959: aload #8
    //   2961: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2964: invokevirtual getName : ()Ljava/lang/String;
    //   2967: sipush #18863
    //   2970: sipush #4337
    //   2973: invokestatic a : (II)Ljava/lang/String;
    //   2976: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2979: ifne -> 2989
    //   2982: goto -> 2989
    //   2985: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2988: athrow
    //   2989: aload #7
    //   2991: iconst_1
    //   2992: invokevirtual setAccessible : (Z)V
    //   2995: aload #7
    //   2997: aconst_null
    //   2998: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3001: pop
    //   3002: iinc #6, 1
    //   3005: iload_2
    //   3006: ifne -> 2867
    //   3009: sipush #18860
    //   3012: sipush #15796
    //   3015: invokestatic a : (II)Ljava/lang/String;
    //   3018: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3021: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3024: astore #4
    //   3026: aload #4
    //   3028: arraylength
    //   3029: istore #5
    //   3031: iconst_0
    //   3032: istore #6
    //   3034: iload #6
    //   3036: iload #5
    //   3038: if_icmpge -> 3174
    //   3041: aload #4
    //   3043: iload #6
    //   3045: aaload
    //   3046: astore #7
    //   3048: aload #7
    //   3050: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3053: pop
    //   3054: aload #7
    //   3056: invokevirtual getModifiers : ()I
    //   3059: invokestatic isStatic : (I)Z
    //   3062: ifeq -> 3160
    //   3065: aload #7
    //   3067: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3070: arraylength
    //   3071: iconst_2
    //   3072: if_icmpne -> 3160
    //   3075: goto -> 3082
    //   3078: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3081: athrow
    //   3082: aload #7
    //   3084: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3087: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3090: if_acmpne -> 3160
    //   3093: goto -> 3100
    //   3096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3099: athrow
    //   3100: aload #7
    //   3102: iconst_1
    //   3103: invokevirtual setAccessible : (Z)V
    //   3106: aload #7
    //   3108: aconst_null
    //   3109: iconst_2
    //   3110: anewarray java/lang/Object
    //   3113: dup
    //   3114: iconst_0
    //   3115: aload_0
    //   3116: aastore
    //   3117: dup
    //   3118: iconst_1
    //   3119: aload_1
    //   3120: ifnonnull -> 3138
    //   3123: goto -> 3130
    //   3126: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3129: athrow
    //   3130: aload_1
    //   3131: goto -> 3145
    //   3134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3137: athrow
    //   3138: aload_1
    //   3139: checkcast [B
    //   3142: invokevirtual clone : ()Ljava/lang/Object;
    //   3145: aastore
    //   3146: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3149: checkcast java/lang/Boolean
    //   3152: invokevirtual booleanValue : ()Z
    //   3155: istore_3
    //   3156: iload_2
    //   3157: ifne -> 3174
    //   3160: iinc #6, 1
    //   3163: iload_2
    //   3164: ifne -> 3034
    //   3167: goto -> 3174
    //   3170: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3173: athrow
    //   3174: iload_2
    //   3175: ifne -> 3516
    //   3178: sipush #18850
    //   3181: sipush #1448
    //   3184: invokestatic a : (II)Ljava/lang/String;
    //   3187: iconst_1
    //   3188: ldc burp/Zkby
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
    //   3309: sipush #18863
    //   3312: sipush #4337
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
    //   3351: sipush #18848
    //   3354: sipush #13421
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
    //   3516: iload_3
    //   3517: ireturn
    //   3518: astore_3
    //   3519: new java/lang/Exception
    //   3522: dup
    //   3523: aload_3
    //   3524: invokevirtual getMessage : ()Ljava/lang/String;
    //   3527: invokespecial <init> : (Ljava/lang/String;)V
    //   3530: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1328	3518	java/lang/Throwable
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
    //   689	703	703	java/lang/Throwable
    //   714	727	730	java/lang/Throwable
    //   719	742	745	java/lang/Throwable
    //   734	760	763	java/lang/Throwable
    //   749	790	793	java/lang/Throwable
    //   856	883	886	java/lang/Throwable
    //   873	901	904	java/lang/Throwable
    //   890	931	934	java/lang/Throwable
    //   908	942	942	java/lang/Throwable
    //   964	975	978	java/lang/Throwable
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
    //   1329	2059	3518	java/lang/Throwable
    //   1419	1433	1433	java/lang/Throwable
    //   1444	1457	1460	java/lang/Throwable
    //   1449	1472	1475	java/lang/Throwable
    //   1464	1490	1493	java/lang/Throwable
    //   1479	1520	1523	java/lang/Throwable
    //   1586	1613	1616	java/lang/Throwable
    //   1603	1631	1634	java/lang/Throwable
    //   1620	1661	1664	java/lang/Throwable
    //   1638	1672	1672	java/lang/Throwable
    //   1694	1705	1708	java/lang/Throwable
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
    //   2060	2790	3518	java/lang/Throwable
    //   2150	2164	2164	java/lang/Throwable
    //   2175	2188	2191	java/lang/Throwable
    //   2180	2203	2206	java/lang/Throwable
    //   2195	2221	2224	java/lang/Throwable
    //   2210	2251	2254	java/lang/Throwable
    //   2317	2344	2347	java/lang/Throwable
    //   2334	2362	2365	java/lang/Throwable
    //   2351	2392	2395	java/lang/Throwable
    //   2369	2403	2403	java/lang/Throwable
    //   2425	2436	2439	java/lang/Throwable
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
    //   2791	3517	3518	java/lang/Throwable
    //   2881	2895	2895	java/lang/Throwable
    //   2906	2919	2922	java/lang/Throwable
    //   2911	2934	2937	java/lang/Throwable
    //   2926	2952	2955	java/lang/Throwable
    //   2941	2982	2985	java/lang/Throwable
    //   3048	3075	3078	java/lang/Throwable
    //   3065	3093	3096	java/lang/Throwable
    //   3082	3123	3126	java/lang/Throwable
    //   3100	3134	3134	java/lang/Throwable
    //   3156	3167	3170	java/lang/Throwable
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
  }
  
  static void ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÚÆ\\nrGvã\\t":¤ Îs\\tÑkÈkÞýy\\tó/yãèìª&\\tÅ`é¦;ö\\tKÃd¿\\bF(MNM00gÂVÇÄ»èt!g±c|ìÝu«q¨uÑõÜVèA<L&nõ èÆ±4B°ä·8e%G8f\\t\\n\\t¶s¹ «Ú×3NivÓáTÝM2\÷¿/!qÈßHh%õZ×'Ú<\\t2²ìPZ¡µ\\tma*'ÁU°TG \\t·\§!òãÎÙb\\t5;÷Íø~*Y\\t¯3¤Ì^Ìu´\\tÝ»êÝ[|ädÃ\\tZcÆE8@¨ zxq¸%J£) jèT2UZE¿ÕFVU±â\\tö­÷$o#s\\teÇýR¹¦|\\téKlÃ¿ê\\t·§HòÎÏ}7'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #44
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
    //   68: ldc 'ñW¬PtAý@\\tÚNÉ üÍfä'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #11
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
    //   129: putstatic burp/Ztdl.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztdl.b : [Ljava/lang/String;
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
    //   212: bipush #15
    //   214: goto -> 244
    //   217: bipush #29
    //   219: goto -> 244
    //   222: bipush #69
    //   224: goto -> 244
    //   227: bipush #11
    //   229: goto -> 244
    //   232: bipush #21
    //   234: goto -> 244
    //   237: bipush #43
    //   239: goto -> 244
    //   242: bipush #28
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
    //   300: sipush #18858
    //   303: sipush #-12869
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztdl.ZK : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #83
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #70
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-13
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #48
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #16
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #106
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #81
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-42
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #100
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #113
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-2
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-89
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-118
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #-92
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #59
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #23
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #82
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-58
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-48
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #43
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #38
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-105
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-46
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #6
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-3
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #-7
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #-116
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-32
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-92
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #-64
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #24
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #125
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Ztdl.Zw : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x49A3) & 0xFFFF;
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
      char c = 'Ã';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztdl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */