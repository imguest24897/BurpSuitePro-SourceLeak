package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmtk {
  private static String[] ZL;
  
  public static Zsqx<Zrdb> ZY(Zvow paramZvow1, Zvow paramZvow2, Zvow paramZvow3, Zmzk paramZmzk, byte paramByte1, byte[] paramArrayOfbyte, byte paramByte2, List<String> paramList, String paramString, boolean paramBoolean, short paramShort) {
    String[] arrayOfString = Zl();
    ArrayList<Zt2w> arrayList = new ArrayList();
    if (paramZvow2 != null)
      arrayList.add(new Zt2w(null, paramZvow2)); 
    Zuh.Zb((paramZvow1 != null), Zqf.Zr);
    arrayList.add(new Zt2w(null, paramZvow1));
    Zuh.Zb((paramZvow3 != null), Zqf.Zr);
    arrayList.add(new Zt2w(null, paramZvow3));
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REQUEST_HEADERS, Zsw8.Zf(paramList, "§")), Zriz.ZG(Ztz3.CANARY, paramString), Zriz.ZG(Ztz3.RESPONSE_CONTAINS_CANARY, String.valueOf(paramBoolean)), Zriz.ZG(Ztz3.STATUS_CODE, String.valueOf(paramShort)) });
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
    return new Zx_5(Zzu2.WEB_CACHE_POISONING, paramByte1, 0, map, (List)arrayList, paramByte2, (byte)4, paramZmzk, paramArrayOfbyte, null);
  }
  
  public static Zx_5 ZZ(Zmzk paramZmzk, String paramString1, Zxs7 paramZxs7, Zvow paramZvow1, Zvow paramZvow2, String paramString2, byte paramByte, boolean paramBoolean) {
    ArrayList<Zt2w> arrayList = new ArrayList();
    arrayList.add(new Zt2w(null, paramZvow1));
    arrayList.add(new Zt2w(null, paramZvow2));
    String[] arrayOfString = Zl();
    Zuh.Zb((paramZvow1 != null), Zqf.Zr);
    Zuh.Zb((paramZvow2 != null), Zqf.Zr);
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.UNKEYED_PARAM_IS_UTM_CONTENT, String.valueOf(paramBoolean)), Zriz.ZG(Ztz3.CANARY, paramString2) });
    if (Zbqc.Zwu() == null)
      ZO(new String[2]); 
    return new Zx_5(Zzu2.WEB_CACHE_POISONING, paramByte, 0, map, (List)arrayList, (byte)2, (byte)3, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static void ZO(String[] paramArrayOfString) {
    ZL = paramArrayOfString;
  }
  
  public static String[] Zl() {
    return ZL;
  }
  
  static {
    if (Zl() == null)
      ZO(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmtk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */