package burp;

import java.util.function.Supplier;
import net.portswigger.Zie;
import net.portswigger.Zm2;
import net.portswigger.browser.Ztf;

public class Zmv2 implements Supplier<Zka2> {
  private final Zm90 Z_;
  
  private final Zkl6 Zl;
  
  private final Zr_4 ZO;
  
  private final Zs32 ZY;
  
  private final Zli8 ZW;
  
  private final Ztos<Zt18> ZQ;
  
  private final Zz1m<Zt35> ZM;
  
  private final Zeb5 Zn;
  
  private final Ztks Zr;
  
  private final Zzs1 ZV;
  
  private final Zt0d Za;
  
  private final Zr69 Zg;
  
  private final Zl7h Zq;
  
  private final Zgb6 ZR;
  
  private final Zskh Zd;
  
  private final Zt1g ZG;
  
  private final Zmv7 ZC;
  
  private static boolean Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmv2(Zkl6 paramZkl6, Zr_4 paramZr_4, Zs32 paramZs32, Ztos<Zt18> paramZtos, Zz1m<Zt35> paramZz1m, Zli8 paramZli8, Zm90 paramZm90, Zeb5 paramZeb5, Ztks paramZtks, Zzs1 paramZzs1, Zt0d paramZt0d, Zr69 paramZr69, Zl7h paramZl7h, Zgb6 paramZgb6, Zskh paramZskh, Zt1g paramZt1g) {
    this.Zl = paramZkl6;
    this.ZO = paramZr_4;
    this.ZY = paramZs32;
    this.ZQ = paramZtos;
    this.ZM = paramZz1m;
    this.ZW = paramZli8;
    this.Z_ = paramZm90;
    this.Zn = paramZeb5;
    boolean bool = ZV();
    this.Zr = paramZtks;
    this.ZV = paramZzs1;
    this.Za = paramZt0d;
    this.Zg = paramZr69;
    this.Zq = paramZl7h;
    this.ZR = paramZgb6;
    this.Zd = paramZskh;
    this.ZG = paramZt1g;
    this.ZC = paramZr69.ZD();
    if (bool)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zka2 ZG() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Lburp/Zr69;
    //   4: invokeinterface ZK : ()Lburp/Zt4o;
    //   9: astore_2
    //   10: aload_0
    //   11: getfield Za : Lburp/Zt0d;
    //   14: aload_2
    //   15: invokevirtual Zj : (Lburp/Zt4o;)Z
    //   18: istore_3
    //   19: invokestatic ZQ : ()Z
    //   22: aload_0
    //   23: getfield Zq : Lburp/Zl7h;
    //   26: invokeinterface ZVi : ()Z
    //   31: istore #4
    //   33: new burp/Zrqm
    //   36: dup
    //   37: aload_0
    //   38: getfield ZO : Lburp/Zr_4;
    //   41: aload_0
    //   42: getfield Zl : Lburp/Zkl6;
    //   45: aload_0
    //   46: getfield ZR : Lburp/Zgb6;
    //   49: aload_0
    //   50: getfield Zg : Lburp/Zr69;
    //   53: aload_0
    //   54: getfield ZY : Lburp/Zs32;
    //   57: invokespecial <init> : (Lburp/Zr_4;Lburp/Zkl6;Lburp/Zgb6;Lburp/Zr69;Lburp/Zs32;)V
    //   60: astore #5
    //   62: aload #5
    //   64: aload_0
    //   65: getfield Z_ : Lburp/Zm90;
    //   68: aload_0
    //   69: getfield ZM : Lburp/Zz1m;
    //   72: aload_0
    //   73: getfield Zn : Lburp/Zeb5;
    //   76: aload_0
    //   77: getfield ZW : Lburp/Zli8;
    //   80: invokevirtual ZK : (Lburp/Zm90;Lburp/Zz1m;Lburp/Zeb5;Lburp/Zli8;)Lburp/Zl2k;
    //   83: astore #6
    //   85: istore_1
    //   86: iload_3
    //   87: ifeq -> 102
    //   90: iload #4
    //   92: ifne -> 116
    //   95: goto -> 102
    //   98: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   101: athrow
    //   102: aload_2
    //   103: getstatic burp/Zt4o.USE : Lburp/Zt4o;
    //   106: if_acmpne -> 301
    //   109: goto -> 116
    //   112: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   115: athrow
    //   116: aload_0
    //   117: getfield Zq : Lburp/Zl7h;
    //   120: invokeinterface ZVi : ()Z
    //   125: ifeq -> 301
    //   128: goto -> 135
    //   131: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   134: athrow
    //   135: aload_0
    //   136: getfield ZC : Lburp/Zmv7;
    //   139: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   142: getstatic burp/Zlq7.CREATING_AGENT : Lburp/Zlq7;
    //   145: iconst_3
    //   146: anewarray java/lang/Object
    //   149: dup
    //   150: iconst_0
    //   151: sipush #-29886
    //   154: sipush #-12484
    //   157: invokestatic a : (II)Ljava/lang/String;
    //   160: aastore
    //   161: dup
    //   162: iconst_1
    //   163: iload_3
    //   164: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   167: aastore
    //   168: dup
    //   169: iconst_2
    //   170: iload #4
    //   172: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   175: aastore
    //   176: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   181: aload_0
    //   182: getfield ZY : Lburp/Zs32;
    //   185: invokevirtual ZY : ()Lburp/Zxpl;
    //   188: astore #7
    //   190: aload_0
    //   191: getfield ZY : Lburp/Zs32;
    //   194: aload #7
    //   196: invokevirtual ZO : (Lburp/Zxpl;)Lburp/Zzzx;
    //   199: astore #8
    //   201: new burp/Zs9b
    //   204: dup
    //   205: aload_0
    //   206: getfield Zg : Lburp/Zr69;
    //   209: aload_0
    //   210: getfield ZQ : Lburp/Ztos;
    //   213: aload_0
    //   214: getfield ZM : Lburp/Zz1m;
    //   217: aload_0
    //   218: getfield Zr : Lburp/Ztks;
    //   221: aload_0
    //   222: getfield ZV : Lburp/Zzs1;
    //   225: aload_0
    //   226: getfield ZW : Lburp/Zli8;
    //   229: aload #6
    //   231: aload #8
    //   233: aload_0
    //   234: getfield Zn : Lburp/Zeb5;
    //   237: aload_0
    //   238: getfield Z_ : Lburp/Zm90;
    //   241: aload_0
    //   242: getfield ZO : Lburp/Zr_4;
    //   245: aload_0
    //   246: getfield ZR : Lburp/Zgb6;
    //   249: aload_0
    //   250: <illegal opcode> accept : (Lburp/Zmv2;)Ljava/util/function/BiConsumer;
    //   255: invokespecial <init> : (Lburp/Zr69;Lburp/Ztos;Lburp/Zz1m;Lburp/Ztks;Lburp/Zzs1;Lburp/Zli8;Lburp/Zl2k;Lburp/Zzzx;Lburp/Zeb5;Lburp/Zm90;Lburp/Zr_4;Lburp/Zgb6;Ljava/util/function/BiConsumer;)V
    //   258: astore #9
    //   260: aload #9
    //   262: aload #7
    //   264: invokevirtual ZM : ()Ljava/util/List;
    //   267: invokevirtual Zm : (Ljava/util/List;)V
    //   270: aload_0
    //   271: getfield Zq : Lburp/Zl7h;
    //   274: invokeinterface ZVC : ()V
    //   279: aload #9
    //   281: areturn
    //   282: astore #7
    //   284: aload #7
    //   286: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   289: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   292: aload_0
    //   293: aload_2
    //   294: invokevirtual ZB : (Lburp/Zt4o;)V
    //   297: iload_1
    //   298: ifne -> 418
    //   301: iload_3
    //   302: ifeq -> 365
    //   305: goto -> 312
    //   308: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   311: athrow
    //   312: getstatic burp/Zmgc.BROWSER_START_FAILED_LEGACY_FALLBACK : Lburp/Zmgc;
    //   315: aload_0
    //   316: getfield Zd : Lburp/Zskh;
    //   319: getstatic burp/Zkqn.INFORMATION : Lburp/Zkqn;
    //   322: getstatic net/portswigger/Zie.UNABLE_TO_START_BROWSER : Lnet/portswigger/Zie;
    //   325: ldc ''
    //   327: iconst_0
    //   328: anewarray java/lang/Object
    //   331: invokevirtual Zl : (Lburp/Zskh;Lburp/Zkqn;Lnet/portswigger/Zie;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   334: pop
    //   335: aload_0
    //   336: getfield ZC : Lburp/Zmv7;
    //   339: getstatic burp/Zrp6.INFO : Lburp/Zrp6;
    //   342: getstatic burp/Zlq7.FALLING_BACK_TO_LEGACY_AGENT : Lburp/Zlq7;
    //   345: iconst_0
    //   346: anewarray java/lang/Object
    //   349: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   354: iload_1
    //   355: ifne -> 418
    //   358: goto -> 365
    //   361: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   364: athrow
    //   365: aload_2
    //   366: getstatic burp/Zt4o.ONLY_IF_HARDWARE_SUPPORTS : Lburp/Zt4o;
    //   369: if_acmpne -> 418
    //   372: goto -> 379
    //   375: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   378: athrow
    //   379: aload_0
    //   380: getfield Za : Lburp/Zt0d;
    //   383: invokevirtual ZY : ()Z
    //   386: ifne -> 418
    //   389: goto -> 396
    //   392: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   395: athrow
    //   396: getstatic burp/Zmgc.MIN_SPEC_VIOLATION : Lburp/Zmgc;
    //   399: aload_0
    //   400: getfield Zd : Lburp/Zskh;
    //   403: iconst_0
    //   404: anewarray java/lang/Object
    //   407: invokevirtual ZK : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   410: pop
    //   411: goto -> 418
    //   414: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   417: athrow
    //   418: aload_0
    //   419: getfield Zq : Lburp/Zl7h;
    //   422: invokeinterface ZVA : ()V
    //   427: aload_0
    //   428: getfield ZC : Lburp/Zmv7;
    //   431: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   434: getstatic burp/Zlq7.CREATING_AGENT : Lburp/Zlq7;
    //   437: iconst_3
    //   438: anewarray java/lang/Object
    //   441: dup
    //   442: iconst_0
    //   443: sipush #-29885
    //   446: sipush #-20256
    //   449: invokestatic a : (II)Ljava/lang/String;
    //   452: aastore
    //   453: dup
    //   454: iconst_1
    //   455: iload_3
    //   456: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   459: aastore
    //   460: dup
    //   461: iconst_2
    //   462: iload #4
    //   464: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   467: aastore
    //   468: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   473: new burp/Zgdo
    //   476: dup
    //   477: aload #6
    //   479: aload_0
    //   480: getfield ZW : Lburp/Zli8;
    //   483: invokespecial <init> : (Lburp/Zl2k;Lburp/Zli8;)V
    //   486: invokestatic Zwu : ()[Lburp/Zbqc;
    //   489: ifnonnull -> 515
    //   492: iload_1
    //   493: ifeq -> 511
    //   496: goto -> 503
    //   499: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   502: athrow
    //   503: iconst_0
    //   504: goto -> 512
    //   507: invokestatic a : (Lnet/portswigger/browser/Ztf;)Lnet/portswigger/browser/Ztf;
    //   510: athrow
    //   511: iconst_1
    //   512: invokestatic ZH : (Z)V
    //   515: areturn
    // Exception table:
    //   from	to	target	type
    //   86	95	98	net/portswigger/browser/Ztf
    //   90	109	112	net/portswigger/browser/Ztf
    //   102	128	131	net/portswigger/browser/Ztf
    //   135	281	282	net/portswigger/browser/Ztf
    //   135	281	282	net/portswigger/browser/Ztk
    //   284	305	308	net/portswigger/browser/Ztf
    //   301	358	361	net/portswigger/browser/Ztf
    //   312	372	375	net/portswigger/browser/Ztf
    //   365	389	392	net/portswigger/browser/Ztf
    //   379	411	414	net/portswigger/browser/Ztf
    //   418	496	499	net/portswigger/browser/Ztf
    //   492	507	507	net/portswigger/browser/Ztf
  }
  
  private void ZI(String paramString1, String paramString2) {
    boolean bool = this.Zq.Zm(paramString1, paramString2, this.ZO);
    if (bool)
      Zm2.Zo(Zze0.SCANNER_WEBSOCKET_ENDPOINT_FOUND); 
  }
  
  private void ZB(Zt4o paramZt4o) {
    boolean bool1 = ZQ();
    boolean bool2 = this.Zq.ZVe().ZBZ().stream().anyMatch(Zmv2::lambda$abandonCrawlIfRequired$0);
    if (paramZt4o == Zt4o.USE || !this.Zq.ZVs().isEmpty() || bool2) {
      this.ZG.ZZ(new Zb6l(Zec4.COULD_NOT_START_CHROMIUM_BROWSER));
      if (!bool1) {
        Zmgc.BROWSER_START_FAILED_LEGACY_FALLBACK.Zl(this.Zd, Zkqn.INFORMATION, Zie.UNABLE_TO_START_BROWSER, "", new Object[0]);
        this.ZC.Zy(Zrp6.INFO, Zlq7.FALLING_BACK_TO_LEGACY_AGENT, new Object[0]);
        return;
      } 
      return;
    } 
    Zmgc.BROWSER_START_FAILED_LEGACY_FALLBACK.Zl(this.Zd, Zkqn.INFORMATION, Zie.UNABLE_TO_START_BROWSER, "", new Object[0]);
    this.ZC.Zy(Zrp6.INFO, Zlq7.FALLING_BACK_TO_LEGACY_AGENT, new Object[0]);
  }
  
  private static boolean lambda$abandonCrawlIfRequired$0(Zski paramZski) {
    return (paramZski.Zyb() != null);
  }
  
  public static void ZH(boolean paramBoolean) {
    Zm = paramBoolean;
  }
  
  public static boolean ZV() {
    return Zm;
  }
  
  public static boolean ZQ() {
    boolean bool = ZV();
    return !bool;
  }
  
  private static Ztf a(Ztf paramZtf) {
    return paramZtf;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_0
    //   9: ldc 'ïðÛyo\AV'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: invokestatic ZH : (Z)V
    //   21: bipush #7
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #11
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 86
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: aload #5
    //   73: putstatic burp/Zmv2.a : [Ljava/lang/String;
    //   76: iconst_2
    //   77: anewarray java/lang/String
    //   80: putstatic burp/Zmv2.b : [Ljava/lang/String;
    //   83: goto -> 231
    //   86: dup_x2
    //   87: pop
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup_x1
    //   92: arraylength
    //   93: dup_x2
    //   94: pop
    //   95: iconst_0
    //   96: istore #6
    //   98: dup2_x1
    //   99: pop2
    //   100: dup_x2
    //   101: iconst_1
    //   102: if_icmpgt -> 204
    //   105: dup2
    //   106: swap
    //   107: iload #6
    //   109: dup2_x1
    //   110: caload
    //   111: swap
    //   112: iload #6
    //   114: bipush #7
    //   116: irem
    //   117: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #74
    //   158: goto -> 188
    //   161: bipush #62
    //   163: goto -> 188
    //   166: bipush #111
    //   168: goto -> 188
    //   171: bipush #62
    //   173: goto -> 188
    //   176: bipush #17
    //   178: goto -> 188
    //   181: bipush #49
    //   183: goto -> 188
    //   186: bipush #103
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 109
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 105
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 43
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8B42) & 0xFFFF;
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
      char c = 'õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmv2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */