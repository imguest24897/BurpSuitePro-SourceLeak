package burp;

public class Zmf4 implements Zk8x {
  private final Zrzd Ze;
  
  private static int Zy;
  
  public Zmf4(Zrzd paramZrzd) {
    this.Ze = paramZrzd;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    int j = this.Ze.Zo(paramZstu, paramZm7o.Zz());
    paramZm7o.Zl(j);
    int i = ZL();
    if (i != 0)
      Zbqc.Zr(new Zbqc[1]); 
    return Short.valueOf((short)1);
  }
  
  public static void ZU(int paramInt) {
    Zy = paramInt;
  }
  
  public static int ZL() {
    return Zy;
  }
  
  public static int ZF() {
    int i = ZL();
    return (i == 0) ? 73 : 0;
  }
  
  static {
    if (ZF() == 0)
      ZU(120); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmf4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */