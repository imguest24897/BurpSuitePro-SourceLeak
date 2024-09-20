package burp;

import java.math.BigInteger;

class Zz58 extends ClassLoader {
  static Object ZD;
  
  static String ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZU(Object paramObject) {
    Zkku.Zq = a(18876, 17935);
    Zkku.Zz = new BigInteger(a(18879, -1544));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zzv.Zy.charAt(Math.abs(((BigInteger)Zrvb.ZD).intValue() % 32)) > Zs9u.ZM.charAt(Math.abs(((BigInteger)Zs59.Zw).intValue() % 32))) {
          try {
            Zrfh.ZP(Class.forName(a(18878, 1215)));
            if (bool)
              Zxnm.ZI(Class.forName(a(18872, 15855))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxnm.ZI(Class.forName(a(18872, 15855)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Za(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zly0.ZB : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zzv.Zu : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zre1.ZN : Ljava/lang/Object;
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
    //   258: ifeq -> 235
    //   261: aload_3
    //   262: arraylength
    //   263: bipush #10
    //   265: if_icmplt -> 31
    //   268: getstatic burp/Zr8g.ZF : Ljava/lang/Object;
    //   271: checkcast java/math/BigInteger
    //   274: getstatic burp/Zz9p.Zw : Ljava/lang/Object;
    //   277: checkcast java/math/BigInteger
    //   280: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   283: putstatic burp/Zz58.ZD : Ljava/lang/Object;
    //   286: sipush #18873
    //   289: sipush #-24649
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: iconst_1
    //   296: ldc burp/Zkca
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
    //   414: sipush #18875
    //   417: sipush #23646
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
    //   453: ifeq -> 315
    //   456: sipush #18877
    //   459: sipush #-27975
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
    //   598: ifeq -> 615
    //   601: iinc #5, 1
    //   604: iload_2
    //   605: ifeq -> 479
    //   608: goto -> 615
    //   611: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   614: athrow
    //   615: getstatic burp/Zlyf.ZU : Ljava/lang/String;
    //   618: getstatic burp/Zg97.Zc : Ljava/lang/Object;
    //   621: checkcast java/math/BigInteger
    //   624: invokevirtual intValue : ()I
    //   627: bipush #32
    //   629: irem
    //   630: invokestatic abs : (I)I
    //   633: invokevirtual charAt : (I)C
    //   636: getstatic burp/Zl_1.ZH : Ljava/lang/String;
    //   639: getstatic burp/Ztes.ZX : Ljava/lang/Object;
    //   642: checkcast java/math/BigInteger
    //   645: invokevirtual intValue : ()I
    //   648: bipush #32
    //   650: irem
    //   651: invokestatic abs : (I)I
    //   654: invokevirtual charAt : (I)C
    //   657: if_icmpgt -> 772
    //   660: getstatic burp/Zs6g.ZU : Ljava/lang/String;
    //   663: getstatic burp/Zl1u.Zq : Ljava/lang/Object;
    //   666: checkcast java/math/BigInteger
    //   669: invokevirtual intValue : ()I
    //   672: bipush #32
    //   674: irem
    //   675: invokestatic abs : (I)I
    //   678: invokevirtual charAt : (I)C
    //   681: getstatic burp/Zeyt.ZS : Ljava/lang/String;
    //   684: getstatic burp/Zl1u.Zq : Ljava/lang/Object;
    //   687: checkcast java/math/BigInteger
    //   690: invokevirtual intValue : ()I
    //   693: bipush #32
    //   695: irem
    //   696: invokestatic abs : (I)I
    //   699: invokevirtual charAt : (I)C
    //   702: if_icmpgt -> 772
    //   705: goto -> 712
    //   708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   711: athrow
    //   712: getstatic burp/Ze3t.ZG : Ljava/lang/String;
    //   715: getstatic burp/Zlyf.Zm : Ljava/lang/Object;
    //   718: checkcast java/math/BigInteger
    //   721: invokevirtual intValue : ()I
    //   724: bipush #32
    //   726: irem
    //   727: invokestatic abs : (I)I
    //   730: invokevirtual charAt : (I)C
    //   733: getstatic burp/Zre1.ZA : Ljava/lang/String;
    //   736: getstatic burp/Zmjr.ZU : Ljava/lang/Object;
    //   739: checkcast java/math/BigInteger
    //   742: invokevirtual intValue : ()I
    //   745: bipush #32
    //   747: irem
    //   748: invokestatic abs : (I)I
    //   751: invokevirtual charAt : (I)C
    //   754: if_icmpgt -> 772
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
  
  static void Zo(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ºî9êcªL¬qðJ5,Db4PÌ$år:Ã-\\tðì÷Ìg»¢î\\tÔÝð·\\t)¬¨ÿ«fF1MÑMW®:vr ó\\fìa¤LIâ¨°\\tôVyÁ¤CycÒCï/\\bâðÿ)4Ö/à/êåøºÜÔéPw=«¤.¡øSã¶ '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #10
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
    //   68: ldc 'á¡dð"^s½NYm/º(ÝÌ`oT Ï\\tyÎ÷æÝ?'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #57
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
    //   129: putstatic burp/Zz58.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zz58.b : [Ljava/lang/String;
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
    //   212: bipush #54
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #92
    //   224: goto -> 244
    //   227: bipush #103
    //   229: goto -> 244
    //   232: bipush #108
    //   234: goto -> 244
    //   237: bipush #26
    //   239: goto -> 244
    //   242: bipush #106
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #19
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-99
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #84
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #9
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #51
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-35
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #45
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-75
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-5
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-54
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-65
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #30
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-89
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #30
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #125
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-74
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-123
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #112
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #-99
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-67
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #42
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #36
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #82
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #73
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #35
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #114
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #43
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-103
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-76
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #84
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-22
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #115
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zz58.ZD : Ljava/lang/Object;
    //   500: sipush #18874
    //   503: sipush #26820
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zz58.ZT : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x49BA) & 0xFFFF;
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
      char c = 'Í';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz58.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */