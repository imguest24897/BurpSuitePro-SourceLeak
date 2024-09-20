package burp;

import java.math.BigInteger;

class Zr6c extends ClassLoader {
  static Object ZG;
  
  static String Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZC(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZZ(Object paramObject) {
    Zrqi.Zu = a(-9829, -12073);
    Zrqi.Zb = new BigInteger(a(-9845, -31590));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxln.Zz.charAt(Math.abs(((BigInteger)Zegv.ZL).intValue() % 32)) <= Zlf7.ZM.charAt(Math.abs(((BigInteger)Zsko.ZD).intValue() % 32))) {
          try {
            Ze5h.ZU(Class.forName(a(-9839, 5361)));
            if (!bool)
              Zlo0.ZN(Class.forName(a(-9841, 108))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlo0.ZN(Class.forName(a(-9841, 108)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zu(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zxc0.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztzj.Zv : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zbow.ZS : Ljava/lang/Object;
    //   22: sipush #-9836
    //   25: sipush #-1622
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zgw7
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
    //   150: sipush #-9837
    //   153: sipush #28792
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
    //   189: ifeq -> 51
    //   192: sipush #-9838
    //   195: sipush #15638
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
    //   334: ifeq -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifeq -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: new java/io/ByteArrayOutputStream
    //   354: dup
    //   355: invokespecial <init> : ()V
    //   358: astore_3
    //   359: sipush #-9827
    //   362: aload_3
    //   363: sipush #202
    //   366: invokevirtual write : (I)V
    //   369: sipush #28760
    //   372: aload_3
    //   373: sipush #254
    //   376: invokevirtual write : (I)V
    //   379: aload_3
    //   380: sipush #186
    //   383: invokevirtual write : (I)V
    //   386: aload_3
    //   387: sipush #190
    //   390: invokevirtual write : (I)V
    //   393: aload_3
    //   394: iconst_0
    //   395: invokevirtual write : (I)V
    //   398: aload_3
    //   399: iconst_1
    //   400: invokevirtual write : (I)V
    //   403: aload_3
    //   404: iconst_0
    //   405: invokevirtual write : (I)V
    //   408: aload_3
    //   409: bipush #50
    //   411: invokevirtual write : (I)V
    //   414: aload_3
    //   415: getstatic burp/Ztvn.Zl : Ljava/lang/Object;
    //   418: checkcast java/math/BigInteger
    //   421: invokevirtual toByteArray : ()[B
    //   424: invokevirtual write : ([B)V
    //   427: aload_3
    //   428: getstatic burp/Zrxf.ZS : Ljava/lang/Object;
    //   431: checkcast java/math/BigInteger
    //   434: invokevirtual toByteArray : ()[B
    //   437: invokevirtual write : ([B)V
    //   440: aload_3
    //   441: getstatic burp/Zme.Zd : Ljava/lang/Object;
    //   444: checkcast java/math/BigInteger
    //   447: invokevirtual toByteArray : ()[B
    //   450: invokevirtual write : ([B)V
    //   453: aload_3
    //   454: invokevirtual toByteArray : ()[B
    //   457: astore #4
    //   459: aconst_null
    //   460: astore #5
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   468: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   471: astore #6
    //   473: aload #6
    //   475: arraylength
    //   476: istore #7
    //   478: iconst_0
    //   479: istore #8
    //   481: iload #8
    //   483: iload #7
    //   485: if_icmpge -> 613
    //   488: aload #6
    //   490: iload #8
    //   492: aaload
    //   493: astore #9
    //   495: aload #9
    //   497: invokevirtual getName : ()Ljava/lang/String;
    //   500: sipush #-9850
    //   503: sipush #32533
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: invokevirtual equals : (Ljava/lang/Object;)Z
    //   512: ifeq -> 606
    //   515: aload #9
    //   517: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   520: astore #10
    //   522: aload #10
    //   524: arraylength
    //   525: iconst_4
    //   526: if_icmpeq -> 536
    //   529: goto -> 606
    //   532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   535: athrow
    //   536: aload #10
    //   538: iconst_0
    //   539: aaload
    //   540: ldc java/lang/String
    //   542: if_acmpeq -> 552
    //   545: goto -> 606
    //   548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   551: athrow
    //   552: aload #10
    //   554: iconst_1
    //   555: aaload
    //   556: ldc [B
    //   558: if_acmpeq -> 568
    //   561: goto -> 606
    //   564: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   567: athrow
    //   568: aload #10
    //   570: iconst_2
    //   571: aaload
    //   572: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   575: if_acmpeq -> 585
    //   578: goto -> 606
    //   581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   584: athrow
    //   585: aload #10
    //   587: iconst_3
    //   588: aaload
    //   589: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   592: if_acmpeq -> 602
    //   595: goto -> 606
    //   598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   601: athrow
    //   602: aload #9
    //   604: astore #5
    //   606: iinc #8, 1
    //   609: iload_2
    //   610: ifeq -> 481
    //   613: aload #5
    //   615: iconst_1
    //   616: invokevirtual setAccessible : (Z)V
    //   619: ldc burp/Zl7k
    //   621: iconst_0
    //   622: anewarray java/lang/Class
    //   625: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   628: astore #6
    //   630: aload #6
    //   632: iconst_1
    //   633: invokevirtual setAccessible : (Z)V
    //   636: aload #5
    //   638: aload #6
    //   640: iconst_0
    //   641: anewarray java/lang/Object
    //   644: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   647: iconst_4
    //   648: anewarray java/lang/Object
    //   651: dup
    //   652: iconst_0
    //   653: sipush #-9855
    //   656: sipush #-2837
    //   659: invokestatic a : (II)Ljava/lang/String;
    //   662: aastore
    //   663: dup
    //   664: iconst_1
    //   665: aload #4
    //   667: aastore
    //   668: dup
    //   669: iconst_2
    //   670: iconst_0
    //   671: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   674: aastore
    //   675: dup
    //   676: iconst_3
    //   677: aload #4
    //   679: arraylength
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: aastore
    //   684: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   687: pop
    //   688: goto -> 692
    //   691: astore_3
    //   692: sipush #-9846
    //   695: sipush #-32550
    //   698: invokestatic a : (II)Ljava/lang/String;
    //   701: iconst_1
    //   702: ldc burp/Zkco
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
    //   820: sipush #-9834
    //   823: sipush #-16647
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
    //   862: sipush #-9828
    //   865: sipush #-22194
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
    //   889: if_icmpge -> 1000
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
    //   912: ifeq -> 986
    //   915: aload #6
    //   917: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   920: arraylength
    //   921: iconst_2
    //   922: if_icmpne -> 986
    //   925: goto -> 932
    //   928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   931: athrow
    //   932: aload #6
    //   934: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   937: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   940: if_acmpne -> 986
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
    //   970: aastore
    //   971: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   974: pop
    //   975: iload_2
    //   976: ifeq -> 1000
    //   979: goto -> 986
    //   982: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   985: athrow
    //   986: iinc #5, 1
    //   989: iload_2
    //   990: ifeq -> 885
    //   993: goto -> 1000
    //   996: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   999: athrow
    //   1000: iconst_0
    //   1001: istore_3
    //   1002: getstatic burp/Zzht.Zv : Ljava/lang/String;
    //   1005: getstatic burp/Zelt.ZC : Ljava/lang/Object;
    //   1008: checkcast java/math/BigInteger
    //   1011: invokevirtual intValue : ()I
    //   1014: bipush #32
    //   1016: irem
    //   1017: invokestatic abs : (I)I
    //   1020: invokevirtual charAt : (I)C
    //   1023: getstatic burp/Ztnn.ZS : Ljava/lang/String;
    //   1026: getstatic burp/Zrgo.ZJ : Ljava/lang/Object;
    //   1029: checkcast java/math/BigInteger
    //   1032: invokevirtual intValue : ()I
    //   1035: bipush #32
    //   1037: irem
    //   1038: invokestatic abs : (I)I
    //   1041: invokevirtual charAt : (I)C
    //   1044: if_icmple -> 1388
    //   1047: sipush #-9832
    //   1050: sipush #-2514
    //   1053: invokestatic a : (II)Ljava/lang/String;
    //   1056: iconst_1
    //   1057: ldc burp/Ztsc
    //   1059: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1062: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1065: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1068: astore #4
    //   1070: aload #4
    //   1072: arraylength
    //   1073: istore #5
    //   1075: iconst_0
    //   1076: istore #6
    //   1078: iload #6
    //   1080: iload #5
    //   1082: if_icmpge -> 1220
    //   1085: aload #4
    //   1087: iload #6
    //   1089: aaload
    //   1090: astore #7
    //   1092: aload #7
    //   1094: invokevirtual getModifiers : ()I
    //   1097: invokestatic isStatic : (I)Z
    //   1100: ifne -> 1110
    //   1103: goto -> 1213
    //   1106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1109: athrow
    //   1110: aload #7
    //   1112: invokevirtual getType : ()Ljava/lang/Class;
    //   1115: astore #8
    //   1117: aload #8
    //   1119: ifnull -> 1200
    //   1122: aload #8
    //   1124: invokevirtual isPrimitive : ()Z
    //   1127: ifne -> 1200
    //   1130: goto -> 1137
    //   1133: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1136: athrow
    //   1137: aload #8
    //   1139: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1142: ifnull -> 1200
    //   1145: goto -> 1152
    //   1148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1151: athrow
    //   1152: aload #8
    //   1154: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1157: invokevirtual getName : ()Ljava/lang/String;
    //   1160: ifnull -> 1200
    //   1163: goto -> 1170
    //   1166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1169: athrow
    //   1170: aload #8
    //   1172: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1175: invokevirtual getName : ()Ljava/lang/String;
    //   1178: sipush #-9834
    //   1181: sipush #-16647
    //   1184: invokestatic a : (II)Ljava/lang/String;
    //   1187: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1190: ifne -> 1200
    //   1193: goto -> 1200
    //   1196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1199: athrow
    //   1200: aload #7
    //   1202: iconst_1
    //   1203: invokevirtual setAccessible : (Z)V
    //   1206: aload #7
    //   1208: aconst_null
    //   1209: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1212: pop
    //   1213: iinc #6, 1
    //   1216: iload_2
    //   1217: ifeq -> 1078
    //   1220: sipush #-9843
    //   1223: sipush #-31737
    //   1226: invokestatic a : (II)Ljava/lang/String;
    //   1229: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1232: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1235: astore #4
    //   1237: aload #4
    //   1239: arraylength
    //   1240: istore #5
    //   1242: iconst_0
    //   1243: istore #6
    //   1245: iload #6
    //   1247: iload #5
    //   1249: if_icmpge -> 1385
    //   1252: aload #4
    //   1254: iload #6
    //   1256: aaload
    //   1257: astore #7
    //   1259: aload #7
    //   1261: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1264: pop
    //   1265: aload #7
    //   1267: invokevirtual getModifiers : ()I
    //   1270: invokestatic isStatic : (I)Z
    //   1273: ifeq -> 1371
    //   1276: aload #7
    //   1278: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1281: arraylength
    //   1282: iconst_2
    //   1283: if_icmpne -> 1371
    //   1286: goto -> 1293
    //   1289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1292: athrow
    //   1293: aload #7
    //   1295: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1298: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1301: if_acmpne -> 1371
    //   1304: goto -> 1311
    //   1307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1310: athrow
    //   1311: aload #7
    //   1313: iconst_1
    //   1314: invokevirtual setAccessible : (Z)V
    //   1317: aload #7
    //   1319: aconst_null
    //   1320: iconst_2
    //   1321: anewarray java/lang/Object
    //   1324: dup
    //   1325: iconst_0
    //   1326: aload_0
    //   1327: aastore
    //   1328: dup
    //   1329: iconst_1
    //   1330: aload_1
    //   1331: ifnonnull -> 1349
    //   1334: goto -> 1341
    //   1337: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1340: athrow
    //   1341: aload_1
    //   1342: goto -> 1356
    //   1345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1348: athrow
    //   1349: aload_1
    //   1350: checkcast [B
    //   1353: invokevirtual clone : ()Ljava/lang/Object;
    //   1356: aastore
    //   1357: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1360: checkcast java/lang/Boolean
    //   1363: invokevirtual booleanValue : ()Z
    //   1366: istore_3
    //   1367: iload_2
    //   1368: ifeq -> 1385
    //   1371: iinc #6, 1
    //   1374: iload_2
    //   1375: ifeq -> 1245
    //   1378: goto -> 1385
    //   1381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1384: athrow
    //   1385: goto -> 1726
    //   1388: sipush #-9852
    //   1391: sipush #-2121
    //   1394: invokestatic a : (II)Ljava/lang/String;
    //   1397: iconst_1
    //   1398: ldc burp/Zxo4
    //   1400: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1403: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1406: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1409: astore #4
    //   1411: aload #4
    //   1413: arraylength
    //   1414: istore #5
    //   1416: iconst_0
    //   1417: istore #6
    //   1419: iload #6
    //   1421: iload #5
    //   1423: if_icmpge -> 1561
    //   1426: aload #4
    //   1428: iload #6
    //   1430: aaload
    //   1431: astore #7
    //   1433: aload #7
    //   1435: invokevirtual getModifiers : ()I
    //   1438: invokestatic isStatic : (I)Z
    //   1441: ifne -> 1451
    //   1444: goto -> 1554
    //   1447: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1450: athrow
    //   1451: aload #7
    //   1453: invokevirtual getType : ()Ljava/lang/Class;
    //   1456: astore #8
    //   1458: aload #8
    //   1460: ifnull -> 1541
    //   1463: aload #8
    //   1465: invokevirtual isPrimitive : ()Z
    //   1468: ifne -> 1541
    //   1471: goto -> 1478
    //   1474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1477: athrow
    //   1478: aload #8
    //   1480: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1483: ifnull -> 1541
    //   1486: goto -> 1493
    //   1489: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1492: athrow
    //   1493: aload #8
    //   1495: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1498: invokevirtual getName : ()Ljava/lang/String;
    //   1501: ifnull -> 1541
    //   1504: goto -> 1511
    //   1507: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1510: athrow
    //   1511: aload #8
    //   1513: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1516: invokevirtual getName : ()Ljava/lang/String;
    //   1519: sipush #-9834
    //   1522: sipush #-16647
    //   1525: invokestatic a : (II)Ljava/lang/String;
    //   1528: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1531: ifne -> 1541
    //   1534: goto -> 1541
    //   1537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1540: athrow
    //   1541: aload #7
    //   1543: iconst_1
    //   1544: invokevirtual setAccessible : (Z)V
    //   1547: aload #7
    //   1549: aconst_null
    //   1550: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1553: pop
    //   1554: iinc #6, 1
    //   1557: iload_2
    //   1558: ifeq -> 1419
    //   1561: sipush #-9847
    //   1564: sipush #18791
    //   1567: invokestatic a : (II)Ljava/lang/String;
    //   1570: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1573: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1576: astore #4
    //   1578: aload #4
    //   1580: arraylength
    //   1581: istore #5
    //   1583: iconst_0
    //   1584: istore #6
    //   1586: iload #6
    //   1588: iload #5
    //   1590: if_icmpge -> 1726
    //   1593: aload #4
    //   1595: iload #6
    //   1597: aaload
    //   1598: astore #7
    //   1600: aload #7
    //   1602: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1605: pop
    //   1606: aload #7
    //   1608: invokevirtual getModifiers : ()I
    //   1611: invokestatic isStatic : (I)Z
    //   1614: ifeq -> 1712
    //   1617: aload #7
    //   1619: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1622: arraylength
    //   1623: iconst_2
    //   1624: if_icmpne -> 1712
    //   1627: goto -> 1634
    //   1630: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1633: athrow
    //   1634: aload #7
    //   1636: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1639: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1642: if_acmpne -> 1712
    //   1645: goto -> 1652
    //   1648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1651: athrow
    //   1652: aload #7
    //   1654: iconst_1
    //   1655: invokevirtual setAccessible : (Z)V
    //   1658: aload #7
    //   1660: aconst_null
    //   1661: iconst_2
    //   1662: anewarray java/lang/Object
    //   1665: dup
    //   1666: iconst_0
    //   1667: aload_0
    //   1668: aastore
    //   1669: dup
    //   1670: iconst_1
    //   1671: aload_1
    //   1672: ifnonnull -> 1690
    //   1675: goto -> 1682
    //   1678: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1681: athrow
    //   1682: aload_1
    //   1683: goto -> 1697
    //   1686: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1689: athrow
    //   1690: aload_1
    //   1691: checkcast [B
    //   1694: invokevirtual clone : ()Ljava/lang/Object;
    //   1697: aastore
    //   1698: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1701: checkcast java/lang/Boolean
    //   1704: invokevirtual booleanValue : ()Z
    //   1707: istore_3
    //   1708: iload_2
    //   1709: ifeq -> 1726
    //   1712: iinc #6, 1
    //   1715: iload_2
    //   1716: ifeq -> 1586
    //   1719: goto -> 1726
    //   1722: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1725: athrow
    //   1726: iload_3
    //   1727: ifeq -> 1732
    //   1730: iload_3
    //   1731: ireturn
    //   1732: getstatic burp/Zgeq.ZF : Ljava/lang/String;
    //   1735: getstatic burp/Ze84.Zj : Ljava/lang/Object;
    //   1738: checkcast java/math/BigInteger
    //   1741: invokevirtual intValue : ()I
    //   1744: bipush #32
    //   1746: irem
    //   1747: invokestatic abs : (I)I
    //   1750: invokevirtual charAt : (I)C
    //   1753: getstatic burp/Ztbn.Zx : Ljava/lang/String;
    //   1756: getstatic burp/Zbow.ZS : Ljava/lang/Object;
    //   1759: checkcast java/math/BigInteger
    //   1762: invokevirtual intValue : ()I
    //   1765: bipush #32
    //   1767: irem
    //   1768: invokestatic abs : (I)I
    //   1771: invokevirtual charAt : (I)C
    //   1774: if_icmpgt -> 2119
    //   1777: sipush #-9840
    //   1780: sipush #-14258
    //   1783: invokestatic a : (II)Ljava/lang/String;
    //   1786: iconst_1
    //   1787: ldc burp/Zlbd
    //   1789: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1792: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1795: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1798: astore #4
    //   1800: aload #4
    //   1802: arraylength
    //   1803: istore #5
    //   1805: iconst_0
    //   1806: istore #6
    //   1808: iload #6
    //   1810: iload #5
    //   1812: if_icmpge -> 1950
    //   1815: aload #4
    //   1817: iload #6
    //   1819: aaload
    //   1820: astore #7
    //   1822: aload #7
    //   1824: invokevirtual getModifiers : ()I
    //   1827: invokestatic isStatic : (I)Z
    //   1830: ifne -> 1840
    //   1833: goto -> 1943
    //   1836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1839: athrow
    //   1840: aload #7
    //   1842: invokevirtual getType : ()Ljava/lang/Class;
    //   1845: astore #8
    //   1847: aload #8
    //   1849: ifnull -> 1930
    //   1852: aload #8
    //   1854: invokevirtual isPrimitive : ()Z
    //   1857: ifne -> 1930
    //   1860: goto -> 1867
    //   1863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1866: athrow
    //   1867: aload #8
    //   1869: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1872: ifnull -> 1930
    //   1875: goto -> 1882
    //   1878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1881: athrow
    //   1882: aload #8
    //   1884: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1887: invokevirtual getName : ()Ljava/lang/String;
    //   1890: ifnull -> 1930
    //   1893: goto -> 1900
    //   1896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1899: athrow
    //   1900: aload #8
    //   1902: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1905: invokevirtual getName : ()Ljava/lang/String;
    //   1908: sipush #-9834
    //   1911: sipush #-16647
    //   1914: invokestatic a : (II)Ljava/lang/String;
    //   1917: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1920: ifne -> 1930
    //   1923: goto -> 1930
    //   1926: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1929: athrow
    //   1930: aload #7
    //   1932: iconst_1
    //   1933: invokevirtual setAccessible : (Z)V
    //   1936: aload #7
    //   1938: aconst_null
    //   1939: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1942: pop
    //   1943: iinc #6, 1
    //   1946: iload_2
    //   1947: ifeq -> 1808
    //   1950: sipush #-9830
    //   1953: sipush #19876
    //   1956: invokestatic a : (II)Ljava/lang/String;
    //   1959: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1962: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1965: astore #4
    //   1967: aload #4
    //   1969: arraylength
    //   1970: istore #5
    //   1972: iconst_0
    //   1973: istore #6
    //   1975: iload #6
    //   1977: iload #5
    //   1979: if_icmpge -> 2115
    //   1982: aload #4
    //   1984: iload #6
    //   1986: aaload
    //   1987: astore #7
    //   1989: aload #7
    //   1991: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1994: pop
    //   1995: aload #7
    //   1997: invokevirtual getModifiers : ()I
    //   2000: invokestatic isStatic : (I)Z
    //   2003: ifeq -> 2101
    //   2006: aload #7
    //   2008: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2011: arraylength
    //   2012: iconst_2
    //   2013: if_icmpne -> 2101
    //   2016: goto -> 2023
    //   2019: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2022: athrow
    //   2023: aload #7
    //   2025: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2028: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2031: if_acmpne -> 2101
    //   2034: goto -> 2041
    //   2037: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2040: athrow
    //   2041: aload #7
    //   2043: iconst_1
    //   2044: invokevirtual setAccessible : (Z)V
    //   2047: aload #7
    //   2049: aconst_null
    //   2050: iconst_2
    //   2051: anewarray java/lang/Object
    //   2054: dup
    //   2055: iconst_0
    //   2056: aload_0
    //   2057: aastore
    //   2058: dup
    //   2059: iconst_1
    //   2060: aload_1
    //   2061: ifnonnull -> 2079
    //   2064: goto -> 2071
    //   2067: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2070: athrow
    //   2071: aload_1
    //   2072: goto -> 2086
    //   2075: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2078: athrow
    //   2079: aload_1
    //   2080: checkcast [B
    //   2083: invokevirtual clone : ()Ljava/lang/Object;
    //   2086: aastore
    //   2087: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2090: checkcast java/lang/Boolean
    //   2093: invokevirtual booleanValue : ()Z
    //   2096: istore_3
    //   2097: iload_2
    //   2098: ifeq -> 2115
    //   2101: iinc #6, 1
    //   2104: iload_2
    //   2105: ifeq -> 1975
    //   2108: goto -> 2115
    //   2111: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2114: athrow
    //   2115: iload_2
    //   2116: ifeq -> 2457
    //   2119: sipush #-9851
    //   2122: sipush #6042
    //   2125: invokestatic a : (II)Ljava/lang/String;
    //   2128: iconst_1
    //   2129: ldc burp/Zezn
    //   2131: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2134: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2137: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2140: astore #4
    //   2142: aload #4
    //   2144: arraylength
    //   2145: istore #5
    //   2147: iconst_0
    //   2148: istore #6
    //   2150: iload #6
    //   2152: iload #5
    //   2154: if_icmpge -> 2292
    //   2157: aload #4
    //   2159: iload #6
    //   2161: aaload
    //   2162: astore #7
    //   2164: aload #7
    //   2166: invokevirtual getModifiers : ()I
    //   2169: invokestatic isStatic : (I)Z
    //   2172: ifne -> 2182
    //   2175: goto -> 2285
    //   2178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2181: athrow
    //   2182: aload #7
    //   2184: invokevirtual getType : ()Ljava/lang/Class;
    //   2187: astore #8
    //   2189: aload #8
    //   2191: ifnull -> 2272
    //   2194: aload #8
    //   2196: invokevirtual isPrimitive : ()Z
    //   2199: ifne -> 2272
    //   2202: goto -> 2209
    //   2205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2208: athrow
    //   2209: aload #8
    //   2211: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2214: ifnull -> 2272
    //   2217: goto -> 2224
    //   2220: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2223: athrow
    //   2224: aload #8
    //   2226: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2229: invokevirtual getName : ()Ljava/lang/String;
    //   2232: ifnull -> 2272
    //   2235: goto -> 2242
    //   2238: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2241: athrow
    //   2242: aload #8
    //   2244: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2247: invokevirtual getName : ()Ljava/lang/String;
    //   2250: sipush #-9834
    //   2253: sipush #-16647
    //   2256: invokestatic a : (II)Ljava/lang/String;
    //   2259: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2262: ifne -> 2272
    //   2265: goto -> 2272
    //   2268: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2271: athrow
    //   2272: aload #7
    //   2274: iconst_1
    //   2275: invokevirtual setAccessible : (Z)V
    //   2278: aload #7
    //   2280: aconst_null
    //   2281: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2284: pop
    //   2285: iinc #6, 1
    //   2288: iload_2
    //   2289: ifeq -> 2150
    //   2292: sipush #-9835
    //   2295: sipush #19741
    //   2298: invokestatic a : (II)Ljava/lang/String;
    //   2301: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2304: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2307: astore #4
    //   2309: aload #4
    //   2311: arraylength
    //   2312: istore #5
    //   2314: iconst_0
    //   2315: istore #6
    //   2317: iload #6
    //   2319: iload #5
    //   2321: if_icmpge -> 2457
    //   2324: aload #4
    //   2326: iload #6
    //   2328: aaload
    //   2329: astore #7
    //   2331: aload #7
    //   2333: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2336: pop
    //   2337: aload #7
    //   2339: invokevirtual getModifiers : ()I
    //   2342: invokestatic isStatic : (I)Z
    //   2345: ifeq -> 2443
    //   2348: aload #7
    //   2350: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2353: arraylength
    //   2354: iconst_2
    //   2355: if_icmpne -> 2443
    //   2358: goto -> 2365
    //   2361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2364: athrow
    //   2365: aload #7
    //   2367: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2370: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2373: if_acmpne -> 2443
    //   2376: goto -> 2383
    //   2379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2382: athrow
    //   2383: aload #7
    //   2385: iconst_1
    //   2386: invokevirtual setAccessible : (Z)V
    //   2389: aload #7
    //   2391: aconst_null
    //   2392: iconst_2
    //   2393: anewarray java/lang/Object
    //   2396: dup
    //   2397: iconst_0
    //   2398: aload_0
    //   2399: aastore
    //   2400: dup
    //   2401: iconst_1
    //   2402: aload_1
    //   2403: ifnonnull -> 2421
    //   2406: goto -> 2413
    //   2409: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2412: athrow
    //   2413: aload_1
    //   2414: goto -> 2428
    //   2417: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2420: athrow
    //   2421: aload_1
    //   2422: checkcast [B
    //   2425: invokevirtual clone : ()Ljava/lang/Object;
    //   2428: aastore
    //   2429: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2432: checkcast java/lang/Boolean
    //   2435: invokevirtual booleanValue : ()Z
    //   2438: istore_3
    //   2439: iload_2
    //   2440: ifeq -> 2457
    //   2443: iinc #6, 1
    //   2446: iload_2
    //   2447: ifeq -> 2317
    //   2450: goto -> 2457
    //   2453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2456: athrow
    //   2457: iload_3
    //   2458: ifeq -> 2463
    //   2461: iload_3
    //   2462: ireturn
    //   2463: getstatic burp/Zbun.ZS : Ljava/lang/String;
    //   2466: getstatic burp/Zxp5.ZA : Ljava/lang/Object;
    //   2469: checkcast java/math/BigInteger
    //   2472: invokevirtual intValue : ()I
    //   2475: bipush #32
    //   2477: irem
    //   2478: invokestatic abs : (I)I
    //   2481: invokevirtual charAt : (I)C
    //   2484: getstatic burp/Zb2u.ZM : Ljava/lang/String;
    //   2487: getstatic burp/Zg1l.Zg : Ljava/lang/Object;
    //   2490: checkcast java/math/BigInteger
    //   2493: invokevirtual intValue : ()I
    //   2496: bipush #32
    //   2498: irem
    //   2499: invokestatic abs : (I)I
    //   2502: invokevirtual charAt : (I)C
    //   2505: if_icmple -> 2850
    //   2508: sipush #-9848
    //   2511: sipush #19453
    //   2514: invokestatic a : (II)Ljava/lang/String;
    //   2517: iconst_1
    //   2518: ldc burp/Zsde
    //   2520: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2523: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2526: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2529: astore #4
    //   2531: aload #4
    //   2533: arraylength
    //   2534: istore #5
    //   2536: iconst_0
    //   2537: istore #6
    //   2539: iload #6
    //   2541: iload #5
    //   2543: if_icmpge -> 2681
    //   2546: aload #4
    //   2548: iload #6
    //   2550: aaload
    //   2551: astore #7
    //   2553: aload #7
    //   2555: invokevirtual getModifiers : ()I
    //   2558: invokestatic isStatic : (I)Z
    //   2561: ifne -> 2571
    //   2564: goto -> 2674
    //   2567: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2570: athrow
    //   2571: aload #7
    //   2573: invokevirtual getType : ()Ljava/lang/Class;
    //   2576: astore #8
    //   2578: aload #8
    //   2580: ifnull -> 2661
    //   2583: aload #8
    //   2585: invokevirtual isPrimitive : ()Z
    //   2588: ifne -> 2661
    //   2591: goto -> 2598
    //   2594: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2597: athrow
    //   2598: aload #8
    //   2600: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2603: ifnull -> 2661
    //   2606: goto -> 2613
    //   2609: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2612: athrow
    //   2613: aload #8
    //   2615: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2618: invokevirtual getName : ()Ljava/lang/String;
    //   2621: ifnull -> 2661
    //   2624: goto -> 2631
    //   2627: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2630: athrow
    //   2631: aload #8
    //   2633: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2636: invokevirtual getName : ()Ljava/lang/String;
    //   2639: sipush #-9834
    //   2642: sipush #-16647
    //   2645: invokestatic a : (II)Ljava/lang/String;
    //   2648: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2651: ifne -> 2661
    //   2654: goto -> 2661
    //   2657: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2660: athrow
    //   2661: aload #7
    //   2663: iconst_1
    //   2664: invokevirtual setAccessible : (Z)V
    //   2667: aload #7
    //   2669: aconst_null
    //   2670: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2673: pop
    //   2674: iinc #6, 1
    //   2677: iload_2
    //   2678: ifeq -> 2539
    //   2681: sipush #-9853
    //   2684: sipush #-11540
    //   2687: invokestatic a : (II)Ljava/lang/String;
    //   2690: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2693: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2696: astore #4
    //   2698: aload #4
    //   2700: arraylength
    //   2701: istore #5
    //   2703: iconst_0
    //   2704: istore #6
    //   2706: iload #6
    //   2708: iload #5
    //   2710: if_icmpge -> 2846
    //   2713: aload #4
    //   2715: iload #6
    //   2717: aaload
    //   2718: astore #7
    //   2720: aload #7
    //   2722: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2725: pop
    //   2726: aload #7
    //   2728: invokevirtual getModifiers : ()I
    //   2731: invokestatic isStatic : (I)Z
    //   2734: ifeq -> 2832
    //   2737: aload #7
    //   2739: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2742: arraylength
    //   2743: iconst_2
    //   2744: if_icmpne -> 2832
    //   2747: goto -> 2754
    //   2750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2753: athrow
    //   2754: aload #7
    //   2756: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2759: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2762: if_acmpne -> 2832
    //   2765: goto -> 2772
    //   2768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2771: athrow
    //   2772: aload #7
    //   2774: iconst_1
    //   2775: invokevirtual setAccessible : (Z)V
    //   2778: aload #7
    //   2780: aconst_null
    //   2781: iconst_2
    //   2782: anewarray java/lang/Object
    //   2785: dup
    //   2786: iconst_0
    //   2787: aload_0
    //   2788: aastore
    //   2789: dup
    //   2790: iconst_1
    //   2791: aload_1
    //   2792: ifnonnull -> 2810
    //   2795: goto -> 2802
    //   2798: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2801: athrow
    //   2802: aload_1
    //   2803: goto -> 2817
    //   2806: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2809: athrow
    //   2810: aload_1
    //   2811: checkcast [B
    //   2814: invokevirtual clone : ()Ljava/lang/Object;
    //   2817: aastore
    //   2818: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2821: checkcast java/lang/Boolean
    //   2824: invokevirtual booleanValue : ()Z
    //   2827: istore_3
    //   2828: iload_2
    //   2829: ifeq -> 2846
    //   2832: iinc #6, 1
    //   2835: iload_2
    //   2836: ifeq -> 2706
    //   2839: goto -> 2846
    //   2842: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2845: athrow
    //   2846: iload_2
    //   2847: ifeq -> 3188
    //   2850: sipush #-9842
    //   2853: sipush #5778
    //   2856: invokestatic a : (II)Ljava/lang/String;
    //   2859: iconst_1
    //   2860: ldc burp/Zgp_
    //   2862: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2865: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2868: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2871: astore #4
    //   2873: aload #4
    //   2875: arraylength
    //   2876: istore #5
    //   2878: iconst_0
    //   2879: istore #6
    //   2881: iload #6
    //   2883: iload #5
    //   2885: if_icmpge -> 3023
    //   2888: aload #4
    //   2890: iload #6
    //   2892: aaload
    //   2893: astore #7
    //   2895: aload #7
    //   2897: invokevirtual getModifiers : ()I
    //   2900: invokestatic isStatic : (I)Z
    //   2903: ifne -> 2913
    //   2906: goto -> 3016
    //   2909: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2912: athrow
    //   2913: aload #7
    //   2915: invokevirtual getType : ()Ljava/lang/Class;
    //   2918: astore #8
    //   2920: aload #8
    //   2922: ifnull -> 3003
    //   2925: aload #8
    //   2927: invokevirtual isPrimitive : ()Z
    //   2930: ifne -> 3003
    //   2933: goto -> 2940
    //   2936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2939: athrow
    //   2940: aload #8
    //   2942: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2945: ifnull -> 3003
    //   2948: goto -> 2955
    //   2951: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2954: athrow
    //   2955: aload #8
    //   2957: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2960: invokevirtual getName : ()Ljava/lang/String;
    //   2963: ifnull -> 3003
    //   2966: goto -> 2973
    //   2969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2972: athrow
    //   2973: aload #8
    //   2975: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2978: invokevirtual getName : ()Ljava/lang/String;
    //   2981: sipush #-9834
    //   2984: sipush #-16647
    //   2987: invokestatic a : (II)Ljava/lang/String;
    //   2990: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2993: ifne -> 3003
    //   2996: goto -> 3003
    //   2999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3002: athrow
    //   3003: aload #7
    //   3005: iconst_1
    //   3006: invokevirtual setAccessible : (Z)V
    //   3009: aload #7
    //   3011: aconst_null
    //   3012: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3015: pop
    //   3016: iinc #6, 1
    //   3019: iload_2
    //   3020: ifeq -> 2881
    //   3023: sipush #-9826
    //   3026: sipush #11862
    //   3029: invokestatic a : (II)Ljava/lang/String;
    //   3032: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3035: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3038: astore #4
    //   3040: aload #4
    //   3042: arraylength
    //   3043: istore #5
    //   3045: iconst_0
    //   3046: istore #6
    //   3048: iload #6
    //   3050: iload #5
    //   3052: if_icmpge -> 3188
    //   3055: aload #4
    //   3057: iload #6
    //   3059: aaload
    //   3060: astore #7
    //   3062: aload #7
    //   3064: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3067: pop
    //   3068: aload #7
    //   3070: invokevirtual getModifiers : ()I
    //   3073: invokestatic isStatic : (I)Z
    //   3076: ifeq -> 3174
    //   3079: aload #7
    //   3081: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3084: arraylength
    //   3085: iconst_2
    //   3086: if_icmpne -> 3174
    //   3089: goto -> 3096
    //   3092: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3095: athrow
    //   3096: aload #7
    //   3098: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3101: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3104: if_acmpne -> 3174
    //   3107: goto -> 3114
    //   3110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3113: athrow
    //   3114: aload #7
    //   3116: iconst_1
    //   3117: invokevirtual setAccessible : (Z)V
    //   3120: aload #7
    //   3122: aconst_null
    //   3123: iconst_2
    //   3124: anewarray java/lang/Object
    //   3127: dup
    //   3128: iconst_0
    //   3129: aload_0
    //   3130: aastore
    //   3131: dup
    //   3132: iconst_1
    //   3133: aload_1
    //   3134: ifnonnull -> 3152
    //   3137: goto -> 3144
    //   3140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3143: athrow
    //   3144: aload_1
    //   3145: goto -> 3159
    //   3148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3151: athrow
    //   3152: aload_1
    //   3153: checkcast [B
    //   3156: invokevirtual clone : ()Ljava/lang/Object;
    //   3159: aastore
    //   3160: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3163: checkcast java/lang/Boolean
    //   3166: invokevirtual booleanValue : ()Z
    //   3169: istore_3
    //   3170: iload_2
    //   3171: ifeq -> 3188
    //   3174: iinc #6, 1
    //   3177: iload_2
    //   3178: ifeq -> 3048
    //   3181: goto -> 3188
    //   3184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3187: athrow
    //   3188: iload_3
    //   3189: ifeq -> 3194
    //   3192: iload_3
    //   3193: ireturn
    //   3194: getstatic burp/Zsdl.ZJ : Ljava/lang/String;
    //   3197: getstatic burp/Zg6z.ZS : Ljava/lang/Object;
    //   3200: checkcast java/math/BigInteger
    //   3203: invokevirtual intValue : ()I
    //   3206: bipush #32
    //   3208: irem
    //   3209: invokestatic abs : (I)I
    //   3212: invokevirtual charAt : (I)C
    //   3215: getstatic burp/Ze1k.ZI : Ljava/lang/String;
    //   3218: getstatic burp/Zx63.ZX : Ljava/lang/Object;
    //   3221: checkcast java/math/BigInteger
    //   3224: invokevirtual intValue : ()I
    //   3227: bipush #32
    //   3229: irem
    //   3230: invokestatic abs : (I)I
    //   3233: invokevirtual charAt : (I)C
    //   3236: if_icmple -> 3581
    //   3239: sipush #-9856
    //   3242: sipush #-11744
    //   3245: invokestatic a : (II)Ljava/lang/String;
    //   3248: iconst_1
    //   3249: ldc burp/Zty5
    //   3251: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3254: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3257: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3260: astore #4
    //   3262: aload #4
    //   3264: arraylength
    //   3265: istore #5
    //   3267: iconst_0
    //   3268: istore #6
    //   3270: iload #6
    //   3272: iload #5
    //   3274: if_icmpge -> 3412
    //   3277: aload #4
    //   3279: iload #6
    //   3281: aaload
    //   3282: astore #7
    //   3284: aload #7
    //   3286: invokevirtual getModifiers : ()I
    //   3289: invokestatic isStatic : (I)Z
    //   3292: ifne -> 3302
    //   3295: goto -> 3405
    //   3298: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3301: athrow
    //   3302: aload #7
    //   3304: invokevirtual getType : ()Ljava/lang/Class;
    //   3307: astore #8
    //   3309: aload #8
    //   3311: ifnull -> 3392
    //   3314: aload #8
    //   3316: invokevirtual isPrimitive : ()Z
    //   3319: ifne -> 3392
    //   3322: goto -> 3329
    //   3325: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3328: athrow
    //   3329: aload #8
    //   3331: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3334: ifnull -> 3392
    //   3337: goto -> 3344
    //   3340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3343: athrow
    //   3344: aload #8
    //   3346: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3349: invokevirtual getName : ()Ljava/lang/String;
    //   3352: ifnull -> 3392
    //   3355: goto -> 3362
    //   3358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3361: athrow
    //   3362: aload #8
    //   3364: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3367: invokevirtual getName : ()Ljava/lang/String;
    //   3370: sipush #-9834
    //   3373: sipush #-16647
    //   3376: invokestatic a : (II)Ljava/lang/String;
    //   3379: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3382: ifne -> 3392
    //   3385: goto -> 3392
    //   3388: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3391: athrow
    //   3392: aload #7
    //   3394: iconst_1
    //   3395: invokevirtual setAccessible : (Z)V
    //   3398: aload #7
    //   3400: aconst_null
    //   3401: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3404: pop
    //   3405: iinc #6, 1
    //   3408: iload_2
    //   3409: ifeq -> 3270
    //   3412: sipush #-9831
    //   3415: sipush #17238
    //   3418: invokestatic a : (II)Ljava/lang/String;
    //   3421: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3424: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3427: astore #4
    //   3429: aload #4
    //   3431: arraylength
    //   3432: istore #5
    //   3434: iconst_0
    //   3435: istore #6
    //   3437: iload #6
    //   3439: iload #5
    //   3441: if_icmpge -> 3577
    //   3444: aload #4
    //   3446: iload #6
    //   3448: aaload
    //   3449: astore #7
    //   3451: aload #7
    //   3453: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3456: pop
    //   3457: aload #7
    //   3459: invokevirtual getModifiers : ()I
    //   3462: invokestatic isStatic : (I)Z
    //   3465: ifeq -> 3563
    //   3468: aload #7
    //   3470: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3473: arraylength
    //   3474: iconst_2
    //   3475: if_icmpne -> 3563
    //   3478: goto -> 3485
    //   3481: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3484: athrow
    //   3485: aload #7
    //   3487: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3490: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3493: if_acmpne -> 3563
    //   3496: goto -> 3503
    //   3499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3502: athrow
    //   3503: aload #7
    //   3505: iconst_1
    //   3506: invokevirtual setAccessible : (Z)V
    //   3509: aload #7
    //   3511: aconst_null
    //   3512: iconst_2
    //   3513: anewarray java/lang/Object
    //   3516: dup
    //   3517: iconst_0
    //   3518: aload_0
    //   3519: aastore
    //   3520: dup
    //   3521: iconst_1
    //   3522: aload_1
    //   3523: ifnonnull -> 3541
    //   3526: goto -> 3533
    //   3529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3532: athrow
    //   3533: aload_1
    //   3534: goto -> 3548
    //   3537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3540: athrow
    //   3541: aload_1
    //   3542: checkcast [B
    //   3545: invokevirtual clone : ()Ljava/lang/Object;
    //   3548: aastore
    //   3549: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3552: checkcast java/lang/Boolean
    //   3555: invokevirtual booleanValue : ()Z
    //   3558: istore_3
    //   3559: iload_2
    //   3560: ifeq -> 3577
    //   3563: iinc #6, 1
    //   3566: iload_2
    //   3567: ifeq -> 3437
    //   3570: goto -> 3577
    //   3573: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3576: athrow
    //   3577: iload_2
    //   3578: ifeq -> 3919
    //   3581: sipush #-9849
    //   3584: sipush #22882
    //   3587: invokestatic a : (II)Ljava/lang/String;
    //   3590: iconst_1
    //   3591: ldc burp/Zl3j
    //   3593: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3596: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3599: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3602: astore #4
    //   3604: aload #4
    //   3606: arraylength
    //   3607: istore #5
    //   3609: iconst_0
    //   3610: istore #6
    //   3612: iload #6
    //   3614: iload #5
    //   3616: if_icmpge -> 3754
    //   3619: aload #4
    //   3621: iload #6
    //   3623: aaload
    //   3624: astore #7
    //   3626: aload #7
    //   3628: invokevirtual getModifiers : ()I
    //   3631: invokestatic isStatic : (I)Z
    //   3634: ifne -> 3644
    //   3637: goto -> 3747
    //   3640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3643: athrow
    //   3644: aload #7
    //   3646: invokevirtual getType : ()Ljava/lang/Class;
    //   3649: astore #8
    //   3651: aload #8
    //   3653: ifnull -> 3734
    //   3656: aload #8
    //   3658: invokevirtual isPrimitive : ()Z
    //   3661: ifne -> 3734
    //   3664: goto -> 3671
    //   3667: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3670: athrow
    //   3671: aload #8
    //   3673: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3676: ifnull -> 3734
    //   3679: goto -> 3686
    //   3682: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3685: athrow
    //   3686: aload #8
    //   3688: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3691: invokevirtual getName : ()Ljava/lang/String;
    //   3694: ifnull -> 3734
    //   3697: goto -> 3704
    //   3700: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3703: athrow
    //   3704: aload #8
    //   3706: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3709: invokevirtual getName : ()Ljava/lang/String;
    //   3712: sipush #-9834
    //   3715: sipush #-16647
    //   3718: invokestatic a : (II)Ljava/lang/String;
    //   3721: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3724: ifne -> 3734
    //   3727: goto -> 3734
    //   3730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3733: athrow
    //   3734: aload #7
    //   3736: iconst_1
    //   3737: invokevirtual setAccessible : (Z)V
    //   3740: aload #7
    //   3742: aconst_null
    //   3743: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3746: pop
    //   3747: iinc #6, 1
    //   3750: iload_2
    //   3751: ifeq -> 3612
    //   3754: sipush #-9833
    //   3757: sipush #-8991
    //   3760: invokestatic a : (II)Ljava/lang/String;
    //   3763: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3766: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3769: astore #4
    //   3771: aload #4
    //   3773: arraylength
    //   3774: istore #5
    //   3776: iconst_0
    //   3777: istore #6
    //   3779: iload #6
    //   3781: iload #5
    //   3783: if_icmpge -> 3919
    //   3786: aload #4
    //   3788: iload #6
    //   3790: aaload
    //   3791: astore #7
    //   3793: aload #7
    //   3795: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3798: pop
    //   3799: aload #7
    //   3801: invokevirtual getModifiers : ()I
    //   3804: invokestatic isStatic : (I)Z
    //   3807: ifeq -> 3905
    //   3810: aload #7
    //   3812: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3815: arraylength
    //   3816: iconst_2
    //   3817: if_icmpne -> 3905
    //   3820: goto -> 3827
    //   3823: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3826: athrow
    //   3827: aload #7
    //   3829: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3832: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3835: if_acmpne -> 3905
    //   3838: goto -> 3845
    //   3841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3844: athrow
    //   3845: aload #7
    //   3847: iconst_1
    //   3848: invokevirtual setAccessible : (Z)V
    //   3851: aload #7
    //   3853: aconst_null
    //   3854: iconst_2
    //   3855: anewarray java/lang/Object
    //   3858: dup
    //   3859: iconst_0
    //   3860: aload_0
    //   3861: aastore
    //   3862: dup
    //   3863: iconst_1
    //   3864: aload_1
    //   3865: ifnonnull -> 3883
    //   3868: goto -> 3875
    //   3871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3874: athrow
    //   3875: aload_1
    //   3876: goto -> 3890
    //   3879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3882: athrow
    //   3883: aload_1
    //   3884: checkcast [B
    //   3887: invokevirtual clone : ()Ljava/lang/Object;
    //   3890: aastore
    //   3891: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3894: checkcast java/lang/Boolean
    //   3897: invokevirtual booleanValue : ()Z
    //   3900: istore_3
    //   3901: iload_2
    //   3902: ifeq -> 3919
    //   3905: iinc #6, 1
    //   3908: iload_2
    //   3909: ifeq -> 3779
    //   3912: goto -> 3919
    //   3915: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3918: athrow
    //   3919: iload_3
    //   3920: ireturn
    //   3921: astore_3
    //   3922: new java/lang/Exception
    //   3925: dup
    //   3926: aload_3
    //   3927: invokevirtual getMessage : ()Ljava/lang/String;
    //   3930: invokespecial <init> : (Ljava/lang/String;)V
    //   3933: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1731	3921	java/lang/Throwable
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
    //   351	688	691	java/lang/Throwable
    //   522	532	532	java/lang/Throwable
    //   536	548	548	java/lang/Throwable
    //   552	564	564	java/lang/Throwable
    //   568	581	581	java/lang/Throwable
    //   585	598	598	java/lang/Throwable
    //   734	748	748	java/lang/Throwable
    //   759	772	775	java/lang/Throwable
    //   764	787	790	java/lang/Throwable
    //   779	805	808	java/lang/Throwable
    //   794	835	838	java/lang/Throwable
    //   898	925	928	java/lang/Throwable
    //   915	943	946	java/lang/Throwable
    //   932	979	982	java/lang/Throwable
    //   950	993	996	java/lang/Throwable
    //   1092	1106	1106	java/lang/Throwable
    //   1117	1130	1133	java/lang/Throwable
    //   1122	1145	1148	java/lang/Throwable
    //   1137	1163	1166	java/lang/Throwable
    //   1152	1193	1196	java/lang/Throwable
    //   1259	1286	1289	java/lang/Throwable
    //   1276	1304	1307	java/lang/Throwable
    //   1293	1334	1337	java/lang/Throwable
    //   1311	1345	1345	java/lang/Throwable
    //   1367	1378	1381	java/lang/Throwable
    //   1433	1447	1447	java/lang/Throwable
    //   1458	1471	1474	java/lang/Throwable
    //   1463	1486	1489	java/lang/Throwable
    //   1478	1504	1507	java/lang/Throwable
    //   1493	1534	1537	java/lang/Throwable
    //   1600	1627	1630	java/lang/Throwable
    //   1617	1645	1648	java/lang/Throwable
    //   1634	1675	1678	java/lang/Throwable
    //   1652	1686	1686	java/lang/Throwable
    //   1708	1719	1722	java/lang/Throwable
    //   1732	2462	3921	java/lang/Throwable
    //   1822	1836	1836	java/lang/Throwable
    //   1847	1860	1863	java/lang/Throwable
    //   1852	1875	1878	java/lang/Throwable
    //   1867	1893	1896	java/lang/Throwable
    //   1882	1923	1926	java/lang/Throwable
    //   1989	2016	2019	java/lang/Throwable
    //   2006	2034	2037	java/lang/Throwable
    //   2023	2064	2067	java/lang/Throwable
    //   2041	2075	2075	java/lang/Throwable
    //   2097	2108	2111	java/lang/Throwable
    //   2164	2178	2178	java/lang/Throwable
    //   2189	2202	2205	java/lang/Throwable
    //   2194	2217	2220	java/lang/Throwable
    //   2209	2235	2238	java/lang/Throwable
    //   2224	2265	2268	java/lang/Throwable
    //   2331	2358	2361	java/lang/Throwable
    //   2348	2376	2379	java/lang/Throwable
    //   2365	2406	2409	java/lang/Throwable
    //   2383	2417	2417	java/lang/Throwable
    //   2439	2450	2453	java/lang/Throwable
    //   2463	3193	3921	java/lang/Throwable
    //   2553	2567	2567	java/lang/Throwable
    //   2578	2591	2594	java/lang/Throwable
    //   2583	2606	2609	java/lang/Throwable
    //   2598	2624	2627	java/lang/Throwable
    //   2613	2654	2657	java/lang/Throwable
    //   2720	2747	2750	java/lang/Throwable
    //   2737	2765	2768	java/lang/Throwable
    //   2754	2795	2798	java/lang/Throwable
    //   2772	2806	2806	java/lang/Throwable
    //   2828	2839	2842	java/lang/Throwable
    //   2895	2909	2909	java/lang/Throwable
    //   2920	2933	2936	java/lang/Throwable
    //   2925	2948	2951	java/lang/Throwable
    //   2940	2966	2969	java/lang/Throwable
    //   2955	2996	2999	java/lang/Throwable
    //   3062	3089	3092	java/lang/Throwable
    //   3079	3107	3110	java/lang/Throwable
    //   3096	3137	3140	java/lang/Throwable
    //   3114	3148	3148	java/lang/Throwable
    //   3170	3181	3184	java/lang/Throwable
    //   3194	3920	3921	java/lang/Throwable
    //   3284	3298	3298	java/lang/Throwable
    //   3309	3322	3325	java/lang/Throwable
    //   3314	3337	3340	java/lang/Throwable
    //   3329	3355	3358	java/lang/Throwable
    //   3344	3385	3388	java/lang/Throwable
    //   3451	3478	3481	java/lang/Throwable
    //   3468	3496	3499	java/lang/Throwable
    //   3485	3526	3529	java/lang/Throwable
    //   3503	3537	3537	java/lang/Throwable
    //   3559	3570	3573	java/lang/Throwable
    //   3626	3640	3640	java/lang/Throwable
    //   3651	3664	3667	java/lang/Throwable
    //   3656	3679	3682	java/lang/Throwable
    //   3671	3697	3700	java/lang/Throwable
    //   3686	3727	3730	java/lang/Throwable
    //   3793	3820	3823	java/lang/Throwable
    //   3810	3838	3841	java/lang/Throwable
    //   3827	3868	3871	java/lang/Throwable
    //   3845	3879	3879	java/lang/Throwable
    //   3901	3912	3915	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '`@+\\tÈë>oywæ\\bÒé}/h\\tûiX?µ2Ù\\twjÉ_A¶t!©6\\tZeYÙã÷\\\tì'ºöé,¤ lmÔ\\fCûØüãÁûu=/ÊÚP·­Ôø½<g¾\\tRX,ù-³ò\\t(\\r"³úð\ù\\tKNswA\M\\f¯}j¦5qé·Ç<ÌÂ=9øÝòðfvcNëd9E\\fäù"3-Y|½]]\\r÷'>ÇD^Ô~ëbÎóoø¼NØá\\td\\t("úÐñ¨¡Í,ùr*ú³.]YþÖ \\tûNXÛµ§Ü\\t·Ñ"¶'@K Ò\\fìycONÏê?À0\\t§n\\nMú©¾©A\\tÛ¸ñÉ\\bOLÎg±N\\tßÜ %æ\\tfAë:ÃµÉ#Ç'\\rýÉHñGe\\tdã2çÜ\\t$|£ÊAé¸4Mn{Y¿ã=0¿g¹A¿F"Î\\f»þ+>4ÈÍT¥1_z¤¬º\\rÅAÉ\\nX}@!Ã,^ºVûxÂ "ï,\\r<*Dßð}E\\t­Oûì$'¹\\tää"#ôô\\tEEº¥u"\\triÑÈÖ×Y'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #47
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
    //   67: ldc 'aÅÓrdýÍ \\byäÐV|àñR'
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
    //   128: putstatic burp/Zr6c.a : [Ljava/lang/String;
    //   131: bipush #31
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr6c.b : [Ljava/lang/String;
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
    //   212: bipush #79
    //   214: goto -> 244
    //   217: bipush #64
    //   219: goto -> 244
    //   222: bipush #88
    //   224: goto -> 244
    //   227: bipush #123
    //   229: goto -> 244
    //   232: bipush #109
    //   234: goto -> 244
    //   237: bipush #115
    //   239: goto -> 244
    //   242: bipush #79
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
    //   304: sipush #-9825
    //   307: sipush #3436
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zr6c.ZG : Ljava/lang/Object;
    //   319: sipush #-9854
    //   322: sipush #29882
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zr6c.Zf : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD993) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */