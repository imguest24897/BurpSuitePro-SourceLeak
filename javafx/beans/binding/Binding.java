package javafx.beans.binding;

import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;

public interface Binding<T> extends ObservableValue<T> {
  boolean isValid();
  
  void invalidate();
  
  ObservableList<?> getDependencies();
  
  void dispose();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\Binding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */