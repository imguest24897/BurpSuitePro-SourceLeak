package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

public class Zk2 {
  private static boolean ZN;
  
  public static Zsqx<Zrdb> ZD(Zmzk paramZmzk, String paramString1, Zlvf paramZlvf, byte[] paramArrayOfbyte, String paramString2, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7, byte paramByte) {
    boolean bool = Z_();
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.MATCH, paramString2) });
    if (Zbqc.Zwu() == null)
      Zh(!bool); 
    return new Zx_5(paramZlvf.<Zvs>Za(Zzu2.FORM_ACTION_HIJACKING_REFLECTED, Zzu2.FORM_ACTION_HIJACKING_STORED), paramByte, 0, map, (List)Collections.singletonList(paramZlvf.Zq(new Zz25(paramArrayOfbyte, 0), paramList1, paramList2)), (byte)2, (paramByte == 0) ? 3 : 2, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static void Zh(boolean paramBoolean) {
    ZN = paramBoolean;
  }
  
  public static boolean ZA() {
    return ZN;
  }
  
  public static boolean Z_() {
    boolean bool = ZA();
    return !bool;
  }
  
  static {
    if (Z_())
      Zh(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */