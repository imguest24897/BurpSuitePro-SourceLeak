package burp;

import java.math.BigInteger;

class Zme extends ClassLoader {
  static Object Zd;
  
  static String Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zgss.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zr3x.Zb : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zzv.Zu : Ljava/lang/Object;
    //   22: sipush #31307
    //   25: sipush #12006
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zldx
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
    //   150: sipush #31301
    //   153: sipush #-11431
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
    //   192: sipush #31296
    //   195: sipush #3827
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
    //   359: sipush #31298
    //   362: aload_3
    //   363: sipush #202
    //   366: invokevirtual write : (I)V
    //   369: sipush #-29899
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
    //   415: getstatic burp/Zg5.Zs : Ljava/lang/Object;
    //   418: checkcast java/math/BigInteger
    //   421: invokevirtual toByteArray : ()[B
    //   424: invokevirtual write : ([B)V
    //   427: aload_3
    //   428: getstatic burp/Zetv.ZI : Ljava/lang/Object;
    //   431: checkcast java/math/BigInteger
    //   434: invokevirtual toByteArray : ()[B
    //   437: invokevirtual write : ([B)V
    //   440: aload_3
    //   441: getstatic burp/Zldx.ZM : Ljava/lang/Object;
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
    //   500: sipush #31299
    //   503: sipush #-28921
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
    //   619: ldc burp/Zkaw
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
    //   653: sipush #31306
    //   656: sipush #12281
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
    //   692: getstatic burp/Zg2.ZN : Ljava/lang/String;
    //   695: getstatic burp/Zlqm.Zw : Ljava/lang/Object;
    //   698: checkcast java/math/BigInteger
    //   701: invokevirtual intValue : ()I
    //   704: bipush #32
    //   706: irem
    //   707: invokestatic abs : (I)I
    //   710: invokevirtual charAt : (I)C
    //   713: getstatic burp/Zxn5.ZI : Ljava/lang/String;
    //   716: getstatic burp/Zgzv.Zb : Ljava/lang/Object;
    //   719: checkcast java/math/BigInteger
    //   722: invokevirtual intValue : ()I
    //   725: bipush #32
    //   727: irem
    //   728: invokestatic abs : (I)I
    //   731: invokevirtual charAt : (I)C
    //   734: if_icmple -> 841
    //   737: getstatic burp/Zbsr.Zq : Ljava/lang/String;
    //   740: getstatic burp/Ze82.ZR : Ljava/lang/Object;
    //   743: checkcast java/math/BigInteger
    //   746: invokevirtual intValue : ()I
    //   749: bipush #32
    //   751: irem
    //   752: invokestatic abs : (I)I
    //   755: invokevirtual charAt : (I)C
    //   758: getstatic burp/Zb2s.Zq : Ljava/lang/String;
    //   761: getstatic burp/Zelz.Z_ : Ljava/lang/Object;
    //   764: checkcast java/math/BigInteger
    //   767: invokevirtual intValue : ()I
    //   770: bipush #32
    //   772: irem
    //   773: invokestatic abs : (I)I
    //   776: invokevirtual charAt : (I)C
    //   779: if_icmple -> 841
    //   782: goto -> 789
    //   785: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   788: athrow
    //   789: getstatic burp/Ze_b.ZX : Ljava/lang/String;
    //   792: getstatic burp/Zkf9.ZX : Ljava/lang/Object;
    //   795: checkcast java/math/BigInteger
    //   798: invokevirtual intValue : ()I
    //   801: bipush #32
    //   803: irem
    //   804: invokestatic abs : (I)I
    //   807: invokevirtual charAt : (I)C
    //   810: getstatic burp/Zg7p.ZA : Ljava/lang/String;
    //   813: getstatic burp/Zb6e.ZD : Ljava/lang/Object;
    //   816: checkcast java/math/BigInteger
    //   819: invokevirtual intValue : ()I
    //   822: bipush #32
    //   824: irem
    //   825: invokestatic abs : (I)I
    //   828: invokevirtual charAt : (I)C
    //   831: if_icmple -> 849
    //   834: goto -> 841
    //   837: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   840: athrow
    //   841: iconst_1
    //   842: goto -> 850
    //   845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   848: athrow
    //   849: iconst_0
    //   850: ireturn
    //   851: astore_3
    //   852: new java/lang/Exception
    //   855: dup
    //   856: aload_3
    //   857: invokevirtual getMessage : ()Ljava/lang/String;
    //   860: invokespecial <init> : (Ljava/lang/String;)V
    //   863: athrow
    // Exception table:
    //   from	to	target	type
    //   4	850	851	java/lang/Throwable
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
    //   692	782	785	java/lang/Throwable
    //   737	834	837	java/lang/Throwable
    //   789	845	845	java/lang/Throwable
  }
  
  static void Zf(Object paramObject) {
    Znp.Zr = a(31297, -29855);
    Znp.ZJ = new BigInteger(a(31302, 1373));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zb20.ZL.charAt(Math.abs(((BigInteger)Zx_x.Zi).intValue() % 32)) > Ztys.Zn.charAt(Math.abs(((BigInteger)Zzou.Zz).intValue() % 32))) {
          try {
            Zm__.ZB(Class.forName(a(31300, -16799)));
            if (bool)
              Zlo2.ZL(Class.forName(a(31303, -19443))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zlo2.ZL(Class.forName(a(31303, -19443)));
    } catch (Throwable throwable) {}
  }
  
  static void ZU(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'uÍî*ÏÖgÖs¿âêÐ¤n~t§±§§²ð; bÏd¥GìL©°ü±í¦oæ\\b¥Ý²=Ä½nx°ÛÌ\\t!iL&Mñt\\tþ4·o8vMTý$`0oêýÂ¾HQã¦ëqË\\bü.á>±1¼ï±NãHCFÄ0èg¿gÝVå'H(â,ðt£¾ §Tëi\fÞÖî @£Lµá½\\tüx÷g\\t½O\\tjÁ%3=ïZor'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #28
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
    //   68: ldc 'àIAù n 1¢;)dÑrR\\nØ}RÍË¿ÍRÇ¯0\\n8'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #31
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
    //   129: putstatic burp/Zme.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zme.b : [Ljava/lang/String;
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
    //   212: bipush #71
    //   214: goto -> 244
    //   217: bipush #51
    //   219: goto -> 244
    //   222: bipush #67
    //   224: goto -> 244
    //   227: bipush #89
    //   229: goto -> 244
    //   232: bipush #124
    //   234: goto -> 244
    //   237: bipush #25
    //   239: goto -> 244
    //   242: bipush #99
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
    //   311: bipush #22
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-43
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #24
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-85
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #83
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-26
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #62
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #73
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #-58
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-4
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #-108
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #119
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #99
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-46
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-49
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #70
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-113
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-71
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #48
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-27
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #-85
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-65
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #77
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-51
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #96
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-40
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #110
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #113
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #37
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #22
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #12
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #69
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zme.Zd : Ljava/lang/Object;
    //   501: sipush #31305
    //   504: sipush #20103
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zme.Zp : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7A43) & 0xFFFF;
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
      byte b1 = 37;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zme.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */