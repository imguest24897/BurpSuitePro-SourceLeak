package burp;

import java.io.IOException;

class Zx70 extends Zxsr implements Zmo2 {
  Zx70(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public String ZE(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    return Zlcq.Ze(paramArrayOfbyte, paramZs68, Zu7(), ZuY());
  }
  
  public String ZuR() {
    return this.Za.ZJ(this, Zk4j.ZL);
  }
  
  public void ZoJ(String paramString) {
    this.Za.Zn(this, Zk4j.ZL, paramString);
  }
  
  public String Zun() {
    return this.Za.ZJ(this, Zk4j.ZM);
  }
  
  public void Zos(String paramString) {
    this.Za.Zn(this, Zk4j.ZM, paramString);
  }
  
  public String Zu0() {
    return this.Za.ZJ(this, Zk4j.Zc);
  }
  
  public void ZoL(String paramString) {
    this.Za.Zn(this, Zk4j.Zc, paramString);
  }
  
  public Zkk3 Zu7() {
    return new Zkk3(this.Za.<Zg05>ZJ(this, Zk4j.Zk), this.Za);
  }
  
  public void Zb(Zkk3 paramZkk3) {
    this.Za.Zq(this, Zk4j.Zk, paramZkk3.Z_());
  }
  
  public boolean ZuY() {
    return this.Za.Zi(this, Zk4j.ZP);
  }
  
  public void Znt(boolean paramBoolean) {
    this.Za.ZH(this, Zk4j.ZP, paramBoolean);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    Zl1i.Zg(this, paramZs4f);
  }
  
  public Zlwx ZuW() {
    return Zlcq.Zu(this);
  }
  
  public Zeu4<Zmo2> ZF() {
    return ZL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx70.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */