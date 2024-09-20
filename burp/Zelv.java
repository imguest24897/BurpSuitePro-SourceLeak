package burp;

import java.util.Collections;

public class Zelv extends Zeli<Zrcg, Zz86> {
  private final Zbza Zb;
  
  private final Zlba Zc;
  
  private final Zmz6 ZI;
  
  private final Zgb6 ZQ;
  
  private final Ztai ZG;
  
  private final Zr_4 Zu;
  
  private final Zg0g Zl;
  
  private final Zssh ZF;
  
  private final Zz1h Zm;
  
  private final Zkc ZW;
  
  private final Zz1i ZU;
  
  private final Zgbu Zd;
  
  private final Zbjl ZE;
  
  private final Znn Zh;
  
  private final Zr46 ZP;
  
  public Zelv(Zbza paramZbza, Ze4e paramZe4e, Zr46 paramZr46, Zlba paramZlba, Zmz6 paramZmz6, Zgb6 paramZgb6, Ztai paramZtai, Zr_4 paramZr_41, Zr_4 paramZr_42, Zm8t paramZm8t, Zg0g paramZg0g, Zbnt paramZbnt, Zssh paramZssh, Zz1h paramZz1h, Zkc paramZkc, Zz1i paramZz1i, Zgbu paramZgbu, Zrgd paramZrgd, Zbjl paramZbjl, Znn paramZnn, Zsoh paramZsoh, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    super(paramZm8t, Zz86.P1, paramZbza, paramZz1i, paramZr_41, paramZbnt, paramZrgd, paramZe4e, paramZsoh, paramZlli, paramZtos);
    this.Zb = paramZbza;
    this.ZP = paramZr46;
    this.Zc = paramZlba;
    this.ZI = paramZmz6;
    String str = Zssh.ZV();
    this.ZQ = paramZgb6;
    this.ZG = paramZtai;
    this.Zu = paramZr_42;
    this.Zl = paramZg0g;
    this.ZF = paramZssh;
    this.Zm = paramZz1h;
    this.ZW = paramZkc;
    this.ZU = paramZz1i;
    this.Zd = paramZgbu;
    this.ZE = paramZbjl;
    this.Zh = paramZnn;
    if (Zbqc.Zwu() == null)
      Zssh.Zn("NGVTT"); 
  }
  
  protected boolean ZR() {
    return this.ZG.Zs3();
  }
  
  protected Iterable<Zrcg> Zi() {
    Zt41 zt41 = new Zt41(Collections.singleton(new Zrz1(this.Zd, this.ZE)));
    boolean bool = this.ZG.Zs3();
    return bool ? Zb99.<Zrcg>Zh(new Zrcg[] { zt41, new Ztm9(Zz86.P1, this.ZU, this.Zb, Zelv::lambda$buildPhases$0), new Zb_5(this.Zl, this.ZI, this.ZQ, this.ZG, this.ZW, this.Zc, this.Zu, this.ZF, this.Zm, this.ZU, this.Zb, this.Zh, this::lambda$buildPhases$1, this.ZC), new Zso2(Zz86.P1, this.Zb, this.ZP) }) : Collections.<Zrcg>singletonList(zt41);
  }
  
  private static void lambda$buildPhases$1(Zelv paramZelv, Ze3n paramZe3n) {
    paramZelv.ZG(paramZe3n);
  }
  
  private static void lambda$buildPhases$0(Zb09 paramZb09) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zelv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */