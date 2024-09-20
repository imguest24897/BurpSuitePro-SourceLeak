package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import net.portswigger.Zkb;

public class Zk8o {
  private static int ZL;
  
  public static Zsqx<Zrdb> ZY(Zmzk paramZmzk, String paramString, Zvow paramZvow, Zx8_ paramZx8_) {
    int i = ZE();
    List<String> list = (List)paramZx8_.ZZp().stream().map(Zmwr::Zh4).filter(Objects::nonNull).collect(Collectors.toList());
    if (i != 0)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.CROSS_DOMAIN_POST, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.ACTION_URL, paramZx8_.ZZa().toString()), Zriz.ZG(Ztz3.ACTION_URL_PATH, Zkb.ZG(paramZx8_.ZZa().Zd4())), Zriz.ZG(Ztz3.ACTION_URL_HOST, paramZx8_.ZZa().Zd1()), Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramZx8_.ZZa().Zd1()), Zriz.ZG(Ztz3.HTML_ELEMENT_OFFSET, Integer.toString(paramZx8_.ZZh().ZlK())) }), Collections.singletonList(new Zrn_(paramZvow, list)), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void ZW(int paramInt) {
    ZL = paramInt;
  }
  
  public static int ZE() {
    return ZL;
  }
  
  public static int ZT() {
    int i = ZE();
    return (i == 0) ? 24 : 0;
  }
  
  static {
    if (ZE() != 0)
      ZW(126); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk8o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */