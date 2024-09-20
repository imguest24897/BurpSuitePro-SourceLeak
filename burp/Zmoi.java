package burp;

public class Zmoi implements Zk8x {
  private static final byte[] Zl = new byte[] { 116, 114, 121 };
  
  private static boolean Zz;
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    if (paramZstu.Zpu() - paramZm7o.Zz() > 4 && Zlt_.ZT(paramZstu, Zl, paramZm7o.Zz())) {
      int i = paramZm7o.Zz() + 3;
      i += Zmra.Zw(paramZstu, i);
      if (i < paramZstu.Zpu() && paramZstu.Zp(i) == 123)
        return Short.valueOf((short)259); 
    } 
    return Short.valueOf((short)1);
  }
  
  public static void Zm(boolean paramBoolean) {
    Zz = paramBoolean;
  }
  
  public static boolean Za() {
    return Zz;
  }
  
  public static boolean ZX() {
    boolean bool = Za();
    return !bool;
  }
  
  static {
    if (Za())
      Zm(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmoi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */