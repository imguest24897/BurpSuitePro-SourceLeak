package javafx.beans.property.adapter;

import javafx.beans.property.ReadOnlyProperty;

public interface ReadOnlyJavaBeanProperty<T> extends ReadOnlyProperty<T> {
  void fireValueChangedEvent();
  
  void dispose();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\ReadOnlyJavaBeanProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */