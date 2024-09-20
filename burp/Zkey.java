package burp;

import java.util.function.BiFunction;

class Zkey extends Zket {
  private final Zkki Zh;
  
  private final BiFunction<Zsmh, Zgsq, Zsmh> ZV;
  
  public Zkey(Zkki paramZkki, BiFunction<Zsmh, Zgsq, Zsmh> paramBiFunction) {
    super(paramZkki);
    this.Zh = paramZkki;
    this.ZV = paramBiFunction;
  }
  
  public Zgsq Zd() {
    return this.Zh.Zjz();
  }
  
  public void ZG(Zgsq paramZgsq) {
    this.Zh.ZM(paramZgsq);
    Zk(this.ZV.apply(Za(), paramZgsq));
  }
  
  public Zsmh Za() {
    return this.Zh.ZjZ();
  }
  
  public boolean ZQ() {
    return this.Zh.ZB0();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkey.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */