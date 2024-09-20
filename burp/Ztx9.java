package burp;

import java.util.Arrays;
import java.util.List;

public class Ztx9 extends Ztx1 {
  public static final List<Zlp9> Zv = Arrays.asList(new Zlp9[] { Zlp9.XSS_DEFERRED_PAYLOAD_SHORT, Zlp9.XSS_DEFERRED_PAYLOAD_LONG, Zlp9.XSS_DEFERRED_PAYLOAD_SHORT_PATCHED_FILE, Zlp9.XSS_DEFERRED_PAYLOAD_LONG_PATCHED_FILE });
  
  private final Ztai ZG;
  
  public Ztx9(Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Zr_4 paramZr_4, Ztai paramZtai, Zbnt paramZbnt) {
    super(Zv, new Zt4j(paramZe3n, paramZbjl, new Zsg2(paramInt, paramZe3n.ZM().Zgv(), paramZbjl, paramZtai), paramZesv, paramZr_4, paramZbnt), new Zeo6(Zv));
    this.ZG = paramZtai;
    if (Zbqc.Zwu() == null)
      Zmzo.Z_("rLVuHc"); 
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (super.ZD(paramZmaj) && this.ZG.ZS(Zzu2.XSS_STORED, Zr3z.COLLABORATOR_BASED));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztx9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */