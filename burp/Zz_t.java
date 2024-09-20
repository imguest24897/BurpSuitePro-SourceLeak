package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zz_t implements Zrwi {
  private final Zz49 ZX;
  
  private final Zee7 Zg;
  
  private final Zmwt ZT;
  
  public Zz_t(Zz49 paramZz49, Zee7 paramZee7, Zmwt paramZmwt) {
    this.ZX = paramZz49;
    this.Zg = paramZee7;
    this.ZT = paramZmwt;
  }
  
  public boolean ZS() {
    return (this.Zg.Zx() <= 0.5D);
  }
  
  public long Zt() {
    long l = 0L;
    Iterator<Zs7t> iterator = ZN().iterator();
    int[] arrayOfInt = Zee7.Zb();
    while (iterator.hasNext()) {
      Zs7t zs7t = iterator.next();
      if (Zw())
        this.ZT.ZE(zs7t.Zr); 
      this.ZX.Zx(zs7t.Zr);
      l = (long)(l + zs7t.ZR);
      if ((this.Zg.Zx() >= 0.75D && arrayOfInt == null) || arrayOfInt != null)
        break; 
    } 
    return l;
  }
  
  private List<Zs7t> ZN() {
    ArrayList<Zs7t> arrayList = new ArrayList();
    HashSet hashSet = new HashSet(this.ZX.ZZ().keySet());
    int[] arrayOfInt = Zee7.Zb();
    for (String str : hashSet) {
      long l = 0L;
      Set set = this.ZX.ZZ().get(str);
      this.ZX.ZL();
      try {
        for (Zer0 zer0 : set) {
          l += zer0.Zf();
          if (arrayOfInt != null)
            break; 
        } 
      } finally {
        this.ZX.Zg();
      } 
      if (l >= 52428800L)
        arrayList.add(new Zs7t(str, l)); 
      if (arrayOfInt != null)
        break; 
    } 
    Collections.sort(arrayList);
    return arrayList;
  }
  
  private boolean Zw() {
    return (this.Zg.Zx() <= 0.25D);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */