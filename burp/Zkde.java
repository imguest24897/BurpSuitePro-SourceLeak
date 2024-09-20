package burp;

import java.math.BigInteger;

class Zkde extends ClassLoader {
  static Object Zk;
  
  static String Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZC(Object paramObject) {
    Zry9.ZW = a(-27592, -389);
    Zry9.Zw = new BigInteger(a(-27589, -26841));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zxjm.ZG.charAt(Math.abs(((BigInteger)Zty4.ZQ).intValue() % 32)) > Zd8.ZK.charAt(Math.abs(((BigInteger)Zx_b.ZX).intValue() % 32))) {
          try {
            Zl4v.Zn(Class.forName(a(-27585, 30441)));
            if (bool)
              Zg3v.ZC(Class.forName(a(-27588, 32536))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zg3v.ZC(Class.forName(a(-27588, 32536)));
    } catch (Throwable throwable) {}
  }
  
  static void Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   250: getstatic burp/Zlpu.ZE : Ljava/lang/Object;
    //   253: checkcast java/math/BigInteger
    //   256: getstatic burp/Ztzw.Zk : Ljava/lang/Object;
    //   259: checkcast java/math/BigInteger
    //   262: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   265: putstatic burp/Zb6e.ZD : Ljava/lang/Object;
    //   268: sipush #-27591
    //   271: getstatic burp/Zsmn.Zq : Ljava/lang/Object;
    //   274: checkcast java/math/BigInteger
    //   277: getstatic burp/Zb6e.ZD : Ljava/lang/Object;
    //   280: checkcast java/math/BigInteger
    //   283: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   286: putstatic burp/Zmd.ZU : Ljava/lang/Object;
    //   289: sipush #-26264
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: iconst_1
    //   296: ldc burp/Zsm3
    //   298: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   301: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   304: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   307: astore_3
    //   308: aload_3
    //   309: arraylength
    //   310: istore #4
    //   312: iconst_0
    //   313: istore #5
    //   315: iload #5
    //   317: iload #4
    //   319: if_icmpge -> 456
    //   322: aload_3
    //   323: iload #5
    //   325: aaload
    //   326: astore #6
    //   328: aload #6
    //   330: invokevirtual getModifiers : ()I
    //   333: invokestatic isStatic : (I)Z
    //   336: ifne -> 346
    //   339: goto -> 449
    //   342: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   345: athrow
    //   346: aload #6
    //   348: invokevirtual getType : ()Ljava/lang/Class;
    //   351: astore #7
    //   353: aload #7
    //   355: ifnull -> 436
    //   358: aload #7
    //   360: invokevirtual isPrimitive : ()Z
    //   363: ifne -> 436
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   372: athrow
    //   373: aload #7
    //   375: invokevirtual getPackage : ()Ljava/lang/Package;
    //   378: ifnull -> 436
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   387: athrow
    //   388: aload #7
    //   390: invokevirtual getPackage : ()Ljava/lang/Package;
    //   393: invokevirtual getName : ()Ljava/lang/String;
    //   396: ifnull -> 436
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   405: athrow
    //   406: aload #7
    //   408: invokevirtual getPackage : ()Ljava/lang/Package;
    //   411: invokevirtual getName : ()Ljava/lang/String;
    //   414: sipush #-27587
    //   417: sipush #-32183
    //   420: invokestatic a : (II)Ljava/lang/String;
    //   423: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   426: ifne -> 436
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   435: athrow
    //   436: aload #6
    //   438: iconst_1
    //   439: invokevirtual setAccessible : (Z)V
    //   442: aload #6
    //   444: aconst_null
    //   445: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   448: pop
    //   449: iinc #5, 1
    //   452: iload_2
    //   453: ifne -> 315
    //   456: sipush #-27590
    //   459: sipush #907
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   468: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   471: astore_3
    //   472: aload_3
    //   473: arraylength
    //   474: istore #4
    //   476: iconst_0
    //   477: istore #5
    //   479: iload #5
    //   481: iload #4
    //   483: if_icmpge -> 615
    //   486: aload_3
    //   487: iload #5
    //   489: aaload
    //   490: astore #6
    //   492: aload #6
    //   494: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   497: pop
    //   498: aload #6
    //   500: invokevirtual getModifiers : ()I
    //   503: invokestatic isStatic : (I)Z
    //   506: ifeq -> 601
    //   509: aload #6
    //   511: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   514: arraylength
    //   515: iconst_2
    //   516: if_icmpne -> 601
    //   519: goto -> 526
    //   522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   525: athrow
    //   526: aload #6
    //   528: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   531: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   534: invokevirtual equals : (Ljava/lang/Object;)Z
    //   537: ifeq -> 601
    //   540: goto -> 547
    //   543: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   546: athrow
    //   547: aload #6
    //   549: iconst_1
    //   550: invokevirtual setAccessible : (Z)V
    //   553: aload #6
    //   555: aconst_null
    //   556: iconst_2
    //   557: anewarray java/lang/Object
    //   560: dup
    //   561: iconst_0
    //   562: aload_0
    //   563: aastore
    //   564: dup
    //   565: iconst_1
    //   566: aload_1
    //   567: ifnonnull -> 585
    //   570: goto -> 577
    //   573: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   576: athrow
    //   577: aload_1
    //   578: goto -> 592
    //   581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   584: athrow
    //   585: aload_1
    //   586: checkcast [B
    //   589: invokevirtual clone : ()Ljava/lang/Object;
    //   592: aastore
    //   593: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   596: pop
    //   597: iload_2
    //   598: ifne -> 615
    //   601: iinc #5, 1
    //   604: iload_2
    //   605: ifne -> 479
    //   608: goto -> 615
    //   611: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   614: athrow
    //   615: getstatic burp/Zb6e.ZR : Ljava/lang/String;
    //   618: getstatic burp/Zl1n.ZM : Ljava/lang/Object;
    //   621: checkcast java/math/BigInteger
    //   624: invokevirtual intValue : ()I
    //   627: bipush #32
    //   629: irem
    //   630: invokestatic abs : (I)I
    //   633: invokevirtual charAt : (I)C
    //   636: getstatic burp/Zelz.ZK : Ljava/lang/String;
    //   639: getstatic burp/Zx58.ZE : Ljava/lang/Object;
    //   642: checkcast java/math/BigInteger
    //   645: invokevirtual intValue : ()I
    //   648: bipush #32
    //   650: irem
    //   651: invokestatic abs : (I)I
    //   654: invokevirtual charAt : (I)C
    //   657: if_icmpgt -> 764
    //   660: getstatic burp/Zty2.ZR : Ljava/lang/String;
    //   663: getstatic burp/Zd8.Zs : Ljava/lang/Object;
    //   666: checkcast java/math/BigInteger
    //   669: invokevirtual intValue : ()I
    //   672: bipush #32
    //   674: irem
    //   675: invokestatic abs : (I)I
    //   678: invokevirtual charAt : (I)C
    //   681: getstatic burp/Zx_b.ZD : Ljava/lang/String;
    //   684: getstatic burp/Zl6e.Zo : Ljava/lang/Object;
    //   687: checkcast java/math/BigInteger
    //   690: invokevirtual intValue : ()I
    //   693: bipush #32
    //   695: irem
    //   696: invokestatic abs : (I)I
    //   699: invokevirtual charAt : (I)C
    //   702: if_icmple -> 764
    //   705: goto -> 712
    //   708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   711: athrow
    //   712: getstatic burp/Zsbd.ZA : Ljava/lang/String;
    //   715: getstatic burp/Zbu.ZW : Ljava/lang/Object;
    //   718: checkcast java/math/BigInteger
    //   721: invokevirtual intValue : ()I
    //   724: bipush #32
    //   726: irem
    //   727: invokestatic abs : (I)I
    //   730: invokevirtual charAt : (I)C
    //   733: getstatic burp/Zxjm.ZG : Ljava/lang/String;
    //   736: getstatic burp/Zvi.Zs : Ljava/lang/Object;
    //   739: checkcast java/math/BigInteger
    //   742: invokevirtual intValue : ()I
    //   745: bipush #32
    //   747: irem
    //   748: invokestatic abs : (I)I
    //   751: invokevirtual charAt : (I)C
    //   754: if_icmple -> 772
    //   757: goto -> 764
    //   760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   763: athrow
    //   764: iconst_1
    //   765: goto -> 773
    //   768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   771: athrow
    //   772: iconst_0
    //   773: ireturn
    //   774: astore_3
    //   775: new java/lang/Exception
    //   778: dup
    //   779: aload_3
    //   780: invokevirtual getMessage : ()Ljava/lang/String;
    //   783: invokespecial <init> : (Ljava/lang/String;)V
    //   786: athrow
    // Exception table:
    //   from	to	target	type
    //   4	773	774	java/lang/Throwable
    //   328	342	342	java/lang/Throwable
    //   353	366	369	java/lang/Throwable
    //   358	381	384	java/lang/Throwable
    //   373	399	402	java/lang/Throwable
    //   388	429	432	java/lang/Throwable
    //   492	519	522	java/lang/Throwable
    //   509	540	543	java/lang/Throwable
    //   526	570	573	java/lang/Throwable
    //   547	581	581	java/lang/Throwable
    //   592	608	611	java/lang/Throwable
    //   615	705	708	java/lang/Throwable
    //   660	757	760	java/lang/Throwable
    //   712	768	768	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\b?o\\t­NÛ*;Ð¿0ö\\tüÌ|ÙílJ êµp[|1OÌ#éGn ÷/hðÏ,y`¼?|HÏ\\tLãç¼fA°À Ô1·×Ó&eDüî$9F~3AK^G#Ô-Úc\\fä>=0'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #94
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
    //   67: ldc 'ä|gk\õtî¼êû¦j"_§ëÍ«Bf©à\\rËUN°\\bi÷öaek_485^XÝé,ôr$Ü1àTGsÒüjýplUwRTò\\t©]ÕÆtÃÖ¼'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #77
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #24
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
    //   128: putstatic burp/Zkde.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zkde.b : [Ljava/lang/String;
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
    //   212: bipush #13
    //   214: goto -> 244
    //   217: bipush #102
    //   219: goto -> 244
    //   222: bipush #6
    //   224: goto -> 244
    //   227: bipush #17
    //   229: goto -> 244
    //   232: bipush #7
    //   234: goto -> 244
    //   237: bipush #6
    //   239: goto -> 244
    //   242: bipush #35
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
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #59
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #123
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-76
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #114
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-87
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #33
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-18
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-16
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: iconst_3
    //   354: bastore
    //   355: dup
    //   356: bipush #9
    //   358: bipush #-40
    //   360: bastore
    //   361: dup
    //   362: bipush #10
    //   364: bipush #-124
    //   366: bastore
    //   367: dup
    //   368: bipush #11
    //   370: bipush #-25
    //   372: bastore
    //   373: dup
    //   374: bipush #12
    //   376: bipush #80
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #44
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #-11
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #-69
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-50
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #-90
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #9
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #16
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #-62
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #22
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-59
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-102
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #40
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-17
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #121
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-115
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #72
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-94
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #78
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-15
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zkde.Zk : Ljava/lang/Object;
    //   499: sipush #-27586
    //   502: sipush #-30549
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zkde.Zb : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF943D) & 0xFFFF;
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
      byte b1 = 94;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkde.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */