package net.portswigger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface Zc5 {
  String Ze();
  
  String ZS() default "";
  
  String ZH() default "";
  
  boolean ZT() default false;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zc5.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */