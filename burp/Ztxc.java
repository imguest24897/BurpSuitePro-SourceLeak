package burp;

import java.util.Arrays;
import java.util.List;
import net.portswigger.Zsy;

public class Ztxc extends Ztx1 {
  private static final List<Zlp9> Zo = Arrays.asList(new Zlp9[] { 
        Zlp9.MSSQL_SQLI_PAYLOAD_NUMERIC_RAW, Zlp9.MSSQL_SQLI_PAYLOAD_STRING_RAW, Zlp9.MSSQL_SQLI_PAYLOAD_NUMERIC_INSERT_ONE_COL, Zlp9.MSSQL_SQLI_PAYLOAD_STRING_INSERT_ONE_COL, Zlp9.MSSQL_SQLI_PAYLOAD_NUMBER_INSERT_TWO_COLS, Zlp9.MSSQL_SQLI_PAYLOAD_STRING_INSERT_TWO_COLS, Zlp9.MSSQL_SQLI_PAYLOAD_NUMERIC_INSERT_THREE_COLS, Zlp9.MSSQL_SQLI_PAYLOAD_STRING_INSERT_THREE_COLS, Zlp9.MSSQL_SQLI_PAYLOAD_NUMERIC_INSERT_FOUR_COLS, Zlp9.MSSQL_SQLI_PAYLOAD_STRING_INSERT_FOUR_COLS, 
        Zlp9.MSSQL_SQLI_PAYLOAD_NUMERIC_NESTED_FUNCTION, Zlp9.MSSQL_SQLI_PAYLOAD_STRING_NESTED_FUNCTION });
  
  private final Ztai ZQ;
  
  public Ztxc(Zsy paramZsy, Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Zkq4 paramZkq4, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Zo, new Zt4j(paramZe3n, paramZbjl, new Zx4p(paramZsy, paramZkq4.ZqT(), paramZbjl, paramInt, paramZe3n.ZM().Zgv()), paramZesv, paramZr_4, paramZbnt), new Zgi2());
    this.ZQ = paramZkq4;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (super.ZD(paramZmaj) && ((this.ZQ.ZS(Zzu2.SQL_INJECTION, Zr3z.MSSQL_SPECIFIC) && this.ZQ.ZS(Zzu2.SQL_INJECTION, Zr3z.COLLABORATOR_BASED)) || (this.ZQ.ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.MSSQL_SPECIFIC) && this.ZQ.ZS(Zzu2.SQL_INJECTION_2ND_ORDER, Zr3z.COLLABORATOR_BASED))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */