package burp;

import java.util.List;

public class Zsab implements Zte_ {
  private final Zxkh<Zs9w> ZH;
  
  private final Ze3n Zn;
  
  private final Zm_g ZJ;
  
  private final Zlba Zf;
  
  private final Zepf ZE;
  
  private final Zl_e Zs;
  
  private final Zz1m<Zt1o> Ze;
  
  private final Zbfi ZO;
  
  private final Zxtw Zi;
  
  Zsab(Zxkh<Zs9w> paramZxkh, Zbfi paramZbfi, Ze3n paramZe3n, Zm_g paramZm_g, Zlba paramZlba, Zepf paramZepf, Zl_e paramZl_e, Zz1m<Zt1o> paramZz1m) {
    this.ZH = paramZxkh;
    this.ZO = paramZbfi;
    this.Zn = paramZe3n;
    this.ZJ = paramZm_g;
    this.Zf = paramZlba;
    this.ZE = paramZepf;
    this.Zs = paramZl_e;
    this.Ze = paramZz1m;
    this.Zi = new Zxtw();
  }
  
  public void Zi(Zz4_ paramZz4_, List<Zrd9> paramList) {
    // Byte code:
    //   0: new burp/Zs8m
    //   3: dup
    //   4: aload_0
    //   5: getfield ZO : Lburp/Zbfi;
    //   8: aload_0
    //   9: <illegal opcode> test : (Lburp/Zsab;)Ljava/util/function/Predicate;
    //   14: aload_1
    //   15: aload_0
    //   16: aload_1
    //   17: <illegal opcode> accept : (Lburp/Zsab;Lburp/Zz4_;)Ljava/util/function/Consumer;
    //   22: aload_0
    //   23: getfield ZE : Lburp/Zepf;
    //   26: dup
    //   27: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   30: pop
    //   31: <illegal opcode> accept : (Lburp/Zepf;)Ljava/util/function/Consumer;
    //   36: aload_0
    //   37: getfield Zs : Lburp/Zl_e;
    //   40: aload_0
    //   41: getfield Zi : Lburp/Zxtw;
    //   44: invokespecial <init> : (Lburp/Zbfi;Ljava/util/function/Predicate;Lburp/Zm_p;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Lburp/Zl_e;Lburp/Zbzl;)V
    //   47: astore_3
    //   48: aload_3
    //   49: aload_2
    //   50: invokevirtual Zw : (Ljava/util/List;)V
    //   53: return
  }
  
  private void lambda$runTasks$1(Zz4_ paramZz4_, Zrd9 paramZrd9) {
    Zs9w zs9w = this.ZH.ZI(paramZrd9);
    this.ZJ.ZB();
    zs9w.Zs(paramZz4_);
    Zzl5.Zp(this.Ze, this.Zn.Zm(), paramZrd9);
  }
  
  private boolean lambda$runTasks$0(Zrd9 paramZrd9) {
    return (this.ZE.ZJ(paramZrd9) && this.Zf.Zw(this.Zn.ZM()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsab.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */