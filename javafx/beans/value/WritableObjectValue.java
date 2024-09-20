package javafx.beans.value;

public interface WritableObjectValue<T> extends WritableValue<T> {
  T get();
  
  void set(T paramT);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\value\WritableObjectValue.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */