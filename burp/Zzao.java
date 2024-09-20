package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Zzao extends Zzek {
  protected void ZJ(Zstu paramZstu, Zs68 paramZs68, List<Zl1r> paramList) {
    int i = Zlt_.Zn(paramZstu);
    byte[] arrayOfByte = Zkb.Zy(String.valueOf(paramZs68.Zb));
    int j = Zlt_.Zd(paramZstu, arrayOfByte, false, 0, i);
    if (j != -1)
      paramList.add(new Zl1r(j, j + arrayOfByte.length)); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzao.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */