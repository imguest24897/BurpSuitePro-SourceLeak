package burp;

public class Zs_s implements Zk8x {
  private static final byte[] Zz = new byte[] { 123, 92, 114, 116, 102 };
  
  private static boolean ZJ;
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    boolean bool = Zx();
    if (paramZstu.Zpu() - paramZm7o.Zz() > 5 && Zlt_.ZT(paramZstu, Zz, paramZm7o.Zz()))
      return Short.valueOf((short)261); 
    if (bool)
      Zbqc.Zr(new Zbqc[1]); 
    return Short.valueOf((short)1);
  }
  
  public static void ZL(boolean paramBoolean) {
    ZJ = paramBoolean;
  }
  
  public static boolean Zx() {
    return ZJ;
  }
  
  public static boolean Zr() {
    boolean bool = Zx();
    return !bool;
  }
  
  static {
    if (!Zr())
      ZL(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */