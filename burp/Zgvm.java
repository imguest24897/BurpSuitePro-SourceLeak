package burp;

public class Zgvm implements Zk8x {
  private final Zrzd ZI;
  
  private final Zk8x Zv;
  
  private final Zk8x Zl;
  
  Zgvm(Zrzd paramZrzd, Zk8x paramZk8x1, Zk8x paramZk8x2) {
    this.ZI = paramZrzd;
    this.Zv = paramZk8x1;
    this.Zl = paramZk8x2;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    int i = Zgxv.ZW();
    Zm7o zm7o = new Zm7o(paramZm7o.Zz() + this.ZI.Zo(paramZstu, paramZm7o.Zz()));
    if (Zp(paramZstu, zm7o)) {
      Short short_ = this.Zv.ZT(paramZstu, zm7o);
      if (short_.shortValue() != 1)
        return short_; 
      short_ = this.Zl.ZT(paramZstu, zm7o);
      if (short_.shortValue() != 1)
        return short_; 
    } 
    if (i != 0)
      Zbqc.Zr(new Zbqc[4]); 
    return Short.valueOf((short)1);
  }
  
  private boolean Zp(Zstu paramZstu, Zm7o paramZm7o) {
    return (paramZm7o.Zz() + 1 < paramZstu.Zpu());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */