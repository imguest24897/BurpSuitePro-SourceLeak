package burp;

public class Zs3g {
  private final Zbz5 Zi;
  
  private final Zez3 Zd;
  
  private byte ZY;
  
  private byte ZS;
  
  private byte Zo;
  
  public Zs3g(Zbz5 paramZbz5, Zez3 paramZez3) {
    this.Zi = paramZbz5;
    this.Zd = paramZez3;
    this.ZY = paramZbz5.ZN(paramZez3);
    this.ZS = ZE(this.ZY);
    this.Zo = ZS(this.ZY);
  }
  
  public Zs3g(Zbz5 paramZbz5, Zxya paramZxya) {
    this.Zi = paramZbz5;
    this.Zd = paramZxya.ZX;
    this.ZY = paramZxya.Zp;
    this.ZS = ZE(this.ZY);
    this.Zo = ZS(this.ZY);
  }
  
  public byte ZM() {
    return this.ZS;
  }
  
  public byte Zk() {
    return this.Zo;
  }
  
  public int ZN() {
    return Zz(this.ZS, this.Zo);
  }
  
  public void ZD(byte paramByte1, byte paramByte2) {
    this.ZS = paramByte1;
    this.Zo = paramByte2;
    this.ZY = ZA(this.ZY, paramByte1, paramByte2);
    this.Zi.Zd(this.Zd, this.ZY);
  }
  
  public static int Zz(byte paramByte1, byte paramByte2) {
    return (paramByte1 == 0 || paramByte2 == 0) ? 9999 : Zb3i.ZE(paramByte1, paramByte2);
  }
  
  public static byte ZL(byte paramByte) {
    return (byte)(paramByte << 5);
  }
  
  public static byte ZE(byte paramByte) {
    int i = paramByte & 0xE0;
    byte b = (byte)(i >>> 5);
    return (b == 7) ? -1 : b;
  }
  
  public static byte Z_(byte paramByte) {
    return (byte)(paramByte << 2);
  }
  
  public static byte ZS(byte paramByte) {
    int i = paramByte & 0x1C;
    return (byte)(i >>> 2);
  }
  
  public static byte ZA(byte paramByte1, byte paramByte2, byte paramByte3) {
    byte b = (byte)(paramByte1 & 0xFFFFFF03);
    return Zgzm.Zd(b, new byte[] { Zgzm.Zd(ZL(paramByte2), new byte[] { Z_(paramByte3) }) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs3g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */