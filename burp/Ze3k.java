package burp;

public class Ze3k implements Zk8x {
  private final Zk8x[] Ze;
  
  Ze3k(Zk8x... paramVarArgs) {
    this.Ze = paramVarArgs;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    Zk8x[] arrayOfZk8x = this.Ze;
    int i = arrayOfZk8x.length;
    int[] arrayOfInt = Zesg.Zj();
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
    return Short.valueOf((short)1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze3k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */