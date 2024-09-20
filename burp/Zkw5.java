package burp;

import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkw5 extends Zklz<Zs82> {
  private static final Zllo<Zs82> Zm = new Zgti();
  
  private static final Zm31[] Zp = new Zm31[] { Zkzg.ZB, Zkzg.ZU, Zkzg.Zi, Zkzg.Zl };
  
  Zkw5() {
    super(Zp, Zm, (byte)10);
  }
  
  public Optional<Zgpi<?>> Zr(Zkit paramZkit, Zgpi<?> paramZgpi) {
    if (paramZgpi instanceof Zs82) {
      Zs82 zs82 = (Zs82)paramZgpi;
      if (zs82.Zf2() != null && zs82.Zfy() != null && zs82.Zfy().Zm2() == Zz3o.SPECULATIVE) {
        Zsp5 zsp5 = (Zsp5)zs82.Zfy();
        Zm5e zm5e = paramZkit.<Zm5e>ZH(new Zma_(zs82.Znq(), zs82.ZfD(), zsp5.ZhF(), zsp5.Zm2()));
        return Optional.of(zm5e);
      } 
      return Optional.empty();
    } 
    Zuh.Zb(false, Zqf.Zr);
    return Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkw5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */