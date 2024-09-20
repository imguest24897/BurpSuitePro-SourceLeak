package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

public class Zrcm {
  private static int Zj;
  
  public static Zsqx<Zrdb> Zy(byte paramByte, Zmzk paramZmzk, String paramString, Zvow paramZvow, Zlit paramZlit, List<Zmwr> paramList) {
    int i = ZQ();
    if (i == 0)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zx_5(Zzu2.CLEARTEXT_SUBMISSION_OF_PASSWORD, paramByte, 0, ZA(paramZlit, paramList), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  private static Map<Long, String> ZA(Zlit paramZlit, List<Zmwr> paramList) {
    return (paramZlit != null && paramList != null) ? Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.ACTION_URL, paramZlit.toString()), Zriz.ZG(Ztz3.FIELD_NAMES, Zsw8.ZE(paramList, ",", Zmwr::Zh4)) }) : Collections.emptyMap();
  }
  
  public static void Zv(int paramInt) {
    Zj = paramInt;
  }
  
  public static int Zs() {
    return Zj;
  }
  
  public static int ZQ() {
    int i = Zs();
    return (i == 0) ? 30 : 0;
  }
  
  static {
    if (ZQ() == 0)
      Zv(27); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrcm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */