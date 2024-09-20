package javafx.util;

@FunctionalInterface
public interface BuilderFactory {
  Builder<?> getBuilder(Class<?> paramClass);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\BuilderFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */