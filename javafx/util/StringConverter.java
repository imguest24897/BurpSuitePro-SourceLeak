package javafx.util;

public abstract class StringConverter<T> {
  public abstract String toString(T paramT);
  
  public abstract T fromString(String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\StringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */