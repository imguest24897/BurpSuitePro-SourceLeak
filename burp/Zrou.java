package burp;

public class Zrou implements Zk8x {
  private static final byte[] ZI = new byte[] { -1, -40 };
  
  private static final byte[] Zw = new byte[] { -1, -39 };
  
  private static final byte[] ZR = new byte[] { 71, 73, 70 };
  
  private static final byte[] Zv = new byte[] { -119, 80, 78, 71 };
  
  private static final byte[] ZF = new byte[] { 66, 77 };
  
  private static final byte[] ZL = new byte[] { 73, 73, 66, 0 };
  
  private static final byte[] ZC = new byte[] { 77, 77, 0, 66 };
  
  private static final byte[] Z_ = new byte[] { 70, 87, 83 };
  
  private static final byte[] Zl = new byte[] { 67, 87, 83 };
  
  private static final byte[] ZU = new byte[] { 119, 79, 70, 70 };
  
  private static final byte[] ZQ = new byte[] { 119, 79, 70, 50 };
  
  private static final Zrpi<Short> Zs = Zw();
  
  private final Zxop ZA;
  
  public Zrou(Zxop paramZxop) {
    this.ZA = paramZxop;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    return !this.ZA.Zz() ? Short.valueOf((short)1) : Zs.Zo(paramZstu, paramZm7o.Zz()).filter(paramZstu::lambda$execute$0).orElse(Short.valueOf((short)1));
  }
  
  private static Zrpi<Short> Zw() {
    Zrpi<Short> zrpi = new Zrpi();
    zrpi.ZG(ZI, Short.valueOf((short)513));
    zrpi.ZG(ZR, Short.valueOf((short)514));
    zrpi.ZG(Zv, Short.valueOf((short)515));
    zrpi.ZG(ZF, Short.valueOf((short)516));
    zrpi.ZG(ZL, Short.valueOf((short)517));
    zrpi.ZG(ZC, Short.valueOf((short)517));
    zrpi.ZG(Z_, Short.valueOf((short)1026));
    zrpi.ZG(Zl, Short.valueOf((short)1026));
    zrpi.ZG(ZU, Short.valueOf((short)1536));
    zrpi.ZG(ZQ, Short.valueOf((short)1537));
    return zrpi;
  }
  
  private static boolean lambda$execute$0(Zstu paramZstu, Short paramShort) {
    return (paramShort.shortValue() != 513 || Zlt_.ZT(paramZstu, Zw, paramZstu.Zpu() - 2));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrou.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */