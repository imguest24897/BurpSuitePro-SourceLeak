package burp;

public class Zs4 {
  private final Zz4b ZU;
  
  private final Zgu7 ZY;
  
  private final Zb3k Zg;
  
  private final Zr_h ZL;
  
  private final Zm44 ZX;
  
  private final Zr5_ ZI;
  
  private final Zra1 Zj;
  
  private final Zlli<Zt11> Zm;
  
  private final Zrgd Zq;
  
  public Zs4(Zz4b paramZz4b, Zgu7 paramZgu7, Zb3k paramZb3k, Zr_h paramZr_h, Zzkr paramZzkr, Zm44 paramZm44, Zra1 paramZra1, Zlli<Zt11> paramZlli, Zrgd paramZrgd) {
    this.ZU = paramZz4b;
    this.ZY = paramZgu7;
    this.Zg = paramZb3k;
    this.ZL = paramZr_h;
    this.ZX = paramZm44;
    this.ZI = paramZzkr.ZD();
    this.Zj = paramZra1;
    this.Zm = paramZlli;
    this.Zq = paramZrgd;
  }
  
  public Ztj1 Zr(Zb_6 paramZb_6) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZM : ()Lburp/Zgna;
    //   4: astore_3
    //   5: invokestatic ZD : ()Ljava/lang/String;
    //   8: aload_1
    //   9: invokevirtual ZR : ()Lburp/Zrbm;
    //   12: astore #4
    //   14: astore_2
    //   15: aload_1
    //   16: invokevirtual Zc : ()Lburp/Zr5_;
    //   19: ifnull -> 29
    //   22: aload_1
    //   23: invokevirtual Zc : ()Lburp/Zr5_;
    //   26: goto -> 33
    //   29: aload_0
    //   30: getfield ZI : Lburp/Zr5_;
    //   33: astore #5
    //   35: new burp/Zru3
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: astore #6
    //   44: new java/util/concurrent/locks/ReentrantLock
    //   47: dup
    //   48: iconst_1
    //   49: invokespecial <init> : (Z)V
    //   52: astore #7
    //   54: new burp/Ze97
    //   57: dup
    //   58: aload #4
    //   60: aload_1
    //   61: invokevirtual ZG : ()Lburp/Zto9;
    //   64: invokespecial <init> : (Lburp/Zrbm;Lburp/Zz1m;)V
    //   67: astore #8
    //   69: aload_0
    //   70: getfield ZX : Lburp/Zm44;
    //   73: aload #8
    //   75: aload_3
    //   76: aload #4
    //   78: aload #5
    //   80: invokevirtual ZO : ()Lburp/Ztwh;
    //   83: new burp/Zbx7
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: aload_1
    //   91: invokevirtual ZG : ()Lburp/Zto9;
    //   94: invokevirtual ZH : (Lburp/Ze97;Lburp/Zgna;Lburp/Zrbm;Lburp/Ztwh;Lburp/Zbx7;Lburp/Zlli;)Lburp/Zx5d;
    //   97: astore #9
    //   99: aload_1
    //   100: invokevirtual ZZ : ()Lburp/Zskh;
    //   103: astore #10
    //   105: new burp/Zrmf
    //   108: dup
    //   109: aload_0
    //   110: getfield ZL : Lburp/Zr_h;
    //   113: aload #7
    //   115: aload #9
    //   117: invokespecial <init> : (Lburp/Zr_h;Ljava/util/concurrent/locks/Lock;Lburp/Zx5d;)V
    //   120: aload_1
    //   121: invokevirtual ZG : ()Lburp/Zto9;
    //   124: invokevirtual ZO : (Lburp/Zlli;)V
    //   127: new burp/Zxgk
    //   130: dup
    //   131: aload_3
    //   132: aload_1
    //   133: invokevirtual ZG : ()Lburp/Zto9;
    //   136: new burp/Zspa
    //   139: dup
    //   140: aload_3
    //   141: aload_0
    //   142: getfield Zq : Lburp/Zrgd;
    //   145: invokespecial <init> : (Lburp/Zgna;Lburp/Zrgd;)V
    //   148: aload_0
    //   149: getfield Zm : Lburp/Zlli;
    //   152: invokespecial <init> : (Lburp/Zgna;Lburp/Ztos;Lburp/Zspa;Lburp/Zlli;)V
    //   155: astore #11
    //   157: new burp/Zzkz
    //   160: dup
    //   161: aload_1
    //   162: invokevirtual Zf : ()Lburp/Zr4u;
    //   165: aload #6
    //   167: invokespecial <init> : (Lburp/Zr4u;Lburp/Zxfy;)V
    //   170: astore #12
    //   172: new burp/Zbfl
    //   175: dup
    //   176: aload #5
    //   178: invokevirtual Ze : ()Lburp/Zsm1;
    //   181: new burp/Zgu8
    //   184: dup
    //   185: aload_3
    //   186: invokeinterface ZPo : ()I
    //   191: aload #6
    //   193: aload #12
    //   195: invokespecial <init> : (ILburp/Zxfy;Lburp/Zzkz;)V
    //   198: aload_1
    //   199: invokevirtual ZG : ()Lburp/Zto9;
    //   202: invokespecial <init> : (Lburp/Zsm1;Lburp/Zgu8;Lburp/Ztos;)V
    //   205: astore #13
    //   207: new burp/Zrj
    //   210: dup
    //   211: aload_3
    //   212: invokeinterface ZPo : ()I
    //   217: invokespecial <init> : (I)V
    //   220: astore #14
    //   222: aload #4
    //   224: aload_0
    //   225: getfield Zj : Lburp/Zra1;
    //   228: aload #10
    //   230: aload_3
    //   231: invokeinterface ZPo : ()I
    //   236: invokeinterface ZH : (Lburp/Zra1;Lburp/Zskh;I)Lburp/Zbuz;
    //   241: astore #15
    //   243: new burp/Zeg2
    //   246: dup
    //   247: aload #11
    //   249: aload #15
    //   251: invokespecial <init> : (Lburp/Zxgk;Lburp/Zbuz;)V
    //   254: astore #16
    //   256: new burp/Zeg2
    //   259: dup
    //   260: aload #11
    //   262: aload #15
    //   264: invokespecial <init> : (Lburp/Zxgk;Lburp/Zbuz;)V
    //   267: astore #17
    //   269: new burp/Zmc9
    //   272: dup
    //   273: aload #16
    //   275: aload #7
    //   277: aload #9
    //   279: new burp/Zttz
    //   282: dup
    //   283: aload #8
    //   285: aload_0
    //   286: getfield ZL : Lburp/Zr_h;
    //   289: invokespecial <init> : (Lburp/Ze97;Lburp/Zr_h;)V
    //   292: invokespecial <init> : (Lburp/Zk9e;Ljava/util/concurrent/locks/Lock;Lburp/Zx5d;Lburp/Zttz;)V
    //   295: astore #18
    //   297: new burp/Zswj
    //   300: dup
    //   301: aload #14
    //   303: aload #13
    //   305: aload #16
    //   307: aload #18
    //   309: aload #17
    //   311: invokespecial <init> : (Lburp/Zrj;Lburp/Zbfl;Lburp/Zk9e;Lburp/Zmc9;Lburp/Zk9e;)V
    //   314: astore #19
    //   316: new burp/Zzzv
    //   319: dup
    //   320: aload #4
    //   322: aload #8
    //   324: aload_1
    //   325: invokevirtual ZG : ()Lburp/Zto9;
    //   328: aload #19
    //   330: invokespecial <init> : (Lburp/Zrbm;Lburp/Ze97;Lburp/Zz1m;Lburp/Zswj;)V
    //   333: astore #20
    //   335: aload #8
    //   337: aload #19
    //   339: invokevirtual Zm : (Lburp/Zswj;)V
    //   342: new burp/Zvf8
    //   345: dup
    //   346: aload #9
    //   348: aload #8
    //   350: aload #7
    //   352: aload_1
    //   353: invokevirtual ZG : ()Lburp/Zto9;
    //   356: aload #11
    //   358: invokespecial <init> : (Lburp/Zx5d;Lburp/Ze97;Ljava/util/concurrent/locks/Lock;Lburp/Zlli;Lburp/Zxgk;)V
    //   361: astore #21
    //   363: new burp/Ztj1
    //   366: dup
    //   367: aload_3
    //   368: aload #4
    //   370: aload #5
    //   372: aload #9
    //   374: aload #13
    //   376: aload #18
    //   378: aload_0
    //   379: getfield ZU : Lburp/Zz4b;
    //   382: aload_0
    //   383: getfield ZY : Lburp/Zgu7;
    //   386: aload #6
    //   388: aload_1
    //   389: invokevirtual ZG : ()Lburp/Zto9;
    //   392: aload #21
    //   394: invokespecial <init> : (Lburp/Zgna;Lburp/Zrbm;Lburp/Zr5_;Lburp/Zx5d;Lburp/Zbfl;Lburp/Zmc9;Lburp/Zz4b;Lburp/Zgu7;Ljava/util/function/Supplier;Lburp/Zto9;Lburp/Zvf8;)V
    //   397: astore #22
    //   399: aload #15
    //   401: aload #22
    //   403: invokeinterface ZK : (Lburp/Ztj1;)V
    //   408: new burp/Zmfk
    //   411: dup
    //   412: aload #21
    //   414: aload #10
    //   416: invokespecial <init> : (Lburp/Zvf8;Lburp/Zskh;)V
    //   419: astore #23
    //   421: aload #9
    //   423: aload #23
    //   425: invokevirtual ZV : (Lburp/Zmfk;)V
    //   428: new burp/Zrdi
    //   431: dup
    //   432: aload #8
    //   434: aload #20
    //   436: aload_1
    //   437: invokevirtual ZG : ()Lburp/Zto9;
    //   440: aload #11
    //   442: invokespecial <init> : (Lburp/Ze97;Lburp/Zzzv;Lburp/Zlli;Lburp/Zxgk;)V
    //   445: astore #24
    //   447: aload_0
    //   448: getfield Zg : Lburp/Zb3k;
    //   451: aload #24
    //   453: invokevirtual ZE : (Lburp/Zrdi;)V
    //   456: aload #22
    //   458: invokevirtual Zr : ()Lburp/Ztos;
    //   461: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   464: aload_0
    //   465: aload #24
    //   467: <illegal opcode> accept : (Lburp/Zs4;Lburp/Zrdi;)Ljava/util/function/Consumer;
    //   472: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   475: pop
    //   476: invokestatic Zr : ()Lburp/Zts2;
    //   479: aload #22
    //   481: invokevirtual Zr : ()Lburp/Ztos;
    //   484: getstatic burp/Zt13.Zl : Lburp/Zlnb;
    //   487: aload #15
    //   489: <illegal opcode> accept : (Lburp/Zbuz;)Ljava/util/function/Consumer;
    //   494: invokevirtual Zz : (Lburp/Zlli;Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zts2;
    //   497: pop
    //   498: aload #5
    //   500: aload #22
    //   502: invokevirtual ZK : (Lburp/Ztj1;)V
    //   505: aload #22
    //   507: aload_2
    //   508: ifnull -> 518
    //   511: iconst_5
    //   512: anewarray burp/Zbqc
    //   515: invokestatic Zr : ([Lburp/Zbqc;)V
    //   518: areturn
  }
  
  private static void lambda$from$1(Zbuz paramZbuz, Zxr8 paramZxr8) {
    paramZbuz.ZD(new Zb6l(Zec4.TASK_TIMEOUT));
  }
  
  private void lambda$from$0(Zrdi paramZrdi, Zxr8 paramZxr8) {
    this.Zg.Zg(paramZrdi);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */