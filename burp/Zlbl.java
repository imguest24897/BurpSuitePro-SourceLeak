package burp;

import java.util.Iterator;
import java.util.List;

public class Zlbl {
  private final List<Zsmi> ZH;
  
  public Zlbl(Zsmi... paramVarArgs) {
    this.ZH = List.of(paramVarArgs);
  }
  
  public String ZC() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Zsmi> iterator = this.ZH.iterator();
    String str = Zgv5.Zj();
    while (iterator.hasNext()) {
      Zsmi zsmi = iterator.next();
      stringBuilder.append(zsmi.Zn());
      if (str != null)
        break; 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */