package burp;

import java.util.Iterator;
import java.util.List;

public class Zxon {
  private final Zln1 Za;
  
  private final Ztai ZC;
  
  private final Zgu0 ZI;
  
  private final Zxs7 Zg;
  
  private final Zkva ZM;
  
  private final long ZF;
  
  private final Zeko ZL;
  
  private final Zvs Zv;
  
  private final boolean Zj;
  
  public Zxon(Zmhe paramZmhe, Ze3n paramZe3n, long paramLong, Zxs7 paramZxs7, Zkq4 paramZkq4, Zlk4 paramZlk4) {
    this.Zg = paramZxs7;
    this.ZL = paramZkq4.ZqM();
    this.ZF = paramLong;
    String str = Zm0n.ZX();
    try {
      this.Za = new Zku3(paramZkq4, paramZlk4);
      this.ZC = paramZkq4;
      this.ZI = new Zgu0(paramZe3n, paramZxs7);
      this.Zj = paramZe3n.Zz();
      this.Zv = paramZmhe.<Zvs>Zq(Zzu2.SQL_INJECTION, Zzu2.SQL_INJECTION_2ND_ORDER);
      this.ZM = new Zkva(paramZxs7, paramZmhe, new Zez8(), paramLong);
      if (Zbqc.Zwu() == null)
        Zm0n.Za("EoyRXb"); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  public Zm4g ZK(int paramInt, Zkva paramZkva) {
    return Zg(this.Za.ZV(), paramInt, paramZkva);
  }
  
  public Zm4g Zp(int paramInt, Zkva paramZkva) {
    return Zg(this.Za.Zn(), paramInt, paramZkva);
  }
  
  public Zm4g ZT(int paramInt, Zkva paramZkva) {
    return Zg(this.Za.Zc(), paramInt, paramZkva);
  }
  
  public Zx_5 Zv(int paramInt) {
    return ZE(paramInt, this.Za.Zx(), Zkcu.Zd).Zq();
  }
  
  public Zx_5 Zs(int paramInt) {
    // Byte code:
    //   0: invokestatic ZX : ()Ljava/lang/String;
    //   3: astore_2
    //   4: iconst_2
    //   5: anewarray java/util/List
    //   8: dup
    //   9: iconst_0
    //   10: aload_0
    //   11: getfield Za : Lburp/Zln1;
    //   14: invokeinterface ZU : ()Ljava/util/List;
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: aload_0
    //   23: getfield Za : Lburp/Zln1;
    //   26: invokeinterface ZA : ()Ljava/util/List;
    //   31: aastore
    //   32: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   35: invokeinterface iterator : ()Ljava/util/Iterator;
    //   40: astore_3
    //   41: aload_3
    //   42: invokeinterface hasNext : ()Z
    //   47: ifeq -> 95
    //   50: aload_3
    //   51: invokeinterface next : ()Ljava/lang/Object;
    //   56: checkcast java/util/List
    //   59: astore #4
    //   61: aload_0
    //   62: iload_1
    //   63: aload #4
    //   65: getstatic burp/Zkcu.Zd : Lburp/Zkcu;
    //   68: invokevirtual ZE : (ILjava/util/List;Lburp/Zkcu;)Lburp/Zm3n;
    //   71: astore #5
    //   73: aload #5
    //   75: getstatic burp/Zm3n.ZA : Lburp/Zm3n;
    //   78: if_acmpeq -> 91
    //   81: aload #5
    //   83: invokevirtual Zq : ()Lburp/Zx_5;
    //   86: areturn
    //   87: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   90: athrow
    //   91: aload_2
    //   92: ifnull -> 41
    //   95: aload_0
    //   96: getfield Za : Lburp/Zln1;
    //   99: invokeinterface Zv : ()Ljava/util/List;
    //   104: invokeinterface iterator : ()Ljava/util/Iterator;
    //   109: astore_3
    //   110: aload_3
    //   111: invokeinterface hasNext : ()Z
    //   116: ifeq -> 535
    //   119: aload_3
    //   120: invokeinterface next : ()Ljava/lang/Object;
    //   125: checkcast burp/Zllr
    //   128: astore #4
    //   130: aload_0
    //   131: getfield Zj : Z
    //   134: ifne -> 156
    //   137: aload #4
    //   139: aload_0
    //   140: getfield Zg : Lburp/Zxs7;
    //   143: invokevirtual ZT : (Lburp/Zxs7;)Z
    //   146: ifeq -> 531
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   155: athrow
    //   156: aload_0
    //   157: aload #4
    //   159: iload_1
    //   160: aload_0
    //   161: getfield ZM : Lburp/Zkva;
    //   164: getstatic burp/Zkcu.Zd : Lburp/Zkcu;
    //   167: invokevirtual Zi : (Lburp/Zllr;ILburp/Zkva;Lburp/Zkcu;)Z
    //   170: ifeq -> 531
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   179: athrow
    //   180: aload_0
    //   181: aload #4
    //   183: iload_1
    //   184: invokevirtual ZD : (Lburp/Zllr;I)Lburp/Zm3n;
    //   187: astore #5
    //   189: aload #5
    //   191: getstatic burp/Zm3n.ZA : Lburp/Zm3n;
    //   194: if_acmpeq -> 207
    //   197: aload #5
    //   199: invokevirtual Zq : ()Lburp/Zx_5;
    //   202: areturn
    //   203: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   206: athrow
    //   207: aload_0
    //   208: getfield ZC : Lburp/Ztai;
    //   211: getstatic burp/Zzu2.UNIDENTIFIED_CODE_INJECTION : Lburp/Zzu2;
    //   214: invokeinterface Zr : (Lburp/Zvs;)Z
    //   219: ifeq -> 531
    //   222: aload_0
    //   223: getfield ZC : Lburp/Ztai;
    //   226: aload_0
    //   227: getfield Zv : Lburp/Zvs;
    //   230: getstatic burp/Zr3z.TIME_BASED : Lburp/Zr3z;
    //   233: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   238: ifeq -> 326
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   247: athrow
    //   248: aload_0
    //   249: getfield ZC : Lburp/Ztai;
    //   252: aload_0
    //   253: getfield Zv : Lburp/Zvs;
    //   256: getstatic burp/Zr3z.MYSQL_SPECIFIC : Lburp/Zr3z;
    //   259: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   264: ifne -> 389
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   273: athrow
    //   274: aload_0
    //   275: getfield ZC : Lburp/Ztai;
    //   278: aload_0
    //   279: getfield Zv : Lburp/Zvs;
    //   282: getstatic burp/Zr3z.MSSQL_SPECIFIC : Lburp/Zr3z;
    //   285: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   290: ifne -> 389
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   299: athrow
    //   300: aload_0
    //   301: getfield ZC : Lburp/Ztai;
    //   304: aload_0
    //   305: getfield Zv : Lburp/Zvs;
    //   308: getstatic burp/Zr3z.POSTGRES_SPECIFIC : Lburp/Zr3z;
    //   311: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   316: ifne -> 389
    //   319: goto -> 326
    //   322: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   325: athrow
    //   326: aload_0
    //   327: iload_1
    //   328: aload_0
    //   329: getfield ZM : Lburp/Zkva;
    //   332: invokevirtual Zp : (ILburp/Zkva;)Lburp/Zm4g;
    //   335: ifnonnull -> 383
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   344: athrow
    //   345: aload_0
    //   346: iload_1
    //   347: aload_0
    //   348: getfield ZM : Lburp/Zkva;
    //   351: invokevirtual ZK : (ILburp/Zkva;)Lburp/Zm4g;
    //   354: ifnonnull -> 383
    //   357: goto -> 364
    //   360: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   363: athrow
    //   364: aload_0
    //   365: iload_1
    //   366: aload_0
    //   367: getfield ZM : Lburp/Zkva;
    //   370: invokevirtual ZT : (ILburp/Zkva;)Lburp/Zm4g;
    //   373: ifnull -> 521
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   382: athrow
    //   383: aconst_null
    //   384: areturn
    //   385: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   388: athrow
    //   389: aload_0
    //   390: getfield ZC : Lburp/Ztai;
    //   393: aload_0
    //   394: getfield Zv : Lburp/Zvs;
    //   397: getstatic burp/Zr3z.MYSQL_SPECIFIC : Lburp/Zr3z;
    //   400: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   405: ifne -> 433
    //   408: aload_0
    //   409: iload_1
    //   410: aload_0
    //   411: getfield ZM : Lburp/Zkva;
    //   414: invokevirtual ZK : (ILburp/Zkva;)Lburp/Zm4g;
    //   417: ifnull -> 521
    //   420: goto -> 427
    //   423: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   426: athrow
    //   427: aconst_null
    //   428: areturn
    //   429: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   432: athrow
    //   433: aload_0
    //   434: getfield ZC : Lburp/Ztai;
    //   437: aload_0
    //   438: getfield Zv : Lburp/Zvs;
    //   441: getstatic burp/Zr3z.MSSQL_SPECIFIC : Lburp/Zr3z;
    //   444: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   449: ifne -> 477
    //   452: aload_0
    //   453: iload_1
    //   454: aload_0
    //   455: getfield ZM : Lburp/Zkva;
    //   458: invokevirtual Zp : (ILburp/Zkva;)Lburp/Zm4g;
    //   461: ifnull -> 521
    //   464: goto -> 471
    //   467: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   470: athrow
    //   471: aconst_null
    //   472: areturn
    //   473: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   476: athrow
    //   477: aload_0
    //   478: getfield ZC : Lburp/Ztai;
    //   481: aload_0
    //   482: getfield Zv : Lburp/Zvs;
    //   485: getstatic burp/Zr3z.POSTGRES_SPECIFIC : Lburp/Zr3z;
    //   488: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   493: ifne -> 521
    //   496: aload_0
    //   497: iload_1
    //   498: aload_0
    //   499: getfield ZM : Lburp/Zkva;
    //   502: invokevirtual ZT : (ILburp/Zkva;)Lburp/Zm4g;
    //   505: ifnull -> 521
    //   508: goto -> 515
    //   511: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   514: athrow
    //   515: aconst_null
    //   516: areturn
    //   517: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   520: athrow
    //   521: aload_0
    //   522: getfield ZI : Lburp/Zgu0;
    //   525: aload #4
    //   527: invokevirtual ZE : (Lburp/Zllr;)Lburp/Zx_5;
    //   530: areturn
    //   531: aload_2
    //   532: ifnull -> 110
    //   535: aconst_null
    //   536: areturn
    // Exception table:
    //   from	to	target	type
    //   73	87	87	java/lang/MatchException
    //   130	149	152	java/lang/MatchException
    //   137	173	176	java/lang/MatchException
    //   189	203	203	java/lang/MatchException
    //   207	241	244	java/lang/MatchException
    //   222	267	270	java/lang/MatchException
    //   248	293	296	java/lang/MatchException
    //   274	319	322	java/lang/MatchException
    //   300	338	341	java/lang/MatchException
    //   326	357	360	java/lang/MatchException
    //   345	376	379	java/lang/MatchException
    //   364	385	385	java/lang/MatchException
    //   389	420	423	java/lang/MatchException
    //   408	429	429	java/lang/MatchException
    //   433	464	467	java/lang/MatchException
    //   452	473	473	java/lang/MatchException
    //   477	508	511	java/lang/MatchException
    //   496	517	517	java/lang/MatchException
  }
  
  public Zx_5 Z_() {
    return (ZE(0, this.Za.ZW(), Zkcu.Zn)).ZI;
  }
  
  private Zm3n ZE(int paramInt, List<Zllr> paramList, Zkcu paramZkcu) {
    // Byte code:
    //   0: invokestatic ZX : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_2
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore #5
    //   13: aload #5
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 117
    //   23: aload #5
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast burp/Zllr
    //   33: astore #6
    //   35: aload_0
    //   36: getfield Zj : Z
    //   39: ifne -> 61
    //   42: aload #6
    //   44: aload_0
    //   45: getfield Zg : Lburp/Zxs7;
    //   48: invokevirtual ZT : (Lburp/Zxs7;)Z
    //   51: ifeq -> 112
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   60: athrow
    //   61: aload_0
    //   62: aload #6
    //   64: iload_1
    //   65: aload_0
    //   66: getfield ZM : Lburp/Zkva;
    //   69: aload_3
    //   70: invokevirtual Zi : (Lburp/Zllr;ILburp/Zkva;Lburp/Zkcu;)Z
    //   73: ifeq -> 112
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   82: athrow
    //   83: aload_0
    //   84: getfield ZI : Lburp/Zgu0;
    //   87: aload #6
    //   89: invokevirtual ZE : (Lburp/Zllr;)Lburp/Zx_5;
    //   92: astore #7
    //   94: aload #7
    //   96: ifnull -> 112
    //   99: aload_0
    //   100: aload #6
    //   102: aload #7
    //   104: invokevirtual Zq : (Lburp/Zllr;Lburp/Zx_5;)Lburp/Zm3n;
    //   107: areturn
    //   108: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   111: athrow
    //   112: aload #4
    //   114: ifnull -> 13
    //   117: getstatic burp/Zm3n.ZA : Lburp/Zm3n;
    //   120: areturn
    // Exception table:
    //   from	to	target	type
    //   35	54	57	java/lang/MatchException
    //   42	76	79	java/lang/MatchException
    //   94	108	108	java/lang/MatchException
  }
  
  private Zm3n Zq(Zllr paramZllr, Zx_5 paramZx_5) {
    try {
      if (paramZx_5 == null)
        return Zm3n.ZA; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return this.ZC.ZS(paramZllr.ZM.ZU, paramZllr.ZM.ZN) ? Zm3n.ZQ(paramZx_5) : Zm3n.Zc(paramZx_5);
  }
  
  private Zm4g Zg(List<Zllr> paramList, int paramInt, Zkva paramZkva) {
    // Byte code:
    //   0: invokestatic ZX : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore #5
    //   13: aload #5
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 134
    //   23: aload #5
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast burp/Zllr
    //   33: astore #6
    //   35: aload_0
    //   36: getfield Zj : Z
    //   39: ifne -> 61
    //   42: aload #6
    //   44: aload_0
    //   45: getfield Zg : Lburp/Zxs7;
    //   48: invokevirtual ZT : (Lburp/Zxs7;)Z
    //   51: ifeq -> 129
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   60: athrow
    //   61: aload_0
    //   62: aload #6
    //   64: iload_2
    //   65: aload_3
    //   66: getstatic burp/Zkcu.Zd : Lburp/Zkcu;
    //   69: invokevirtual Zi : (Lburp/Zllr;ILburp/Zkva;Lburp/Zkcu;)Z
    //   72: ifeq -> 129
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   81: athrow
    //   82: aload_0
    //   83: getfield ZI : Lburp/Zgu0;
    //   86: invokevirtual ZT : ()Lburp/Zm4g;
    //   89: astore #7
    //   91: aload #7
    //   93: ifnull -> 103
    //   96: aload #7
    //   98: areturn
    //   99: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   102: athrow
    //   103: aload_0
    //   104: getfield ZI : Lburp/Zgu0;
    //   107: aload #6
    //   109: invokevirtual ZE : (Lburp/Zllr;)Lburp/Zx_5;
    //   112: astore #8
    //   114: aload #8
    //   116: ifnull -> 129
    //   119: aload #8
    //   121: checkcast burp/Zm4g
    //   124: areturn
    //   125: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   128: athrow
    //   129: aload #4
    //   131: ifnull -> 13
    //   134: aconst_null
    //   135: areturn
    // Exception table:
    //   from	to	target	type
    //   35	54	57	java/lang/MatchException
    //   42	75	78	java/lang/MatchException
    //   91	99	99	java/lang/MatchException
    //   114	125	125	java/lang/MatchException
  }
  
  private boolean Zi(Zllr paramZllr, int paramInt, Zkva paramZkva, Zkcu paramZkcu) {
    String str = Zm0n.ZX();
    Zm0n zm0n = paramZkva.Zy(paramZllr, paramZkcu.Zq, paramInt);
    try {
      if (!zm0n.ZB.Zh(this.ZF))
        return false; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      switch (Zsjv.Zn[this.ZL.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    byte b1 = 6;
    byte b2 = 0;
    while (b2 < b1) {
      Zej6 zej61 = paramZkva.Zi(paramZllr, paramZkcu.Zt, paramInt);
      Zej6 zej62 = paramZkva.Zi(paramZllr, paramZkcu.Zq, paramInt);
      try {
        if (!zej62.Zp(zej61))
          return false; 
      } catch (MatchException matchException) {
        throw a(null);
      } 
      b2++;
      if (str != null)
        break; 
    } 
    this.ZI.ZP(zm0n);
    return true;
  }
  
  private Zm3n ZD(Zllr paramZllr, int paramInt) {
    List<Zllr> list = this.Za.Zp(paramZllr.ZW);
    Iterator<Zllr> iterator = list.iterator();
    String str = Zm0n.ZX();
    while (iterator.hasNext()) {
      Zllr zllr = iterator.next();
      Zej6 zej6 = this.ZM.Zi(zllr, Zkcu.Zd.Zt, paramInt);
      Zm0n zm0n = this.ZM.Zy(zllr, Zkcu.Zd.Zq, paramInt);
      try {
        if (zm0n.ZB.Zp(zej6)) {
          this.ZI.ZP(zm0n);
          return Zq(zllr, this.ZI.ZE(zllr));
        } 
      } catch (MatchException matchException) {
        throw a(null);
      } 
      if (str != null)
        break; 
    } 
    return Zm3n.ZA;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxon.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */