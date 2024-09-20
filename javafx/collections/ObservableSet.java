package javafx.collections;

import java.util.Set;
import javafx.beans.Observable;

public interface ObservableSet<E> extends Set<E>, Observable {
  void addListener(SetChangeListener<? super E> paramSetChangeListener);
  
  void removeListener(SetChangeListener<? super E> paramSetChangeListener);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ObservableSet.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */