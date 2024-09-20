package net.portswigger.browser;

import java.util.function.Predicate;

public class Zf {
  private static String ZL;
  
  public static Predicate<Zjc> Zk(Zjc paramZjc) {
    return Predicate.isEqual(paramZjc);
  }
  
  public static Predicate<Zjc> Zh(String paramString) {
    return ZG(new Zev(paramString));
  }
  
  public static Predicate<Zjc> ZG(Zev paramZev) {
    return paramZev::lambda$targetId$1;
  }
  
  public static Predicate<Zjc> ZJ(String paramString) {
    return paramString::lambda$sessionId$2;
  }
  
  public static Predicate<Zjc> ZF() {
    return Zf::lambda$isPage$4;
  }
  
  private static boolean lambda$isServiceWorker$5(Zjc paramZjc) {
    return paramZjc instanceof Zz;
  }
  
  private static boolean lambda$isPage$4(Zjc paramZjc) {
    return paramZjc instanceof Zjw;
  }
  
  private static boolean lambda$sessionId$3(Zd paramZd, Zjc paramZjc) {
    return paramZjc.Z_().equals(paramZd);
  }
  
  private static boolean lambda$sessionId$2(String paramString, Zjc paramZjc) {
    return paramZjc.Z_().equals(Zd.Zu(paramString));
  }
  
  private static boolean lambda$targetId$1(Zev paramZev, Zjc paramZjc) {
    return paramZjc.ZG().equals(paramZev);
  }
  
  private static boolean lambda$exactly$0(Zjc paramZjc1, Zjc paramZjc2) {
    return (paramZjc2 == paramZjc1);
  }
  
  public static void Zt(String paramString) {
    ZL = paramString;
  }
  
  public static String ZX() {
    return ZL;
  }
  
  static {
    if (ZX() != null)
      Zt("YS11fb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */