package javafx.beans;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface DefaultProperty {
  String value();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\DefaultProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */