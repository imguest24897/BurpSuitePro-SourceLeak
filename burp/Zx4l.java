package burp;

import java.math.BigInteger;

class Zx4l extends ClassLoader {
  static String Zy;
  
  static Object Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zb(Object paramObject) {
    Zg99.ZH = a(25067, 2918);
    Zg99.ZZ = new BigInteger(a(25066, 9720));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zter.ZE.charAt(Math.abs(((BigInteger)Zkbm.Zp).intValue() % 32)) > Zzk9.Zb.charAt(Math.abs(((BigInteger)Zxwl.Ze).intValue() % 32))) {
          try {
            Zxn5.Ze(Class.forName(a(25071, 10339)));
            if (!bool)
              Zkbm.Zg(Class.forName(a(25069, -16617))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkbm.Zg(Class.forName(a(25069, -16617)));
    } catch (Throwable throwable) {}
  }
  
  static void ZA(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   250: getstatic burp/Zkyc.ZD : Ljava/lang/Object;
    //   253: checkcast java/math/BigInteger
    //   256: getstatic burp/Ztnw.Zt : Ljava/lang/Object;
    //   259: checkcast java/math/BigInteger
    //   262: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   265: putstatic burp/Zxl5.Zh : Ljava/lang/Object;
    //   268: ldc2_w 8682522807148012
    //   271: invokestatic currentTimeMillis : ()J
    //   274: lxor
    //   275: lstore #4
    //   277: lload #4
    //   279: ldc2_w 25214903917
    //   282: lmul
    //   283: ldc2_w 11
    //   286: ladd
    //   287: ldc2_w 281474976710655
    //   290: land
    //   291: lstore #4
    //   293: lload #4
    //   295: bipush #32
    //   297: lshl
    //   298: lstore #6
    //   300: lload #4
    //   302: ldc2_w 25214903917
    //   305: lmul
    //   306: ldc2_w 11
    //   309: ladd
    //   310: ldc2_w 281474976710655
    //   313: land
    //   314: lstore #4
    //   316: lload #6
    //   318: lload #4
    //   320: ladd
    //   321: lstore #6
    //   323: bipush #16
    //   325: newarray byte
    //   327: dup
    //   328: iconst_0
    //   329: bipush #48
    //   331: bastore
    //   332: dup
    //   333: iconst_1
    //   334: bipush #49
    //   336: bastore
    //   337: dup
    //   338: iconst_2
    //   339: bipush #50
    //   341: bastore
    //   342: dup
    //   343: iconst_3
    //   344: bipush #51
    //   346: bastore
    //   347: dup
    //   348: iconst_4
    //   349: bipush #52
    //   351: bastore
    //   352: dup
    //   353: iconst_5
    //   354: bipush #53
    //   356: bastore
    //   357: dup
    //   358: bipush #6
    //   360: bipush #54
    //   362: bastore
    //   363: dup
    //   364: bipush #7
    //   366: bipush #55
    //   368: bastore
    //   369: dup
    //   370: bipush #8
    //   372: bipush #56
    //   374: bastore
    //   375: dup
    //   376: bipush #9
    //   378: bipush #57
    //   380: bastore
    //   381: dup
    //   382: bipush #10
    //   384: bipush #97
    //   386: bastore
    //   387: dup
    //   388: bipush #11
    //   390: bipush #98
    //   392: bastore
    //   393: dup
    //   394: bipush #12
    //   396: bipush #99
    //   398: bastore
    //   399: dup
    //   400: bipush #13
    //   402: bipush #100
    //   404: bastore
    //   405: dup
    //   406: bipush #14
    //   408: bipush #101
    //   410: bastore
    //   411: dup
    //   412: bipush #15
    //   414: bipush #102
    //   416: bastore
    //   417: astore #8
    //   419: bipush #64
    //   421: newarray byte
    //   423: astore #9
    //   425: bipush #64
    //   427: istore #10
    //   429: bipush #16
    //   431: istore #11
    //   433: iload #11
    //   435: iconst_1
    //   436: isub
    //   437: i2l
    //   438: lstore #12
    //   440: aload #9
    //   442: iinc #10, -1
    //   445: iload #10
    //   447: aload #8
    //   449: lload #6
    //   451: lload #12
    //   453: land
    //   454: l2i
    //   455: baload
    //   456: bastore
    //   457: lload #6
    //   459: iconst_4
    //   460: lushr
    //   461: lstore #6
    //   463: lload #6
    //   465: lconst_0
    //   466: lcmp
    //   467: ifne -> 440
    //   470: bipush #64
    //   472: iload #10
    //   474: isub
    //   475: newarray byte
    //   477: astore_3
    //   478: iconst_0
    //   479: istore #14
    //   481: iload #14
    //   483: aload_3
    //   484: arraylength
    //   485: if_icmpge -> 507
    //   488: aload_3
    //   489: iload #14
    //   491: aload #9
    //   493: iload #10
    //   495: iload #14
    //   497: iadd
    //   498: baload
    //   499: bastore
    //   500: iinc #14, 1
    //   503: iload_2
    //   504: ifne -> 481
    //   507: aload_3
    //   508: arraylength
    //   509: bipush #10
    //   511: if_icmplt -> 277
    //   514: sipush #25070
    //   517: sipush #-8500
    //   520: invokestatic a : (II)Ljava/lang/String;
    //   523: iconst_1
    //   524: ldc burp/Zgq_
    //   526: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   529: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   532: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   535: astore_3
    //   536: aload_3
    //   537: arraylength
    //   538: istore #4
    //   540: iconst_0
    //   541: istore #5
    //   543: iload #5
    //   545: iload #4
    //   547: if_icmpge -> 684
    //   550: aload_3
    //   551: iload #5
    //   553: aaload
    //   554: astore #6
    //   556: aload #6
    //   558: invokevirtual getModifiers : ()I
    //   561: invokestatic isStatic : (I)Z
    //   564: ifne -> 574
    //   567: goto -> 677
    //   570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   573: athrow
    //   574: aload #6
    //   576: invokevirtual getType : ()Ljava/lang/Class;
    //   579: astore #7
    //   581: aload #7
    //   583: ifnull -> 664
    //   586: aload #7
    //   588: invokevirtual isPrimitive : ()Z
    //   591: ifne -> 664
    //   594: goto -> 601
    //   597: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   600: athrow
    //   601: aload #7
    //   603: invokevirtual getPackage : ()Ljava/lang/Package;
    //   606: ifnull -> 664
    //   609: goto -> 616
    //   612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   615: athrow
    //   616: aload #7
    //   618: invokevirtual getPackage : ()Ljava/lang/Package;
    //   621: invokevirtual getName : ()Ljava/lang/String;
    //   624: ifnull -> 664
    //   627: goto -> 634
    //   630: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   633: athrow
    //   634: aload #7
    //   636: invokevirtual getPackage : ()Ljava/lang/Package;
    //   639: invokevirtual getName : ()Ljava/lang/String;
    //   642: sipush #25065
    //   645: sipush #20634
    //   648: invokestatic a : (II)Ljava/lang/String;
    //   651: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   654: ifne -> 664
    //   657: goto -> 664
    //   660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   663: athrow
    //   664: aload #6
    //   666: iconst_1
    //   667: invokevirtual setAccessible : (Z)V
    //   670: aload #6
    //   672: aconst_null
    //   673: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   676: pop
    //   677: iinc #5, 1
    //   680: iload_2
    //   681: ifne -> 543
    //   684: sipush #25068
    //   687: sipush #5062
    //   690: invokestatic a : (II)Ljava/lang/String;
    //   693: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   696: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   699: astore_3
    //   700: aload_3
    //   701: arraylength
    //   702: istore #4
    //   704: iconst_0
    //   705: istore #5
    //   707: iload #5
    //   709: iload #4
    //   711: if_icmpge -> 822
    //   714: aload_3
    //   715: iload #5
    //   717: aaload
    //   718: astore #6
    //   720: aload #6
    //   722: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   725: pop
    //   726: aload #6
    //   728: invokevirtual getModifiers : ()I
    //   731: invokestatic isStatic : (I)Z
    //   734: ifeq -> 808
    //   737: aload #6
    //   739: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   742: arraylength
    //   743: iconst_2
    //   744: if_icmpne -> 808
    //   747: goto -> 754
    //   750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   753: athrow
    //   754: aload #6
    //   756: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   759: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   762: if_acmpne -> 808
    //   765: goto -> 772
    //   768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   771: athrow
    //   772: aload #6
    //   774: iconst_1
    //   775: invokevirtual setAccessible : (Z)V
    //   778: aload #6
    //   780: aconst_null
    //   781: iconst_2
    //   782: anewarray java/lang/Object
    //   785: dup
    //   786: iconst_0
    //   787: aload_0
    //   788: aastore
    //   789: dup
    //   790: iconst_1
    //   791: aload_1
    //   792: aastore
    //   793: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   796: pop
    //   797: iload_2
    //   798: ifne -> 822
    //   801: goto -> 808
    //   804: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   807: athrow
    //   808: iinc #5, 1
    //   811: iload_2
    //   812: ifne -> 707
    //   815: goto -> 822
    //   818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   821: athrow
    //   822: getstatic burp/Zr0g.Zf : Ljava/lang/String;
    //   825: getstatic burp/Zzqj.Zq : Ljava/lang/Object;
    //   828: checkcast java/math/BigInteger
    //   831: invokevirtual intValue : ()I
    //   834: bipush #32
    //   836: irem
    //   837: invokestatic abs : (I)I
    //   840: invokevirtual charAt : (I)C
    //   843: getstatic burp/Zein.ZN : Ljava/lang/String;
    //   846: getstatic burp/Zes_.ZJ : Ljava/lang/Object;
    //   849: checkcast java/math/BigInteger
    //   852: invokevirtual intValue : ()I
    //   855: bipush #32
    //   857: irem
    //   858: invokestatic abs : (I)I
    //   861: invokevirtual charAt : (I)C
    //   864: if_icmpgt -> 971
    //   867: getstatic burp/Zzqj.Zk : Ljava/lang/String;
    //   870: getstatic burp/Zkmx.Zu : Ljava/lang/Object;
    //   873: checkcast java/math/BigInteger
    //   876: invokevirtual intValue : ()I
    //   879: bipush #32
    //   881: irem
    //   882: invokestatic abs : (I)I
    //   885: invokevirtual charAt : (I)C
    //   888: getstatic burp/Zbo7.ZZ : Ljava/lang/String;
    //   891: getstatic burp/Zsby.ZZ : Ljava/lang/Object;
    //   894: checkcast java/math/BigInteger
    //   897: invokevirtual intValue : ()I
    //   900: bipush #32
    //   902: irem
    //   903: invokestatic abs : (I)I
    //   906: invokevirtual charAt : (I)C
    //   909: if_icmpgt -> 971
    //   912: goto -> 919
    //   915: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   918: athrow
    //   919: getstatic burp/Zg0j.Ze : Ljava/lang/String;
    //   922: getstatic burp/Zg_p.Zx : Ljava/lang/Object;
    //   925: checkcast java/math/BigInteger
    //   928: invokevirtual intValue : ()I
    //   931: bipush #32
    //   933: irem
    //   934: invokestatic abs : (I)I
    //   937: invokevirtual charAt : (I)C
    //   940: getstatic burp/Zkig.ZE : Ljava/lang/String;
    //   943: getstatic burp/Zmj4.Zm : Ljava/lang/Object;
    //   946: checkcast java/math/BigInteger
    //   949: invokevirtual intValue : ()I
    //   952: bipush #32
    //   954: irem
    //   955: invokestatic abs : (I)I
    //   958: invokevirtual charAt : (I)C
    //   961: if_icmpgt -> 979
    //   964: goto -> 971
    //   967: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   970: athrow
    //   971: iconst_1
    //   972: goto -> 980
    //   975: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   978: athrow
    //   979: iconst_0
    //   980: ireturn
    //   981: astore_3
    //   982: new java/lang/Exception
    //   985: dup
    //   986: aload_3
    //   987: invokevirtual getMessage : ()Ljava/lang/String;
    //   990: invokespecial <init> : (Ljava/lang/String;)V
    //   993: athrow
    // Exception table:
    //   from	to	target	type
    //   4	980	981	java/lang/Throwable
    //   556	570	570	java/lang/Throwable
    //   581	594	597	java/lang/Throwable
    //   586	609	612	java/lang/Throwable
    //   601	627	630	java/lang/Throwable
    //   616	657	660	java/lang/Throwable
    //   720	747	750	java/lang/Throwable
    //   737	765	768	java/lang/Throwable
    //   754	801	804	java/lang/Throwable
    //   772	815	818	java/lang/Throwable
    //   822	912	915	java/lang/Throwable
    //   867	964	967	java/lang/Throwable
    //   919	975	975	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'So¶( LÌ8ÛãØn°(ïÿW¥[Tê{?oD658bô@´& yç0ªw¨FO\\fPÓÎ½i\\r#&×9bÞÐ,ùM c0Ch¨§7~Ú_¸j êñX¹o æ±k.Ç±SÈ½ÞÞKú¯y|&:p¯¤¨ÿ¾ýÑÿ)T/ï sBõ\\tè2Á"<Ï;\\tÖæÚÇW'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #112
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
    //   67: ldc '«n1¸#"\\tá¡ÙÈl¦ñ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #35
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
    //   128: putstatic burp/Zx4l.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zx4l.b : [Ljava/lang/String;
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
    //   212: bipush #60
    //   214: goto -> 244
    //   217: bipush #89
    //   219: goto -> 244
    //   222: bipush #121
    //   224: goto -> 244
    //   227: bipush #59
    //   229: goto -> 244
    //   232: bipush #89
    //   234: goto -> 244
    //   237: bipush #113
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
    //   300: sipush #25064
    //   303: sipush #-23044
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zx4l.Zy : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #91
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #108
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #41
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-106
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #63
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #-37
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #66
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-53
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #36
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #9
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-94
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #85
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #13
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #33
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-77
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-25
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #103
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #122
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-57
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-98
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #70
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #95
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #22
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-34
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-110
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #-115
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #96
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-58
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #106
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #-35
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #-70
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-92
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zx4l.Zt : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x61E9) & 0xFFFF;
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
      byte b1 = 55;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */