package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

public class Zsmg {
  private static boolean ZV;
  
  public static Zsqx<Zrdb> ZH(Zmzk paramZmzk, String paramString1, Zlvf paramZlvf, byte[] paramArrayOfbyte, String paramString2, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    boolean bool = Zk();
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.MATCH, paramString2) });
    if (Zbqc.Zwu() == null)
      Za(!bool); 
    return new Zx_5(paramZlvf.<Zvs>Za(Zzu2.CSS_INJECTION_REFLECTED, Zzu2.CSS_INJECTION_STORED), (byte)0, 0, map, (List)Collections.singletonList(paramZlvf.Zq(new Zz25(paramArrayOfbyte, 0), paramList1, paramList2)), (byte)2, (byte)3, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static void Za(boolean paramBoolean) {
    ZV = paramBoolean;
  }
  
  public static boolean Zw() {
    return ZV;
  }
  
  public static boolean Zk() {
    boolean bool = Zw();
    return !bool;
  }
  
  static {
    if (!Zw())
      Za(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsmg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */