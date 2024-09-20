package burp;

public class Zstl implements Zgx1 {
  private final Zrzd ZR;
  
  public Zstl(Zrzd paramZrzd) {
    this.ZR = paramZrzd;
  }
  
  public void Zc(Zstu paramZstu, Zm7o paramZm7o) {
    int i = paramZm7o.Zz();
    if (Zo(paramZstu, i) && Zt(paramZstu, i + 1))
      paramZm7o.Zl(ZB(paramZstu, i)); 
  }
  
  private boolean Zo(Zstu paramZstu, int paramInt) {
    return (paramZstu.Zp(paramInt) == 91);
  }
  
  private boolean Zt(Zstu paramZstu, int paramInt) {
    return (ZG(']', paramZstu, paramInt) != -1);
  }
  
  private int ZB(Zstu paramZstu, int paramInt) {
    int i = ZG(']', paramZstu, paramInt) - paramInt + 1;
    return i + this.ZR.Zo(paramZstu, paramInt + i);
  }
  
  private int ZG(char paramChar, Zstu paramZstu, int paramInt) {
    return Zlt_.Zq(paramZstu, (byte)paramChar, false, paramInt, paramZstu.Zpu());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zstl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */