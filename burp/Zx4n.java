package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Zx4n implements Zmlg {
  private final Zzxp ZI;
  
  private final Zey9 Zv;
  
  private final Zmyd Zu;
  
  private final Zsba Zm;
  
  private final Zb_v Zd;
  
  private final Zmwg ZU;
  
  private final Zet2 ZK;
  
  private final Zlg Zp;
  
  private final boolean ZY;
  
  private Zefx Zj;
  
  private int Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zx4n(Zr6q paramZr6q, Zzxp paramZzxp, Zz1p paramZz1p, Zey9 paramZey9) {
    this.Zj = paramZr6q;
    this.ZI = paramZzxp;
    this.Zv = paramZey9;
    int[] arrayOfInt = Zb6u.ZI();
    if (paramZz1p != null) {
      this.Zu = new Zmyd(paramZz1p);
      this.Zi = paramZz1p.ZO();
      this.Zm = paramZz1p.ZY;
      this.ZY = (this.Zm == Zsba.MULTIPART);
      this.Zd = new Zb_v(paramZz1p.ZG(), paramZz1p.ZV);
      this.ZU = new Zmwg(paramZz1p.ZV, this::ZO, this::lambda$new$0);
      this.ZK = new Zet2(paramZz1p.ZG(), paramZz1p.ZF, paramZz1p.ZP);
      this.Zp = new Zlg(this.ZK);
      if (arrayOfInt != null) {
        this.Zu = null;
        this.Zi = -1;
        this.Zm = null;
        this.ZY = false;
        this.Zd = null;
        this.ZU = null;
        this.ZK = null;
        this.Zp = null;
        return;
      } 
      return;
    } 
    this.Zu = null;
    this.Zi = -1;
    this.Zm = null;
    this.ZY = false;
    this.Zd = null;
    this.ZU = null;
    this.ZK = null;
    this.Zp = null;
  }
  
  public Zefx ZO() {
    return this.Zj;
  }
  
  public List<Zbin> Zx() {
    return this.Zu.Zw();
  }
  
  public List<Zb6w> ZU() {
    return this.Zd.Zo();
  }
  
  public List<Zevy> ZS() {
    return this.Zp.Zp();
  }
  
  public List<Zmv3> ZP() {
    return this.ZU.Zc();
  }
  
  public List<Ztnj> Zc() {
    return this.ZK.ZK();
  }
  
  public void ZS(String paramString1, String paramString2) {
    Zga7 zga7 = this.Zd.ZU(paramString1, paramString2);
    zga7.Zu(this.ZI);
    this.Zj = this.Zv.Zy(this.ZI.Za());
    this.ZK.Zu(zga7.Zy());
    this.ZU.ZU(zga7.Zy());
    this.Zi += zga7.Zy();
  }
  
  public void ZA(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Lburp/Zlg;
    //   4: aload_1
    //   5: aload_2
    //   6: invokevirtual ZI : (Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //   9: astore_3
    //   10: new java/util/concurrent/atomic/AtomicInteger
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore #4
    //   19: aload_3
    //   20: aload_0
    //   21: aload #4
    //   23: <illegal opcode> accept : (Lburp/Zx4n;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
    //   28: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   33: aload_0
    //   34: aload_0
    //   35: getfield Zv : Lburp/Zey9;
    //   38: aload_0
    //   39: getfield ZI : Lburp/Zzxp;
    //   42: invokeinterface Za : ()Lburp/Zsmh;
    //   47: invokevirtual Zy : (Lburp/Zsmh;)Lburp/Zefx;
    //   50: putfield Zj : Lburp/Zefx;
    //   53: aload_0
    //   54: getfield ZU : Lburp/Zmwg;
    //   57: aload #4
    //   59: invokevirtual get : ()I
    //   62: invokevirtual ZU : (I)V
    //   65: aload_0
    //   66: dup
    //   67: getfield Zi : I
    //   70: aload #4
    //   72: invokevirtual get : ()I
    //   75: iadd
    //   76: putfield Zi : I
    //   79: return
  }
  
  public void ZE(String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic ZI : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZY : Z
    //   8: ifeq -> 136
    //   11: aload_0
    //   12: getfield ZK : Lburp/Zet2;
    //   15: sipush #-7518
    //   18: sipush #9712
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: invokevirtual ZJ : (Ljava/lang/String;)Ljava/lang/String;
    //   27: astore #4
    //   29: aload #4
    //   31: sipush #-7516
    //   34: sipush #27879
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: invokevirtual indexOf : (Ljava/lang/String;)I
    //   43: istore #5
    //   45: aload #4
    //   47: iload #5
    //   49: bipush #9
    //   51: iadd
    //   52: invokevirtual substring : (I)Ljava/lang/String;
    //   55: astore #6
    //   57: aload_0
    //   58: getfield Zj : Lburp/Zefx;
    //   61: invokestatic Zu : (Lburp/Zsmh;)[B
    //   64: astore #7
    //   66: aload #7
    //   68: aload #6
    //   70: sipush #-7515
    //   73: sipush #-27979
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: swap
    //   80: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   85: invokestatic Zy : (Ljava/lang/String;)[B
    //   88: aload #7
    //   90: arraylength
    //   91: aload #6
    //   93: invokevirtual length : ()I
    //   96: isub
    //   97: bipush #10
    //   99: isub
    //   100: aload #7
    //   102: arraylength
    //   103: invokestatic ZV : ([B[BII)I
    //   106: istore #8
    //   108: aload_0
    //   109: getfield ZU : Lburp/Zmwg;
    //   112: aload_1
    //   113: aload_2
    //   114: aload #6
    //   116: iload #8
    //   118: invokevirtual ZB : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lburp/Zga7;
    //   121: astore #9
    //   123: aload #9
    //   125: aload_0
    //   126: getfield ZI : Lburp/Zzxp;
    //   129: invokevirtual Zu : (Lburp/Zzxp;)V
    //   132: aload_3
    //   133: ifnull -> 228
    //   136: aload_0
    //   137: getfield ZU : Lburp/Zmwg;
    //   140: aload_1
    //   141: aload_2
    //   142: invokevirtual Zt : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zga7;
    //   145: astore #4
    //   147: aload #4
    //   149: aload_0
    //   150: getfield ZI : Lburp/Zzxp;
    //   153: invokevirtual Zu : (Lburp/Zzxp;)V
    //   156: aload_0
    //   157: invokevirtual ZP : ()Ljava/util/List;
    //   160: invokeinterface size : ()I
    //   165: iconst_1
    //   166: if_icmpne -> 228
    //   169: aload_0
    //   170: getfield ZK : Lburp/Zet2;
    //   173: sipush #-7513
    //   176: sipush #-19851
    //   179: invokestatic a : (II)Ljava/lang/String;
    //   182: invokevirtual Zw : (Ljava/lang/String;)Lburp/Zxeq;
    //   185: astore #5
    //   187: aload #5
    //   189: aload_0
    //   190: getfield ZI : Lburp/Zzxp;
    //   193: invokeinterface Zu : (Lburp/Zzxp;)V
    //   198: aload_0
    //   199: getfield ZU : Lburp/Zmwg;
    //   202: aload #5
    //   204: invokeinterface Zy : ()I
    //   209: invokevirtual ZU : (I)V
    //   212: aload_0
    //   213: dup
    //   214: getfield Zi : I
    //   217: aload #5
    //   219: invokeinterface Zy : ()I
    //   224: iadd
    //   225: putfield Zi : I
    //   228: aload_0
    //   229: aload_0
    //   230: getfield Zv : Lburp/Zey9;
    //   233: aload_0
    //   234: getfield ZI : Lburp/Zzxp;
    //   237: invokeinterface Za : ()Lburp/Zsmh;
    //   242: invokevirtual Zy : (Lburp/Zsmh;)Lburp/Zefx;
    //   245: putfield Zj : Lburp/Zefx;
    //   248: return
  }
  
  public void Zg(int paramInt, String paramString) {
    Zxeq zxeq = this.Zu.Zc(paramInt, paramString);
    zxeq.Zu(this.ZI);
    this.Zj = this.Zv.Zy(this.ZI.Za());
    this.Zd.ZQ(zxeq.Zy());
    this.ZK.Zu(zxeq.Zy());
    this.ZU.ZU(zxeq.Zy());
    this.Zi += zxeq.Zy();
  }
  
  public void ZG(int paramInt, String paramString1, String paramString2) {
    Zrif zrif = this.Zd.Zq(paramInt, paramString1, paramString2);
    zrif.Zu(this.ZI);
    this.Zj = this.Zv.Zy(this.ZI.Za());
    this.ZK.Zu(zrif.Zy());
    this.ZU.ZU(zrif.Zy());
    this.Zi += zrif.Zy();
  }
  
  public void ZN(int paramInt, String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Lburp/Zlg;
    //   4: iload_1
    //   5: aload_2
    //   6: aload_3
    //   7: invokevirtual Zw : (ILjava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //   10: astore #4
    //   12: new java/util/concurrent/atomic/AtomicInteger
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #5
    //   21: aload #4
    //   23: aload_0
    //   24: aload #5
    //   26: <illegal opcode> accept : (Lburp/Zx4n;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
    //   31: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   36: aload_0
    //   37: aload_0
    //   38: getfield Zv : Lburp/Zey9;
    //   41: aload_0
    //   42: getfield ZI : Lburp/Zzxp;
    //   45: invokeinterface Za : ()Lburp/Zsmh;
    //   50: invokevirtual Zy : (Lburp/Zsmh;)Lburp/Zefx;
    //   53: putfield Zj : Lburp/Zefx;
    //   56: aload_0
    //   57: getfield ZU : Lburp/Zmwg;
    //   60: aload #5
    //   62: invokevirtual get : ()I
    //   65: invokevirtual ZU : (I)V
    //   68: aload_0
    //   69: dup
    //   70: getfield Zi : I
    //   73: aload #5
    //   75: invokevirtual get : ()I
    //   78: iadd
    //   79: putfield Zi : I
    //   82: return
  }
  
  public void ZX(int paramInt, String paramString1, String paramString2) {
    List<Zrif> list = this.ZU.ZD(paramInt, paramString1, paramString2);
    list.forEach(this::lambda$replaceBodyParameter$3);
    this.Zj = this.Zv.Zy(this.ZI.Za());
  }
  
  public void ZJ(List<Integer> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zd : Lburp/Zb_v;
    //   4: aload_1
    //   5: invokevirtual ZY : (Ljava/util/List;)Ljava/util/List;
    //   8: astore_2
    //   9: new java/util/concurrent/atomic/AtomicInteger
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore_3
    //   17: aload_2
    //   18: aload_0
    //   19: aload_3
    //   20: <illegal opcode> accept : (Lburp/Zx4n;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
    //   25: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   30: aload_0
    //   31: aload_0
    //   32: getfield Zv : Lburp/Zey9;
    //   35: aload_0
    //   36: getfield ZI : Lburp/Zzxp;
    //   39: invokeinterface Za : ()Lburp/Zsmh;
    //   44: invokevirtual Zy : (Lburp/Zsmh;)Lburp/Zefx;
    //   47: putfield Zj : Lburp/Zefx;
    //   50: aload_0
    //   51: getfield ZK : Lburp/Zet2;
    //   54: aload_3
    //   55: invokevirtual get : ()I
    //   58: invokevirtual Zu : (I)V
    //   61: aload_0
    //   62: getfield ZU : Lburp/Zmwg;
    //   65: aload_3
    //   66: invokevirtual get : ()I
    //   69: invokevirtual ZU : (I)V
    //   72: aload_0
    //   73: dup
    //   74: getfield Zi : I
    //   77: aload_3
    //   78: invokevirtual get : ()I
    //   81: iadd
    //   82: putfield Zi : I
    //   85: return
  }
  
  public void ZN(List<Integer> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Lburp/Zlg;
    //   4: aload_1
    //   5: invokevirtual ZM : (Ljava/util/List;)Ljava/util/List;
    //   8: astore_2
    //   9: new java/util/concurrent/atomic/AtomicInteger
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore_3
    //   17: aload_2
    //   18: aload_0
    //   19: aload_3
    //   20: <illegal opcode> accept : (Lburp/Zx4n;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
    //   25: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   30: aload_0
    //   31: aload_0
    //   32: getfield Zv : Lburp/Zey9;
    //   35: aload_0
    //   36: getfield ZI : Lburp/Zzxp;
    //   39: invokeinterface Za : ()Lburp/Zsmh;
    //   44: invokevirtual Zy : (Lburp/Zsmh;)Lburp/Zefx;
    //   47: putfield Zj : Lburp/Zefx;
    //   50: aload_0
    //   51: getfield ZU : Lburp/Zmwg;
    //   54: aload_3
    //   55: invokevirtual get : ()I
    //   58: invokevirtual ZU : (I)V
    //   61: aload_0
    //   62: dup
    //   63: getfield Zi : I
    //   66: aload_3
    //   67: invokevirtual get : ()I
    //   70: iadd
    //   71: putfield Zi : I
    //   74: return
  }
  
  public void ZF(List<Integer> paramList) {
    List<Zmg4> list = this.ZU.Zc(paramList);
    list.forEach(this::lambda$removeBodyParameters$6);
    this.Zj = this.Zv.Zy(this.ZI.Za());
  }
  
  public void Zk(int paramInt1, int paramInt2) {
    Zrif zrif = this.Zd.ZI(paramInt1, paramInt2);
    zrif.Zu(this.ZI);
    this.Zj = this.Zv.Zy(this.ZI.Za());
  }
  
  public void Zf(int paramInt1, int paramInt2) {
    List<Zxeq> list = this.Zp.ZD(paramInt1, paramInt2);
    list.forEach(this::lambda$swapAdjacentCookies$7);
    this.Zj = this.Zv.Zy(this.ZI.Za());
  }
  
  public void Zb(int paramInt1, int paramInt2) {
    Zrif zrif = this.ZU.Zp(paramInt1, paramInt2);
    zrif.Zu(this.ZI);
    this.Zj = this.Zv.Zy(this.ZI.Za());
  }
  
  public void ZW(String paramString1, String paramString2) {
    Zga7 zga7 = this.ZK.ZW(paramString1, paramString2);
    zga7.Zu(this.ZI);
    this.Zj = this.Zv.Zy(this.ZI.Za());
    Ztnj ztnj = this.ZK.ZD();
    if (ztnj.ZA())
      this.Zp.Zz(); 
    this.ZU.ZU(zga7.Zy());
    this.Zi += zga7.Zy();
  }
  
  public void ZZ(int paramInt, String paramString1, String paramString2) {
    Ztnj ztnj1 = this.ZK.Zo(paramInt);
    Zrif zrif = this.ZK.Za(paramInt, paramString1, paramString2);
    Ztnj ztnj2 = this.ZK.Zo(paramInt);
    zrif.Zu(this.ZI);
    this.Zj = this.Zv.Zy(this.ZI.Za());
    if (ztnj1.ZA() || ztnj2.ZA())
      this.Zp.Zz(); 
    this.ZU.ZU(zrif.Zy());
    this.Zi += zrif.Zy();
  }
  
  public void ZI(List<Integer> paramList) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: aload_0
    //   7: <illegal opcode> test : (Lburp/Zx4n;)Ljava/util/function/Predicate;
    //   12: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   17: istore_2
    //   18: aload_0
    //   19: getfield ZK : Lburp/Zet2;
    //   22: aload_1
    //   23: invokevirtual ZJ : (Ljava/util/List;)Ljava/util/List;
    //   26: astore_3
    //   27: new java/util/concurrent/atomic/AtomicInteger
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore #4
    //   36: aload_3
    //   37: aload_0
    //   38: aload #4
    //   40: <illegal opcode> accept : (Lburp/Zx4n;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
    //   45: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   50: aload_0
    //   51: aload_0
    //   52: getfield Zv : Lburp/Zey9;
    //   55: aload_0
    //   56: getfield ZI : Lburp/Zzxp;
    //   59: invokeinterface Za : ()Lburp/Zsmh;
    //   64: invokevirtual Zy : (Lburp/Zsmh;)Lburp/Zefx;
    //   67: putfield Zj : Lburp/Zefx;
    //   70: iload_2
    //   71: ifeq -> 81
    //   74: aload_0
    //   75: getfield Zp : Lburp/Zlg;
    //   78: invokevirtual Zz : ()V
    //   81: aload_0
    //   82: getfield ZU : Lburp/Zmwg;
    //   85: aload #4
    //   87: invokevirtual get : ()I
    //   90: invokevirtual ZU : (I)V
    //   93: aload_0
    //   94: dup
    //   95: getfield Zi : I
    //   98: aload #4
    //   100: invokevirtual get : ()I
    //   103: iadd
    //   104: putfield Zi : I
    //   107: return
  }
  
  public void ZO(int paramInt1, int paramInt2) {
    int i = Math.min(paramInt1, paramInt2);
    int j = Math.max(paramInt1, paramInt2);
    Ztnj ztnj1 = this.ZK.Zo(i);
    Ztnj ztnj2 = this.ZK.Zo(j);
    byte[] arrayOfByte = new byte[ztnj1.Zb() + ztnj2.Zb()];
    System.arraycopy(ztnj2.ZU(), 0, arrayOfByte, 0, ztnj2.Zb());
    System.arraycopy(ztnj1.ZU(), 0, arrayOfByte, ztnj2.Zb(), ztnj1.Zb());
    this.ZI.ZY(ztnj1.Zn, ztnj2.ZB, arrayOfByte);
    this.Zj = this.Zv.Zy(this.ZI.Za());
    this.ZK.Za(i, j);
  }
  
  public boolean Zp(int paramInt) {
    return (paramInt >= this.Zi && this.Zm == Zsba.XML);
  }
  
  public boolean ZX() {
    return (a(-7514, -21923).equalsIgnoreCase(this.Zu.ZC()) || this.Zm == Zsba.MULTIPART || this.Zm == Zsba.URL_ENCODED || this.Zm == Zsba.NONE);
  }
  
  private boolean lambda$removeHeaders$8(Integer paramInteger) {
    return this.ZK.Zo(paramInteger.intValue()).ZA();
  }
  
  private void lambda$swapAdjacentCookies$7(Zxeq paramZxeq) {
    paramZxeq.Zu(this.ZI);
  }
  
  private void lambda$removeBodyParameters$6(Zmg4 paramZmg4) {
    paramZmg4.Zu(this.ZI);
  }
  
  private void lambda$removeQueryParameters$4(AtomicInteger paramAtomicInteger, Zmg4 paramZmg4) {
    paramZmg4.Zu(this.ZI);
    paramAtomicInteger.addAndGet(paramZmg4.Zy());
  }
  
  private void lambda$replaceBodyParameter$3(Zrif paramZrif) {
    paramZrif.Zu(this.ZI);
  }
  
  private void lambda$addCookie$1(AtomicInteger paramAtomicInteger, Zxeq paramZxeq) {
    paramZxeq.Zu(this.ZI);
    paramAtomicInteger.addAndGet(paramZxeq.Zy());
  }
  
  private Integer lambda$new$0() {
    return Integer.valueOf(this.Zi);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÄË¼!± £é¶¸@«á¤¥xÿà,MïïþÜà~¨-\\tù»p|´Òs'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #65
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc 'ÿ¨\\f|µHdEVWd"«'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_2
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #101
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 79
    //   124: aload #5
    //   126: putstatic burp/Zx4n.a : [Ljava/lang/String;
    //   129: iconst_5
    //   130: anewarray java/lang/String
    //   133: putstatic burp/Zx4n.b : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 256
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #95
    //   210: goto -> 240
    //   213: bipush #37
    //   215: goto -> 240
    //   218: bipush #93
    //   220: goto -> 240
    //   223: bipush #113
    //   225: goto -> 240
    //   228: bipush #118
    //   230: goto -> 240
    //   233: bipush #63
    //   235: goto -> 240
    //   238: bipush #96
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 162
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 158
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 96
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE2A6) & 0xFFFF;
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
      byte b1 = 95;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */