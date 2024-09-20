package burp;

import java.math.BigInteger;

class Ztzw extends ClassLoader {
  static Object Zk;
  
  static String Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zd(Object paramObject) {
    Zsmn.Zo = a(12520, 5402);
    Zsmn.Zq = new BigInteger(a(12525, -15442));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zec0.Zk.charAt(Math.abs(((BigInteger)Zmsl.ZB).intValue() % 32)) > Zx_b.ZD.charAt(Math.abs(((BigInteger)Zmsl.ZB).intValue() % 32))) {
          try {
            Zlpn.ZA(Class.forName(a(12521, 26282)));
            if (bool)
              Zl1n.Zz(Class.forName(a(12526, -15486))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zl1n.Zz(Class.forName(a(12526, -15486)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   250: sipush #12522
    //   253: sipush #4646
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: iconst_1
    //   260: ldc burp/Ztzj
    //   262: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   265: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   268: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   271: astore_3
    //   272: aload_3
    //   273: arraylength
    //   274: istore #4
    //   276: iconst_0
    //   277: istore #5
    //   279: iload #5
    //   281: iload #4
    //   283: if_icmpge -> 420
    //   286: aload_3
    //   287: iload #5
    //   289: aaload
    //   290: astore #6
    //   292: aload #6
    //   294: invokevirtual getModifiers : ()I
    //   297: invokestatic isStatic : (I)Z
    //   300: ifne -> 310
    //   303: goto -> 413
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: aload #6
    //   312: invokevirtual getType : ()Ljava/lang/Class;
    //   315: astore #7
    //   317: aload #7
    //   319: ifnull -> 400
    //   322: aload #7
    //   324: invokevirtual isPrimitive : ()Z
    //   327: ifne -> 400
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   336: athrow
    //   337: aload #7
    //   339: invokevirtual getPackage : ()Ljava/lang/Package;
    //   342: ifnull -> 400
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   351: athrow
    //   352: aload #7
    //   354: invokevirtual getPackage : ()Ljava/lang/Package;
    //   357: invokevirtual getName : ()Ljava/lang/String;
    //   360: ifnull -> 400
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   369: athrow
    //   370: aload #7
    //   372: invokevirtual getPackage : ()Ljava/lang/Package;
    //   375: invokevirtual getName : ()Ljava/lang/String;
    //   378: sipush #12524
    //   381: sipush #-17361
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   390: ifne -> 400
    //   393: goto -> 400
    //   396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   399: athrow
    //   400: aload #6
    //   402: iconst_1
    //   403: invokevirtual setAccessible : (Z)V
    //   406: aload #6
    //   408: aconst_null
    //   409: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   412: pop
    //   413: iinc #5, 1
    //   416: iload_2
    //   417: ifne -> 279
    //   420: sipush #12527
    //   423: sipush #-8587
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   432: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   435: astore_3
    //   436: aload_3
    //   437: arraylength
    //   438: istore #4
    //   440: iconst_0
    //   441: istore #5
    //   443: iload #5
    //   445: iload #4
    //   447: if_icmpge -> 579
    //   450: aload_3
    //   451: iload #5
    //   453: aaload
    //   454: astore #6
    //   456: aload #6
    //   458: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   461: pop
    //   462: aload #6
    //   464: invokevirtual getModifiers : ()I
    //   467: invokestatic isStatic : (I)Z
    //   470: ifeq -> 565
    //   473: aload #6
    //   475: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   478: arraylength
    //   479: iconst_2
    //   480: if_icmpne -> 565
    //   483: goto -> 490
    //   486: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   489: athrow
    //   490: aload #6
    //   492: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   495: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   498: invokevirtual equals : (Ljava/lang/Object;)Z
    //   501: ifeq -> 565
    //   504: goto -> 511
    //   507: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   510: athrow
    //   511: aload #6
    //   513: iconst_1
    //   514: invokevirtual setAccessible : (Z)V
    //   517: aload #6
    //   519: aconst_null
    //   520: iconst_2
    //   521: anewarray java/lang/Object
    //   524: dup
    //   525: iconst_0
    //   526: aload_0
    //   527: aastore
    //   528: dup
    //   529: iconst_1
    //   530: aload_1
    //   531: ifnonnull -> 549
    //   534: goto -> 541
    //   537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   540: athrow
    //   541: aload_1
    //   542: goto -> 556
    //   545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   548: athrow
    //   549: aload_1
    //   550: checkcast [B
    //   553: invokevirtual clone : ()Ljava/lang/Object;
    //   556: aastore
    //   557: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   560: pop
    //   561: iload_2
    //   562: ifne -> 579
    //   565: iinc #5, 1
    //   568: iload_2
    //   569: ifne -> 443
    //   572: goto -> 579
    //   575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   578: athrow
    //   579: getstatic burp/Zt4g.Zj : Ljava/lang/String;
    //   582: getstatic burp/Zb29.ZM : Ljava/lang/Object;
    //   585: checkcast java/math/BigInteger
    //   588: invokevirtual intValue : ()I
    //   591: bipush #32
    //   593: irem
    //   594: invokestatic abs : (I)I
    //   597: invokevirtual charAt : (I)C
    //   600: getstatic burp/Zmz.Zp : Ljava/lang/String;
    //   603: getstatic burp/Zrcy.Zr : Ljava/lang/Object;
    //   606: checkcast java/math/BigInteger
    //   609: invokevirtual intValue : ()I
    //   612: bipush #32
    //   614: irem
    //   615: invokestatic abs : (I)I
    //   618: invokevirtual charAt : (I)C
    //   621: if_icmpgt -> 728
    //   624: getstatic burp/Zezn.Ze : Ljava/lang/String;
    //   627: getstatic burp/Zzh0.Z_ : Ljava/lang/Object;
    //   630: checkcast java/math/BigInteger
    //   633: invokevirtual intValue : ()I
    //   636: bipush #32
    //   638: irem
    //   639: invokestatic abs : (I)I
    //   642: invokevirtual charAt : (I)C
    //   645: getstatic burp/Zme.Zp : Ljava/lang/String;
    //   648: getstatic burp/Zeoa.ZF : Ljava/lang/Object;
    //   651: checkcast java/math/BigInteger
    //   654: invokevirtual intValue : ()I
    //   657: bipush #32
    //   659: irem
    //   660: invokestatic abs : (I)I
    //   663: invokevirtual charAt : (I)C
    //   666: if_icmpgt -> 728
    //   669: goto -> 676
    //   672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   675: athrow
    //   676: getstatic burp/Zs75.Zn : Ljava/lang/String;
    //   679: getstatic burp/Zbo2.ZQ : Ljava/lang/Object;
    //   682: checkcast java/math/BigInteger
    //   685: invokevirtual intValue : ()I
    //   688: bipush #32
    //   690: irem
    //   691: invokestatic abs : (I)I
    //   694: invokevirtual charAt : (I)C
    //   697: getstatic burp/Zmuj.ZG : Ljava/lang/String;
    //   700: getstatic burp/Zxdy.ZZ : Ljava/lang/Object;
    //   703: checkcast java/math/BigInteger
    //   706: invokevirtual intValue : ()I
    //   709: bipush #32
    //   711: irem
    //   712: invokestatic abs : (I)I
    //   715: invokevirtual charAt : (I)C
    //   718: if_icmpgt -> 736
    //   721: goto -> 728
    //   724: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   727: athrow
    //   728: iconst_1
    //   729: goto -> 737
    //   732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   735: athrow
    //   736: iconst_0
    //   737: ireturn
    //   738: astore_3
    //   739: new java/lang/Exception
    //   742: dup
    //   743: aload_3
    //   744: invokevirtual getMessage : ()Ljava/lang/String;
    //   747: invokespecial <init> : (Ljava/lang/String;)V
    //   750: athrow
    // Exception table:
    //   from	to	target	type
    //   4	737	738	java/lang/Throwable
    //   292	306	306	java/lang/Throwable
    //   317	330	333	java/lang/Throwable
    //   322	345	348	java/lang/Throwable
    //   337	363	366	java/lang/Throwable
    //   352	393	396	java/lang/Throwable
    //   456	483	486	java/lang/Throwable
    //   473	504	507	java/lang/Throwable
    //   490	534	537	java/lang/Throwable
    //   511	545	545	java/lang/Throwable
    //   556	572	575	java/lang/Throwable
    //   579	669	672	java/lang/Throwable
    //   624	721	724	java/lang/Throwable
    //   676	732	732	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '/:AáÌÞ÷ÛÑÇ¸:<h!ªú\MÕÐ;ê7-lo@É<xç$ò\\b}P\\r N×Xßl<ge®p8\\bHìywØjÂ>\\\t$t÷!_Ì\\b\\t[¡0ÜCåm£\\tF9»#¨!i"3 0NR·x¼h eÒº_¯á}µäÑ½#=gEUþ$¶?öL'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #68
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
    //   68: ldc '#ÛúÐy\\t9>¼öÈ±4ÞôükSßÊÒÈVî3\\táÆTÇN¦®ÂÌ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
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
    //   129: putstatic burp/Ztzw.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztzw.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #7
    //   214: goto -> 243
    //   217: bipush #43
    //   219: goto -> 243
    //   222: iconst_3
    //   223: goto -> 243
    //   226: bipush #6
    //   228: goto -> 243
    //   231: bipush #97
    //   233: goto -> 243
    //   236: bipush #109
    //   238: goto -> 243
    //   241: bipush #18
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #54
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-51
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-78
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #80
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #-82
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #101
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #88
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #63
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #109
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-83
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #62
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #45
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-76
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #9
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-87
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #91
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-66
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #65
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-13
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-48
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #71
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #-35
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-107
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-52
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #125
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #37
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #110
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #21
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-97
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #99
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #53
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-77
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Ztzw.Zk : Ljava/lang/Object;
    //   501: sipush #12523
    //   504: sipush #-9498
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Ztzw.Zi : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x30ED) & 0xFFFF;
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
      byte b1 = 29;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztzw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */