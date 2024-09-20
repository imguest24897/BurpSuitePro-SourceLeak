package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zzw6 {
  private static boolean ZX;
  
  public static Zx_5 ZC(Zmzk paramZmzk, String paramString, Zvow paramZvow1, Zvow paramZvow2, Zxs7 paramZxs7, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    boolean bool = Zy();
    if (Zbqc.Zwu() == null)
      Zs(!bool); 
    return new Zx_5(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REFLECTION, Zkb.ZG(paramArrayOfbyte3)) }), Collections.singletonList(Zl2v.Zp(new Zt2w(new Zz25(paramArrayOfbyte1, 0), paramZvow1), new Zt2w(new Zz25(paramArrayOfbyte2, 0), paramZvow2))), (byte)1, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zsqx<Zrdb> Zt(Zmzk paramZmzk, String paramString, Zvow paramZvow, Zxs7 paramZxs7, byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return new Zx_5(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, paramByte1, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REFLECTION, Zkb.ZG(paramArrayOfbyte2)) }), Collections.singletonList(new Zt2w(new Zz25(paramArrayOfbyte1, 0), paramZvow)), paramByte2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zs(boolean paramBoolean) {
    ZX = paramBoolean;
  }
  
  public static boolean Zy() {
    return ZX;
  }
  
  public static boolean ZS() {
    boolean bool = Zy();
    return !bool;
  }
  
  static {
    if (!Zy())
      Zs(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzw6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */