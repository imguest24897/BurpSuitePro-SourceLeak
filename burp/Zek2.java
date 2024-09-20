package burp;

public class Zek2 extends Zeku {
  private final byte ZP;
  
  private static int[] ZI;
  
  public Zek2(int paramInt) {
    this(paramInt, (byte)0);
  }
  
  public Zek2(int paramInt, byte paramByte) {
    super(paramInt, 1);
    this.ZP = paramByte;
  }
  
  public byte ZY() {
    return this.ZP;
  }
  
  public void ZB(Zkit paramZkit, Zgpi paramZgpi1, Zgpi paramZgpi2) {
    byte b = paramZkit.ZL(paramZgpi1, this);
    paramZkit.Zc(paramZgpi2, this, b);
  }
  
  public void ZK(Zs7v paramZs7v) {
    paramZs7v.Za(this);
  }
  
  public static void Zz(int[] paramArrayOfint) {
    ZI = paramArrayOfint;
  }
  
  public static int[] ZL() {
    return ZI;
  }
  
  static {
    if (ZL() == null)
      Zz(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zek2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */