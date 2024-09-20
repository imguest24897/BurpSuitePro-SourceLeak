package burp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zb34 {
  private Zes3 ZG;
  
  public Zb34(Zes3 paramZes3) {
    this.ZG = paramZes3;
  }
  
  public void Zp(Zrn9 paramZrn9) {
    Set<Zb3t> set = ZV(paramZrn9);
    Zl3x zl3x = new Zl3x(this.ZG.Zq());
    Iterator<Zb3t> iterator = zl3x.iterator();
    Zbqc[] arrayOfZbqc = Zeqy.ZR();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      Zg(zb3t, set);
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
  }
  
  private void Zg(Zb3t paramZb3t, Set<Zb3t> paramSet) {
    ArrayList<Zb3t> arrayList = new ArrayList();
    Zkd0 zkd0 = new Zkd0(paramZb3t);
    Iterator<Zb3t> iterator = zkd0.iterator();
    Zbqc[] arrayOfZbqc = Zeqy.ZR();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      if (paramSet.contains(zb3t)) {
        ZZ(paramZb3t, zb3t);
        arrayList.add(zb3t);
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    if (arrayList.isEmpty())
      return; 
    Zj(paramZb3t, arrayList);
  }
  
  private void Zj(Zb3t paramZb3t, List<Zb3t> paramList) {
    Zbqc[] arrayOfZbqc = Zeqy.ZR();
    List list = paramZb3t.<List>ZO(Zxc6.FunctionCallers);
    if (list != null)
      for (Zb3t zb3t : list) {
        Zrqv zrqv = new Zrqv(zb3t);
        for (Zb3t zb3t1 : zrqv) {
          if (Zl19.Zb(zb3t1) || Zl19.ZG(zb3t1)) {
            boolean bool = false;
            for (Zb3t zb3t2 : paramList) {
              if (ZZ(zb3t1, zb3t2))
                bool = true; 
              if (arrayOfZbqc != null)
                break; 
            } 
            if (bool) {
              Zj(zb3t1, paramList);
              if (arrayOfZbqc != null)
                continue; 
            } 
            break;
          } 
          continue;
          if (arrayOfZbqc != null)
            break; 
        } 
        if (arrayOfZbqc != null)
          break; 
      }  
  }
  
  private boolean ZZ(Zb3t paramZb3t1, Zb3t paramZb3t2) {
    Set<Zb3t> set = paramZb3t1.<Set>ZO(Zxc6.ReachableNodes);
    if (set == null) {
      set = new HashSet(1);
      paramZb3t1.Zm(Zxc6.ReachableNodes, set);
    } 
    return set.add(paramZb3t2);
  }
  
  private Set<Zb3t> ZV(Zrn9 paramZrn9) {
    HashSet<Zb3t> hashSet = new HashSet();
    hashSet.addAll(paramZrn9.Zp());
    return hashSet;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb34.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */