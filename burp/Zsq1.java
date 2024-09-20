package burp;

import java.util.Collections;

public class Zsq1 {
  private static String[] ZJ;
  
  public static Zsqx<Zrdb> ZB(Zmzk paramZmzk, Zvow paramZvow, int paramInt) {
    String[] arrayOfString = ZS();
    if (Zbqc.Zwu() == null)
      ZQ(new String[3]); 
    return new Zx_5(Zzu2.FLASH_CROSS_DOMAIN_POLICY, (byte)0, paramInt, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, ZN(paramInt), paramZmzk, Zlc3.Zx, null);
  }
  
  private static byte ZN(int paramInt) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: iload_0
    //   5: ldc 16777216
    //   7: if_icmplt -> 16
    //   10: iconst_4
    //   11: istore_2
    //   12: aload_1
    //   13: ifnull -> 30
    //   16: iload_0
    //   17: ldc 65536
    //   19: if_icmplt -> 28
    //   22: iconst_2
    //   23: istore_2
    //   24: aload_1
    //   25: ifnull -> 30
    //   28: iconst_1
    //   29: istore_2
    //   30: iload_2
    //   31: ireturn
  }
  
  public static void ZQ(String[] paramArrayOfString) {
    ZJ = paramArrayOfString;
  }
  
  public static String[] ZS() {
    return ZJ;
  }
  
  static {
    if (ZS() != null)
      ZQ(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsq1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */