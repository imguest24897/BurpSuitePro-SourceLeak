package burp;

import java.util.Optional;

class Zt78 {
  private final Zgn0 ZY;
  
  private final Zkq4 Zk;
  
  private final Ze3n ZU;
  
  private final Zkoc ZK;
  
  private final Zr1y ZI;
  
  Zt78(Zgn0 paramZgn0, Zkq4 paramZkq4, Ze3n paramZe3n, Zkoc paramZkoc, Zr1y paramZr1y) {
    this.ZY = paramZgn0;
    this.Zk = paramZkq4;
    this.ZU = paramZe3n;
    this.ZK = paramZkoc;
    this.ZI = paramZr1y;
  }
  
  void ZP(Zz4_ paramZz4_) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Z_ : ()I
    //   4: istore_3
    //   5: aconst_null
    //   6: astore #4
    //   8: aconst_null
    //   9: astore #5
    //   11: iconst_0
    //   12: istore #6
    //   14: invokestatic ZK : ()[Lburp/Zbqc;
    //   17: iconst_1
    //   18: istore #7
    //   20: astore_2
    //   21: iconst_0
    //   22: istore #8
    //   24: iload #8
    //   26: iload_3
    //   27: if_icmpge -> 186
    //   30: iload #6
    //   32: ifne -> 186
    //   35: iload #7
    //   37: ifeq -> 186
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   46: athrow
    //   47: aload_0
    //   48: invokevirtual Zg : ()Ljava/util/Optional;
    //   51: astore #9
    //   53: aload #9
    //   55: invokevirtual isEmpty : ()Z
    //   58: ifeq -> 66
    //   61: return
    //   62: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   65: athrow
    //   66: aload #9
    //   68: invokevirtual get : ()Ljava/lang/Object;
    //   71: checkcast burp/Zbjw
    //   74: astore #4
    //   76: aload #4
    //   78: invokevirtual ZB : ()Z
    //   81: ifeq -> 122
    //   84: iconst_1
    //   85: istore #6
    //   87: aload_0
    //   88: getfield ZI : Lburp/Zr1y;
    //   91: aload #4
    //   93: invokevirtual ZG : (Lburp/Zbjw;)Lburp/Zmvq;
    //   96: astore #10
    //   98: aload_0
    //   99: aload_1
    //   100: aload #10
    //   102: invokevirtual Zu : (Lburp/Zz4_;Lburp/Zmvq;)V
    //   105: aload_0
    //   106: getfield ZK : Lburp/Zkoc;
    //   109: aload #4
    //   111: aload_1
    //   112: aload #10
    //   114: invokevirtual ZW : (Lburp/Zbjw;Lburp/Zz4_;Lburp/Zmvq;)Z
    //   117: pop
    //   118: aload_2
    //   119: ifnull -> 179
    //   122: aload_0
    //   123: aload #4
    //   125: invokevirtual Zb : (Lburp/Zbjw;)Z
    //   128: ifeq -> 176
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   137: athrow
    //   138: aload_0
    //   139: invokevirtual Zc : ()Lburp/Zghb;
    //   142: astore #5
    //   144: aload #5
    //   146: invokevirtual Za : ()Lburp/Zb6q;
    //   149: invokeinterface Ze : ()S
    //   154: aload_0
    //   155: getfield ZU : Lburp/Ze3n;
    //   158: invokevirtual ZL : ()Lburp/Zb6q;
    //   161: invokeinterface Ze : ()S
    //   166: if_icmpeq -> 179
    //   169: iconst_0
    //   170: istore #7
    //   172: aload_2
    //   173: ifnull -> 179
    //   176: iconst_0
    //   177: istore #7
    //   179: iinc #8, 1
    //   182: aload_2
    //   183: ifnull -> 24
    //   186: iload #6
    //   188: ifne -> 288
    //   191: iload #7
    //   193: ifeq -> 288
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   202: athrow
    //   203: aload #4
    //   205: ifnull -> 223
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   214: athrow
    //   215: iconst_1
    //   216: goto -> 224
    //   219: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   222: athrow
    //   223: iconst_0
    //   224: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   227: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   230: aload #5
    //   232: ifnull -> 243
    //   235: iconst_1
    //   236: goto -> 244
    //   239: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   242: athrow
    //   243: iconst_0
    //   244: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   247: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   250: aload_0
    //   251: getfield ZI : Lburp/Zr1y;
    //   254: aload #4
    //   256: aload #5
    //   258: invokevirtual ZY : (Lburp/Zbjw;Lburp/Zghb;)Lburp/Zmvq;
    //   261: astore #8
    //   263: aload_0
    //   264: getfield ZK : Lburp/Zkoc;
    //   267: aload #4
    //   269: aload_1
    //   270: aload #8
    //   272: invokevirtual ZW : (Lburp/Zbjw;Lburp/Zz4_;Lburp/Zmvq;)Z
    //   275: istore #9
    //   277: aload_0
    //   278: iload #9
    //   280: aload #4
    //   282: aload_1
    //   283: aload #8
    //   285: invokevirtual ZJ : (ZLburp/Zbjw;Lburp/Zz4_;Lburp/Zmvq;)V
    //   288: return
    // Exception table:
    //   from	to	target	type
    //   30	40	43	java/lang/MatchException
    //   53	62	62	java/lang/MatchException
    //   98	131	134	java/lang/MatchException
    //   186	196	199	java/lang/MatchException
    //   191	208	211	java/lang/MatchException
    //   203	219	219	java/lang/MatchException
    //   224	239	239	java/lang/MatchException
  }
  
  private int Z_() {
    try {
      if (ZH())
        return 1; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      switch (Zeqb.ZE[this.Zk.ZqM().ordinal()]) {
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
    return 7;
  }
  
  private boolean ZH() {
    return this.ZY.Zp();
  }
  
  private Optional<Zbjw> Zg() {
    return this.ZY.ZL();
  }
  
  private boolean Zb(Zbjw paramZbjw) {
    return this.ZY.ZH(paramZbjw);
  }
  
  private Zghb Zc() {
    return this.ZY.ZT();
  }
  
  private void Zu(Zz4_ paramZz4_, Zmvq paramZmvq) {
    this.ZY.Zj(paramZz4_, paramZmvq);
  }
  
  private void ZJ(boolean paramBoolean, Zbjw paramZbjw, Zz4_ paramZz4_, Zmvq paramZmvq) {
    this.ZY.Zk(paramBoolean, paramZbjw, paramZz4_, paramZmvq);
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt78.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */