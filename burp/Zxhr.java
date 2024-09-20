package burp;

import java.util.Objects;
import java.util.Optional;

public class Zxhr extends Zxsr implements Zkgn {
  public Zxhr(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zefg<Zgxp> ZvQ() {
    return (Zefg<Zgxp>)this.Za.ZJ(this, Zk0m.Za);
  }
  
  public void Zb(Zefg<Zgxp> paramZefg) {
    this.Za.Zq(this, Zk0m.Za, paramZefg);
  }
  
  public int Zv0() {
    return Zts7.Zn(ZvQ());
  }
  
  public Optional<Zgxp> Z_N(int paramInt) {
    return Zts7.Zk(paramInt, ZvQ());
  }
  
  public Zgxp ZvD() {
    return Zts7.Zf(ZvQ());
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxhr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */