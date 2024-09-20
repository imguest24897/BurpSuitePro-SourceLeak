package burp;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Zrr1 implements Zrwi {
  private final Zz49 Zl;
  
  private final Zee7 ZW;
  
  Zrr1(Zz49 paramZz49, Zee7 paramZee7) {
    this.ZW = paramZee7;
    this.Zl = paramZz49;
  }
  
  public boolean ZS() {
    return (this.ZW.Zx() <= 0.5D);
  }
  
  public long Zt() {
    long l = 0L;
    TreeSet treeSet = new TreeSet(this.Zl.ZD().keySet());
    int[] arrayOfInt = Zee7.Zb();
    for (Integer integer : treeSet.descendingSet()) {
      this.Zl.ZL();
      try {
        Iterator<Zer0> iterator = ((Set)this.Zl.ZD().get(integer)).iterator();
        while (iterator.hasNext()) {
          Zer0 zer0 = iterator.next();
          l += zer0.Zf();
          iterator.remove();
          this.Zl.ZR(zer0);
          if (arrayOfInt != null)
            break; 
        } 
      } finally {
        this.Zl.Zg();
      } 
      if ((this.ZW.Zx() >= 0.75D && arrayOfInt == null) || arrayOfInt != null)
        break; 
    } 
    return l;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrr1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */