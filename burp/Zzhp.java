package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.portswigger.Zkb;

public class Zzhp {
  private static String[] Zt;
  
  public static Zx_5 ZE(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2) {
    return new Zx_5(Zzu2.JWT_WEAK_HMAC_SECRET, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, Zb99.Zn(new String[] { paramString2 }))), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static Zx_5 ZW(Zvs paramZvs, Zmzk paramZmzk, String paramString, Zvow paramZvow1, Zvow paramZvow2, Zvow paramZvow3, Zxs7 paramZxs7, byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    String[] arrayOfString = ZC();
    Zlfv<? extends Zgkc> zlfv = Zl2v.Zp(new Zt2w(new Zz25(paramArrayOfbyte1, 0), paramZvow2), new Zt2w(new Zz25(paramArrayOfbyte2, 0), paramZvow3));
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(paramZvs, (byte)0, 0, Collections.emptyMap(), List.of(new Zt2w(new Zz25(paramZxs7.ZI().getBytes(), 0), paramZvow1), Objects.<Zlfv<? extends Zgkc>>requireNonNull(zlfv)), paramByte, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zx_5 ZV(Zvs paramZvs, Zmzk paramZmzk, String paramString, Zvow paramZvow, Zxs7 paramZxs7, byte[] paramArrayOfbyte, List<Zsjh<?>> paramList) {
    return new Zx_5(paramZvs, (byte)0, 0, Collections.emptyMap(), List.of(new Zt69(new Zz25(paramArrayOfbyte, 0), paramZvow, paramList)), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zsqx<Zrdb> ZK(Zmzk paramZmzk, Zvow paramZvow, String paramString, byte paramByte, boolean paramBoolean) {
    return new Zx_5(Zzu2.JWK_DISCLOSED, (byte)0, 0, Map.of(Long.valueOf(Ztz3.JWT_JWKS_HAVE_PRIVATE_MATERIAL.permanentIndex), Boolean.toString(paramBoolean)), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, paramByte, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static Zsqx<Zrdb> Zh(Zmzk paramZmzk, Zvow paramZvow, String paramString1, String paramString2) {
    String[] arrayOfString = ZC();
    if (Zbqc.Zwu() == null)
      Zw(new String[4]); 
    return new Zx_5(Zzu2.JWT_PRIVATE_KEY_DISCLOSURE, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, Zb99.Zn(new String[] { paramString2 }))), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void Zw(String[] paramArrayOfString) {
    Zt = paramArrayOfString;
  }
  
  public static String[] ZC() {
    return Zt;
  }
  
  static {
    if (ZC() == null)
      Zw(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzhp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */