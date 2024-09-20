package burp;

import java.time.Duration;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import net.portswigger.browser.Zdw;
import net.portswigger.browser.Zee;
import net.portswigger.browser.Zje;
import net.portswigger.browser.Zjq;
import net.portswigger.browser.Ztr;

public class Zzo7 {
  public static Zt8i ZI(Zeu9 paramZeu9, Zszw paramZszw1, Zszw paramZszw2, Zlru paramZlru, Zzxz paramZzxz, Zzwo<Zszw, Zx0c> paramZzwo, Zrp0 paramZrp0, Zt1i paramZt1i, Ztk0 paramZtk0, Zr_4 paramZr_4, Zz1m<Zt35> paramZz1m, Zl7h paramZl7h, Zr69 paramZr69, Zjq paramZjq) {
    Zbqc[] arrayOfZbqc = Zxu_.ZWu();
    Zx0c zx0c = paramZzwo.Zd(paramZszw1);
    if (zx0c == null) {
      zx0c = paramZr_4.<Zx0c>ZH(new Zldv());
      paramZzwo.Zu(paramZszw1, zx0c);
    } 
    Objects.requireNonNull(paramZeu9);
    if (zx0c.Zko().stream().map(Zt8i::Zsu).noneMatch(paramZeu9::equals))
      paramZeu9.Zk(paramZrp0, paramZszw1, paramZlru, paramZtk0, paramZt1i, paramZz1m, paramZr69); 
    Zl1g zl1g = paramZr_4.<Zl1g>ZH(Zb(paramZjq));
    Zt8i zt8i = paramZr_4.<Zt8i>ZH(new Zrdk(paramZrp0, paramZeu9, paramZszw1, paramZszw2, paramZlru, paramZzxz, (byte)paramZl7h.ZVJ(), zl1g));
    zx0c.Ze(zt8i, paramZr69.ZD());
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
    return zt8i;
  }
  
  public static Map<Zszw, Collection<Zt8i>> Zg(Zzwo<Zszw, Zx0c> paramZzwo) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Zszw> iterator = paramZzwo.ZlW().iterator();
    Zbqc[] arrayOfZbqc = Zxu_.ZWu();
    while (iterator.hasNext()) {
      Zszw zszw = iterator.next();
      hashMap.put(zszw, ((Zx0c)paramZzwo.Zd(zszw)).Zko());
      if (arrayOfZbqc == null)
        break; 
    } 
    return (Map)hashMap;
  }
  
  public static Collection<Zt8i> Zl(Zzwo<Zszw, Zx0c> paramZzwo) {
    return paramZzwo.ZlZ().stream().map(Zx0c::Zko).flatMap(Collection::stream).toList();
  }
  
  public static boolean Zn(Zzwo<Zszw, Zx0c> paramZzwo) {
    Zbqc[] arrayOfZbqc = Zxu_.ZWu();
    for (Zszw zszw : paramZzwo.ZlW()) {
      HashSet<Zlru> hashSet = new HashSet();
      for (Zt8i zt8i : ((Zx0c)paramZzwo.Zd(zszw)).Zko()) {
        if (!hashSet.add(zt8i.ZsD()))
          return false; 
        if (arrayOfZbqc == null)
          break; 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    return true;
  }
  
  public static void ZY(Zszw paramZszw, Zt8i paramZt8i, Zzwo<Zszw, Zx0c> paramZzwo) {
    Zx0c zx0c = paramZzwo.Zd(paramZszw);
    zx0c.ZB(paramZt8i);
  }
  
  public static Zrze Zb(Zjq paramZjq) {
    return (paramZjq == null) ? Zrze.ZL() : new Zrze(paramZjq.ZH() ? Zsze.SUCCESSFUL : Zsze.FAILED, Zz(paramZjq.ZS(Zje.class)), Zz(paramZjq.ZS(Ztr.class)), Zz(paramZjq.ZS(Zee.class)));
  }
  
  private static Duration Zz(Zdw paramZdw) {
    return (paramZdw != null) ? paramZdw.ZQL() : Duration.ZERO;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzo7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */