package burp;

public class Zz1s {
  public static double Zn(byte paramByte, int paramInt1, int paramInt2) {
    return ZC(paramByte, -1, paramInt1, paramInt2);
  }
  
  public static double ZC(byte paramByte, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: invokestatic Zq : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: iload_2
    //   6: getstatic burp/Zgpg.Zf : [I
    //   9: iconst_0
    //   10: iaload
    //   11: if_icmplt -> 28
    //   14: iload_2
    //   15: getstatic burp/Zgpg.Zf : [I
    //   18: getstatic burp/Zgpg.Zf : [I
    //   21: arraylength
    //   22: iconst_1
    //   23: isub
    //   24: iaload
    //   25: if_icmple -> 37
    //   28: iconst_0
    //   29: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   32: iload_2
    //   33: i2l
    //   34: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   37: getstatic burp/Zgpg.Zf : [I
    //   40: arraylength
    //   41: iconst_1
    //   42: isub
    //   43: istore #5
    //   45: iload #5
    //   47: ifle -> 78
    //   50: iload_2
    //   51: getstatic burp/Zgpg.Zf : [I
    //   54: iload #5
    //   56: iaload
    //   57: if_icmplt -> 63
    //   60: goto -> 78
    //   63: iinc #5, -1
    //   66: aload #4
    //   68: ifnull -> 45
    //   71: iconst_2
    //   72: anewarray burp/Zbqc
    //   75: invokestatic Zr : ([Lburp/Zbqc;)V
    //   78: iload_2
    //   79: getstatic burp/Zgpg.Zf : [I
    //   82: iload #5
    //   84: iaload
    //   85: if_icmpne -> 97
    //   88: iload #5
    //   90: istore #6
    //   92: aload #4
    //   94: ifnull -> 103
    //   97: iload #5
    //   99: iconst_1
    //   100: iadd
    //   101: istore #6
    //   103: iload_3
    //   104: getstatic burp/Zgpg.Zf : [I
    //   107: iload #5
    //   109: iaload
    //   110: imul
    //   111: iload_2
    //   112: idiv
    //   113: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   116: astore #7
    //   118: iload_3
    //   119: getstatic burp/Zgpg.Zf : [I
    //   122: iload #6
    //   124: iaload
    //   125: imul
    //   126: iload_2
    //   127: idiv
    //   128: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   131: astore #8
    //   133: iload_0
    //   134: lookupswitch default -> 425, 2 -> 176, 11 -> 176, 13 -> 258, 14 -> 343
    //   176: iload #5
    //   178: iload #6
    //   180: if_icmpne -> 219
    //   183: iload #5
    //   185: invokestatic Zy : (I)Ljava/util/Map;
    //   188: iload_3
    //   189: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   192: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   197: checkcast java/lang/Double
    //   200: astore #11
    //   202: aload #11
    //   204: ifnonnull -> 213
    //   207: ldc2_w 1.0E-6
    //   210: goto -> 218
    //   213: aload #11
    //   215: invokevirtual doubleValue : ()D
    //   218: dreturn
    //   219: iload #5
    //   221: invokestatic Zy : (I)Ljava/util/Map;
    //   224: aload #7
    //   226: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   231: checkcast java/lang/Double
    //   234: astore #9
    //   236: iload #6
    //   238: invokestatic Zy : (I)Ljava/util/Map;
    //   241: aload #8
    //   243: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   248: checkcast java/lang/Double
    //   251: astore #10
    //   253: aload #4
    //   255: ifnull -> 436
    //   258: iload #5
    //   260: iload #6
    //   262: if_icmpne -> 302
    //   265: iload_1
    //   266: iload #5
    //   268: invokestatic ZV : (II)Ljava/util/Map;
    //   271: iload_3
    //   272: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   275: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   280: checkcast java/lang/Double
    //   283: astore #11
    //   285: aload #11
    //   287: ifnonnull -> 296
    //   290: ldc2_w 1.0E-6
    //   293: goto -> 301
    //   296: aload #11
    //   298: invokevirtual doubleValue : ()D
    //   301: dreturn
    //   302: iload_1
    //   303: iload #5
    //   305: invokestatic ZV : (II)Ljava/util/Map;
    //   308: aload #7
    //   310: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   315: checkcast java/lang/Double
    //   318: astore #9
    //   320: iload_1
    //   321: iload #6
    //   323: invokestatic ZV : (II)Ljava/util/Map;
    //   326: aload #8
    //   328: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   333: checkcast java/lang/Double
    //   336: astore #10
    //   338: aload #4
    //   340: ifnull -> 436
    //   343: iload #5
    //   345: iload #6
    //   347: if_icmpne -> 386
    //   350: iload #5
    //   352: invokestatic ZD : (I)Ljava/util/Map;
    //   355: iload_3
    //   356: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   359: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   364: checkcast java/lang/Double
    //   367: astore #11
    //   369: aload #11
    //   371: ifnonnull -> 380
    //   374: ldc2_w 1.0E-6
    //   377: goto -> 385
    //   380: aload #11
    //   382: invokevirtual doubleValue : ()D
    //   385: dreturn
    //   386: iload #5
    //   388: invokestatic ZD : (I)Ljava/util/Map;
    //   391: aload #7
    //   393: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   398: checkcast java/lang/Double
    //   401: astore #9
    //   403: iload #6
    //   405: invokestatic ZD : (I)Ljava/util/Map;
    //   408: aload #8
    //   410: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   415: checkcast java/lang/Double
    //   418: astore #10
    //   420: aload #4
    //   422: ifnull -> 436
    //   425: iconst_0
    //   426: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   429: iload_0
    //   430: i2l
    //   431: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   434: dconst_0
    //   435: dreturn
    //   436: aload #9
    //   438: ifnonnull -> 447
    //   441: ldc2_w 1.0E-6
    //   444: goto -> 452
    //   447: aload #9
    //   449: invokevirtual doubleValue : ()D
    //   452: dstore #11
    //   454: aload #10
    //   456: ifnonnull -> 465
    //   459: ldc2_w 1.0E-6
    //   462: goto -> 470
    //   465: aload #10
    //   467: invokevirtual doubleValue : ()D
    //   470: dstore #13
    //   472: getstatic burp/Zgpg.Zf : [I
    //   475: iload #6
    //   477: iaload
    //   478: getstatic burp/Zgpg.Zf : [I
    //   481: iload #5
    //   483: iaload
    //   484: isub
    //   485: istore #15
    //   487: dload #11
    //   489: iload_2
    //   490: getstatic burp/Zgpg.Zf : [I
    //   493: iload #5
    //   495: iaload
    //   496: isub
    //   497: i2d
    //   498: dload #13
    //   500: dload #11
    //   502: dsub
    //   503: dmul
    //   504: iload #15
    //   506: i2d
    //   507: ddiv
    //   508: dadd
    //   509: dreturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz1s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */