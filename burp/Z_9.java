package burp;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class Z_9 extends Z_n implements Zz0c {
  @Zzvo(30)
  private Zk21 Zp;
  
  @Zzvo(31)
  private Zk21 ZM;
  
  @Zzvo(32)
  private Zk21 Zt;
  
  @Zzvo(34)
  private int Zz;
  
  @Zzvo(35)
  private int Zh;
  
  @Zzvo(36)
  private String Zy;
  
  private ChronoField ZH;
  
  protected Z_9(Zl83 paramZl83, Zr_4 paramZr_4) {
    super(paramZr_4, paramZl83);
  }
  
  @Zzvo(33)
  public String ZxO() {
    return this.ZH.toString();
  }
  
  public Zkq1 ZiB() {
    return new Zkyo(this.ZL, this);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    super.ZS(paramZs4f);
    Zs06.Zw(this, paramZs4f);
  }
  
  public String ZXt() {
    return this.Zy;
  }
  
  public void Zqb(String paramString) {
    this.Zy = paramString;
  }
  
  public int ZXe() {
    return this.Zh;
  }
  
  public void ZwA(int paramInt) {
    this.Zh = paramInt;
  }
  
  public ZonedDateTime ZXn() {
    return (this.Zp == null) ? null : Zs06.Zr(this.Zp);
  }
  
  public void Zq(ZonedDateTime paramZonedDateTime) {
    this.Zp = Zxk2.Zk(paramZonedDateTime.toInstant(), this.ZL);
  }
  
  public int ZXz() {
    return this.Zz;
  }
  
  public void Zwq(int paramInt) {
    this.Zz = paramInt;
  }
  
  public ZonedDateTime ZX6() {
    return (this.Zt == null) ? null : Zs06.Zr(this.Zt);
  }
  
  public void ZR(ZonedDateTime paramZonedDateTime) {
    this.Zt = Zxk2.Zk(paramZonedDateTime.toInstant(), this.ZL);
  }
  
  public ChronoField ZXL() {
    return this.ZH;
  }
  
  public void ZE(ChronoField paramChronoField) {
    this.ZH = paramChronoField;
  }
  
  public ZonedDateTime ZXf() {
    return (this.ZM == null) ? null : Zs06.Zr(this.ZM);
  }
  
  public void ZD(ZonedDateTime paramZonedDateTime) {
    this.ZM = Zxk2.Zk(paramZonedDateTime.toInstant(), this.ZL);
  }
  
  public void ZyK() {
    Zs06.ZX(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */