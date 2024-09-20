package burp;

import java.util.Arrays;
import java.util.List;
import net.portswigger.Zsy;

public class Ztxd extends Ztx1 {
  private static final List<Zlp9> Zf = Arrays.asList(new Zlp9[] { Zlp9.NUMERIC_MYSQL_ORDER_BY_SQLI_PAYLOAD, Zlp9.STRING_MYSQL_ORDER_BY_SQLI_PAYLOAD, Zlp9.NUMERIC_MYSQL_SQLI_PAYLOAD, Zlp9.STRING_MYSQL_SQLI_PAYLOAD });
  
  private final Ztai Ze;
  
  public Ztxd(Zsy paramZsy, Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Zkq4 paramZkq4, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Zf, new Zt4j(paramZe3n, paramZbjl, new Zkga(paramZsy, paramZkq4.ZqT(), paramZbjl, paramInt, paramZe3n.ZM().Zgv()), paramZesv, paramZr_4, paramZbnt), new Zzjk(Zf));
    this.Ze = paramZkq4;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (super.ZD(paramZmaj) && ((this.Ze.ZS(Zzu2.SQL_INJECTION, Zr3z.MYSQL_SPECIFIC) && this.Ze.ZS(Zzu2.SQL_INJECTION, Zr3z.COLLABORATOR_BASED)) || (this.Ze.ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.MYSQL_SPECIFIC) && this.Ze.ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.COLLABORATOR_BASED))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */