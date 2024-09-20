package burp;

import java.math.BigInteger;

class Zgjj extends ClassLoader {
  static String Zi;
  
  static Object ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zh(Object paramObject) {
    Zbo2.Zr = a(3424, -11412);
    Zbo2.ZQ = new BigInteger(a(3446, -30480));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlbt.ZE.charAt(Math.abs(((BigInteger)Zxf8.Zz).intValue() % 32)) <= Zle6.Zh.charAt(Math.abs(((BigInteger)Zzri.ZG).intValue() % 32))) {
          try {
            Ze_0.ZG(Class.forName(a(3438, 10364)));
            if (bool)
              Ze08.ZT(Class.forName(a(3449, -8359))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ze08.ZT(Class.forName(a(3449, -8359)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #3443
    //   7: sipush #-777
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic Zq : (Ljava/lang/Object;)V
    //   19: getstatic burp/Zxzt.ZY : Ljava/lang/Object;
    //   22: checkcast java/math/BigInteger
    //   25: getstatic burp/Zx4u.Zn : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   34: putstatic burp/Zxti.ZJ : Ljava/lang/Object;
    //   37: ldc2_w 8682522807148012
    //   40: invokestatic currentTimeMillis : ()J
    //   43: lxor
    //   44: lstore #4
    //   46: lload #4
    //   48: ldc2_w 25214903917
    //   51: lmul
    //   52: ldc2_w 11
    //   55: ladd
    //   56: ldc2_w 281474976710655
    //   59: land
    //   60: lstore #4
    //   62: lload #4
    //   64: bipush #32
    //   66: lshl
    //   67: lstore #6
    //   69: lload #4
    //   71: ldc2_w 25214903917
    //   74: lmul
    //   75: ldc2_w 11
    //   78: ladd
    //   79: ldc2_w 281474976710655
    //   82: land
    //   83: lstore #4
    //   85: lload #6
    //   87: lload #4
    //   89: ladd
    //   90: lstore #6
    //   92: bipush #16
    //   94: newarray byte
    //   96: dup
    //   97: iconst_0
    //   98: bipush #48
    //   100: bastore
    //   101: dup
    //   102: iconst_1
    //   103: bipush #49
    //   105: bastore
    //   106: dup
    //   107: iconst_2
    //   108: bipush #50
    //   110: bastore
    //   111: dup
    //   112: iconst_3
    //   113: bipush #51
    //   115: bastore
    //   116: dup
    //   117: iconst_4
    //   118: bipush #52
    //   120: bastore
    //   121: dup
    //   122: iconst_5
    //   123: bipush #53
    //   125: bastore
    //   126: dup
    //   127: bipush #6
    //   129: bipush #54
    //   131: bastore
    //   132: dup
    //   133: bipush #7
    //   135: bipush #55
    //   137: bastore
    //   138: dup
    //   139: bipush #8
    //   141: bipush #56
    //   143: bastore
    //   144: dup
    //   145: bipush #9
    //   147: bipush #57
    //   149: bastore
    //   150: dup
    //   151: bipush #10
    //   153: bipush #97
    //   155: bastore
    //   156: dup
    //   157: bipush #11
    //   159: bipush #98
    //   161: bastore
    //   162: dup
    //   163: bipush #12
    //   165: bipush #99
    //   167: bastore
    //   168: dup
    //   169: bipush #13
    //   171: bipush #100
    //   173: bastore
    //   174: dup
    //   175: bipush #14
    //   177: bipush #101
    //   179: bastore
    //   180: dup
    //   181: bipush #15
    //   183: bipush #102
    //   185: bastore
    //   186: astore #8
    //   188: bipush #64
    //   190: newarray byte
    //   192: astore #9
    //   194: bipush #64
    //   196: istore #10
    //   198: bipush #16
    //   200: istore #11
    //   202: iload #11
    //   204: iconst_1
    //   205: isub
    //   206: i2l
    //   207: lstore #12
    //   209: aload #9
    //   211: iinc #10, -1
    //   214: iload #10
    //   216: aload #8
    //   218: lload #6
    //   220: lload #12
    //   222: land
    //   223: l2i
    //   224: baload
    //   225: bastore
    //   226: lload #6
    //   228: iconst_4
    //   229: lushr
    //   230: lstore #6
    //   232: lload #6
    //   234: lconst_0
    //   235: lcmp
    //   236: ifne -> 209
    //   239: bipush #64
    //   241: iload #10
    //   243: isub
    //   244: newarray byte
    //   246: astore_3
    //   247: iconst_0
    //   248: istore #14
    //   250: iload #14
    //   252: aload_3
    //   253: arraylength
    //   254: if_icmpge -> 276
    //   257: aload_3
    //   258: iload #14
    //   260: aload #9
    //   262: iload #10
    //   264: iload #14
    //   266: iadd
    //   267: baload
    //   268: bastore
    //   269: iinc #14, 1
    //   272: iload_2
    //   273: ifne -> 250
    //   276: aload_3
    //   277: arraylength
    //   278: bipush #10
    //   280: if_icmplt -> 46
    //   283: sipush #3431
    //   286: sipush #29633
    //   289: invokestatic a : (II)Ljava/lang/String;
    //   292: iconst_1
    //   293: ldc burp/Zbo2
    //   295: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   298: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   301: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   304: astore_3
    //   305: aload_3
    //   306: arraylength
    //   307: istore #4
    //   309: iconst_0
    //   310: istore #5
    //   312: iload #5
    //   314: iload #4
    //   316: if_icmpge -> 453
    //   319: aload_3
    //   320: iload #5
    //   322: aaload
    //   323: astore #6
    //   325: aload #6
    //   327: invokevirtual getModifiers : ()I
    //   330: invokestatic isStatic : (I)Z
    //   333: ifne -> 343
    //   336: goto -> 446
    //   339: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   342: athrow
    //   343: aload #6
    //   345: invokevirtual getType : ()Ljava/lang/Class;
    //   348: astore #7
    //   350: aload #7
    //   352: ifnull -> 433
    //   355: aload #7
    //   357: invokevirtual isPrimitive : ()Z
    //   360: ifne -> 433
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   369: athrow
    //   370: aload #7
    //   372: invokevirtual getPackage : ()Ljava/lang/Package;
    //   375: ifnull -> 433
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   384: athrow
    //   385: aload #7
    //   387: invokevirtual getPackage : ()Ljava/lang/Package;
    //   390: invokevirtual getName : ()Ljava/lang/String;
    //   393: ifnull -> 433
    //   396: goto -> 403
    //   399: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   402: athrow
    //   403: aload #7
    //   405: invokevirtual getPackage : ()Ljava/lang/Package;
    //   408: invokevirtual getName : ()Ljava/lang/String;
    //   411: sipush #3454
    //   414: sipush #-11063
    //   417: invokestatic a : (II)Ljava/lang/String;
    //   420: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   423: ifne -> 433
    //   426: goto -> 433
    //   429: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   432: athrow
    //   433: aload #6
    //   435: iconst_1
    //   436: invokevirtual setAccessible : (Z)V
    //   439: aload #6
    //   441: aconst_null
    //   442: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   445: pop
    //   446: iinc #5, 1
    //   449: iload_2
    //   450: ifne -> 312
    //   453: sipush #3448
    //   456: sipush #-25195
    //   459: invokestatic a : (II)Ljava/lang/String;
    //   462: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   465: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   468: astore_3
    //   469: aload_3
    //   470: arraylength
    //   471: istore #4
    //   473: iconst_0
    //   474: istore #5
    //   476: iload #5
    //   478: iload #4
    //   480: if_icmpge -> 609
    //   483: aload_3
    //   484: iload #5
    //   486: aaload
    //   487: astore #6
    //   489: aload #6
    //   491: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   494: pop
    //   495: aload #6
    //   497: invokevirtual getModifiers : ()I
    //   500: invokestatic isStatic : (I)Z
    //   503: ifeq -> 595
    //   506: aload #6
    //   508: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   511: arraylength
    //   512: iconst_2
    //   513: if_icmpne -> 595
    //   516: goto -> 523
    //   519: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   522: athrow
    //   523: aload #6
    //   525: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   528: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   531: if_acmpne -> 595
    //   534: goto -> 541
    //   537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   540: athrow
    //   541: aload #6
    //   543: iconst_1
    //   544: invokevirtual setAccessible : (Z)V
    //   547: aload #6
    //   549: aconst_null
    //   550: iconst_2
    //   551: anewarray java/lang/Object
    //   554: dup
    //   555: iconst_0
    //   556: aload_0
    //   557: aastore
    //   558: dup
    //   559: iconst_1
    //   560: aload_1
    //   561: ifnonnull -> 579
    //   564: goto -> 571
    //   567: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   570: athrow
    //   571: aload_1
    //   572: goto -> 586
    //   575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   578: athrow
    //   579: aload_1
    //   580: checkcast [B
    //   583: invokevirtual clone : ()Ljava/lang/Object;
    //   586: aastore
    //   587: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   590: pop
    //   591: iload_2
    //   592: ifne -> 609
    //   595: iinc #5, 1
    //   598: iload_2
    //   599: ifne -> 476
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   608: athrow
    //   609: sipush #3440
    //   612: sipush #20691
    //   615: invokestatic a : (II)Ljava/lang/String;
    //   618: iconst_1
    //   619: ldc burp/Zb38
    //   621: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   624: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   627: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   630: astore_3
    //   631: aload_3
    //   632: arraylength
    //   633: istore #4
    //   635: iconst_0
    //   636: istore #5
    //   638: iload #5
    //   640: iload #4
    //   642: if_icmpge -> 779
    //   645: aload_3
    //   646: iload #5
    //   648: aaload
    //   649: astore #6
    //   651: aload #6
    //   653: invokevirtual getModifiers : ()I
    //   656: invokestatic isStatic : (I)Z
    //   659: ifne -> 669
    //   662: goto -> 772
    //   665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   668: athrow
    //   669: aload #6
    //   671: invokevirtual getType : ()Ljava/lang/Class;
    //   674: astore #7
    //   676: aload #7
    //   678: ifnull -> 759
    //   681: aload #7
    //   683: invokevirtual isPrimitive : ()Z
    //   686: ifne -> 759
    //   689: goto -> 696
    //   692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   695: athrow
    //   696: aload #7
    //   698: invokevirtual getPackage : ()Ljava/lang/Package;
    //   701: ifnull -> 759
    //   704: goto -> 711
    //   707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   710: athrow
    //   711: aload #7
    //   713: invokevirtual getPackage : ()Ljava/lang/Package;
    //   716: invokevirtual getName : ()Ljava/lang/String;
    //   719: ifnull -> 759
    //   722: goto -> 729
    //   725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   728: athrow
    //   729: aload #7
    //   731: invokevirtual getPackage : ()Ljava/lang/Package;
    //   734: invokevirtual getName : ()Ljava/lang/String;
    //   737: sipush #3452
    //   740: sipush #26417
    //   743: invokestatic a : (II)Ljava/lang/String;
    //   746: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   749: ifne -> 759
    //   752: goto -> 759
    //   755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   758: athrow
    //   759: aload #6
    //   761: iconst_1
    //   762: invokevirtual setAccessible : (Z)V
    //   765: aload #6
    //   767: aconst_null
    //   768: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   771: pop
    //   772: iinc #5, 1
    //   775: iload_2
    //   776: ifne -> 638
    //   779: sipush #3425
    //   782: sipush #-31806
    //   785: invokestatic a : (II)Ljava/lang/String;
    //   788: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   791: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   794: astore_3
    //   795: aload_3
    //   796: arraylength
    //   797: istore #4
    //   799: iconst_0
    //   800: istore #5
    //   802: iload #5
    //   804: iload #4
    //   806: if_icmpge -> 938
    //   809: aload_3
    //   810: iload #5
    //   812: aaload
    //   813: astore #6
    //   815: aload #6
    //   817: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   820: pop
    //   821: aload #6
    //   823: invokevirtual getModifiers : ()I
    //   826: invokestatic isStatic : (I)Z
    //   829: ifeq -> 924
    //   832: aload #6
    //   834: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   837: arraylength
    //   838: iconst_2
    //   839: if_icmpne -> 924
    //   842: goto -> 849
    //   845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   848: athrow
    //   849: aload #6
    //   851: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   854: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   857: invokevirtual equals : (Ljava/lang/Object;)Z
    //   860: ifeq -> 924
    //   863: goto -> 870
    //   866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   869: athrow
    //   870: aload #6
    //   872: iconst_1
    //   873: invokevirtual setAccessible : (Z)V
    //   876: aload #6
    //   878: aconst_null
    //   879: iconst_2
    //   880: anewarray java/lang/Object
    //   883: dup
    //   884: iconst_0
    //   885: aload_0
    //   886: aastore
    //   887: dup
    //   888: iconst_1
    //   889: aload_1
    //   890: ifnonnull -> 908
    //   893: goto -> 900
    //   896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   899: athrow
    //   900: aload_1
    //   901: goto -> 915
    //   904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   907: athrow
    //   908: aload_1
    //   909: checkcast [B
    //   912: invokevirtual clone : ()Ljava/lang/Object;
    //   915: aastore
    //   916: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   919: pop
    //   920: iload_2
    //   921: ifne -> 938
    //   924: iinc #5, 1
    //   927: iload_2
    //   928: ifne -> 802
    //   931: goto -> 938
    //   934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   937: athrow
    //   938: new java/io/ByteArrayOutputStream
    //   941: dup
    //   942: invokespecial <init> : ()V
    //   945: astore_3
    //   946: sipush #3447
    //   949: aload_3
    //   950: sipush #202
    //   953: invokevirtual write : (I)V
    //   956: sipush #-9041
    //   959: aload_3
    //   960: sipush #254
    //   963: invokevirtual write : (I)V
    //   966: aload_3
    //   967: sipush #186
    //   970: invokevirtual write : (I)V
    //   973: aload_3
    //   974: sipush #190
    //   977: invokevirtual write : (I)V
    //   980: aload_3
    //   981: iconst_0
    //   982: invokevirtual write : (I)V
    //   985: aload_3
    //   986: iconst_1
    //   987: invokevirtual write : (I)V
    //   990: aload_3
    //   991: iconst_0
    //   992: invokevirtual write : (I)V
    //   995: aload_3
    //   996: bipush #50
    //   998: invokevirtual write : (I)V
    //   1001: aload_3
    //   1002: getstatic burp/Zktq.Zn : Ljava/lang/Object;
    //   1005: checkcast java/math/BigInteger
    //   1008: invokevirtual toByteArray : ()[B
    //   1011: invokevirtual write : ([B)V
    //   1014: aload_3
    //   1015: getstatic burp/Zli5.Zt : Ljava/lang/Object;
    //   1018: checkcast java/math/BigInteger
    //   1021: invokevirtual toByteArray : ()[B
    //   1024: invokevirtual write : ([B)V
    //   1027: aload_3
    //   1028: getstatic burp/Ze4x.Zp : Ljava/lang/Object;
    //   1031: checkcast java/math/BigInteger
    //   1034: invokevirtual toByteArray : ()[B
    //   1037: invokevirtual write : ([B)V
    //   1040: aload_3
    //   1041: invokevirtual toByteArray : ()[B
    //   1044: astore #4
    //   1046: aconst_null
    //   1047: astore #5
    //   1049: invokestatic a : (II)Ljava/lang/String;
    //   1052: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1055: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1058: astore #6
    //   1060: aload #6
    //   1062: arraylength
    //   1063: istore #7
    //   1065: iconst_0
    //   1066: istore #8
    //   1068: iload #8
    //   1070: iload #7
    //   1072: if_icmpge -> 1200
    //   1075: aload #6
    //   1077: iload #8
    //   1079: aaload
    //   1080: astore #9
    //   1082: aload #9
    //   1084: invokevirtual getName : ()Ljava/lang/String;
    //   1087: sipush #3444
    //   1090: sipush #27596
    //   1093: invokestatic a : (II)Ljava/lang/String;
    //   1096: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1099: ifeq -> 1193
    //   1102: aload #9
    //   1104: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1107: astore #10
    //   1109: aload #10
    //   1111: arraylength
    //   1112: iconst_4
    //   1113: if_icmpeq -> 1123
    //   1116: goto -> 1193
    //   1119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1122: athrow
    //   1123: aload #10
    //   1125: iconst_0
    //   1126: aaload
    //   1127: ldc java/lang/String
    //   1129: if_acmpeq -> 1139
    //   1132: goto -> 1193
    //   1135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1138: athrow
    //   1139: aload #10
    //   1141: iconst_1
    //   1142: aaload
    //   1143: ldc [B
    //   1145: if_acmpeq -> 1155
    //   1148: goto -> 1193
    //   1151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1154: athrow
    //   1155: aload #10
    //   1157: iconst_2
    //   1158: aaload
    //   1159: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1162: if_acmpeq -> 1172
    //   1165: goto -> 1193
    //   1168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1171: athrow
    //   1172: aload #10
    //   1174: iconst_3
    //   1175: aaload
    //   1176: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1179: if_acmpeq -> 1189
    //   1182: goto -> 1193
    //   1185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1188: athrow
    //   1189: aload #9
    //   1191: astore #5
    //   1193: iinc #8, 1
    //   1196: iload_2
    //   1197: ifne -> 1068
    //   1200: aload #5
    //   1202: iconst_1
    //   1203: invokevirtual setAccessible : (Z)V
    //   1206: ldc burp/Zrod
    //   1208: iconst_0
    //   1209: anewarray java/lang/Class
    //   1212: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1215: astore #6
    //   1217: aload #6
    //   1219: iconst_1
    //   1220: invokevirtual setAccessible : (Z)V
    //   1223: aload #5
    //   1225: aload #6
    //   1227: iconst_0
    //   1228: anewarray java/lang/Object
    //   1231: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1234: iconst_4
    //   1235: anewarray java/lang/Object
    //   1238: dup
    //   1239: iconst_0
    //   1240: sipush #3428
    //   1243: sipush #10836
    //   1246: invokestatic a : (II)Ljava/lang/String;
    //   1249: aastore
    //   1250: dup
    //   1251: iconst_1
    //   1252: aload #4
    //   1254: aastore
    //   1255: dup
    //   1256: iconst_2
    //   1257: iconst_0
    //   1258: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1261: aastore
    //   1262: dup
    //   1263: iconst_3
    //   1264: aload #4
    //   1266: arraylength
    //   1267: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1270: aastore
    //   1271: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1274: pop
    //   1275: goto -> 1279
    //   1278: astore_3
    //   1279: iconst_0
    //   1280: istore_3
    //   1281: getstatic burp/Zgds.ZA : Ljava/lang/String;
    //   1284: getstatic burp/Zbqk.ZT : Ljava/lang/Object;
    //   1287: checkcast java/math/BigInteger
    //   1290: invokevirtual intValue : ()I
    //   1293: bipush #32
    //   1295: irem
    //   1296: invokestatic abs : (I)I
    //   1299: invokevirtual charAt : (I)C
    //   1302: getstatic burp/Zg68.Zg : Ljava/lang/String;
    //   1305: getstatic burp/Zxzp.Zh : Ljava/lang/Object;
    //   1308: checkcast java/math/BigInteger
    //   1311: invokevirtual intValue : ()I
    //   1314: bipush #32
    //   1316: irem
    //   1317: invokestatic abs : (I)I
    //   1320: invokevirtual charAt : (I)C
    //   1323: if_icmpgt -> 1668
    //   1326: sipush #3432
    //   1329: sipush #-2858
    //   1332: invokestatic a : (II)Ljava/lang/String;
    //   1335: iconst_1
    //   1336: ldc burp/Zkco
    //   1338: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1341: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1344: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1347: astore #4
    //   1349: aload #4
    //   1351: arraylength
    //   1352: istore #5
    //   1354: iconst_0
    //   1355: istore #6
    //   1357: iload #6
    //   1359: iload #5
    //   1361: if_icmpge -> 1499
    //   1364: aload #4
    //   1366: iload #6
    //   1368: aaload
    //   1369: astore #7
    //   1371: aload #7
    //   1373: invokevirtual getModifiers : ()I
    //   1376: invokestatic isStatic : (I)Z
    //   1379: ifne -> 1389
    //   1382: goto -> 1492
    //   1385: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1388: athrow
    //   1389: aload #7
    //   1391: invokevirtual getType : ()Ljava/lang/Class;
    //   1394: astore #8
    //   1396: aload #8
    //   1398: ifnull -> 1479
    //   1401: aload #8
    //   1403: invokevirtual isPrimitive : ()Z
    //   1406: ifne -> 1479
    //   1409: goto -> 1416
    //   1412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1415: athrow
    //   1416: aload #8
    //   1418: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1421: ifnull -> 1479
    //   1424: goto -> 1431
    //   1427: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1430: athrow
    //   1431: aload #8
    //   1433: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1436: invokevirtual getName : ()Ljava/lang/String;
    //   1439: ifnull -> 1479
    //   1442: goto -> 1449
    //   1445: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1448: athrow
    //   1449: aload #8
    //   1451: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1454: invokevirtual getName : ()Ljava/lang/String;
    //   1457: sipush #3452
    //   1460: sipush #26417
    //   1463: invokestatic a : (II)Ljava/lang/String;
    //   1466: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1469: ifne -> 1479
    //   1472: goto -> 1479
    //   1475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1478: athrow
    //   1479: aload #7
    //   1481: iconst_1
    //   1482: invokevirtual setAccessible : (Z)V
    //   1485: aload #7
    //   1487: aconst_null
    //   1488: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1491: pop
    //   1492: iinc #6, 1
    //   1495: iload_2
    //   1496: ifne -> 1357
    //   1499: sipush #3437
    //   1502: sipush #-27000
    //   1505: invokestatic a : (II)Ljava/lang/String;
    //   1508: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1511: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1514: astore #4
    //   1516: aload #4
    //   1518: arraylength
    //   1519: istore #5
    //   1521: iconst_0
    //   1522: istore #6
    //   1524: iload #6
    //   1526: iload #5
    //   1528: if_icmpge -> 1664
    //   1531: aload #4
    //   1533: iload #6
    //   1535: aaload
    //   1536: astore #7
    //   1538: aload #7
    //   1540: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1543: pop
    //   1544: aload #7
    //   1546: invokevirtual getModifiers : ()I
    //   1549: invokestatic isStatic : (I)Z
    //   1552: ifeq -> 1650
    //   1555: aload #7
    //   1557: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1560: arraylength
    //   1561: iconst_2
    //   1562: if_icmpne -> 1650
    //   1565: goto -> 1572
    //   1568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1571: athrow
    //   1572: aload #7
    //   1574: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1577: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1580: if_acmpne -> 1650
    //   1583: goto -> 1590
    //   1586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1589: athrow
    //   1590: aload #7
    //   1592: iconst_1
    //   1593: invokevirtual setAccessible : (Z)V
    //   1596: aload #7
    //   1598: aconst_null
    //   1599: iconst_2
    //   1600: anewarray java/lang/Object
    //   1603: dup
    //   1604: iconst_0
    //   1605: aload_0
    //   1606: aastore
    //   1607: dup
    //   1608: iconst_1
    //   1609: aload_1
    //   1610: ifnonnull -> 1628
    //   1613: goto -> 1620
    //   1616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1619: athrow
    //   1620: aload_1
    //   1621: goto -> 1635
    //   1624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1627: athrow
    //   1628: aload_1
    //   1629: checkcast [B
    //   1632: invokevirtual clone : ()Ljava/lang/Object;
    //   1635: aastore
    //   1636: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1639: checkcast java/lang/Boolean
    //   1642: invokevirtual booleanValue : ()Z
    //   1645: istore_3
    //   1646: iload_2
    //   1647: ifne -> 1664
    //   1650: iinc #6, 1
    //   1653: iload_2
    //   1654: ifne -> 1524
    //   1657: goto -> 1664
    //   1660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1663: athrow
    //   1664: iload_2
    //   1665: ifne -> 2006
    //   1668: sipush #3445
    //   1671: sipush #-30874
    //   1674: invokestatic a : (II)Ljava/lang/String;
    //   1677: iconst_1
    //   1678: ldc burp/Zbsr
    //   1680: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1683: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1686: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1689: astore #4
    //   1691: aload #4
    //   1693: arraylength
    //   1694: istore #5
    //   1696: iconst_0
    //   1697: istore #6
    //   1699: iload #6
    //   1701: iload #5
    //   1703: if_icmpge -> 1841
    //   1706: aload #4
    //   1708: iload #6
    //   1710: aaload
    //   1711: astore #7
    //   1713: aload #7
    //   1715: invokevirtual getModifiers : ()I
    //   1718: invokestatic isStatic : (I)Z
    //   1721: ifne -> 1731
    //   1724: goto -> 1834
    //   1727: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1730: athrow
    //   1731: aload #7
    //   1733: invokevirtual getType : ()Ljava/lang/Class;
    //   1736: astore #8
    //   1738: aload #8
    //   1740: ifnull -> 1821
    //   1743: aload #8
    //   1745: invokevirtual isPrimitive : ()Z
    //   1748: ifne -> 1821
    //   1751: goto -> 1758
    //   1754: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1757: athrow
    //   1758: aload #8
    //   1760: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1763: ifnull -> 1821
    //   1766: goto -> 1773
    //   1769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1772: athrow
    //   1773: aload #8
    //   1775: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1778: invokevirtual getName : ()Ljava/lang/String;
    //   1781: ifnull -> 1821
    //   1784: goto -> 1791
    //   1787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1790: athrow
    //   1791: aload #8
    //   1793: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1796: invokevirtual getName : ()Ljava/lang/String;
    //   1799: sipush #3452
    //   1802: sipush #26417
    //   1805: invokestatic a : (II)Ljava/lang/String;
    //   1808: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1811: ifne -> 1821
    //   1814: goto -> 1821
    //   1817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1820: athrow
    //   1821: aload #7
    //   1823: iconst_1
    //   1824: invokevirtual setAccessible : (Z)V
    //   1827: aload #7
    //   1829: aconst_null
    //   1830: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1833: pop
    //   1834: iinc #6, 1
    //   1837: iload_2
    //   1838: ifne -> 1699
    //   1841: sipush #3455
    //   1844: sipush #722
    //   1847: invokestatic a : (II)Ljava/lang/String;
    //   1850: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1853: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1856: astore #4
    //   1858: aload #4
    //   1860: arraylength
    //   1861: istore #5
    //   1863: iconst_0
    //   1864: istore #6
    //   1866: iload #6
    //   1868: iload #5
    //   1870: if_icmpge -> 2006
    //   1873: aload #4
    //   1875: iload #6
    //   1877: aaload
    //   1878: astore #7
    //   1880: aload #7
    //   1882: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1885: pop
    //   1886: aload #7
    //   1888: invokevirtual getModifiers : ()I
    //   1891: invokestatic isStatic : (I)Z
    //   1894: ifeq -> 1992
    //   1897: aload #7
    //   1899: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1902: arraylength
    //   1903: iconst_2
    //   1904: if_icmpne -> 1992
    //   1907: goto -> 1914
    //   1910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1913: athrow
    //   1914: aload #7
    //   1916: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1919: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1922: if_acmpne -> 1992
    //   1925: goto -> 1932
    //   1928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1931: athrow
    //   1932: aload #7
    //   1934: iconst_1
    //   1935: invokevirtual setAccessible : (Z)V
    //   1938: aload #7
    //   1940: aconst_null
    //   1941: iconst_2
    //   1942: anewarray java/lang/Object
    //   1945: dup
    //   1946: iconst_0
    //   1947: aload_0
    //   1948: aastore
    //   1949: dup
    //   1950: iconst_1
    //   1951: aload_1
    //   1952: ifnonnull -> 1970
    //   1955: goto -> 1962
    //   1958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1961: athrow
    //   1962: aload_1
    //   1963: goto -> 1977
    //   1966: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1969: athrow
    //   1970: aload_1
    //   1971: checkcast [B
    //   1974: invokevirtual clone : ()Ljava/lang/Object;
    //   1977: aastore
    //   1978: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1981: checkcast java/lang/Boolean
    //   1984: invokevirtual booleanValue : ()Z
    //   1987: istore_3
    //   1988: iload_2
    //   1989: ifne -> 2006
    //   1992: iinc #6, 1
    //   1995: iload_2
    //   1996: ifne -> 1866
    //   1999: goto -> 2006
    //   2002: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2005: athrow
    //   2006: iload_3
    //   2007: ifeq -> 2012
    //   2010: iload_3
    //   2011: ireturn
    //   2012: getstatic burp/Zzri.ZL : Ljava/lang/String;
    //   2015: getstatic burp/Zeuz.Zp : Ljava/lang/Object;
    //   2018: checkcast java/math/BigInteger
    //   2021: invokevirtual intValue : ()I
    //   2024: bipush #32
    //   2026: irem
    //   2027: invokestatic abs : (I)I
    //   2030: invokevirtual charAt : (I)C
    //   2033: getstatic burp/Zxo4.ZW : Ljava/lang/String;
    //   2036: getstatic burp/Ztip.Zc : Ljava/lang/Object;
    //   2039: checkcast java/math/BigInteger
    //   2042: invokevirtual intValue : ()I
    //   2045: bipush #32
    //   2047: irem
    //   2048: invokestatic abs : (I)I
    //   2051: invokevirtual charAt : (I)C
    //   2054: if_icmple -> 2399
    //   2057: sipush #3441
    //   2060: sipush #8309
    //   2063: invokestatic a : (II)Ljava/lang/String;
    //   2066: iconst_1
    //   2067: ldc burp/Zm4k
    //   2069: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2072: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2075: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2078: astore #4
    //   2080: aload #4
    //   2082: arraylength
    //   2083: istore #5
    //   2085: iconst_0
    //   2086: istore #6
    //   2088: iload #6
    //   2090: iload #5
    //   2092: if_icmpge -> 2230
    //   2095: aload #4
    //   2097: iload #6
    //   2099: aaload
    //   2100: astore #7
    //   2102: aload #7
    //   2104: invokevirtual getModifiers : ()I
    //   2107: invokestatic isStatic : (I)Z
    //   2110: ifne -> 2120
    //   2113: goto -> 2223
    //   2116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2119: athrow
    //   2120: aload #7
    //   2122: invokevirtual getType : ()Ljava/lang/Class;
    //   2125: astore #8
    //   2127: aload #8
    //   2129: ifnull -> 2210
    //   2132: aload #8
    //   2134: invokevirtual isPrimitive : ()Z
    //   2137: ifne -> 2210
    //   2140: goto -> 2147
    //   2143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2146: athrow
    //   2147: aload #8
    //   2149: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2152: ifnull -> 2210
    //   2155: goto -> 2162
    //   2158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2161: athrow
    //   2162: aload #8
    //   2164: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2167: invokevirtual getName : ()Ljava/lang/String;
    //   2170: ifnull -> 2210
    //   2173: goto -> 2180
    //   2176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2179: athrow
    //   2180: aload #8
    //   2182: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2185: invokevirtual getName : ()Ljava/lang/String;
    //   2188: sipush #3452
    //   2191: sipush #26417
    //   2194: invokestatic a : (II)Ljava/lang/String;
    //   2197: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2200: ifne -> 2210
    //   2203: goto -> 2210
    //   2206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2209: athrow
    //   2210: aload #7
    //   2212: iconst_1
    //   2213: invokevirtual setAccessible : (Z)V
    //   2216: aload #7
    //   2218: aconst_null
    //   2219: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2222: pop
    //   2223: iinc #6, 1
    //   2226: iload_2
    //   2227: ifne -> 2088
    //   2230: sipush #3450
    //   2233: sipush #3051
    //   2236: invokestatic a : (II)Ljava/lang/String;
    //   2239: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2242: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2245: astore #4
    //   2247: aload #4
    //   2249: arraylength
    //   2250: istore #5
    //   2252: iconst_0
    //   2253: istore #6
    //   2255: iload #6
    //   2257: iload #5
    //   2259: if_icmpge -> 2395
    //   2262: aload #4
    //   2264: iload #6
    //   2266: aaload
    //   2267: astore #7
    //   2269: aload #7
    //   2271: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2274: pop
    //   2275: aload #7
    //   2277: invokevirtual getModifiers : ()I
    //   2280: invokestatic isStatic : (I)Z
    //   2283: ifeq -> 2381
    //   2286: aload #7
    //   2288: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2291: arraylength
    //   2292: iconst_2
    //   2293: if_icmpne -> 2381
    //   2296: goto -> 2303
    //   2299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2302: athrow
    //   2303: aload #7
    //   2305: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2308: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2311: if_acmpne -> 2381
    //   2314: goto -> 2321
    //   2317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2320: athrow
    //   2321: aload #7
    //   2323: iconst_1
    //   2324: invokevirtual setAccessible : (Z)V
    //   2327: aload #7
    //   2329: aconst_null
    //   2330: iconst_2
    //   2331: anewarray java/lang/Object
    //   2334: dup
    //   2335: iconst_0
    //   2336: aload_0
    //   2337: aastore
    //   2338: dup
    //   2339: iconst_1
    //   2340: aload_1
    //   2341: ifnonnull -> 2359
    //   2344: goto -> 2351
    //   2347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2350: athrow
    //   2351: aload_1
    //   2352: goto -> 2366
    //   2355: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2358: athrow
    //   2359: aload_1
    //   2360: checkcast [B
    //   2363: invokevirtual clone : ()Ljava/lang/Object;
    //   2366: aastore
    //   2367: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2370: checkcast java/lang/Boolean
    //   2373: invokevirtual booleanValue : ()Z
    //   2376: istore_3
    //   2377: iload_2
    //   2378: ifne -> 2395
    //   2381: iinc #6, 1
    //   2384: iload_2
    //   2385: ifne -> 2255
    //   2388: goto -> 2395
    //   2391: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2394: athrow
    //   2395: iload_2
    //   2396: ifne -> 2737
    //   2399: sipush #3433
    //   2402: sipush #19129
    //   2405: invokestatic a : (II)Ljava/lang/String;
    //   2408: iconst_1
    //   2409: ldc burp/Ztev
    //   2411: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2414: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2417: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2420: astore #4
    //   2422: aload #4
    //   2424: arraylength
    //   2425: istore #5
    //   2427: iconst_0
    //   2428: istore #6
    //   2430: iload #6
    //   2432: iload #5
    //   2434: if_icmpge -> 2572
    //   2437: aload #4
    //   2439: iload #6
    //   2441: aaload
    //   2442: astore #7
    //   2444: aload #7
    //   2446: invokevirtual getModifiers : ()I
    //   2449: invokestatic isStatic : (I)Z
    //   2452: ifne -> 2462
    //   2455: goto -> 2565
    //   2458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2461: athrow
    //   2462: aload #7
    //   2464: invokevirtual getType : ()Ljava/lang/Class;
    //   2467: astore #8
    //   2469: aload #8
    //   2471: ifnull -> 2552
    //   2474: aload #8
    //   2476: invokevirtual isPrimitive : ()Z
    //   2479: ifne -> 2552
    //   2482: goto -> 2489
    //   2485: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2488: athrow
    //   2489: aload #8
    //   2491: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2494: ifnull -> 2552
    //   2497: goto -> 2504
    //   2500: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2503: athrow
    //   2504: aload #8
    //   2506: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2509: invokevirtual getName : ()Ljava/lang/String;
    //   2512: ifnull -> 2552
    //   2515: goto -> 2522
    //   2518: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2521: athrow
    //   2522: aload #8
    //   2524: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2527: invokevirtual getName : ()Ljava/lang/String;
    //   2530: sipush #3452
    //   2533: sipush #26417
    //   2536: invokestatic a : (II)Ljava/lang/String;
    //   2539: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2542: ifne -> 2552
    //   2545: goto -> 2552
    //   2548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2551: athrow
    //   2552: aload #7
    //   2554: iconst_1
    //   2555: invokevirtual setAccessible : (Z)V
    //   2558: aload #7
    //   2560: aconst_null
    //   2561: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2564: pop
    //   2565: iinc #6, 1
    //   2568: iload_2
    //   2569: ifne -> 2430
    //   2572: sipush #3429
    //   2575: sipush #-31493
    //   2578: invokestatic a : (II)Ljava/lang/String;
    //   2581: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2584: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2587: astore #4
    //   2589: aload #4
    //   2591: arraylength
    //   2592: istore #5
    //   2594: iconst_0
    //   2595: istore #6
    //   2597: iload #6
    //   2599: iload #5
    //   2601: if_icmpge -> 2737
    //   2604: aload #4
    //   2606: iload #6
    //   2608: aaload
    //   2609: astore #7
    //   2611: aload #7
    //   2613: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2616: pop
    //   2617: aload #7
    //   2619: invokevirtual getModifiers : ()I
    //   2622: invokestatic isStatic : (I)Z
    //   2625: ifeq -> 2723
    //   2628: aload #7
    //   2630: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2633: arraylength
    //   2634: iconst_2
    //   2635: if_icmpne -> 2723
    //   2638: goto -> 2645
    //   2641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2644: athrow
    //   2645: aload #7
    //   2647: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2650: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2653: if_acmpne -> 2723
    //   2656: goto -> 2663
    //   2659: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2662: athrow
    //   2663: aload #7
    //   2665: iconst_1
    //   2666: invokevirtual setAccessible : (Z)V
    //   2669: aload #7
    //   2671: aconst_null
    //   2672: iconst_2
    //   2673: anewarray java/lang/Object
    //   2676: dup
    //   2677: iconst_0
    //   2678: aload_0
    //   2679: aastore
    //   2680: dup
    //   2681: iconst_1
    //   2682: aload_1
    //   2683: ifnonnull -> 2701
    //   2686: goto -> 2693
    //   2689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2692: athrow
    //   2693: aload_1
    //   2694: goto -> 2708
    //   2697: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2700: athrow
    //   2701: aload_1
    //   2702: checkcast [B
    //   2705: invokevirtual clone : ()Ljava/lang/Object;
    //   2708: aastore
    //   2709: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2712: checkcast java/lang/Boolean
    //   2715: invokevirtual booleanValue : ()Z
    //   2718: istore_3
    //   2719: iload_2
    //   2720: ifne -> 2737
    //   2723: iinc #6, 1
    //   2726: iload_2
    //   2727: ifne -> 2597
    //   2730: goto -> 2737
    //   2733: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2736: athrow
    //   2737: iload_3
    //   2738: ifeq -> 2743
    //   2741: iload_3
    //   2742: ireturn
    //   2743: getstatic burp/Zmgl.Zh : Ljava/lang/String;
    //   2746: getstatic burp/Zxf8.Zz : Ljava/lang/Object;
    //   2749: checkcast java/math/BigInteger
    //   2752: invokevirtual intValue : ()I
    //   2755: bipush #32
    //   2757: irem
    //   2758: invokestatic abs : (I)I
    //   2761: invokevirtual charAt : (I)C
    //   2764: getstatic burp/Zg7w.ZI : Ljava/lang/String;
    //   2767: getstatic burp/Zlxs.ZK : Ljava/lang/Object;
    //   2770: checkcast java/math/BigInteger
    //   2773: invokevirtual intValue : ()I
    //   2776: bipush #32
    //   2778: irem
    //   2779: invokestatic abs : (I)I
    //   2782: invokevirtual charAt : (I)C
    //   2785: if_icmpgt -> 3130
    //   2788: sipush #3426
    //   2791: sipush #12671
    //   2794: invokestatic a : (II)Ljava/lang/String;
    //   2797: iconst_1
    //   2798: ldc burp/Zs9x
    //   2800: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2803: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2806: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2809: astore #4
    //   2811: aload #4
    //   2813: arraylength
    //   2814: istore #5
    //   2816: iconst_0
    //   2817: istore #6
    //   2819: iload #6
    //   2821: iload #5
    //   2823: if_icmpge -> 2961
    //   2826: aload #4
    //   2828: iload #6
    //   2830: aaload
    //   2831: astore #7
    //   2833: aload #7
    //   2835: invokevirtual getModifiers : ()I
    //   2838: invokestatic isStatic : (I)Z
    //   2841: ifne -> 2851
    //   2844: goto -> 2954
    //   2847: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2850: athrow
    //   2851: aload #7
    //   2853: invokevirtual getType : ()Ljava/lang/Class;
    //   2856: astore #8
    //   2858: aload #8
    //   2860: ifnull -> 2941
    //   2863: aload #8
    //   2865: invokevirtual isPrimitive : ()Z
    //   2868: ifne -> 2941
    //   2871: goto -> 2878
    //   2874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2877: athrow
    //   2878: aload #8
    //   2880: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2883: ifnull -> 2941
    //   2886: goto -> 2893
    //   2889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2892: athrow
    //   2893: aload #8
    //   2895: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2898: invokevirtual getName : ()Ljava/lang/String;
    //   2901: ifnull -> 2941
    //   2904: goto -> 2911
    //   2907: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2910: athrow
    //   2911: aload #8
    //   2913: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2916: invokevirtual getName : ()Ljava/lang/String;
    //   2919: sipush #3452
    //   2922: sipush #26417
    //   2925: invokestatic a : (II)Ljava/lang/String;
    //   2928: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2931: ifne -> 2941
    //   2934: goto -> 2941
    //   2937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2940: athrow
    //   2941: aload #7
    //   2943: iconst_1
    //   2944: invokevirtual setAccessible : (Z)V
    //   2947: aload #7
    //   2949: aconst_null
    //   2950: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2953: pop
    //   2954: iinc #6, 1
    //   2957: iload_2
    //   2958: ifne -> 2819
    //   2961: sipush #3430
    //   2964: sipush #16388
    //   2967: invokestatic a : (II)Ljava/lang/String;
    //   2970: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2973: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2976: astore #4
    //   2978: aload #4
    //   2980: arraylength
    //   2981: istore #5
    //   2983: iconst_0
    //   2984: istore #6
    //   2986: iload #6
    //   2988: iload #5
    //   2990: if_icmpge -> 3126
    //   2993: aload #4
    //   2995: iload #6
    //   2997: aaload
    //   2998: astore #7
    //   3000: aload #7
    //   3002: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3005: pop
    //   3006: aload #7
    //   3008: invokevirtual getModifiers : ()I
    //   3011: invokestatic isStatic : (I)Z
    //   3014: ifeq -> 3112
    //   3017: aload #7
    //   3019: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3022: arraylength
    //   3023: iconst_2
    //   3024: if_icmpne -> 3112
    //   3027: goto -> 3034
    //   3030: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3033: athrow
    //   3034: aload #7
    //   3036: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3039: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3042: if_acmpne -> 3112
    //   3045: goto -> 3052
    //   3048: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3051: athrow
    //   3052: aload #7
    //   3054: iconst_1
    //   3055: invokevirtual setAccessible : (Z)V
    //   3058: aload #7
    //   3060: aconst_null
    //   3061: iconst_2
    //   3062: anewarray java/lang/Object
    //   3065: dup
    //   3066: iconst_0
    //   3067: aload_0
    //   3068: aastore
    //   3069: dup
    //   3070: iconst_1
    //   3071: aload_1
    //   3072: ifnonnull -> 3090
    //   3075: goto -> 3082
    //   3078: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3081: athrow
    //   3082: aload_1
    //   3083: goto -> 3097
    //   3086: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3089: athrow
    //   3090: aload_1
    //   3091: checkcast [B
    //   3094: invokevirtual clone : ()Ljava/lang/Object;
    //   3097: aastore
    //   3098: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3101: checkcast java/lang/Boolean
    //   3104: invokevirtual booleanValue : ()Z
    //   3107: istore_3
    //   3108: iload_2
    //   3109: ifne -> 3126
    //   3112: iinc #6, 1
    //   3115: iload_2
    //   3116: ifne -> 2986
    //   3119: goto -> 3126
    //   3122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3125: athrow
    //   3126: iload_2
    //   3127: ifne -> 3468
    //   3130: sipush #3451
    //   3133: sipush #25286
    //   3136: invokestatic a : (II)Ljava/lang/String;
    //   3139: iconst_1
    //   3140: ldc burp/Zgrz
    //   3142: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3145: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3148: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3151: astore #4
    //   3153: aload #4
    //   3155: arraylength
    //   3156: istore #5
    //   3158: iconst_0
    //   3159: istore #6
    //   3161: iload #6
    //   3163: iload #5
    //   3165: if_icmpge -> 3303
    //   3168: aload #4
    //   3170: iload #6
    //   3172: aaload
    //   3173: astore #7
    //   3175: aload #7
    //   3177: invokevirtual getModifiers : ()I
    //   3180: invokestatic isStatic : (I)Z
    //   3183: ifne -> 3193
    //   3186: goto -> 3296
    //   3189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3192: athrow
    //   3193: aload #7
    //   3195: invokevirtual getType : ()Ljava/lang/Class;
    //   3198: astore #8
    //   3200: aload #8
    //   3202: ifnull -> 3283
    //   3205: aload #8
    //   3207: invokevirtual isPrimitive : ()Z
    //   3210: ifne -> 3283
    //   3213: goto -> 3220
    //   3216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3219: athrow
    //   3220: aload #8
    //   3222: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3225: ifnull -> 3283
    //   3228: goto -> 3235
    //   3231: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3234: athrow
    //   3235: aload #8
    //   3237: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3240: invokevirtual getName : ()Ljava/lang/String;
    //   3243: ifnull -> 3283
    //   3246: goto -> 3253
    //   3249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3252: athrow
    //   3253: aload #8
    //   3255: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3258: invokevirtual getName : ()Ljava/lang/String;
    //   3261: sipush #3452
    //   3264: sipush #26417
    //   3267: invokestatic a : (II)Ljava/lang/String;
    //   3270: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3273: ifne -> 3283
    //   3276: goto -> 3283
    //   3279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3282: athrow
    //   3283: aload #7
    //   3285: iconst_1
    //   3286: invokevirtual setAccessible : (Z)V
    //   3289: aload #7
    //   3291: aconst_null
    //   3292: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3295: pop
    //   3296: iinc #6, 1
    //   3299: iload_2
    //   3300: ifne -> 3161
    //   3303: sipush #3436
    //   3306: sipush #-1857
    //   3309: invokestatic a : (II)Ljava/lang/String;
    //   3312: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3315: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3318: astore #4
    //   3320: aload #4
    //   3322: arraylength
    //   3323: istore #5
    //   3325: iconst_0
    //   3326: istore #6
    //   3328: iload #6
    //   3330: iload #5
    //   3332: if_icmpge -> 3468
    //   3335: aload #4
    //   3337: iload #6
    //   3339: aaload
    //   3340: astore #7
    //   3342: aload #7
    //   3344: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3347: pop
    //   3348: aload #7
    //   3350: invokevirtual getModifiers : ()I
    //   3353: invokestatic isStatic : (I)Z
    //   3356: ifeq -> 3454
    //   3359: aload #7
    //   3361: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3364: arraylength
    //   3365: iconst_2
    //   3366: if_icmpne -> 3454
    //   3369: goto -> 3376
    //   3372: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3375: athrow
    //   3376: aload #7
    //   3378: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3381: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3384: if_acmpne -> 3454
    //   3387: goto -> 3394
    //   3390: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3393: athrow
    //   3394: aload #7
    //   3396: iconst_1
    //   3397: invokevirtual setAccessible : (Z)V
    //   3400: aload #7
    //   3402: aconst_null
    //   3403: iconst_2
    //   3404: anewarray java/lang/Object
    //   3407: dup
    //   3408: iconst_0
    //   3409: aload_0
    //   3410: aastore
    //   3411: dup
    //   3412: iconst_1
    //   3413: aload_1
    //   3414: ifnonnull -> 3432
    //   3417: goto -> 3424
    //   3420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3423: athrow
    //   3424: aload_1
    //   3425: goto -> 3439
    //   3428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3431: athrow
    //   3432: aload_1
    //   3433: checkcast [B
    //   3436: invokevirtual clone : ()Ljava/lang/Object;
    //   3439: aastore
    //   3440: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3443: checkcast java/lang/Boolean
    //   3446: invokevirtual booleanValue : ()Z
    //   3449: istore_3
    //   3450: iload_2
    //   3451: ifne -> 3468
    //   3454: iinc #6, 1
    //   3457: iload_2
    //   3458: ifne -> 3328
    //   3461: goto -> 3468
    //   3464: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3467: athrow
    //   3468: iload_3
    //   3469: ifeq -> 3474
    //   3472: iload_3
    //   3473: ireturn
    //   3474: getstatic burp/Zg7w.ZI : Ljava/lang/String;
    //   3477: getstatic burp/Zmgl.ZI : Ljava/lang/Object;
    //   3480: checkcast java/math/BigInteger
    //   3483: invokevirtual intValue : ()I
    //   3486: bipush #32
    //   3488: irem
    //   3489: invokestatic abs : (I)I
    //   3492: invokevirtual charAt : (I)C
    //   3495: getstatic burp/Zb38.Zr : Ljava/lang/String;
    //   3498: getstatic burp/Zlot.ZJ : Ljava/lang/Object;
    //   3501: checkcast java/math/BigInteger
    //   3504: invokevirtual intValue : ()I
    //   3507: bipush #32
    //   3509: irem
    //   3510: invokestatic abs : (I)I
    //   3513: invokevirtual charAt : (I)C
    //   3516: if_icmpgt -> 3861
    //   3519: sipush #3435
    //   3522: sipush #29968
    //   3525: invokestatic a : (II)Ljava/lang/String;
    //   3528: iconst_1
    //   3529: ldc burp/Zkfa
    //   3531: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3534: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3537: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3540: astore #4
    //   3542: aload #4
    //   3544: arraylength
    //   3545: istore #5
    //   3547: iconst_0
    //   3548: istore #6
    //   3550: iload #6
    //   3552: iload #5
    //   3554: if_icmpge -> 3692
    //   3557: aload #4
    //   3559: iload #6
    //   3561: aaload
    //   3562: astore #7
    //   3564: aload #7
    //   3566: invokevirtual getModifiers : ()I
    //   3569: invokestatic isStatic : (I)Z
    //   3572: ifne -> 3582
    //   3575: goto -> 3685
    //   3578: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3581: athrow
    //   3582: aload #7
    //   3584: invokevirtual getType : ()Ljava/lang/Class;
    //   3587: astore #8
    //   3589: aload #8
    //   3591: ifnull -> 3672
    //   3594: aload #8
    //   3596: invokevirtual isPrimitive : ()Z
    //   3599: ifne -> 3672
    //   3602: goto -> 3609
    //   3605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3608: athrow
    //   3609: aload #8
    //   3611: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3614: ifnull -> 3672
    //   3617: goto -> 3624
    //   3620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3623: athrow
    //   3624: aload #8
    //   3626: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3629: invokevirtual getName : ()Ljava/lang/String;
    //   3632: ifnull -> 3672
    //   3635: goto -> 3642
    //   3638: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3641: athrow
    //   3642: aload #8
    //   3644: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3647: invokevirtual getName : ()Ljava/lang/String;
    //   3650: sipush #3452
    //   3653: sipush #26417
    //   3656: invokestatic a : (II)Ljava/lang/String;
    //   3659: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3662: ifne -> 3672
    //   3665: goto -> 3672
    //   3668: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3671: athrow
    //   3672: aload #7
    //   3674: iconst_1
    //   3675: invokevirtual setAccessible : (Z)V
    //   3678: aload #7
    //   3680: aconst_null
    //   3681: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3684: pop
    //   3685: iinc #6, 1
    //   3688: iload_2
    //   3689: ifne -> 3550
    //   3692: sipush #3434
    //   3695: sipush #3294
    //   3698: invokestatic a : (II)Ljava/lang/String;
    //   3701: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3704: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3707: astore #4
    //   3709: aload #4
    //   3711: arraylength
    //   3712: istore #5
    //   3714: iconst_0
    //   3715: istore #6
    //   3717: iload #6
    //   3719: iload #5
    //   3721: if_icmpge -> 3857
    //   3724: aload #4
    //   3726: iload #6
    //   3728: aaload
    //   3729: astore #7
    //   3731: aload #7
    //   3733: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3736: pop
    //   3737: aload #7
    //   3739: invokevirtual getModifiers : ()I
    //   3742: invokestatic isStatic : (I)Z
    //   3745: ifeq -> 3843
    //   3748: aload #7
    //   3750: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3753: arraylength
    //   3754: iconst_2
    //   3755: if_icmpne -> 3843
    //   3758: goto -> 3765
    //   3761: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3764: athrow
    //   3765: aload #7
    //   3767: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3770: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3773: if_acmpne -> 3843
    //   3776: goto -> 3783
    //   3779: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3782: athrow
    //   3783: aload #7
    //   3785: iconst_1
    //   3786: invokevirtual setAccessible : (Z)V
    //   3789: aload #7
    //   3791: aconst_null
    //   3792: iconst_2
    //   3793: anewarray java/lang/Object
    //   3796: dup
    //   3797: iconst_0
    //   3798: aload_0
    //   3799: aastore
    //   3800: dup
    //   3801: iconst_1
    //   3802: aload_1
    //   3803: ifnonnull -> 3821
    //   3806: goto -> 3813
    //   3809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3812: athrow
    //   3813: aload_1
    //   3814: goto -> 3828
    //   3817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3820: athrow
    //   3821: aload_1
    //   3822: checkcast [B
    //   3825: invokevirtual clone : ()Ljava/lang/Object;
    //   3828: aastore
    //   3829: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3832: checkcast java/lang/Boolean
    //   3835: invokevirtual booleanValue : ()Z
    //   3838: istore_3
    //   3839: iload_2
    //   3840: ifne -> 3857
    //   3843: iinc #6, 1
    //   3846: iload_2
    //   3847: ifne -> 3717
    //   3850: goto -> 3857
    //   3853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3856: athrow
    //   3857: iload_2
    //   3858: ifne -> 4199
    //   3861: sipush #3439
    //   3864: sipush #5603
    //   3867: invokestatic a : (II)Ljava/lang/String;
    //   3870: iconst_1
    //   3871: ldc burp/Zrva
    //   3873: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3876: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3879: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3882: astore #4
    //   3884: aload #4
    //   3886: arraylength
    //   3887: istore #5
    //   3889: iconst_0
    //   3890: istore #6
    //   3892: iload #6
    //   3894: iload #5
    //   3896: if_icmpge -> 4034
    //   3899: aload #4
    //   3901: iload #6
    //   3903: aaload
    //   3904: astore #7
    //   3906: aload #7
    //   3908: invokevirtual getModifiers : ()I
    //   3911: invokestatic isStatic : (I)Z
    //   3914: ifne -> 3924
    //   3917: goto -> 4027
    //   3920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3923: athrow
    //   3924: aload #7
    //   3926: invokevirtual getType : ()Ljava/lang/Class;
    //   3929: astore #8
    //   3931: aload #8
    //   3933: ifnull -> 4014
    //   3936: aload #8
    //   3938: invokevirtual isPrimitive : ()Z
    //   3941: ifne -> 4014
    //   3944: goto -> 3951
    //   3947: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3950: athrow
    //   3951: aload #8
    //   3953: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3956: ifnull -> 4014
    //   3959: goto -> 3966
    //   3962: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3965: athrow
    //   3966: aload #8
    //   3968: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3971: invokevirtual getName : ()Ljava/lang/String;
    //   3974: ifnull -> 4014
    //   3977: goto -> 3984
    //   3980: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3983: athrow
    //   3984: aload #8
    //   3986: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3989: invokevirtual getName : ()Ljava/lang/String;
    //   3992: sipush #3452
    //   3995: sipush #26417
    //   3998: invokestatic a : (II)Ljava/lang/String;
    //   4001: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4004: ifne -> 4014
    //   4007: goto -> 4014
    //   4010: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4013: athrow
    //   4014: aload #7
    //   4016: iconst_1
    //   4017: invokevirtual setAccessible : (Z)V
    //   4020: aload #7
    //   4022: aconst_null
    //   4023: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4026: pop
    //   4027: iinc #6, 1
    //   4030: iload_2
    //   4031: ifne -> 3892
    //   4034: sipush #3442
    //   4037: sipush #12924
    //   4040: invokestatic a : (II)Ljava/lang/String;
    //   4043: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4046: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4049: astore #4
    //   4051: aload #4
    //   4053: arraylength
    //   4054: istore #5
    //   4056: iconst_0
    //   4057: istore #6
    //   4059: iload #6
    //   4061: iload #5
    //   4063: if_icmpge -> 4199
    //   4066: aload #4
    //   4068: iload #6
    //   4070: aaload
    //   4071: astore #7
    //   4073: aload #7
    //   4075: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4078: pop
    //   4079: aload #7
    //   4081: invokevirtual getModifiers : ()I
    //   4084: invokestatic isStatic : (I)Z
    //   4087: ifeq -> 4185
    //   4090: aload #7
    //   4092: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4095: arraylength
    //   4096: iconst_2
    //   4097: if_icmpne -> 4185
    //   4100: goto -> 4107
    //   4103: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4106: athrow
    //   4107: aload #7
    //   4109: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4112: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4115: if_acmpne -> 4185
    //   4118: goto -> 4125
    //   4121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4124: athrow
    //   4125: aload #7
    //   4127: iconst_1
    //   4128: invokevirtual setAccessible : (Z)V
    //   4131: aload #7
    //   4133: aconst_null
    //   4134: iconst_2
    //   4135: anewarray java/lang/Object
    //   4138: dup
    //   4139: iconst_0
    //   4140: aload_0
    //   4141: aastore
    //   4142: dup
    //   4143: iconst_1
    //   4144: aload_1
    //   4145: ifnonnull -> 4163
    //   4148: goto -> 4155
    //   4151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4154: athrow
    //   4155: aload_1
    //   4156: goto -> 4170
    //   4159: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4162: athrow
    //   4163: aload_1
    //   4164: checkcast [B
    //   4167: invokevirtual clone : ()Ljava/lang/Object;
    //   4170: aastore
    //   4171: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4174: checkcast java/lang/Boolean
    //   4177: invokevirtual booleanValue : ()Z
    //   4180: istore_3
    //   4181: iload_2
    //   4182: ifne -> 4199
    //   4185: iinc #6, 1
    //   4188: iload_2
    //   4189: ifne -> 4059
    //   4192: goto -> 4199
    //   4195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4198: athrow
    //   4199: iload_3
    //   4200: ireturn
    //   4201: astore_3
    //   4202: new java/lang/Exception
    //   4205: dup
    //   4206: aload_3
    //   4207: invokevirtual getMessage : ()Ljava/lang/String;
    //   4210: invokespecial <init> : (Ljava/lang/String;)V
    //   4213: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2011	4201	java/lang/Throwable
    //   325	339	339	java/lang/Throwable
    //   350	363	366	java/lang/Throwable
    //   355	378	381	java/lang/Throwable
    //   370	396	399	java/lang/Throwable
    //   385	426	429	java/lang/Throwable
    //   489	516	519	java/lang/Throwable
    //   506	534	537	java/lang/Throwable
    //   523	564	567	java/lang/Throwable
    //   541	575	575	java/lang/Throwable
    //   586	602	605	java/lang/Throwable
    //   651	665	665	java/lang/Throwable
    //   676	689	692	java/lang/Throwable
    //   681	704	707	java/lang/Throwable
    //   696	722	725	java/lang/Throwable
    //   711	752	755	java/lang/Throwable
    //   815	842	845	java/lang/Throwable
    //   832	863	866	java/lang/Throwable
    //   849	893	896	java/lang/Throwable
    //   870	904	904	java/lang/Throwable
    //   915	931	934	java/lang/Throwable
    //   938	1275	1278	java/lang/Throwable
    //   1109	1119	1119	java/lang/Throwable
    //   1123	1135	1135	java/lang/Throwable
    //   1139	1151	1151	java/lang/Throwable
    //   1155	1168	1168	java/lang/Throwable
    //   1172	1185	1185	java/lang/Throwable
    //   1371	1385	1385	java/lang/Throwable
    //   1396	1409	1412	java/lang/Throwable
    //   1401	1424	1427	java/lang/Throwable
    //   1416	1442	1445	java/lang/Throwable
    //   1431	1472	1475	java/lang/Throwable
    //   1538	1565	1568	java/lang/Throwable
    //   1555	1583	1586	java/lang/Throwable
    //   1572	1613	1616	java/lang/Throwable
    //   1590	1624	1624	java/lang/Throwable
    //   1646	1657	1660	java/lang/Throwable
    //   1713	1727	1727	java/lang/Throwable
    //   1738	1751	1754	java/lang/Throwable
    //   1743	1766	1769	java/lang/Throwable
    //   1758	1784	1787	java/lang/Throwable
    //   1773	1814	1817	java/lang/Throwable
    //   1880	1907	1910	java/lang/Throwable
    //   1897	1925	1928	java/lang/Throwable
    //   1914	1955	1958	java/lang/Throwable
    //   1932	1966	1966	java/lang/Throwable
    //   1988	1999	2002	java/lang/Throwable
    //   2012	2742	4201	java/lang/Throwable
    //   2102	2116	2116	java/lang/Throwable
    //   2127	2140	2143	java/lang/Throwable
    //   2132	2155	2158	java/lang/Throwable
    //   2147	2173	2176	java/lang/Throwable
    //   2162	2203	2206	java/lang/Throwable
    //   2269	2296	2299	java/lang/Throwable
    //   2286	2314	2317	java/lang/Throwable
    //   2303	2344	2347	java/lang/Throwable
    //   2321	2355	2355	java/lang/Throwable
    //   2377	2388	2391	java/lang/Throwable
    //   2444	2458	2458	java/lang/Throwable
    //   2469	2482	2485	java/lang/Throwable
    //   2474	2497	2500	java/lang/Throwable
    //   2489	2515	2518	java/lang/Throwable
    //   2504	2545	2548	java/lang/Throwable
    //   2611	2638	2641	java/lang/Throwable
    //   2628	2656	2659	java/lang/Throwable
    //   2645	2686	2689	java/lang/Throwable
    //   2663	2697	2697	java/lang/Throwable
    //   2719	2730	2733	java/lang/Throwable
    //   2743	3473	4201	java/lang/Throwable
    //   2833	2847	2847	java/lang/Throwable
    //   2858	2871	2874	java/lang/Throwable
    //   2863	2886	2889	java/lang/Throwable
    //   2878	2904	2907	java/lang/Throwable
    //   2893	2934	2937	java/lang/Throwable
    //   3000	3027	3030	java/lang/Throwable
    //   3017	3045	3048	java/lang/Throwable
    //   3034	3075	3078	java/lang/Throwable
    //   3052	3086	3086	java/lang/Throwable
    //   3108	3119	3122	java/lang/Throwable
    //   3175	3189	3189	java/lang/Throwable
    //   3200	3213	3216	java/lang/Throwable
    //   3205	3228	3231	java/lang/Throwable
    //   3220	3246	3249	java/lang/Throwable
    //   3235	3276	3279	java/lang/Throwable
    //   3342	3369	3372	java/lang/Throwable
    //   3359	3387	3390	java/lang/Throwable
    //   3376	3417	3420	java/lang/Throwable
    //   3394	3428	3428	java/lang/Throwable
    //   3450	3461	3464	java/lang/Throwable
    //   3474	4200	4201	java/lang/Throwable
    //   3564	3578	3578	java/lang/Throwable
    //   3589	3602	3605	java/lang/Throwable
    //   3594	3617	3620	java/lang/Throwable
    //   3609	3635	3638	java/lang/Throwable
    //   3624	3665	3668	java/lang/Throwable
    //   3731	3758	3761	java/lang/Throwable
    //   3748	3776	3779	java/lang/Throwable
    //   3765	3806	3809	java/lang/Throwable
    //   3783	3817	3817	java/lang/Throwable
    //   3839	3850	3853	java/lang/Throwable
    //   3906	3920	3920	java/lang/Throwable
    //   3931	3944	3947	java/lang/Throwable
    //   3936	3959	3962	java/lang/Throwable
    //   3951	3977	3980	java/lang/Throwable
    //   3966	4007	4010	java/lang/Throwable
    //   4073	4100	4103	java/lang/Throwable
    //   4090	4118	4121	java/lang/Throwable
    //   4107	4148	4151	java/lang/Throwable
    //   4125	4159	4159	java/lang/Throwable
    //   4181	4192	4195	java/lang/Throwable
  }
  
  static void Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'VÇÊc(« 0ÆÙÝrEç²{ÂÁÒ¸¤UÍ_­;¡·×íù õ\\rÏéÂy¾ÝV_@}Ç±`Òæ7wÄîßOÎ\\t¬ÀË*\\fUÓ \\tø½-Fì?\\tuð!ïm¹¾Ú\\bSX{b\\tÐlD¿y¾zÛ\\tóL"À\\b\\rú\\tNû6NÓ2\\tJWØR(7\\t;9Ö)4"\\tÆ1!Ëhtë\\tD)Ö+«7"Ù\\t7Ý¸æx\\f¶\\tè¹Céym\\tÆ+W!£}(·\\t¿mÅ\ñØ1\\t+ïW\\f£ÍpB\\tð, ÌXäM+#ª­À(7\\nî¼ADJ©|G íÝxÑø`'Yã&ég«ç2²I;ã èòR£î%§åÕFÈm2:G,_Û£þy(5ÿõJË&[DäÙøXÉðI#,!ÊÜû¼3¢·´f1\\t¢b\\n~°R¢\\t±rh|üÆÃÌ\\tÒ]qzrº\\te>òõ¯÷±ëÃ\\tÀYF9j|LSk4_'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #11
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
    //   68: ldc 'CP©§["¯Ô<ì\'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #23
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
    //   129: putstatic burp/Zgjj.a : [Ljava/lang/String;
    //   132: bipush #31
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgjj.b : [Ljava/lang/String;
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
    //   212: bipush #50
    //   214: goto -> 244
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #46
    //   224: goto -> 244
    //   227: bipush #51
    //   229: goto -> 244
    //   232: bipush #76
    //   234: goto -> 244
    //   237: bipush #97
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
    //   300: sipush #3427
    //   303: sipush #-20625
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgjj.Zi : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #98
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #50
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #100
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-78
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-43
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #21
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-26
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #114
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-21
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-107
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-118
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-41
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #22
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #40
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #27
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-93
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #29
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #27
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #121
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-16
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #-63
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-15
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #-95
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #73
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #31
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #-119
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #126
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-59
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #24
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #97
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #33
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #116
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zgjj.ZW : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xD62) & 0xFFFF;
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
      char c = 'ß';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgjj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */