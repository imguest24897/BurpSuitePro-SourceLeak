package burp;

import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxjq {
  private static boolean Zn;
  
  static String ZH(Zgxp paramZgxp, Zejb paramZejb, int paramInt, boolean paramBoolean, Zrte<Ze9k> paramZrte, Zskh paramZskh) {
    try {
      if (paramZgxp.Zer() == -1)
        return ""; 
    } catch (Ztku ztku) {
      throw a(null);
    } 
    Zm8f zm8f = null;
    switch (Zt1.Zl[paramZejb.ordinal()]) {
      case 1:
        zm8f = paramZgxp.Ze9().Zo(Short.valueOf(paramZgxp.Zer()));
        break;
      case 2:
        zm8f = paramZgxp.Ze9().Zo(Integer.valueOf(0));
        break;
      case 3:
      case 4:
        zm8f = paramZgxp.Ze9().Zo(Integer.valueOf(paramInt));
        break;
    } 
    try {
    
    } catch (Ztku ztku) {
      throw a(null);
    } 
    try {
      Zuh.Zb((zm8f != null), Zqf.Zr);
      Objects.requireNonNull(zm8f);
      if (!paramBoolean)
        return Zkb.ZG(zm8f.Zom()); 
    } catch (Ztku ztku) {
      throw a(null);
    } 
    try {
      if (zm8f.ZoI() != null)
        return Zkb.ZG(zm8f.ZoI()); 
    } catch (Ztku ztku) {
      throw a(null);
    } 
    byte[] arrayOfByte = null;
    try {
      switch (Zt1.Zl[paramZejb.ordinal()]) {
        case 1:
        case 2:
          arrayOfByte = ((Ze9k)paramZrte.ZdF(0)).ZiB().Zm(zm8f.Zom(), false);
          break;
        case 3:
        case 4:
          arrayOfByte = ((Ze9k)paramZrte.ZdF(paramInt)).ZiB().Zm(zm8f.Zom(), false);
          break;
      } 
    } catch (Ztku ztku) {
      Zah.Zl(ztku, Zk_.UNEXPECTED);
      paramZskh.Zl(ztku);
    } 
    try {
      if (arrayOfByte == null) {
        Zmgc.PAYLOAD_VALUES_COPY_FAIL.ZK(paramZskh, new Object[0]);
        return Zkb.ZG(zm8f.Zom());
      } 
    } catch (Ztku ztku) {
      throw a(null);
    } 
    return Zkb.ZG(arrayOfByte);
  }
  
  static boolean ZA(Zlau<?> paramZlau, Object paramObject) {
    if (paramZlau == paramObject)
      return true; 
    if (paramObject == null || paramZlau.getClass() != paramObject.getClass())
      return false; 
    Zlau zlau = (Zlau)paramObject;
    return (paramZlau.ZI() == zlau.ZI() && paramZlau.ZT() == zlau.ZT());
  }
  
  static int Ze(Zlau<?> paramZlau) {
    return Objects.hash(new Object[] { Integer.valueOf(paramZlau.ZI()), Integer.valueOf(paramZlau.ZT()) });
  }
  
  public static int Zo(Zlau<?> paramZlau) {
    return paramZlau.Zn();
  }
  
  public static int Zr(Zlau<?> paramZlau) {
    return paramZlau.ZT();
  }
  
  public static void ZF(boolean paramBoolean) {
    Zn = paramBoolean;
  }
  
  public static boolean ZS() {
    return Zn;
  }
  
  public static boolean ZZ() {
    boolean bool = ZS();
    return !bool;
  }
  
  private static Ztku a(Ztku paramZtku) {
    return paramZtku;
  }
  
  static {
    if (!ZS())
      ZF(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxjq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */