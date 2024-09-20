package javafx.collections;

import java.util.Map;
import javafx.beans.Observable;

public interface ObservableMap<K, V> extends Map<K, V>, Observable {
  void addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener);
  
  void removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ObservableMap.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */