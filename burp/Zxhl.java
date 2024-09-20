package burp;

import java.util.Objects;

public class Zxhl extends Zxsr implements Zm8f {
  protected Zxhl(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public byte[] ZoI() {
    Zstu zstu = this.Za.<Zstu>ZA(this, Zk_r.ZQ);
    return Objects.isNull(zstu) ? null : zstu.ZiD();
  }
  
  public byte[] Zo5() {
    Zstu zstu = this.Za.<Zstu>ZA(this, Zk_r.ZR);
    return Objects.isNull(zstu) ? null : zstu.ZiD();
  }
  
  public byte[] Zom() {
    Zstu zstu = this.Za.<Zstu>ZA(this, Zk_r.ZN);
    return Objects.isNull(zstu) ? null : zstu.ZiD();
  }
  
  public void Zov() {
    this.Za.ZQ(this, Zk_r.ZQ, null);
    this.Za.ZQ(this, Zk_r.ZR, null);
  }
  
  public boolean ZoJ() {
    return (Zom() == null && ZoI() == null && Zo5() == null);
  }
  
  public void Zi(byte[] paramArrayOfbyte) {
    this.Za.ZQ(this, Zk_r.ZQ, Ze6a.ZW(paramArrayOfbyte, this.Za));
  }
  
  public void ZA(byte[] paramArrayOfbyte) {
    this.Za.ZQ(this, Zk_r.ZR, Ze6a.ZW(paramArrayOfbyte, this.Za));
  }
  
  public Zeu4<? extends Zm8f> ZF() {
    return ZZ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxhl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */