package burp;

public class Zs6l {
  private final Zmhe Zj;
  
  private static boolean ZU;
  
  Zs6l(Zmhe paramZmhe) {
    this.Zj = paramZmhe;
  }
  
  Ztsh ZO(byte paramByte, byte[] paramArrayOfbyte) {
    return new Ztsh(this.Zj, paramByte, paramArrayOfbyte, (byte)2, (byte)3);
  }
  
  public static void ZF(boolean paramBoolean) {
    ZU = paramBoolean;
  }
  
  public static boolean ZK() {
    return ZU;
  }
  
  public static boolean Zu() {
    boolean bool = ZK();
    return !bool;
  }
  
  static {
    if (!Zu())
      ZF(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs6l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */