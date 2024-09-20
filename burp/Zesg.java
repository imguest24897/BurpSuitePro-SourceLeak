package burp;

public class Zesg implements Zk8x {
  private final Zxop Zk;
  
  private final Zk8x[] Zl;
  
  private static int[] Zz;
  
  Zesg(Zxop paramZxop, Zk8x... paramVarArgs) {
    this.Zk = paramZxop;
    this.Zl = paramVarArgs;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    int[] arrayOfInt = Zj();
    Zm7o zm7o = new Zm7o(paramZm7o);
    while (zm7o.Zz() < paramZstu.Zpu() - 1) {
      int i = zm7o.Zz();
      zm7o.Zl(this.Zk.ZO(paramZstu, i));
      if (i < paramZstu.Zpu() && paramZstu.Zp(i) == 60 && paramZstu.Zp(i + 1) != 33)
        break; 
      Zk8x[] arrayOfZk8x = this.Zl;
      int j = arrayOfZk8x.length;
      byte b = 0;
      while (b < j) {
        Zk8x zk8x = arrayOfZk8x[b];
        Short short_ = zk8x.ZT(paramZstu, zm7o);
        if (short_.shortValue() != 1)
          return short_; 
        b++;
        if (arrayOfInt == null)
          break; 
      } 
      this.Zk.Ze(paramZstu.Zp(i));
      zm7o.Zl(1);
      if (arrayOfInt == null)
        break; 
    } 
    return Short.valueOf((short)1);
  }
  
  public static void ZG(int[] paramArrayOfint) {
    Zz = paramArrayOfint;
  }
  
  public static int[] Zj() {
    return Zz;
  }
  
  static {
    if (Zj() == null)
      ZG(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zesg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */