package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class Zb99 {
  private static Zbqc[] Zs;
  
  public static <T> Set<T> Zn(T... paramVarArgs) {
    return Zc(java.util.HashSet::new, paramVarArgs);
  }
  
  public static <T> Set<T> Zc(Supplier<Set<T>> paramSupplier, T... paramVarArgs) {
    Set<? super T> set = paramSupplier.get();
    Collections.addAll(set, paramVarArgs);
    return (Set)set;
  }
  
  public static <T> List<T> Zh(T... paramVarArgs) {
    ArrayList<? super T> arrayList = new ArrayList(paramVarArgs.length);
    Collections.addAll(arrayList, paramVarArgs);
    return (List)arrayList;
  }
  
  public static <T> Set<T> ZR(Set<T> paramSet) {
    Set<T> set;
    if (paramSet == null) {
      set = null;
    } else {
      set = Collections.unmodifiableSet(paramSet);
    } 
    return set;
  }
  
  public static <T> List<T> ZX(List<T> paramList) {
    List<T> list;
    if (paramList == null) {
      list = null;
    } else {
      list = Collections.unmodifiableList(paramList);
    } 
    return list;
  }
  
  public static <K, V> Map<K, V> Zn(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3) {
    HashMap<Object, Object> hashMap = new HashMap<>(3);
    hashMap.put(paramK1, paramV1);
    hashMap.put(paramK2, paramV2);
    Zbqc[] arrayOfZbqc = ZR();
    hashMap.put(paramK3, paramV3);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[5]); 
    return Collections.unmodifiableMap((Map)hashMap);
  }
  
  public static <K, V> Map<K, V> Zg(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3, K paramK4, V paramV4, K paramK5, V paramV5, K paramK6, V paramV6, K paramK7, V paramV7, K paramK8, V paramV8) {
    HashMap<Object, Object> hashMap = new HashMap<>(8);
    hashMap.put(paramK1, paramV1);
    hashMap.put(paramK2, paramV2);
    hashMap.put(paramK3, paramV3);
    hashMap.put(paramK4, paramV4);
    hashMap.put(paramK5, paramV5);
    hashMap.put(paramK6, paramV6);
    hashMap.put(paramK7, paramV7);
    hashMap.put(paramK8, paramV8);
    return Collections.unmodifiableMap((Map)hashMap);
  }
  
  public static void Zf(Zbqc[] paramArrayOfZbqc) {
    Zs = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZR() {
    return Zs;
  }
  
  static {
    if (ZR() != null)
      Zf(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb99.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */