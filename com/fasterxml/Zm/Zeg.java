package com.fasterxml.Zm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Zeg {
  public static boolean Zv(Object paramObject, Collection<String> paramCollection1, Collection<String> paramCollection2) {
    return (paramCollection1 == null && paramCollection2 == null) ? false : ((paramCollection2 == null) ? paramCollection1.contains(paramObject) : ((paramCollection1 == null) ? (!paramCollection2.contains(paramObject)) : ((!paramCollection2.contains(paramObject) || paramCollection1.contains(paramObject)))));
  }
  
  public static Zk Zr(Set<String> paramSet1, Set<String> paramSet2) {
    return (paramSet2 == null && (paramSet1 == null || paramSet1.isEmpty())) ? null : Zk.ZJ(paramSet1, paramSet2);
  }
  
  public static Set<String> ZN(Set<String> paramSet1, Set<String> paramSet2) {
    int i = Zx.Zo();
    if (paramSet1 == null)
      return paramSet2; 
    if (paramSet2 == null)
      return paramSet1; 
    HashSet<String> hashSet = new HashSet();
    for (String str : paramSet2) {
      if (paramSet1.contains(str))
        hashSet.add(str); 
      if (i == 0)
        break; 
    } 
    return hashSet;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zeg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */