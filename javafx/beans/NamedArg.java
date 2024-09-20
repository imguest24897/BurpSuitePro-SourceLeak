package javafx.beans;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface NamedArg {
  String value();
  
  String defaultValue() default "";
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\NamedArg.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */