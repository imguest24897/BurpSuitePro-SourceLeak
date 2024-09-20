package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.portswigger.Zdo;
import net.portswigger.Zlz;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztje {
  private static Zbqc[] ZY;
  
  public static Zsqx<Zrdb> ZD(Zvow paramZvow1, Zvow paramZvow2, Zmzk paramZmzk, byte paramByte1, byte paramByte2, short paramShort1, List<String> paramList, boolean paramBoolean, short paramShort2) {
    Zbqc[] arrayOfZbqc = Zk();
    ArrayList<Zt2w> arrayList = new ArrayList();
    Zuh.Zb((paramZvow1 != null), Zqf.Zr);
    arrayList.add(new Zt2w(null, paramZvow1));
    if (paramZvow2 != null)
      arrayList.add(new Zt2w(null, paramZvow2)); 
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REQUEST_HEADERS, Zlz.Zh(paramList, "§")), Zriz.ZG(Ztz3.BASE_RESPONSE_STATUS_CODE, String.valueOf(paramShort1)), Zriz.ZG(Ztz3.RESPONSE_CONTAINS_CANARY, String.valueOf(paramBoolean)), Zriz.ZG(Ztz3.STATUS_CODE, String.valueOf(paramShort2)) });
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zx_5(Zzu2.REQUEST_URL_OVERRIDE, paramByte1, 0, map, (List)arrayList, paramByte2, (byte)1, paramZmzk, Zdo.Za, null);
  }
  
  public static void Zc(Zbqc[] paramArrayOfZbqc) {
    ZY = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zk() {
    return ZY;
  }
  
  static {
    if (Zk() != null)
      Zc(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztje.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */