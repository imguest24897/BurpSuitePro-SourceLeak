package burp;

public class Zmra implements Zrzd {
  private final Zrzd[] ZC;
  
  private static int[] ZX;
  
  public Zmra(Zrzd... paramVarArgs) {
    this.ZC = paramVarArgs;
  }
  
  public int Zo(Zstu paramZstu, int paramInt) {
    int[] arrayOfInt = Zd();
    int i = paramInt;
    while (i < paramZstu.Zpu() - 1) {
      Zrzd[] arrayOfZrzd = this.ZC;
      int j = arrayOfZrzd.length;
      byte b = 0;
      while (b < j) {
        Zrzd zrzd = arrayOfZrzd[b];
        i += zrzd.Zo(paramZstu, i);
        b++;
        if (arrayOfInt != null)
          break; 
      } 
      if (ZK(paramZstu, i))
        break; 
      if (i < paramZstu.Zpu() - 1) {
        i++;
        if (arrayOfInt != null)
          break; 
      } 
    } 
    i += Zw(paramZstu, i);
    return i - paramInt;
  }
  
  public static int ZP(byte[] paramArrayOfbyte, int paramInt) {
    int[] arrayOfInt = Zd();
    byte b = 0;
    while (paramInt + b < paramArrayOfbyte.length && paramArrayOfbyte[paramInt + b] <= 32) {
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return b;
  }
  
  public static int Zw(Zstu paramZstu, int paramInt) {
    int[] arrayOfInt = Zd();
    byte b = 0;
    while (paramInt + b < paramZstu.Zpu() && paramZstu.Zp(paramInt + b) <= 32) {
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return b;
  }
  
  private boolean ZK(Zstu paramZstu, int paramInt) {
    return (paramInt < paramZstu.Zpu() && paramZstu.Zp(paramInt) > 32);
  }
  
  public static void Zk(int[] paramArrayOfint) {
    ZX = paramArrayOfint;
  }
  
  public static int[] Zd() {
    return ZX;
  }
  
  static {
    if (Zd() != null)
      Zk(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmra.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */