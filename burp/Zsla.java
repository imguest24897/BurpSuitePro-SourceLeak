package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

public class Zsla {
  private static Zbqc[] ZB;
  
  public static Zx_5 ZF(Zmzk paramZmzk, String paramString, byte paramByte, Zvow paramZvow, long paramLong1, long paramLong2, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    return new Zx_5(Zzu2.PHP_CODE_INJECTION, paramByte, 0, new HashMap<>(), Collections.singletonList(new Zt27(new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow), paramLong1, paramLong2)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zx_5 Zw(Zmzk paramZmzk, String paramString1, Zvow paramZvow, List<Zsjh<?>> paramList, byte[] paramArrayOfbyte, boolean paramBoolean, String paramString2, Zxs7 paramZxs7) {
    Zbqc[] arrayOfZbqc = Zb();
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REFLECTION, paramString2), Zriz.ZG(Ztz3.COLLABORAOR_IP_BASED, String.valueOf(paramBoolean)) });
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zx_5(Zzu2.PHP_CODE_INJECTION, (byte)4, 0, map, Arrays.asList((Zlfv<? extends Zgkc>[])new Zlfv[] { new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow), new Zt69(new Zz25(paramArrayOfbyte, 0), null, paramList) }), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static Zsqx<Zrdb> Zh(Zmzk paramZmzk, String paramString, boolean paramBoolean, Zvow paramZvow, List<Zsjh<?>> paramList, byte[] paramArrayOfbyte, Zxs7 paramZxs7) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.COLLABORAOR_IP_BASED, String.valueOf(paramBoolean)) });
    return new Zx_5(Zzu2.PHP_CODE_INJECTION, (byte)4, 0, map, Zbxq.ZS(paramArrayOfbyte, paramZvow, paramList), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zx_5 ZH(Zmzk paramZmzk, String paramString1, Zlvf paramZlvf, byte[] paramArrayOfbyte, String paramString2, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    Zbqc[] arrayOfZbqc = Zb();
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REFLECTION, paramString2) });
    if (Zbqc.Zwu() == null)
      ZX(new Zbqc[5]); 
    return new Zx_5(Zzu2.PHP_CODE_INJECTION, (byte)4, 0, map, (List)Collections.singletonList(paramZlvf.Zq(new Zz25(paramArrayOfbyte, 0), paramList1, paramList2)), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static void ZX(Zbqc[] paramArrayOfZbqc) {
    ZB = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zb() {
    return ZB;
  }
  
  static {
    if (Zb() == null)
      ZX(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsla.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */