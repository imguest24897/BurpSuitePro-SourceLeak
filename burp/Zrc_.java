package burp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zrc_ {
  private final Map<Zewm, Set<Zbop>> ZE = new HashMap<>();
  
  private final Zedm ZQ;
  
  private static int[] ZN;
  
  public Zrc_(Zedm paramZedm) {
    this.ZQ = paramZedm;
  }
  
  public Zrc_ Zd(Ze4y paramZe4y) {
    Zu(paramZe4y);
    Zd5 zd5 = new Zd5(paramZe4y, this.ZQ, this);
    int[] arrayOfInt = Zm();
    while (true) {
      boolean bool = false;
      for (Map.Entry<Zewm, Set<Zbop>> entry : this.ZE.entrySet()) {
        Zxdl zxdl = zd5.ZH((Zewm)entry.getKey());
        Set<Zbop> set1 = zxdl.Zc();
        Set<Zbop> set2 = (Set)entry.getValue();
        int i = set2.size();
        set2.addAll(set1);
        if (set2.size() > i)
          bool = true; 
        if (arrayOfInt != null) {
          Zbqc.Zr(new Zbqc[4]);
          break;
        } 
      } 
      if (!bool)
        return this; 
    } 
  }
  
  public Set<Zbop> ZI(Zewm paramZewm) {
    return this.ZE.get(paramZewm);
  }
  
  private void Zu(Ze4y paramZe4y) {
    int[] arrayOfInt = Zm();
    for (Zr9_ zr9_ : paramZe4y.Z_()) {
      this.ZE.put(new Zewm(new Ztx4[] { zr9_ }, ), new HashSet<>());
      if (arrayOfInt != null)
        break; 
    } 
    for (Zbop zbop : paramZe4y.Zp()) {
      this.ZE.put(new Zewm(new Ztx4[] { zbop }, ), new HashSet<>());
      if (arrayOfInt != null)
        break; 
    } 
    for (Zl30 zl30 : paramZe4y.Zw()) {
      List<Ztx4> list = zl30.ZT();
      if (!list.isEmpty()) {
        List<Zewm> list1 = (new Zewm(list)).Zp();
        for (Zewm zewm : list1) {
          this.ZE.put(zewm, new HashSet<>());
          if (arrayOfInt != null)
            break; 
        } 
      } 
      if (arrayOfInt != null)
        break; 
    } 
    this.ZE.put(new Zewm(new Ztx4[0]), new HashSet<>());
  }
  
  public static void ZY(int[] paramArrayOfint) {
    ZN = paramArrayOfint;
  }
  
  public static int[] Zm() {
    return ZN;
  }
  
  static {
    if (Zm() != null)
      ZY(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrc_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */