package burp;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkae implements Zmdl {
  private final Ztai ZF;
  
  private final Zmdl ZW;
  
  public Zkae(Ztai paramZtai, Zmdl paramZmdl) {
    this.ZF = paramZtai;
    this.ZW = paramZmdl;
  }
  
  public void Zr(Zmaj paramZmaj) {
    String[] arrayOfString = Zgi2.ZD();
    switch (Zb1y.Zo[paramZmaj.ZO.ZA().ordinal()]) {
      case 1:
      case 2:
        if (this.ZF.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED)) {
          this.ZW.Zr(paramZmaj);
          if (arrayOfString != null);
        } 
        return;
      case 3:
        if (this.ZF.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED)) {
          this.ZW.Zr(paramZmaj);
          if (arrayOfString != null);
        } 
        return;
      case 4:
      case 5:
        if (this.ZF.Zr(Zzu2.EXTERNAL_SERVICE_INTERACTION_SMTP)) {
          this.ZW.Zr(paramZmaj);
          if (arrayOfString != null)
            break; 
        } 
        return;
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
  
  public Iterator<Map.Entry<Zro0, List<Zmaj>>> iterator() {
    return this.ZW.iterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkae.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */