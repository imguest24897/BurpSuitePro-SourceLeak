package burp;

public class Zekr implements Zk8x {
  private final Zxop ZQ;
  
  private static int[] ZF;
  
  public Zekr(Zxop paramZxop) {
    this.ZQ = paramZxop;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    if (paramZstu == null || paramZstu.Zpu() == paramZm7o.Zz())
      return Short.valueOf((short)0); 
    this.ZQ.Za.Zk(paramZstu.Zpu() - paramZm7o.Zz());
    int i = (new Zk1i()).Zo(paramZstu, paramZm7o.Zz());
    if (i > 0)
      paramZm7o.Zl(i); 
    this.ZQ.Za.Zm(10 + paramZstu.Zpu() / 100);
    this.ZQ.Za.Zd(Zk(paramZstu, paramZm7o.Zz()));
    return Short.valueOf((short)1);
  }
  
  private int Zk(Zstu paramZstu, int paramInt) {
    byte b = 0;
    int i = paramZstu.Zpu();
    int[] arrayOfInt = Zo();
    int j = paramInt;
    while (j < i) {
      if (Zb(paramZstu.Zp(j)))
        b++; 
      if (b >= 10 + i / 100)
        break; 
      j++;
      if (arrayOfInt == null)
        break; 
    } 
    return b;
  }
  
  private boolean Zb(byte paramByte) {
    return (paramByte < 32 && paramByte != 9 && paramByte != 10 && paramByte != 13);
  }
  
  public static void Zj(int[] paramArrayOfint) {
    ZF = paramArrayOfint;
  }
  
  public static int[] Zo() {
    return ZF;
  }
  
  static {
    if (Zo() == null)
      Zj(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zekr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */