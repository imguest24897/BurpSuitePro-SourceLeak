package burp;

import java.io.IOException;

public class Z_0 extends Z_n implements Zgbk {
  @Zzvo(30)
  private Zstu ZR;
  
  @Zzvo(31)
  private byte ZY;
  
  @Zzvo(32)
  private byte Zk;
  
  @Zzvo(33)
  private Zmyi Zf;
  
  public Z_0(Zl83 paramZl83, Zstu paramZstu, byte paramByte1, byte paramByte2, Zmyi paramZmyi, Zr_4 paramZr_4) {
    super(paramZr_4, paramZl83);
    this.ZR = paramZstu;
    this.ZY = paramByte1;
    this.Zk = paramByte2;
    this.Zf = paramZmyi;
  }
  
  public Zstu Zls() {
    return this.ZR;
  }
  
  public void Zl(Zstu paramZstu) {
    this.ZR = paramZstu;
  }
  
  public byte ZlG() {
    return this.ZY;
  }
  
  public void ZP(byte paramByte) {
    this.ZY = paramByte;
  }
  
  public byte Zl9() {
    return this.Zk;
  }
  
  public void ZC(byte paramByte) {
    this.Zk = paramByte;
  }
  
  public Zmyi Zld() {
    return this.Zf;
  }
  
  public void ZQ(Zmyi paramZmyi) {
    this.Zf = paramZmyi;
  }
  
  public Zkq1 ZiB() {
    return new Zktk(this.ZL, this);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    super.ZS(paramZs4f);
    Zbu8.Zg(this, paramZs4f);
  }
  
  public void ZyK() {
    Zbu8.Zr(this);
  }
  
  public void Zy4() {
    Zbu8.ZQ(this, this.ZL);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */