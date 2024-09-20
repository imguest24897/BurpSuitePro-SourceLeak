package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zlk0 {
  private final Map<Zz3o, List<Zeib>> Zr;
  
  private Zlk0(Zeib... paramVarArgs) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Zeib[] arrayOfZeib = paramVarArgs;
    int i = Zm9j.Zm();
    int j = arrayOfZeib.length;
    byte b = 0;
    while (b < j) {
      Zeib zeib = arrayOfZeib[b];
      List<Zeib> list = (List)linkedHashMap.computeIfAbsent(zeib.ZjR(), Zlk0::lambda$new$0);
      list.add(zeib);
      b++;
      if (i == 0)
        break; 
    } 
    this.Zr = (Map)linkedHashMap;
  }
  
  private Zlk0(Map<Zz3o, List<Zeib>> paramMap) {
    this.Zr = paramMap;
  }
  
  Zlk0 ZE() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>(this.Zr.size());
    Iterator<Map.Entry> iterator = this.Zr.entrySet().iterator();
    int i = Zm9j.Zm();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      if (entry.getKey() == Zz3o.SPECULATIVE)
        continue; 
      ArrayList<Zeib> arrayList = new ArrayList(((List)entry.getValue()).size());
      for (Zeib zeib : entry.getValue()) {
        arrayList.add(zeib.Zjd());
        if (i == 0)
          break; 
      } 
      linkedHashMap.put(entry.getKey(), arrayList);
      if (i == 0)
        break; 
    } 
    return new Zlk0((Map)linkedHashMap);
  }
  
  public List<Zeib> Zi(Zz3o paramZz3o) {
    List<? extends Zeib> list = this.Zr.get(paramZz3o);
    return (list == null) ? Collections.<Zeib>emptyList() : Collections.<Zeib>unmodifiableList(list);
  }
  
  int Zt() {
    int j = 0;
    Iterator<Map.Entry> iterator = this.Zr.entrySet().iterator();
    int i = Zm9j.Zm();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      if (entry.getKey() != Zz3o.SPECULATIVE)
        j += ((List)entry.getValue()).size(); 
      if (i == 0)
        break; 
    } 
    return j;
  }
  
  List<Zeib> ZL(Zrho paramZrho) {
    int i = Zm9j.Zm();
    List list = this.Zr.get(paramZrho.ZAl().ZjR());
    if (list == null)
      return Collections.emptyList(); 
    ArrayList<Zeib> arrayList = new ArrayList();
    Iterator<Zeib> iterator = list.iterator();
    while (iterator.hasNext()) {
      Zeib zeib = iterator.next();
      if (zeib.Zt(paramZrho.ZAX()) && paramZrho.Ze(zeib)) {
        iterator.remove();
        arrayList.add(zeib);
      } 
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  boolean ZG(Zrho paramZrho) {
    int i = Zm9j.Zm();
    List list = this.Zr.get(paramZrho.ZAl().ZjR());
    if (list == null)
      return false; 
    for (Zeib zeib : list) {
      if (zeib.Zt(paramZrho.ZAX()) && paramZrho.Ze(zeib))
        return true; 
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  boolean ZF(Zv0 paramZv0) {
    int i = Zm9j.ZU();
    for (Map.Entry<Zz3o, List<Zeib>> entry : this.Zr.entrySet()) {
      if (paramZv0.Z_((Zz3o)entry.getKey()) < ((List)entry.getValue()).size())
        return true; 
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  public List<Zrho> Zg() {
    return (List<Zrho>)Arrays.<Zz3o>stream(Zz3o.values()).flatMap(this::lambda$asSignpostMatcherList$1).collect(Collectors.toList());
  }
  
  public static Zlk0 Zn(List<Zeib> paramList) {
    return new Zlk0(paramList.<Zeib>toArray(new Zeib[0]));
  }
  
  public static Zlk0 ZK(Iterable<Zm6i> paramIterable) {
    LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<>();
    LinkedHashMap<Object, Object> linkedHashMap2 = new LinkedHashMap<>();
    byte b = 0;
    null = paramIterable.iterator();
    int i = Zm9j.Zm();
    while (null.hasNext()) {
      Zm6i zm6i = null.next();
      List<Zra3> list = (List)linkedHashMap2.computeIfAbsent(zm6i.Zm2(), Zlk0::lambda$new$0);
      list.add(new Zra3(zm6i, b++));
      if (i == 0) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    for (Map.Entry<Object, Object> entry : linkedHashMap2.entrySet()) {
      Zz3o zz3o = (Zz3o)entry.getKey();
      List<Zra3> list = (List)entry.getValue();
      List<Zeib> list1 = ZU(list);
      linkedHashMap1.put(zz3o, list1);
      if (i == 0)
        break; 
    } 
    return new Zlk0((Map)linkedHashMap1);
  }
  
  private static List<Zeib> ZU(List<Zra3> paramList) {
    LinkedList<Zeib> linkedList = new LinkedList();
    byte b = 0;
    int i = Zm9j.ZU();
    int j = paramList.size() - 1;
    while (b <= j) {
      Zra3 zra3 = paramList.get(b);
      linkedList.add(zra3.Zz().Zt(b, j - b, zra3.ZO()));
      b++;
      if (i != 0)
        break; 
    } 
    return linkedList;
  }
  
  private Stream lambda$asSignpostMatcherList$1(Zz3o paramZz3o) {
    Ztfy ztfy = Ztfy.ZQ(paramZz3o).get(0);
    Objects.requireNonNull(ztfy.signpostMatcherFactory);
    return Zi(paramZz3o).stream().map(ztfy.signpostMatcherFactory::Zv).distinct().sorted();
  }
  
  private static List lambda$new$0(Zz3o paramZz3o) {
    return new ArrayList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlk0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */