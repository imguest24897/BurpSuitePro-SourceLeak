package burp;

import java.time.Duration;

public class Zlv5 {
  private Zxgd ZO = Zxgd.ZZ();
  
  private Duration ZQ = null;
  
  private boolean Zu = false;
  
  private byte[] ZR = Zsoh.ZG;
  
  private boolean ZY = false;
  
  private boolean Zc = false;
  
  public Zlv5 ZE() {
    this.Zc = true;
    return this;
  }
  
  public static Zlv5 Zp(Zlp5 paramZlp5) {
    return (new Zlv5()).Za(paramZlp5.ZP()).Zu(paramZlp5.Ze()).ZD(paramZlp5.Zh()).ZZ(paramZlp5.Za()).Ze(paramZlp5.ZB());
  }
  
  public static Zlv5 ZK(Zlp5 paramZlp5) {
    return (new Zlv5()).ZD(paramZlp5.Zh()).Za(paramZlp5.Zg()).Zu(paramZlp5.Ze()).ZZ(paramZlp5.Za()).Ze(paramZlp5.ZB());
  }
  
  public Zxgd Zy() {
    return this.ZO;
  }
  
  public Duration ZZ() {
    return Zz() ? this.ZQ : null;
  }
  
  public boolean ZN() {
    return this.Zu;
  }
  
  public boolean Zz() {
    return (this.ZQ != null && !this.ZQ.isZero());
  }
  
  public byte[] ZR() {
    return this.ZR;
  }
  
  public boolean Zo() {
    return this.ZY;
  }
  
  public boolean Zc() {
    return this.Zc;
  }
  
  public Zlv5 Za(Zxgd paramZxgd) {
    this.ZO = paramZxgd;
    return this;
  }
  
  public Zlv5 ZR(Zkq4 paramZkq4) {
    this.ZO = this.ZO.ZY(paramZkq4.ZA().ZF());
    return this;
  }
  
  public Zlv5 Zu(Duration paramDuration) {
    this.ZQ = paramDuration;
    return this;
  }
  
  public Zlv5 ZD(boolean paramBoolean) {
    this.Zu = paramBoolean;
    return this;
  }
  
  public Zlv5 ZZ(byte[] paramArrayOfbyte) {
    this.ZR = paramArrayOfbyte;
    return this;
  }
  
  public Zlv5 Ze(boolean paramBoolean) {
    this.ZY = paramBoolean;
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlv5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */