package burp;

public class Ztp3 implements Zgx1 {
  private final Zrzd ZT;
  
  public Ztp3(Zrzd paramZrzd) {
    this.ZT = paramZrzd;
  }
  
  public void Zc(Zstu paramZstu, Zm7o paramZm7o) {
    int i = paramZm7o.Zz();
    if (Zd(paramZstu, i))
      paramZm7o.Zl(Zf(paramZstu, i)); 
  }
  
  private boolean Zd(Zstu paramZstu, int paramInt) {
    int i = paramInt + this.ZT.Zo(paramZstu, paramInt);
    return (paramZstu.Zp(i) == 44);
  }
  
  private int Zf(Zstu paramZstu, int paramInt) {
    return 1 + this.ZT.Zo(paramZstu, paramInt + 1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztp3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */