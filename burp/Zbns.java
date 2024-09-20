package burp;

import java.math.BigDecimal;
import java.util.Objects;

public class Zbns {
  static void Zr(BigDecimal paramBigDecimal, Zmu9 paramZmu9, Zkit paramZkit) {
    Zbqc[] arrayOfZbqc = Zlct.Zl();
    if (paramBigDecimal == null) {
      paramZkit.Zi(paramZmu9, Zknt.ZM, (String)null);
      if (arrayOfZbqc == null) {
        Zbqc.Zr(new Zbqc[4]);
      } else {
        return;
      } 
    } 
    String str = paramBigDecimal.toPlainString();
    paramZkit.Zi(paramZmu9, Zknt.ZM, str);
  }
  
  static BigDecimal ZN(String paramString) {
    return (paramString == null) ? null : new BigDecimal(paramString);
  }
  
  static boolean ZU(Zmu9 paramZmu9, Object paramObject) {
    if (paramZmu9 == null || paramObject == null)
      return (paramZmu9 == null && paramObject == null); 
    if (Zewd.ZI(paramZmu9, (Zgpi)paramObject))
      return true; 
    if (paramZmu9.getClass() != paramObject.getClass())
      return false; 
    Zmu9 zmu9 = (Zmu9)paramObject;
    return Objects.equals(paramZmu9.Z_s(), zmu9.Z_s());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbns.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */