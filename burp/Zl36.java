package burp;

import net.portswigger.Zo;
import net.portswigger.Zrz_;

public class Zl36 {
  protected final Zrz_ ZX;
  
  private final Zt83 ZB;
  
  public Zl36(boolean paramBoolean1, Zo paramZo, byte paramByte, boolean paramBoolean2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this(new Zrz_(paramBoolean1, paramZo, paramByte, paramBoolean2, paramArrayOfbyte1, paramArrayOfbyte2), Zt83.ZS);
  }
  
  public Zl36(Zrz_ paramZrz_, Zt83 paramZt83) {
    this.ZX = paramZrz_;
    this.ZB = paramZt83;
  }
  
  public byte ZX() {
    return this.ZX.ZD();
  }
  
  public byte[] ZH() {
    return this.ZX.ZK();
  }
  
  public Zsg3 ZY() {
    return Zsg3.ZY(this.ZX.ZD());
  }
  
  public boolean ZE() {
    return this.ZX.ZI();
  }
  
  public Zo Zs() {
    return this.ZX.ZS();
  }
  
  public boolean ZT() {
    return this.ZX.ZP();
  }
  
  public boolean ZR() {
    return this.ZX.Zw();
  }
  
  public byte[] Za() {
    return this.ZX.ZV();
  }
  
  public Zl36 ZV(byte[] paramArrayOfbyte) {
    return new Zl36(new Zrz_(this.ZX.ZP(), this.ZX.ZS(), this.ZX.ZD(), this.ZX.Zw(), this.ZX.ZV(), paramArrayOfbyte), this.ZB);
  }
  
  public Zl36 Zc(Zt83 paramZt83) {
    return new Zl36(this.ZX, paramZt83);
  }
  
  public Zt83 ZU() {
    return this.ZB;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl36.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */