package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zsy;

public class Zlry implements Zm9n {
  private final Zsy Zq;
  
  private final Zkq4 Zx;
  
  private final Zmhe ZK;
  
  private final Ze3n ZA;
  
  private final Zxs7 Zs;
  
  private final Zbnt ZT;
  
  private final Zbjl Zl;
  
  private static final Zzrd[] Zm;
  
  private static final byte[] ZP;
  
  public Zlry(Zkq4 paramZkq4, Zmhe paramZmhe, Ze3n paramZe3n, Zxs7 paramZxs7, Zsy paramZsy, Zbnt paramZbnt, Zbjl paramZbjl) {
    this.Zx = paramZkq4;
    this.ZK = paramZmhe;
    this.ZA = paramZe3n;
    this.Zs = paramZxs7;
    this.Zq = paramZsy;
    this.ZT = paramZbnt;
    this.Zl = paramZbjl;
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_XmlInjection;
  }
  
  public boolean Zf() {
    String str = this.Zs.ZI();
    try {
      if (this.Zs.Zq(this.Zx))
        return false; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      switch (Zeb9.Zo[this.Zs.Z_().ordinal()]) {
        case 1:
        case 2:
        case 3:
        case 4:
          return false;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return !Zs(str);
  }
  
  public static boolean Zs(String paramString) {
    try {
      if (paramString.indexOf('<') < 0) {
        try {
          if (paramString.indexOf('>') >= 0);
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zl : Lburp/Zbjl;
    //   4: invokeinterface ZG : ()Z
    //   9: ifeq -> 202
    //   12: aload_0
    //   13: getfield Zx : Lburp/Zkq4;
    //   16: getstatic burp/Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP : Lburp/Zzu2;
    //   19: getstatic burp/Zr3z.COLLABORATOR_BASED : Lburp/Zr3z;
    //   22: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   27: ifne -> 109
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   36: athrow
    //   37: aload_0
    //   38: getfield Zx : Lburp/Zkq4;
    //   41: getstatic burp/Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS : Lburp/Zzu2;
    //   44: getstatic burp/Zr3z.COLLABORATOR_BASED : Lburp/Zr3z;
    //   47: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   52: ifne -> 109
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   61: athrow
    //   62: aload_0
    //   63: getfield Zx : Lburp/Zkq4;
    //   66: getstatic burp/Zzu2.OUT_OF_BAND_RESOURCE_LOAD_HTTP : Lburp/Zzu2;
    //   69: invokeinterface Zr : (Lburp/Zvs;)Z
    //   74: ifne -> 109
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   83: athrow
    //   84: aload_0
    //   85: getfield Zx : Lburp/Zkq4;
    //   88: getstatic burp/Zzu2.XML_INJECTION : Lburp/Zzu2;
    //   91: getstatic burp/Zr3z.COLLABORATOR_BASED : Lburp/Zr3z;
    //   94: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   99: ifeq -> 202
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   108: athrow
    //   109: new burp/Zrax
    //   112: dup
    //   113: aload_0
    //   114: getfield ZT : Lburp/Zbnt;
    //   117: aload_0
    //   118: getfield Zx : Lburp/Zkq4;
    //   121: aload_0
    //   122: getfield ZA : Lburp/Ze3n;
    //   125: aload_0
    //   126: getfield ZK : Lburp/Zmhe;
    //   129: aload_0
    //   130: getfield Zs : Lburp/Zxs7;
    //   133: aload_0
    //   134: getfield Zl : Lburp/Zbjl;
    //   137: aload_0
    //   138: aload_1
    //   139: invokevirtual Zg : ()I
    //   142: invokevirtual ZB : (I)Lburp/Ztg0;
    //   145: invokespecial <init> : (Lburp/Zbnt;Lburp/Ztai;Lburp/Ze3n;Lburp/Zmhe;Lburp/Zxs7;Lburp/Zbjl;Lburp/Zzwz;)V
    //   148: aload_3
    //   149: invokevirtual Zs : (Lburp/Zz4_;)V
    //   152: new burp/Zrax
    //   155: dup
    //   156: aload_0
    //   157: getfield ZT : Lburp/Zbnt;
    //   160: aload_0
    //   161: getfield Zx : Lburp/Zkq4;
    //   164: aload_0
    //   165: getfield ZA : Lburp/Ze3n;
    //   168: aload_0
    //   169: getfield ZK : Lburp/Zmhe;
    //   172: aload_0
    //   173: getfield Zs : Lburp/Zxs7;
    //   176: aload_0
    //   177: getfield Zl : Lburp/Zbjl;
    //   180: aload_0
    //   181: aload_1
    //   182: invokevirtual Zg : ()I
    //   185: invokevirtual ZQ : (I)Lburp/Zkm1;
    //   188: invokespecial <init> : (Lburp/Zbnt;Lburp/Ztai;Lburp/Ze3n;Lburp/Zmhe;Lburp/Zxs7;Lburp/Zbjl;Lburp/Zzwz;)V
    //   191: aload_3
    //   192: invokevirtual Zs : (Lburp/Zz4_;)V
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   201: athrow
    //   202: aload_0
    //   203: getfield Zx : Lburp/Zkq4;
    //   206: getstatic burp/Zzu2.XML_INJECTION : Lburp/Zzu2;
    //   209: getstatic burp/Zr3z.ERROR_BASED : Lburp/Zr3z;
    //   212: invokeinterface ZS : (Lburp/Zvs;Lburp/Zr3z;)Z
    //   217: ifeq -> 232
    //   220: aload_0
    //   221: aload_3
    //   222: invokevirtual ZQ : (Lburp/Zz4_;)V
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   231: athrow
    //   232: return
    // Exception table:
    //   from	to	target	type
    //   0	30	33	java/lang/MatchException
    //   12	55	58	java/lang/MatchException
    //   37	77	80	java/lang/MatchException
    //   62	102	105	java/lang/MatchException
    //   84	195	198	java/lang/MatchException
    //   202	225	228	java/lang/MatchException
  }
  
  private void ZQ(Zz4_ paramZz4_) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore #4
    //   5: invokestatic ZX : ()Z
    //   8: aconst_null
    //   9: astore #5
    //   11: iconst_0
    //   12: istore #6
    //   14: istore_2
    //   15: iload #6
    //   17: aload_0
    //   18: invokevirtual Zw : ()I
    //   21: if_icmpge -> 160
    //   24: iload #6
    //   26: ifne -> 49
    //   29: aload_0
    //   30: getfield ZK : Lburp/Zmhe;
    //   33: invokeinterface ZQ : ()Lburp/Zb6q;
    //   38: invokeinterface Za : ()Lburp/Zstu;
    //   43: astore #7
    //   45: iload_2
    //   46: ifeq -> 70
    //   49: aload_0
    //   50: getfield ZK : Lburp/Zmhe;
    //   53: invokeinterface Zb : ()Lburp/Zlvf;
    //   58: invokeinterface ZM : ()Lburp/Zzud;
    //   63: invokeinterface Zl : ()Lburp/Zstu;
    //   68: astore #7
    //   70: aload_0
    //   71: getfield ZK : Lburp/Zmhe;
    //   74: new burp/Zrrb
    //   77: dup
    //   78: getstatic burp/Zlry.ZP : [B
    //   81: iconst_1
    //   82: invokespecial <init> : ([BB)V
    //   85: invokestatic ZJ : (Lburp/Zlb8;)Lburp/Zri7;
    //   88: invokestatic Zc : ()Lburp/Zlp5;
    //   91: iconst_0
    //   92: invokevirtual Zd : (Z)Lburp/Zlp5;
    //   95: invokeinterface ZK : (Lburp/Zri7;Lburp/Zlp5;)Lburp/Zlvf;
    //   100: astore #4
    //   102: aload_0
    //   103: aload #4
    //   105: invokeinterface ZM : ()Lburp/Zzud;
    //   110: invokeinterface ZT : ()Lburp/Zb6q;
    //   115: aload_0
    //   116: aload #7
    //   118: invokevirtual ZZ : (Lburp/Zstu;)[Z
    //   121: invokevirtual ZK : (Lburp/Zb6q;[Z)Ljava/util/List;
    //   124: astore_3
    //   125: aload_3
    //   126: invokeinterface isEmpty : ()Z
    //   131: ifeq -> 139
    //   134: return
    //   135: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   138: athrow
    //   139: aload #4
    //   141: invokeinterface ZY : ()Lburp/Zs2i;
    //   146: invokeinterface Zm : ()[I
    //   151: astore #5
    //   153: iinc #6, 1
    //   156: iload_2
    //   157: ifeq -> 15
    //   160: aload_0
    //   161: aload_1
    //   162: aload #4
    //   164: aload_3
    //   165: aload #5
    //   167: invokevirtual Zm : (Lburp/Zz4_;Lburp/Zlvf;Ljava/util/List;[I)V
    //   170: return
    // Exception table:
    //   from	to	target	type
    //   125	135	135	java/lang/MatchException
  }
  
  private int Zw() {
    try {
      switch (Zeb9.ZI[this.Zx.ZqM().ordinal()]) {
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
    return 3;
  }
  
  private List<int[]> ZK(Zb6q paramZb6q, boolean[] paramArrayOfboolean) {
    try {
      if (Zs2k.Zb(this.ZA.ZL(), paramZb6q))
        return ZJ(paramZb6q.Za(), paramArrayOfboolean); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (List)Collections.emptyList();
  }
  
  private Zkm1 ZQ(int paramInt) {
    return new Zkm1(Zk7g.OUT_BAND_RESOURCE_LOAD, this.Zq, paramInt, this.ZA.ZM().Zgv(), this.Zl, this.Zs);
  }
  
  private Ztg0 ZB(int paramInt) {
    return new Ztg0(Zk7g.OUT_BAND_RESOURCE_LOAD, this.Zq, paramInt, this.ZA.ZM().Zgv(), this.Zl, this.Zs);
  }
  
  private boolean[] ZZ(Zstu paramZstu) {
    boolean[] arrayOfBoolean = new boolean[Zm.length];
    byte b = 0;
    boolean bool = Zxor.ZM();
    while (b < arrayOfBoolean.length) {
      try {
        if (Zm[b].ZL(this.ZK.Zy().ZD()).ZP())
          arrayOfBoolean[b] = true; 
      } catch (MatchException matchException) {
        throw a(null);
      } 
      Zbu4 zbu4 = Zm[b].ZG(paramZstu);
      try {
        if (zbu4.ZP())
          try {
            if (!Zmhb.Zl(paramZstu, zbu4.ZR(), this.ZT))
              arrayOfBoolean[b] = true; 
          } catch (MatchException matchException) {
            throw a(null);
          }  
      } catch (MatchException matchException) {
        throw a(null);
      } 
      b++;
      if (!bool)
        break; 
    } 
    return arrayOfBoolean;
  }
  
  private List<int[]> ZJ(Zstu paramZstu, boolean[] paramArrayOfboolean) {
    ArrayList<int[]> arrayList = new ArrayList();
    byte b = 0;
    boolean bool = Zxor.ZM();
    while (b < Zm.length) {
      try {
        if (!paramArrayOfboolean[b]) {
          Zbu4 zbu4 = Zm[b].ZG(paramZstu);
          try {
            if (zbu4.ZP())
              try {
                if (!Zmhb.Zl(paramZstu, zbu4.ZR(), this.ZT))
                  arrayList.add(zbu4.Z_()); 
              } catch (MatchException matchException) {
                throw a(null);
              }  
          } catch (MatchException matchException) {
            throw a(null);
          } 
        } 
      } catch (MatchException matchException) {
        throw a(null);
      } 
      b++;
      if (!bool)
        break; 
    } 
    return (List<int[]>)arrayList;
  }
  
  private void Zm(Zz4_ paramZz4_, Zlvf paramZlvf, List<int[]> paramList, int[] paramArrayOfint) {
    paramZz4_.Zz(Zkir.Ze(paramZlvf, this.Zs, ZP, Zrlp.Zh(paramArrayOfint), Zrlp.Zc(paramList)));
  }
  
  public String toString() {
    return Zp().name();
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '<1|:478\\b73q\\tsk\\n2\\t<1|:475\\t<1|_'l4g73q\\ts73q\\tg\\b73q\\tdk\\n273q\\t,`\\t<1|\\n*f)=.Gu\\t73q\\tsl %\\n<1|:4+=`<1|\\n&o'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #9
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #56
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 129
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc '1<qZ:>|d'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: iconst_4
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #53
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #124
    //   202: goto -> 232
    //   205: bipush #100
    //   207: goto -> 232
    //   210: bipush #40
    //   212: goto -> 232
    //   215: bipush #65
    //   217: goto -> 232
    //   220: bipush #113
    //   222: goto -> 232
    //   225: bipush #54
    //   227: goto -> 232
    //   230: bipush #92
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 98
    //   288: bipush #14
    //   290: anewarray burp/Zzrd
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: bipush #13
    //   298: aaload
    //   299: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   302: aastore
    //   303: dup
    //   304: iconst_1
    //   305: aload_0
    //   306: iconst_3
    //   307: aaload
    //   308: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   311: aastore
    //   312: dup
    //   313: iconst_2
    //   314: aload_0
    //   315: bipush #8
    //   317: aaload
    //   318: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   321: aastore
    //   322: dup
    //   323: iconst_3
    //   324: aload_0
    //   325: bipush #12
    //   327: aaload
    //   328: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   331: aastore
    //   332: dup
    //   333: iconst_4
    //   334: aload_0
    //   335: bipush #11
    //   337: aaload
    //   338: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   341: aastore
    //   342: dup
    //   343: iconst_5
    //   344: aload_0
    //   345: iconst_0
    //   346: aaload
    //   347: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   350: aastore
    //   351: dup
    //   352: bipush #6
    //   354: aload_0
    //   355: iconst_2
    //   356: aaload
    //   357: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   360: aastore
    //   361: dup
    //   362: bipush #7
    //   364: aload_0
    //   365: bipush #14
    //   367: aaload
    //   368: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   371: aastore
    //   372: dup
    //   373: bipush #8
    //   375: aload_0
    //   376: iconst_5
    //   377: aaload
    //   378: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   381: aastore
    //   382: dup
    //   383: bipush #9
    //   385: aload_0
    //   386: iconst_4
    //   387: aaload
    //   388: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   391: aastore
    //   392: dup
    //   393: bipush #10
    //   395: aload_0
    //   396: bipush #7
    //   398: aaload
    //   399: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   402: aastore
    //   403: dup
    //   404: bipush #11
    //   406: aload_0
    //   407: bipush #6
    //   409: aaload
    //   410: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   413: aastore
    //   414: dup
    //   415: bipush #12
    //   417: aload_0
    //   418: iconst_1
    //   419: aaload
    //   420: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   423: aastore
    //   424: dup
    //   425: bipush #13
    //   427: aload_0
    //   428: bipush #10
    //   430: aaload
    //   431: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   434: aastore
    //   435: putstatic burp/Zlry.Zm : [Lburp/Zzrd;
    //   438: aload_0
    //   439: bipush #9
    //   441: aaload
    //   442: invokestatic Zy : (Ljava/lang/String;)[B
    //   445: putstatic burp/Zlry.ZP : [B
    //   448: return
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */