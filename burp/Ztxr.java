package burp;

import java.util.Arrays;
import java.util.List;

public class Ztxr extends Ztx1 {
  static final List<Zlp9> ZK = Arrays.asList(new Zlp9[] { Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_JAVA_EL, Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_SPRING_HASH, Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_SPRING_DOLLAR, Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_FREEMARKER, Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_THYMELEAF, Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_VELOCITY, Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_OGNL });
  
  private final Ztai Zu;
  
  public Ztxr(Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Zkq4 paramZkq4, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(ZK, new Zt4z(ZK, paramZe3n, paramZbjl, new Zgpm(paramInt, paramZe3n.ZM().Zgv(), paramZbjl), paramZesv, paramZr_4, paramZbnt), new Zzjk(ZK));
    this.Zu = paramZkq4;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    if (!super.ZD(paramZmaj))
      return false; 
    Zb25 zb25 = paramZmaj.ZO.ZA();
    return (this.Zu.ZS(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, Zr3z.COLLABORATOR_BASED) || (zb25 == Zb25.DNS && this.Zu.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED)) || (zb25 == Zb25.HTTP && this.Zu.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */