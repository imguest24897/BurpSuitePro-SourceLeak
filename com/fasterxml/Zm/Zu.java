package com.fasterxml.Zm;

import com.fasterxml.Zy.Zi;
import com.fasterxml.Zy.Zr;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class Zu<K, V> implements Zet<K, V>, Serializable {
  private static final long serialVersionUID = 2L;
  
  protected final int Zi;
  
  protected final int ZL;
  
  protected final transient Zr<K, V> ZG;
  
  public Zu(int paramInt1, int paramInt2) {
    this.Zi = paramInt1;
    this.ZL = paramInt2;
    this.ZG = (new Zi()).ZX(paramInt1).Zn(paramInt2).Zl(4).ZM();
  }
  
  public V Zm(K paramK, V paramV) {
    return (V)this.ZG.put(paramK, paramV);
  }
  
  public V ZC(K paramK, V paramV) {
    return (V)this.ZG.putIfAbsent(paramK, paramV);
  }
  
  public V ZM(Object paramObject) {
    return (V)this.ZG.get(paramObject);
  }
  
  public int Zm() {
    return this.ZG.size();
  }
  
  public void Z_(BiConsumer<K, V> paramBiConsumer) {
    Iterator<Map.Entry> iterator = this.ZG.entrySet().iterator();
    int i = Zx.ZY();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      paramBiConsumer.accept((K)entry.getKey(), (V)entry.getValue());
      if (i != 0)
        break; 
    } 
  }
  
  protected Object readResolve() {
    return new Zu(this.Zi, this.ZL);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */