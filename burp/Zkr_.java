package burp;

import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkr_ extends Zkro {
  private final Zr1m Zi;
  
  private final Zlaa ZG;
  
  private final Zr34 ZP;
  
  private Zm5v Zd;
  
  private Zbx9 Zp;
  
  public Zkr_(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_4, Zr1m paramZr1m, Zlaa paramZlaa, Zlcb paramZlcb, Zr34 paramZr34, Zm6x paramZm6x) {
    super(paramZz0n, paramZt4u, paramZerg, paramZgbj, paramZgb6, paramZxgc, paramZskh, paramZgzy, paramZkl6, Zeew.SEQUENCER, paramZtwv, paramZr_4, paramZlcb, paramZm6x);
    this.Zi = paramZr1m;
    this.ZG = paramZlaa;
    this.ZP = paramZr34;
  }
  
  public void ZYE() {}
  
  public Ztql ZYS() {
    return new Zxp3(this, this.ZQ, this.Zl, this.Zf);
  }
  
  public void ZYq() {
    Zs0f zs0f = this.ZJ.ZN().ZvB().Zm9();
    this.Zd = new Zm5v(this.Zo, this.ZJ, this, this.ZF, this.ZQ, new Zxa_(zs0f), this.Zl, this.Zz, this.Zi, this.Zf, this.ZP);
    this.Z_ = this.Zd.ZZ();
    this.Zp = new Zbx9(this.ZG.Zk(Zeew.SEQUENCER, this.ZW, this.Zw.ZW(Zeew.SEQUENCER)), this.ZW, this.ZF);
  }
  
  public void ZYO() {
    if (this.Zd == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    this.Zd.Zt2();
  }
  
  public Optional<Zz4n> ZYK() {
    return Optional.of(new Zz4n(Zeew.SEQUENCER.toolName, Zs70.SEQUENCER_PATH));
  }
  
  public Zbx9 ZA() {
    return this.Zp;
  }
  
  void ZX(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2) {
    this.Zd.ZK(paramZmzk, paramZstu1, paramZstu2);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    if (this.Zd == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    this.Zd.Zd(paramZmf_);
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.Zd.Zl(paramZg4j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkr_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */