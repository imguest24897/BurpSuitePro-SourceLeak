package burp;

import burp.api.montoya.logger.LoggerHttpRequestResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zeic implements Zta4 {
  private final Zbz6 Za;
  
  private final Zs4l<LoggerHttpRequestResponse, Boolean> Zx;
  
  private final List<Zedo> ZS;
  
  private Zta4 Zu;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zeic(Zbz6 paramZbz6, Zs4l<LoggerHttpRequestResponse, Boolean> paramZs4l) {
    this.Za = paramZbz6;
    this.Zx = paramZs4l;
    this.ZS = new ArrayList<>();
  }
  
  public Zta4 ZA() {
    // Byte code:
    //   0: new burp/Zeic
    //   3: dup
    //   4: new burp/Z_5
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: aload_0
    //   12: getfield Zx : Lburp/Zs4l;
    //   15: invokespecial <init> : (Lburp/Zbz6;Lburp/Zs4l;)V
    //   18: astore_1
    //   19: aload_1
    //   20: aload_0
    //   21: invokevirtual Zx4 : ()Z
    //   24: invokevirtual ZbB : (Z)V
    //   27: aload_1
    //   28: aload_0
    //   29: invokevirtual Zxc : ()Z
    //   32: invokevirtual Zbl : (Z)V
    //   35: aload_1
    //   36: aload_0
    //   37: invokevirtual ZxI : ()Z
    //   40: invokevirtual ZbM : (Z)V
    //   43: aload_1
    //   44: aload_0
    //   45: invokevirtual Zxb : ()Z
    //   48: invokevirtual ZbU : (Z)V
    //   51: aload_1
    //   52: aload_0
    //   53: invokevirtual Zxf : ()Z
    //   56: invokevirtual ZK : (Z)V
    //   59: aload_1
    //   60: aload_0
    //   61: invokevirtual Zxr : ()Z
    //   64: invokevirtual ZbS : (Z)V
    //   67: aload_1
    //   68: aload_0
    //   69: invokevirtual Zr : ()Z
    //   72: invokevirtual ZbN : (Z)V
    //   75: aload_1
    //   76: aload_0
    //   77: invokevirtual Zxn : ()Z
    //   80: invokevirtual Zby : (Z)V
    //   83: aload_1
    //   84: aload_0
    //   85: invokevirtual ZxA : ()Z
    //   88: invokevirtual Zbi : (Z)V
    //   91: aload_1
    //   92: aload_0
    //   93: invokevirtual ZxV : ()Z
    //   96: invokevirtual Zbg : (Z)V
    //   99: aload_1
    //   100: aload_0
    //   101: invokevirtual ZxR : ()Z
    //   104: invokevirtual Zb8 : (Z)V
    //   107: aload_1
    //   108: aload_0
    //   109: invokevirtual Zxk : ()Z
    //   112: invokevirtual Zbn : (Z)V
    //   115: aload_1
    //   116: aload_0
    //   117: invokevirtual Zxo : ()Z
    //   120: invokevirtual ZbQ : (Z)V
    //   123: aload_1
    //   124: aload_0
    //   125: invokevirtual Zf : ()Z
    //   128: invokevirtual Zb3 : (Z)V
    //   131: aload_1
    //   132: aload_0
    //   133: invokevirtual ZxQ : ()Z
    //   136: invokevirtual ZbO : (Z)V
    //   139: invokestatic Zc : ()Ljava/util/List;
    //   142: aload_0
    //   143: aload_1
    //   144: <illegal opcode> accept : (Lburp/Zeic;Lburp/Zeic;)Ljava/util/function/Consumer;
    //   149: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   154: aload_1
    //   155: aload_0
    //   156: invokevirtual Zbo : ()Ljava/lang/String;
    //   159: invokevirtual Zy : (Ljava/lang/String;)V
    //   162: aload_1
    //   163: aload_0
    //   164: invokevirtual ZbK : ()Z
    //   167: invokevirtual ZX : (Z)V
    //   170: aload_1
    //   171: aload_0
    //   172: invokevirtual Zb1 : ()Z
    //   175: invokevirtual Zu : (Z)V
    //   178: aload_1
    //   179: aload_0
    //   180: invokevirtual Zbz : ()Z
    //   183: invokevirtual Zba : (Z)V
    //   186: aload_1
    //   187: aload_0
    //   188: invokevirtual Zxx : ()Z
    //   191: invokevirtual ZbE : (Z)V
    //   194: aload_1
    //   195: aload_0
    //   196: invokevirtual Zxw : ()Ljava/lang/String;
    //   199: invokevirtual ZH : (Ljava/lang/String;)V
    //   202: aload_1
    //   203: aload_0
    //   204: invokevirtual Zx5 : ()Z
    //   207: invokevirtual Zy : (Z)V
    //   210: aload_1
    //   211: aload_0
    //   212: invokevirtual ZxB : ()Ljava/lang/String;
    //   215: invokevirtual ZF : (Ljava/lang/String;)V
    //   218: aload_1
    //   219: aload_0
    //   220: invokevirtual ZxU : ()Z
    //   223: invokevirtual ZbL : (Z)V
    //   226: aload_1
    //   227: aload_0
    //   228: invokevirtual ZxO : ()Z
    //   231: invokevirtual Zbc : (Z)V
    //   234: aload_1
    //   235: aload_0
    //   236: invokevirtual ZS : ()Ljava/lang/String;
    //   239: invokevirtual ZU : (Ljava/lang/String;)V
    //   242: aload_1
    //   243: aload_0
    //   244: invokevirtual Zb : ()Lburp/Zzca;
    //   247: invokevirtual Zw : (Lburp/Zzca;)V
    //   250: aload_1
    //   251: areturn
  }
  
  public boolean Zx4() {
    return this.Za.ZeU();
  }
  
  public void ZbB(boolean paramBoolean) {
    this.Za.Zrc(paramBoolean);
  }
  
  public boolean ZxI() {
    return this.Za.ZeM();
  }
  
  public void ZbM(boolean paramBoolean) {
    this.Za.Zrn(paramBoolean);
  }
  
  public boolean Zxb() {
    return this.Za.Zeb();
  }
  
  public void ZbU(boolean paramBoolean) {
    this.Za.Zro(paramBoolean);
  }
  
  public boolean Zxf() {
    return this.Za.ZeR();
  }
  
  public void ZK(boolean paramBoolean) {
    this.Za.ZrH(paramBoolean);
  }
  
  public boolean Zxr() {
    return this.Za.ZeH();
  }
  
  public void ZbS(boolean paramBoolean) {
    this.Za.ZrK(paramBoolean);
  }
  
  public boolean Zr() {
    return this.Za.ZeA();
  }
  
  public void ZbN(boolean paramBoolean) {
    this.Za.Zr2(paramBoolean);
  }
  
  public boolean Zxn() {
    return this.Za.ZeL();
  }
  
  public void Zby(boolean paramBoolean) {
    this.Za.ZrL(paramBoolean);
  }
  
  public boolean ZxA() {
    return this.Za.Zel();
  }
  
  public void Zbi(boolean paramBoolean) {
    this.Za.ZrG(paramBoolean);
  }
  
  public boolean ZxV() {
    return this.Za.ZeN();
  }
  
  public void Zbg(boolean paramBoolean) {
    this.Za.Zrk(paramBoolean);
  }
  
  public boolean ZxR() {
    return this.Za.Zea();
  }
  
  public void Zb8(boolean paramBoolean) {
    this.Za.Zrf(paramBoolean);
  }
  
  public boolean Zxk() {
    return this.Za.Zev();
  }
  
  public void Zbn(boolean paramBoolean) {
    this.Za.ZrS(paramBoolean);
  }
  
  public boolean Zxo() {
    return this.Za.Zeh();
  }
  
  public void ZbQ(boolean paramBoolean) {
    this.Za.Zru(paramBoolean);
  }
  
  public boolean Zf() {
    return this.Za.Zet();
  }
  
  public void Zb3(boolean paramBoolean) {
    this.Za.ZrP(paramBoolean);
  }
  
  public boolean ZxQ() {
    return this.Za.Zee();
  }
  
  public void ZbO(boolean paramBoolean) {
    this.Za.Zrq(paramBoolean);
  }
  
  public List<Zeew> ZY() {
    return (List<Zeew>)Zeew.Zc().stream().filter(this::lambda$getToolsToHide$1).collect(Collectors.toList());
  }
  
  public String Zbo() {
    return this.Za.Ze6();
  }
  
  public void Zy(String paramString) {
    this.Za.ZwM(paramString);
  }
  
  public boolean ZbK() {
    return this.Za.ZeC();
  }
  
  public void ZX(boolean paramBoolean) {
    this.Za.ZrR(paramBoolean);
  }
  
  public boolean Zbz() {
    return this.Za.ZeI();
  }
  
  public void Zba(boolean paramBoolean) {
    this.Za.Zr_(paramBoolean);
  }
  
  public boolean Zb1() {
    return this.Za.Zes();
  }
  
  public void Zu(boolean paramBoolean) {
    this.Za.Zrv(paramBoolean);
  }
  
  public boolean Zxx() {
    return this.Za.ZeT();
  }
  
  public void ZbE(boolean paramBoolean) {
    this.Za.Zrb(paramBoolean);
  }
  
  public String Zxw() {
    return this.Za.Zez();
  }
  
  public void ZH(String paramString) {
    this.Za.Zw3(paramString);
  }
  
  public boolean Zx5() {
    return this.Za.ZeW();
  }
  
  public void Zy(boolean paramBoolean) {
    this.Za.ZrO(paramBoolean);
  }
  
  public String ZxB() {
    return this.Za.ZeS();
  }
  
  public void ZF(String paramString) {
    this.Za.ZwA(paramString);
  }
  
  public boolean ZxU() {
    return this.Za.ZeQ();
  }
  
  public void ZbL(boolean paramBoolean) {
    this.Za.Zrz(paramBoolean);
  }
  
  public boolean ZxO() {
    return this.Za.Zem();
  }
  
  public void Zbc(boolean paramBoolean) {
    this.Za.ZrM(paramBoolean);
  }
  
  public boolean Zb(Zeew paramZeew) {
    return this.Za.ZE(paramZeew);
  }
  
  public void Zr(Zeew paramZeew, boolean paramBoolean) {
    this.Za.Z_(paramZeew, paramBoolean);
  }
  
  public boolean Zxc() {
    return this.Za.Ze5();
  }
  
  public void Zbl(boolean paramBoolean) {
    this.Za.Zrt(paramBoolean);
  }
  
  public String ZS() {
    return this.Za.Zeu();
  }
  
  public void ZU(String paramString) {
    this.Za.ZwE(paramString);
    this.Zx.ZC(paramString);
  }
  
  public Zzca Zb() {
    return this.Za.ZeJ();
  }
  
  public void Zw(Zzca paramZzca) {
    this.Za.ZD(paramZzca);
  }
  
  public void ZxG() {
    this.Zu = ZA();
  }
  
  public void Zv(Zedo paramZedo) {
    this.ZS.add(paramZedo);
  }
  
  public void Zm(Zzkg paramZzkg) {
    this.Zx.Zm(paramZzkg);
  }
  
  public void Zf(Zklo paramZklo) {
    this.Zx.Zf(paramZklo);
  }
  
  public boolean Zx3() {
    return (this.Zu == null || Zx4() != this.Zu.Zx4() || Zxc() != this.Zu.Zxc() || ZxI() != this.Zu.ZxI() || Zxb() != this.Zu.Zxb() || Zxf() != this.Zu.Zxf() || Zxr() != this.Zu.Zxr() || Zr() != this.Zu.Zr() || Zxn() != this.Zu.Zxn() || ZxA() != this.Zu.ZxA() || ZxV() != this.Zu.ZxV() || ZxR() != this.Zu.ZxR() || Zxk() != this.Zu.Zxk() || Zxo() != this.Zu.Zxo() || Zf() != this.Zu.Zf() || ZxQ() != this.Zu.ZxQ() || Zeew.Zc().stream().anyMatch(this::lambda$hasFilterChanged$2) || !Zsw8.Zn(Zbo(), this.Zu.Zbo()) || ZbK() != this.Zu.ZbK() || Zbz() != this.Zu.Zbz() || Zb1() != this.Zu.Zb1() || Zxx() != this.Zu.Zxx() || !Zsw8.Zn(Zxw(), this.Zu.Zxw()) || Zx5() != this.Zu.Zx5() || !Zsw8.Zn(ZxB(), this.Zu.ZxB()) || ZxU() != this.Zu.ZxU() || ZxO() != this.Zu.ZxO() || !Zsw8.Zn(ZS(), this.Zu.ZS()) || Zb() != this.Zu.Zb());
  }
  
  public void Zd(Zmf_ paramZmf_) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZK : ()V
    //   6: aload_0
    //   7: aload_1
    //   8: sipush #-11532
    //   11: sipush #3537
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: aload_0
    //   18: invokevirtual Zx4 : ()Z
    //   21: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   26: invokevirtual ZbB : (Z)V
    //   29: invokestatic ZR : ()Z
    //   32: aload_0
    //   33: aload_1
    //   34: sipush #-11525
    //   37: sipush #19863
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: aload_0
    //   44: invokevirtual Zxc : ()Z
    //   47: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   52: invokevirtual Zbl : (Z)V
    //   55: aload_0
    //   56: aload_1
    //   57: sipush #-11541
    //   60: sipush #-22444
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: aload_0
    //   67: invokevirtual ZxI : ()Z
    //   70: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   75: invokevirtual ZbM : (Z)V
    //   78: aload_0
    //   79: aload_1
    //   80: sipush #-11524
    //   83: sipush #-8064
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: aload_0
    //   90: invokevirtual Zxb : ()Z
    //   93: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   98: invokevirtual ZbU : (Z)V
    //   101: aload_0
    //   102: aload_1
    //   103: sipush #-11572
    //   106: sipush #10991
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: aload_0
    //   113: invokevirtual Zxf : ()Z
    //   116: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   121: invokevirtual ZK : (Z)V
    //   124: aload_0
    //   125: aload_1
    //   126: sipush #-11543
    //   129: sipush #-6318
    //   132: invokestatic a : (II)Ljava/lang/String;
    //   135: aload_0
    //   136: invokevirtual Zxr : ()Z
    //   139: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   144: invokevirtual ZbS : (Z)V
    //   147: aload_0
    //   148: aload_1
    //   149: sipush #-11545
    //   152: sipush #28270
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: aload_0
    //   159: invokevirtual Zr : ()Z
    //   162: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   167: invokevirtual ZbN : (Z)V
    //   170: aload_0
    //   171: aload_1
    //   172: sipush #-11552
    //   175: sipush #9393
    //   178: invokestatic a : (II)Ljava/lang/String;
    //   181: aload_0
    //   182: invokevirtual Zxn : ()Z
    //   185: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   190: invokevirtual Zby : (Z)V
    //   193: aload_0
    //   194: aload_1
    //   195: sipush #-11535
    //   198: sipush #32604
    //   201: invokestatic a : (II)Ljava/lang/String;
    //   204: aload_0
    //   205: invokevirtual ZxA : ()Z
    //   208: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   213: invokevirtual Zbi : (Z)V
    //   216: aload_0
    //   217: aload_1
    //   218: sipush #-11539
    //   221: sipush #28565
    //   224: invokestatic a : (II)Ljava/lang/String;
    //   227: aload_0
    //   228: invokevirtual ZxV : ()Z
    //   231: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   236: invokevirtual Zbg : (Z)V
    //   239: aload_0
    //   240: aload_1
    //   241: sipush #-11570
    //   244: sipush #21222
    //   247: invokestatic a : (II)Ljava/lang/String;
    //   250: aload_0
    //   251: invokevirtual ZxR : ()Z
    //   254: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   259: invokevirtual Zb8 : (Z)V
    //   262: aload_0
    //   263: aload_1
    //   264: sipush #-11538
    //   267: sipush #-23910
    //   270: invokestatic a : (II)Ljava/lang/String;
    //   273: aload_0
    //   274: invokevirtual Zxk : ()Z
    //   277: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   282: invokevirtual Zbn : (Z)V
    //   285: aload_0
    //   286: aload_1
    //   287: sipush #-11581
    //   290: sipush #8834
    //   293: invokestatic a : (II)Ljava/lang/String;
    //   296: aload_0
    //   297: invokevirtual Zxo : ()Z
    //   300: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   305: invokevirtual ZbQ : (Z)V
    //   308: aload_0
    //   309: aload_1
    //   310: sipush #-11528
    //   313: sipush #-11068
    //   316: invokestatic a : (II)Ljava/lang/String;
    //   319: aload_0
    //   320: invokevirtual Zf : ()Z
    //   323: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   328: invokevirtual Zb3 : (Z)V
    //   331: aload_0
    //   332: aload_1
    //   333: sipush #-11551
    //   336: sipush #28553
    //   339: invokestatic a : (II)Ljava/lang/String;
    //   342: aload_0
    //   343: invokevirtual ZxQ : ()Z
    //   346: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   351: invokevirtual ZbO : (Z)V
    //   354: invokestatic Zc : ()Ljava/util/List;
    //   357: aload_0
    //   358: aload_1
    //   359: <illegal opcode> accept : (Lburp/Zeic;Lburp/Zmf_;)Ljava/util/function/Consumer;
    //   364: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   369: aload_0
    //   370: aload_1
    //   371: sipush #-11544
    //   374: sipush #-12792
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: aload_0
    //   381: invokevirtual Zbo : ()Ljava/lang/String;
    //   384: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   389: invokevirtual Zy : (Ljava/lang/String;)V
    //   392: aload_0
    //   393: aload_1
    //   394: sipush #-11576
    //   397: sipush #-26307
    //   400: invokestatic a : (II)Ljava/lang/String;
    //   403: aload_0
    //   404: invokevirtual ZbK : ()Z
    //   407: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   412: invokevirtual ZX : (Z)V
    //   415: aload_0
    //   416: aload_1
    //   417: sipush #-11542
    //   420: sipush #-13138
    //   423: invokestatic a : (II)Ljava/lang/String;
    //   426: aload_0
    //   427: invokevirtual Zbz : ()Z
    //   430: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   435: invokevirtual Zba : (Z)V
    //   438: aload_0
    //   439: aload_1
    //   440: sipush #-11573
    //   443: sipush #-9222
    //   446: invokestatic a : (II)Ljava/lang/String;
    //   449: aload_0
    //   450: invokevirtual Zb1 : ()Z
    //   453: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   458: invokevirtual Zu : (Z)V
    //   461: aload_0
    //   462: aload_1
    //   463: sipush #-11537
    //   466: sipush #-23012
    //   469: invokestatic a : (II)Ljava/lang/String;
    //   472: aload_0
    //   473: invokevirtual Zxx : ()Z
    //   476: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   481: invokevirtual ZbE : (Z)V
    //   484: istore_2
    //   485: aload_1
    //   486: sipush #-11530
    //   489: sipush #-894
    //   492: invokestatic a : (II)Ljava/lang/String;
    //   495: invokeinterface Ze : (Ljava/lang/String;)Ljava/util/List;
    //   500: astore_3
    //   501: aload_3
    //   502: ifnull -> 524
    //   505: aload_3
    //   506: ldc ','
    //   508: invokestatic Zf : (Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;
    //   511: astore #4
    //   513: aload_0
    //   514: getfield Za : Lburp/Zbz6;
    //   517: aload #4
    //   519: invokeinterface Zw3 : (Ljava/lang/String;)V
    //   524: aload_0
    //   525: aload_0
    //   526: invokevirtual Zxx : ()Z
    //   529: ifne -> 558
    //   532: aload_1
    //   533: sipush #-11522
    //   536: sipush #-27624
    //   539: invokestatic a : (II)Ljava/lang/String;
    //   542: aload_0
    //   543: invokevirtual Zx5 : ()Z
    //   546: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   551: ifeq -> 558
    //   554: iconst_1
    //   555: goto -> 559
    //   558: iconst_0
    //   559: invokevirtual Zy : (Z)V
    //   562: aload_1
    //   563: sipush #-11583
    //   566: sipush #-13648
    //   569: invokestatic a : (II)Ljava/lang/String;
    //   572: invokeinterface Ze : (Ljava/lang/String;)Ljava/util/List;
    //   577: astore_3
    //   578: aload_3
    //   579: ifnull -> 601
    //   582: aload_3
    //   583: ldc ','
    //   585: invokestatic Zf : (Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;
    //   588: astore #4
    //   590: aload_0
    //   591: getfield Za : Lburp/Zbz6;
    //   594: aload #4
    //   596: invokeinterface ZwA : (Ljava/lang/String;)V
    //   601: aload_0
    //   602: aload_1
    //   603: sipush #-11531
    //   606: sipush #16097
    //   609: invokestatic a : (II)Ljava/lang/String;
    //   612: aload_0
    //   613: invokevirtual ZxU : ()Z
    //   616: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   621: invokevirtual ZbL : (Z)V
    //   624: aload_0
    //   625: aload_1
    //   626: sipush #-11550
    //   629: sipush #-11067
    //   632: invokestatic a : (II)Ljava/lang/String;
    //   635: aload_0
    //   636: invokevirtual ZxO : ()Z
    //   639: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   644: invokevirtual Zbc : (Z)V
    //   647: aload_0
    //   648: getfield Za : Lburp/Zbz6;
    //   651: aload_1
    //   652: sipush #-11521
    //   655: sipush #-3852
    //   658: invokestatic a : (II)Ljava/lang/String;
    //   661: aload_0
    //   662: invokevirtual ZS : ()Ljava/lang/String;
    //   665: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   670: invokeinterface ZwE : (Ljava/lang/String;)V
    //   675: aload_1
    //   676: sipush #-11575
    //   679: sipush #-11625
    //   682: invokestatic a : (II)Ljava/lang/String;
    //   685: getstatic burp/Zzca.SETTINGS : Lburp/Zzca;
    //   688: invokevirtual name : ()Ljava/lang/String;
    //   691: getstatic burp/Zzca.BAMBDA : Lburp/Zzca;
    //   694: invokevirtual name : ()Ljava/lang/String;
    //   697: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   700: aload_0
    //   701: invokevirtual Zb : ()Lburp/Zzca;
    //   704: invokevirtual ZY : ()B
    //   707: invokeinterface ZM : (Ljava/lang/String;Ljava/util/List;I)I
    //   712: i2b
    //   713: istore #4
    //   715: aload_0
    //   716: getfield Za : Lburp/Zbz6;
    //   719: iload #4
    //   721: invokestatic Zy : (B)Lburp/Zzca;
    //   724: invokeinterface ZD : (Lburp/Zzca;)V
    //   729: aload_1
    //   730: invokeinterface Zb : ()Z
    //   735: ifeq -> 742
    //   738: aload_0
    //   739: invokevirtual Zfg : ()V
    //   742: iload_2
    //   743: ifeq -> 753
    //   746: iconst_3
    //   747: anewarray burp/Zbqc
    //   750: invokestatic Zr : ([Lburp/Zbqc;)V
    //   753: return
  }
  
  public void Zl(Zg4j paramZg4j) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #-11533
    //   4: sipush #-32083
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: aload_0
    //   11: invokevirtual Zx4 : ()Z
    //   14: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   19: invokestatic ZR : ()Z
    //   22: aload_1
    //   23: sipush #-11529
    //   26: sipush #-21458
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: aload_0
    //   33: invokevirtual Zxc : ()Z
    //   36: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   41: istore_2
    //   42: aload_1
    //   43: sipush #-11534
    //   46: sipush #-19829
    //   49: invokestatic a : (II)Ljava/lang/String;
    //   52: aload_0
    //   53: invokevirtual ZxI : ()Z
    //   56: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   61: aload_1
    //   62: sipush #-11558
    //   65: sipush #-12351
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: aload_0
    //   72: invokevirtual Zxb : ()Z
    //   75: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   80: aload_1
    //   81: sipush #-11559
    //   84: sipush #1840
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: aload_0
    //   91: invokevirtual Zxf : ()Z
    //   94: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   99: aload_1
    //   100: sipush #-11578
    //   103: sipush #4969
    //   106: invokestatic a : (II)Ljava/lang/String;
    //   109: aload_0
    //   110: invokevirtual Zxr : ()Z
    //   113: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   118: aload_1
    //   119: sipush #-11574
    //   122: sipush #17074
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: aload_0
    //   129: invokevirtual Zr : ()Z
    //   132: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   137: aload_1
    //   138: sipush #-11571
    //   141: sipush #6203
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: aload_0
    //   148: invokevirtual Zxn : ()Z
    //   151: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   156: aload_1
    //   157: sipush #-11577
    //   160: sipush #-13511
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: aload_0
    //   167: invokevirtual ZxA : ()Z
    //   170: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   175: aload_1
    //   176: sipush #-11527
    //   179: sipush #-30600
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: aload_0
    //   186: invokevirtual ZxV : ()Z
    //   189: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   194: aload_1
    //   195: sipush #-11540
    //   198: sipush #-15186
    //   201: invokestatic a : (II)Ljava/lang/String;
    //   204: aload_0
    //   205: invokevirtual ZxR : ()Z
    //   208: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   213: aload_1
    //   214: sipush #-11546
    //   217: sipush #16967
    //   220: invokestatic a : (II)Ljava/lang/String;
    //   223: aload_0
    //   224: invokevirtual Zxk : ()Z
    //   227: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   232: aload_1
    //   233: sipush #-11547
    //   236: sipush #-2296
    //   239: invokestatic a : (II)Ljava/lang/String;
    //   242: aload_0
    //   243: invokevirtual Zxo : ()Z
    //   246: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   251: aload_1
    //   252: sipush #-11526
    //   255: sipush #-31813
    //   258: invokestatic a : (II)Ljava/lang/String;
    //   261: aload_0
    //   262: invokevirtual Zf : ()Z
    //   265: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   270: aload_1
    //   271: sipush #-11584
    //   274: sipush #14933
    //   277: invokestatic a : (II)Ljava/lang/String;
    //   280: aload_0
    //   281: invokevirtual ZxQ : ()Z
    //   284: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   289: invokestatic Zc : ()Ljava/util/List;
    //   292: aload_0
    //   293: aload_1
    //   294: <illegal opcode> accept : (Lburp/Zeic;Lburp/Zg4j;)Ljava/util/function/Consumer;
    //   299: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   304: aload_1
    //   305: sipush #-11536
    //   308: sipush #30128
    //   311: invokestatic a : (II)Ljava/lang/String;
    //   314: aload_0
    //   315: invokevirtual Zbo : ()Ljava/lang/String;
    //   318: invokeinterface Za : (Ljava/lang/String;Ljava/lang/String;)V
    //   323: aload_1
    //   324: sipush #-11557
    //   327: sipush #-12402
    //   330: invokestatic a : (II)Ljava/lang/String;
    //   333: aload_0
    //   334: invokevirtual ZbK : ()Z
    //   337: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   342: aload_1
    //   343: sipush #-11523
    //   346: sipush #-30229
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aload_0
    //   353: invokevirtual Zbz : ()Z
    //   356: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   361: aload_1
    //   362: sipush #-11580
    //   365: sipush #-26357
    //   368: invokestatic a : (II)Ljava/lang/String;
    //   371: aload_0
    //   372: invokevirtual Zb1 : ()Z
    //   375: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   380: aload_1
    //   381: sipush #-11548
    //   384: sipush #20024
    //   387: invokestatic a : (II)Ljava/lang/String;
    //   390: aload_0
    //   391: invokevirtual Zxx : ()Z
    //   394: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   399: aload_1
    //   400: sipush #-11569
    //   403: sipush #25573
    //   406: invokestatic a : (II)Ljava/lang/String;
    //   409: invokeinterface ZP : (Ljava/lang/String;)Lburp/Zzqw;
    //   414: astore_3
    //   415: aload_0
    //   416: getfield Za : Lburp/Zbz6;
    //   419: invokeinterface Zez : ()Ljava/lang/String;
    //   424: ldc ','
    //   426: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   429: astore #4
    //   431: aload #4
    //   433: arraylength
    //   434: istore #5
    //   436: iconst_0
    //   437: istore #6
    //   439: iload #6
    //   441: iload #5
    //   443: if_icmpge -> 481
    //   446: aload #4
    //   448: iload #6
    //   450: aaload
    //   451: astore #7
    //   453: aload #7
    //   455: invokevirtual isEmpty : ()Z
    //   458: ifne -> 474
    //   461: aload_3
    //   462: new burp/Zzqs
    //   465: dup
    //   466: aload #7
    //   468: invokespecial <init> : (Ljava/lang/String;)V
    //   471: invokevirtual Zx : (Lburp/Zlwx;)V
    //   474: iinc #6, 1
    //   477: iload_2
    //   478: ifeq -> 439
    //   481: aload_1
    //   482: sipush #-11579
    //   485: sipush #-17262
    //   488: invokestatic a : (II)Ljava/lang/String;
    //   491: aload_0
    //   492: invokevirtual Zx5 : ()Z
    //   495: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   500: aload_1
    //   501: sipush #-11554
    //   504: sipush #-30138
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: invokeinterface ZP : (Ljava/lang/String;)Lburp/Zzqw;
    //   515: astore #4
    //   517: aload_0
    //   518: getfield Za : Lburp/Zbz6;
    //   521: invokeinterface ZeS : ()Ljava/lang/String;
    //   526: ldc ','
    //   528: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   531: astore #5
    //   533: aload #5
    //   535: arraylength
    //   536: istore #6
    //   538: iconst_0
    //   539: istore #7
    //   541: iload #7
    //   543: iload #6
    //   545: if_icmpge -> 584
    //   548: aload #5
    //   550: iload #7
    //   552: aaload
    //   553: astore #8
    //   555: aload #8
    //   557: invokevirtual isEmpty : ()Z
    //   560: ifne -> 577
    //   563: aload #4
    //   565: new burp/Zzqs
    //   568: dup
    //   569: aload #8
    //   571: invokespecial <init> : (Ljava/lang/String;)V
    //   574: invokevirtual Zx : (Lburp/Zlwx;)V
    //   577: iinc #7, 1
    //   580: iload_2
    //   581: ifeq -> 541
    //   584: aload_1
    //   585: sipush #-11560
    //   588: sipush #29956
    //   591: invokestatic a : (II)Ljava/lang/String;
    //   594: aload_0
    //   595: invokevirtual ZxU : ()Z
    //   598: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   603: aload_1
    //   604: sipush #-11549
    //   607: sipush #-18856
    //   610: invokestatic a : (II)Ljava/lang/String;
    //   613: aload_0
    //   614: invokevirtual ZxO : ()Z
    //   617: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   622: aload_1
    //   623: sipush #-11582
    //   626: sipush #25161
    //   629: invokestatic a : (II)Ljava/lang/String;
    //   632: aload_0
    //   633: invokevirtual ZS : ()Ljava/lang/String;
    //   636: invokeinterface Za : (Ljava/lang/String;Ljava/lang/String;)V
    //   641: aload_1
    //   642: sipush #-11553
    //   645: sipush #-21860
    //   648: invokestatic a : (II)Ljava/lang/String;
    //   651: getstatic burp/Zzca.SETTINGS : Lburp/Zzca;
    //   654: invokevirtual name : ()Ljava/lang/String;
    //   657: getstatic burp/Zzca.BAMBDA : Lburp/Zzca;
    //   660: invokevirtual name : ()Ljava/lang/String;
    //   663: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   666: aload_0
    //   667: invokevirtual Zb : ()Lburp/Zzca;
    //   670: invokevirtual ZY : ()B
    //   673: invokeinterface Zr : (Ljava/lang/String;Ljava/util/List;I)V
    //   678: return
  }
  
  private void Zfg() {
    boolean bool = Zrse.Z_();
    for (Zedo zedo : this.ZS) {
      zedo.Zt2();
      if (!bool)
        break; 
    } 
  }
  
  private void lambda$saveBurpConfiguration$4(Zg4j paramZg4j, Zeew paramZeew) {
    paramZg4j.Zh(paramZeew.loggerDisplayFilterProjectConfigKey, this.Za.ZE(paramZeew));
  }
  
  private void lambda$loadBurpConfiguration$3(Zmf_ paramZmf_, Zeew paramZeew) {
    Zr(paramZeew, paramZmf_.ZC(paramZeew.loggerDisplayFilterProjectConfigKey, Zb(paramZeew)));
  }
  
  private boolean lambda$hasFilterChanged$2(Zeew paramZeew) {
    return (Zb(paramZeew) != this.Zu.Zb(paramZeew));
  }
  
  private boolean lambda$getToolsToHide$1(Zeew paramZeew) {
    return !Zb(paramZeew);
  }
  
  private void lambda$createCopy$0(Zeic paramZeic, Zeew paramZeew) {
    paramZeic.Zr(paramZeew, Zb(paramZeew));
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¿9¦?!>g!½ÆÐgqé:->Ò_ûHz%Ì²ìÚn}º,Ò8TU¿nÃFW´GXìh»NÐt¥å±¨&l³Çs²ÍRø£~ âgnË¥ñÜ^òf\ðq]÷Ó©¶ÙhÖöD-ùÎZ¥]ÐC(Ã$ûÅ!êõEKq*ÈûåÀ×î³¤Þ%7ÌeÙ}Èj¤D+f/û+{}v(Sç\\rCÊmM½ÐÀP@  0ÂtG$&+Ó½ÐwçòÚè-Ü¬Å¢vPÖÿ¼Æ2¿ù:W{¶%u¡·Q{ä1º²ËÁ(jêo[z¿:Ñ×dÍB½PBÓ0qaG7üöæ©0¥YÎ·ÇkõQÒw½1þ#ûlö Ï¾ÄÑS4i¿9G?>à!MÆÎg²éB-1Òl_ÇHã).©P? )»2¯ì5`­3ò¢L"6ÌLu-9¿yÀá$v]MàK{Ößëë\\n7D¬+E$´áÿ}èw·.ÇF.?ë#¤ªMçp¿è¦ÿ³@\\r·±A»-=°çÊÕæ´we©\\f¡éCj}SpNÚW±oùÿ>?E,K÷q÷"áÅÓun¾´ ÜÑ-y£K(mmx¬Î0ë&t³;tAï©Aá|0ùò\\tL ãA2/$»³¹r/»<4a×ÎfØÉ)RYOaJ7i´¡RQUd¿/Ù%Æ¯ç²8C[D- ¢Zch¨øÌ\Ú\\r<ìÆÈHnCÈ"ºAj«nÍ´-Ü8ùVm%¥f-|Ñôæ)\\tfÇÔüñ*C<Íæó{Òìyþ~¦¨Iwx¼àµ!+ x^8¸Îñ?o:æSÌî(ØO¸ò7\\fjE(·¯8Z¨²èQ%û:p"PsÄj¸ÉTßÛè\\tÂX/Aàb¿\×²v³ºhÊâ2K×ÃômârKÃWkq8ZôË\\f-ûì!ªêQEßq¸ÈFû¯ÀÇ³z%¥Ý7BæúVWÀ»Jkúw-L|×¸4\\n±§g}ªWEß8þM|¬²u¡ÿb¡j `ãb|ÛB7îÑ>z24ñdY3@c|úøèà0S0Ó4]î#®Æ)?;ÿHÕi}«æÕºi^°R¥o)[-u=ðÐ7¥ÕåXÛ´b»;=bíï¸À;ñ6h+/mü¢pvYÓ-3{8XÉ!ýÁYiÉJ"ÕPªs"$AÎÂQ\\n¦±¯;<p_¤+ig\\n¬5\\nÎî-Ù½În+'OìåÅÆòÝ#kèi°}Ö>p?Ñ-ß½S÷ó##"^ß6tÖ\\röÈ+&@Õ·Ñó.n¼ºÝRéÛ2"ö,XN<øÆó>/%;fsÜì¨_°ð6LJM,¶/J(òøR ïÉ.½yä7i?nÂôçõùª/,ÏW³Isí¶ÈZêm*.ÀÜzT¶N çF¶ìáS8ròò`9³Ls~Ê¸(á3\\t R6m®%½8\\rw\\fì½gô5æñ(½\\rþòú¥ÁGIL\\få4#>oJ³~¸Ë8ÒáÞd«a!USàoVNÎåk­\\fÅîÚ®iòEÖÀyÂõR°ÖªVHøä¨o¢ª$¯ÝÂu\¶~ÀÿúOéwÖ¤y±vCBy X\\t.­úëh³\\tnÔÙdjn*r.KÑyCX"bÚl\\tåE£ºï@%¢d©¸çù2p9#ùæq:¥zd[ä\\bKy2Ê'-ú8°l{ÝBÇ±÷^«ÜBÈ2Gq&*Ü°BU®û7Yh.ÕZÍ¼j4IªDø-}ÖýÛ7\\bDýV¥1¬Õ"ý$x:¾ò:Wn9ÄºØÏGd^>\àÕ+taÙx^¬ýþºËG Jö}d>a¦\»é§|Y,¤hä ()Få¿üÿ­Ñ­¶NÎ:n =8#YSån¤8MDOÙ\ÞàÞ\\bËxEÄâ;K@µi:Æ\\r`*WåØä÷ÆtEÌVï¥×\\nÖÚ#þ+hS'¤àéH~ï´\ý«Á\\fOËì3>}çýp{kpÇÀW2K×ª+/T3ÔQT.0EùX½`²Fz¿òêýXdd +^o.³ÄlÝñ]oß%¬O¢'PüÿF¼.Æ'¿[nÝÌ{%0¡*·SæëÙa!ºî`\\bzôÝ4êd:3,c|Kø#>××K»j4Ng<èè*^£4mí¨©L×Ãÿ2\]«ùùûZ`áÂOªC¹puÁêF}w'd\\b2õàÖÒÞB.ÔxW°$rý9õ"ôçÜèøOÏîÁwÀb50yO*Ë¥¥Ü£.®E¿¬ï`$Ob¸®pjeH¸nTºRLjÛÁ¿]èÓm)å«·Lbk2Jm,Wj «EÏM¬F±Ç|ýÅ££&ø zå-²ºübùsxªÀpsÑ#JÕÒGÞZâÇ¦Gì*hÃN1tå6¨Öl­Ç°ªZ©û-tù¤æ×:«¥)d1_ä¡~Ê/ÚÆ8Qo\\fyË²1æ)-B¾ë;¾R1Ä'ëái,TòÀ[RÈO$j§.¥êTÉÀ¤zÅWë§N2Ýwuê¶¨Vÿéú)O\ÁÖry^òm»Ùi¦Â¿OfC4ä°áºF8ºçf+¥kêZOjÀtIlN2¢C@xqxd\\nÆâÃ|*/\\n+îrä`a\\n´.C©6\\bD}úì¹ÌÕþ´¥¤)ãoy§ï±¯º129ìé2*ï o&e8\-/sµ0È4sù-ÙôÙùT¢ª#a©0Ý­Å9K\\fºFó4 µ¿Îæ5Òp9N#Ñãq±z4[¥\\b±KyÞ'¯úh°f]SÝ\Æ'¢<PM8\,å.uy[ö(8TåíÖeÎ¼ à^+07"4[,¥*£Þs&bûé²%Ój$zJKQóÐKñª5A¶Q¡`1FÍ:2<µ°Å²¹þ=!(z2B(½Üô}ÏM¸ÇèjiHgªûr£/øÞCß .N{i]\\r¢ÖáØP,\ÇuÁ7[Gj\\b¸.äõÂ5ÊS)öt<é8VÞP¢}ªö*þS&ÛKµÆ¡ À.í#ðò'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #46
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #18
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
    //   68: ldc 'ËÑ ö®ÝúOfý]ö6-$CéÝÎGòÐ¶qÏ³_,E¹ò»ÇóîTCk!î¨uÔh<¨t)´´ß\\bçÿ}CXÄé~²N5&á'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #50
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #79
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
    //   129: putstatic burp/Zeic.b : [Ljava/lang/String;
    //   132: bipush #54
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zeic.c : [Ljava/lang/String;
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
    //   212: bipush #85
    //   214: goto -> 244
    //   217: bipush #46
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #71
    //   229: goto -> 244
    //   232: bipush #52
    //   234: goto -> 244
    //   237: bipush #69
    //   239: goto -> 244
    //   242: bipush #41
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD2EA) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 65;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeic.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */