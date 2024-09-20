package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

public class Zep4 {
  private static String[] Zx;
  
  public static Zsqx<Zrdb> ZT(Zmzk paramZmzk, String paramString1, Zlvf paramZlvf, byte[] paramArrayOfbyte, String paramString2, String paramString3, String paramString4, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    String[] arrayOfString = Zj();
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.HTML_TAG, paramString3), Zriz.ZG(Ztz3.HTML_ATTRIBUTE, paramString4), Zriz.ZG(Ztz3.MATCH, paramString2) });
    if (Zbqc.Zwu() == null)
      ZU(new String[5]); 
    return Zz(paramZmzk, paramString1, paramZlvf, paramArrayOfbyte, paramList1, paramList2, paramZxs7, map);
  }
  
  public static Zsqx<Zrdb> ZF(Zmzk paramZmzk, String paramString1, Zlvf paramZlvf, byte[] paramArrayOfbyte, String paramString2, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.MATCH, paramString2) });
    return Zz(paramZmzk, paramString1, paramZlvf, paramArrayOfbyte, paramList1, paramList2, paramZxs7, map);
  }
  
  public static Zsqx<Zrdb> Zu(Zmzk paramZmzk, String paramString1, Zlvf paramZlvf, byte[] paramArrayOfbyte, String paramString2, String paramString3, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.MATCH, paramString2), Zriz.ZG(Ztz3.HEADER_NAME, paramString3) });
    return Zz(paramZmzk, paramString1, paramZlvf, paramArrayOfbyte, paramList1, paramList2, paramZxs7, map);
  }
  
  private static Zsqx<Zrdb> Zz(Zmzk paramZmzk, String paramString, Zlvf paramZlvf, byte[] paramArrayOfbyte, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7, Map<Long, String> paramMap) {
    return new Zx_5(paramZlvf.<Zvs>Za(Zzu2.CLIENT_SIDE_HTTP_PARAMETER_POLLUTION_REFLECTED, Zzu2.CLIENT_SIDE_HTTP_PARAMETER_POLLUTION_STORED), (byte)0, 0, paramMap, (List)Collections.singletonList(paramZlvf.Zq(new Zz25(paramArrayOfbyte, 0), paramList1, paramList2)), (byte)2, (byte)2, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void ZU(String[] paramArrayOfString) {
    Zx = paramArrayOfString;
  }
  
  public static String[] Zj() {
    return Zx;
  }
  
  static {
    if (Zj() == null)
      ZU(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zep4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */