package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zr20 extends Zr9a {
  private final StringBuilder ZN;
  
  private final Zefg<Zxtl> Zt;
  
  private boolean Zh = true;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zr20(StringBuilder paramStringBuilder, Zefg<Zxtl> paramZefg) {
    this.ZN = paramStringBuilder;
    this.Zt = paramZefg;
  }
  
  abstract boolean Zw(Zgkc paramZgkc, int paramInt);
  
  abstract int ZA(Zgkc paramZgkc);
  
  public Zte7 ZJ(Zkcp paramZkcp) {
    String[] arrayOfString = Zgky.Zm();
    byte[] arrayOfByte = paramZkcp.Zub().Zsf().ZiD();
    if (Zw(paramZkcp, 16)) {
      ZQ(a(-6423, 4575), a(-6419, -2613));
      Zrlp.Zn(this.ZN, Zmey.Zn(arrayOfByte));
      this.ZN.append(a(-6420, -4789));
      this.ZN.append(Zg2x.Zt(this.Zt, true, false));
      this.ZN.append(a(-6415, -6342));
      if (arrayOfString == null) {
        Zuh.Zv(false, Zqf.Zk, ZA(paramZkcp));
        return Zte7.CONTINUE;
      } 
      return Zte7.CONTINUE;
    } 
    Zuh.Zv(false, Zqf.Zk, ZA(paramZkcp));
    return Zte7.CONTINUE;
  }
  
  public Zte7 Zz(Zrp9 paramZrp9) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zub : ()Lburp/Zll7;
    //   6: invokeinterface Zsf : ()Lburp/Zstu;
    //   11: invokeinterface ZiD : ()[B
    //   16: astore_3
    //   17: invokestatic Zm : ()[Ljava/lang/String;
    //   20: aload_0
    //   21: sipush #-6418
    //   24: sipush #-30753
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: sipush #-6413
    //   33: sipush #14521
    //   36: invokestatic a : (II)Ljava/lang/String;
    //   39: invokevirtual ZQ : (Ljava/lang/String;Ljava/lang/String;)V
    //   42: astore_2
    //   43: aload_0
    //   44: aload_1
    //   45: bipush #16
    //   47: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   50: ifeq -> 119
    //   53: aload_0
    //   54: getfield ZN : Ljava/lang/StringBuilder;
    //   57: aload_3
    //   58: invokestatic Zn : ([B)Ljava/lang/String;
    //   61: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   64: aload_0
    //   65: getfield ZN : Ljava/lang/StringBuilder;
    //   68: sipush #-6417
    //   71: sipush #-9057
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload_0
    //   82: getfield ZN : Ljava/lang/StringBuilder;
    //   85: aload_0
    //   86: getfield Zt : Lburp/Zefg;
    //   89: iconst_1
    //   90: iconst_0
    //   91: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload_0
    //   99: getfield ZN : Ljava/lang/StringBuilder;
    //   102: sipush #-6407
    //   105: sipush #6256
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: aload_2
    //   116: ifnonnull -> 440
    //   119: aload_0
    //   120: aload_1
    //   121: sipush #512
    //   124: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   127: ifeq -> 196
    //   130: aload_0
    //   131: getfield ZN : Ljava/lang/StringBuilder;
    //   134: aload_3
    //   135: invokestatic Zn : ([B)Ljava/lang/String;
    //   138: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   141: aload_0
    //   142: getfield ZN : Ljava/lang/StringBuilder;
    //   145: sipush #-6417
    //   148: sipush #-9057
    //   151: invokestatic a : (II)Ljava/lang/String;
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload_0
    //   159: getfield ZN : Ljava/lang/StringBuilder;
    //   162: aload_0
    //   163: getfield Zt : Lburp/Zefg;
    //   166: iconst_1
    //   167: iconst_0
    //   168: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload_0
    //   176: getfield ZN : Ljava/lang/StringBuilder;
    //   179: sipush #-6424
    //   182: sipush #30830
    //   185: invokestatic a : (II)Ljava/lang/String;
    //   188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload_2
    //   193: ifnonnull -> 440
    //   196: aload_0
    //   197: aload_1
    //   198: sipush #1024
    //   201: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   204: ifeq -> 273
    //   207: aload_0
    //   208: getfield ZN : Ljava/lang/StringBuilder;
    //   211: aload_3
    //   212: invokestatic Zn : ([B)Ljava/lang/String;
    //   215: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   218: aload_0
    //   219: getfield ZN : Ljava/lang/StringBuilder;
    //   222: sipush #-6417
    //   225: sipush #-9057
    //   228: invokestatic a : (II)Ljava/lang/String;
    //   231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: pop
    //   235: aload_0
    //   236: getfield ZN : Ljava/lang/StringBuilder;
    //   239: aload_0
    //   240: getfield Zt : Lburp/Zefg;
    //   243: iconst_1
    //   244: iconst_0
    //   245: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: pop
    //   252: aload_0
    //   253: getfield ZN : Ljava/lang/StringBuilder;
    //   256: sipush #-6408
    //   259: sipush #28715
    //   262: invokestatic a : (II)Ljava/lang/String;
    //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: pop
    //   269: aload_2
    //   270: ifnonnull -> 440
    //   273: aload_0
    //   274: aload_1
    //   275: sipush #2048
    //   278: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   281: ifeq -> 350
    //   284: aload_0
    //   285: getfield ZN : Ljava/lang/StringBuilder;
    //   288: aload_3
    //   289: invokestatic Zn : ([B)Ljava/lang/String;
    //   292: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   295: aload_0
    //   296: getfield ZN : Ljava/lang/StringBuilder;
    //   299: sipush #-6417
    //   302: sipush #-9057
    //   305: invokestatic a : (II)Ljava/lang/String;
    //   308: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: pop
    //   312: aload_0
    //   313: getfield ZN : Ljava/lang/StringBuilder;
    //   316: aload_0
    //   317: getfield Zt : Lburp/Zefg;
    //   320: iconst_1
    //   321: iconst_0
    //   322: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload_0
    //   330: getfield ZN : Ljava/lang/StringBuilder;
    //   333: sipush #-6462
    //   336: sipush #29488
    //   339: invokestatic a : (II)Ljava/lang/String;
    //   342: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: pop
    //   346: aload_2
    //   347: ifnonnull -> 440
    //   350: aload_0
    //   351: aload_1
    //   352: sipush #4096
    //   355: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   358: ifeq -> 427
    //   361: aload_0
    //   362: getfield ZN : Ljava/lang/StringBuilder;
    //   365: aload_3
    //   366: invokestatic Zn : ([B)Ljava/lang/String;
    //   369: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   372: aload_0
    //   373: getfield ZN : Ljava/lang/StringBuilder;
    //   376: sipush #-6417
    //   379: sipush #-9057
    //   382: invokestatic a : (II)Ljava/lang/String;
    //   385: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: pop
    //   389: aload_0
    //   390: getfield ZN : Ljava/lang/StringBuilder;
    //   393: aload_0
    //   394: getfield Zt : Lburp/Zefg;
    //   397: iconst_1
    //   398: iconst_0
    //   399: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   402: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   405: pop
    //   406: aload_0
    //   407: getfield ZN : Ljava/lang/StringBuilder;
    //   410: sipush #-6429
    //   413: sipush #-6265
    //   416: invokestatic a : (II)Ljava/lang/String;
    //   419: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: pop
    //   423: aload_2
    //   424: ifnonnull -> 440
    //   427: iconst_0
    //   428: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   431: aload_0
    //   432: aload_1
    //   433: invokevirtual ZA : (Lburp/Zgkc;)I
    //   436: i2l
    //   437: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   440: getstatic burp/Zte7.CONTINUE : Lburp/Zte7;
    //   443: areturn
  }
  
  public Zte7 ZS(Zg3y paramZg3y) {
    // Byte code:
    //   0: invokestatic Zm : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface Zub : ()Lburp/Zll7;
    //   10: invokeinterface Zsf : ()Lburp/Zstu;
    //   15: invokeinterface ZiD : ()[B
    //   20: astore_3
    //   21: aload_1
    //   22: invokeinterface ZXh : ()Lburp/Zll7;
    //   27: getstatic burp/Zgid.ZO : Lburp/Zll7;
    //   30: invokeinterface ZF : (Ljava/lang/Object;)Z
    //   35: ifeq -> 44
    //   38: iconst_0
    //   39: newarray byte
    //   41: goto -> 60
    //   44: aload_1
    //   45: invokeinterface ZXh : ()Lburp/Zll7;
    //   50: invokeinterface Zsf : ()Lburp/Zstu;
    //   55: invokeinterface ZiD : ()[B
    //   60: astore #4
    //   62: aload_0
    //   63: aload_1
    //   64: bipush #32
    //   66: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   69: ifeq -> 132
    //   72: aload_0
    //   73: sipush #-6426
    //   76: sipush #13887
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: sipush #-6416
    //   85: sipush #-20886
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: invokevirtual ZQ : (Ljava/lang/String;Ljava/lang/String;)V
    //   94: aload_0
    //   95: getfield ZN : Ljava/lang/StringBuilder;
    //   98: aload_0
    //   99: getfield Zt : Lburp/Zefg;
    //   102: iconst_1
    //   103: iconst_0
    //   104: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: aload_0
    //   112: getfield ZN : Ljava/lang/StringBuilder;
    //   115: sipush #-6405
    //   118: sipush #12644
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload_2
    //   129: ifnonnull -> 471
    //   132: aload_0
    //   133: aload_1
    //   134: bipush #64
    //   136: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   139: ifeq -> 202
    //   142: aload_0
    //   143: sipush #-6431
    //   146: sipush #-6616
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: sipush #-6461
    //   155: sipush #-27664
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: invokevirtual ZQ : (Ljava/lang/String;Ljava/lang/String;)V
    //   164: aload_0
    //   165: getfield ZN : Ljava/lang/StringBuilder;
    //   168: aload_0
    //   169: getfield Zt : Lburp/Zefg;
    //   172: iconst_1
    //   173: iconst_0
    //   174: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: aload_0
    //   182: getfield ZN : Ljava/lang/StringBuilder;
    //   185: sipush #-6403
    //   188: sipush #-390
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload_2
    //   199: ifnonnull -> 471
    //   202: aload_0
    //   203: aload_1
    //   204: sipush #128
    //   207: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   210: ifeq -> 330
    //   213: aload_0
    //   214: sipush #-6425
    //   217: sipush #26298
    //   220: invokestatic a : (II)Ljava/lang/String;
    //   223: sipush #-6421
    //   226: sipush #-4754
    //   229: invokestatic a : (II)Ljava/lang/String;
    //   232: invokevirtual ZQ : (Ljava/lang/String;Ljava/lang/String;)V
    //   235: aload_0
    //   236: getfield ZN : Ljava/lang/StringBuilder;
    //   239: aload_3
    //   240: invokestatic Zn : ([B)Ljava/lang/String;
    //   243: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   246: aload_0
    //   247: getfield ZN : Ljava/lang/StringBuilder;
    //   250: sipush #-6432
    //   253: sipush #-30061
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: pop
    //   263: aload_0
    //   264: getfield ZN : Ljava/lang/StringBuilder;
    //   267: aload #4
    //   269: invokestatic Zn : ([B)Ljava/lang/String;
    //   272: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   275: aload_0
    //   276: getfield ZN : Ljava/lang/StringBuilder;
    //   279: sipush #-6404
    //   282: sipush #-10282
    //   285: invokestatic a : (II)Ljava/lang/String;
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload_0
    //   293: getfield ZN : Ljava/lang/StringBuilder;
    //   296: aload_0
    //   297: getfield Zt : Lburp/Zefg;
    //   300: iconst_1
    //   301: iconst_0
    //   302: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   305: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: pop
    //   309: aload_0
    //   310: getfield ZN : Ljava/lang/StringBuilder;
    //   313: sipush #-6428
    //   316: sipush #30684
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: pop
    //   326: aload_2
    //   327: ifnonnull -> 471
    //   330: aload_0
    //   331: aload_1
    //   332: sipush #256
    //   335: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   338: ifeq -> 458
    //   341: aload_0
    //   342: sipush #-6410
    //   345: sipush #5059
    //   348: invokestatic a : (II)Ljava/lang/String;
    //   351: sipush #-6427
    //   354: sipush #8535
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: invokevirtual ZQ : (Ljava/lang/String;Ljava/lang/String;)V
    //   363: aload_0
    //   364: getfield ZN : Ljava/lang/StringBuilder;
    //   367: aload_3
    //   368: invokestatic Zn : ([B)Ljava/lang/String;
    //   371: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   374: aload_0
    //   375: getfield ZN : Ljava/lang/StringBuilder;
    //   378: sipush #-6411
    //   381: sipush #29540
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: pop
    //   391: aload_0
    //   392: getfield ZN : Ljava/lang/StringBuilder;
    //   395: aload #4
    //   397: invokestatic Zn : ([B)Ljava/lang/String;
    //   400: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   403: aload_0
    //   404: getfield ZN : Ljava/lang/StringBuilder;
    //   407: sipush #-6414
    //   410: sipush #22527
    //   413: invokestatic a : (II)Ljava/lang/String;
    //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: pop
    //   420: aload_0
    //   421: getfield ZN : Ljava/lang/StringBuilder;
    //   424: aload_0
    //   425: getfield Zt : Lburp/Zefg;
    //   428: iconst_1
    //   429: iconst_0
    //   430: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   433: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: pop
    //   437: aload_0
    //   438: getfield ZN : Ljava/lang/StringBuilder;
    //   441: sipush #-6422
    //   444: sipush #17338
    //   447: invokestatic a : (II)Ljava/lang/String;
    //   450: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: pop
    //   454: aload_2
    //   455: ifnonnull -> 471
    //   458: iconst_0
    //   459: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   462: aload_0
    //   463: aload_1
    //   464: invokevirtual ZA : (Lburp/Zgkc;)I
    //   467: i2l
    //   468: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   471: getstatic burp/Zte7.CONTINUE : Lburp/Zte7;
    //   474: areturn
  }
  
  public Zte7 Zc(Zze_ paramZze_) {
    ZQ(a(-6418, -30753), a(-6413, 14521));
    Zrlp.Zn(this.ZN, Zmey.Zn(paramZze_.Zub().Zsf().ZiD()));
    this.ZN.append(a(-6417, -9057));
    this.ZN.append(Zg2x.Zt(this.Zt, true, false));
    this.ZN.append(a(-6412, 14902));
    Zmey.Zz(this.ZN, paramZze_.ZKo(), paramZze_.ZKk(), a(-6406, -11957));
    return Zte7.CONTINUE;
  }
  
  public Zte7 Zf(Zzq1 paramZzq1) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zub : ()Lburp/Zll7;
    //   6: invokeinterface Zsf : ()Lburp/Zstu;
    //   11: invokeinterface ZiD : ()[B
    //   16: astore_3
    //   17: invokestatic Zm : ()[Ljava/lang/String;
    //   20: aload_0
    //   21: sipush #-6418
    //   24: sipush #-30753
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: sipush #-6413
    //   33: sipush #14521
    //   36: invokestatic a : (II)Ljava/lang/String;
    //   39: invokevirtual ZQ : (Ljava/lang/String;Ljava/lang/String;)V
    //   42: astore_2
    //   43: aload_0
    //   44: aload_1
    //   45: sipush #512
    //   48: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   51: ifeq -> 120
    //   54: aload_0
    //   55: getfield ZN : Ljava/lang/StringBuilder;
    //   58: aload_3
    //   59: invokestatic Zn : ([B)Ljava/lang/String;
    //   62: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   65: aload_0
    //   66: getfield ZN : Ljava/lang/StringBuilder;
    //   69: sipush #-6417
    //   72: sipush #-9057
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_0
    //   83: getfield ZN : Ljava/lang/StringBuilder;
    //   86: aload_0
    //   87: getfield Zt : Lburp/Zefg;
    //   90: iconst_1
    //   91: iconst_0
    //   92: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload_0
    //   100: getfield ZN : Ljava/lang/StringBuilder;
    //   103: sipush #-6402
    //   106: sipush #-27268
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_2
    //   117: ifnonnull -> 364
    //   120: aload_0
    //   121: aload_1
    //   122: sipush #1024
    //   125: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   128: ifeq -> 197
    //   131: aload_0
    //   132: getfield ZN : Ljava/lang/StringBuilder;
    //   135: aload_3
    //   136: invokestatic Zn : ([B)Ljava/lang/String;
    //   139: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   142: aload_0
    //   143: getfield ZN : Ljava/lang/StringBuilder;
    //   146: sipush #-6417
    //   149: sipush #-9057
    //   152: invokestatic a : (II)Ljava/lang/String;
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload_0
    //   160: getfield ZN : Ljava/lang/StringBuilder;
    //   163: aload_0
    //   164: getfield Zt : Lburp/Zefg;
    //   167: iconst_1
    //   168: iconst_0
    //   169: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: aload_0
    //   177: getfield ZN : Ljava/lang/StringBuilder;
    //   180: sipush #-6409
    //   183: sipush #6785
    //   186: invokestatic a : (II)Ljava/lang/String;
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: aload_2
    //   194: ifnonnull -> 364
    //   197: aload_0
    //   198: aload_1
    //   199: sipush #2048
    //   202: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   205: ifeq -> 274
    //   208: aload_0
    //   209: getfield ZN : Ljava/lang/StringBuilder;
    //   212: aload_3
    //   213: invokestatic Zn : ([B)Ljava/lang/String;
    //   216: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   219: aload_0
    //   220: getfield ZN : Ljava/lang/StringBuilder;
    //   223: sipush #-6417
    //   226: sipush #-9057
    //   229: invokestatic a : (II)Ljava/lang/String;
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: aload_0
    //   237: getfield ZN : Ljava/lang/StringBuilder;
    //   240: aload_0
    //   241: getfield Zt : Lburp/Zefg;
    //   244: iconst_1
    //   245: iconst_0
    //   246: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: aload_0
    //   254: getfield ZN : Ljava/lang/StringBuilder;
    //   257: sipush #-6430
    //   260: sipush #-20455
    //   263: invokestatic a : (II)Ljava/lang/String;
    //   266: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: pop
    //   270: aload_2
    //   271: ifnonnull -> 364
    //   274: aload_0
    //   275: aload_1
    //   276: sipush #4096
    //   279: invokevirtual Zw : (Lburp/Zgkc;I)Z
    //   282: ifeq -> 351
    //   285: aload_0
    //   286: getfield ZN : Ljava/lang/StringBuilder;
    //   289: aload_3
    //   290: invokestatic Zn : ([B)Ljava/lang/String;
    //   293: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   296: aload_0
    //   297: getfield ZN : Ljava/lang/StringBuilder;
    //   300: sipush #-6417
    //   303: sipush #-9057
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: pop
    //   313: aload_0
    //   314: getfield ZN : Ljava/lang/StringBuilder;
    //   317: aload_0
    //   318: getfield Zt : Lburp/Zefg;
    //   321: iconst_1
    //   322: iconst_0
    //   323: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   326: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: pop
    //   330: aload_0
    //   331: getfield ZN : Ljava/lang/StringBuilder;
    //   334: sipush #-6401
    //   337: sipush #22248
    //   340: invokestatic a : (II)Ljava/lang/String;
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: pop
    //   347: aload_2
    //   348: ifnonnull -> 364
    //   351: iconst_0
    //   352: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   355: aload_0
    //   356: aload_1
    //   357: invokevirtual ZA : (Lburp/Zgkc;)I
    //   360: i2l
    //   361: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   364: getstatic burp/Zte7.CONTINUE : Lburp/Zte7;
    //   367: areturn
  }
  
  public Zte7 ZO(Zrkg paramZrkg) {
    ZQ("", "");
    Zzmy.ZO(this.ZN);
    return Zte7.CONTINUE;
  }
  
  private void ZQ(String paramString1, String paramString2) {
    String str = this.Zh ? paramString1 : paramString2;
    this.ZN.append(str);
    this.Zh = false;
  }
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÏÑâþ¡ü8ôá`ôËÐ\\f>³T½úÜJdÀ+ÀN7\\rvµ¸º\NÖK¬\\n?½X-eçRÇr¡ax>4]ËOÌÕì£¬à·i©B½|Áê%ûÆiú/ï=éBh×0hY?Fµ¦pÏ\\r¸´'·i¤¬°nY¯@û\W÷ ß|A3»xºýÁ=x0nÙÓdÍQø(µ!¦#o=éÎzao7Éèõ>O.ÑiµÑÖµ8g¡Á¯ÀÃÚÛ¼Bê©e #b'k4ÃüAÈfâÝe©ú Æ´·1ÖçvÖ[¹¥"«vej_O¼/®-ÊiÝÞÔ5«äµ6õúµp[-Ìyo7Z|«)p¶`áHIVFN¬2°W\\f?½æ]ÞÏ²¡¤ÚT%#½<@gDÅ]móMÅÚÅÍ]f2eÜrÖÛ§óÇz @ë\\réÊÒZJB¾Q_ {Íâíiþq¯×ÐòEIÁ#=Â×þQÀ1&ó>÷z¨úðï±u3.iËàÏÝQÅ¯í#u÷è.1&ò(eçÕbÒ0ä¯­½dò\\fÉ¤mSÌÊJ>9$i©ºKKr?îoèBf6X1Ãÿz©JfkÅÊpYk_kà$8·yê4&éñ_a|R½«nw&B;à»æÐÝÕÎfÒféúK¯í°eG\PÆƋymÒwtÛýaWú"G_;91d"ZtV^jÇ4óyªï>¿,4ï¢0ÊÎxÍZÆ ðjK¥}¨¢x}¬[¼Wöø¨Ðg·tµø'ÜN±ÙÚáUZSw^Íóª¤»æÞ^H¥>ÅTDwTçLt\\fÿ¡ça³(Jºåæ·uë»'>­ÑOE£§ÉZnÅîU@xÔAR+p¿íª<ÓÒåg.³©QümÞÝ\\t³%ø¥ýVº[x7«`Qß;Hå.OÊ©ÀC=«M7`8ÔGo/wL°yoWCz»(½Òg~Ì×Á%ìHÛÖ:/YfÜÎe5¹Éæ®ÁQÐËÁ 6Ùµ¥ZUë.«ãú°¥GßÂÀ"|¬ôIk!¬±öøÏcîÿG\"W²Z¿o!§­K:WÀ©·71æÆls¡l­ìÑM\\rýÈòâ é1!ýGcX[ßÉÜÒEÕl&4°ñ#`'jwnn`YGX²T5VZÈIÜÙæ×-V¯%+ã\\b··Ⱥ~ý¬k»Xÿ^Yã{XÈÙOxÈÛoez±ÿ«ôJ"p¯Í>r2·\\f>`$ÚÖ£\\t¢EB¼TçL% PÔÞvgÔ~|À2 ªÞ²U¦kèYg-¶k8®aFBÿ9²ËC´P»ò)¯  O\\bMIîúxöá\\rÀÿQéÐB_\\b¨±bÖyÆÌµÞÚ¥°XÃÄóQ\\tU®H¡9TÝÓ~LèáH­0¢x0N+3:Æ ¡OÆû³MÓü3J³êU«\\rif*uwÌ3¼ßèÅpra7dhþ^2ìVmjpîì§Ð?bSÊ7¨ü¸{¾J§ÏõMS¨è gÖKTÎ\\bÙu¸á÷;äYL»åÓà4^Ãs>Å+Ç/÷XP\¨3Eat&UkÐ{áµßÃì×üÇ\\r§ÍÝ¬üÔïHõ\\r0 äöOµûñ=R)ÏÚ"8kñJÍFÉ8ÊqW{¿cH.®C,°ÅãæF´ñXQ§RZÚ<Ù^7ïÆåcÄÂ7õ.KÕ6MÄ)@#qÌÿ¯Õ5RG±<ëôãrò÷2Û4¨_Ä§Úbã6 ¤Øaí÷Þ0ÖÃÍ\\nÅÐ^î(4ôrS¦Ï³ÉÉ¶Ú\\f]òèñÒ4ÿfO-<<Þ%5ÍëB°³­­ÖijÄ÷^ÌÅ-ñQ±àÚ·>°e+Xe'¬¶¿u§ð¡+GQåI`Üq/ÓÚ*$µù4*ªíò;6¬pĤ;XUtr ³7zl]ÛAHïTþ®íFLÿø²óC´|èiP%OÐëEY¼]²xÙàv,×vr= ñ"iuî°Â>Èa\¶ÅÓ+ÅlCÅÍQlYd%pÒýNü«F´ïÅVNAKª¡vÖQþÁÇH)RÒ#}ýL9Íô¬-%·õ\\tç¤¯TÝ!Ó²¶?üÔméküS¯àÎÚò®mP&Ì*I¹+·\wëÈ[«¨NB[Ã83ªÕ¹9ð$·4Ç¼$0P¥oãÏ_Zch»ËÁõ©J/0ªôGõÚü®$³¤LÊh-®\\fëýYüø¯Ý£Vîù4àfWÿ~r=|"äíªËîï­ð`à\×0VpsÓ-¯§+èdÕØ}zV¨rk#Àâ¡oAjQ$íå`Å([g{b±¶OÄD1\\f@?"&ST.©ªõ¤Íö Ûc§Ë$Ù:0xVp:sge¢ ^ï\\t8. ç;¨ t¢Vñ/¯zßÝGÚ·º)(\\b{×| avÑW?ø&ú@+\\fÆÑoåÞjÞ.b0ì`¬\ê{ O§MþF<º_;\\buEÇ¨@¶{´Ö¹®²¹W´ÕÓ+ÄõwÝlê$¼*ÀÈ2Ë²YNÙLËq®Jgl°Ã®J¿¿²["£ë7ÝS¨¥þ\{­âiÞÈïxÛQÞqÓëõ3ïÜ¸3|]i®ÒöÛY#ÿl8µÈÆºÝEÍmÊUá%%*§øúL yy7±8KÊ ýÃN1¹¡±7V¡¾2Ü§Bú5p½eå_õF hFúÐpÝÙ¡*rWjl ^~THN¼,E äR¸£p!4[B\\rWÏúøÅã±ñµºO\EøÄ¹¸£ý{ "ÌéèíèµÑúUÀÕÀå±°¼Á8G$ CÁ_ÙÊ5(ëéhÀÑüª9F1ê$üX²cI\\bíÆb4Rç\%åòNsZ½öÊ.8µó¯N¸©gãóà·öO­Ë`ÌÔ±V²ôUáA©q½y\\f\\tàìu^NþÕ<ñÈ¸]ýnÆõªÙ³ÛHõx¾ß+ùØíÐ>òÂå~¾=<Ø\\tÙszÃüU QZGæn{ÌFÎêúþ×ü-Y§óNXFÑâQnj<öáÜî&-¶¸kËI®M]³æ´&sK±M¢r´¥49t½?-H\\fádhKlÉ^^U¸ÿë)Þ`3/|Ĉz\\\nòåðö~`¬Ñ`¥57læf ¾ÜU~®õXÙfÄ7o&djÉÁ±ÏYsfvqR¦û¤[\\r\\fÒQ³N÷õÑ·ÇKT[o ã¯_R7¨ù#_Eq`!öw"Ü§âå^¹IfÛi¥ò[½D,«ÏüYigÂâaÏV%Î@Ûä¾5{ñÃÁ\\tõÇk)aITB]¤³XöÞ85éÂÆ}Éµë³o *láÑb5Z²WZ§$ùãXúã¬ÇèôöÖ½_e¥°s×)\\fVy`¬YX~Þ}Ü\\bJÅÊ¼¾Mká+ØY/qô§RÇ´vtú2ò9\\t-©Ê'\¨Ò~ó³ZDØy,^È'\\f]*mÍ(Õ ¬"å.­-G¥|¡PørÏ/ªESÆ<ãÿa,øÂ~(;8g:Ûó#[°ÒïV°C=m#gv§ÜZ·ñÕ2ÞÓ6f%ëv9SqU¡ÇFÃD{h>ÖLgSh¿ß<Q£:qü\\bó{åT¹nëe5çOjvNgyÝ>Ë Ô=õ×Ù0³%¡bÀÁ¢ª§Á\\nZægîAÉ·?ýxÜ¦çðØÉ±õ{|h)W.I%bØéÝI¿À]íØ­QÕâVS«ÚêbÞÛ;§( à0} ".1ó.»JÄÒôgÈÜ"}APæ)\\b-Æ6jÍ=¢Q"ï7^/ÒkåWýì_mÊáA=AÕKÊ.Æµ^µo´ÅYj%0êJLuAn%ÕeÐ¢Íy#szÍ]-Þv¡Q³îÃ8ªý´íOâ\\të^îâåâÕ2ÑEò2¢O¶.°xk[cÞkG3øF"ĤVðµÆ%0¨ÇX(8Âñ?ÕÐK-èï\\bÝ\\f"æ ¨ä(³HE÷ÞòÂU×±!ÂAq Ýzíi ÃË=9ªPB`)ËÉØ÷ý[V¾¹>nó»cò@!~"è¶\\nÈÃÑ[Øô?uÿÞû²hã\\rÐB\\f@¢~ÍüvyÊª\\n5å·U{®ý¼|wºò´Ù$¹\\täc§à÷ü¬äZ-Yqü5¶åm¯¡=¯ðGÈ@QCÛøD!3wÒ\\t÷§Y aFëbõoi+éâz:>5óÍL.N~¯Í'%ºE#®o<*ì/¹Áà\ßðZ-oæ <K´ýMQÛüe¾¨;Dá½³u¾çz'èÄÜ4±ê°8Rîße=ocÿ`üm½¢±etl$Î¸Ò8·$QXÜ,øZ;ðb" ¥_ÛoÆÓÂ¯E ÏM±×Rµ!× Äü1~'ÃcnÙäîIÉ×özASeÿé#=W£;YeÕiIv,Z·¼\B¶\\b%ÌRXÂ!Èéjf×}°ì«Fç;Ùod+m·§óRÅ§×Ý/n½-þJ8#âÔóèÇ:8M½dM×DíkþÉ3GE¶+:^UòÈHCa õþ=½ÿY i×êë«Ø{#Ó%|èVbç2*UDu©«'ćüÚø³UftgÐò>W¢>?­Ã`<ïádçzóNOr3/8L»°©]ñÎ SA¶Î*ïçÜÓI/EÍÊ©×ë -ÄKå£­EA­UxÃ×\\tAhoÙÐé²cO¡VàmVÿ××9vUë29;1é4Æô\\tQ°buGK3áZJpVôIk  ÕmüÀÐ+!`¯U>\Ò`Ãb>fô|GáøÐÃÁ´OOÆSÃiÁÈ]ÖèI~1ë kÉá×Y¥Ã¦\Rî×¨âLÚb²}FÂFÍ Èð'2ð|.1'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #240
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #33
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 145
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc '¤_WÊ=]}^Ü 4E r1pÂ^Ýp¨ÛHÏ>JèËô[8¶êY¨ËçÈþk-lö_Ì ?¦\\fïA r¨Mþk¼ô[ÕÄ`PaÑ âÓ/_uA9Ón[ w¨ÑzÊE`'ÚªÞìªqö¸oL\\b#Ûð¡éAçRÙUßã#ý'ú(Ëä¨8?ìPTòwI®Û8Á¡ÄÛC7;Ô4Go¯b\\bÜ¿ÚDáÌ\\ntXÔz@q0{ÕXd;û ú\\b Â"ÈÃÂYUäFD¢x&;]úT#È,2?ÜÂÅqáÎÄ£^È±,%Û¸p9wË¹×C)C(±ä=àviý=ô{;Ø4¢'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: sipush #240
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #31
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Zr20.a : [Ljava/lang/String;
    //   134: bipush #34
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zr20.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 263
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 245, 0 -> 216, 1 -> 220, 2 -> 225, 3 -> 230, 4 -> 235, 5 -> 240
    //   216: iconst_5
    //   217: goto -> 247
    //   220: bipush #98
    //   222: goto -> 247
    //   225: bipush #40
    //   227: goto -> 247
    //   230: bipush #122
    //   232: goto -> 247
    //   235: bipush #111
    //   237: goto -> 247
    //   240: bipush #114
    //   242: goto -> 247
    //   245: bipush #113
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 168
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 164
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 41, 0 -> 101
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE6E2) & 0xFFFF;
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
      byte b1 = 40;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr20.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */