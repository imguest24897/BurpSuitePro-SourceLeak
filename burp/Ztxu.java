package burp;

import java.util.Arrays;
import java.util.List;

public class Ztxu extends Ztx1 {
  private static final List<Zlp9> ZX = Arrays.asList(new Zlp9[] { 
        Zlp9.COLLABORATOR_EVERYWHERE_HOST_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_HOST_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_ABSOLUTE_URL_ON_REQUEST_LINE_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_URL_WITH_AUTHENTICATION_FRAGMENT_ON_REQUEST_LINE_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_HOST_WITH_AUTHENTICATION_FRAGMENT_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_CONNECT_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_TRUE_CLIENT_IP_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_X_REAL_IP_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_REFERER_PAYLOAD, 
        Zlp9.COLLABORATOR_EVERYWHERE_X_WAP_PROFILE_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_X_SCRAPED_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_SSL_SNI_PAYLOAD });
  
  private final Ztai ZI;
  
  public Ztxu(Ztai paramZtai, Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Zkl6 paramZkl6, Zr_4 paramZr_4) {
    super(ZX, new Zt46(ZX, paramZe3n, paramZbjl, new Zbpw(paramZkl6, paramZbjl, paramInt, Zk7g.EXTERNAL_SERVICE_INTERACTION, paramZe3n), paramZesv, paramZr_4, paramZkl6.ZB()), new Zkae(paramZtai, new Zgiq()));
    this.ZI = paramZtai;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return ((this.ZI.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED) || this.ZI.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED)) && super.ZD(paramZmaj));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */