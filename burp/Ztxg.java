package burp;

import java.util.Arrays;
import java.util.List;
import net.portswigger.Zsy;

public class Ztxg extends Ztx1 {
  private static final List<Zlp9> ZD = Arrays.asList(new Zlp9[] { Zlp9.NUMERIC_ORACLE_SQLI_PAYLOAD, Zlp9.STRING_ORACLE_SQLI_PAYLOAD, Zlp9.COMMA_ORACLE_SQLI_PAYLOAD });
  
  private final Ztai ZI;
  
  public Ztxg(Zsy paramZsy, Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Ztai paramZtai, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(ZD, new Zt4j(paramZe3n, paramZbjl, new Zbn6(paramZsy, paramZbjl, paramInt, paramZe3n.ZM().Zgv()), paramZesv, paramZr_4, paramZbnt), new Zgi2());
    this.ZI = paramZtai;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (super.ZD(paramZmaj) && ((this.ZI.ZS(Zzu2.SQL_INJECTION, Zr3z.ORACLE_SPECIFIC) && this.ZI.ZS(Zzu2.SQL_INJECTION, Zr3z.COLLABORATOR_BASED)) || (this.ZI.ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.ORACLE_SPECIFIC) && this.ZI.ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.COLLABORATOR_BASED))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */