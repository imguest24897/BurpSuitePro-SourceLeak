package burp;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbnt {
  private final Zefg<Zmzk> Z_;
  
  private final Zr_4 ZO;
  
  private final Map<Zscw, Zmzk> Zp;
  
  private static String ZI;
  
  public Zbnt(Zr_4 paramZr_4) {
    this(Zkk.ZV(paramZr_4, Zmzk.Zj), paramZr_4);
  }
  
  public Zbnt(Zefg<Zmzk> paramZefg, Zr_4 paramZr_4) {
    Zuh.Zv((paramZefg != null), Zqf.Zx, 1L);
    Zuh.Zv((paramZr_4 != null), Zqf.Zx, 2L);
    this.Z_ = paramZefg;
    this.ZO = paramZr_4;
    this.Zp = ZS(paramZefg);
  }
  
  public Zmzk ZY(String paramString, int paramInt, boolean paramBoolean) throws Zxgy, Zxg5 {
    paramString = paramString.toLowerCase(Locale.ENGLISH);
    synchronized (this.Z_.Zz6()) {
      Zmzk zmzk = this.Zp.get(new Zscw(paramString, paramInt, paramBoolean));
      if (zmzk == null) {
        zmzk = ZC(paramString, paramInt, paramBoolean);
        ZH(zmzk);
      } 
      return zmzk;
    } 
  }
  
  private Zmzk ZC(String paramString, int paramInt, boolean paramBoolean) throws Zxgy, Zxg5 {
    try {
      if (0 == Zko5.Zi(paramString))
        try {
          if (!Zgxs.Zc(paramString))
            throw new Zxgy(paramString); 
        } catch (Zxgy zxgy) {
          throw a(null);
        }  
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    try {
      if (!Zgxs.ZO(paramInt))
        throw new Zxg5(Integer.toString(paramInt)); 
    } catch (Zxgy zxgy) {
      throw a(null);
    } 
    Zmhr zmhr = new Zmhr(paramString, paramInt, paramBoolean);
    return this.ZO.<Zmzk>ZH(zmhr);
  }
  
  private void ZH(Zmzk paramZmzk) {
    this.Z_.add(paramZmzk);
    this.Zp.put(new Zscw(paramZmzk), paramZmzk);
  }
  
  private static Map<Zscw, Zmzk> ZS(Iterable<Zmzk> paramIterable) {
    ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
    if (paramIterable != null)
      for (Zmzk zmzk : paramIterable)
        concurrentHashMap.put(new Zscw(zmzk), zmzk);  
    return (Map)concurrentHashMap;
  }
  
  public static void ZP(String paramString) {
    ZI = paramString;
  }
  
  public static String ZW() {
    return ZI;
  }
  
  private static Zxgy a(Zxgy paramZxgy) {
    return paramZxgy;
  }
  
  static {
    if (ZW() != null)
      ZP("ZAzRL"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbnt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */