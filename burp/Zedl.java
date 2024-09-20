package burp;

import java.util.Collections;

public class Zedl implements Zsvs {
  private static int[] ZK;
  
  public Zsqx<Zrdb> Zg(String paramString, Zku6 paramZku6, Zxs7 paramZxs7, byte paramByte1, byte paramByte2) {
    Zei8<?> zei8 = paramZku6.ZV().Zl(new Zz25(paramZku6.ZY(), 0), paramZku6.ZV().ZY().ZO(), Collections.emptyList(), Collections.emptyList(), Zmes.ZE(paramZku6.ZP((byte)2)));
    return Zmes.Zh(Zzu2.SUSPICIOUS_INPUT_TRANSFORMATION_STORED, paramByte1, zei8, paramString, paramZku6, paramZxs7);
  }
  
  public static void ZI(int[] paramArrayOfint) {
    ZK = paramArrayOfint;
  }
  
  public static int[] ZG() {
    return ZK;
  }
  
  static {
    if (ZG() != null)
      ZI(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */