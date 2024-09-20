package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import net.portswigger.Zkb;

public class Ztgz {
  private static String ZL;
  
  public static Zsqx<Zrdb> Ze(Zmzk paramZmzk, String paramString, Zvow paramZvow, Set<String> paramSet) {
    String str = Zr();
    TreeSet<String> treeSet = new TreeSet<>(paramSet);
    if (str != null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zx_5(Zzu2.MULTIPLE_CONTENT_TYPES_SPECIFIED, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, String.join("§", (Iterable)treeSet)) }), Collections.singletonList(new Zrn_(paramZvow, new ArrayList<>(treeSet))), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zq(String paramString) {
    ZL = paramString;
  }
  
  public static String Zr() {
    return ZL;
  }
  
  static {
    if (Zr() != null)
      Zq("h9osmb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */