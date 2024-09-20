package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zeo6 implements Zmdl {
  private final Map<Zro0, Map<Zs1p, List<Zmaj>>> ZE = new HashMap<>();
  
  private final List<Zlp9> ZO;
  
  public Zeo6(List<Zlp9> paramList) {
    this.ZO = paramList;
  }
  
  public Iterator<Map.Entry<Zro0, List<Zmaj>>> iterator() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Zmz3 zmz3 = new Zmz3(this);
    Iterator<Map.Entry> iterator = this.ZE.entrySet().iterator();
    String[] arrayOfString = Zgi2.ZD();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      ArrayList<List> arrayList = new ArrayList();
      Map map = (Map)entry.getValue();
      for (List list : map.values()) {
        arrayList.add(list);
        if (arrayOfString != null)
          break; 
      } 
      Collections.sort(arrayList, zmz3);
      hashMap.put(entry.getKey(), arrayList.get(0));
      if (arrayOfString != null)
        break; 
    } 
    return hashMap.entrySet().iterator();
  }
  
  public void Zr(Zmaj paramZmaj) {
    Zro0 zro0 = paramZmaj.Zy.Zk();
    Zs1p zs1p = new Zs1p(paramZmaj.Zy.ZN().Zz());
    String[] arrayOfString = Zgi2.ZD();
    Map<Object, Object> map = (Map)this.ZE.get(zro0);
    if (map == null) {
      map = new HashMap<>();
      ArrayList<Zmaj> arrayList = new ArrayList();
      map.put(zs1p, arrayList);
      arrayList.add(paramZmaj);
      this.ZE.put(zro0, map);
      return;
    } 
    if (map.get(zs1p) == null) {
      ArrayList<Zmaj> arrayList = new ArrayList();
      map.put(zs1p, arrayList);
      arrayList.add(paramZmaj);
      return;
    } 
    byte b = 0;
    while (b < ((List)map.get(zs1p)).size()) {
      Zmaj zmaj = ((List<Zmaj>)map.get(zs1p)).get(b);
      if (zmaj.ZO.ZA() == paramZmaj.ZO.ZA())
        return; 
      b++;
      if (arrayOfString != null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    ((List<Zmaj>)map.get(zs1p)).add(paramZmaj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeo6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */