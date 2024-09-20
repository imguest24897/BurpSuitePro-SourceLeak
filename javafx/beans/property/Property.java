package javafx.beans.property;

import javafx.beans.value.ObservableValue;
import javafx.beans.value.WritableValue;

public interface Property<T> extends ReadOnlyProperty<T>, WritableValue<T> {
  void bind(ObservableValue<? extends T> paramObservableValue);
  
  void unbind();
  
  boolean isBound();
  
  void bindBidirectional(Property<T> paramProperty);
  
  void unbindBidirectional(Property<T> paramProperty);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\Property.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */