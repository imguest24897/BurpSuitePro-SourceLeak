package burp;

import java.util.HashMap;
import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrf1 implements Zzb4 {
  public static final Zzb4 Za = new Zrf1();
  
  private final Map<Zvs, Zree> ZY = new HashMap<>();
  
  private Zrf1() {
    for (Zzu2 zzu2 : Zzu2.values()) {
      Zree zree = Zes6.ZR(zzu2);
      this.ZY.put(zzu2, zree);
    } 
  }
  
  public Zree ZK(Zrdb paramZrdb) {
    if (paramZrdb instanceof Zree)
      return (Zree)paramZrdb; 
    Zvs zvs = paramZrdb.Za6();
    if (zvs.ZH())
      return new Zew8(paramZrdb); 
    Zree zree = this.ZY.get(zvs);
    if (zree == null) {
      Zuh.Zb(false, Zqf.Zx);
      return new Zlfe(paramZrdb);
    } 
    return zree;
  }
  
  public Zree ZR(Zvs paramZvs) {
    return this.ZY.getOrDefault(paramZvs, Zree.Zx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrf1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */