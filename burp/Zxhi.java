package burp;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class Zxhi extends Zxhw implements Zz0c {
  protected Zxhi(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zkq1 ZiB() {
    return new Zkyo(this.Za, this);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    super.ZS(paramZs4f);
    Zs06.Zw(this, paramZs4f);
  }
  
  public ZonedDateTime ZXn() {
    Zk21 zk21 = this.Za.<Zk21>ZJ(this, Zk0_.Zn);
    return (zk21 == null) ? null : Zs06.Zr(zk21);
  }
  
  public void Zq(ZonedDateTime paramZonedDateTime) {
    this.Za.Zq(this, Zk0_.Zn, Zxk2.Zk(paramZonedDateTime.toInstant(), this.Za));
  }
  
  public ZonedDateTime ZXf() {
    Zk21 zk21 = this.Za.<Zk21>ZJ(this, Zk0_.ZR);
    return (zk21 == null) ? null : Zs06.Zr(zk21);
  }
  
  public void ZD(ZonedDateTime paramZonedDateTime) {
    this.Za.Zq(this, Zk0_.ZR, Zxk2.Zk(paramZonedDateTime.toInstant(), this.Za));
  }
  
  public ChronoField ZXL() {
    return Zs06.ZX(this.Za.Zf(this, Zk0_.Ze));
  }
  
  public void ZE(ChronoField paramChronoField) {
    this.Za.Zi(this, Zk0_.Ze, paramChronoField.toString());
  }
  
  public int ZXz() {
    return this.Za.Zx(this, Zk0_.ZO);
  }
  
  public void Zwq(int paramInt) {
    this.Za.ZM(this, Zk0_.ZO, paramInt);
  }
  
  public ZonedDateTime ZX6() {
    Zk21 zk21 = this.Za.<Zk21>ZJ(this, Zk0_.Zq);
    return (zk21 == null) ? null : Zs06.Zr(zk21);
  }
  
  public void ZR(ZonedDateTime paramZonedDateTime) {
    this.Za.Zq(this, Zk0_.Zq, Zxk2.Zk(paramZonedDateTime.toInstant(), this.Za));
  }
  
  public int ZXe() {
    return this.Za.Zx(this, Zk0_.ZI);
  }
  
  public void ZwA(int paramInt) {
    this.Za.ZM(this, Zk0_.ZI, paramInt);
  }
  
  public String ZXt() {
    return this.Za.Zf(this, Zk0_.ZD);
  }
  
  public void Zqb(String paramString) {
    this.Za.Zi(this, Zk0_.ZD, paramString);
  }
  
  public void ZyK() {
    Zs06.ZX(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxhi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */