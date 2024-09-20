package burp;

import java.io.IOException;

public class Zaw extends Zni implements Zmfi {
  @Zzvo(0)
  private Zt8g ZH;
  
  @Zzvo(1)
  private byte ZV;
  
  @Zzvo(2)
  private String ZG;
  
  @Zzvo(3)
  private int Zz;
  
  Zaw(Zt8g paramZt8g, byte paramByte, String paramString, int paramInt) {
    this.ZH = paramZt8g;
    this.ZV = paramByte;
    this.ZG = paramString;
    this.Zz = paramInt;
  }
  
  public Zt8g Zla() {
    return this.ZH;
  }
  
  public byte ZlJ() {
    return this.ZV;
  }
  
  public void ZR(byte paramByte) {
    this.ZV = paramByte;
  }
  
  public String ZlX() {
    return this.ZG;
  }
  
  public void ZVe(String paramString) {
    this.ZG = paramString;
  }
  
  public int ZlN() {
    return this.Zz;
  }
  
  public void Zur(int paramInt) {
    this.Zz = paramInt;
  }
  
  public void Zw(int paramInt1, int paramInt2) {
    Zb15.ZR(this, paramInt1, paramInt2);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    Ze3.ZU(paramZs4f, this);
  }
  
  public Zeu4<Zmfi> ZF() {
    return ZC;
  }
  
  public Zlwx ZlS() {
    return Zb15.ZQ(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zaw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */