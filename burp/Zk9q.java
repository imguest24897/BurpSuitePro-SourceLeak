package burp;

import java.math.BigInteger;

class Zk9q extends ClassLoader {
  static Object ZH;
  
  static String Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZC(Object paramObject) {
    Zkhf.Zb = a(24730, 9000);
    Zkhf.ZU = new BigInteger(a(24734, -5628));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxdy.Zm.charAt(Math.abs(((BigInteger)Zrye.Zx).intValue() % 32)) > Zrqi.Zu.charAt(Math.abs(((BigInteger)Zmdf.ZH).intValue() % 32))) {
          try {
            Zs8y.ZS(Class.forName(a(24733, -13520)));
            if (!bool)
              Zrkw.ZE(Class.forName(a(24732, -15415))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrkw.ZE(Class.forName(a(24732, -15415)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zn(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zvh.Zb : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zr1t.ZP : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zd9.Zr : Ljava/lang/Object;
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
    //   258: ifne -> 235
    //   261: aload_3
    //   262: arraylength
    //   263: bipush #10
    //   265: if_icmplt -> 31
    //   268: sipush #24729
    //   271: sipush #-1406
    //   274: invokestatic a : (II)Ljava/lang/String;
    //   277: iconst_1
    //   278: ldc burp/Zbnb
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
    //   396: sipush #24735
    //   399: sipush #-10478
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
    //   435: ifne -> 297
    //   438: sipush #24728
    //   441: sipush #-13942
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
    //   465: if_icmpge -> 597
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
    //   488: ifeq -> 583
    //   491: aload #6
    //   493: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   496: arraylength
    //   497: iconst_2
    //   498: if_icmpne -> 583
    //   501: goto -> 508
    //   504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   507: athrow
    //   508: aload #6
    //   510: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   513: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   516: invokevirtual equals : (Ljava/lang/Object;)Z
    //   519: ifeq -> 583
    //   522: goto -> 529
    //   525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   528: athrow
    //   529: aload #6
    //   531: iconst_1
    //   532: invokevirtual setAccessible : (Z)V
    //   535: aload #6
    //   537: aconst_null
    //   538: iconst_2
    //   539: anewarray java/lang/Object
    //   542: dup
    //   543: iconst_0
    //   544: aload_0
    //   545: aastore
    //   546: dup
    //   547: iconst_1
    //   548: aload_1
    //   549: ifnonnull -> 567
    //   552: goto -> 559
    //   555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   558: athrow
    //   559: aload_1
    //   560: goto -> 574
    //   563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   566: athrow
    //   567: aload_1
    //   568: checkcast [B
    //   571: invokevirtual clone : ()Ljava/lang/Object;
    //   574: aastore
    //   575: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   578: pop
    //   579: iload_2
    //   580: ifne -> 597
    //   583: iinc #5, 1
    //   586: iload_2
    //   587: ifne -> 461
    //   590: goto -> 597
    //   593: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   596: athrow
    //   597: getstatic burp/Zsp9.ZA : Ljava/lang/String;
    //   600: getstatic burp/Zv8d.ZN : Ljava/lang/Object;
    //   603: checkcast java/math/BigInteger
    //   606: invokevirtual intValue : ()I
    //   609: bipush #32
    //   611: irem
    //   612: invokestatic abs : (I)I
    //   615: invokevirtual charAt : (I)C
    //   618: getstatic burp/Zesw.ZC : Ljava/lang/String;
    //   621: getstatic burp/Zrb6.ZQ : Ljava/lang/Object;
    //   624: checkcast java/math/BigInteger
    //   627: invokevirtual intValue : ()I
    //   630: bipush #32
    //   632: irem
    //   633: invokestatic abs : (I)I
    //   636: invokevirtual charAt : (I)C
    //   639: if_icmple -> 746
    //   642: getstatic burp/Zbl4.Ze : Ljava/lang/String;
    //   645: getstatic burp/Zzn6.ZO : Ljava/lang/Object;
    //   648: checkcast java/math/BigInteger
    //   651: invokevirtual intValue : ()I
    //   654: bipush #32
    //   656: irem
    //   657: invokestatic abs : (I)I
    //   660: invokevirtual charAt : (I)C
    //   663: getstatic burp/Zlgh.Zm : Ljava/lang/String;
    //   666: getstatic burp/Zk8f.ZG : Ljava/lang/Object;
    //   669: checkcast java/math/BigInteger
    //   672: invokevirtual intValue : ()I
    //   675: bipush #32
    //   677: irem
    //   678: invokestatic abs : (I)I
    //   681: invokevirtual charAt : (I)C
    //   684: if_icmpgt -> 746
    //   687: goto -> 694
    //   690: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   693: athrow
    //   694: getstatic burp/Ztgv.ZC : Ljava/lang/String;
    //   697: getstatic burp/Zm_u.Zf : Ljava/lang/Object;
    //   700: checkcast java/math/BigInteger
    //   703: invokevirtual intValue : ()I
    //   706: bipush #32
    //   708: irem
    //   709: invokestatic abs : (I)I
    //   712: invokevirtual charAt : (I)C
    //   715: getstatic burp/Zm3x.Zu : Ljava/lang/String;
    //   718: getstatic burp/Zxy6.Zd : Ljava/lang/Object;
    //   721: checkcast java/math/BigInteger
    //   724: invokevirtual intValue : ()I
    //   727: bipush #32
    //   729: irem
    //   730: invokestatic abs : (I)I
    //   733: invokevirtual charAt : (I)C
    //   736: if_icmple -> 754
    //   739: goto -> 746
    //   742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   745: athrow
    //   746: iconst_1
    //   747: goto -> 755
    //   750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   753: athrow
    //   754: iconst_0
    //   755: ireturn
    //   756: astore_3
    //   757: new java/lang/Exception
    //   760: dup
    //   761: aload_3
    //   762: invokevirtual getMessage : ()Ljava/lang/String;
    //   765: invokespecial <init> : (Ljava/lang/String;)V
    //   768: athrow
    // Exception table:
    //   from	to	target	type
    //   4	755	756	java/lang/Throwable
    //   310	324	324	java/lang/Throwable
    //   335	348	351	java/lang/Throwable
    //   340	363	366	java/lang/Throwable
    //   355	381	384	java/lang/Throwable
    //   370	411	414	java/lang/Throwable
    //   474	501	504	java/lang/Throwable
    //   491	522	525	java/lang/Throwable
    //   508	552	555	java/lang/Throwable
    //   529	563	563	java/lang/Throwable
    //   574	590	593	java/lang/Throwable
    //   597	687	690	java/lang/Throwable
    //   642	739	742	java/lang/Throwable
    //   694	750	750	java/lang/Throwable
  }
  
  static void Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' 8CÞlkXv¬ÉjQ@¯qÑW:,^Qq v/:~i¬W\\rg(ú{YÕW)st#òNÁï¯{\\b\\t´Þ{yn\\t+¢jJ`´+róA`MP.Ù¼%¶qEBW©w±±ÿMî<3»+ÃëÙ ÑñýBË¬Ô*V'VÙõ2ûÕÈshý*ï1gëÊ¦ô'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #17
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
    //   68: ldc 'çwØGWÀiP\\ttÄ\\t\\fc'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #21
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
    //   129: putstatic burp/Zk9q.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zk9q.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_2
    //   213: goto -> 243
    //   216: bipush #95
    //   218: goto -> 243
    //   221: bipush #32
    //   223: goto -> 243
    //   226: bipush #109
    //   228: goto -> 243
    //   231: bipush #8
    //   233: goto -> 243
    //   236: bipush #114
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
    //   311: bipush #127
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #10
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-18
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #93
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #14
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-57
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #6
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #75
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #126
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #-69
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #63
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #93
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-92
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #-51
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #-41
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #-66
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-102
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-12
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #78
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #119
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #102
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #50
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-61
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #-9
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #33
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #71
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-14
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #-17
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-101
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #55
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #84
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #63
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zk9q.ZH : Ljava/lang/Object;
    //   501: sipush #24731
    //   504: sipush #17553
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zk9q.Zk : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x609B) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk9q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */