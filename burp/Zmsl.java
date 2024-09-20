package burp;

import java.math.BigInteger;

class Zmsl extends ClassLoader {
  static Object ZB;
  
  static String ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zx(Object paramObject) {
    Zeqr.Zb = a(12007, 30242);
    Zeqr.ZM = new BigInteger(a(12005, 3618));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zx58.Zs.charAt(Math.abs(((BigInteger)Zsyu.Zj).intValue() % 32)) <= Zec_.Zv.charAt(Math.abs(((BigInteger)Zrfl.Z_).intValue() % 32))) {
          try {
            Zx58.ZU(Class.forName(a(12006, -29622)));
            if (bool)
              Zevf.Zo(Class.forName(a(12004, -11346))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zevf.Zo(Class.forName(a(12004, -11346)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Za(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zr9p.ZC : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zlfg.Zv : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zl5d.Za : Ljava/lang/Object;
    //   22: sipush #12014
    //   25: sipush #18272
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zb_u
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
    //   150: sipush #12012
    //   153: sipush #20224
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
    //   192: sipush #12008
    //   195: sipush #3039
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
    //   351: iconst_0
    //   352: istore_3
    //   353: sipush #12011
    //   356: sipush #19748
    //   359: invokestatic a : (II)Ljava/lang/String;
    //   362: iconst_1
    //   363: ldc burp/Zemp
    //   365: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   368: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   371: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   374: astore #4
    //   376: aload #4
    //   378: arraylength
    //   379: istore #5
    //   381: iconst_0
    //   382: istore #6
    //   384: iload #6
    //   386: iload #5
    //   388: if_icmpge -> 526
    //   391: aload #4
    //   393: iload #6
    //   395: aaload
    //   396: astore #7
    //   398: aload #7
    //   400: invokevirtual getModifiers : ()I
    //   403: invokestatic isStatic : (I)Z
    //   406: ifne -> 416
    //   409: goto -> 519
    //   412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   415: athrow
    //   416: aload #7
    //   418: invokevirtual getType : ()Ljava/lang/Class;
    //   421: astore #8
    //   423: aload #8
    //   425: ifnull -> 506
    //   428: aload #8
    //   430: invokevirtual isPrimitive : ()Z
    //   433: ifne -> 506
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   442: athrow
    //   443: aload #8
    //   445: invokevirtual getPackage : ()Ljava/lang/Package;
    //   448: ifnull -> 506
    //   451: goto -> 458
    //   454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   457: athrow
    //   458: aload #8
    //   460: invokevirtual getPackage : ()Ljava/lang/Package;
    //   463: invokevirtual getName : ()Ljava/lang/String;
    //   466: ifnull -> 506
    //   469: goto -> 476
    //   472: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   475: athrow
    //   476: aload #8
    //   478: invokevirtual getPackage : ()Ljava/lang/Package;
    //   481: invokevirtual getName : ()Ljava/lang/String;
    //   484: sipush #12010
    //   487: sipush #13765
    //   490: invokestatic a : (II)Ljava/lang/String;
    //   493: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   496: ifne -> 506
    //   499: goto -> 506
    //   502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   505: athrow
    //   506: aload #7
    //   508: iconst_1
    //   509: invokevirtual setAccessible : (Z)V
    //   512: aload #7
    //   514: aconst_null
    //   515: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   518: pop
    //   519: iinc #6, 1
    //   522: iload_2
    //   523: ifeq -> 384
    //   526: sipush #12009
    //   529: sipush #11727
    //   532: invokestatic a : (II)Ljava/lang/String;
    //   535: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   538: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   541: astore #4
    //   543: aload #4
    //   545: arraylength
    //   546: istore #5
    //   548: iconst_0
    //   549: istore #6
    //   551: iload #6
    //   553: iload #5
    //   555: if_icmpge -> 691
    //   558: aload #4
    //   560: iload #6
    //   562: aaload
    //   563: astore #7
    //   565: aload #7
    //   567: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   570: pop
    //   571: aload #7
    //   573: invokevirtual getModifiers : ()I
    //   576: invokestatic isStatic : (I)Z
    //   579: ifeq -> 677
    //   582: aload #7
    //   584: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   587: arraylength
    //   588: iconst_2
    //   589: if_icmpne -> 677
    //   592: goto -> 599
    //   595: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   598: athrow
    //   599: aload #7
    //   601: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   604: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   607: if_acmpne -> 677
    //   610: goto -> 617
    //   613: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   616: athrow
    //   617: aload #7
    //   619: iconst_1
    //   620: invokevirtual setAccessible : (Z)V
    //   623: aload #7
    //   625: aconst_null
    //   626: iconst_2
    //   627: anewarray java/lang/Object
    //   630: dup
    //   631: iconst_0
    //   632: aload_0
    //   633: aastore
    //   634: dup
    //   635: iconst_1
    //   636: aload_1
    //   637: ifnonnull -> 655
    //   640: goto -> 647
    //   643: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   646: athrow
    //   647: aload_1
    //   648: goto -> 662
    //   651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   654: athrow
    //   655: aload_1
    //   656: checkcast [B
    //   659: invokevirtual clone : ()Ljava/lang/Object;
    //   662: aastore
    //   663: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   666: checkcast java/lang/Boolean
    //   669: invokevirtual booleanValue : ()Z
    //   672: istore_3
    //   673: iload_2
    //   674: ifeq -> 691
    //   677: iinc #6, 1
    //   680: iload_2
    //   681: ifeq -> 551
    //   684: goto -> 691
    //   687: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   690: athrow
    //   691: iload_3
    //   692: ireturn
    //   693: astore_3
    //   694: new java/lang/Exception
    //   697: dup
    //   698: aload_3
    //   699: invokevirtual getMessage : ()Ljava/lang/String;
    //   702: invokespecial <init> : (Ljava/lang/String;)V
    //   705: athrow
    // Exception table:
    //   from	to	target	type
    //   4	692	693	java/lang/Throwable
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
    //   398	412	412	java/lang/Throwable
    //   423	436	439	java/lang/Throwable
    //   428	451	454	java/lang/Throwable
    //   443	469	472	java/lang/Throwable
    //   458	499	502	java/lang/Throwable
    //   565	592	595	java/lang/Throwable
    //   582	610	613	java/lang/Throwable
    //   599	640	643	java/lang/Throwable
    //   617	651	651	java/lang/Throwable
    //   673	684	687	java/lang/Throwable
  }
  
  static void ZN(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '5~-"  dX@L£~¢oºÞùÓùÏ\Z¶C§:·*`¨\\t¦§_ZÌüMcGÏå&Ë±Ï"ÙXU=ÊüëK¸Iû.Õ<¥\\tàø7I²~ë^­)Â Ks¹¢Cq·C¥ðÏK¯¥°nEÛã¹ H½\\t8Jê"$Ô%\\tñ;Ó\\fEcÉ]· \\tYh àe%ª\\t¢åßQSÎaùMð8\\rþ9Kº¾8k¼H¿AOW4JVé¸ÉJ(°dDÔxùpÅìc±ÏÚçK"¾mô+±7äYÀ?ã³(m_øÿ*?Y>r'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #86
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
    //   67: ldc '«w,Ñ<· Î$È\\r5¯Ì8¤îZÛ6®B8mU®¤xOb\\bp'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #43
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
    //   128: putstatic burp/Zmsl.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmsl.b : [Ljava/lang/String;
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
    //   212: bipush #40
    //   214: goto -> 244
    //   217: bipush #37
    //   219: goto -> 244
    //   222: bipush #78
    //   224: goto -> 244
    //   227: bipush #126
    //   229: goto -> 244
    //   232: bipush #44
    //   234: goto -> 244
    //   237: bipush #14
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
    //   304: sipush #12015
    //   307: sipush #23681
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zmsl.ZB : Ljava/lang/Object;
    //   319: sipush #12013
    //   322: sipush #-16038
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zmsl.ZP : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2EEC) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmsl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */