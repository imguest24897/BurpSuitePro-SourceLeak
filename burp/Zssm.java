package burp;

public class Zssm implements Zrzd {
  private static boolean ZN;
  
  public int Zo(Zstu paramZstu, int paramInt) {
    byte b = 0;
    int i = paramInt;
    boolean bool = ZU();
    while (i < paramZstu.Zpu() && Zu(paramZstu.Zp(i))) {
      b++;
      i++;
      if (!bool) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    return b;
  }
  
  private boolean Zu(byte paramByte) {
    return (paramByte == 9 || paramByte == 10 || paramByte == 13 || paramByte == 32);
  }
  
  public static void ZT(boolean paramBoolean) {
    ZN = paramBoolean;
  }
  
  public static boolean ZU() {
    return ZN;
  }
  
  public static boolean Zs() {
    boolean bool = ZU();
    return !bool;
  }
  
  static {
    if (!ZU())
      ZT(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zssm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */