package burp;

import java.util.Collection;
import java.util.function.Function;

public class Zji extends Zj3 implements Zzbs {
  @Zzvo(31)
  protected final Zkmk ZH;
  
  @Zzvo(33)
  private final long Zf;
  
  protected Zji(Zski paramZski, Zbj5 paramZbj5, Zkmk paramZkmk, Function<Zeu9, Zttl> paramFunction, long paramLong) {
    super(paramZski, paramZbj5, paramFunction);
    this.Zf = paramLong;
    this.ZH = paramZkmk;
  }
  
  public long ZSE() {
    return this.Zf;
  }
  
  public void ZR(Zsiv paramZsiv, Ztk0 paramZtk0, Zr69 paramZr69, Zz1m<Zt35> paramZz1m) {
    Zg1b.Zr(paramZsiv, paramZtk0, ZHV(), paramZz1m, paramZr69);
  }
  
  public void Zk(Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Ztk0 paramZtk0, Zt1i paramZt1i, Zz1m<Zt35> paramZz1m, Zr69 paramZr69) {
    Zg1b.Zt(paramZrp0, paramZszw, paramZlru, this, this.ZH, paramZtk0, paramZt1i, paramZz1m, paramZr69);
  }
  
  public Collection<Zrp0> ZSA() {
    return this.ZH.ZEN();
  }
  
  public Zeu4<? extends Zeu9> ZF() {
    return (Zeu4)Zzbs.ZT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zji.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */