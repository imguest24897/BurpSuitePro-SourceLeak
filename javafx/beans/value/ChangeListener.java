package javafx.beans.value;

@FunctionalInterface
public interface ChangeListener<T> {
  void changed(ObservableValue<? extends T> paramObservableValue, T paramT1, T paramT2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\value\ChangeListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */