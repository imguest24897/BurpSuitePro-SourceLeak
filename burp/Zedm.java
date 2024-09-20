package burp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zedm {
  private final Map<Zewm, Boolean> Za = new HashMap<>();
  
  private static String[] ZA;
  
  public Zedm ZU(Ze4y paramZe4y) {
    Zr(paramZe4y);
    Zm74 zm74 = new Zm74(paramZe4y, this);
    String[] arrayOfString = Zq();
    while (true) {
      boolean bool = false;
      for (Map.Entry<Zewm, Boolean> entry : this.Za.entrySet()) {
        Zz6i zz6i = zm74.ZJ((Zewm)entry.getKey());
        if (zz6i.Zl() && !((Boolean)entry.getValue()).booleanValue()) {
          this.Za.put((Zewm)entry.getKey(), Boolean.valueOf(true));
          bool = true;
        } 
        if (arrayOfString != null) {
          Zbqc.Zr(new Zbqc[3]);
          break;
        } 
      } 
      if (!bool)
        return this; 
    } 
  }
  
  public boolean Zc(Zewm paramZewm) {
    return ((Boolean)this.Za.get(paramZewm)).booleanValue();
  }
  
  private void Zr(Ze4y paramZe4y) {
    String[] arrayOfString = Zq();
    for (Zr9_ zr9_ : paramZe4y.Z_()) {
      this.Za.put(new Zewm(new Ztx4[] { zr9_ }, ), Boolean.valueOf(false));
      if (arrayOfString != null)
        break; 
    } 
    for (Zbop zbop : paramZe4y.Zp()) {
      this.Za.put(new Zewm(new Ztx4[] { zbop }, ), Boolean.valueOf(false));
      if (arrayOfString != null)
        break; 
    } 
    for (Zl30 zl30 : paramZe4y.Zw()) {
      List<Ztx4> list = zl30.ZT();
      if (!list.isEmpty()) {
        List<Zewm> list1 = (new Zewm(list)).Zp();
        for (Zewm zewm : list1) {
          this.Za.put(zewm, Boolean.valueOf(false));
          if (arrayOfString != null)
            break; 
        } 
      } 
      if (arrayOfString != null)
        break; 
    } 
    this.Za.put(new Zewm(new Ztx4[0]), Boolean.valueOf(false));
  }
  
  public static void ZZ(String[] paramArrayOfString) {
    ZA = paramArrayOfString;
  }
  
  public static String[] Zq() {
    return ZA;
  }
  
  static {
    if (Zq() != null)
      ZZ(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */