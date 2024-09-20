package burp;

import java.math.BigInteger;

class Zz35 extends ClassLoader {
  static String ZH;
  
  static Object ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZB(Object paramObject) {
    Zgw_.ZH = a(-537, 24007);
    Zgw_.Zf = new BigInteger(a(-543, 1060));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zro5.ZY.charAt(Math.abs(((BigInteger)Zlnq.ZO).intValue() % 32)) <= Ztdx.Zl.charAt(Math.abs(((BigInteger)Ztdx.ZX).intValue() % 32))) {
          try {
            Zrf9.Zt(Class.forName(a(-538, 26223)));
            if (bool)
              Zz5h.Zb(Class.forName(a(-542, 13781))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zz5h.Zb(Class.forName(a(-542, 13781)));
    } catch (Throwable throwable) {}
  }
  
  static void Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
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
    //   240: ifeq -> 217
    //   243: aload_3
    //   244: arraylength
    //   245: bipush #10
    //   247: if_icmplt -> 13
    //   250: sipush #-540
    //   253: sipush #22014
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: iconst_1
    //   260: ldc burp/Zl55
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
    //   378: sipush #-532
    //   381: sipush #-30936
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
    //   417: ifeq -> 279
    //   420: sipush #-541
    //   423: sipush #-23534
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
    //   562: ifeq -> 579
    //   565: iinc #5, 1
    //   568: iload_2
    //   569: ifeq -> 443
    //   572: goto -> 579
    //   575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   578: athrow
    //   579: getstatic burp/Zr_w.Zi : Ljava/lang/String;
    //   582: getstatic burp/Zgzv.Zb : Ljava/lang/Object;
    //   585: checkcast java/math/BigInteger
    //   588: invokevirtual intValue : ()I
    //   591: bipush #32
    //   593: irem
    //   594: invokestatic abs : (I)I
    //   597: invokevirtual charAt : (I)C
    //   600: getstatic burp/Zgh3.ZR : Ljava/lang/String;
    //   603: getstatic burp/Zlv6.ZN : Ljava/lang/Object;
    //   606: checkcast java/math/BigInteger
    //   609: invokevirtual intValue : ()I
    //   612: bipush #32
    //   614: irem
    //   615: invokestatic abs : (I)I
    //   618: invokevirtual charAt : (I)C
    //   621: if_icmple -> 736
    //   624: getstatic burp/Zod.ZS : Ljava/lang/String;
    //   627: getstatic burp/Zmsl.ZB : Ljava/lang/Object;
    //   630: checkcast java/math/BigInteger
    //   633: invokevirtual intValue : ()I
    //   636: bipush #32
    //   638: irem
    //   639: invokestatic abs : (I)I
    //   642: invokevirtual charAt : (I)C
    //   645: getstatic burp/Zkku.Zq : Ljava/lang/String;
    //   648: getstatic burp/Zxof.Zi : Ljava/lang/Object;
    //   651: checkcast java/math/BigInteger
    //   654: invokevirtual intValue : ()I
    //   657: bipush #32
    //   659: irem
    //   660: invokestatic abs : (I)I
    //   663: invokevirtual charAt : (I)C
    //   666: if_icmple -> 736
    //   669: goto -> 676
    //   672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   675: athrow
    //   676: getstatic burp/Zke7.Zl : Ljava/lang/String;
    //   679: getstatic burp/Zlem.ZI : Ljava/lang/Object;
    //   682: checkcast java/math/BigInteger
    //   685: invokevirtual intValue : ()I
    //   688: bipush #32
    //   690: irem
    //   691: invokestatic abs : (I)I
    //   694: invokevirtual charAt : (I)C
    //   697: getstatic burp/Zzah.Zs : Ljava/lang/String;
    //   700: getstatic burp/Ze_0.ZY : Ljava/lang/Object;
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
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'BÁì_v\\bÛpMËFîv>D\\fXI¨\R»YvNjÜ¥÷Uïe­Þ?¿¿aj¸¯}ä\\rdÓ¾ð.þØi{D3ht\"!_Z©G,Åt\\rÅ\\t4.:¬,¦K gÊü.MoäyÞù\\tKXúP,$.ª75½@  ká¦¤;nM3Pá,Þ\\nâyîdòZâLè_ÚÎÊMçòimß!8»)Âv\\f±±wÅ9ÆÆ6k¤ùJñ*¡íè__IÃPJ¡Hj¯#;®È+n1 P0:S¸C}ö/KÓR·÷( Ó\\tín42á­Æ®'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #127
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
    //   68: ldc 'Í[¢§àï¯S-'
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
    //   129: putstatic burp/Zz35.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zz35.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 258
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 230, 5 -> 235
    //   212: bipush #10
    //   214: goto -> 242
    //   217: bipush #62
    //   219: goto -> 242
    //   222: iconst_4
    //   223: goto -> 242
    //   226: iconst_3
    //   227: goto -> 242
    //   230: bipush #101
    //   232: goto -> 242
    //   235: bipush #63
    //   237: goto -> 242
    //   240: bipush #89
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 166
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 162
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 99
    //   300: sipush #-544
    //   303: sipush #11495
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zz35.ZH : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-539
    //   319: sipush #31881
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zz35.ZB : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFDE4) & 0xFFFF;
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
      char c = 'é';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz35.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */