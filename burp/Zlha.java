package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zkb;

public class Zlha {
  private static int[] ZM;
  
  public static Zsqx<Zrdb> ZE(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2, Collection<Zlit> paramCollection) {
    int[] arrayOfInt = ZH();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
    return new Zx_5(Zzu2.CROSS_DOMAIN_REFERER_LEAKAGE, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, (Collection<String>)paramCollection.stream().map(Zlit::toString).collect(Collectors.toCollection(java.util.TreeSet::new)))), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void ZJ(int[] paramArrayOfint) {
    ZM = paramArrayOfint;
  }
  
  public static int[] ZH() {
    return ZM;
  }
  
  static {
    if (ZH() == null)
      ZJ(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlha.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */