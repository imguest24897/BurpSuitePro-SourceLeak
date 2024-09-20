package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Zelm extends Zeli<Zrcg, Zz86> implements Zrcg {
  private final Zbza ZH;
  
  private final Zk5u ZV;
  
  private final Zz4i Zz;
  
  private final Ztai Zq;
  
  private final Zr46 ZW;
  
  public Zelm(Zbza paramZbza, Zz1i paramZz1i, Zm8t paramZm8t, Zk5u paramZk5u, Zz4i paramZz4i, Zr_4 paramZr_4, Zbnt paramZbnt, Zrgd paramZrgd, Ze4e paramZe4e, Zr46 paramZr46, Ztai paramZtai, Zsoh paramZsoh, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    super(paramZm8t, Zz86.P2, paramZbza, paramZz1i, paramZr_4, paramZbnt, paramZrgd, paramZe4e, paramZsoh, paramZlli, paramZtos);
    this.ZH = paramZbza;
    this.ZV = paramZk5u;
    int[] arrayOfInt = Zz4i.ZC();
    this.Zz = paramZz4i;
    this.ZW = paramZr46;
    this.Zq = paramZtai;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  protected boolean ZR() {
    return this.Zq.Zs3();
  }
  
  protected List<Zrcg> Zx() {
    return this.Zq.Zs3() ? Arrays.<Zrcg>asList(new Zrcg[] { this, new Zso2(Zz86.P2, this.ZH, this.ZW) }) : Collections.<Zrcg>emptyList();
  }
  
  public Set<? extends Zmgr> Zc() {
    return Collections.singleton(this::lambda$getPassiveWorkItems$0);
  }
  
  private void lambda$getPassiveWorkItems$0(Zrj paramZrj, Zlsy paramZlsy) {
    this.ZV.ZZ(this.ZH.Zgc(), this.Zz);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zelm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */