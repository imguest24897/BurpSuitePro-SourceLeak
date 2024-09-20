package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zsy;

public class Ztxy extends Ztx1 {
  static final List<Zlp9> ZF = Collections.singletonList(Zlp9.XXE_PAYLOAD);
  
  private final Ztai ZO;
  
  public Ztxy(Zsy paramZsy, Zbjl paramZbjl, Ztai paramZtai, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(ZF, new Zt4j(paramZe3n, paramZbjl, new Zl32(paramZsy, paramZbjl, paramInt, paramZe3n.ZM().Zgv()), paramZesv, paramZr_4, paramZbnt), new Zgi2());
    this.ZO = paramZtai;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (super.ZD(paramZmaj) && this.ZO.ZS(Zzu2.XML_EXTERNAL_ENTITY_INJECTION, Zr3z.COLLABORATOR_BASED));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */