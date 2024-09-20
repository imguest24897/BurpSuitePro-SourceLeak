package burp;

import burp.api.montoya.logger.LoggerCaptureHttpRequestResponse;
import java.util.ArrayList;
import java.util.List;

public class Zz56 implements Zg6x {
  private final Zgzp ZH;
  
  private final boolean ZE;
  
  private final Zs4l<LoggerCaptureHttpRequestResponse, Boolean> Zc;
  
  private final List<Zedo> ZI;
  
  private Zg6x ZR;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zz56(Zgzp paramZgzp, boolean paramBoolean, Zs4l<LoggerCaptureHttpRequestResponse, Boolean> paramZs4l) {
    this.ZH = paramZgzp;
    this.ZE = paramBoolean;
    this.Zc = paramZs4l;
    this.ZI = new ArrayList<>();
  }
  
  public Zg6x ZH() {
    // Byte code:
    //   0: new burp/Zz56
    //   3: dup
    //   4: new burp/Z_y
    //   7: dup
    //   8: aload_0
    //   9: invokevirtual Zs : ()I
    //   12: aload_0
    //   13: invokevirtual Ze : ()I
    //   16: invokespecial <init> : (II)V
    //   19: aload_0
    //   20: getfield ZE : Z
    //   23: aload_0
    //   24: getfield Zc : Lburp/Zs4l;
    //   27: invokespecial <init> : (Lburp/Zgzp;ZLburp/Zs4l;)V
    //   30: astore_1
    //   31: aload_1
    //   32: aload_0
    //   33: invokevirtual Zl : ()Z
    //   36: invokevirtual Zw : (Z)V
    //   39: aload_1
    //   40: aload_0
    //   41: invokevirtual Zg : ()Z
    //   44: invokevirtual ZE : (Z)V
    //   47: aload_1
    //   48: aload_0
    //   49: invokevirtual Zt : ()Z
    //   52: invokevirtual ZZ : (Z)V
    //   55: aload_1
    //   56: aload_0
    //   57: invokevirtual Zw : ()Z
    //   60: invokevirtual ZR : (Z)V
    //   63: aload_1
    //   64: aload_0
    //   65: invokevirtual Zh : ()Z
    //   68: invokevirtual Zq : (Z)V
    //   71: aload_1
    //   72: aload_0
    //   73: invokevirtual Zv : ()Z
    //   76: invokevirtual ZC : (Z)V
    //   79: aload_1
    //   80: aload_0
    //   81: invokevirtual ZI : ()Z
    //   84: invokevirtual Zd : (Z)V
    //   87: aload_1
    //   88: aload_0
    //   89: invokevirtual Zx : ()Z
    //   92: invokevirtual Zv : (Z)V
    //   95: aload_1
    //   96: aload_0
    //   97: invokevirtual Z_ : ()Z
    //   100: invokevirtual ZP : (Z)V
    //   103: aload_1
    //   104: aload_0
    //   105: invokevirtual Za : ()Z
    //   108: invokevirtual ZH : (Z)V
    //   111: aload_1
    //   112: aload_0
    //   113: invokevirtual ZL : ()Z
    //   116: invokevirtual Zc : (Z)V
    //   119: aload_1
    //   120: aload_0
    //   121: invokevirtual ZC : ()Z
    //   124: invokevirtual ZD : (Z)V
    //   127: aload_1
    //   128: aload_0
    //   129: invokevirtual Zm : ()Z
    //   132: invokevirtual ZG : (Z)V
    //   135: aload_1
    //   136: aload_0
    //   137: invokevirtual Zi : ()Z
    //   140: invokevirtual ZS : (Z)V
    //   143: aload_1
    //   144: aload_0
    //   145: invokevirtual ZK : ()Z
    //   148: invokevirtual Zs : (Z)V
    //   151: invokestatic Zc : ()Ljava/util/List;
    //   154: aload_0
    //   155: aload_1
    //   156: <illegal opcode> accept : (Lburp/Zz56;Lburp/Zz56;)Ljava/util/function/Consumer;
    //   161: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   166: aload_1
    //   167: aload_0
    //   168: invokevirtual Zbo : ()Ljava/lang/String;
    //   171: invokevirtual Zl : (Ljava/lang/String;)V
    //   174: aload_1
    //   175: aload_0
    //   176: invokevirtual ZbK : ()Z
    //   179: invokevirtual Zl : (Z)V
    //   182: aload_1
    //   183: aload_0
    //   184: invokevirtual Zbz : ()Z
    //   187: invokevirtual Ze : (Z)V
    //   190: aload_1
    //   191: aload_0
    //   192: invokevirtual Zb1 : ()Z
    //   195: invokevirtual Zi : (Z)V
    //   198: aload_1
    //   199: aload_0
    //   200: invokevirtual ZP : ()Z
    //   203: invokevirtual Zh : (Z)V
    //   206: aload_1
    //   207: aload_0
    //   208: invokevirtual ZD : ()I
    //   211: invokevirtual ZY : (I)V
    //   214: aload_1
    //   215: aload_0
    //   216: invokevirtual ZT : ()I
    //   219: invokevirtual Zt : (I)V
    //   222: aload_1
    //   223: aload_0
    //   224: invokevirtual Zk : ()Z
    //   227: invokevirtual Zo : (Z)V
    //   230: aload_1
    //   231: aload_0
    //   232: invokevirtual ZS : ()Ljava/lang/String;
    //   235: invokevirtual ZU : (Ljava/lang/String;)V
    //   238: aload_1
    //   239: aload_0
    //   240: invokevirtual Zb : ()Lburp/Zzca;
    //   243: invokevirtual Zw : (Lburp/Zzca;)V
    //   246: aload_1
    //   247: areturn
  }
  
  public int Ze() {
    return this.ZH.Z_G();
  }
  
  public void ZU(int paramInt) {
    this.ZH.Zk0(paramInt);
  }
  
  public boolean Zl() {
    return this.ZH.Z_L();
  }
  
  public void Zw(boolean paramBoolean) {
    this.ZH.ZPC(paramBoolean);
  }
  
  public boolean Zg() {
    return this.ZH.Z_j();
  }
  
  public void ZE(boolean paramBoolean) {
    this.ZH.ZPZ(paramBoolean);
  }
  
  public boolean Zt() {
    return this.ZH.Z_K();
  }
  
  public void ZZ(boolean paramBoolean) {
    this.ZH.ZPK(paramBoolean);
  }
  
  public boolean Zw() {
    return this.ZH.Z_e();
  }
  
  public void ZR(boolean paramBoolean) {
    this.ZH.ZP2(paramBoolean);
  }
  
  public boolean Zh() {
    return this.ZH.Z_q();
  }
  
  public void Zq(boolean paramBoolean) {
    this.ZH.ZPe(paramBoolean);
  }
  
  public boolean Zv() {
    return this.ZH.Z_r();
  }
  
  public void ZC(boolean paramBoolean) {
    this.ZH.ZPP(paramBoolean);
  }
  
  public boolean ZI() {
    return this.ZH.Z_Y();
  }
  
  public void Zd(boolean paramBoolean) {
    this.ZH.ZPn(paramBoolean);
  }
  
  public boolean Zx() {
    return this.ZH.Z_w();
  }
  
  public void Zv(boolean paramBoolean) {
    this.ZH.ZPs(paramBoolean);
  }
  
  public boolean Z_() {
    return this.ZH.Z_S();
  }
  
  public void ZP(boolean paramBoolean) {
    this.ZH.ZPH(paramBoolean);
  }
  
  public boolean Za() {
    return this.ZH.Z_J();
  }
  
  public void ZH(boolean paramBoolean) {
    this.ZH.ZPh(paramBoolean);
  }
  
  public boolean ZL() {
    return this.ZH.Z_t();
  }
  
  public void Zc(boolean paramBoolean) {
    this.ZH.ZPM(paramBoolean);
  }
  
  public boolean ZC() {
    return this.ZH.Z_b();
  }
  
  public void ZD(boolean paramBoolean) {
    this.ZH.ZP4(paramBoolean);
  }
  
  public boolean Zm() {
    return this.ZH.Z_P();
  }
  
  public void ZG(boolean paramBoolean) {
    this.ZH.ZPq(paramBoolean);
  }
  
  public boolean Zi() {
    return this.ZH.Z_u();
  }
  
  public void ZS(boolean paramBoolean) {
    this.ZH.ZP7(paramBoolean);
  }
  
  public boolean ZK() {
    return this.ZH.Z_4();
  }
  
  public void Zs(boolean paramBoolean) {
    this.ZH.ZP5(paramBoolean);
  }
  
  public boolean ZR(Zeew paramZeew) {
    return this.ZH.Zv(paramZeew);
  }
  
  public void ZM(Zeew paramZeew, boolean paramBoolean) {
    this.ZH.Zc(paramZeew, paramBoolean);
  }
  
  public String Zbo() {
    return this.ZH.Zbo();
  }
  
  public void Zl(String paramString) {
    this.ZH.ZP4(paramString);
  }
  
  public boolean ZbK() {
    return this.ZH.ZbK();
  }
  
  public void Zl(boolean paramBoolean) {
    this.ZH.ZPr(paramBoolean);
  }
  
  public boolean Zbz() {
    return this.ZH.Zbz();
  }
  
  public void Ze(boolean paramBoolean) {
    this.ZH.ZPW(paramBoolean);
  }
  
  public boolean Zb1() {
    return this.ZH.Zb1();
  }
  
  public void Zi(boolean paramBoolean) {
    this.ZH.ZP8(paramBoolean);
  }
  
  public boolean ZP() {
    return this.ZH.Z_T();
  }
  
  public void Zh(boolean paramBoolean) {
    this.ZH.ZPB(paramBoolean);
  }
  
  public int ZD() {
    return this.ZH.Z_Q();
  }
  
  public void ZY(int paramInt) {
    this.ZH.Zkh(paramInt);
  }
  
  public int ZT() {
    return this.ZH.Z_E();
  }
  
  public void Zt(int paramInt) {
    this.ZH.Zkm(paramInt);
  }
  
  public boolean Zk() {
    return this.ZH.Z_g();
  }
  
  public void Zo(boolean paramBoolean) {
    this.ZH.ZPc(paramBoolean);
  }
  
  public int Zs() {
    return this.ZH.Z_l();
  }
  
  public void ZS(Zedo paramZedo) {
    this.ZI.add(paramZedo);
  }
  
  public List<Zeew> Zo() {
    return this.ZH.Z_A();
  }
  
  public void ZN() {
    this.ZR = ZH();
  }
  
  public boolean Zu() {
    return (this.ZR == null || Ze() != this.ZR.Ze() || Zl() != this.ZR.Zl() || Zg() != this.ZR.Zg() || Zt() != this.ZR.Zt() || Zw() != this.ZR.Zw() || Zh() != this.ZR.Zh() || Zv() != this.ZR.Zv() || ZI() != this.ZR.ZI() || Zx() != this.ZR.Zx() || Z_() != this.ZR.Z_() || Za() != this.ZR.Za() || ZL() != this.ZR.ZL() || ZC() != this.ZR.ZC() || Zm() != this.ZR.Zm() || Zi() != this.ZR.Zi() || ZK() != this.ZR.ZK() || Zeew.Zc().stream().anyMatch(this::lambda$hasFilterChanged$1) || !Zsw8.Zn(Zbo(), this.ZR.Zbo()) || ZbK() != this.ZR.ZbK() || Zbz() != this.ZR.Zbz() || Zb1() != this.ZR.Zb1() || ZP() != this.ZR.ZP() || ZD() != this.ZR.ZD() || ZT() != this.ZR.ZT() || !Zsw8.Zn(ZS(), this.ZR.ZS()) || Zb() != this.ZR.Zb());
  }
  
  public void Zd(Zmf_ paramZmf_) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZK : ()V
    //   6: invokestatic ZR : ()Z
    //   9: aload_0
    //   10: aload_1
    //   11: aload_0
    //   12: invokevirtual ZA : ()Ljava/lang/String;
    //   15: aload_0
    //   16: invokevirtual Ze : ()I
    //   19: invokeinterface Zo : (Ljava/lang/String;I)I
    //   24: invokevirtual ZU : (I)V
    //   27: aload_0
    //   28: aload_1
    //   29: sipush #9957
    //   32: sipush #10622
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: aload_0
    //   39: invokevirtual Zl : ()Z
    //   42: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   47: invokevirtual Zw : (Z)V
    //   50: aload_0
    //   51: aload_1
    //   52: sipush #9974
    //   55: sipush #3246
    //   58: invokestatic a : (II)Ljava/lang/String;
    //   61: aload_0
    //   62: invokevirtual Zg : ()Z
    //   65: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   70: invokevirtual ZE : (Z)V
    //   73: aload_0
    //   74: aload_1
    //   75: sipush #9982
    //   78: sipush #-20942
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: aload_0
    //   85: invokevirtual Zt : ()Z
    //   88: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   93: invokevirtual ZZ : (Z)V
    //   96: aload_0
    //   97: aload_1
    //   98: sipush #9963
    //   101: sipush #-11329
    //   104: invokestatic a : (II)Ljava/lang/String;
    //   107: aload_0
    //   108: invokevirtual Zw : ()Z
    //   111: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   116: invokevirtual ZR : (Z)V
    //   119: aload_0
    //   120: aload_1
    //   121: sipush #9976
    //   124: sipush #-6135
    //   127: invokestatic a : (II)Ljava/lang/String;
    //   130: aload_0
    //   131: invokevirtual Zh : ()Z
    //   134: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   139: invokevirtual Zq : (Z)V
    //   142: aload_0
    //   143: aload_1
    //   144: sipush #9947
    //   147: sipush #-15013
    //   150: invokestatic a : (II)Ljava/lang/String;
    //   153: aload_0
    //   154: invokevirtual Zv : ()Z
    //   157: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   162: invokevirtual ZC : (Z)V
    //   165: aload_0
    //   166: aload_1
    //   167: sipush #9964
    //   170: sipush #-13544
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: aload_0
    //   177: invokevirtual ZI : ()Z
    //   180: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   185: invokevirtual Zd : (Z)V
    //   188: aload_0
    //   189: aload_1
    //   190: sipush #9945
    //   193: sipush #6338
    //   196: invokestatic a : (II)Ljava/lang/String;
    //   199: aload_0
    //   200: invokevirtual Zx : ()Z
    //   203: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   208: invokevirtual Zv : (Z)V
    //   211: aload_0
    //   212: aload_1
    //   213: sipush #9928
    //   216: sipush #-17780
    //   219: invokestatic a : (II)Ljava/lang/String;
    //   222: aload_0
    //   223: invokevirtual Z_ : ()Z
    //   226: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   231: invokevirtual ZP : (Z)V
    //   234: aload_0
    //   235: aload_1
    //   236: sipush #9972
    //   239: sipush #8898
    //   242: invokestatic a : (II)Ljava/lang/String;
    //   245: aload_0
    //   246: invokevirtual Za : ()Z
    //   249: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   254: invokevirtual ZH : (Z)V
    //   257: aload_0
    //   258: aload_1
    //   259: sipush #9978
    //   262: sipush #-29299
    //   265: invokestatic a : (II)Ljava/lang/String;
    //   268: aload_0
    //   269: invokevirtual ZL : ()Z
    //   272: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   277: invokevirtual Zc : (Z)V
    //   280: aload_0
    //   281: aload_1
    //   282: sipush #9975
    //   285: sipush #-32403
    //   288: invokestatic a : (II)Ljava/lang/String;
    //   291: aload_0
    //   292: invokevirtual ZC : ()Z
    //   295: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   300: invokevirtual ZD : (Z)V
    //   303: istore_2
    //   304: aload_0
    //   305: aload_1
    //   306: sipush #9941
    //   309: sipush #598
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: aload_0
    //   316: invokevirtual Zm : ()Z
    //   319: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   324: invokevirtual ZG : (Z)V
    //   327: aload_0
    //   328: aload_1
    //   329: sipush #9946
    //   332: sipush #-30389
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: aload_0
    //   339: invokevirtual Zi : ()Z
    //   342: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   347: invokevirtual ZS : (Z)V
    //   350: aload_0
    //   351: aload_1
    //   352: sipush #9948
    //   355: sipush #6930
    //   358: invokestatic a : (II)Ljava/lang/String;
    //   361: aload_0
    //   362: invokevirtual ZK : ()Z
    //   365: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   370: invokevirtual Zs : (Z)V
    //   373: invokestatic Zc : ()Ljava/util/List;
    //   376: aload_0
    //   377: aload_1
    //   378: <illegal opcode> accept : (Lburp/Zz56;Lburp/Zmf_;)Ljava/util/function/Consumer;
    //   383: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   388: aload_0
    //   389: aload_1
    //   390: sipush #9950
    //   393: sipush #-24086
    //   396: invokestatic a : (II)Ljava/lang/String;
    //   399: aload_0
    //   400: invokevirtual Zbo : ()Ljava/lang/String;
    //   403: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   408: invokevirtual Zl : (Ljava/lang/String;)V
    //   411: aload_0
    //   412: aload_1
    //   413: sipush #9951
    //   416: sipush #28109
    //   419: invokestatic a : (II)Ljava/lang/String;
    //   422: aload_0
    //   423: invokevirtual ZbK : ()Z
    //   426: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   431: invokevirtual Zl : (Z)V
    //   434: aload_0
    //   435: aload_1
    //   436: sipush #9980
    //   439: sipush #12085
    //   442: invokestatic a : (II)Ljava/lang/String;
    //   445: aload_0
    //   446: invokevirtual Zbz : ()Z
    //   449: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   454: invokevirtual Ze : (Z)V
    //   457: aload_0
    //   458: aload_1
    //   459: sipush #9968
    //   462: sipush #-1683
    //   465: invokestatic a : (II)Ljava/lang/String;
    //   468: aload_0
    //   469: invokevirtual Zb1 : ()Z
    //   472: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   477: invokevirtual Zi : (Z)V
    //   480: aload_0
    //   481: aload_1
    //   482: sipush #9967
    //   485: sipush #28540
    //   488: invokestatic a : (II)Ljava/lang/String;
    //   491: aload_0
    //   492: invokevirtual ZP : ()Z
    //   495: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   500: invokevirtual Zh : (Z)V
    //   503: aload_0
    //   504: aload_0
    //   505: aload_1
    //   506: invokevirtual ZH : (Lburp/Zmf_;)I
    //   509: invokevirtual ZY : (I)V
    //   512: aload_0
    //   513: aload_0
    //   514: aload_1
    //   515: invokevirtual ZQ : (Lburp/Zmf_;)I
    //   518: invokevirtual Zt : (I)V
    //   521: aload_0
    //   522: aload_1
    //   523: sipush #9983
    //   526: sipush #-8930
    //   529: invokestatic a : (II)Ljava/lang/String;
    //   532: aload_0
    //   533: invokevirtual Zk : ()Z
    //   536: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   541: invokevirtual Zo : (Z)V
    //   544: aload_0
    //   545: getfield ZH : Lburp/Zgzp;
    //   548: aload_1
    //   549: sipush #9938
    //   552: sipush #20793
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: aload_0
    //   559: invokevirtual ZS : ()Ljava/lang/String;
    //   562: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   567: invokeinterface ZiY : (Ljava/lang/String;)V
    //   572: aload_1
    //   573: sipush #9977
    //   576: sipush #-11784
    //   579: invokestatic a : (II)Ljava/lang/String;
    //   582: getstatic burp/Zzca.SETTINGS : Lburp/Zzca;
    //   585: invokevirtual name : ()Ljava/lang/String;
    //   588: getstatic burp/Zzca.BAMBDA : Lburp/Zzca;
    //   591: invokevirtual name : ()Ljava/lang/String;
    //   594: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   597: aload_0
    //   598: invokevirtual Zb : ()Lburp/Zzca;
    //   601: invokevirtual ZY : ()B
    //   604: invokeinterface ZM : (Ljava/lang/String;Ljava/util/List;I)I
    //   609: i2b
    //   610: istore_3
    //   611: aload_0
    //   612: getfield ZH : Lburp/Zgzp;
    //   615: iload_3
    //   616: invokestatic Zy : (B)Lburp/Zzca;
    //   619: invokeinterface Zr : (Lburp/Zzca;)V
    //   624: aload_1
    //   625: invokeinterface Zb : ()Z
    //   630: ifeq -> 637
    //   633: aload_0
    //   634: invokevirtual Zr : ()V
    //   637: invokestatic Zwu : ()[Lburp/Zbqc;
    //   640: ifnonnull -> 655
    //   643: iload_2
    //   644: ifeq -> 651
    //   647: iconst_0
    //   648: goto -> 652
    //   651: iconst_1
    //   652: invokestatic Zr : (Z)V
    //   655: return
  }
  
  private String ZA() {
    return this.ZE ? a(9965, 7612) : a(9955, -22268);
  }
  
  private int ZH(Zmf_ paramZmf_) {
    List<String> list = Zrse.Zo();
    Zrse zrse = Zrse.ZG(ZD());
    String str = (zrse == null) ? Zrse.MB_1.displayName : zrse.displayName;
    int i = list.indexOf(str);
    int j = paramZmf_.ZM(a(9939, -31617), list, i);
    return (Zrse.ZV((String)list.get(j))).size;
  }
  
  private int ZQ(Zmf_ paramZmf_) {
    List<String> list = Zrse.Zo();
    Zrse zrse = Zrse.ZG(ZT());
    String str = (zrse == null) ? Zrse.MB_1.displayName : zrse.displayName;
    int i = list.indexOf(str);
    int j = paramZmf_.ZM(a(9934, -23274), list, i);
    return (Zrse.ZV((String)list.get(j))).size;
  }
  
  public void Zl(Zg4j paramZg4j) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #9956
    //   4: sipush #9178
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: aload_0
    //   11: invokevirtual Zf : ()I
    //   14: invokeinterface ZD : (Ljava/lang/String;I)V
    //   19: aload_1
    //   20: sipush #9935
    //   23: sipush #21395
    //   26: invokestatic a : (II)Ljava/lang/String;
    //   29: aload_0
    //   30: invokevirtual ZY : ()I
    //   33: invokeinterface ZD : (Ljava/lang/String;I)V
    //   38: aload_1
    //   39: sipush #9942
    //   42: sipush #6229
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: aload_0
    //   49: invokevirtual Zl : ()Z
    //   52: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   57: aload_1
    //   58: sipush #9953
    //   61: sipush #31331
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: aload_0
    //   68: invokevirtual Zg : ()Z
    //   71: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   76: aload_1
    //   77: sipush #9960
    //   80: sipush #-15513
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: aload_0
    //   87: invokevirtual Zt : ()Z
    //   90: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   95: aload_1
    //   96: sipush #9973
    //   99: sipush #-12067
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: aload_0
    //   106: invokevirtual Zw : ()Z
    //   109: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   114: aload_1
    //   115: sipush #9979
    //   118: sipush #-11968
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: aload_0
    //   125: invokevirtual Zh : ()Z
    //   128: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   133: aload_1
    //   134: sipush #9937
    //   137: sipush #29613
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: aload_0
    //   144: invokevirtual Zv : ()Z
    //   147: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   152: aload_1
    //   153: sipush #9966
    //   156: sipush #21372
    //   159: invokestatic a : (II)Ljava/lang/String;
    //   162: aload_0
    //   163: invokevirtual ZI : ()Z
    //   166: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   171: aload_1
    //   172: sipush #9970
    //   175: sipush #-6382
    //   178: invokestatic a : (II)Ljava/lang/String;
    //   181: aload_0
    //   182: invokevirtual Zx : ()Z
    //   185: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   190: aload_1
    //   191: sipush #9952
    //   194: sipush #-15579
    //   197: invokestatic a : (II)Ljava/lang/String;
    //   200: aload_0
    //   201: invokevirtual Z_ : ()Z
    //   204: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   209: aload_1
    //   210: sipush #9933
    //   213: sipush #15125
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: aload_0
    //   220: invokevirtual Za : ()Z
    //   223: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   228: aload_1
    //   229: sipush #9940
    //   232: sipush #6206
    //   235: invokestatic a : (II)Ljava/lang/String;
    //   238: aload_0
    //   239: invokevirtual ZL : ()Z
    //   242: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   247: aload_1
    //   248: sipush #9958
    //   251: sipush #-22216
    //   254: invokestatic a : (II)Ljava/lang/String;
    //   257: aload_0
    //   258: invokevirtual ZC : ()Z
    //   261: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   266: aload_1
    //   267: sipush #9962
    //   270: sipush #25339
    //   273: invokestatic a : (II)Ljava/lang/String;
    //   276: aload_0
    //   277: invokevirtual Zm : ()Z
    //   280: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   285: aload_1
    //   286: sipush #9929
    //   289: sipush #-18535
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: aload_0
    //   296: invokevirtual Zi : ()Z
    //   299: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   304: aload_1
    //   305: sipush #9981
    //   308: sipush #14333
    //   311: invokestatic a : (II)Ljava/lang/String;
    //   314: aload_0
    //   315: invokevirtual ZK : ()Z
    //   318: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   323: invokestatic Zc : ()Ljava/util/List;
    //   326: aload_0
    //   327: aload_1
    //   328: <illegal opcode> accept : (Lburp/Zz56;Lburp/Zg4j;)Ljava/util/function/Consumer;
    //   333: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   338: aload_1
    //   339: sipush #9944
    //   342: sipush #4745
    //   345: invokestatic a : (II)Ljava/lang/String;
    //   348: aload_0
    //   349: invokevirtual Zbo : ()Ljava/lang/String;
    //   352: invokeinterface Za : (Ljava/lang/String;Ljava/lang/String;)V
    //   357: aload_1
    //   358: sipush #9961
    //   361: sipush #27405
    //   364: invokestatic a : (II)Ljava/lang/String;
    //   367: aload_0
    //   368: invokevirtual ZbK : ()Z
    //   371: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   376: aload_1
    //   377: sipush #9943
    //   380: sipush #-31740
    //   383: invokestatic a : (II)Ljava/lang/String;
    //   386: aload_0
    //   387: invokevirtual Zbz : ()Z
    //   390: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   395: aload_1
    //   396: sipush #9932
    //   399: sipush #-22222
    //   402: invokestatic a : (II)Ljava/lang/String;
    //   405: aload_0
    //   406: invokevirtual Zb1 : ()Z
    //   409: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   414: aload_1
    //   415: sipush #9971
    //   418: sipush #-20068
    //   421: invokestatic a : (II)Ljava/lang/String;
    //   424: aload_0
    //   425: invokevirtual ZP : ()Z
    //   428: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   433: invokestatic Zo : ()Ljava/util/List;
    //   436: astore_2
    //   437: aload_0
    //   438: invokevirtual ZD : ()I
    //   441: invokestatic ZG : (I)Lburp/Zrse;
    //   444: astore_3
    //   445: aload_3
    //   446: ifnull -> 475
    //   449: aload_1
    //   450: sipush #9954
    //   453: sipush #10674
    //   456: invokestatic a : (II)Ljava/lang/String;
    //   459: aload_2
    //   460: aload_2
    //   461: aload_3
    //   462: getfield displayName : Ljava/lang/String;
    //   465: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   470: invokeinterface Zr : (Ljava/lang/String;Ljava/util/List;I)V
    //   475: aload_0
    //   476: invokevirtual ZT : ()I
    //   479: invokestatic ZG : (I)Lburp/Zrse;
    //   482: astore #4
    //   484: aload #4
    //   486: ifnull -> 516
    //   489: aload_1
    //   490: sipush #9969
    //   493: sipush #4910
    //   496: invokestatic a : (II)Ljava/lang/String;
    //   499: aload_2
    //   500: aload_2
    //   501: aload #4
    //   503: getfield displayName : Ljava/lang/String;
    //   506: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   511: invokeinterface Zr : (Ljava/lang/String;Ljava/util/List;I)V
    //   516: aload_1
    //   517: sipush #9959
    //   520: sipush #-834
    //   523: invokestatic a : (II)Ljava/lang/String;
    //   526: aload_0
    //   527: invokevirtual Zk : ()Z
    //   530: invokeinterface Zh : (Ljava/lang/String;Z)V
    //   535: aload_1
    //   536: sipush #9949
    //   539: sipush #709
    //   542: invokestatic a : (II)Ljava/lang/String;
    //   545: aload_0
    //   546: invokevirtual ZS : ()Ljava/lang/String;
    //   549: invokeinterface Za : (Ljava/lang/String;Ljava/lang/String;)V
    //   554: aload_1
    //   555: sipush #9936
    //   558: sipush #-10508
    //   561: invokestatic a : (II)Ljava/lang/String;
    //   564: getstatic burp/Zzca.SETTINGS : Lburp/Zzca;
    //   567: invokevirtual name : ()Ljava/lang/String;
    //   570: getstatic burp/Zzca.BAMBDA : Lburp/Zzca;
    //   573: invokevirtual name : ()Ljava/lang/String;
    //   576: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   579: aload_0
    //   580: invokevirtual Zb : ()Lburp/Zzca;
    //   583: invokevirtual ZY : ()B
    //   586: invokeinterface Zr : (Ljava/lang/String;Ljava/util/List;I)V
    //   591: return
  }
  
  private int Zf() {
    return this.ZE ? Ze() : Zl8b.Zh();
  }
  
  private int ZY() {
    return this.ZE ? Zl8b.ZP() : Ze();
  }
  
  protected void Zr() {
    boolean bool = Zrse.ZR();
    for (Zedo zedo : this.ZI) {
      zedo.Zt2();
      if (bool)
        break; 
    } 
  }
  
  public String ZS() {
    return this.ZH.Z_W();
  }
  
  public void ZU(String paramString) {
    this.ZH.ZiY(paramString);
    this.Zc.ZC(paramString);
  }
  
  public Zzca Zb() {
    return this.ZH.Z_D();
  }
  
  public void Zw(Zzca paramZzca) {
    this.ZH.Zr(paramZzca);
  }
  
  public void Zm(Zzkg paramZzkg) {
    this.Zc.Zm(paramZzkg);
  }
  
  public void Zf(Zklo paramZklo) {
    this.Zc.Zf(paramZklo);
  }
  
  private void lambda$saveBurpConfiguration$3(Zg4j paramZg4j, Zeew paramZeew) {
    paramZg4j.Zh(paramZeew.loggerCaptureFilterProjectConfigKey, this.ZH.Zv(paramZeew));
  }
  
  private void lambda$loadBurpConfiguration$2(Zmf_ paramZmf_, Zeew paramZeew) {
    ZM(paramZeew, paramZmf_.ZC(paramZeew.loggerCaptureFilterProjectConfigKey, ZR(paramZeew)));
  }
  
  private boolean lambda$hasFilterChanged$1(Zeew paramZeew) {
    return (ZR(paramZeew) != this.ZR.ZR(paramZeew));
  }
  
  private void lambda$createCopy$0(Zz56 paramZz56, Zeew paramZeew) {
    paramZz56.ZM(paramZeew, ZR(paramZeew));
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'àâ:Xè³ìWÌ2ÓÒ#µR÷Ô¨' z!÷ä¹W]s©t¼[K³Z@0\\rßÿ_Gé©ôL\ô¬ïPc\r¹ÞSZ tx§jË×¬«Í\\r¤jÐP IÜ@½\\f9òÉæJzÂ %3Õ£$"vÃ«è.¿\\n«Bºl}kdS£Ð¼g9L|»¬ÒÚ®W¼Vòd³<hzÃ%3h@\\t§ÝjdÆ{p½áÊ(¦lz7(x\\n,M¾@W?"1áÄì lêG0Ïë+urkÐ;UÐ¡CëuQeXêÝ*ñC(Ä|¾!t·¨òºæ¦2yªÄÀ]ýÊ~Â\\nÆfÉ·|P7;#A`´xêÐPy¢ý»ÂP)Ï»¯iÇ½+ëõ¢£x¿}±´üIGc!Äö~¾Ä\\tÎ¡6©&ñTK1UÜ>K6\\f/Y¯â]D¬¯ä0P^8[}÷n]ÐÑ|KE¶pÇ;*2=aª\\n0+ÓC~Çw\\t ëß¥±}}<Ò +Ñûla¿¼\\nñ#ÿ¯³ª¼O ËÖ¢ø{/ãìZämg,4ÏOQ;Å26Ø 0~tÃQeg²ªMv+¬8Gæ5ÆE×þ/gHÑ¹ó¬è¤lQ||½ÒscZd-*6#§Å¼2ÇWÞä :¤]`òl00WSÌn6u7@,×]°b¾8® ¤Á\\nn_ÿ{îâ[u[O=o­¨l,sFtEÃ/ôx¸¸ÙæÕeæta\\rÐ¤ÂjA)¸OW0 ÉÆ gp¢²hMÂ¼Ih+öÊf¨"ß#9­gäCYö}Î´Ýc¶UGGµ_ÙórÐ¶)ÐeNÈU?MYµ\\büÐ\\t*/½¤¿CÞºî¦5VEÎaÂèÅºqÿüâ%-a;zy}¿Õkýÿ¢Ó\\bµ|WÙ#¶¶\\beU¡hG:\\ta%múr9(õêÃz\\t¿øÎ"' Ú!§W>ÖKëYíS¶^ @ëaLë{5þK¹éè.Ê]m\ANð×Ø(ôx¹~òQ\\b43^8[Øv7æîZ¡©-~é'\£e¾s$(,×jj®GÊÂÇ ²Yp/>\\t NSN§¥Vµ.©51\\tÐ=ÐxÂE àïaÚ]5¸*lþ ¾,÷Åårc&l±gQqGENÍ~>Î\\ryæùÐ¼=æbBGmgVÙ® H=¥ÏmÉbº ôÉ¢lÅÊ:¢×,ñ±ìý5ãìÂS:\\fmúDôWI^âíX³³¼ÌOÓ ÒÖµ§÷.¨Û'ëík°¾ÀÃ8÷*5{Õù¤½s,î,[±&[òRù«8BçÆãÔ¶)+ë%|©D0¢èÂ¨êÇ²qÁë¦+ÊWÉ©»?ã4³ËkÊ0ü¹·Nâ';\\n-\\rÃNîÑ¤UÁw¹\\bè(x::äÁSì{î¬Æ´/jõIÓÜ°DÎÂðÐñgæ-»cç`yð24jlÇ{P½ë×--Êm©@ù_õ4fÌ1rÉ3|øgÛrtm½TÀAîwõA»QHAçâ#.YmùBBo9(¹S)Xµn&É¨1I%æç\\fØJ%fÝ\Ûs)é´üU íÔ\¼Em0cêJYæ-oL5ÃoÐ?õ"öÚE#8 jï5ÔÃ¥âÉ\\n¿KWë÷D Kä%¤z²KùÑÎÔEºâôq]\\tÚäÅÊ§sj\ï¨ñ.×EÍR|1OµÏ²Vî;3­¹m}d^¶Æ§jõSúëÃÆè ÌËë?f-}(f­Uºn±¤ØE³°P¥úE±béw[F¹'JÃ8½á-5¤6ÏËq,-J~r¼¾Û¡³ùK¶ëüõ¹D\\bÌ½aáIõ¹ç?ÎWÉmH5´¢9ìÖs±Ú|'mFÜ\\r÷°Ü{÷ójï  oýFL ø®çæúÙq`²*aïÆ×FÎ_úðon0­BÍ»2Ô#¼`8´öxÐZP¢»-PÔÏ¯ßy,àá#¥}.ÚÐÊyW¤w¸"âÝ¤0\\níg¹Cù<çÍ5tÍóñ ®pTdµôûÌåäêW(Ô}Ü¯1#}XLÅl¶]FoîérÎ^LQÈã±®Ù¨dF\ù)QÀs$â#z`à´íxwÐ6P¢3»PÏÜ¯Ç ùQçê¬G%òJxM åÌvFø³ð9â\\ns!\\n´+g¡ºûbð$\\bk'iK\ÙTãÀµ°dùñOÆwðãAi"C°¨FÚVN5]ëy2\IÁàÎý¤åÖ"Z£Ûçzl>Ùµ}­ejtGH:ï'ö:Çèi?q0È?×HBø¦Õb+ÍbV1íWxtYGÑ(`¼ImQ°è¡¹«.(ª#QË¼ÛH£C½Àe÷ÑÙKþ÷à\\rø1À;4¬ôÓ°oÎ§\Ðzcµ7-_ïßE\\nF©¨ü½MXÔ,ë@ã^bùÜEp½©s;¤¸L]@Ú;Û¹-·Jk©©¥@0ÿSÙnuc@¦×\\f°H¾Û8 ±Á¨nÿñ¿È[09[Z=Í­Ò"l}slu ÂA5nÉ¿Þ\\nÊúñÑÌèfna]I;rj4EÚ«®©¦ÅsÍAà~(HýbAÓ óÅ½ð0ÿÈÖã.²*pA¡Åür@Bà±óKYî­C%\\f4ëe¢ëjàW,Ø~ÇÎr!ó\\rX¥¤\\feof2\\fK)»Ê\\n~0\\n\\tÀi³g©×.1o é¯^JÈû±­ÙÈhFláF?sw±óµ1ð=ÔxBE âñ%Ä#±Õþ_Ñ;ª£spÁ¶¸8ØQØÉ¿DÐùß¡­*çêHrah(¢½¥Y~ôÔ+2·© ¦Ãö²W[Óú©Æ©ÝÍ¿QqÈu»]ÝÓñä1¿=Ç«Y¹ÖùVPq/FÇîür'¿\\n=&¿´SN<×µjÒÝ0±hÂÍv×­~Ø¯½Y×á-)0`^*ÏêA¬Æ_3ª¯ý'P-B`ÖZÄy\\bU#ýyä Ú¼êÝ@pÝIéNÍÌhÎÇ ÍùkÐ=sbða¬@`51K{é#õZ1Mf/.¾Yñi¸³o<sM\\nOËØ }xØÝ.ñ¾2e½³þÎ.799mîOÎâÂÕPbuOÝ(zÌ°ì\\fmÆ^b¾ÇJÔoêl:'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #46
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #88
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
    //   68: ldc '>ô_$ú va¨Øb\\r ðÇ7Æx¿!3cî\\r~3ºª¯ðV½uÛð¼dÏ[©0´êÐ[U;Þ½4ÀtCMñfEì@=J@uur¹äðZ½Ì÷ä\¯¾'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #49
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #69
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
    //   129: putstatic burp/Zz56.b : [Ljava/lang/String;
    //   132: bipush #54
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zz56.c : [Ljava/lang/String;
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
    //   212: bipush #69
    //   214: goto -> 244
    //   217: bipush #94
    //   219: goto -> 244
    //   222: bipush #91
    //   224: goto -> 244
    //   227: bipush #121
    //   229: goto -> 244
    //   232: bipush #121
    //   234: goto -> 244
    //   237: bipush #61
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x26FC) & 0xFFFF;
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
      byte b1 = 87;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz56.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */