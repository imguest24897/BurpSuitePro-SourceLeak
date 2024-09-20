package burp;

public class Zgxv implements Zk8x {
  private final Zrzd ZU;
  
  private static int Zn;
  
  Zgxv(Zrzd paramZrzd) {
    this.ZU = paramZrzd;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    int i = paramZm7o.Zz();
    return (ZV(paramZstu, i) && (Zj(paramZstu, i + 1) || Za(paramZstu, i + 1))) ? Short.valueOf((short)260) : Short.valueOf((short)1);
  }
  
  private boolean Zj(Zstu paramZstu, int paramInt) {
    return (ZO(paramZstu, paramInt) || Zu(paramZstu, paramInt));
  }
  
  private boolean ZO(Zstu paramZstu, int paramInt) {
    int i = ZW();
    int j = ZC(paramZstu, paramInt);
    while (j < paramZstu.Zpu() && Zg(paramZstu, j)) {
      j++;
      if (i != 0)
        break; 
    } 
    return ZT(paramZstu, j);
  }
  
  private boolean Zu(Zstu paramZstu, int paramInt) {
    int i = ZC(paramZstu, paramInt);
    return ZP(paramZstu, i) ? ZG(paramZstu, i + 1) : false;
  }
  
  private boolean ZG(Zstu paramZstu, int paramInt) {
    int i = ZN();
    int j = ZC(paramZstu, paramInt);
    while (j < paramZstu.Zpu() && !ZP(paramZstu, j)) {
      j++;
      if (i == 0)
        break; 
    } 
    return ZT(paramZstu, j + 1);
  }
  
  private boolean ZV(Zstu paramZstu, int paramInt) {
    int i = ZC(paramZstu, paramInt);
    return (paramZstu.Zp(i) == 123);
  }
  
  private boolean Za(Zstu paramZstu, int paramInt) {
    int i = ZC(paramZstu, paramInt);
    return (i < paramZstu.Zpu() && paramZstu.Zp(i) == 125);
  }
  
  private boolean ZP(Zstu paramZstu, int paramInt) {
    int i = ZC(paramZstu, paramInt);
    return (i < paramZstu.Zpu() && paramZstu.Zp(i) == 34 && paramZstu.Zp(i - 1) != 92);
  }
  
  private boolean ZT(Zstu paramZstu, int paramInt) {
    int i = ZC(paramZstu, paramInt);
    return (i < paramZstu.Zpu() && paramZstu.Zp(i) == 58);
  }
  
  private boolean Zg(Zstu paramZstu, int paramInt) {
    return (Character.isLetter(paramZstu.Zp(paramInt)) || Character.isDigit(paramZstu.Zp(paramInt)) || paramZstu.Zp(paramInt) == 36);
  }
  
  private int ZC(Zstu paramZstu, int paramInt) {
    return paramInt + this.ZU.Zo(paramZstu, paramInt);
  }
  
  public static void Zg(int paramInt) {
    Zn = paramInt;
  }
  
  public static int ZW() {
    return Zn;
  }
  
  public static int ZN() {
    int i = ZW();
    return (i == 0) ? 55 : 0;
  }
  
  static {
    if (ZW() != 0)
      Zg(113); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */