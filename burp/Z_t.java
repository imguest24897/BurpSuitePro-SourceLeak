package burp;

import java.util.Objects;
import java.util.Optional;

public class Z_t extends Zni implements Zkgn {
  @Zzvo(1)
  private Zefg<Zgxp> ZA;
  
  public Z_t(Zefg<Zgxp> paramZefg) {
    this.ZA = paramZefg;
  }
  
  public Zefg<Zgxp> ZvQ() {
    return this.ZA;
  }
  
  public void Zb(Zefg<Zgxp> paramZefg) {
    this.ZA = paramZefg;
  }
  
  public int Zv0() {
    return Zts7.Zn(this.ZA);
  }
  
  public Optional<Zgxp> Z_N(int paramInt) {
    return Zts7.Zk(paramInt, this.ZA);
  }
  
  public Zgxp ZvD() {
    return Zts7.Zf(this.ZA);
  }
  
  public Zeu4<? extends Zkgn> ZF() {
    return ZD;
  }
  
  public boolean equals(Object paramObject) {
    return Zts7.Zt(this, paramObject);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { ZvQ() });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */