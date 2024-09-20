package burp;

public class Zr4l implements Zk8x {
  private final Zxop Zw;
  
  private static Zbqc[] ZA;
  
  public Zr4l(Zxop paramZxop) {
    this.Zw = paramZxop;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    if (this.Zw.Zf()) {
      int i = paramZm7o.Zz() + Zmra.Zw(paramZstu, paramZm7o.Zz());
      if (i < paramZstu.Zpu() && paramZstu.Zp(i) == 123)
        return Short.valueOf((short)258); 
    } 
    return Short.valueOf((short)1);
  }
  
  public static void Zc(Zbqc[] paramArrayOfZbqc) {
    ZA = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZR() {
    return ZA;
  }
  
  static {
    if (ZR() == null)
      Zc(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr4l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */