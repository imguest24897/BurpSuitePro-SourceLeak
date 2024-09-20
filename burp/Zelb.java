package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import net.portswigger.Zs4;

public class Zelb extends Zeli<Zrcg, Zz86> {
  private final Zlba Zu;
  
  private final Zmz6 ZH;
  
  private final Zkc ZU;
  
  private final Zbza Zn;
  
  private final Zkq4 Zc;
  
  private final Zkm8 ZQ;
  
  private final Zbnt ZR;
  
  private final Zs4 Zm;
  
  private final Zskh ZK;
  
  private final Ztks Zf;
  
  private final Zzs1 ZO;
  
  private final Zr46 Zt;
  
  private final Zz1i ZE;
  
  private final int Zr;
  
  private final Zsoh Zd;
  
  private final Zz28 Zj;
  
  private final Zlli<Zt13> Zq;
  
  public Zelb(Zlba paramZlba, Zmz6 paramZmz6, Zm8t paramZm8t, Zkc paramZkc, Zbza paramZbza, Zkq4 paramZkq4, Zkm8 paramZkm8, Zbnt paramZbnt, Zrgd paramZrgd, Zs4 paramZs4, Zskh paramZskh, Ztks paramZtks, Zzs1 paramZzs1, Zr_4 paramZr_4, Ze4e paramZe4e, Zr46 paramZr46, Zz1i paramZz1i, int paramInt, Zsoh paramZsoh, Zz28 paramZz28, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    super(paramZm8t, Zz86.S1, paramZbza, paramZz1i, paramZr_4, paramZbnt, paramZrgd, paramZe4e, paramZsoh, paramZlli, paramZtos);
    this.Zu = paramZlba;
    this.ZH = paramZmz6;
    this.ZQ = paramZkm8;
    this.ZR = paramZbnt;
    this.Zm = paramZs4;
    this.ZK = paramZskh;
    this.ZU = paramZkc;
    this.Zn = paramZbza;
    this.Zc = paramZkq4;
    this.Zf = paramZtks;
    this.ZO = paramZzs1;
    this.Zt = paramZr46;
    this.ZE = paramZz1i;
    this.Zr = paramInt;
    this.Zd = paramZsoh;
    this.Zj = paramZz28;
    this.Zq = paramZlli;
  }
  
  protected boolean ZR() {
    return this.Zc.Zs3();
  }
  
  protected Iterable<Zrcg> Zi() {
    return (this.Zc.ZEc() && this.Zc.Zsi()) ? Zq() : Collections.emptySet();
  }
  
  private Iterable<Zrcg> Zq() {
    // Byte code:
    //   0: new burp/Zz_q
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: new burp/Zb9t
    //   11: dup
    //   12: aload_0
    //   13: <illegal opcode> accept : (Lburp/Zelb;)Ljava/util/function/Consumer;
    //   18: invokespecial <init> : (Ljava/util/function/Consumer;)V
    //   21: astore_2
    //   22: new burp/Zsy6
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore_3
    //   30: new burp/Zg56
    //   33: dup
    //   34: aload_0
    //   35: getfield Zp : Lburp/Ze4e;
    //   38: invokespecial <init> : (Ljava/util/function/BiConsumer;)V
    //   41: astore #4
    //   43: aload_0
    //   44: aload_2
    //   45: aload_1
    //   46: aload #4
    //   48: aload_3
    //   49: <illegal opcode> iterator : (Lburp/Zelb;Lburp/Zb9t;Lburp/Zz_q;Lburp/Zg56;Lburp/Zsy6;)Ljava/lang/Iterable;
    //   54: areturn
  }
  
  private Iterator lambda$staticAnalysisOnePhases$2(Zb9t paramZb9t, Zz_q paramZz_q, Zg56 paramZg56, Zsy6 paramZsy6) {
    return new Zrf3<>(Zz86.S1, this.Zn, Arrays.<Zlm2>asList((Zlm2[])new Zrcg[] { new Ztm9(Zz86.S1, this.ZE, this.Zn, Zelb::lambda$staticAnalysisOnePhases$1), Zb9t.Ze(paramZb9t, this.ZU, this.Zn), new Zxkk(paramZz_q, this.ZR, paramZb9t), Zbos.ZR(new Ztto(this.Zc, this.ZQ, this.Zn, this.ZE, this.ZM, paramZg56, paramZz_q)), new Zt6g(this.Zc, this.Zn, paramZb9t, this.ZH, this.Zu, paramZz_q, this.ZD, this.ZK, paramZsy6, this.ZC), Zbos.ZR(new Zsiy(this.ZD, this.Zc, this.Zn, paramZb9t, this.ZH, this.Zu, paramZsy6, this.Zf, this.ZO, this.ZK, new Zb1c(this.Zm), paramZz_q, paramZg56, this.ZE, this.Zr, this.Zd, this.Zj, this.Zq)), new Zso2(Zz86.S1, this.Zn, this.Zt), new Zt41(Collections.singleton(paramZg56.Zv())) }).iterator());
  }
  
  private static void lambda$staticAnalysisOnePhases$1(Zb09 paramZb09) {}
  
  private static void lambda$staticAnalysisOnePhases$0(Zelb paramZelb, Ze3n paramZe3n) {
    paramZelb.ZG(paramZe3n);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zelb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */