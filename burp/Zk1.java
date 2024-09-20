package burp;

import java.math.BigInteger;

class Zk1 extends ClassLoader {
  static String Zg;
  
  static Object Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zy(Object paramObject) {
    Zezi.Ze = a(24712, 12995);
    Zezi.ZQ = new BigInteger(a(24719, -24542));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zzah.Zs.charAt(Math.abs(((BigInteger)Zrfa.Zj).intValue() % 32)) <= Zg6z.ZY.charAt(Math.abs(((BigInteger)Zbun.ZH).intValue() % 32))) {
          try {
            Zkkl.ZG(Class.forName(a(24714, -23839)));
            if (bool)
              Zm06.Zm(Class.forName(a(24713, 27106))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zm06.Zm(Class.forName(a(24713, 27106)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZM(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zgsy.ZC : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zti4.Zi : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zsfg.Zm : Ljava/lang/Object;
    //   22: sipush #24718
    //   25: getstatic burp/Zlt1.ZH : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zmig.Zh : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zsp9.ZV : Ljava/lang/Object;
    //   43: sipush #-6064
    //   46: getstatic burp/Zrtp.Zy : Ljava/lang/Object;
    //   49: checkcast java/math/BigInteger
    //   52: getstatic burp/Zsn4.ZQ : Ljava/lang/Object;
    //   55: checkcast java/math/BigInteger
    //   58: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   61: putstatic burp/Zzyb.ZV : Ljava/lang/Object;
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: ldc burp/Zbo7
    //   70: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   73: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   76: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   79: astore_3
    //   80: aload_3
    //   81: arraylength
    //   82: istore #4
    //   84: iconst_0
    //   85: istore #5
    //   87: iload #5
    //   89: iload #4
    //   91: if_icmpge -> 228
    //   94: aload_3
    //   95: iload #5
    //   97: aaload
    //   98: astore #6
    //   100: aload #6
    //   102: invokevirtual getModifiers : ()I
    //   105: invokestatic isStatic : (I)Z
    //   108: ifne -> 118
    //   111: goto -> 221
    //   114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   117: athrow
    //   118: aload #6
    //   120: invokevirtual getType : ()Ljava/lang/Class;
    //   123: astore #7
    //   125: aload #7
    //   127: ifnull -> 208
    //   130: aload #7
    //   132: invokevirtual isPrimitive : ()Z
    //   135: ifne -> 208
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   144: athrow
    //   145: aload #7
    //   147: invokevirtual getPackage : ()Ljava/lang/Package;
    //   150: ifnull -> 208
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: ifnull -> 208
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   177: athrow
    //   178: aload #7
    //   180: invokevirtual getPackage : ()Ljava/lang/Package;
    //   183: invokevirtual getName : ()Ljava/lang/String;
    //   186: sipush #24715
    //   189: sipush #-621
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   198: ifne -> 208
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   207: athrow
    //   208: aload #6
    //   210: iconst_1
    //   211: invokevirtual setAccessible : (Z)V
    //   214: aload #6
    //   216: aconst_null
    //   217: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   220: pop
    //   221: iinc #5, 1
    //   224: iload_2
    //   225: ifeq -> 87
    //   228: sipush #24716
    //   231: sipush #32622
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   240: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   243: astore_3
    //   244: aload_3
    //   245: arraylength
    //   246: istore #4
    //   248: iconst_0
    //   249: istore #5
    //   251: iload #5
    //   253: iload #4
    //   255: if_icmpge -> 387
    //   258: aload_3
    //   259: iload #5
    //   261: aaload
    //   262: astore #6
    //   264: aload #6
    //   266: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   269: pop
    //   270: aload #6
    //   272: invokevirtual getModifiers : ()I
    //   275: invokestatic isStatic : (I)Z
    //   278: ifeq -> 373
    //   281: aload #6
    //   283: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   286: arraylength
    //   287: iconst_2
    //   288: if_icmpne -> 373
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   303: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 373
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   318: athrow
    //   319: aload #6
    //   321: iconst_1
    //   322: invokevirtual setAccessible : (Z)V
    //   325: aload #6
    //   327: aconst_null
    //   328: iconst_2
    //   329: anewarray java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: aload_0
    //   335: aastore
    //   336: dup
    //   337: iconst_1
    //   338: aload_1
    //   339: ifnonnull -> 357
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: aload_1
    //   350: goto -> 364
    //   353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   356: athrow
    //   357: aload_1
    //   358: checkcast [B
    //   361: invokevirtual clone : ()Ljava/lang/Object;
    //   364: aastore
    //   365: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   368: pop
    //   369: iload_2
    //   370: ifeq -> 387
    //   373: iinc #5, 1
    //   376: iload_2
    //   377: ifeq -> 251
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   386: athrow
    //   387: getstatic burp/Zrqe.ZB : Ljava/lang/String;
    //   390: getstatic burp/Zz3b.Zu : Ljava/lang/Object;
    //   393: checkcast java/math/BigInteger
    //   396: invokevirtual intValue : ()I
    //   399: bipush #32
    //   401: irem
    //   402: invokestatic abs : (I)I
    //   405: invokevirtual charAt : (I)C
    //   408: getstatic burp/Zm_u.Zi : Ljava/lang/String;
    //   411: getstatic burp/Zzr8.ZC : Ljava/lang/Object;
    //   414: checkcast java/math/BigInteger
    //   417: invokevirtual intValue : ()I
    //   420: bipush #32
    //   422: irem
    //   423: invokestatic abs : (I)I
    //   426: invokevirtual charAt : (I)C
    //   429: if_icmple -> 536
    //   432: getstatic burp/Zssc.ZR : Ljava/lang/String;
    //   435: getstatic burp/Zkca.ZQ : Ljava/lang/Object;
    //   438: checkcast java/math/BigInteger
    //   441: invokevirtual intValue : ()I
    //   444: bipush #32
    //   446: irem
    //   447: invokestatic abs : (I)I
    //   450: invokevirtual charAt : (I)C
    //   453: getstatic burp/Zlwm.Zj : Ljava/lang/String;
    //   456: getstatic burp/Zbze.ZM : Ljava/lang/Object;
    //   459: checkcast java/math/BigInteger
    //   462: invokevirtual intValue : ()I
    //   465: bipush #32
    //   467: irem
    //   468: invokestatic abs : (I)I
    //   471: invokevirtual charAt : (I)C
    //   474: if_icmple -> 536
    //   477: goto -> 484
    //   480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   483: athrow
    //   484: getstatic burp/Zrn4.ZY : Ljava/lang/String;
    //   487: getstatic burp/Zlwj.ZE : Ljava/lang/Object;
    //   490: checkcast java/math/BigInteger
    //   493: invokevirtual intValue : ()I
    //   496: bipush #32
    //   498: irem
    //   499: invokestatic abs : (I)I
    //   502: invokevirtual charAt : (I)C
    //   505: getstatic burp/Zk7o.Zb : Ljava/lang/String;
    //   508: getstatic burp/Zmt_.Zl : Ljava/lang/Object;
    //   511: checkcast java/math/BigInteger
    //   514: invokevirtual intValue : ()I
    //   517: bipush #32
    //   519: irem
    //   520: invokestatic abs : (I)I
    //   523: invokevirtual charAt : (I)C
    //   526: if_icmpgt -> 544
    //   529: goto -> 536
    //   532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   535: athrow
    //   536: iconst_1
    //   537: goto -> 545
    //   540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   543: athrow
    //   544: iconst_0
    //   545: ireturn
    //   546: astore_3
    //   547: new java/lang/Exception
    //   550: dup
    //   551: aload_3
    //   552: invokevirtual getMessage : ()Ljava/lang/String;
    //   555: invokespecial <init> : (Ljava/lang/String;)V
    //   558: athrow
    // Exception table:
    //   from	to	target	type
    //   4	545	546	java/lang/Throwable
    //   100	114	114	java/lang/Throwable
    //   125	138	141	java/lang/Throwable
    //   130	153	156	java/lang/Throwable
    //   145	171	174	java/lang/Throwable
    //   160	201	204	java/lang/Throwable
    //   264	291	294	java/lang/Throwable
    //   281	312	315	java/lang/Throwable
    //   298	342	345	java/lang/Throwable
    //   319	353	353	java/lang/Throwable
    //   364	380	383	java/lang/Throwable
    //   387	477	480	java/lang/Throwable
    //   432	529	532	java/lang/Throwable
    //   484	540	540	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\Ï¥$¸Ï®ØVAºt1©°B£2ZÐòNóLnp\\b§6;zì@\\tã8úkÔ±YZ0Àîå\\tof] ®¿\\nztÓM W.G-VÐ9ÿØ~­\\fnÖc'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #7
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
    //   68: ldc 'îlÉ<æ¥±bMVÙ1­\ðMÁÝÙ³ënêJúû\\f,¿\\rÚ,HÖèUXAÃ=Î^m>×¨°©Ë@Óc9á,½¼¯øèX²¦Ùì'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #24
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
    //   129: putstatic burp/Zk1.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zk1.b : [Ljava/lang/String;
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
    //   212: bipush #16
    //   214: goto -> 244
    //   217: bipush #29
    //   219: goto -> 244
    //   222: bipush #81
    //   224: goto -> 244
    //   227: bipush #18
    //   229: goto -> 244
    //   232: bipush #38
    //   234: goto -> 244
    //   237: bipush #10
    //   239: goto -> 244
    //   242: bipush #115
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
    //   300: sipush #24717
    //   303: sipush #-8714
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zk1.Zg : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: iconst_4
    //   323: bastore
    //   324: dup
    //   325: iconst_1
    //   326: iconst_2
    //   327: bastore
    //   328: dup
    //   329: iconst_2
    //   330: bipush #58
    //   332: bastore
    //   333: dup
    //   334: iconst_3
    //   335: bipush #-52
    //   337: bastore
    //   338: dup
    //   339: iconst_4
    //   340: bipush #62
    //   342: bastore
    //   343: dup
    //   344: iconst_5
    //   345: bipush #42
    //   347: bastore
    //   348: dup
    //   349: bipush #6
    //   351: bipush #-29
    //   353: bastore
    //   354: dup
    //   355: bipush #7
    //   357: bipush #-13
    //   359: bastore
    //   360: dup
    //   361: bipush #8
    //   363: bipush #-86
    //   365: bastore
    //   366: dup
    //   367: bipush #9
    //   369: bipush #-11
    //   371: bastore
    //   372: dup
    //   373: bipush #10
    //   375: bipush #116
    //   377: bastore
    //   378: dup
    //   379: bipush #11
    //   381: bipush #124
    //   383: bastore
    //   384: dup
    //   385: bipush #12
    //   387: bipush #-50
    //   389: bastore
    //   390: dup
    //   391: bipush #13
    //   393: bipush #-54
    //   395: bastore
    //   396: dup
    //   397: bipush #14
    //   399: bipush #127
    //   401: bastore
    //   402: dup
    //   403: bipush #15
    //   405: bipush #40
    //   407: bastore
    //   408: dup
    //   409: bipush #16
    //   411: bipush #-30
    //   413: bastore
    //   414: dup
    //   415: bipush #17
    //   417: bipush #79
    //   419: bastore
    //   420: dup
    //   421: bipush #18
    //   423: bipush #-79
    //   425: bastore
    //   426: dup
    //   427: bipush #19
    //   429: bipush #27
    //   431: bastore
    //   432: dup
    //   433: bipush #20
    //   435: bipush #77
    //   437: bastore
    //   438: dup
    //   439: bipush #21
    //   441: bipush #112
    //   443: bastore
    //   444: dup
    //   445: bipush #22
    //   447: bipush #-34
    //   449: bastore
    //   450: dup
    //   451: bipush #23
    //   453: bipush #-36
    //   455: bastore
    //   456: dup
    //   457: bipush #24
    //   459: bipush #36
    //   461: bastore
    //   462: dup
    //   463: bipush #25
    //   465: bipush #120
    //   467: bastore
    //   468: dup
    //   469: bipush #26
    //   471: bipush #-19
    //   473: bastore
    //   474: dup
    //   475: bipush #27
    //   477: bipush #-67
    //   479: bastore
    //   480: dup
    //   481: bipush #28
    //   483: bipush #-103
    //   485: bastore
    //   486: dup
    //   487: bipush #29
    //   489: bipush #-47
    //   491: bastore
    //   492: dup
    //   493: bipush #30
    //   495: bipush #-69
    //   497: bastore
    //   498: dup
    //   499: bipush #31
    //   501: bipush #-114
    //   503: bastore
    //   504: invokespecial <init> : ([B)V
    //   507: putstatic burp/Zk1.Z_ : Ljava/lang/Object;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6088) & 0xFFFF;
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
      char c = '¼';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */