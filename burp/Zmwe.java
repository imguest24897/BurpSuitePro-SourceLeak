package burp;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class Zmwe<K, V> extends WeakReference<V> {
  private final K ZV;
  
  Zmwe(K paramK, V paramV, ReferenceQueue<? super V> paramReferenceQueue) {
    super(paramV, paramReferenceQueue);
    this.ZV = paramK;
  }
  
  K ZU() {
    return this.ZV;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmwe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */