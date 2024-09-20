package burp;

public class Zl_b implements Zk8x {
  private static final byte[] Zb = new byte[] { 60, 104, 116, 109, 108 };
  
  private static final byte[] ZR = new byte[] { 60, 104, 101, 97, 100 };
  
  private static int Zc;
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    int i = Zd();
    int j = paramZm7o.Zz();
    if (ZL(paramZstu, j) || ZM(paramZstu, j))
      return Short.valueOf((short)256); 
    if (Zbqc.Zwu() == null)
      ZT(++i); 
    return Short.valueOf((short)1);
  }
  
  private boolean ZL(Zstu paramZstu, int paramInt) {
    return Zlt_.ZL(paramZstu, Zb, false, paramInt);
  }
  
  private boolean ZM(Zstu paramZstu, int paramInt) {
    return Zlt_.ZL(paramZstu, ZR, false, paramInt);
  }
  
  static {
    ZT(0);
  }
  
  public static void ZT(int paramInt) {
    Zc = paramInt;
  }
  
  public static int ZI() {
    return Zc;
  }
  
  public static int Zd() {
    int i = ZI();
    return (i == 0) ? 98 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl_b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */