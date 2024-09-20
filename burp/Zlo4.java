package burp;

import java.math.BigInteger;

class Zlo4 extends ClassLoader {
  static String Zn;
  
  static Object ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zr(Object paramObject) {
    Zzco.Zu = a(25634, -28778);
    Zzco.ZC = new BigInteger(a(25647, -6166));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zt7j.Zx.charAt(Math.abs(((BigInteger)Zvos.Zr).intValue() % 32)) > Zkqx.Ze.charAt(Math.abs(((BigInteger)Zb38.ZC).intValue() % 32))) {
          try {
            Zt0t.ZM(Class.forName(a(25633, -8927)));
            if (!bool)
              Zgjs.ZW(Class.forName(a(25645, 19209))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgjs.ZW(Class.forName(a(25645, 19209)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zbzc.Zp : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztip.Zc : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zsq6.ZS : Ljava/lang/Object;
    //   22: sipush #25632
    //   25: getstatic burp/Zsk4.Ze : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zgds.Z_ : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zs4v.ZB : Ljava/lang/Object;
    //   43: sipush #-31974
    //   46: getstatic burp/Zko9.ZC : Ljava/lang/Object;
    //   49: checkcast java/math/BigInteger
    //   52: getstatic burp/Zr0.ZX : Ljava/lang/Object;
    //   55: checkcast java/math/BigInteger
    //   58: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   61: putstatic burp/Zg3v.Zk : Ljava/lang/Object;
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: ldc burp/Zxee
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
    //   186: sipush #25636
    //   189: sipush #17852
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
    //   225: ifne -> 87
    //   228: sipush #25644
    //   231: sipush #12994
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
    //   370: ifne -> 387
    //   373: iinc #5, 1
    //   376: iload_2
    //   377: ifne -> 251
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   386: athrow
    //   387: iconst_0
    //   388: istore_3
    //   389: sipush #25638
    //   392: sipush #-13555
    //   395: invokestatic a : (II)Ljava/lang/String;
    //   398: iconst_1
    //   399: ldc burp/Zgil
    //   401: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   404: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   407: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   410: astore #4
    //   412: aload #4
    //   414: arraylength
    //   415: istore #5
    //   417: iconst_0
    //   418: istore #6
    //   420: iload #6
    //   422: iload #5
    //   424: if_icmpge -> 562
    //   427: aload #4
    //   429: iload #6
    //   431: aaload
    //   432: astore #7
    //   434: aload #7
    //   436: invokevirtual getModifiers : ()I
    //   439: invokestatic isStatic : (I)Z
    //   442: ifne -> 452
    //   445: goto -> 555
    //   448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   451: athrow
    //   452: aload #7
    //   454: invokevirtual getType : ()Ljava/lang/Class;
    //   457: astore #8
    //   459: aload #8
    //   461: ifnull -> 542
    //   464: aload #8
    //   466: invokevirtual isPrimitive : ()Z
    //   469: ifne -> 542
    //   472: goto -> 479
    //   475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   478: athrow
    //   479: aload #8
    //   481: invokevirtual getPackage : ()Ljava/lang/Package;
    //   484: ifnull -> 542
    //   487: goto -> 494
    //   490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   493: athrow
    //   494: aload #8
    //   496: invokevirtual getPackage : ()Ljava/lang/Package;
    //   499: invokevirtual getName : ()Ljava/lang/String;
    //   502: ifnull -> 542
    //   505: goto -> 512
    //   508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   511: athrow
    //   512: aload #8
    //   514: invokevirtual getPackage : ()Ljava/lang/Package;
    //   517: invokevirtual getName : ()Ljava/lang/String;
    //   520: sipush #25635
    //   523: sipush #-1107
    //   526: invokestatic a : (II)Ljava/lang/String;
    //   529: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   532: ifne -> 542
    //   535: goto -> 542
    //   538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   541: athrow
    //   542: aload #7
    //   544: iconst_1
    //   545: invokevirtual setAccessible : (Z)V
    //   548: aload #7
    //   550: aconst_null
    //   551: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   554: pop
    //   555: iinc #6, 1
    //   558: iload_2
    //   559: ifne -> 420
    //   562: sipush #25639
    //   565: sipush #-3661
    //   568: invokestatic a : (II)Ljava/lang/String;
    //   571: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   574: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   577: astore #4
    //   579: aload #4
    //   581: arraylength
    //   582: istore #5
    //   584: iconst_0
    //   585: istore #6
    //   587: iload #6
    //   589: iload #5
    //   591: if_icmpge -> 727
    //   594: aload #4
    //   596: iload #6
    //   598: aaload
    //   599: astore #7
    //   601: aload #7
    //   603: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   606: pop
    //   607: aload #7
    //   609: invokevirtual getModifiers : ()I
    //   612: invokestatic isStatic : (I)Z
    //   615: ifeq -> 713
    //   618: aload #7
    //   620: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   623: arraylength
    //   624: iconst_2
    //   625: if_icmpne -> 713
    //   628: goto -> 635
    //   631: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   634: athrow
    //   635: aload #7
    //   637: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   640: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   643: if_acmpne -> 713
    //   646: goto -> 653
    //   649: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   652: athrow
    //   653: aload #7
    //   655: iconst_1
    //   656: invokevirtual setAccessible : (Z)V
    //   659: aload #7
    //   661: aconst_null
    //   662: iconst_2
    //   663: anewarray java/lang/Object
    //   666: dup
    //   667: iconst_0
    //   668: aload_0
    //   669: aastore
    //   670: dup
    //   671: iconst_1
    //   672: aload_1
    //   673: ifnonnull -> 691
    //   676: goto -> 683
    //   679: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   682: athrow
    //   683: aload_1
    //   684: goto -> 698
    //   687: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   690: athrow
    //   691: aload_1
    //   692: checkcast [B
    //   695: invokevirtual clone : ()Ljava/lang/Object;
    //   698: aastore
    //   699: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   702: checkcast java/lang/Boolean
    //   705: invokevirtual booleanValue : ()Z
    //   708: istore_3
    //   709: iload_2
    //   710: ifne -> 727
    //   713: iinc #6, 1
    //   716: iload_2
    //   717: ifne -> 587
    //   720: goto -> 727
    //   723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   726: athrow
    //   727: iload_3
    //   728: ireturn
    //   729: astore_3
    //   730: new java/lang/Exception
    //   733: dup
    //   734: aload_3
    //   735: invokevirtual getMessage : ()Ljava/lang/String;
    //   738: invokespecial <init> : (Ljava/lang/String;)V
    //   741: athrow
    // Exception table:
    //   from	to	target	type
    //   4	728	729	java/lang/Throwable
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
    //   434	448	448	java/lang/Throwable
    //   459	472	475	java/lang/Throwable
    //   464	487	490	java/lang/Throwable
    //   479	505	508	java/lang/Throwable
    //   494	535	538	java/lang/Throwable
    //   601	628	631	java/lang/Throwable
    //   618	646	649	java/lang/Throwable
    //   635	676	679	java/lang/Throwable
    //   653	687	687	java/lang/Throwable
    //   709	720	723	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ì ¯t\\tû&KnÇo*\2ô.ânÛó?Bmån¸\\tËºUº\\be\\tÁS<%¨­\\tÞqßÃY=2\\t"R@§ª¥EOFç 9³ÿ¿*r\\b/³!ôqh;Û{"¶hlXÔRì\\tÅC¼5þ´'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #115
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
    //   68: ldc 'ñf2d:hM@Rÿ­MW¡@%F#¤]Iò­¬V×Eæ¸½§¿CÀÙ\\bí£8s<Üd/áµrÏs\\t"tNÈ)8_g hz /¨Á2ÏJ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #125
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
    //   129: putstatic burp/Zlo4.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlo4.b : [Ljava/lang/String;
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
    //   212: bipush #127
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #109
    //   224: goto -> 244
    //   227: bipush #95
    //   229: goto -> 244
    //   232: bipush #79
    //   234: goto -> 244
    //   237: bipush #112
    //   239: goto -> 244
    //   242: bipush #61
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
    //   300: sipush #25637
    //   303: sipush #2502
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zlo4.Zn : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #28
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-125
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-116
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #-93
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-84
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-27
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #51
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #27
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #109
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #23
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-40
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-90
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #100
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #102
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #6
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-36
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #13
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #126
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #40
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #118
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #111
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #42
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: iconst_0
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #-69
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #-38
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #123
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #63
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #-76
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #99
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #9
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #-13
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #-105
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zlo4.ZC : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6425) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlo4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */