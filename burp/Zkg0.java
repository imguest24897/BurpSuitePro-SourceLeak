package burp;

public class Zkg0 extends Zkg_ implements Zk8x {
  public Zkg0(Zrzd paramZrzd1, Zrzd paramZrzd2) {
    super(paramZrzd1, paramZrzd2);
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    int i = paramZm7o.Zz();
    return (Zo(paramZstu, i) && ZW(paramZstu, i)) ? Short.valueOf((short)256) : Short.valueOf((short)1);
  }
  
  private boolean ZW(Zstu paramZstu, int paramInt) {
    int i = Z_(paramZstu, paramInt);
    return (ZJ(paramZstu, i) || Ze(paramZstu, i));
  }
  
  private boolean Ze(Zstu paramZstu, int paramInt) {
    return Zk(paramZstu, ZC(paramZstu, paramInt)) ? ZL(paramZstu, ZC(paramZstu, paramInt)) : false;
  }
  
  private boolean ZL(Zstu paramZstu, int paramInt) {
    int i = ZD(paramZstu, paramInt + Zx.length);
    int j = Zlt_.Zq(paramZstu, (byte)34, false, i + 1, paramZstu.Zpu());
    return Zq.Zi(paramZstu, i, i + j).ZP();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkg0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */