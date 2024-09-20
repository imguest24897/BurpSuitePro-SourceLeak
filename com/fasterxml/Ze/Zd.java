package com.fasterxml.Ze;

import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zs.Zf0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Zd {
  public static Zzp ZX(Zyc paramZyc, Class<?> paramClass) {
    if (paramClass == Zm5.class)
      return (Zzp)new Zf0(); 
    if (Collection.class.isAssignableFrom(paramClass)) {
      if (paramClass == ArrayList.class)
        return (Zzp)Zo9.ZE; 
      if (paramClass == HashSet.class)
        return (Zzp)Zo0.Zy; 
      if (paramClass == LinkedList.class)
        return (Zzp)new Zo7(); 
      if (paramClass == TreeSet.class)
        return (Zzp)new Zo_(); 
      if (paramClass == Collections.emptySet().getClass())
        return (Zzp)new Zon(Collections.emptySet()); 
      if (paramClass == Collections.emptyList().getClass())
        return (Zzp)new Zon(Collections.emptyList()); 
    } else if (Map.class.isAssignableFrom(paramClass)) {
      if (paramClass == LinkedHashMap.class)
        return (Zzp)Zo3.Zs; 
      if (paramClass == HashMap.class)
        return (Zzp)Zoy.Z_; 
      if (paramClass == ConcurrentHashMap.class)
        return (Zzp)new Zop(); 
      if (paramClass == TreeMap.class)
        return (Zzp)new Zov(); 
      if (paramClass == Collections.emptyMap().getClass())
        return (Zzp)new Zon(Collections.emptyMap()); 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */