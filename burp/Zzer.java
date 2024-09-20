package burp;

import java.util.Iterator;
import java.util.List;
import net.portswigger.Zkb;

public class Zzer extends Zzek {
  private final String ZJ;
  
  Zzer(String paramString) {
    this.ZJ = paramString;
  }
  
  protected void ZJ(Zstu paramZstu, Zs68 paramZs68, List<Zl1r> paramList) {
    String str = this.ZJ + ":";
    Iterator<String> iterator = paramZs68.Zy().iterator();
    int[] arrayOfInt = Zgim.ZP();
    while (iterator.hasNext()) {
      String str1 = iterator.next();
      if (str1.toLowerCase().startsWith(str)) {
        int i = Zlt_.Zr(paramZstu, Zkb.Zy(str1));
        int j = i + str.length();
        int k = i + str1.length();
        j = Zebz.Zc(paramZstu, j, k);
        while (Zebz.Zb(paramZstu, k - 1) && k > j) {
          k--;
          if (arrayOfInt != null)
            break; 
        } 
        paramList.add(new Zl1r(j, k));
      } 
      if (arrayOfInt != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */