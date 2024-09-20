package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zt45 {
  private static String[] ZO;
  
  public static Zx_5 Zu(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2, int paramInt) {
    String[] arrayOfString = ZO();
    if (Zbqc.Zwu() == null)
      Zz(new String[4]); 
    return new Zx_5(Zzu2.DATABASE_CONNECTION_STRING_DISCLOSED, (byte)0, paramInt, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, Zb99.Zn(new String[] { paramString2 }))), (byte)2, Za(paramInt), paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  private static byte Za(int paramInt) {
    // Byte code:
    //   0: invokestatic ZO : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: iload_0
    //   5: bipush #8
    //   7: iand
    //   8: ifeq -> 17
    //   11: iconst_3
    //   12: istore_2
    //   13: aload_1
    //   14: ifnull -> 29
    //   17: iload_0
    //   18: ifeq -> 27
    //   21: iconst_2
    //   22: istore_2
    //   23: aload_1
    //   24: ifnull -> 29
    //   27: iconst_1
    //   28: istore_2
    //   29: iload_2
    //   30: ireturn
  }
  
  public static void Zz(String[] paramArrayOfString) {
    ZO = paramArrayOfString;
  }
  
  public static String[] ZO() {
    return ZO;
  }
  
  static {
    if (ZO() != null)
      Zz(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt45.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */