package burp;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Zmja {
  public static boolean ZL() {
    return ZV() ? true : (ZY() ? true : (Zq(Zszd.class) ? true : (Zq(Zrh2.class) ? true : (ZF() ? true : (Zb())))));
  }
  
  private static boolean ZV() {
    return false;
  }
  
  private static boolean ZY() {
    return false;
  }
  
  private static boolean Zq(Class<?> paramClass) {
    for (Field field : paramClass.getDeclaredFields()) {
      if (!Modifier.isStatic(field.getModifiers()))
        return true; 
      if (!Modifier.isFinal(field.getModifiers()))
        return true; 
    } 
    return false;
  }
  
  private static boolean ZF() {
    Zzb4 zzb4 = Zrf1.Za;
    for (Zzu2 zzu2 : Zzu2.values()) {
      if (!zzu2.Zq()) {
        Zree zree = zzb4.ZR(zzu2);
        if (null == zree.Za6() || null == zree.ZZV() || "".equals(zree.ZZV()) || null == zree.ZZA() || "".equals(zree.ZZA()))
          return true; 
      } 
    } 
    return false;
  }
  
  private static boolean Zb() {
    Zzb4 zzb4 = Zrf1.Za;
    for (Zzu2 zzu2 : Zzu2.values()) {
      if (zzu2.Zq()) {
        Zree zree = zzb4.ZR(zzu2);
        if (null != zree.Za6() || !zree.ZZV().isEmpty() || null != zree.ZZA())
          return true; 
      } 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmja.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */