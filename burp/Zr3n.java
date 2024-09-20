package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zr3n {
  private final Zruu Zb;
  
  private final Ztmc ZH;
  
  private final Zg41 Zq;
  
  private final Zsus Zu;
  
  private final Zl7y ZF;
  
  private final Zmsm Zs;
  
  private final Zze7 ZP;
  
  private final Zbnt ZS;
  
  private final Function<Zs98, Zrc1> Zi;
  
  private final Ztcy ZD;
  
  private final Zkl6 Z_;
  
  private final Zet6 Zh;
  
  private final Zz28 Zx;
  
  private final Zsv0 ZU;
  
  public Zr3n(Zruu paramZruu, Ztmc paramZtmc, Zl7y paramZl7y, Zg41 paramZg41, Zsus paramZsus, Zmsm paramZmsm, Zze7 paramZze7, Function<Zs98, Zrc1> paramFunction, Ztcy paramZtcy, Zkl6 paramZkl6, Zet6 paramZet6, Zz28 paramZz28, Zerg paramZerg) {
    this.Zb = paramZruu;
    this.ZH = paramZtmc;
    this.ZF = paramZl7y;
    this.Zq = paramZg41;
    this.Zu = paramZsus;
    this.Zs = paramZmsm;
    this.ZP = paramZze7;
    this.ZS = paramZkl6.ZB();
    this.Zi = paramFunction;
    this.ZD = paramZtcy;
    this.Z_ = paramZkl6;
    this.Zh = paramZet6;
    this.Zx = paramZz28;
    this.ZU = paramZerg::lambda$new$0;
  }
  
  public Zezo Zp(Zlog paramZlog, Zr69 paramZr69, Zlz4 paramZlz4, Zskh paramZskh, Ztos<Zt13> paramZtos, Ztos<Zt18> paramZtos1, Ztdi paramZtdi, Zzs1 paramZzs1, Zkf3 paramZkf3) {
    return this.Zb.ZO(paramZlog, paramZr69, paramZlz4, Zkcl.SCAN_CRAWL, paramZtos, paramZtos1, paramZskh, paramZtdi, paramZzs1, paramZkf3);
  }
  
  public Zriy Zn(Zr5h paramZr5h, Zb9a paramZb9a, Zkq4 paramZkq4, Zkg9 paramZkg9, Zgq5 paramZgq5, Zto9 paramZto9, Zskh paramZskh, Ztdi paramZtdi, Zzs1 paramZzs1, Znn paramZnn) {
    return this.ZH.ZL(Ztzd.ZO().Zz(paramZr5h).ZT(paramZkq4).ZI(paramZb9a).Zj(paramZkg9).ZN(paramZnn).ZY(paramZgq5).ZU(this.Zx).Zx(paramZr5h.ZNs()).Ze(paramZto9).ZK(paramZskh).Zj(paramZtdi).ZI(paramZzs1).Za(this.ZU));
  }
  
  public Zxn8 Zb(Zzep paramZzep, Zr69 paramZr69, Zb9a paramZb9a, Zkq4 paramZkq4, Zkg9 paramZkg9, Zlz4 paramZlz4, Zgq5 paramZgq5, Zto9 paramZto9, Ztos<Zt18> paramZtos, Zskh paramZskh, Ztdi paramZtdi, Zzs1 paramZzs1, Zkf3 paramZkf3, Znn paramZnn) {
    Zezo zezo = this.Zb.ZO(paramZzep, paramZr69, paramZlz4, Zkcl.SCAN_CRAWL_AND_AUDIT, paramZto9, paramZtos, paramZskh, paramZtdi, paramZzs1, paramZkf3);
    Zriy zriy = this.ZH.ZL(Ztzd.ZO().Zz(paramZzep).ZT(paramZkq4).ZU(paramZzep.ZnH()).ZE(paramZr69).ZI(paramZb9a).ZU(paramZr69).Zj(paramZkg9).ZN(paramZnn).ZY(paramZgq5).Zx(Zkcl.SCAN_CRAWL_AND_AUDIT).Ze(paramZto9).ZK(paramZskh).Zj(paramZtdi).ZI(paramZzs1).Za(this.ZU));
    return this.ZF.Zn(paramZzep, zezo, zriy, paramZr69, paramZkq4, paramZb9a, paramZto9, paramZskh, paramZkf3);
  }
  
  public Zriy Zq(Ztr3 paramZtr3, Zb9a paramZb9a, Zkq4 paramZkq4, Zkg9 paramZkg9, Zgq5 paramZgq5, Zto9 paramZto9, Zskh paramZskh, Ztdi paramZtdi, Zzs1 paramZzs1, Znn paramZnn) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZH : Lburp/Ztmc;
    //   4: invokestatic ZO : ()Lburp/Ztzd;
    //   7: aload_1
    //   8: invokevirtual Zz : (Lburp/Zr5h;)Lburp/Ztzd;
    //   11: aload_3
    //   12: invokevirtual ZT : (Lburp/Zkq4;)Lburp/Ztzd;
    //   15: aload_2
    //   16: invokevirtual ZI : (Lburp/Zb9a;)Lburp/Ztzd;
    //   19: aload #4
    //   21: invokevirtual Zj : (Lburp/Zkg9;)Lburp/Ztzd;
    //   24: aload #10
    //   26: invokevirtual ZN : (Lburp/Znn;)Lburp/Ztzd;
    //   29: aload #5
    //   31: invokevirtual ZY : (Lburp/Zgq5;)Lburp/Ztzd;
    //   34: aload_0
    //   35: getfield Zx : Lburp/Zz28;
    //   38: invokevirtual ZU : (Lburp/Zz28;)Lburp/Ztzd;
    //   41: getstatic burp/Zkcl.LIVE_AUDIT : Lburp/Zkcl;
    //   44: invokevirtual Zx : (Lburp/Zkcl;)Lburp/Ztzd;
    //   47: aload #6
    //   49: invokevirtual Ze : (Lburp/Zto9;)Lburp/Ztzd;
    //   52: aload #7
    //   54: invokevirtual ZK : (Lburp/Zskh;)Lburp/Ztzd;
    //   57: aload #8
    //   59: invokevirtual Zj : (Lburp/Ztdi;)Lburp/Ztzd;
    //   62: aload #9
    //   64: invokevirtual ZI : (Lburp/Zzs1;)Lburp/Ztzd;
    //   67: aload_0
    //   68: getfield ZU : Lburp/Zsv0;
    //   71: invokevirtual Za : (Lburp/Zsv0;)Lburp/Ztzd;
    //   74: invokevirtual ZL : (Lburp/Ztzd;)Lburp/Zriy;
    //   77: astore #11
    //   79: new burp/Zg2o
    //   82: dup
    //   83: aload_2
    //   84: dup
    //   85: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   88: pop
    //   89: <illegal opcode> accept : (Lburp/Zb9a;)Ljava/util/function/Consumer;
    //   94: aload_3
    //   95: invokeinterface Zs6 : ()Z
    //   100: aload_0
    //   101: aload_1
    //   102: <illegal opcode> get : (Lburp/Zr3n;Lburp/Ztr3;)Ljava/util/function/Supplier;
    //   107: aload_1
    //   108: aload_0
    //   109: getfield Zu : Lburp/Zsus;
    //   112: invokespecial <init> : (Ljava/util/function/Consumer;ZLjava/util/function/Supplier;Lburp/Ztr3;Lburp/Zsus;)V
    //   115: astore #12
    //   117: aload_0
    //   118: getfield Zs : Lburp/Zmsm;
    //   121: aload #12
    //   123: invokevirtual ZO : (Lburp/Zeih;)V
    //   126: new java/util/concurrent/atomic/AtomicReference
    //   129: dup
    //   130: invokespecial <init> : ()V
    //   133: astore #13
    //   135: aload #13
    //   137: aload #6
    //   139: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   142: aload_0
    //   143: aload #12
    //   145: aload #13
    //   147: <illegal opcode> accept : (Lburp/Zr3n;Lburp/Zg2o;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   152: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   155: invokevirtual set : (Ljava/lang/Object;)V
    //   158: aload #11
    //   160: areturn
  }
  
  public Zriy ZW(Ztr3 paramZtr3, Zkq4 paramZkq4, Zgq5 paramZgq5, Zto9 paramZto9, Zskh paramZskh, Ztdi paramZtdi, Zzs1 paramZzs1, Zg09 paramZg09, Znn paramZnn) {
    Zz1i zz1i = paramZtr3.Zdm();
    Zkcl zkcl = paramZtr3.ZNs();
    int[] arrayOfInt = Zsyh.ZR();
    Zuh.Zb((zkcl == Zkcl.LEGACY_EXTENSION_PASSIVE_AUDIT || zkcl == Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT), Zqf.Zr);
    Zb9a zb9a = this.Zq.Zy(zz1i, paramZkq4, paramZg09, paramZto9);
    if (zkcl == Zkcl.LEGACY_EXTENSION_PASSIVE_AUDIT) {
      this.ZD.ZN(zb9a);
      if (arrayOfInt == null) {
        this.ZD.Zq(zb9a);
        return this.ZH.ZL(Ztzd.ZO().Zz(paramZtr3).ZT(paramZkq4).ZI(zb9a).ZY(paramZgq5).ZN(paramZnn).ZU(this.Zx).Zx(Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT).Ze(paramZto9).ZK(paramZskh).Zj(paramZtdi).ZI(paramZzs1).Za(this.ZU));
      } 
      return this.ZH.ZL(Ztzd.ZO().Zz(paramZtr3).ZT(paramZkq4).ZI(zb9a).ZY(paramZgq5).ZN(paramZnn).ZU(this.Zx).Zx(Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT).Ze(paramZto9).ZK(paramZskh).Zj(paramZtdi).ZI(paramZzs1).Za(this.ZU));
    } 
    this.ZD.Zq(zb9a);
    return this.ZH.ZL(Ztzd.ZO().Zz(paramZtr3).ZT(paramZkq4).ZI(zb9a).ZY(paramZgq5).ZN(paramZnn).ZU(this.Zx).Zx(Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT).Ze(paramZto9).ZK(paramZskh).Zj(paramZtdi).ZI(paramZzs1).Za(this.ZU));
  }
  
  public Zbur Zc(Ze9i paramZe9i, Ztos<Zt13> paramZtos) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zno : ()Lburp/Zs98;
    //   6: astore #4
    //   8: new burp/Zrjo
    //   11: dup
    //   12: aload #4
    //   14: aload_0
    //   15: aload #4
    //   17: <illegal opcode> get : (Lburp/Zr3n;Lburp/Zs98;)Ljava/util/function/Supplier;
    //   22: invokespecial <init> : (Lburp/Zs98;Ljava/util/function/Supplier;)V
    //   25: astore #5
    //   27: invokestatic ZR : ()[I
    //   30: new burp/Zsgs
    //   33: dup
    //   34: aload #4
    //   36: aload #5
    //   38: aload_0
    //   39: getfield ZS : Lburp/Zbnt;
    //   42: aload_0
    //   43: getfield Z_ : Lburp/Zkl6;
    //   46: invokeinterface ZH : ()Lburp/Zey9;
    //   51: invokespecial <init> : (Lburp/Zs98;Lburp/Zrjo;Lburp/Zbnt;Lburp/Zey9;)V
    //   54: astore #6
    //   56: new burp/Zega
    //   59: dup
    //   60: aload #6
    //   62: aload #4
    //   64: invokeinterface ZC6 : ()Lburp/Zzcq;
    //   69: aload #4
    //   71: invokeinterface ZCB : ()Lburp/Zzcq;
    //   76: aload_2
    //   77: invokespecial <init> : (Lburp/Zsgs;Lburp/Zzcq;Lburp/Zzcq;Lburp/Zz1m;)V
    //   80: astore #7
    //   82: aload_0
    //   83: getfield Zi : Ljava/util/function/Function;
    //   86: aload #4
    //   88: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   93: checkcast burp/Zrc1
    //   96: astore #8
    //   98: new burp/Zla_
    //   101: dup
    //   102: aload #8
    //   104: invokespecial <init> : (Lburp/Zrc1;)V
    //   107: astore #9
    //   109: new burp/Zey2
    //   112: dup
    //   113: new burp/Zxl2
    //   116: dup
    //   117: aload #8
    //   119: aload #4
    //   121: aload #5
    //   123: invokespecial <init> : (Lburp/Zrc1;Lburp/Zs98;Lburp/Zrjo;)V
    //   126: aload #7
    //   128: aload_0
    //   129: aload_1
    //   130: <illegal opcode> get : (Lburp/Zr3n;Lburp/Ze9i;)Ljava/util/function/Supplier;
    //   135: aload_1
    //   136: invokespecial <init> : (Lburp/Zxl2;Lburp/Zega;Ljava/util/function/Supplier;Lburp/Ze9i;)V
    //   139: astore #10
    //   141: aload_0
    //   142: getfield ZP : Lburp/Zze7;
    //   145: aload #10
    //   147: invokevirtual Zy : (Lburp/Zey2;)V
    //   150: new java/util/concurrent/atomic/AtomicReference
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: astore #11
    //   159: astore_3
    //   160: aload #11
    //   162: aload_2
    //   163: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   166: aload_0
    //   167: aload #10
    //   169: aload #11
    //   171: <illegal opcode> accept : (Lburp/Zr3n;Lburp/Zey2;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   176: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   179: invokevirtual set : (Ljava/lang/Object;)V
    //   182: aload #9
    //   184: aload #7
    //   186: invokevirtual ZD : (Lburp/Zega;)Lburp/Zbur;
    //   189: invokestatic Zwu : ()[Lburp/Zbqc;
    //   192: ifnonnull -> 201
    //   195: iconst_3
    //   196: newarray int
    //   198: invokestatic Za : ([I)V
    //   201: areturn
  }
  
  private void lambda$buildLivePassiveCrawlWorkGenerator$5(Zey2 paramZey2, AtomicReference<Zgrn> paramAtomicReference, Zxr8 paramZxr8) {
    this.ZP.Zh(paramZey2);
    ((Zgrn)paramAtomicReference.get()).ZZ();
  }
  
  private Zz28 lambda$buildLivePassiveCrawlWorkGenerator$4(Ze9i paramZe9i) {
    return this.Zh.Zr(paramZe9i);
  }
  
  private Zz28 lambda$buildLivePassiveCrawlWorkGenerator$3(Zs98 paramZs98) {
    return this.Zh.Zr(paramZs98);
  }
  
  private void lambda$buildLiveAuditWorkGenerator$2(Zg2o paramZg2o, AtomicReference<Zgrn> paramAtomicReference, Zxr8 paramZxr8) {
    this.Zs.ZM(paramZg2o);
    ((Zgrn)paramAtomicReference.get()).ZZ();
  }
  
  private Zz28 lambda$buildLiveAuditWorkGenerator$1(Ztr3 paramZtr3) {
    return this.Zh.Zr(paramZtr3);
  }
  
  private static List lambda$new$0(Zerg paramZerg) {
    return paramZerg.ZM().ZQ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr3n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */