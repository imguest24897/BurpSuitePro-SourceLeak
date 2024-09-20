package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zgi2 implements Zmdl {
  final Map<Zro0, Map<Zlp9, List<Zmaj>>> Zi = new HashMap<>();
  
  private static String[] ZX;
  
  public Iterator<Map.Entry<Zro0, List<Zmaj>>> iterator() {
    return ZS();
  }
  
  public void Zr(Zmaj paramZmaj) {
    Zro0 zro0 = paramZmaj.Zy.Zk();
    Map<Zlp9, List> map = (Map)this.Zi.computeIfAbsent(zro0, Zgi2::lambda$add$0);
    String[] arrayOfString = ZD();
    Zlp9 zlp9 = paramZmaj.Zy.ZN();
    List<Zmaj> list = (List)map.get(zlp9);
    if (list == null) {
      list = new ArrayList();
      map.put(zlp9, list);
      list.add(paramZmaj);
      return;
    } 
    for (Zmaj zmaj : map.get(zlp9)) {
      if (zmaj.ZO.ZA() == paramZmaj.ZO.ZA() || !zmaj.ZO.Zx().equals(paramZmaj.ZO.Zx()))
        return; 
      if (arrayOfString != null)
        break; 
    } 
    list.add(paramZmaj);
    if (Zbqc.Zwu() == null)
      ZX(new String[3]); 
  }
  
  private Iterator<Map.Entry<Zro0, List<Zmaj>>> ZS() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Map.Entry> iterator = this.Zi.entrySet().iterator();
    String[] arrayOfString = ZD();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      List list = null;
      for (Map.Entry entry1 : ((Map)entry.getValue()).entrySet()) {
        if (list == null || ((List)entry1.getValue()).size() > list.size())
          list = (List)entry1.getValue(); 
        if (arrayOfString != null)
          break; 
      } 
      hashMap.put(entry.getKey(), list);
      if (arrayOfString != null)
        break; 
    } 
    return hashMap.entrySet().iterator();
  }
  
  private static Map lambda$add$0(Zro0 paramZro0) {
    return new HashMap<>();
  }
  
  public static void ZX(String[] paramArrayOfString) {
    ZX = paramArrayOfString;
  }
  
  public static String[] ZD() {
    return ZX;
  }
  
  static {
    if (ZD() != null)
      ZX(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgi2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */