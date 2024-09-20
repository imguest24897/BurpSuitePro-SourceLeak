package burp;

import java.util.List;

public class Ztxb extends Ztx1 {
  private static final List<Zlp9> Zu = List.of(Zlp9.JWT_JKU_INJECTION, Zlp9.JWT_X5U_INJECTION);
  
  private final Ztai Zb;
  
  public Ztxb(Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Zkq4 paramZkq4, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Zu, new Zt4j(paramZe3n, paramZbjl, new Zt94(paramZkq4, paramInt, paramZe3n.ZM().Zgv(), paramZbjl), paramZesv, paramZr_4, paramZbnt), new Zgiq());
    this.Zb = paramZkq4;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (super.ZD(paramZmaj) && this.Zb.ZN(new Zvs[] { Zzu2.JWT_JKU_HEADER_SUPPORTED, Zzu2.JWT_X5U_HEADER_SUPPORTED }));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */