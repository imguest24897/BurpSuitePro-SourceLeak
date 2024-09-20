package com.fasterxml.Zm;

import java.util.function.BiConsumer;

public interface Zet<K, V> {
  default void Z_(BiConsumer<K, V> paramBiConsumer) {
    throw new UnsupportedOperationException();
  }
  
  int Zm();
  
  V ZM(Object paramObject);
  
  V Zm(K paramK, V paramV);
  
  V ZC(K paramK, V paramV);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */