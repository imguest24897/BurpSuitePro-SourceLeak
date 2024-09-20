package burp;

import java.util.Optional;

public class Zsnl {
  private final byte[] Zb;
  
  private volatile int Zm;
  
  private volatile int Zq;
  
  private volatile int Zs;
  
  private volatile boolean ZW;
  
  private static Zbqc[] ZR;
  
  Zsnl(byte[] paramArrayOfbyte) {
    this.Zb = paramArrayOfbyte;
    Zbqc[] arrayOfZbqc = ZS();
    this.Zm = paramArrayOfbyte.length;
    this.Zq = -1;
    this.Zs = -1;
    if (Zbqc.Zwu() == null)
      ZW(new Zbqc[5]); 
  }
  
  Zsnl(int paramInt) {
    this(new byte[paramInt]);
  }
  
  synchronized boolean Zi(byte paramByte) {
    if (this.Zm > 0 && !this.ZW) {
      int i = (this.Zs + 1) % this.Zb.length;
      this.Zb[i] = paramByte;
      this.Zs = i;
      this.Zm--;
      return true;
    } 
    return false;
  }
  
  synchronized Optional<Byte> Zy() {
    if (Zi() > 0) {
      int i = (this.Zq + 1) % this.Zb.length;
      Optional<Byte> optional = Optional.of(Byte.valueOf(this.Zb[i]));
      this.Zq = i;
      this.Zm++;
      return optional;
    } 
    return Optional.empty();
  }
  
  synchronized void Zd() {
    this.ZW = true;
  }
  
  synchronized boolean ZL() {
    return this.ZW;
  }
  
  synchronized int Zi() {
    return this.Zb.length - this.Zm;
  }
  
  public static void ZW(Zbqc[] paramArrayOfZbqc) {
    ZR = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZS() {
    return ZR;
  }
  
  static {
    if (ZS() != null)
      ZW(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsnl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */