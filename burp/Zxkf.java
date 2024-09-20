package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Zxkf {
  public final Zmxt Zy;
  
  public final Map<String, Zt8g> ZE = new HashMap<>();
  
  public int ZF;
  
  private final List<Zg6u> ZX = new ArrayList<>();
  
  public final TreeSet<String> Zi;
  
  private static String ZJ;
  
  public Zxkf(Zmxt paramZmxt) {
    String str = Zt();
    this.Zi = new TreeSet<>();
    this.Zy = paramZmxt;
    if (str != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zg6u Zl() {
    return this.ZX.get(0);
  }
  
  public Zg6u ZN(String paramString, Zbnt paramZbnt) {
    String str = Zt();
    for (Zg6u zg6u : this.ZX) {
      Zstu zstu = zg6u.Zos();
      if (zstu == null)
        continue; 
      Zmzk zmzk = zg6u.Zod();
      Zz1p zz1p = Zghc.ZY(zmzk, zstu, (byte)2, paramZbnt);
      for (Zt8g zt8g : zz1p.ZV) {
        if (zt8g.Zns().equals(paramString))
          return zg6u; 
        if (str != null)
          break; 
      } 
      if (str != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zv("Py5tyc"); 
    return this.ZX.get(0);
  }
  
  public void Zh(Zg6u paramZg6u) {
    this.ZX.add(paramZg6u);
  }
  
  public static void Zv(String paramString) {
    ZJ = paramString;
  }
  
  public static String Zt() {
    return ZJ;
  }
  
  static {
    if (Zt() != null)
      Zv("Tf0Qxb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxkf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */