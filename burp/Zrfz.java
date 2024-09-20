package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zkb;

public class Zrfz {
  private static int ZG;
  
  public static Zsqx<Zrdb> ZS(Zmzk paramZmzk, String paramString1, Zvow paramZvow, List<Zsjh<?>> paramList, Zxs7 paramZxs7, String paramString2, byte[] paramArrayOfbyte) {
    int i = ZL();
    if (Zbqc.Zwu() == null)
      ZM(++i); 
    return new Zx_5(Zzu2.SSI_INJECTION, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REFLECTION, paramString2) }), Arrays.asList((Zlfv<? extends Zgkc>[])new Zlfv[] { new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow), new Zt69(new Zz25(paramArrayOfbyte, 0), null, paramList) }), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static Zsqx<Zrdb> Zz(Zmzk paramZmzk, String paramString, Zvow paramZvow, List<Zsjh<?>> paramList, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    return new Zx_5(Zzu2.SSI_INJECTION, (byte)0, 0, Collections.emptyMap(), Zbxq.ZS(paramArrayOfbyte, paramZvow, paramList), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zsqx<Zrdb> Zw(Zmzk paramZmzk, String paramString1, Zlvf paramZlvf, byte[] paramArrayOfbyte, String paramString2, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    return new Zx_5(Zzu2.SSI_INJECTION, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REFLECTION, paramString2) }), (List)Collections.singletonList(paramZlvf.Zq(new Zz25(paramArrayOfbyte, 0), paramList1, paramList2)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static void ZM(int paramInt) {
    ZG = paramInt;
  }
  
  public static int Zy() {
    return ZG;
  }
  
  public static int ZL() {
    int i = Zy();
    return (i == 0) ? 35 : 0;
  }
  
  static {
    if (Zy() == 0)
      ZM(32); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrfz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */