package burp;

public class Zkg4 extends Zkg_ implements Zk8x {
  public Zkg4(Zrzd paramZrzd1, Zrzd paramZrzd2) {
    super(paramZrzd1, paramZrzd2);
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    String[] arrayOfString = Zk1h.ZL();
    int i = paramZm7o.Zz();
    if (Zo(paramZstu, i) && Zg(paramZstu, i))
      return Short.valueOf((short)262); 
    if (Zbqc.Zwu() == null)
      Zk1h.Zr(new String[1]); 
    return Short.valueOf((short)1);
  }
  
  private boolean Zg(Zstu paramZstu, int paramInt) {
    int i = Z_(paramZstu, paramInt);
    return !ZJ(paramZstu, i) ? Zv(paramZstu, ZC(paramZstu, i)) : false;
  }
  
  private boolean Zv(Zstu paramZstu, int paramInt) {
    return (Zl(paramZstu, paramInt) || Zk(paramZstu, paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkg4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */