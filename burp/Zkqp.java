package burp;

public class Zkqp {
  private final byte Zi;
  
  private final byte ZJ;
  
  private static int ZU;
  
  public Zkqp(byte paramByte1, byte paramByte2) {
    this.Zi = paramByte1;
    this.ZJ = paramByte2;
  }
  
  public byte Ze() {
    return this.Zi;
  }
  
  public byte ZO() {
    return this.ZJ;
  }
  
  public static void ZG(int paramInt) {
    ZU = paramInt;
  }
  
  public static int ZQ() {
    return ZU;
  }
  
  public static int Zg() {
    int i = ZQ();
    return (i == 0) ? 111 : 0;
  }
  
  static {
    if (Zg() != 0)
      ZG(62); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkqp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */