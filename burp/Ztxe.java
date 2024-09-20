package burp;

import java.util.Arrays;
import java.util.List;

public class Ztxe extends Ztx1 {
  static final List<Zlp9> Zm = Arrays.asList(new Zlp9[] { Zlp9.OS_INJ_FAST_SPEED_PAYLOAD, Zlp9.OS_INJ_NORMAL_SPEED_REPLACE_PAYLOAD, Zlp9.OS_INJ_NORMAL_SPEED_PIPE_PAYLOAD, Zlp9.OS_INJ_NORMAL_SPEED_AMPERSAND_PAYLOAD });
  
  private final Ztai Zk;
  
  public Ztxe(Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Zkq4 paramZkq4, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Zm, new Zt4z(Zm, paramZe3n, paramZbjl, new Zlf1(paramZkq4, paramInt, paramZe3n.ZM().Zgv(), paramZbjl), paramZesv, paramZr_4, paramZbnt), new Zzjk(Zm));
    this.Zk = paramZkq4;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    if (!super.ZD(paramZmaj))
      return false; 
    boolean bool = Zl8g.Zo(paramZmaj.ZO);
    Zb25 zb25 = paramZmaj.ZO.ZA();
    return ((bool && this.Zk.ZS(Zzu2.OS_COMMAND_INJECTION, Zr3z.COLLABORATOR_BASED)) || (!bool && zb25 == Zb25.DNS && this.Zk.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED)) || (zb25 == Zb25.HTTP && this.Zk.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */