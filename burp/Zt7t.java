package burp;

import java.math.BigInteger;

class Zt7t extends ClassLoader {
  static String Ze;
  
  static Object Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zc(Object paramObject) {
    Zzap.ZA = a(14829, -28077);
    Zzap.ZL = new BigInteger(a(14825, 18749));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zb_c.ZS.charAt(Math.abs(((BigInteger)Zxyu.Zp).intValue() % 32)) <= Zm14.ZE.charAt(Math.abs(((BigInteger)Zegk.ZR).intValue() % 32))) {
          try {
            Zre4.Zm(Class.forName(a(14831, -32474)));
            if (bool)
              Zxf8.Zf(Class.forName(a(14827, 24992))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxf8.Zf(Class.forName(a(14827, 24992)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zg(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: iconst_0
    //   6: sipush #14817
    //   9: sipush #-30316
    //   12: invokestatic a : (II)Ljava/lang/String;
    //   15: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   18: aastore
    //   19: sipush #14816
    //   22: sipush #-14715
    //   25: invokestatic a : (II)Ljava/lang/String;
    //   28: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   31: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   34: astore_3
    //   35: aload_3
    //   36: arraylength
    //   37: istore #4
    //   39: iconst_0
    //   40: istore #5
    //   42: iload #5
    //   44: iload #4
    //   46: if_icmpge -> 134
    //   49: aload_3
    //   50: iload #5
    //   52: aaload
    //   53: astore #6
    //   55: aload #6
    //   57: invokevirtual getModifiers : ()I
    //   60: invokestatic isStatic : (I)Z
    //   63: ifeq -> 127
    //   66: aload #6
    //   68: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   71: arraylength
    //   72: iconst_2
    //   73: if_icmpne -> 127
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   82: athrow
    //   83: aload #6
    //   85: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   88: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   91: if_acmpne -> 127
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   100: athrow
    //   101: aload #6
    //   103: aconst_null
    //   104: iconst_2
    //   105: anewarray java/lang/Object
    //   108: dup
    //   109: iconst_0
    //   110: aload_0
    //   111: aastore
    //   112: dup
    //   113: iconst_1
    //   114: aload_1
    //   115: aastore
    //   116: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   119: pop
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   126: athrow
    //   127: iinc #5, 1
    //   130: iload_2
    //   131: ifne -> 42
    //   134: aload_0
    //   135: iconst_0
    //   136: aconst_null
    //   137: aastore
    //   138: sipush #14828
    //   141: sipush #-7413
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: iconst_1
    //   148: ldc burp/Ztkh
    //   150: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   153: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   156: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   159: astore_3
    //   160: aload_3
    //   161: arraylength
    //   162: istore #4
    //   164: iconst_0
    //   165: istore #5
    //   167: iload #5
    //   169: iload #4
    //   171: if_icmpge -> 308
    //   174: aload_3
    //   175: iload #5
    //   177: aaload
    //   178: astore #6
    //   180: aload #6
    //   182: invokevirtual getModifiers : ()I
    //   185: invokestatic isStatic : (I)Z
    //   188: ifne -> 198
    //   191: goto -> 301
    //   194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   197: athrow
    //   198: aload #6
    //   200: invokevirtual getType : ()Ljava/lang/Class;
    //   203: astore #7
    //   205: aload #7
    //   207: ifnull -> 288
    //   210: aload #7
    //   212: invokevirtual isPrimitive : ()Z
    //   215: ifne -> 288
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   224: athrow
    //   225: aload #7
    //   227: invokevirtual getPackage : ()Ljava/lang/Package;
    //   230: ifnull -> 288
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   239: athrow
    //   240: aload #7
    //   242: invokevirtual getPackage : ()Ljava/lang/Package;
    //   245: invokevirtual getName : ()Ljava/lang/String;
    //   248: ifnull -> 288
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   257: athrow
    //   258: aload #7
    //   260: invokevirtual getPackage : ()Ljava/lang/Package;
    //   263: invokevirtual getName : ()Ljava/lang/String;
    //   266: sipush #14826
    //   269: sipush #-27340
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   278: ifne -> 288
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   287: athrow
    //   288: aload #6
    //   290: iconst_1
    //   291: invokevirtual setAccessible : (Z)V
    //   294: aload #6
    //   296: aconst_null
    //   297: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   300: pop
    //   301: iinc #5, 1
    //   304: iload_2
    //   305: ifne -> 167
    //   308: sipush #14830
    //   311: sipush #31063
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   320: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   323: astore_3
    //   324: aload_3
    //   325: arraylength
    //   326: istore #4
    //   328: iconst_0
    //   329: istore #5
    //   331: iload #5
    //   333: iload #4
    //   335: if_icmpge -> 467
    //   338: aload_3
    //   339: iload #5
    //   341: aaload
    //   342: astore #6
    //   344: aload #6
    //   346: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   349: pop
    //   350: aload #6
    //   352: invokevirtual getModifiers : ()I
    //   355: invokestatic isStatic : (I)Z
    //   358: ifeq -> 453
    //   361: aload #6
    //   363: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   366: arraylength
    //   367: iconst_2
    //   368: if_icmpne -> 453
    //   371: goto -> 378
    //   374: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   377: athrow
    //   378: aload #6
    //   380: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   383: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   386: invokevirtual equals : (Ljava/lang/Object;)Z
    //   389: ifeq -> 453
    //   392: goto -> 399
    //   395: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   398: athrow
    //   399: aload #6
    //   401: iconst_1
    //   402: invokevirtual setAccessible : (Z)V
    //   405: aload #6
    //   407: aconst_null
    //   408: iconst_2
    //   409: anewarray java/lang/Object
    //   412: dup
    //   413: iconst_0
    //   414: aload_0
    //   415: aastore
    //   416: dup
    //   417: iconst_1
    //   418: aload_1
    //   419: ifnonnull -> 437
    //   422: goto -> 429
    //   425: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   428: athrow
    //   429: aload_1
    //   430: goto -> 444
    //   433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   436: athrow
    //   437: aload_1
    //   438: checkcast [B
    //   441: invokevirtual clone : ()Ljava/lang/Object;
    //   444: aastore
    //   445: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   448: pop
    //   449: iload_2
    //   450: ifne -> 467
    //   453: iinc #5, 1
    //   456: iload_2
    //   457: ifne -> 331
    //   460: goto -> 467
    //   463: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   466: athrow
    //   467: getstatic burp/Zter.ZE : Ljava/lang/String;
    //   470: getstatic burp/Zbsr.ZD : Ljava/lang/Object;
    //   473: checkcast java/math/BigInteger
    //   476: invokevirtual intValue : ()I
    //   479: bipush #32
    //   481: irem
    //   482: invokestatic abs : (I)I
    //   485: invokevirtual charAt : (I)C
    //   488: getstatic burp/Zm0s.Zm : Ljava/lang/String;
    //   491: getstatic burp/Zx54.Zn : Ljava/lang/Object;
    //   494: checkcast java/math/BigInteger
    //   497: invokevirtual intValue : ()I
    //   500: bipush #32
    //   502: irem
    //   503: invokestatic abs : (I)I
    //   506: invokevirtual charAt : (I)C
    //   509: if_icmple -> 616
    //   512: getstatic burp/Zxwl.Zu : Ljava/lang/String;
    //   515: getstatic burp/Zrdy.Zt : Ljava/lang/Object;
    //   518: checkcast java/math/BigInteger
    //   521: invokevirtual intValue : ()I
    //   524: bipush #32
    //   526: irem
    //   527: invokestatic abs : (I)I
    //   530: invokevirtual charAt : (I)C
    //   533: getstatic burp/Zsby.Zx : Ljava/lang/String;
    //   536: getstatic burp/Zm0s.Zl : Ljava/lang/Object;
    //   539: checkcast java/math/BigInteger
    //   542: invokevirtual intValue : ()I
    //   545: bipush #32
    //   547: irem
    //   548: invokestatic abs : (I)I
    //   551: invokevirtual charAt : (I)C
    //   554: if_icmple -> 616
    //   557: goto -> 564
    //   560: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   563: athrow
    //   564: getstatic burp/Zshq.Zi : Ljava/lang/String;
    //   567: getstatic burp/Zgmt.ZX : Ljava/lang/Object;
    //   570: checkcast java/math/BigInteger
    //   573: invokevirtual intValue : ()I
    //   576: bipush #32
    //   578: irem
    //   579: invokestatic abs : (I)I
    //   582: invokevirtual charAt : (I)C
    //   585: getstatic burp/Zgmt.Zu : Ljava/lang/String;
    //   588: getstatic burp/Zr0u.ZB : Ljava/lang/Object;
    //   591: checkcast java/math/BigInteger
    //   594: invokevirtual intValue : ()I
    //   597: bipush #32
    //   599: irem
    //   600: invokestatic abs : (I)I
    //   603: invokevirtual charAt : (I)C
    //   606: if_icmpgt -> 624
    //   609: goto -> 616
    //   612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   615: athrow
    //   616: iconst_1
    //   617: goto -> 625
    //   620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   623: athrow
    //   624: iconst_0
    //   625: ireturn
    //   626: astore_3
    //   627: new java/lang/Exception
    //   630: dup
    //   631: aload_3
    //   632: invokevirtual getMessage : ()Ljava/lang/String;
    //   635: invokespecial <init> : (Ljava/lang/String;)V
    //   638: athrow
    // Exception table:
    //   from	to	target	type
    //   4	625	626	java/lang/Throwable
    //   55	76	79	java/lang/Throwable
    //   66	94	97	java/lang/Throwable
    //   83	120	123	java/lang/Throwable
    //   180	194	194	java/lang/Throwable
    //   205	218	221	java/lang/Throwable
    //   210	233	236	java/lang/Throwable
    //   225	251	254	java/lang/Throwable
    //   240	281	284	java/lang/Throwable
    //   344	371	374	java/lang/Throwable
    //   361	392	395	java/lang/Throwable
    //   378	422	425	java/lang/Throwable
    //   399	433	433	java/lang/Throwable
    //   444	460	463	java/lang/Throwable
    //   467	557	560	java/lang/Throwable
    //   512	609	612	java/lang/Throwable
    //   564	620	620	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'WóÍË^»ÏfJ®(Qh8]dâW+aÒT=êð\\n×ïzï4üü»AàH³è¹­~ð¾+Ö(0v£*7À¸\\t·1Ç ÂBIÎ<±¿$ ì{7¸qyÝñ[B\\fÄR^Àä»ÅßÍO\\tpçýp%ë3Æc# é3r¸>â¥\\n°Ò~eôµë©êÅ¯M!ÜÂ.N\\tê.ÍA\\tFwÍ%2+£!\\t£qÙ²«ÒØm'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_1
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
    //   64: goto -> 23
    //   67: ldc 'ÔGùd\\tJYEÙ=¢>ïc'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #9
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
    //   128: putstatic burp/Zt7t.a : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zt7t.b : [Ljava/lang/String;
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
    //   212: bipush #34
    //   214: goto -> 244
    //   217: bipush #97
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #93
    //   229: goto -> 244
    //   232: bipush #40
    //   234: goto -> 244
    //   237: bipush #62
    //   239: goto -> 244
    //   242: bipush #56
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
    //   300: sipush #14824
    //   303: sipush #-4003
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zt7t.Ze : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #72
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-67
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-116
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-38
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #66
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #77
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-33
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #9
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-16
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #90
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #40
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #119
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #-97
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #68
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #117
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #51
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #-48
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-106
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-61
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #-40
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #-42
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-35
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #54
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #99
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-55
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #83
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #93
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #30
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #54
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #-76
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #19
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #80
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zt7t.Zs : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x39E9) & 0xFFFF;
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
      char c = '÷';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */