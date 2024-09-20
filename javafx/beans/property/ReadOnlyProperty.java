package javafx.beans.property;

import javafx.beans.value.ObservableValue;

public interface ReadOnlyProperty<T> extends ObservableValue<T> {
  Object getBean();
  
  String getName();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */