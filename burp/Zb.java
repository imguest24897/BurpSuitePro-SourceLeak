package burp;

import java.math.BigInteger;

class Zb extends ClassLoader {
  static Object ZV;
  
  static String Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zi(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zr2i.ZD : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zb.ZV : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zg4d.Zm : Ljava/lang/Object;
    //   22: sipush #14563
    //   25: getstatic burp/Zess.Zj : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zkc8.ZW : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Zgnp.Zm : Ljava/lang/Object;
    //   43: sipush #7843
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: iconst_1
    //   50: ldc burp/Zg27
    //   52: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   55: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   58: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   61: astore_3
    //   62: aload_3
    //   63: arraylength
    //   64: istore #4
    //   66: iconst_0
    //   67: istore #5
    //   69: iload #5
    //   71: iload #4
    //   73: if_icmpge -> 210
    //   76: aload_3
    //   77: iload #5
    //   79: aaload
    //   80: astore #6
    //   82: aload #6
    //   84: invokevirtual getModifiers : ()I
    //   87: invokestatic isStatic : (I)Z
    //   90: ifne -> 100
    //   93: goto -> 203
    //   96: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   99: athrow
    //   100: aload #6
    //   102: invokevirtual getType : ()Ljava/lang/Class;
    //   105: astore #7
    //   107: aload #7
    //   109: ifnull -> 190
    //   112: aload #7
    //   114: invokevirtual isPrimitive : ()Z
    //   117: ifne -> 190
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   126: athrow
    //   127: aload #7
    //   129: invokevirtual getPackage : ()Ljava/lang/Package;
    //   132: ifnull -> 190
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: ifnull -> 190
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: sipush #14572
    //   171: sipush #24744
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   180: ifne -> 190
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   189: athrow
    //   190: aload #6
    //   192: iconst_1
    //   193: invokevirtual setAccessible : (Z)V
    //   196: aload #6
    //   198: aconst_null
    //   199: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   202: pop
    //   203: iinc #5, 1
    //   206: iload_2
    //   207: ifne -> 69
    //   210: sipush #14574
    //   213: sipush #324
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   222: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   225: astore_3
    //   226: aload_3
    //   227: arraylength
    //   228: istore #4
    //   230: iconst_0
    //   231: istore #5
    //   233: iload #5
    //   235: iload #4
    //   237: if_icmpge -> 369
    //   240: aload_3
    //   241: iload #5
    //   243: aaload
    //   244: astore #6
    //   246: aload #6
    //   248: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   251: pop
    //   252: aload #6
    //   254: invokevirtual getModifiers : ()I
    //   257: invokestatic isStatic : (I)Z
    //   260: ifeq -> 355
    //   263: aload #6
    //   265: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   268: arraylength
    //   269: iconst_2
    //   270: if_icmpne -> 355
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   279: athrow
    //   280: aload #6
    //   282: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   285: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   288: invokevirtual equals : (Ljava/lang/Object;)Z
    //   291: ifeq -> 355
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   300: athrow
    //   301: aload #6
    //   303: iconst_1
    //   304: invokevirtual setAccessible : (Z)V
    //   307: aload #6
    //   309: aconst_null
    //   310: iconst_2
    //   311: anewarray java/lang/Object
    //   314: dup
    //   315: iconst_0
    //   316: aload_0
    //   317: aastore
    //   318: dup
    //   319: iconst_1
    //   320: aload_1
    //   321: ifnonnull -> 339
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: athrow
    //   331: aload_1
    //   332: goto -> 346
    //   335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   338: athrow
    //   339: aload_1
    //   340: checkcast [B
    //   343: invokevirtual clone : ()Ljava/lang/Object;
    //   346: aastore
    //   347: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   350: pop
    //   351: iload_2
    //   352: ifne -> 369
    //   355: iinc #5, 1
    //   358: iload_2
    //   359: ifne -> 233
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   368: athrow
    //   369: getstatic burp/Zel.ZB : Ljava/lang/Object;
    //   372: checkcast java/math/BigInteger
    //   375: invokevirtual intValue : ()I
    //   378: i2l
    //   379: invokestatic currentTimeMillis : ()J
    //   382: ladd
    //   383: getstatic burp/Zzmw.ZS : Ljava/lang/Object;
    //   386: checkcast java/math/BigInteger
    //   389: invokevirtual intValue : ()I
    //   392: i2l
    //   393: lcmp
    //   394: ifge -> 726
    //   397: sipush #14562
    //   400: sipush #-21360
    //   403: invokestatic a : (II)Ljava/lang/String;
    //   406: iconst_1
    //   407: ldc burp/Zejj
    //   409: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   412: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   415: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   418: astore_3
    //   419: aload_3
    //   420: arraylength
    //   421: istore #4
    //   423: iconst_0
    //   424: istore #5
    //   426: iload #5
    //   428: iload #4
    //   430: if_icmpge -> 567
    //   433: aload_3
    //   434: iload #5
    //   436: aaload
    //   437: astore #6
    //   439: aload #6
    //   441: invokevirtual getModifiers : ()I
    //   444: invokestatic isStatic : (I)Z
    //   447: ifne -> 457
    //   450: goto -> 560
    //   453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   456: athrow
    //   457: aload #6
    //   459: invokevirtual getType : ()Ljava/lang/Class;
    //   462: astore #7
    //   464: aload #7
    //   466: ifnull -> 547
    //   469: aload #7
    //   471: invokevirtual isPrimitive : ()Z
    //   474: ifne -> 547
    //   477: goto -> 484
    //   480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   483: athrow
    //   484: aload #7
    //   486: invokevirtual getPackage : ()Ljava/lang/Package;
    //   489: ifnull -> 547
    //   492: goto -> 499
    //   495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   498: athrow
    //   499: aload #7
    //   501: invokevirtual getPackage : ()Ljava/lang/Package;
    //   504: invokevirtual getName : ()Ljava/lang/String;
    //   507: ifnull -> 547
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   516: athrow
    //   517: aload #7
    //   519: invokevirtual getPackage : ()Ljava/lang/Package;
    //   522: invokevirtual getName : ()Ljava/lang/String;
    //   525: sipush #14565
    //   528: sipush #25533
    //   531: invokestatic a : (II)Ljava/lang/String;
    //   534: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   537: ifne -> 547
    //   540: goto -> 547
    //   543: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   546: athrow
    //   547: aload #6
    //   549: iconst_1
    //   550: invokevirtual setAccessible : (Z)V
    //   553: aload #6
    //   555: aconst_null
    //   556: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   559: pop
    //   560: iinc #5, 1
    //   563: iload_2
    //   564: ifne -> 426
    //   567: sipush #14566
    //   570: sipush #-7028
    //   573: invokestatic a : (II)Ljava/lang/String;
    //   576: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   579: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   582: astore_3
    //   583: aload_3
    //   584: arraylength
    //   585: istore #4
    //   587: iconst_0
    //   588: istore #5
    //   590: iload #5
    //   592: iload #4
    //   594: if_icmpge -> 726
    //   597: aload_3
    //   598: iload #5
    //   600: aaload
    //   601: astore #6
    //   603: aload #6
    //   605: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   608: pop
    //   609: aload #6
    //   611: invokevirtual getModifiers : ()I
    //   614: invokestatic isStatic : (I)Z
    //   617: ifeq -> 712
    //   620: aload #6
    //   622: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   625: arraylength
    //   626: iconst_2
    //   627: if_icmpne -> 712
    //   630: goto -> 637
    //   633: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   636: athrow
    //   637: aload #6
    //   639: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   642: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   645: invokevirtual equals : (Ljava/lang/Object;)Z
    //   648: ifeq -> 712
    //   651: goto -> 658
    //   654: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   657: athrow
    //   658: aload #6
    //   660: iconst_1
    //   661: invokevirtual setAccessible : (Z)V
    //   664: aload #6
    //   666: aconst_null
    //   667: iconst_2
    //   668: anewarray java/lang/Object
    //   671: dup
    //   672: iconst_0
    //   673: aload_0
    //   674: aastore
    //   675: dup
    //   676: iconst_1
    //   677: aload_1
    //   678: ifnonnull -> 696
    //   681: goto -> 688
    //   684: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   687: athrow
    //   688: aload_1
    //   689: goto -> 703
    //   692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   695: athrow
    //   696: aload_1
    //   697: checkcast [B
    //   700: invokevirtual clone : ()Ljava/lang/Object;
    //   703: aastore
    //   704: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   707: pop
    //   708: iload_2
    //   709: ifne -> 726
    //   712: iinc #5, 1
    //   715: iload_2
    //   716: ifne -> 590
    //   719: goto -> 726
    //   722: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   725: athrow
    //   726: getstatic burp/Zzr5.Zg : Ljava/lang/String;
    //   729: getstatic burp/Zt0t.ZL : Ljava/lang/Object;
    //   732: checkcast java/math/BigInteger
    //   735: invokevirtual intValue : ()I
    //   738: bipush #32
    //   740: irem
    //   741: invokestatic abs : (I)I
    //   744: invokevirtual charAt : (I)C
    //   747: getstatic burp/Zg6f.Zf : Ljava/lang/String;
    //   750: getstatic burp/Zzox.Zq : Ljava/lang/Object;
    //   753: checkcast java/math/BigInteger
    //   756: invokevirtual intValue : ()I
    //   759: bipush #32
    //   761: irem
    //   762: invokestatic abs : (I)I
    //   765: invokevirtual charAt : (I)C
    //   768: if_icmple -> 875
    //   771: getstatic burp/Zrcy.Zq : Ljava/lang/String;
    //   774: getstatic burp/Zzmu.Zy : Ljava/lang/Object;
    //   777: checkcast java/math/BigInteger
    //   780: invokevirtual intValue : ()I
    //   783: bipush #32
    //   785: irem
    //   786: invokestatic abs : (I)I
    //   789: invokevirtual charAt : (I)C
    //   792: getstatic burp/Zl39.ZI : Ljava/lang/String;
    //   795: getstatic burp/Zltz.Zg : Ljava/lang/Object;
    //   798: checkcast java/math/BigInteger
    //   801: invokevirtual intValue : ()I
    //   804: bipush #32
    //   806: irem
    //   807: invokestatic abs : (I)I
    //   810: invokevirtual charAt : (I)C
    //   813: if_icmple -> 875
    //   816: goto -> 823
    //   819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   822: athrow
    //   823: getstatic burp/Zrpu.Zy : Ljava/lang/String;
    //   826: getstatic burp/Zk7f.Za : Ljava/lang/Object;
    //   829: checkcast java/math/BigInteger
    //   832: invokevirtual intValue : ()I
    //   835: bipush #32
    //   837: irem
    //   838: invokestatic abs : (I)I
    //   841: invokevirtual charAt : (I)C
    //   844: getstatic burp/Zlf0.ZS : Ljava/lang/String;
    //   847: getstatic burp/Zzoi.ZI : Ljava/lang/Object;
    //   850: checkcast java/math/BigInteger
    //   853: invokevirtual intValue : ()I
    //   856: bipush #32
    //   858: irem
    //   859: invokestatic abs : (I)I
    //   862: invokevirtual charAt : (I)C
    //   865: if_icmpgt -> 883
    //   868: goto -> 875
    //   871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   874: athrow
    //   875: iconst_1
    //   876: goto -> 884
    //   879: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   882: athrow
    //   883: iconst_0
    //   884: ireturn
    //   885: astore_3
    //   886: new java/lang/Exception
    //   889: dup
    //   890: aload_3
    //   891: invokevirtual getMessage : ()Ljava/lang/String;
    //   894: invokespecial <init> : (Ljava/lang/String;)V
    //   897: athrow
    // Exception table:
    //   from	to	target	type
    //   4	884	885	java/lang/Throwable
    //   82	96	96	java/lang/Throwable
    //   107	120	123	java/lang/Throwable
    //   112	135	138	java/lang/Throwable
    //   127	153	156	java/lang/Throwable
    //   142	183	186	java/lang/Throwable
    //   246	273	276	java/lang/Throwable
    //   263	294	297	java/lang/Throwable
    //   280	324	327	java/lang/Throwable
    //   301	335	335	java/lang/Throwable
    //   346	362	365	java/lang/Throwable
    //   439	453	453	java/lang/Throwable
    //   464	477	480	java/lang/Throwable
    //   469	492	495	java/lang/Throwable
    //   484	510	513	java/lang/Throwable
    //   499	540	543	java/lang/Throwable
    //   603	630	633	java/lang/Throwable
    //   620	651	654	java/lang/Throwable
    //   637	681	684	java/lang/Throwable
    //   658	692	692	java/lang/Throwable
    //   703	719	722	java/lang/Throwable
    //   726	816	819	java/lang/Throwable
    //   771	868	871	java/lang/Throwable
    //   823	879	879	java/lang/Throwable
  }
  
  static void ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZQ(Object paramObject) {
    Ztlz.ZE = a(14564, -5317);
    Ztlz.ZW = new BigInteger(a(14575, 28990));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ze_t.ZZ.charAt(Math.abs(((BigInteger)Ze69.ZH).intValue() % 32)) > Zsf7.ZS.charAt(Math.abs(((BigInteger)Zlhy.ZN).intValue() % 32))) {
          try {
            Zle6.ZE(Class.forName(a(14560, -1471)));
            if (bool)
              Zgzv.Zd(Class.forName(a(14561, -28936))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgzv.Zd(Class.forName(a(14561, -28936)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ý ôBÁeý2\\rÔ> ùÑJô?,£Ö\\t"Ü§ÂÁÎF\Ù%Øý AûêÆEµ,¾#ÿúÅËXÇj]l\¦\\t|·l¯¸c-ê¢\\tÂ »MB?dxR\\tw·W`ÈÔ\\tF[+2PÐ8MÒÒe©ÈnP?"¿¸©¤RÑü¬°¨.¶4{¹·VÅ #ë\©AêÊ ÒéNß.ëA¨C¢±%ù²ö£SÍæÈ²<Y\\tçüÆÖNàO'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '²C§R½b\\táS­¦eMåúz©'ÁQßÐWAÐå^é UR1;2ñ.ª((¡p{Aûgµ\\n©Ë..E¼úq©nðN''
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_2
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zb.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zb.b : [Ljava/lang/String;
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
    //   212: bipush #62
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #90
    //   224: goto -> 244
    //   227: bipush #61
    //   229: goto -> 244
    //   232: bipush #78
    //   234: goto -> 244
    //   237: bipush #55
    //   239: goto -> 244
    //   242: bipush #64
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #14573
    //   307: sipush #561
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zb.ZV : Ljava/lang/Object;
    //   319: sipush #14567
    //   322: sipush #-15650
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zb.Zt : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x38E7) & 0xFFFF;
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
      char c = '¯';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */