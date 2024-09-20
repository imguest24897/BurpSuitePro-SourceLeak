package burp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;

public class Zel9 extends Zeli<Zrbc, Zt0r> {
  private final Zbza ZX;
  
  private final Zlba Zz;
  
  private final Zmz6 Zn;
  
  private final Ztai Zy;
  
  private final Zbnt Zd;
  
  private final Zbjl Zw;
  
  private final Zrjd Za;
  
  private final Zesv Zh;
  
  private final Ze4e Zb;
  
  private final Zr46 ZE;
  
  private final Zkq4 Zt;
  
  private final Zz1i ZR;
  
  public Zel9(Zbza paramZbza, Zlba paramZlba, Zmz6 paramZmz6, Zm8t paramZm8t, Ztai paramZtai, Zbnt paramZbnt, Zbjl paramZbjl, Zrjd paramZrjd, Zesv paramZesv, Ze4e paramZe4e, Zr46 paramZr46, Zkq4 paramZkq4, Zr_4 paramZr_4, Zrgd paramZrgd, Zz1i paramZz1i, Zsoh paramZsoh, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    super(paramZm8t, Zt0r.A5, paramZbza, paramZz1i, paramZr_4, paramZbnt, paramZrgd, paramZe4e, paramZsoh, paramZlli, paramZtos);
    this.ZX = paramZbza;
    this.Zz = paramZlba;
    this.Zn = paramZmz6;
    this.Zy = paramZtai;
    this.Zd = paramZbnt;
    this.Zw = paramZbjl;
    this.Za = paramZrjd;
    this.Zh = paramZesv;
    this.Zb = paramZe4e;
    boolean bool = Zmg6.Zc();
    this.ZE = paramZr46;
    this.Zt = paramZkq4;
    this.ZR = paramZz1i;
    if (Zbqc.Zwu() == null)
      Zmg6.ZW(!bool); 
  }
  
  protected boolean ZR() {
    return (this.Zw.ZG() && (this.Zy.ZS(Zzu2.XSS_STORED, Zr3z.COLLABORATOR_BASED) || this.Zy.Zr(Zzu2.INPUT_RETRIEVAL_REFLECTED)));
  }
  
  protected Iterable<Zrbc> Zi() {
    boolean bool = (this.Zw.ZG() && (this.Zy.ZS(Zzu2.XSS_STORED, Zr3z.COLLABORATOR_BASED) || this.Zy.Zr(Zzu2.INPUT_RETRIEVAL_REFLECTED))) ? true : false;
    Set<?> set = Collections.synchronizedSet(new HashSet());
    Objects.requireNonNull(set);
    return bool ? Arrays.<Zrbc>asList(new Zrbc[] { new Ztmi(Zt0r.A5, this.ZR, this.ZX, set::add), new Zz31(Zt0r.A5, this.Zn, this.Zt, this.ZR, this.Zz, this.ZX, this.Zb, this::lambda$buildPhases$1, this::lambda$buildPhases$2, Zel9::lambda$buildPhases$3, set::lambda$buildPhases$4), new Zso2(Zt0r.A5, this.ZX, this.ZE) }) : Collections.<Zrbc>emptyList();
  }
  
  private static Collection lambda$buildPhases$4(Collection paramCollection) {
    return paramCollection;
  }
  
  private static void lambda$buildPhases$3(Zrj paramZrj, Ze3n paramZe3n, Zz4_ paramZz4_) {}
  
  private Ze3n lambda$buildPhases$2(Ztpx paramZtpx) {
    Ze3n ze3n = this.Za.Zc(this.ZX, paramZtpx);
    ZG(ze3n);
    return ze3n;
  }
  
  private Ze5i lambda$buildPhases$1(Zrj paramZrj, Ztpx paramZtpx, Ze3n paramZe3n, Zz1i paramZz1i, Zxs7 paramZxs7, BiConsumer paramBiConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: aload #5
    //   3: aload_1
    //   4: aload_3
    //   5: <illegal opcode> Zk : (Lburp/Zel9;Lburp/Zxs7;Lburp/Zrj;Lburp/Ze3n;)Lburp/Ze5i;
    //   10: areturn
  }
  
  private void lambda$buildPhases$0(Zxs7 paramZxs7, Zrj paramZrj, Ze3n paramZe3n, Zz4_ paramZz4_) {
    boolean bool = Zmg6.Zs();
    if (this.Zy.ZS(Zzu2.XSS_STORED, Zr3z.COLLABORATOR_BASED) || !this.ZX.ZM(paramZxs7.Zl())) {
      Ztm4 ztm4 = Zkgq.Zp(paramZrj.Zg(), paramZe3n.ZM().Zgv(), this.Zw, paramZxs7, null, this.Zy);
      Zszi zszi = this.Zh.Za(paramZe3n, paramZxs7);
      for (Zew4 zew4 : ztm4.ZK()) {
        zew4.Ze(paramZxs7, zszi, paramZz4_, paramZe3n, this.Zd);
        if (!bool)
          break; 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zel9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */