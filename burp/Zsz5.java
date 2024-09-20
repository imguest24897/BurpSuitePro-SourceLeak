package burp;

public class Zsz5 implements Zk8x {
  private final Zxop Zb;
  
  private final Zk8x[] Zm;
  
  Zsz5(Zxop paramZxop, Zk8x... paramVarArgs) {
    this.Zb = paramZxop;
    this.Zm = paramVarArgs;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    int[] arrayOfInt = Zesg.Zj();
    if (this.Zb.Zx()) {
      Zk8x[] arrayOfZk8x = this.Zm;
      int i = arrayOfZk8x.length;
      byte b = 0;
      while (b < i) {
        Zk8x zk8x = arrayOfZk8x[b];
        Short short_ = zk8x.ZT(paramZstu, paramZm7o);
        if (short_.shortValue() != 1)
          return short_; 
        b++;
        if (arrayOfInt == null)
          break; 
      } 
    } 
    return Short.valueOf((short)1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsz5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */