package burp;

import java.util.Collections;
import java.util.EnumSet;

public class Ztx2 extends Ztx1 {
  private static final EnumSet<Zb25> Zy = EnumSet.of(Zb25.SMTP, Zb25.SMTPS);
  
  private static final EnumSet<Zlp9> Zq = EnumSet.of(Zlp9.SMTP_HEADER_INJECTION_SIMPLE_PAYLOAD, Zlp9.SMTP_HEADER_INJECTION_ENCLOSED_PAYLOAD);
  
  private final Ztai ZU;
  
  public Ztx2(Zb9e paramZb9e, Zbjl paramZbjl, Ze3n paramZe3n, Ztai paramZtai, Zesv paramZesv, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Collections.emptyList(), new Zz06(paramZe3n, paramZbjl, paramZb9e, paramZesv, paramZr_4, paramZbnt), new Zld6(Zy, Zq));
    this.ZU = paramZtai;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return this.ZU.Zr(Zzu2.EXTERNAL_SERVICE_INTERACTION_SMTP);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztx2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */