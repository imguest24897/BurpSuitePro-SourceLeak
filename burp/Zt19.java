package burp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Zt19 implements Zmgu {
  private final Zli8 ZR;
  
  private final Zmv7 ZJ;
  
  private static String[] ZG;
  
  public Zt19(Zli8 paramZli8, Zmv7 paramZmv7) {
    this.ZR = paramZli8;
    this.ZJ = paramZmv7;
  }
  
  public Zg8y ZA(Zzl1 paramZzl1, Zl_ paramZl_) throws Zmng, Zmnr {
    String[] arrayOfString = ZW();
    try {
      if (paramZzl1 != null)
        try {
          if (!paramZzl1.Z_O().Zh()) {
            List<Zg8y> list = this.ZR.Zh(paramZzl1.Z_i(), paramZzl1.Z_3());
            Ze0_ ze0_ = Ze0_.ZW(list);
            Zm6i zm6i = Zmlk.Zv(ze0_, paramZl_.Znq().ZHN(), paramZl_.Zf2().ZaG());
            Zg8y zg8y = ze0_.ZA(zm6i);
            try {
              if (zg8y == null) {
                this.ZJ.Zy(Zrp6.DEBUG, Zlq7.DOORWAY_NOT_FOUND, new Object[] { paramZl_.Znq().ZHk().<String>map(Zski::ZyJ).orElse(""), paramZl_.Zfy().ZmR(), paramZzl1.Z_Q(), StreamSupport.<Zm6i>stream(ze0_.spliterator(), false).map(Zm6i::ZmR).collect(Collectors.joining(",")) });
                throw new Zmng(paramZl_);
              } 
            } catch (Zmng zmng) {
              throw a(null);
            } 
            try {
              if (arrayOfString == null)
                Zbqc.Zr(new Zbqc[4]); 
            } catch (Zmng zmng) {
              throw a(null);
            } 
            return zg8y;
          } 
          throw new Zmnr(paramZl_);
        } catch (Zmng zmng) {
          throw a(null);
        }  
    } catch (Zmng zmng) {
      throw a(null);
    } 
    throw new Zmnr(paramZl_);
  }
  
  public static void ZM(String[] paramArrayOfString) {
    ZG = paramArrayOfString;
  }
  
  public static String[] ZW() {
    return ZG;
  }
  
  private static Zmng a(Zmng paramZmng) {
    return paramZmng;
  }
  
  static {
    if (ZW() == null)
      ZM(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt19.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */