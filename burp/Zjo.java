package burp;

import java.util.List;

public class Zjo extends Zhg implements Zbio {
  @Zzvo(18)
  private final Zefg<Zz_b> Zv;
  
  @Zzvo(14)
  private final String ZE;
  
  @Zzvo(15)
  private final Zlit ZY;
  
  @Zzvo(16)
  private final Zefg<Zsdr> ZF;
  
  @Zzvo(17)
  private final String ZG;
  
  private final Zz3o ZR;
  
  Zjo(Zeu9 paramZeu9, Zzwo<Zszw, Zx0c> paramZzwo, Zz3o paramZz3o, String paramString1, Zlit paramZlit, Zefg<Zsdr> paramZefg, String paramString2, Zefg<Zz_b> paramZefg1) {
    super(paramZeu9, paramZzwo);
    this.ZR = paramZz3o;
    this.Zv = paramZefg1;
    this.ZE = paramString1;
    this.ZY = paramZlit;
    this.ZF = paramZefg;
    this.ZG = paramString2;
  }
  
  public String ZxI() {
    return this.ZE;
  }
  
  public Zlit Zxa() {
    return this.ZY;
  }
  
  public List<Zsdr> Zxm() {
    return this.ZF;
  }
  
  public String ZxL() {
    return this.ZG;
  }
  
  public List<Ze7n> ZxP() {
    return this.Zv.stream().map(Zz_b::ZZg).toList();
  }
  
  public Zz3o Zt() {
    return this.ZR;
  }
  
  @Zzvo(11)
  private int ZS7() {
    return this.ZR.permanentIndex;
  }
  
  public String toString() {
    return Zrhl.ZZ(this, ZxI(), Zxa().toString());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zjo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */