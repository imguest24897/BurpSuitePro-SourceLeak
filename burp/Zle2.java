package burp;

import java.util.Collections;
import java.util.Set;
import net.portswigger.Zsy;

public class Zle2 implements Zrbc {
  private final Zmz6 ZA;
  
  private final Zlba ZE;
  
  private final Zr_4 ZK;
  
  private final Zkq4 Zf;
  
  private final Zbza Z_;
  
  private final Zkvg ZD;
  
  private final Zsy Zw;
  
  private final Zsoh Zp;
  
  private final Zkl6 ZS;
  
  private final Zbjl Zo;
  
  private final Zesv Zs;
  
  private final Ze4e ZL;
  
  private final Zz1i Ze;
  
  Zle2(Zmz6 paramZmz6, Zkvg paramZkvg, Zlba paramZlba, Zr_4 paramZr_4, Zkq4 paramZkq4, Zbza paramZbza, Zz1i paramZz1i, Zsy paramZsy, Zsoh paramZsoh, Zkl6 paramZkl6, Zbjl paramZbjl, Zesv paramZesv, Ze4e paramZe4e) {
    this.Zw = paramZsy;
    this.Zp = paramZsoh;
    this.ZS = paramZkl6;
    this.Zo = paramZbjl;
    this.ZA = paramZmz6;
    this.ZD = paramZkvg;
    this.ZE = paramZlba;
    this.ZK = paramZr_4;
    this.Zf = paramZkq4;
    this.Z_ = paramZbza;
    this.Ze = paramZz1i;
    this.Zs = paramZesv;
    this.ZL = paramZe4e;
  }
  
  public Set<? extends Zz09> Zs() {
    if (this.Zf.Zse() && this.Zo.ZG()) {
      Zg75 zg75 = this.ZD.ZR();
      Ze3n ze3n = zg75.ZO();
      return Collections.singleton(new Zttc(new Zzsc(this.Zf, this.Zw, this.Zp, this.ZS, ze3n, this.Zo, this.ZK, this.Zs, zg75, this.Ze), this.ZA, this.ZE, this.Z_, this.Ze, Zt0r.A1, this.ZL));
    } 
    return Collections.emptySet();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zle2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */