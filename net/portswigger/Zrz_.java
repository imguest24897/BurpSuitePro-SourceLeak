package net.portswigger;

public class Zrz_ {
  private final boolean Zd;
  
  private final Zo ZR;
  
  private final byte ZG;
  
  private final boolean ZD;
  
  private final byte[] Zu;
  
  private final byte[] ZC;
  
  private final int ZZ;
  
  public Zrz_(boolean paramBoolean1, Zo paramZo, byte paramByte, boolean paramBoolean2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this(paramBoolean1, paramZo, paramByte, paramBoolean2, paramArrayOfbyte1, paramArrayOfbyte2, (paramArrayOfbyte2 == null) ? 0 : paramArrayOfbyte2.length);
  }
  
  public Zrz_(boolean paramBoolean1, Zo paramZo, byte paramByte, boolean paramBoolean2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    this.Zd = paramBoolean1;
    this.ZR = paramZo;
    this.ZG = paramByte;
    this.ZD = paramBoolean2;
    this.Zu = paramArrayOfbyte1;
    this.ZC = paramArrayOfbyte2;
    this.ZZ = paramInt;
  }
  
  public boolean ZP() {
    return this.Zd;
  }
  
  public Zo ZS() {
    return this.ZR;
  }
  
  public Zc_ Zh() {
    return Zc_.ZL(this.ZG);
  }
  
  public byte ZD() {
    return this.ZG;
  }
  
  public boolean Zw() {
    return this.ZD;
  }
  
  public byte[] ZV() {
    return this.Zu;
  }
  
  public byte[] ZK() {
    return this.ZC;
  }
  
  public int Zp() {
    return this.ZZ;
  }
  
  public boolean ZI() {
    return Zh().Zx();
  }
  
  public String toString() {
    return super.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrz_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */