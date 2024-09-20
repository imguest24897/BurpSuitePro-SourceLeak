package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zkb;

public class Zg58 {
  private static String[] ZA;
  
  public static Zx_5 ZK(Zmzk paramZmzk, String paramString, Zvow paramZvow, byte[] paramArrayOfbyte, int paramInt, Zxs7 paramZxs7) {
    return new Zx_5(Zzu2.OS_COMMAND_INJECTION, (byte)0, 0, Collections.emptyMap(), new ArrayList<>(Collections.singletonList(new Zt2w(new Zz25(paramArrayOfbyte, paramInt), paramZvow))), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zx_5 ZO(Zmzk paramZmzk, String paramString, Zvow paramZvow, byte[] paramArrayOfbyte, int paramInt, Zxs7 paramZxs7, long paramLong1, long paramLong2) {
    return new Zx_5(Zzu2.OS_COMMAND_INJECTION, (byte)1, 0, Collections.emptyMap(), new ArrayList<>(Collections.singletonList(new Zt27(new Zt2w(new Zz25(paramArrayOfbyte, paramInt), paramZvow), paramLong1, paramLong2))), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zsqx<Zrdb> ZM(Zmzk paramZmzk, String paramString, Zvow paramZvow, byte[] paramArrayOfbyte, int paramInt, Zxs7 paramZxs7, List<Zsjh<?>> paramList) {
    return new Zx_5(Zzu2.OS_COMMAND_INJECTION, (byte)1, 0, Collections.emptyMap(), Collections.singletonList(new Zt69(new Zz25(paramArrayOfbyte, paramInt), paramZvow, paramList)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zq(String[] paramArrayOfString) {
    ZA = paramArrayOfString;
  }
  
  public static String[] Zk() {
    return ZA;
  }
  
  static {
    if (Zk() == null)
      Zq(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg58.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */