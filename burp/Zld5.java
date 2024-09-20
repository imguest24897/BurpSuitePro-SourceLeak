package burp;

import java.math.BigInteger;

class Zld5 extends ClassLoader {
  static Object ZX;
  
  static String ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zsp9.ZV : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zgrz.ZX : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zlc2.ZQ : Ljava/lang/Object;
    //   22: sipush #24435
    //   25: sipush #-13699
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zrof
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
    //   150: sipush #24436
    //   153: sipush #-26862
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
    //   189: ifne -> 51
    //   192: sipush #24437
    //   195: sipush #29422
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
    //   334: ifne -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifne -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: ldc2_w 8682522807148012
    //   354: invokestatic currentTimeMillis : ()J
    //   357: lxor
    //   358: lstore #4
    //   360: lload #4
    //   362: ldc2_w 25214903917
    //   365: lmul
    //   366: ldc2_w 11
    //   369: ladd
    //   370: ldc2_w 281474976710655
    //   373: land
    //   374: lstore #4
    //   376: lload #4
    //   378: bipush #32
    //   380: lshl
    //   381: lstore #6
    //   383: lload #4
    //   385: ldc2_w 25214903917
    //   388: lmul
    //   389: ldc2_w 11
    //   392: ladd
    //   393: ldc2_w 281474976710655
    //   396: land
    //   397: lstore #4
    //   399: lload #6
    //   401: lload #4
    //   403: ladd
    //   404: lstore #6
    //   406: bipush #16
    //   408: newarray byte
    //   410: dup
    //   411: iconst_0
    //   412: bipush #48
    //   414: bastore
    //   415: dup
    //   416: iconst_1
    //   417: bipush #49
    //   419: bastore
    //   420: dup
    //   421: iconst_2
    //   422: bipush #50
    //   424: bastore
    //   425: dup
    //   426: iconst_3
    //   427: bipush #51
    //   429: bastore
    //   430: dup
    //   431: iconst_4
    //   432: bipush #52
    //   434: bastore
    //   435: dup
    //   436: iconst_5
    //   437: bipush #53
    //   439: bastore
    //   440: dup
    //   441: bipush #6
    //   443: bipush #54
    //   445: bastore
    //   446: dup
    //   447: bipush #7
    //   449: bipush #55
    //   451: bastore
    //   452: dup
    //   453: bipush #8
    //   455: bipush #56
    //   457: bastore
    //   458: dup
    //   459: bipush #9
    //   461: bipush #57
    //   463: bastore
    //   464: dup
    //   465: bipush #10
    //   467: bipush #97
    //   469: bastore
    //   470: dup
    //   471: bipush #11
    //   473: bipush #98
    //   475: bastore
    //   476: dup
    //   477: bipush #12
    //   479: bipush #99
    //   481: bastore
    //   482: dup
    //   483: bipush #13
    //   485: bipush #100
    //   487: bastore
    //   488: dup
    //   489: bipush #14
    //   491: bipush #101
    //   493: bastore
    //   494: dup
    //   495: bipush #15
    //   497: bipush #102
    //   499: bastore
    //   500: astore #8
    //   502: bipush #64
    //   504: newarray byte
    //   506: astore #9
    //   508: bipush #64
    //   510: istore #10
    //   512: bipush #16
    //   514: istore #11
    //   516: iload #11
    //   518: iconst_1
    //   519: isub
    //   520: i2l
    //   521: lstore #12
    //   523: aload #9
    //   525: iinc #10, -1
    //   528: iload #10
    //   530: aload #8
    //   532: lload #6
    //   534: lload #12
    //   536: land
    //   537: l2i
    //   538: baload
    //   539: bastore
    //   540: lload #6
    //   542: iconst_4
    //   543: lushr
    //   544: lstore #6
    //   546: lload #6
    //   548: lconst_0
    //   549: lcmp
    //   550: ifne -> 523
    //   553: bipush #64
    //   555: iload #10
    //   557: isub
    //   558: newarray byte
    //   560: astore_3
    //   561: iconst_0
    //   562: istore #14
    //   564: iload #14
    //   566: aload_3
    //   567: arraylength
    //   568: if_icmpge -> 590
    //   571: aload_3
    //   572: iload #14
    //   574: aload #9
    //   576: iload #10
    //   578: iload #14
    //   580: iadd
    //   581: baload
    //   582: bastore
    //   583: iinc #14, 1
    //   586: iload_2
    //   587: ifne -> 564
    //   590: aload_3
    //   591: arraylength
    //   592: bipush #10
    //   594: if_icmplt -> 360
    //   597: getstatic burp/Zly9.ZS : Ljava/lang/String;
    //   600: getstatic burp/Ztzj.Zv : Ljava/lang/Object;
    //   603: checkcast java/math/BigInteger
    //   606: invokevirtual intValue : ()I
    //   609: bipush #32
    //   611: irem
    //   612: invokestatic abs : (I)I
    //   615: invokevirtual charAt : (I)C
    //   618: getstatic burp/Zoe.ZE : Ljava/lang/String;
    //   621: getstatic burp/Ztzj.Zv : Ljava/lang/Object;
    //   624: checkcast java/math/BigInteger
    //   627: invokevirtual intValue : ()I
    //   630: bipush #32
    //   632: irem
    //   633: invokestatic abs : (I)I
    //   636: invokevirtual charAt : (I)C
    //   639: if_icmpgt -> 746
    //   642: getstatic burp/Zb6m.ZR : Ljava/lang/String;
    //   645: getstatic burp/Zbwj.ZW : Ljava/lang/Object;
    //   648: checkcast java/math/BigInteger
    //   651: invokevirtual intValue : ()I
    //   654: bipush #32
    //   656: irem
    //   657: invokestatic abs : (I)I
    //   660: invokevirtual charAt : (I)C
    //   663: getstatic burp/Ztle.ZR : Ljava/lang/String;
    //   666: getstatic burp/Zmig.Zh : Ljava/lang/Object;
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
    //   694: getstatic burp/Zl2t.Zg : Ljava/lang/String;
    //   697: getstatic burp/Zbx4.Zw : Ljava/lang/Object;
    //   700: checkcast java/math/BigInteger
    //   703: invokevirtual intValue : ()I
    //   706: bipush #32
    //   708: irem
    //   709: invokestatic abs : (I)I
    //   712: invokevirtual charAt : (I)C
    //   715: getstatic burp/Zt81.ZL : Ljava/lang/String;
    //   718: getstatic burp/Zz7j.ZR : Ljava/lang/Object;
    //   721: checkcast java/math/BigInteger
    //   724: invokevirtual intValue : ()I
    //   727: bipush #32
    //   729: irem
    //   730: invokestatic abs : (I)I
    //   733: invokevirtual charAt : (I)C
    //   736: if_icmpgt -> 754
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
    //   597	687	690	java/lang/Throwable
    //   642	739	742	java/lang/Throwable
    //   694	750	750	java/lang/Throwable
  }
  
  static void Zt(Object paramObject) {
    Zxxo.ZH = a(24438, 21731);
    Zxxo.ZJ = new BigInteger(a(24433, 11857));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zzhx.ZV.charAt(Math.abs(((BigInteger)Zz7j.ZR).intValue() % 32)) > Ztgv.ZC.charAt(Math.abs(((BigInteger)Zepy.Ze).intValue() % 32))) {
          try {
            Zl8y.Zr(Class.forName(a(24432, -25842)));
            if (bool)
              Zmzj.Zu(Class.forName(a(24439, 27233))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zmzj.Zu(Class.forName(a(24439, 27233)));
    } catch (Throwable throwable) {}
  }
  
  static void Zl(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'h)}ùZÅÊ FÔõÃÛ~SÌ°/ÏÃ÷ïf@+ÎA¤\\fÒ¦Ð¾Î_èM×ÅÂ8f179æ.ÒSÓ2âoÆ©¬.ÐHûò\\t#ó,3kNDÁ3w~ê^ßÔãú:ÅÌ"ÜJ\åc30Bp6\\bÎ'\\t{áK´1>Ì2¤\\tËõ]6ónù ü:M&ËÉp¦ðdh|°J­$ÐT?Ó½Ý L'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_4
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
    //   67: ldc '^ýÜ3Øx\\ne­.Ö'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #42
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
    //   128: putstatic burp/Zld5.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zld5.b : [Ljava/lang/String;
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
    //   212: bipush #7
    //   214: goto -> 244
    //   217: bipush #55
    //   219: goto -> 244
    //   222: bipush #28
    //   224: goto -> 244
    //   227: bipush #65
    //   229: goto -> 244
    //   232: bipush #77
    //   234: goto -> 244
    //   237: bipush #32
    //   239: goto -> 244
    //   242: bipush #94
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
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #35
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #102
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #88
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-88
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #48
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: iconst_5
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-123
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-83
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #70
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-15
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #125
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-49
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-100
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-55
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-81
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-114
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-107
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #80
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #82
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #38
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #123
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-68
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-103
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-59
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #49
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-110
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #85
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-125
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-46
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #64
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-75
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #44
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Zld5.ZX : Ljava/lang/Object;
    //   500: sipush #24434
    //   503: sipush #-1903
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zld5.ZO : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5F73) & 0xFFFF;
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
      byte b1 = 25;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zld5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */