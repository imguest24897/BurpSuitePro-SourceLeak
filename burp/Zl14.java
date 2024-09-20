package burp;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class Zl14<K, V> {
  private final Map<K, Zmwe<K, V>> Za = new HashMap<>();
  
  private final ReferenceQueue<V> Zz = new ReferenceQueue<>();
  
  public void ZS(K paramK, V paramV) {
    ZY();
    this.Za.put(paramK, new Zmwe<>(paramK, paramV, this.Zz));
  }
  
  public V Zo(K paramK) {
    ZY();
    WeakReference<V> weakReference = this.Za.get(paramK);
    return (weakReference == null) ? null : weakReference.get();
  }
  
  private void ZY() {
    int[] arrayOfInt = Zsw8.ZK();
    Zmwe zmwe;
    while ((zmwe = (Zmwe)this.Zz.poll()) != null) {
      this.Za.remove(zmwe.ZU());
      if (arrayOfInt == null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl14.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */