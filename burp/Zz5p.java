package burp;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zz5p {
  private final Zruu Zb;
  
  private final Ztmc Zx;
  
  private final Zl7y Ze;
  
  private final Zmsm Zt;
  
  private final Zze7 Zr;
  
  private final Zet6 ZW;
  
  private final Zz28 Zn;
  
  private final Zsus ZJ;
  
  private final Function<Zs98, Zrc1> Zo;
  
  private final Ztcy Zl;
  
  private final Zkl6 ZC;
  
  public Zz5p(Zruu paramZruu, Ztmc paramZtmc, Zl7y paramZl7y, Zmsm paramZmsm, Zze7 paramZze7, Zet6 paramZet6, Zz28 paramZz28, Function<Zs98, Zrc1> paramFunction, Ztcy paramZtcy, Zsus paramZsus, Zkl6 paramZkl6) {
    this.Zb = paramZruu;
    this.Zx = paramZtmc;
    this.Ze = paramZl7y;
    this.Zt = paramZmsm;
    this.Zr = paramZze7;
    this.ZW = paramZet6;
    this.Zn = paramZz28;
    this.ZJ = paramZsus;
    this.Zo = paramFunction;
    this.Zl = paramZtcy;
    this.ZC = paramZkl6;
  }
  
  public Zezo Zg(Zlog paramZlog, Zr69 paramZr69, Zlz4 paramZlz4, Zskh paramZskh, Ztos<Zt13> paramZtos, Ztos<Zt18> paramZtos1, Ztdi paramZtdi, Zzs1 paramZzs1, Zkf3 paramZkf3) {
    return this.Zb.ZO(paramZlog, paramZr69, paramZlz4, Zkcl.SCAN_CRAWL, paramZtos, paramZtos1, paramZskh, paramZtdi, paramZzs1, paramZkf3);
  }
  
  public Zriy Zp(Zr5h paramZr5h, Zkg9 paramZkg9, Zb9a paramZb9a, Zkq4 paramZkq4, Zgq5 paramZgq5, Zto9 paramZto9, Zskh paramZskh, Ztdi paramZtdi, Znn paramZnn, Zzs1 paramZzs1, Zsv0 paramZsv0, boolean paramBoolean1, boolean paramBoolean2) {
    return this.Zx.ZL(Ztzd.ZO().Zz(paramZr5h).ZT(paramZkq4).ZI(paramZb9a).Zj(paramZkg9).ZN(paramZnn).ZY(paramZgq5).ZU(this.Zn).Zx(paramZr5h.ZNs()).Ze(paramZto9).ZK(paramZskh).Zj(paramZtdi).ZI(paramZzs1).Za(paramZsv0).ZM(paramBoolean1).ZP(paramBoolean2));
  }
  
  public Zxn8 ZS(Zzep paramZzep, Zr69 paramZr69, Zkg9 paramZkg9, Zkq4 paramZkq4, Zb9a paramZb9a, Zlz4 paramZlz4, Zgq5 paramZgq5, Zto9 paramZto9, Ztos<Zt18> paramZtos, Zskh paramZskh, Ztdi paramZtdi, Znn paramZnn, Zzs1 paramZzs1, Zkf3 paramZkf3, Zsv0 paramZsv0, boolean paramBoolean) {
    Zezo zezo = this.Zb.ZO(paramZzep, paramZr69, paramZlz4, Zkcl.SCAN_CRAWL_AND_AUDIT, paramZto9, paramZtos, paramZskh, paramZtdi, paramZzs1, paramZkf3);
    Zriy zriy = this.Zx.ZL(Ztzd.ZO().Zz(paramZzep).ZT(paramZkq4).ZU(paramZzep.ZnH()).ZE(paramZr69).ZI(paramZb9a).ZN(paramZnn).ZU(paramZr69).Zj(paramZkg9).ZY(paramZgq5).Zx(Zkcl.SCAN_CRAWL_AND_AUDIT).Ze(paramZto9).ZK(paramZskh).Zj(paramZtdi).ZI(paramZzs1).Za(paramZsv0).ZM(paramBoolean));
    return this.Ze.Zn(paramZzep, zezo, zriy, paramZr69, paramZkq4, paramZb9a, paramZto9, paramZskh, paramZkf3);
  }
  
  public Zriy Zj(Ztr3 paramZtr3, Zb9a paramZb9a, Zkq4 paramZkq4, Zkg9 paramZkg9, Zgq5 paramZgq5, Zto9 paramZto9, Zskh paramZskh, Ztdi paramZtdi, Znn paramZnn, Zzs1 paramZzs1, Zsv0 paramZsv0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zx : Lburp/Ztmc;
    //   4: invokestatic ZO : ()Lburp/Ztzd;
    //   7: aload_1
    //   8: invokevirtual Zz : (Lburp/Zr5h;)Lburp/Ztzd;
    //   11: aload_3
    //   12: invokevirtual ZT : (Lburp/Zkq4;)Lburp/Ztzd;
    //   15: aload_2
    //   16: invokevirtual ZI : (Lburp/Zb9a;)Lburp/Ztzd;
    //   19: aload #4
    //   21: invokevirtual Zj : (Lburp/Zkg9;)Lburp/Ztzd;
    //   24: aload #9
    //   26: invokevirtual ZN : (Lburp/Znn;)Lburp/Ztzd;
    //   29: aload #5
    //   31: invokevirtual ZY : (Lburp/Zgq5;)Lburp/Ztzd;
    //   34: aload_0
    //   35: getfield Zn : Lburp/Zz28;
    //   38: invokevirtual ZU : (Lburp/Zz28;)Lburp/Ztzd;
    //   41: getstatic burp/Zkcl.LIVE_AUDIT : Lburp/Zkcl;
    //   44: invokevirtual Zx : (Lburp/Zkcl;)Lburp/Ztzd;
    //   47: aload #6
    //   49: invokevirtual Ze : (Lburp/Zto9;)Lburp/Ztzd;
    //   52: aload #7
    //   54: invokevirtual ZK : (Lburp/Zskh;)Lburp/Ztzd;
    //   57: aload #8
    //   59: invokevirtual Zj : (Lburp/Ztdi;)Lburp/Ztzd;
    //   62: aload #10
    //   64: invokevirtual ZI : (Lburp/Zzs1;)Lburp/Ztzd;
    //   67: aload #11
    //   69: invokevirtual Za : (Lburp/Zsv0;)Lburp/Ztzd;
    //   72: invokevirtual ZL : (Lburp/Ztzd;)Lburp/Zriy;
    //   75: astore #12
    //   77: new burp/Zg2o
    //   80: dup
    //   81: aload_2
    //   82: dup
    //   83: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: pop
    //   87: <illegal opcode> accept : (Lburp/Zb9a;)Ljava/util/function/Consumer;
    //   92: aload_3
    //   93: invokeinterface Zs6 : ()Z
    //   98: aload_0
    //   99: aload_1
    //   100: <illegal opcode> get : (Lburp/Zz5p;Lburp/Ztr3;)Ljava/util/function/Supplier;
    //   105: aload_1
    //   106: aload_0
    //   107: getfield ZJ : Lburp/Zsus;
    //   110: invokespecial <init> : (Ljava/util/function/Consumer;ZLjava/util/function/Supplier;Lburp/Ztr3;Lburp/Zsus;)V
    //   113: astore #13
    //   115: aload_0
    //   116: getfield Zt : Lburp/Zmsm;
    //   119: aload #13
    //   121: invokevirtual ZO : (Lburp/Zeih;)V
    //   124: new java/util/concurrent/atomic/AtomicReference
    //   127: dup
    //   128: invokespecial <init> : ()V
    //   131: astore #14
    //   133: aload #14
    //   135: aload #6
    //   137: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   140: aload_0
    //   141: aload #13
    //   143: aload #14
    //   145: <illegal opcode> accept : (Lburp/Zz5p;Lburp/Zg2o;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   150: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   153: invokevirtual set : (Ljava/lang/Object;)V
    //   156: aload #12
    //   158: areturn
  }
  
  public Zriy Zt(Ztr3 paramZtr3, Zb9a paramZb9a, Zkg9 paramZkg9, Zkq4 paramZkq4, Zgq5 paramZgq5, Zto9 paramZto9, Zskh paramZskh, Ztdi paramZtdi, Znn paramZnn, Zzs1 paramZzs1, Zsv0 paramZsv0) {
    int[] arrayOfInt = Zsyh.ZR();
    Zkcl zkcl = paramZtr3.ZNs();
    Zuh.Zb((zkcl == Zkcl.LEGACY_EXTENSION_PASSIVE_AUDIT || zkcl == Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT), Zqf.Zr);
    if (zkcl == Zkcl.LEGACY_EXTENSION_PASSIVE_AUDIT) {
      this.Zl.ZN(paramZb9a);
      if (arrayOfInt == null) {
        this.Zl.Zq(paramZb9a);
        return this.Zx.ZL(Ztzd.ZO().Zz(paramZtr3).ZT(paramZkq4).ZI(paramZb9a).Zj(paramZkg9).ZN(paramZnn).ZY(paramZgq5).ZU(this.Zn).Zx(Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT).Ze(paramZto9).ZK(paramZskh).Zj(paramZtdi).ZI(paramZzs1).Za(paramZsv0));
      } 
      return this.Zx.ZL(Ztzd.ZO().Zz(paramZtr3).ZT(paramZkq4).ZI(paramZb9a).Zj(paramZkg9).ZN(paramZnn).ZY(paramZgq5).ZU(this.Zn).Zx(Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT).Ze(paramZto9).ZK(paramZskh).Zj(paramZtdi).ZI(paramZzs1).Za(paramZsv0));
    } 
    this.Zl.Zq(paramZb9a);
    return this.Zx.ZL(Ztzd.ZO().Zz(paramZtr3).ZT(paramZkq4).ZI(paramZb9a).Zj(paramZkg9).ZN(paramZnn).ZY(paramZgq5).ZU(this.Zn).Zx(Zkcl.LEGACY_EXTENSION_ACTIVE_AUDIT).Ze(paramZto9).ZK(paramZskh).Zj(paramZtdi).ZI(paramZzs1).Za(paramZsv0));
  }
  
  public Zbur Zu(Ze9i paramZe9i, Ztos<Zt13> paramZtos) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zno : ()Lburp/Zs98;
    //   6: astore #4
    //   8: invokestatic ZR : ()[I
    //   11: new burp/Zrjo
    //   14: dup
    //   15: aload #4
    //   17: aload_0
    //   18: aload #4
    //   20: <illegal opcode> get : (Lburp/Zz5p;Lburp/Zs98;)Ljava/util/function/Supplier;
    //   25: invokespecial <init> : (Lburp/Zs98;Ljava/util/function/Supplier;)V
    //   28: astore #5
    //   30: astore_3
    //   31: new burp/Zsgs
    //   34: dup
    //   35: aload #4
    //   37: aload #5
    //   39: aload_0
    //   40: getfield ZC : Lburp/Zkl6;
    //   43: invokeinterface ZB : ()Lburp/Zbnt;
    //   48: aload_0
    //   49: getfield ZC : Lburp/Zkl6;
    //   52: invokeinterface ZH : ()Lburp/Zey9;
    //   57: invokespecial <init> : (Lburp/Zs98;Lburp/Zrjo;Lburp/Zbnt;Lburp/Zey9;)V
    //   60: astore #6
    //   62: new burp/Zega
    //   65: dup
    //   66: aload #6
    //   68: aload #4
    //   70: invokeinterface ZC6 : ()Lburp/Zzcq;
    //   75: aload #4
    //   77: invokeinterface ZCB : ()Lburp/Zzcq;
    //   82: aload_2
    //   83: invokespecial <init> : (Lburp/Zsgs;Lburp/Zzcq;Lburp/Zzcq;Lburp/Zz1m;)V
    //   86: astore #7
    //   88: aload_0
    //   89: getfield Zo : Ljava/util/function/Function;
    //   92: aload #4
    //   94: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   99: checkcast burp/Zrc1
    //   102: astore #8
    //   104: new burp/Zla_
    //   107: dup
    //   108: aload #8
    //   110: invokespecial <init> : (Lburp/Zrc1;)V
    //   113: astore #9
    //   115: new burp/Zey2
    //   118: dup
    //   119: new burp/Zxl2
    //   122: dup
    //   123: aload #8
    //   125: aload #4
    //   127: aload #5
    //   129: invokespecial <init> : (Lburp/Zrc1;Lburp/Zs98;Lburp/Zrjo;)V
    //   132: aload #7
    //   134: aload_0
    //   135: aload_1
    //   136: <illegal opcode> get : (Lburp/Zz5p;Lburp/Ze9i;)Ljava/util/function/Supplier;
    //   141: aload_1
    //   142: invokespecial <init> : (Lburp/Zxl2;Lburp/Zega;Ljava/util/function/Supplier;Lburp/Ze9i;)V
    //   145: astore #10
    //   147: aload_0
    //   148: getfield Zr : Lburp/Zze7;
    //   151: aload #10
    //   153: invokevirtual Zy : (Lburp/Zey2;)V
    //   156: new java/util/concurrent/atomic/AtomicReference
    //   159: dup
    //   160: invokespecial <init> : ()V
    //   163: astore #11
    //   165: aload #11
    //   167: aload_2
    //   168: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   171: aload_0
    //   172: aload #10
    //   174: aload #11
    //   176: <illegal opcode> accept : (Lburp/Zz5p;Lburp/Zey2;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   181: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   184: invokevirtual set : (Ljava/lang/Object;)V
    //   187: aload #9
    //   189: aload #7
    //   191: invokevirtual ZD : (Lburp/Zega;)Lburp/Zbur;
    //   194: aload_3
    //   195: ifnonnull -> 205
    //   198: iconst_3
    //   199: anewarray burp/Zbqc
    //   202: invokestatic Zr : ([Lburp/Zbqc;)V
    //   205: areturn
  }
  
  public static void Zc(Zz1i paramZz1i, Zkcl paramZkcl, Zs4c paramZs4c) {
    Zx_7 zx_7 = Zx_7.Zh(paramZz1i);
    zx_7.Zd(paramZs4c.ZD(new String[0]));
    if (paramZkcl == Zkcl.LEGACY_EXTENSION_PASSIVE_AUDIT) {
      zx_7.Zk().Zgn(true);
      zx_7.Zk().Zgu(true);
      zx_7.Zk().ZgR(false);
      zx_7.Zk().Zg_(false);
      zx_7.Zk().Zgx(false);
    } 
  }
  
  private void lambda$buildLivePassiveCrawlWorkGenerator$4(Zey2 paramZey2, AtomicReference<Zgrn> paramAtomicReference, Zxr8 paramZxr8) {
    this.Zr.Zh(paramZey2);
    ((Zgrn)paramAtomicReference.get()).ZZ();
  }
  
  private Zz28 lambda$buildLivePassiveCrawlWorkGenerator$3(Ze9i paramZe9i) {
    return this.ZW.Zr(paramZe9i);
  }
  
  private Zz28 lambda$buildLivePassiveCrawlWorkGenerator$2(Zs98 paramZs98) {
    return this.ZW.Zr(paramZs98);
  }
  
  private void lambda$buildLiveAuditWorkGenerator$1(Zg2o paramZg2o, AtomicReference<Zgrn> paramAtomicReference, Zxr8 paramZxr8) {
    this.Zt.ZM(paramZg2o);
    ((Zgrn)paramAtomicReference.get()).ZZ();
  }
  
  private Zz28 lambda$buildLiveAuditWorkGenerator$0(Ztr3 paramZtr3) {
    return this.ZW.Zr(paramZtr3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz5p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */