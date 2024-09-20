package burp;

import java.math.BigInteger;

class Zek5 extends ClassLoader {
  static Object ZP;
  
  static String ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zj(Object paramObject) {
    Zsq5.ZA = a(-19127, -2345);
    Zsq5.ZF = new BigInteger(a(-19123, -22730));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrpx.ZM.charAt(Math.abs(((BigInteger)Zkk6.Zb).intValue() % 32)) <= Zr0.ZH.charAt(Math.abs(((BigInteger)Zgj5.ZO).intValue() % 32))) {
          try {
            Zlzo.Zw(Class.forName(a(-19132, 6096)));
            if (bool)
              Zlos.Zn(Class.forName(a(-19131, -5504))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlos.Zn(Class.forName(a(-19131, -5504)));
    } catch (Throwable throwable) {}
  }
  
  static void ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zy(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zktq.Zn : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zzbr.ZC : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zb_c.ZN : Ljava/lang/Object;
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
    //   258: ifeq -> 235
    //   261: aload_3
    //   262: arraylength
    //   263: bipush #10
    //   265: if_icmplt -> 31
    //   268: sipush #-19133
    //   271: sipush #-11721
    //   274: invokestatic a : (II)Ljava/lang/String;
    //   277: iconst_1
    //   278: ldc burp/Zr_k
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
    //   396: sipush #-19134
    //   399: sipush #26909
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
    //   435: ifeq -> 297
    //   438: sipush #-19129
    //   441: sipush #25058
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
    //   465: if_icmpge -> 594
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
    //   488: ifeq -> 580
    //   491: aload #6
    //   493: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   496: arraylength
    //   497: iconst_2
    //   498: if_icmpne -> 580
    //   501: goto -> 508
    //   504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   507: athrow
    //   508: aload #6
    //   510: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   513: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   516: if_acmpne -> 580
    //   519: goto -> 526
    //   522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   525: athrow
    //   526: aload #6
    //   528: iconst_1
    //   529: invokevirtual setAccessible : (Z)V
    //   532: aload #6
    //   534: aconst_null
    //   535: iconst_2
    //   536: anewarray java/lang/Object
    //   539: dup
    //   540: iconst_0
    //   541: aload_0
    //   542: aastore
    //   543: dup
    //   544: iconst_1
    //   545: aload_1
    //   546: ifnonnull -> 564
    //   549: goto -> 556
    //   552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   555: athrow
    //   556: aload_1
    //   557: goto -> 571
    //   560: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   563: athrow
    //   564: aload_1
    //   565: checkcast [B
    //   568: invokevirtual clone : ()Ljava/lang/Object;
    //   571: aastore
    //   572: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   575: pop
    //   576: iload_2
    //   577: ifeq -> 594
    //   580: iinc #5, 1
    //   583: iload_2
    //   584: ifeq -> 461
    //   587: goto -> 594
    //   590: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   593: athrow
    //   594: sipush #-19135
    //   597: sipush #12628
    //   600: invokestatic a : (II)Ljava/lang/String;
    //   603: iconst_1
    //   604: ldc burp/Zxd0
    //   606: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   609: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   612: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   615: astore_3
    //   616: aload_3
    //   617: arraylength
    //   618: istore #4
    //   620: iconst_0
    //   621: istore #5
    //   623: iload #5
    //   625: iload #4
    //   627: if_icmpge -> 764
    //   630: aload_3
    //   631: iload #5
    //   633: aaload
    //   634: astore #6
    //   636: aload #6
    //   638: invokevirtual getModifiers : ()I
    //   641: invokestatic isStatic : (I)Z
    //   644: ifne -> 654
    //   647: goto -> 757
    //   650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   653: athrow
    //   654: aload #6
    //   656: invokevirtual getType : ()Ljava/lang/Class;
    //   659: astore #7
    //   661: aload #7
    //   663: ifnull -> 744
    //   666: aload #7
    //   668: invokevirtual isPrimitive : ()Z
    //   671: ifne -> 744
    //   674: goto -> 681
    //   677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   680: athrow
    //   681: aload #7
    //   683: invokevirtual getPackage : ()Ljava/lang/Package;
    //   686: ifnull -> 744
    //   689: goto -> 696
    //   692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   695: athrow
    //   696: aload #7
    //   698: invokevirtual getPackage : ()Ljava/lang/Package;
    //   701: invokevirtual getName : ()Ljava/lang/String;
    //   704: ifnull -> 744
    //   707: goto -> 714
    //   710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   713: athrow
    //   714: aload #7
    //   716: invokevirtual getPackage : ()Ljava/lang/Package;
    //   719: invokevirtual getName : ()Ljava/lang/String;
    //   722: sipush #-19126
    //   725: sipush #-24793
    //   728: invokestatic a : (II)Ljava/lang/String;
    //   731: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   734: ifne -> 744
    //   737: goto -> 744
    //   740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   743: athrow
    //   744: aload #6
    //   746: iconst_1
    //   747: invokevirtual setAccessible : (Z)V
    //   750: aload #6
    //   752: aconst_null
    //   753: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   756: pop
    //   757: iinc #5, 1
    //   760: iload_2
    //   761: ifeq -> 623
    //   764: sipush #-19128
    //   767: sipush #-1253
    //   770: invokestatic a : (II)Ljava/lang/String;
    //   773: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   776: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   779: astore_3
    //   780: aload_3
    //   781: arraylength
    //   782: istore #4
    //   784: iconst_0
    //   785: istore #5
    //   787: iload #5
    //   789: iload #4
    //   791: if_icmpge -> 923
    //   794: aload_3
    //   795: iload #5
    //   797: aaload
    //   798: astore #6
    //   800: aload #6
    //   802: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   805: pop
    //   806: aload #6
    //   808: invokevirtual getModifiers : ()I
    //   811: invokestatic isStatic : (I)Z
    //   814: ifeq -> 909
    //   817: aload #6
    //   819: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   822: arraylength
    //   823: iconst_2
    //   824: if_icmpne -> 909
    //   827: goto -> 834
    //   830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   833: athrow
    //   834: aload #6
    //   836: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   839: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   842: invokevirtual equals : (Ljava/lang/Object;)Z
    //   845: ifeq -> 909
    //   848: goto -> 855
    //   851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   854: athrow
    //   855: aload #6
    //   857: iconst_1
    //   858: invokevirtual setAccessible : (Z)V
    //   861: aload #6
    //   863: aconst_null
    //   864: iconst_2
    //   865: anewarray java/lang/Object
    //   868: dup
    //   869: iconst_0
    //   870: aload_0
    //   871: aastore
    //   872: dup
    //   873: iconst_1
    //   874: aload_1
    //   875: ifnonnull -> 893
    //   878: goto -> 885
    //   881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   884: athrow
    //   885: aload_1
    //   886: goto -> 900
    //   889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   892: athrow
    //   893: aload_1
    //   894: checkcast [B
    //   897: invokevirtual clone : ()Ljava/lang/Object;
    //   900: aastore
    //   901: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   904: pop
    //   905: iload_2
    //   906: ifeq -> 923
    //   909: iinc #5, 1
    //   912: iload_2
    //   913: ifeq -> 787
    //   916: goto -> 923
    //   919: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   922: athrow
    //   923: iconst_0
    //   924: istore_3
    //   925: sipush #-19130
    //   928: sipush #7040
    //   931: invokestatic a : (II)Ljava/lang/String;
    //   934: iconst_1
    //   935: ldc burp/Zlo2
    //   937: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   940: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   943: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   946: astore #4
    //   948: aload #4
    //   950: arraylength
    //   951: istore #5
    //   953: iconst_0
    //   954: istore #6
    //   956: iload #6
    //   958: iload #5
    //   960: if_icmpge -> 1098
    //   963: aload #4
    //   965: iload #6
    //   967: aaload
    //   968: astore #7
    //   970: aload #7
    //   972: invokevirtual getModifiers : ()I
    //   975: invokestatic isStatic : (I)Z
    //   978: ifne -> 988
    //   981: goto -> 1091
    //   984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   987: athrow
    //   988: aload #7
    //   990: invokevirtual getType : ()Ljava/lang/Class;
    //   993: astore #8
    //   995: aload #8
    //   997: ifnull -> 1078
    //   1000: aload #8
    //   1002: invokevirtual isPrimitive : ()Z
    //   1005: ifne -> 1078
    //   1008: goto -> 1015
    //   1011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1014: athrow
    //   1015: aload #8
    //   1017: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1020: ifnull -> 1078
    //   1023: goto -> 1030
    //   1026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1029: athrow
    //   1030: aload #8
    //   1032: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1035: invokevirtual getName : ()Ljava/lang/String;
    //   1038: ifnull -> 1078
    //   1041: goto -> 1048
    //   1044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1047: athrow
    //   1048: aload #8
    //   1050: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1053: invokevirtual getName : ()Ljava/lang/String;
    //   1056: sipush #-19126
    //   1059: sipush #-24793
    //   1062: invokestatic a : (II)Ljava/lang/String;
    //   1065: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1068: ifne -> 1078
    //   1071: goto -> 1078
    //   1074: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1077: athrow
    //   1078: aload #7
    //   1080: iconst_1
    //   1081: invokevirtual setAccessible : (Z)V
    //   1084: aload #7
    //   1086: aconst_null
    //   1087: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1090: pop
    //   1091: iinc #6, 1
    //   1094: iload_2
    //   1095: ifeq -> 956
    //   1098: sipush #-19136
    //   1101: sipush #-7082
    //   1104: invokestatic a : (II)Ljava/lang/String;
    //   1107: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1110: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1113: astore #4
    //   1115: aload #4
    //   1117: arraylength
    //   1118: istore #5
    //   1120: iconst_0
    //   1121: istore #6
    //   1123: iload #6
    //   1125: iload #5
    //   1127: if_icmpge -> 1263
    //   1130: aload #4
    //   1132: iload #6
    //   1134: aaload
    //   1135: astore #7
    //   1137: aload #7
    //   1139: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1142: pop
    //   1143: aload #7
    //   1145: invokevirtual getModifiers : ()I
    //   1148: invokestatic isStatic : (I)Z
    //   1151: ifeq -> 1249
    //   1154: aload #7
    //   1156: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1159: arraylength
    //   1160: iconst_2
    //   1161: if_icmpne -> 1249
    //   1164: goto -> 1171
    //   1167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1170: athrow
    //   1171: aload #7
    //   1173: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1176: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1179: if_acmpne -> 1249
    //   1182: goto -> 1189
    //   1185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1188: athrow
    //   1189: aload #7
    //   1191: iconst_1
    //   1192: invokevirtual setAccessible : (Z)V
    //   1195: aload #7
    //   1197: aconst_null
    //   1198: iconst_2
    //   1199: anewarray java/lang/Object
    //   1202: dup
    //   1203: iconst_0
    //   1204: aload_0
    //   1205: aastore
    //   1206: dup
    //   1207: iconst_1
    //   1208: aload_1
    //   1209: ifnonnull -> 1227
    //   1212: goto -> 1219
    //   1215: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1218: athrow
    //   1219: aload_1
    //   1220: goto -> 1234
    //   1223: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1226: athrow
    //   1227: aload_1
    //   1228: checkcast [B
    //   1231: invokevirtual clone : ()Ljava/lang/Object;
    //   1234: aastore
    //   1235: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1238: checkcast java/lang/Boolean
    //   1241: invokevirtual booleanValue : ()Z
    //   1244: istore_3
    //   1245: iload_2
    //   1246: ifeq -> 1263
    //   1249: iinc #6, 1
    //   1252: iload_2
    //   1253: ifeq -> 1123
    //   1256: goto -> 1263
    //   1259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1262: athrow
    //   1263: iload_3
    //   1264: ireturn
    //   1265: astore_3
    //   1266: new java/lang/Exception
    //   1269: dup
    //   1270: aload_3
    //   1271: invokevirtual getMessage : ()Ljava/lang/String;
    //   1274: invokespecial <init> : (Ljava/lang/String;)V
    //   1277: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1264	1265	java/lang/Throwable
    //   310	324	324	java/lang/Throwable
    //   335	348	351	java/lang/Throwable
    //   340	363	366	java/lang/Throwable
    //   355	381	384	java/lang/Throwable
    //   370	411	414	java/lang/Throwable
    //   474	501	504	java/lang/Throwable
    //   491	519	522	java/lang/Throwable
    //   508	549	552	java/lang/Throwable
    //   526	560	560	java/lang/Throwable
    //   571	587	590	java/lang/Throwable
    //   636	650	650	java/lang/Throwable
    //   661	674	677	java/lang/Throwable
    //   666	689	692	java/lang/Throwable
    //   681	707	710	java/lang/Throwable
    //   696	737	740	java/lang/Throwable
    //   800	827	830	java/lang/Throwable
    //   817	848	851	java/lang/Throwable
    //   834	878	881	java/lang/Throwable
    //   855	889	889	java/lang/Throwable
    //   900	916	919	java/lang/Throwable
    //   970	984	984	java/lang/Throwable
    //   995	1008	1011	java/lang/Throwable
    //   1000	1023	1026	java/lang/Throwable
    //   1015	1041	1044	java/lang/Throwable
    //   1030	1071	1074	java/lang/Throwable
    //   1137	1164	1167	java/lang/Throwable
    //   1154	1182	1185	java/lang/Throwable
    //   1171	1212	1215	java/lang/Throwable
    //   1189	1223	1223	java/lang/Throwable
    //   1245	1256	1259	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '±¸ñé=Ô¹\\t¯Ú$ \\tÎOöNc]O½ÆQ\\tPì%{nÀÒûâ\\tÓ\\fUg`CÈ\\tÀi7Ë,Ö>ð\\t\\r?G-Gºï IüÒà´§B4Ø¥?lEÙçFPj¨(ÖJ\\t60éà÷³ÿÐ Ðø¦Æñwóíûó$ÈF\\n\\t6sÍÉ¤.ml|%°'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #118
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
    //   68: ldc '.°®M A£ûAý1Q\\t~¤ýr"Ci½è!²6<ô¦\\t¹k¿Q2^áÛPz\\b+dgr)`&Âç(Û~ÄI¹PÛH«+tt¦÷²¡ÔF'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #38
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
    //   128: putstatic burp/Zek5.a : [Ljava/lang/String;
    //   131: bipush #13
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zek5.b : [Ljava/lang/String;
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
    //   212: bipush #28
    //   214: goto -> 244
    //   217: bipush #45
    //   219: goto -> 244
    //   222: bipush #72
    //   224: goto -> 244
    //   227: bipush #80
    //   229: goto -> 244
    //   232: bipush #105
    //   234: goto -> 244
    //   237: bipush #57
    //   239: goto -> 244
    //   242: bipush #13
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #97
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #103
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #61
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-115
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #107
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-92
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #88
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #-53
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #22
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-31
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-48
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #-13
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-36
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #51
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-93
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-112
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-48
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #42
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-17
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #91
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #64
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #73
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #69
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-119
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #108
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-109
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-3
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-112
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #59
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #-40
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #27
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #53
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zek5.ZP : Ljava/lang/Object;
    //   501: sipush #-19125
    //   504: sipush #-15349
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zek5.ZE : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB541) & 0xFFFF;
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
      byte b1 = 116;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zek5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */