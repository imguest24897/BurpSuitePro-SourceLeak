package burp;

public class Zs9y implements Zk8x {
  private final Zk8x[] Zx;
  
  Zs9y(Zk8x... paramVarArgs) {
    this.Zx = paramVarArgs;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    Zk8x[] arrayOfZk8x = this.Zx;
    int i = arrayOfZk8x.length;
    byte b = 0;
    boolean bool = Zmoi.Za();
    while (b < i) {
      Zk8x zk8x = arrayOfZk8x[b];
      Short short_ = zk8x.ZT(paramZstu, paramZm7o);
      if (short_.shortValue() != 1)
        return short_; 
      b++;
      if (bool)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zmoi.Zm(!bool); 
    return Short.valueOf((short)1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs9y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */