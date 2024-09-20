package javafx.collections;

import javafx.beans.Observable;

public interface ObservableArray<T extends ObservableArray<T>> extends Observable {
  void addListener(ArrayChangeListener<T> paramArrayChangeListener);
  
  void removeListener(ArrayChangeListener<T> paramArrayChangeListener);
  
  void resize(int paramInt);
  
  void ensureCapacity(int paramInt);
  
  void trimToSize();
  
  void clear();
  
  int size();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ObservableArray.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */