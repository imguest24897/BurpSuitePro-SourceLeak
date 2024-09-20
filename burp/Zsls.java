package burp;

public class Zsls implements Zgx1 {
  private final Zrzd ZJ;
  
  public Zsls(Zrzd paramZrzd) {
    this.ZJ = paramZrzd;
  }
  
  public void Zc(Zstu paramZstu, Zm7o paramZm7o) {
    int i = paramZm7o.Zz();
    if (ZS(paramZstu, i) && ZP(paramZstu, i + 1))
      paramZm7o.Zl(Zt(paramZstu, i)); 
  }
  
  private boolean ZS(Zstu paramZstu, int paramInt) {
    return (paramZstu.Zp(paramInt) == 123);
  }
  
  private boolean ZP(Zstu paramZstu, int paramInt) {
    return (Zb('}', paramZstu, paramInt) != -1);
  }
  
  private int Zt(Zstu paramZstu, int paramInt) {
    int i = Zb('}', paramZstu, paramInt) - paramInt + 1;
    return i + this.ZJ.Zo(paramZstu, paramInt + i);
  }
  
  private int Zb(char paramChar, Zstu paramZstu, int paramInt) {
    return Zlt_.Zq(paramZstu, (byte)paramChar, false, paramInt, paramZstu.Zpu());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsls.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */