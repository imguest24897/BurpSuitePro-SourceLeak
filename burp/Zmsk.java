package burp;

import java.util.function.Predicate;

class Zmsk {
  private static final Predicate<Zsh8> ZD = Zmsk::lambda$static$0;
  
  private static final Predicate<Zsh8> ZO = Zmsk::lambda$static$1;
  
  private static final Predicate<Zsh8> ZL = Zmsk::lambda$static$2;
  
  private static final Predicate<Zsh8> ZX = Zmsk::lambda$static$3;
  
  private static final Predicate<Zsh8> ZG = Zmsk::lambda$static$4;
  
  private static final Predicate<Zsh8> Zv = Zmsk::lambda$static$5;
  
  private static final Predicate<Zsh8> ZK = Zmsk::lambda$static$6;
  
  private static final Predicate<Zsh8> Zq = Zmsk::lambda$static$7;
  
  private static final Predicate<Zsh8> ZS = Zmsk::lambda$static$8;
  
  private static final Predicate<Zsh8> ZC = Zmsk::lambda$static$9;
  
  private static final Predicate<Zsh8> Zs = Zsh8::ZPS;
  
  private static boolean ZN(Zsh8 paramZsh8) {
    Zz4g zz4g = paramZsh8.ZP_();
    return (zz4g != null && zz4g.Zv_() && zz4g.ZvZ() != null);
  }
  
  private static boolean ZV(Zsh8 paramZsh8) {
    Zz4g zz4g = paramZsh8.ZP_();
    return (zz4g != null && zz4g.Zvz() && zz4g.Zvb() != null);
  }
  
  private static boolean Zg(Zsh8 paramZsh8) {
    Zz4g zz4g = paramZsh8.ZP_();
    return (zz4g != null && zz4g.ZvO());
  }
  
  private static boolean lambda$static$9(Zsh8 paramZsh8) {
    return Zz96.Zi(paramZsh8.ZPE().ZwZ());
  }
  
  private static boolean lambda$static$8(Zsh8 paramZsh8) {
    return (ZG.test(paramZsh8) && Zg(paramZsh8));
  }
  
  private static boolean lambda$static$7(Zsh8 paramZsh8) {
    return (ZG.test(paramZsh8) && ZV(paramZsh8));
  }
  
  private static boolean lambda$static$6(Zsh8 paramZsh8) {
    return (ZG.test(paramZsh8) && ZN(paramZsh8));
  }
  
  private static boolean lambda$static$5(Zsh8 paramZsh8) {
    return (paramZsh8.ZPM() != Zmae.NEVER_FOLLOW);
  }
  
  private static boolean lambda$static$4(Zsh8 paramZsh8) {
    return !paramZsh8.ZPn();
  }
  
  private static boolean lambda$static$3(Zsh8 paramZsh8) {
    return (paramZsh8.ZPa() == Zejb.SNIPER && Zz96.Z_(paramZsh8.ZPJ(), paramZsh8.ZPq()) > 1);
  }
  
  private static boolean lambda$static$2(Zsh8 paramZsh8) {
    return !ZO.test(paramZsh8);
  }
  
  private static boolean lambda$static$1(Zsh8 paramZsh8) {
    return (paramZsh8.ZPq().Zpu() == 1);
  }
  
  private static boolean lambda$static$0(Zsh8 paramZsh8) {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmsk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */