package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Zz4s<T> extends ArrayList<T> {
  public Zz4s(int paramInt) {
    super(paramInt);
  }
  
  public boolean addAll(Collection<? extends T> paramCollection) {
    return (paramCollection == null || paramCollection.isEmpty()) ? false : super.addAll(paramCollection);
  }
  
  public boolean addAll(int paramInt, Collection<? extends T> paramCollection) {
    return (paramCollection == null || paramCollection.isEmpty()) ? false : super.addAll(paramInt, paramCollection);
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    return (paramCollection == null || paramCollection.isEmpty()) ? false : ZY(paramCollection, false);
  }
  
  public boolean retainAll(Collection<?> paramCollection) {
    if (paramCollection == null || paramCollection.isEmpty()) {
      clear();
      return true;
    } 
    return ZY(paramCollection, true);
  }
  
  private boolean ZY(Collection<?> paramCollection, boolean paramBoolean) {
    byte b = 0;
    int i = Zkk.ZZ();
    int j = 0;
    int k = size();
    boolean bool = false;
    HashSet hashSet = new HashSet(paramCollection);
    try {
      while (b < k) {
        T t = get(b);
        if (hashSet.contains(t) == paramBoolean)
          set(j++, t); 
        b++;
        if (i != 0)
          break; 
      } 
    } finally {
      if (b != k) {
        removeRange(j, b);
        j += k - b;
      } 
      if (j != k) {
        removeRange(j, k);
        bool = true;
      } 
    } 
    return bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz4s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */