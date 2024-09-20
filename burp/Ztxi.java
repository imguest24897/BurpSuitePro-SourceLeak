package burp;

import java.util.Arrays;
import java.util.List;

public class Ztxi extends Ztx1 {
  private static final List<Zlp9> Ze = Arrays.asList(new Zlp9[] { Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_TRUE_CLIENT_IP_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_X_SCRAPED_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_X_REAL_IP_PAYLOAD });
  
  private final Ztai Zo;
  
  public Ztxi(Ztai paramZtai, Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Zkl6 paramZkl6, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Ze, new Zt4l(paramZe3n, paramZbjl, new Zbpw(paramZkl6, paramZbjl, paramInt, Zk7g.SPOOFABLE_CLIENT_IP, paramZe3n), paramZesv, paramZr_4, paramZbnt), new Zgih());
    this.Zo = paramZtai;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (this.Zo.ZS(Zzu2.SPOOFABLE_CLIENT_IP, Zr3z.COLLABORATOR_BASED) && super.ZD(paramZmaj));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */