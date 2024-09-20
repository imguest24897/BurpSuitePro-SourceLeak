package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zgpf implements Zrwi {
  private final Zz49 ZM;
  
  private final Zee7 ZR;
  
  private final Zmwt Zp;
  
  private final Zxwi Zs;
  
  Zgpf(Zz49 paramZz49, Zee7 paramZee7, Zmwt paramZmwt, Zxwi paramZxwi) {
    this.ZM = paramZz49;
    this.ZR = paramZee7;
    this.Zp = paramZmwt;
    this.Zs = paramZxwi;
  }
  
  public boolean ZS() {
    return (this.ZR.Zx() <= 0.4D);
  }
  
  public long Zt() {
    long l = 0L;
    Iterator<Zs7t> iterator = ZE().iterator();
    int[] arrayOfInt = Zee7.Zb();
    while (iterator.hasNext()) {
      Zs7t zs7t = iterator.next();
      if (ZF())
        this.Zp.ZX(zs7t.Zr); 
      this.ZM.Zs(zs7t.Zr);
      l = (long)(l + zs7t.ZR);
      if ((this.ZR.Zx() >= 0.7D && arrayOfInt == null) || arrayOfInt != null)
        break; 
    } 
    return l;
  }
  
  private List<Zs7t> ZE() {
    ArrayList<Zs7t> arrayList = new ArrayList();
    Iterator<String> iterator = this.ZM.Zl().ZO().iterator();
    int[] arrayOfInt = Zee7.Zb();
    while (iterator.hasNext()) {
      long l;
      String str = iterator.next();
      Set<Zer0> set = this.ZM.Zl().Zd(str);
      this.ZM.ZL();
      try {
        l = set.stream().mapToLong(Zer0::Zf).sum();
      } finally {
        this.ZM.Zg();
      } 
      if (l >= 52428800L && !this.Zs.Zf(str))
        arrayList.add(new Zs7t(str, l)); 
      if (arrayOfInt != null)
        break; 
    } 
    Collections.sort(arrayList);
    return arrayList;
  }
  
  private boolean ZF() {
    return (this.ZR.Zx() <= 0.3D);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgpf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */