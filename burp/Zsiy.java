package burp;

import java.util.Set;

class Zsiy implements Zrbc {
  private final Zkq4 Zq;
  
  private final Zbza ZA;
  
  private final Zb9t ZQ;
  
  private final Zmz6 ZX;
  
  private final Zlba ZH;
  
  private final Zsy6 ZR;
  
  private final Zz_q Zi;
  
  private final Zz2p Zf;
  
  private final Ztit ZF;
  
  Zsiy(Zrgd paramZrgd, Zkq4 paramZkq4, Zbza paramZbza, Zb9t paramZb9t, Zmz6 paramZmz6, Zlba paramZlba, Zsy6 paramZsy6, Ztks paramZtks, Zzs1 paramZzs1, Zskh paramZskh, Zb1c paramZb1c, Zz_q paramZz_q, Zg56 paramZg56, Zz1i paramZz1i, int paramInt, Zsoh paramZsoh, Zz28 paramZz28, Zlli<Zt13> paramZlli) {
    this.Zq = paramZkq4;
    this.ZA = paramZbza;
    this.ZQ = paramZb9t;
    this.ZX = paramZmz6;
    this.ZH = paramZlba;
    this.ZR = paramZsy6;
    this.Zi = paramZz_q;
    this.Zf = new Zz2p(paramInt, paramZrgd, paramZskh, paramZtks, paramZzs1, paramZb1c, paramZkq4, paramZg56, Zz86.S1, paramZz1i.Zd(Zz86.S1), paramZbza, paramZsoh, paramZz28, paramZlli);
    this.ZF = new Ztit(Zmdu.DOM, paramZkq4);
  }
  
  public Set<? extends Zz09> Zs() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Zb9t;
    //   4: invokevirtual ZG : ()Lburp/Ze3n;
    //   7: astore_1
    //   8: aload_1
    //   9: ifnull -> 55
    //   12: aload_0
    //   13: getfield Zq : Lburp/Zkq4;
    //   16: invokeinterface ZEo : ()Z
    //   21: ifeq -> 55
    //   24: aload_0
    //   25: getfield Zq : Lburp/Zkq4;
    //   28: getstatic burp/Zr3z.JAVASCRIPT_DYNAMIC_ANALYSIS : Lburp/Zr3z;
    //   31: invokeinterface Zc : (Lburp/Zr3z;)Z
    //   36: ifeq -> 55
    //   39: aload_0
    //   40: getfield Zq : Lburp/Zkq4;
    //   43: invokeinterface ZE6 : ()I
    //   48: ifle -> 55
    //   51: iconst_1
    //   52: goto -> 56
    //   55: iconst_0
    //   56: istore_2
    //   57: iload_2
    //   58: ifeq -> 104
    //   61: aload_0
    //   62: getfield ZR : Lburp/Zsy6;
    //   65: getfield ZF : Lburp/Zia;
    //   68: getstatic burp/Zia.NOT_CHECKED : Lburp/Zia;
    //   71: if_acmpne -> 104
    //   74: aload_0
    //   75: getfield ZR : Lburp/Zsy6;
    //   78: new burp/Zg22
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: aload_1
    //   86: aload_0
    //   87: getfield Zi : Lburp/Zz_q;
    //   90: invokevirtual Zr : (Lburp/Ze3n;Lburp/Zz_q;)Lburp/Zrcw;
    //   93: invokevirtual Zl : ()Ljava/util/List;
    //   96: invokeinterface isEmpty : ()Z
    //   101: invokevirtual ZE : (Z)V
    //   104: iload_2
    //   105: ifeq -> 238
    //   108: aload_0
    //   109: getfield ZR : Lburp/Zsy6;
    //   112: getfield ZF : Lburp/Zia;
    //   115: getstatic burp/Zia.YES : Lburp/Zia;
    //   118: if_acmpne -> 238
    //   121: new java/util/HashSet
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: astore_3
    //   129: new burp/Ztgb
    //   132: dup
    //   133: aload_0
    //   134: getfield ZX : Lburp/Zmz6;
    //   137: aload_0
    //   138: getfield ZH : Lburp/Zlba;
    //   141: aload_0
    //   142: getfield ZA : Lburp/Zbza;
    //   145: invokespecial <init> : (Lburp/Zmz6;Lburp/Zlba;Lburp/Zbza;)V
    //   148: astore #4
    //   150: aload_1
    //   151: invokevirtual ZA : ()Lburp/Zefx;
    //   154: invokeinterface ZF : ()Lburp/Zlit;
    //   159: aload_0
    //   160: getfield ZA : Lburp/Zbza;
    //   163: invokeinterface Zgz : ()Lburp/Zstu;
    //   168: getstatic burp/Zt0k.NO_HTML_ANALYSIS : Lburp/Zt0k;
    //   171: aconst_null
    //   172: invokestatic Zt : (Lburp/Zlit;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   175: astore #5
    //   177: aload_0
    //   178: aload_1
    //   179: aload #5
    //   181: aload #4
    //   183: <illegal opcode> ZC : (Lburp/Zsiy;Lburp/Ze3n;Lburp/Zs68;Lburp/Ztgb;)Lburp/Zz09;
    //   188: astore #6
    //   190: aload_3
    //   191: aload #6
    //   193: invokeinterface add : (Ljava/lang/Object;)Z
    //   198: pop
    //   199: aload_0
    //   200: getfield Zq : Lburp/Zkq4;
    //   203: getstatic burp/Zzu2.CLIENT_SIDE_PROTOTYPE_POLLUTION : Lburp/Zzu2;
    //   206: invokeinterface Zr : (Lburp/Zvs;)Z
    //   211: ifeq -> 236
    //   214: aload_0
    //   215: aload_1
    //   216: aload #5
    //   218: aload #4
    //   220: <illegal opcode> ZC : (Lburp/Zsiy;Lburp/Ze3n;Lburp/Zs68;Lburp/Ztgb;)Lburp/Zz09;
    //   225: astore #7
    //   227: aload_3
    //   228: aload #7
    //   230: invokeinterface add : (Ljava/lang/Object;)Z
    //   235: pop
    //   236: aload_3
    //   237: areturn
    //   238: invokestatic emptySet : ()Ljava/util/Set;
    //   241: areturn
  }
  
  private void lambda$getActiveWorkItems$1(Ze3n paramZe3n, Zs68 paramZs68, Ztgb paramZtgb, Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx) {
    Zgq<Zgpi> zgq = new Zgq<>();
    this.Zf.Zj(paramZtpx, paramZe3n.ZA(), paramZe3n.ZL(), paramZs68, this.ZF.Zp(paramZe3n, (Zgq)zgq));
    paramZtgb.Zt((Zgq)zgq);
  }
  
  private void lambda$getActiveWorkItems$0(Ze3n paramZe3n, Zs68 paramZs68, Ztgb paramZtgb, Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx) {
    Zgq<Zgpi> zgq = new Zgq<>();
    this.Zf.ZM(paramZtpx, paramZe3n.ZA(), paramZe3n.ZL(), paramZs68, this.ZF.Zi(paramZe3n, (Zgq)zgq));
    paramZtgb.Zt((Zgq)zgq);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsiy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */